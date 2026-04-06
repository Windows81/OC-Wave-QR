package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofillManager;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.autofill.PlatformAutofillManagerImpl;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.EmptySemanticsModifier;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, MatrixPositionCalculator, DefaultLifecycleObserver {
    public static final Companion j1 = new Companion((DefaultConstructorMarker) null);
    public static final int k1 = 8;
    public static Class l1;
    public static Method m1;

    /* renamed from: A  reason: collision with root package name */
    public boolean f17494A = true;
    public long A0;

    /* renamed from: B  reason: collision with root package name */
    public final LayoutNodeDrawScope f17495B;
    public boolean B0;
    public final MutableState C;
    public long C0;
    public final EmptySemanticsModifier D;
    public boolean D0;
    public final EmptySemanticsElement E;
    public final MutableState E0;
    public final AndroidComposeView$bringIntoViewNode$1 F;
    public final State F0;
    public final FocusOwner G;
    public Function1 G0;
    public CoroutineContext H;
    public final ViewTreeObserver.OnGlobalLayoutListener H0;
    public final AndroidDragAndDropManager I;
    public final ViewTreeObserver.OnScrollChangedListener I0;
    public final LazyWindowInfo J;
    public final ViewTreeObserver.OnTouchModeChangeListener J0;
    public boolean K;
    public final TextInputServiceAndroid K0;
    public final Modifier L;
    public final TextInputService L0;
    public final Modifier M;
    public final AtomicReference M0;
    public final CanvasHolder N;
    public final SoftwareKeyboardController N0;
    public final ViewConfiguration O;
    public final Font.ResourceLoader O0;
    public final LayoutNode P;
    public final MutableState P0;
    public final MutableIntObjectMap Q;
    public int Q0;
    public final RectManager R;
    public final MutableState R0;
    public final RootForTest S;
    public final HapticFeedback S0;
    public final SemanticsOwner T;
    public final InputModeManagerImpl T0;
    public final AndroidComposeViewAccessibilityDelegateCompat U;
    public final ModifierLocalManager U0;
    public AndroidContentCaptureManager V;
    public final TextToolbar V0;
    public final AndroidAccessibilityManager W;
    public MotionEvent W0;
    public long X0;
    public final WeakCache Y0;
    public final MutableObjectList Z0;
    public final GraphicsContext a0;
    public final AndroidComposeView$resendMotionEventRunnable$1 a1;
    public final AutofillTree b0;
    public final Runnable b1;
    public final List c0;
    public boolean c1;
    public List d0;
    public final Function0 d1;
    public boolean e0;
    public final CalculateMatrixToWindow e1;
    public boolean f0;
    public boolean f1;
    public final MotionEventAdapter g0;
    public final ScrollCapture g1;
    public final PointerInputEventProcessor h0;
    public final PointerIconService h1;
    public Function1 i0;
    public int i1;
    public final AndroidAutofill j0;
    public final AndroidAutofillManager k0;
    public boolean l0;
    public final AndroidClipboardManager m0;
    public final AndroidClipboard n0;
    public final OwnerSnapshotObserver o0;
    public boolean p0;
    public AndroidViewsHandler q0;
    public DrawChildContainer r0;
    public Constraints s0;
    public boolean t0;
    public final MeasureAndLayoutDelegate u0;
    public long v0;
    public final int[] w0;
    public final float[] x0;
    public final float[] y0;

    /* renamed from: z  reason: collision with root package name */
    public long f17496z;
    public final float[] z0;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean b() {
            try {
                Boolean bool = null;
                if (AndroidComposeView.l1 == null) {
                    AndroidComposeView.l1 = Class.forName("android.os.SystemProperties");
                    Class d0 = AndroidComposeView.l1;
                    AndroidComposeView.m1 = d0 != null ? d0.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE}) : null;
                }
                Method Z = AndroidComposeView.m1;
                Object invoke = Z != null ? Z.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE}) : null;
                if (invoke instanceof Boolean) {
                    bool = (Boolean) invoke;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class ViewTreeOwners {

        /* renamed from: a  reason: collision with root package name */
        public final LifecycleOwner f17497a;

        /* renamed from: b  reason: collision with root package name */
        public final SavedStateRegistryOwner f17498b;

        public ViewTreeOwners(LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
            this.f17497a = lifecycleOwner;
            this.f17498b = savedStateRegistryOwner;
        }

        public final LifecycleOwner a() {
            return this.f17497a;
        }

        public final SavedStateRegistryOwner b() {
            return this.f17498b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context, CoroutineContext coroutineContext) {
        super(context);
        AndroidAutofillManager androidAutofillManager;
        Context context2 = context;
        Offset.Companion companion = Offset.f15855b;
        this.f17496z = companion.b();
        ScrollCapture scrollCapture = null;
        this.f17495B = new LayoutNodeDrawScope((CanvasDrawScope) null, 1, (DefaultConstructorMarker) null);
        this.C = SnapshotStateKt.i(AndroidDensity_androidKt.a(context), SnapshotStateKt.o());
        EmptySemanticsModifier emptySemanticsModifier = new EmptySemanticsModifier();
        this.D = emptySemanticsModifier;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(emptySemanticsModifier);
        this.E = emptySemanticsElement;
        AndroidComposeView$bringIntoViewNode$1 androidComposeView$bringIntoViewNode$1 = new AndroidComposeView$bringIntoViewNode$1(this);
        this.F = androidComposeView$bringIntoViewNode$1;
        this.G = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this), new AndroidComposeView$focusOwner$2(this), new AndroidComposeView$focusOwner$3(this), new AndroidComposeView$focusOwner$4(this), new AndroidComposeView$focusOwner$5(this), new AndroidComposeView$focusOwner$6(this));
        this.H = coroutineContext;
        this.I = new AndroidDragAndDropManager(new AndroidComposeView$dragAndDropManager$1(this));
        this.J = new LazyWindowInfo();
        Modifier.Companion companion2 = Modifier.f15489d;
        Modifier a2 = KeyInputModifierKt.a(companion2, new AndroidComposeView$keyInputModifier$1(this));
        this.L = a2;
        Modifier a3 = RotaryInputModifierKt.a(companion2, AndroidComposeView$rotaryInputModifier$1.f17526z);
        this.M = a3;
        this.N = new CanvasHolder();
        this.O = new AndroidViewConfiguration(ViewConfiguration.get(context));
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, (DefaultConstructorMarker) null);
        layoutNode.e(RootMeasurePolicy.f17147b);
        layoutNode.a(getDensity());
        layoutNode.k(getViewConfiguration());
        layoutNode.h(companion2.o0(emptySemanticsElement).o0(a3).o0(a2).o0(getFocusOwner().d()).o0(getDragAndDropManager().c()).o0(androidComposeView$bringIntoViewNode$1));
        this.P = layoutNode;
        this.Q = IntObjectMapKt.c();
        this.R = new RectManager(getLayoutNodes());
        this.S = this;
        this.T = new SemanticsOwner(getRoot(), emptySemanticsModifier, getLayoutNodes());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.U = androidComposeViewAccessibilityDelegateCompat;
        this.V = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.W = new AndroidAccessibilityManager(context2);
        this.a0 = AndroidGraphicsContext_androidKt.a(this);
        this.b0 = new AutofillTree();
        this.c0 = new ArrayList();
        this.g0 = new MotionEventAdapter();
        this.h0 = new PointerInputEventProcessor(getRoot());
        this.i0 = AndroidComposeView$configurationChangeObserver$1.f17504z;
        this.j0 = r0() ? new AndroidAutofill(this, getAutofillTree()) : null;
        if (r0()) {
            AutofillManager autofillManager = (AutofillManager) context2.getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                androidAutofillManager = new AndroidAutofillManager(new PlatformAutofillManagerImpl(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
            } else {
                InlineClassHelperKt.d("Autofill service could not be located.");
                throw new KotlinNothingValueException();
            }
        } else {
            androidAutofillManager = null;
        }
        this.k0 = androidAutofillManager;
        this.m0 = new AndroidClipboardManager(context2);
        this.n0 = new AndroidClipboard(getClipboardManager());
        this.o0 = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.u0 = new MeasureAndLayoutDelegate(getRoot());
        long j2 = (long) Integer.MAX_VALUE;
        this.v0 = IntOffset.f((j2 & 4294967295L) | (j2 << 32));
        this.w0 = new int[]{0, 0};
        float[] c2 = Matrix.c((float[]) null, 1, (DefaultConstructorMarker) null);
        this.x0 = c2;
        this.y0 = Matrix.c((float[]) null, 1, (DefaultConstructorMarker) null);
        this.z0 = Matrix.c((float[]) null, 1, (DefaultConstructorMarker) null);
        this.A0 = -1;
        this.C0 = companion.a();
        this.D0 = true;
        this.E0 = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.F0 = SnapshotStateKt.e(new AndroidComposeView$viewTreeOwners$2(this));
        this.H0 = new C0336b(this);
        this.I0 = new C0337c(this);
        this.J0 = new C0338d(this);
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        this.K0 = textInputServiceAndroid;
        this.L0 = new TextInputService((PlatformTextInputService) AndroidComposeView_androidKt.h().invoke(textInputServiceAndroid));
        this.M0 = SessionMutex.a();
        this.N0 = new DelegatingSoftwareKeyboardController(getTextInputService());
        this.O0 = new AndroidFontResourceLoader(context2);
        this.P0 = SnapshotStateKt.i(FontFamilyResolver_androidKt.a(context), SnapshotStateKt.o());
        this.Q0 = C0(context.getResources().getConfiguration());
        LayoutDirection e2 = FocusInteropUtils_androidKt.e(context.getResources().getConfiguration().getLayoutDirection());
        this.R0 = SnapshotStateKt__SnapshotStateKt.e(e2 == null ? LayoutDirection.Ltr : e2, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.S0 = new PlatformHapticFeedback(this);
        this.T0 = new InputModeManagerImpl(isInTouchMode() ? InputMode.f16742b.b() : InputMode.f16742b.a(), new AndroidComposeView$_inputModeManager$1(this), (DefaultConstructorMarker) null);
        this.U0 = new ModifierLocalManager(this);
        this.V0 = new AndroidTextToolbar(this);
        this.Y0 = new WeakCache();
        this.Z0 = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);
        this.a1 = new AndroidComposeView$resendMotionEventRunnable$1(this);
        this.b1 = new C0339e(this);
        this.d1 = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        int i2 = Build.VERSION.SDK_INT;
        this.e1 = i2 < 29 ? new CalculateMatrixToWindowApi21(c2, (DefaultConstructorMarker) null) : new CalculateMatrixToWindowApi29();
        addOnAttachStateChangeListener(this.V);
        setWillNotDraw(false);
        setFocusable(true);
        AndroidComposeViewVerificationHelperMethodsO.f17589a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.U(this, androidComposeViewAccessibilityDelegateCompat);
        Function1 a4 = ViewRootForTest.f17916k.a();
        if (a4 != null) {
            a4.invoke(this);
        }
        setOnDragListener(getDragAndDropManager());
        getRoot().t(this);
        if (i2 >= 29) {
            AndroidComposeViewForceDarkModeQ.f17583a.a(this);
        }
        this.g1 = i2 >= 31 ? new ScrollCapture() : scrollCapture;
        this.h1 = new AndroidComposeView$pointerIconService$1(this);
    }

    public static final void D0(AndroidComposeView androidComposeView) {
        androidComposeView.j1();
    }

    public static /* synthetic */ void b1(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.a1(layoutNode);
    }

    public static final void c1(AndroidComposeView androidComposeView) {
        androidComposeView.j1();
    }

    public static final void d1(AndroidComposeView androidComposeView) {
        androidComposeView.c1 = false;
        MotionEvent motionEvent = androidComposeView.W0;
        Intrinsics.f(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.e1(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
    }

    public static /* synthetic */ void g1(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i2, long j2, boolean z2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            z2 = true;
        }
        androidComposeView.f1(motionEvent, i2, j2, z2);
    }

    @Deprecated
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* access modifiers changed from: private */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this.E0.getValue();
    }

    public static final void i1(AndroidComposeView androidComposeView, boolean z2) {
        androidComposeView.T0.b(z2 ? InputMode.f16742b.b() : InputMode.f16742b.a());
    }

    private void setDensity(Density density) {
        this.C.setValue(density);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.P0.setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.R0.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this.E0.setValue(viewTreeOwners);
    }

    public void A(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (r0() && ComposeUiFlags.f15476d && (androidAutofillManager = this.k0) != null) {
            androidAutofillManager.j(layoutNode);
        }
    }

    public final View A0(int i2, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", (Class[]) null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.d(declaredMethod.invoke(view, (Object[]) null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View A02 = A0(i2, viewGroup.getChildAt(i3));
                    if (A02 != null) {
                        return A02;
                    }
                }
            }
        }
        return null;
    }

    public void B(float[] fArr) {
        U0();
        Matrix.m(fArr, this.y0);
        AndroidComposeView_androidKt.j(fArr, Float.intBitsToFloat((int) (this.C0 >> 32)), Float.intBitsToFloat((int) (this.C0 & 4294967295L)), this.x0);
    }

    public FocusDirection B0(KeyEvent keyEvent) {
        long a2 = KeyEvent_androidKt.a(keyEvent);
        Key.Companion companion = Key.f16750b;
        if (Key.r(a2, companion.o())) {
            return FocusDirection.i(KeyEvent_androidKt.f(keyEvent) ? FocusDirection.f15729b.f() : FocusDirection.f15729b.e());
        } else if (Key.r(a2, companion.e())) {
            return FocusDirection.i(FocusDirection.f15729b.g());
        } else {
            if (Key.r(a2, companion.d())) {
                return FocusDirection.i(FocusDirection.f15729b.d());
            }
            boolean z2 = true;
            if (Key.r(a2, companion.f()) ? true : Key.r(a2, companion.m())) {
                return FocusDirection.i(FocusDirection.f15729b.h());
            }
            if (Key.r(a2, companion.c()) ? true : Key.r(a2, companion.l())) {
                return FocusDirection.i(FocusDirection.f15729b.a());
            }
            if (Key.r(a2, companion.b()) ? true : Key.r(a2, companion.g()) ? true : Key.r(a2, companion.k())) {
                return FocusDirection.i(FocusDirection.f15729b.b());
            }
            if (!Key.r(a2, companion.a())) {
                z2 = Key.r(a2, companion.h());
            }
            if (z2) {
                return FocusDirection.i(FocusDirection.f15729b.c());
            }
            return null;
        }
    }

    public final int C0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    public void E(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (r0() && ComposeUiFlags.f15476d && (androidAutofillManager = this.k0) != null) {
            androidAutofillManager.n(layoutNode);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a7 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b4 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bc A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E0(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r9 = r17
            r0 = r18
            androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1 r1 = r9.a1
            r9.removeCallbacks(r1)
            r10 = 0
            r17.V0(r18)     // Catch:{ all -> 0x0125 }
            r11 = 1
            r9.B0 = r11     // Catch:{ all -> 0x0125 }
            r9.b(r10)     // Catch:{ all -> 0x0125 }
            java.lang.String r1 = "AndroidOwner:onTouch"
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x0125 }
            int r12 = r18.getActionMasked()     // Catch:{ all -> 0x002b }
            android.view.MotionEvent r13 = r9.W0     // Catch:{ all -> 0x002b }
            r14 = 3
            if (r13 == 0) goto L_0x0029
            int r1 = r13.getToolType(r10)     // Catch:{ all -> 0x002b }
            if (r1 != r14) goto L_0x0029
            r15 = r11
            goto L_0x002e
        L_0x0029:
            r15 = r10
            goto L_0x002e
        L_0x002b:
            r0 = move-exception
            goto L_0x0127
        L_0x002e:
            r8 = 10
            if (r13 == 0) goto L_0x0043
            boolean r1 = r9.G0(r0, r13)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r9.L0(r13)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0045
            androidx.compose.ui.input.pointer.PointerInputEventProcessor r1 = r9.h0     // Catch:{ all -> 0x002b }
            r1.c()     // Catch:{ all -> 0x002b }
        L_0x0043:
            r11 = r8
            goto L_0x0061
        L_0x0045:
            int r1 = r13.getActionMasked()     // Catch:{ all -> 0x002b }
            if (r1 == r8) goto L_0x0043
            if (r15 == 0) goto L_0x0043
            long r4 = r13.getEventTime()     // Catch:{ all -> 0x002b }
            r7 = 8
            r16 = 0
            r3 = 10
            r6 = 0
            r1 = r17
            r2 = r13
            r11 = r8
            r8 = r16
            g1(r1, r2, r3, r4, r6, r7, r8)     // Catch:{ all -> 0x002b }
        L_0x0061:
            int r1 = r0.getToolType(r10)     // Catch:{ all -> 0x002b }
            if (r1 != r14) goto L_0x0069
            r1 = 1
            goto L_0x006a
        L_0x0069:
            r1 = r10
        L_0x006a:
            r8 = 9
            if (r15 != 0) goto L_0x008e
            if (r1 == 0) goto L_0x008e
            if (r12 == r14) goto L_0x008e
            if (r12 == r8) goto L_0x008e
            boolean r1 = r17.M0(r18)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x008e
            long r4 = r18.getEventTime()     // Catch:{ all -> 0x002b }
            r7 = 8
            r12 = 0
            r3 = 9
            r6 = 0
            r1 = r17
            r2 = r18
            r14 = r8
            r8 = r12
            g1(r1, r2, r3, r4, r6, r7, r8)     // Catch:{ all -> 0x002b }
            goto L_0x008f
        L_0x008e:
            r14 = r8
        L_0x008f:
            if (r13 == 0) goto L_0x0094
            r13.recycle()     // Catch:{ all -> 0x002b }
        L_0x0094:
            android.view.MotionEvent r1 = r9.W0     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0115
            int r1 = r1.getAction()     // Catch:{ all -> 0x002b }
            if (r1 != r11) goto L_0x0115
            android.view.MotionEvent r1 = r9.W0     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x00a7
            int r1 = r1.getPointerId(r10)     // Catch:{ all -> 0x002b }
            goto L_0x00a8
        L_0x00a7:
            r1 = -1
        L_0x00a8:
            int r2 = r18.getAction()     // Catch:{ all -> 0x002b }
            if (r2 != r14) goto L_0x00bc
            int r2 = r18.getHistorySize()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x00bc
            if (r1 < 0) goto L_0x0115
            androidx.compose.ui.input.pointer.MotionEventAdapter r2 = r9.g0     // Catch:{ all -> 0x002b }
            r2.e(r1)     // Catch:{ all -> 0x002b }
            goto L_0x0115
        L_0x00bc:
            int r2 = r18.getAction()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0115
            int r2 = r18.getHistorySize()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0115
            android.view.MotionEvent r2 = r9.W0     // Catch:{ all -> 0x002b }
            r3 = 2143289344(0x7fc00000, float:NaN)
            if (r2 == 0) goto L_0x00d3
            float r2 = r2.getX()     // Catch:{ all -> 0x002b }
            goto L_0x00d4
        L_0x00d3:
            r2 = r3
        L_0x00d4:
            android.view.MotionEvent r4 = r9.W0     // Catch:{ all -> 0x002b }
            if (r4 == 0) goto L_0x00dc
            float r3 = r4.getY()     // Catch:{ all -> 0x002b }
        L_0x00dc:
            float r4 = r18.getX()     // Catch:{ all -> 0x002b }
            float r5 = r18.getY()     // Catch:{ all -> 0x002b }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x00ee
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00ee
            r2 = r10
            goto L_0x00ef
        L_0x00ee:
            r2 = 1
        L_0x00ef:
            android.view.MotionEvent r3 = r9.W0     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x00f8
            long r3 = r3.getEventTime()     // Catch:{ all -> 0x002b }
            goto L_0x00fa
        L_0x00f8:
            r3 = -1
        L_0x00fa:
            long r5 = r18.getEventTime()     // Catch:{ all -> 0x002b }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0104
            r11 = 1
            goto L_0x0105
        L_0x0104:
            r11 = r10
        L_0x0105:
            if (r2 != 0) goto L_0x0109
            if (r11 == 0) goto L_0x0115
        L_0x0109:
            if (r1 < 0) goto L_0x0110
            androidx.compose.ui.input.pointer.MotionEventAdapter r2 = r9.g0     // Catch:{ all -> 0x002b }
            r2.e(r1)     // Catch:{ all -> 0x002b }
        L_0x0110:
            androidx.compose.ui.input.pointer.PointerInputEventProcessor r1 = r9.h0     // Catch:{ all -> 0x002b }
            r1.a()     // Catch:{ all -> 0x002b }
        L_0x0115:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtainNoHistory(r18)     // Catch:{ all -> 0x002b }
            r9.W0 = r1     // Catch:{ all -> 0x002b }
            int r0 = r17.e1(r18)     // Catch:{ all -> 0x002b }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0125 }
            r9.B0 = r10
            return r0
        L_0x0125:
            r0 = move-exception
            goto L_0x012b
        L_0x0127:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0125 }
            throw r0     // Catch:{ all -> 0x0125 }
        L_0x012b:
            r9.B0 = r10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.E0(android.view.MotionEvent):int");
    }

    public void F(Function0 function0) {
        if (!this.Z0.a(function0)) {
            this.Z0.n(function0);
        }
    }

    public final boolean F0(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f2 = -motionEvent.getAxisValue(26);
        return getFocusOwner().f(new RotaryScrollEvent(f2 * ViewConfigurationCompat.h(viewConfiguration, getContext()), f2 * ViewConfigurationCompat.e(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()), new AndroidComposeView$handleRotaryEvent$1(this, motionEvent));
    }

    public void G(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.u0.z(onLayoutCompletedListener);
        b1(this, (LayoutNode) null, 1, (Object) null);
    }

    public final boolean G0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    public OwnedLayer H(Function2 function2, Function0 function0, GraphicsLayer graphicsLayer, boolean z2) {
        if (graphicsLayer != null) {
            return new GraphicsLayerOwnerLayer(graphicsLayer, (GraphicsContext) null, this, function2, function0);
        }
        if (!z2) {
            OwnedLayer ownedLayer = (OwnedLayer) this.Y0.b();
            if (ownedLayer == null) {
                return new GraphicsLayerOwnerLayer(getGraphicsContext().b(), getGraphicsContext(), this, function2, function0);
            }
            ownedLayer.f(function2, function0);
            return ownedLayer;
        }
        if (isHardwareAccelerated() && this.D0) {
            try {
                return new RenderNodeLayer(this, function2, function0);
            } catch (Throwable unused) {
                this.D0 = false;
            }
        }
        if (this.r0 == null) {
            ViewLayer.Companion companion = ViewLayer.O;
            if (!companion.a()) {
                companion.d(new View(getContext()));
            }
            DrawChildContainer drawChildContainer = companion.b() ? new DrawChildContainer(getContext()) : new ViewLayerContainer(getContext());
            this.r0 = drawChildContainer;
            addView(drawChildContainer);
        }
        DrawChildContainer drawChildContainer2 = this.r0;
        Intrinsics.f(drawChildContainer2);
        return new ViewLayer(this, drawChildContainer2, function2, function0);
    }

    public void H0() {
        I0(getRoot());
    }

    public void I(LayoutNode layoutNode) {
        getLayoutNodes().r(layoutNode.v(), layoutNode);
    }

    public final void I0(LayoutNode layoutNode) {
        layoutNode.Q0();
        MutableVector J02 = layoutNode.J0();
        Object[] objArr = J02.f15005z;
        int p2 = J02.p();
        for (int i2 = 0; i2 < p2; i2++) {
            I0((LayoutNode) objArr[i2]);
        }
    }

    public void J() {
        AndroidAutofillManager androidAutofillManager;
        if (this.l0) {
            getSnapshotObserver().b();
            this.l0 = false;
        }
        AndroidViewsHandler androidViewsHandler = this.q0;
        if (androidViewsHandler != null) {
            v0(androidViewsHandler);
        }
        if (r0() && ComposeUiFlags.f15476d && (androidAutofillManager = this.k0) != null) {
            androidAutofillManager.h();
        }
        while (this.Z0.h() && this.Z0.d(0) != null) {
            int e2 = this.Z0.e();
            for (int i2 = 0; i2 < e2; i2++) {
                Function0 function0 = (Function0) this.Z0.d(i2);
                this.Z0.E(i2, (Object) null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.Z0.B(0, e2);
        }
    }

    public final void J0(LayoutNode layoutNode) {
        MeasureAndLayoutDelegate.J(this.u0, layoutNode, false, 2, (Object) null);
        MutableVector J02 = layoutNode.J0();
        Object[] objArr = J02.f15005z;
        int p2 = J02.p();
        for (int i2 = 0; i2 < p2; i2++) {
            J0((LayoutNode) objArr[i2]);
        }
    }

    public void K() {
        this.U.q0();
        this.V.A();
    }

    public final boolean K0(MotionEvent motionEvent) {
        boolean z2 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z2) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 1; i2 < pointerCount; i2++) {
                z2 = (Float.floatToRawIntBits(motionEvent.getX(i2)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i2)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !MotionEventVerifierApi29.f17820a.a(motionEvent, i2));
                if (z2) {
                    break;
                }
            }
        }
        return z2;
    }

    public void L(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (ComposeUiFlags.f15474b) {
            getRectManager().q(layoutNode);
        }
        if (r0() && ComposeUiFlags.f15476d && (androidAutofillManager = this.k0) != null) {
            androidAutofillManager.i(layoutNode);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = r3.getActionMasked();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean L0(android.view.MotionEvent r3) {
        /*
            r2 = this;
            int r0 = r3.getButtonState()
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            int r3 = r3.getActionMasked()
            if (r3 == 0) goto L_0x0015
            r0 = 2
            if (r3 == r0) goto L_0x0015
            r0 = 6
            if (r3 == r0) goto L_0x0015
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.L0(android.view.MotionEvent):boolean");
    }

    public void M() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.i1 == 1) {
                AndroidComposeViewSensitiveContent35.f17584a.a(getView(), false);
            }
            this.i1--;
        }
    }

    public final boolean M0(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        return 0.0f <= x2 && x2 <= ((float) getWidth()) && 0.0f <= y2 && y2 <= ((float) getHeight());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r4.W0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean N0(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getPointerCount()
            r1 = 1
            if (r0 == r1) goto L_0x0008
            return r1
        L_0x0008:
            android.view.MotionEvent r0 = r4.W0
            if (r0 == 0) goto L_0x002f
            int r2 = r0.getPointerCount()
            int r3 = r5.getPointerCount()
            if (r2 != r3) goto L_0x002f
            float r2 = r5.getRawX()
            float r3 = r0.getRawX()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x002f
            float r5 = r5.getRawY()
            float r0 = r0.getRawY()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            r1 = 0
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.N0(android.view.MotionEvent):boolean");
    }

    public final void O0(OwnedLayer ownedLayer, boolean z2) {
        if (!z2) {
            if (!this.e0) {
                this.c0.remove(ownedLayer);
                List list = this.d0;
                if (list != null) {
                    list.remove(ownedLayer);
                }
            }
        } else if (!this.e0) {
            this.c0.add(ownedLayer);
        } else {
            List list2 = this.d0;
            if (list2 == null) {
                list2 = new ArrayList();
                this.d0 = list2;
            }
            list2.add(ownedLayer);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object P(kotlin.jvm.functions.Function2 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = (androidx.compose.ui.platform.AndroidComposeView$textInputSession$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002d:
            kotlin.ResultKt.b(r6)
            goto L_0x0044
        L_0x0031:
            kotlin.ResultKt.b(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.M0
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r2 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r2.<init>(r4)
            r0.E = r3
            java.lang.Object r5 = androidx.compose.ui.SessionMutex.h(r6, r2, r5, r0)
            if (r5 != r1) goto L_0x0044
            return r1
        L_0x0044:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.P(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void P0() {
        if (isFocused() || (!ComposeUiFlags.f15477e && hasFocus())) {
            super.clearFocus();
        } else if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    public final Rect Q0() {
        if (isFocused()) {
            return getFocusOwner().n();
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return FocusInteropUtils_androidKt.a(findFocus, this);
        }
        return null;
    }

    public final boolean R0(int i2) {
        AndroidViewsHandler androidViewsHandler;
        View view;
        android.graphics.Rect rect = null;
        if (!ComposeUiFlags.f15477e) {
            FocusDirection.Companion companion = FocusDirection.f15729b;
            if (FocusDirection.l(i2, companion.b()) || FocusDirection.l(i2, companion.c())) {
                return false;
            }
            Integer c2 = FocusInteropUtils_androidKt.c(i2);
            if (c2 != null) {
                int intValue = c2.intValue();
                Rect Q02 = Q0();
                if (Q02 != null) {
                    rect = RectHelper_androidKt.a(Q02);
                }
                FocusFinder instance = FocusFinder.getInstance();
                View findNextFocus = rect == null ? instance.findNextFocus(this, findFocus(), intValue) : instance.findNextFocusFromRect(this, rect, intValue);
                if (findNextFocus != null) {
                    return FocusInteropUtils_androidKt.b(findNextFocus, Integer.valueOf(intValue), rect);
                }
                return false;
            }
            throw new IllegalStateException("Invalid focus direction");
        }
        FocusDirection.Companion companion2 = FocusDirection.f15729b;
        if (FocusDirection.l(i2, companion2.b()) || FocusDirection.l(i2, companion2.c()) || !hasFocus() || (androidViewsHandler = this.q0) == null) {
            return false;
        }
        Integer c3 = FocusInteropUtils_androidKt.c(i2);
        if (c3 != null) {
            int intValue2 = c3.intValue();
            View rootView = getRootView();
            Intrinsics.g(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) rootView;
            View findFocus = viewGroup.findFocus();
            if (findFocus != null) {
                FocusFinder instance2 = FocusFinder.getInstance();
                if (!FocusOwnerImplKt.a(i2) || !androidViewsHandler.hasFocus()) {
                    Rect Q03 = Q0();
                    if (Q03 != null) {
                        rect = RectHelper_androidKt.a(Q03);
                    }
                    view = instance2.findNextFocusFromRect(viewGroup, rect, intValue2);
                    if (view != null) {
                        view.getLocationInWindow(this.w0);
                    }
                    int[] iArr = this.w0;
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    getLocationInWindow(iArr);
                    if (rect != null) {
                        int[] iArr2 = this.w0;
                        rect.offset(iArr2[0] - i3, iArr2[1] - i4);
                    }
                } else {
                    view = instance2.findNextFocus(viewGroup, findFocus, intValue2);
                }
                if (view == null || view == findFocus) {
                    return false;
                }
                View focusedChild = androidViewsHandler.getFocusedChild();
                ViewParent parent = view.getParent();
                while (parent != null && parent != focusedChild) {
                    parent = parent.getParent();
                }
                if (parent == null) {
                    return false;
                }
                return FocusInteropUtils_androidKt.b(view, Integer.valueOf(intValue2), rect);
            }
            throw new IllegalStateException("view hasFocus but root can't find it");
        }
        throw new IllegalStateException("Invalid focus direction");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.c(r2.o());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean S0(androidx.compose.ui.focus.FocusDirection r2, androidx.compose.ui.geometry.Rect r3) {
        /*
            r1 = this;
            boolean r0 = r1.isFocused()
            if (r0 != 0) goto L_0x002d
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x000d
            goto L_0x002d
        L_0x000d:
            if (r2 == 0) goto L_0x001e
            int r2 = r2.o()
            java.lang.Integer r2 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.c(r2)
            if (r2 == 0) goto L_0x001e
            int r2 = r2.intValue()
            goto L_0x0020
        L_0x001e:
            r2 = 130(0x82, float:1.82E-43)
        L_0x0020:
            if (r3 == 0) goto L_0x0027
            android.graphics.Rect r3 = androidx.compose.ui.graphics.RectHelper_androidKt.a(r3)
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            boolean r2 = super.requestFocus(r2, r3)
            return r2
        L_0x002d:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.S0(androidx.compose.ui.focus.FocusDirection, androidx.compose.ui.geometry.Rect):boolean");
    }

    public final long T0(int i2, int i3) {
        return ULong.f(ULong.f((long) i3) | ULong.f(ULong.f((long) i2) << 32));
    }

    public final void U0() {
        if (!this.B0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.A0) {
                this.A0 = currentAnimationTimeMillis;
                W0();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.w0);
                int[] iArr = this.w0;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.w0;
                this.C0 = Offset.e((((long) Float.floatToRawIntBits(((float) iArr[0]) - ((float) iArr2[0]))) << 32) | (((long) Float.floatToRawIntBits(((float) iArr[1]) - ((float) iArr2[1]))) & 4294967295L));
            }
        }
    }

    public final void V0(MotionEvent motionEvent) {
        this.A0 = AnimationUtils.currentAnimationTimeMillis();
        W0();
        float[] fArr = this.y0;
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        long floatToRawIntBits = (long) Float.floatToRawIntBits(x2);
        long f2 = Matrix.f(fArr, Offset.e((((long) Float.floatToRawIntBits(y2)) & 4294967295L) | (floatToRawIntBits << 32)));
        this.C0 = Offset.e((((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (f2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (f2 & 4294967295L)))) & 4294967295L));
    }

    public final void W0() {
        this.e1.a(this, this.y0);
        InvertMatrixKt.a(this.y0, this.z0);
    }

    public final boolean X0(OwnedLayer ownedLayer) {
        if (this.r0 != null) {
            ViewLayer.O.b();
        }
        this.Y0.c(ownedLayer);
        this.c0.remove(ownedLayer);
        return true;
    }

    public final void Y0(AndroidViewHolder androidViewHolder) {
        F(new AndroidComposeView$removeAndroidView$1(this, androidViewHolder));
    }

    public final void Z0() {
        this.l0 = true;
    }

    public final void a1(LayoutNode layoutNode) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (layoutNode != null) {
                while (layoutNode != null && layoutNode.q0() == LayoutNode.UsageByParent.InMeasureBlock && u0(layoutNode)) {
                    layoutNode = layoutNode.C0();
                }
                if (layoutNode == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void autofill(SparseArray sparseArray) {
        AndroidAutofillManager androidAutofillManager;
        if (r0()) {
            if (ComposeUiFlags.f15476d && (androidAutofillManager = this.k0) != null) {
                androidAutofillManager.l(sparseArray);
            }
            AndroidAutofill androidAutofill = this.j0;
            if (androidAutofill != null) {
                AndroidAutofill_androidKt.a(androidAutofill, sparseArray);
            }
        }
    }

    public void b(boolean z2) {
        Function0 function0;
        if (this.u0.n() || this.u0.o()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z2) {
                try {
                    function0 = this.d1;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                function0 = null;
            }
            if (this.u0.t(function0)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.d(this.u0, false, 1, (Object) null);
            x0();
            Unit unit = Unit.f40552a;
            Trace.endSection();
        }
    }

    public void c(LifecycleOwner lifecycleOwner) {
        setShowLayoutBounds(j1.b());
    }

    public boolean canScrollHorizontally(int i2) {
        return this.U.P(false, i2, this.f17496z);
    }

    public boolean canScrollVertically(int i2) {
        return this.U.P(true, i2, this.f17496z);
    }

    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            I0(getRoot());
        }
        Owner.d(this, false, 1, (Object) null);
        Snapshot.f15255e.g();
        this.e0 = true;
        CanvasHolder canvasHolder = this.N;
        Canvas A2 = canvasHolder.a().A();
        canvasHolder.a().B(canvas);
        getRoot().F(canvasHolder.a(), (GraphicsLayer) null);
        canvasHolder.a().B(A2);
        if (!this.c0.isEmpty()) {
            int size = this.c0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((OwnedLayer) this.c0.get(i2)).l();
            }
        }
        if (ViewLayer.O.b()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.c0.clear();
        this.e0 = false;
        List list = this.d0;
        if (list != null) {
            Intrinsics.f(list);
            this.c0.addAll(list);
            list.clear();
        }
        if (ComposeUiFlags.f15474b) {
            getRectManager().d();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.c1) {
            removeCallbacks(this.b1);
            if (motionEvent.getActionMasked() == 8) {
                this.c1 = false;
            } else {
                this.b1.run();
            }
        }
        return motionEvent.getActionMasked() == 8 ? (K0(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : motionEvent.isFromSource(4194304) ? F0(motionEvent) : (E0(motionEvent) & 1) != 0 : super.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.c1) {
            removeCallbacks(this.b1);
            this.b1.run();
        }
        if (K0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.U.W(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && M0(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.W0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.W0 = MotionEvent.obtainNoHistory(motionEvent);
                this.c1 = true;
                postDelayed(this.b1, 8);
                return false;
            }
        } else if (!N0(motionEvent)) {
            return false;
        }
        return (E0(motionEvent) & 1) != 0;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().e(androidx.compose.ui.input.key.KeyEvent.b(keyEvent), new AndroidComposeView$dispatchKeyEvent$1(this, keyEvent));
        }
        this.J.d(PointerKeyboardModifiers.b(keyEvent.getMetaState()));
        return FocusOwner.q(getFocusOwner(), androidx.compose.ui.input.key.KeyEvent.b(keyEvent), (Function0) null, 2, (Object) null) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().r(androidx.compose.ui.input.key.KeyEvent.b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    public void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            AndroidComposeViewAssistHelperMethodsO.f17582a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.c1) {
            removeCallbacks(this.b1);
            MotionEvent motionEvent2 = this.W0;
            Intrinsics.f(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || G0(motionEvent, motionEvent2)) {
                this.b1.run();
            } else {
                this.c1 = false;
            }
        }
        if (K0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !N0(motionEvent)) {
            return false;
        }
        int E02 = E0(motionEvent);
        if ((E02 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (E02 & 1) != 0;
    }

    public void e(LayoutNode layoutNode, long j2) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.u0.u(layoutNode, j2);
            if (!this.u0.n()) {
                MeasureAndLayoutDelegate.d(this.u0, false, 1, (Object) null);
                x0();
            }
            if (ComposeUiFlags.f15474b) {
                getRectManager().d();
            }
            Unit unit = Unit.f40552a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int e1(MotionEvent motionEvent) {
        Object obj;
        if (this.f1) {
            this.f1 = false;
            this.J.d(PointerKeyboardModifiers.b(motionEvent.getMetaState()));
        }
        PointerInputEvent c2 = this.g0.c(motionEvent, this);
        if (c2 != null) {
            List b2 = c2.b();
            int size = b2.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    obj = b2.get(size);
                    if (((PointerInputEventData) obj).b()) {
                        break;
                    } else if (i2 < 0) {
                        break;
                    } else {
                        size = i2;
                    }
                }
            }
            obj = null;
            PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
            if (pointerInputEventData != null) {
                this.f17496z = pointerInputEventData.f();
            }
            int b3 = this.h0.b(c2, this, M0(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked != 0 && actionMasked != 5) || (b3 & 1) != 0) {
                return b3;
            }
            this.g0.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return b3;
        }
        this.h0.c();
        return PointerInputEventProcessorKt.a(false, false);
    }

    public long f(long j2) {
        U0();
        long f2 = Matrix.f(this.y0, j2);
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (f2 & 4294967295L)) + Float.intBitsToFloat((int) (this.C0 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (f2 >> 32)) + Float.intBitsToFloat((int) (this.C0 >> 32)))) << 32));
    }

    public final void f1(MotionEvent motionEvent, int i2, long j2, boolean z2) {
        MotionEvent motionEvent2 = motionEvent;
        int i3 = i2;
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (!(i3 == 9 || i3 == 10)) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i4 >= 0 ? 1 : 0);
        if (pointerCount != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            for (int i5 = 0; i5 < pointerCount; i5++) {
                pointerPropertiesArr[i5] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i6 = 0; i6 < pointerCount; i6++) {
                pointerCoordsArr[i6] = new MotionEvent.PointerCoords();
            }
            int i7 = 0;
            while (i7 < pointerCount) {
                int i8 = ((i4 < 0 || i7 < i4) ? 0 : 1) + i7;
                motionEvent2.getPointerProperties(i8, pointerPropertiesArr[i7]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i7];
                motionEvent2.getPointerCoords(i8, pointerCoords);
                long f2 = f(Offset.e((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(pointerCoords.x)) << 32)));
                pointerCoords.x = Float.intBitsToFloat((int) (f2 >> 32));
                pointerCoords.y = Float.intBitsToFloat((int) (f2 & 4294967295L));
                i7++;
                int i9 = i2;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j2 : motionEvent.getDownTime(), j2, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z2 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            PointerInputEvent c2 = this.g0.c(obtain, this);
            Intrinsics.f(c2);
            this.h0.b(c2, this, true);
            obtain.recycle();
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i2) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return A0(i2, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i2)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        if (androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m(androidx.compose.ui.focus.FocusTraversalKt.d((androidx.compose.ui.focus.FocusTargetNode) r7), androidx.compose.ui.focus.FocusInteropUtils_androidKt.a(r0, r6), r1, r2) != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x007d
            androidx.compose.ui.node.MeasureAndLayoutDelegate r0 = r6.u0
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x000c
            goto L_0x007d
        L_0x000c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocus(r6, r7, r8)
            if (r7 != r6) goto L_0x0025
            androidx.compose.ui.focus.FocusOwner r1 = r6.getFocusOwner()
            androidx.compose.ui.geometry.Rect r1 = r1.n()
            if (r1 != 0) goto L_0x0029
            androidx.compose.ui.geometry.Rect r1 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.a(r7, r6)
            goto L_0x0029
        L_0x0025:
            androidx.compose.ui.geometry.Rect r1 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.a(r7, r6)
        L_0x0029:
            androidx.compose.ui.focus.FocusDirection r2 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.d(r8)
            if (r2 == 0) goto L_0x0034
            int r2 = r2.o()
            goto L_0x003a
        L_0x0034:
            androidx.compose.ui.focus.FocusDirection$Companion r2 = androidx.compose.ui.focus.FocusDirection.f15729b
            int r2 = r2.a()
        L_0x003a:
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            androidx.compose.ui.focus.FocusOwner r4 = r6.getFocusOwner()
            androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1 r5 = new androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            r5.<init>(r3)
            java.lang.Boolean r4 = r4.x(r2, r1, r5)
            if (r4 != 0) goto L_0x004f
            goto L_0x007c
        L_0x004f:
            java.lang.Object r4 = r3.f40908z
            if (r4 != 0) goto L_0x0056
            if (r0 != 0) goto L_0x007b
            goto L_0x007c
        L_0x0056:
            if (r0 != 0) goto L_0x005a
        L_0x0058:
            r7 = r6
            goto L_0x007c
        L_0x005a:
            boolean r4 = androidx.compose.ui.focus.FocusOwnerImplKt.a(r2)
            if (r4 == 0) goto L_0x0065
            android.view.View r7 = super.focusSearch(r7, r8)
            goto L_0x007c
        L_0x0065:
            java.lang.Object r7 = r3.f40908z
            kotlin.jvm.internal.Intrinsics.f(r7)
            androidx.compose.ui.focus.FocusTargetNode r7 = (androidx.compose.ui.focus.FocusTargetNode) r7
            androidx.compose.ui.geometry.Rect r7 = androidx.compose.ui.focus.FocusTraversalKt.d(r7)
            androidx.compose.ui.geometry.Rect r8 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.a(r0, r6)
            boolean r7 = androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m(r7, r8, r1, r2)
            if (r7 == 0) goto L_0x007b
            goto L_0x0058
        L_0x007b:
            r7 = r0
        L_0x007c:
            return r7
        L_0x007d:
            android.view.View r7 = super.focusSearch(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.focusSearch(android.view.View, int):android.view.View");
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.q0 == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this.q0 = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this.q0;
        Intrinsics.f(androidViewsHandler2);
        return androidViewsHandler2;
    }

    public Autofill getAutofill() {
        return this.j0;
    }

    public androidx.compose.ui.autofill.AutofillManager getAutofillManager() {
        return this.k0;
    }

    public AutofillTree getAutofillTree() {
        return this.b0;
    }

    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.i0;
    }

    public final AndroidContentCaptureManager getContentCaptureManager$ui_release() {
        return this.V;
    }

    public CoroutineContext getCoroutineContext() {
        return this.H;
    }

    public Density getDensity() {
        return (Density) this.C.getValue();
    }

    public FocusOwner getFocusOwner() {
        return this.G;
    }

    public void getFocusedRect(android.graphics.Rect rect) {
        Rect Q02 = Q0();
        if (Q02 != null) {
            rect.left = Math.round(Q02.o());
            rect.top = Math.round(Q02.r());
            rect.right = Math.round(Q02.p());
            rect.bottom = Math.round(Q02.i());
        } else if (!Intrinsics.d(getFocusOwner().x(FocusDirection.f15729b.a(), (Rect) null, AndroidComposeView$getFocusedRect$1.f17508z), Boolean.TRUE)) {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            super.getFocusedRect(rect);
        }
    }

    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.P0.getValue();
    }

    public Font.ResourceLoader getFontLoader() {
        return this.O0;
    }

    public GraphicsContext getGraphicsContext() {
        return this.a0;
    }

    public HapticFeedback getHapticFeedBack() {
        return this.S0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.u0.n();
    }

    public int getImportantForAutofill() {
        return 1;
    }

    public InputModeManager getInputModeManager() {
        return this.T0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.A0;
    }

    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.R0.getValue();
    }

    public long getMeasureIteration() {
        return this.u0.s();
    }

    public ModifierLocalManager getModifierLocalManager() {
        return this.U0;
    }

    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.b(this);
    }

    public PointerIconService getPointerIconService() {
        return this.h1;
    }

    public RectManager getRectManager() {
        return this.R;
    }

    public LayoutNode getRoot() {
        return this.P;
    }

    public RootForTest getRootForTest() {
        return this.S;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.g1) == null) {
            return false;
        }
        return scrollCapture.c();
    }

    public SemanticsOwner getSemanticsOwner() {
        return this.T;
    }

    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.f17495B;
    }

    public boolean getShowLayoutBounds() {
        return this.p0;
    }

    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.o0;
    }

    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.N0;
    }

    public TextInputService getTextInputService() {
        return this.L0;
    }

    public TextToolbar getTextToolbar() {
        return this.V0;
    }

    public View getView() {
        return this;
    }

    public ViewConfiguration getViewConfiguration() {
        return this.O;
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.F0.getValue();
    }

    public WindowInfo getWindowInfo() {
        return this.J;
    }

    public final AndroidAutofillManager get_autofillManager$ui_release() {
        return this.k0;
    }

    public void h(LayoutNode layoutNode, boolean z2, boolean z3) {
        if (z2) {
            if (this.u0.E(layoutNode, z3)) {
                b1(this, (LayoutNode) null, 1, (Object) null);
            }
        } else if (this.u0.H(layoutNode, z3)) {
            b1(this, (LayoutNode) null, 1, (Object) null);
        }
    }

    public final boolean h1(DragAndDropTransferData dragAndDropTransferData, long j2, Function1 function1) {
        Resources resources = getContext().getResources();
        return AndroidComposeViewStartDragAndDropN.f17585a.a(this, dragAndDropTransferData, new ComposeDragShadowBuilder(DensityKt.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j2, function1, (DefaultConstructorMarker) null));
    }

    public final void j1() {
        getLocationOnScreen(this.w0);
        long j2 = this.v0;
        int k2 = IntOffset.k(j2);
        int l2 = IntOffset.l(j2);
        int[] iArr = this.w0;
        boolean z2 = false;
        int i2 = iArr[0];
        if (!(k2 == i2 && l2 == iArr[1] && this.A0 >= 0)) {
            this.v0 = IntOffset.f((((long) i2) << 32) | (((long) iArr[1]) & 4294967295L));
            if (!(k2 == Integer.MAX_VALUE || l2 == Integer.MAX_VALUE)) {
                getRoot().f0().w().h2();
                z2 = true;
            }
        }
        U0();
        getRectManager().t(this.v0, IntOffsetKt.d(this.C0), this.y0);
        this.u0.c(z2);
        if (ComposeUiFlags.f15474b) {
            getRectManager().d();
        }
    }

    public final void k1() {
        MutableState c2 = this.J.f17816b;
        if (c2 != null) {
            c2.setValue(IntSize.b(AndroidWindowInfo_androidKt.d(this)));
        }
    }

    public long m(long j2) {
        U0();
        return Matrix.f(this.y0, j2);
    }

    public void n(LayoutNode layoutNode) {
        this.u0.G(layoutNode);
        b1(this, (LayoutNode) null, 1, (Object) null);
    }

    public void o(LayoutNode layoutNode, int i2) {
        AndroidAutofillManager androidAutofillManager;
        if (r0() && ComposeUiFlags.f15476d && (androidAutofillManager = this.k0) != null) {
            androidAutofillManager.k(layoutNode, i2);
        }
        getRectManager().l(layoutNode, layoutNode.f0().w().h1(), true);
    }

    public void onAttachedToWindow() {
        LifecycleOwner a2;
        LifecycleOwner a3;
        Lifecycle a4;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        this.J.f(hasWindowFocus());
        this.J.e(new AndroidComposeView$onAttachedToWindow$1(this));
        k1();
        J0(getRoot());
        I0(getRoot());
        getSnapshotObserver().k();
        if (r0() && (androidAutofill = this.j0) != null) {
            AutofillCallback.f15579a.a(androidAutofill);
        }
        LifecycleOwner a5 = ViewTreeLifecycleOwner.a(this);
        SavedStateRegistryOwner a6 = ViewTreeSavedStateRegistryOwner.a(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle = null;
        if (viewTreeOwners == null || !(a5 == null || a6 == null || (a5 == viewTreeOwners.a() && a6 == viewTreeOwners.a()))) {
            if (a5 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            } else if (a6 != null) {
                if (!(viewTreeOwners == null || (a3 = viewTreeOwners.a()) == null || (a4 = a3.a()) == null)) {
                    a4.d(this);
                }
                a5.a().a(this);
                ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(a5, a6);
                set_viewTreeOwners(viewTreeOwners2);
                Function1 function1 = this.G0;
                if (function1 != null) {
                    function1.invoke(viewTreeOwners2);
                }
                this.G0 = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        this.T0.b(isInTouchMode() ? InputMode.f16742b.b() : InputMode.f16742b.a());
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        if (!(viewTreeOwners3 == null || (a2 = viewTreeOwners3.a()) == null)) {
            lifecycle = a2.a();
        }
        if (lifecycle != null) {
            lifecycle.a(this);
            lifecycle.a(this.V);
            getViewTreeObserver().addOnGlobalLayoutListener(this.H0);
            getViewTreeObserver().addOnScrollChangedListener(this.I0);
            getViewTreeObserver().addOnTouchModeChangeListener(this.J0);
            if (Build.VERSION.SDK_INT >= 31) {
                AndroidComposeViewTranslationCallbackS.f17587a.b(this);
            }
            AndroidAutofillManager androidAutofillManager = this.k0;
            if (androidAutofillManager != null) {
                getFocusOwner().u().n(androidAutofillManager);
                getSemanticsOwner().b().n(androidAutofillManager);
                return;
            }
            return;
        }
        InlineClassHelperKt.d("No lifecycle owner exists");
        throw new KotlinNothingValueException();
    }

    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.d(this.M0);
        return androidPlatformTextInputSession == null ? this.K0.r() : androidPlatformTextInputSession.d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(AndroidDensity_androidKt.a(getContext()));
        k1();
        if (C0(configuration) != this.Q0) {
            this.Q0 = C0(configuration);
            setFontFamilyResolver(FontFamilyResolver_androidKt.a(getContext()));
        }
        this.i0.invoke(configuration);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.d(this.M0);
        return androidPlatformTextInputSession == null ? this.K0.o(editorInfo) : androidPlatformTextInputSession.c(editorInfo);
    }

    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.V.x(jArr, iArr, consumer);
    }

    public void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner a2;
        super.onDetachedFromWindow();
        getSnapshotObserver().l();
        Lifecycle lifecycle = null;
        this.J.e((Function0) null);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (a2 = viewTreeOwners.a()) == null)) {
            lifecycle = a2.a();
        }
        if (lifecycle != null) {
            lifecycle.d(this.V);
            lifecycle.d(this);
            if (r0() && (androidAutofill = this.j0) != null) {
                AutofillCallback.f15579a.b(androidAutofill);
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this.H0);
            getViewTreeObserver().removeOnScrollChangedListener(this.I0);
            getViewTreeObserver().removeOnTouchModeChangeListener(this.J0);
            if (Build.VERSION.SDK_INT >= 31) {
                AndroidComposeViewTranslationCallbackS.f17587a.a(this);
            }
            AndroidAutofillManager androidAutofillManager = this.k0;
            if (androidAutofillManager != null) {
                getSemanticsOwner().b().y(androidAutofillManager);
                getFocusOwner().u().y(androidAutofillManager);
                return;
            }
            return;
        }
        InlineClassHelperKt.d("No lifecycle owner exists");
        throw new KotlinNothingValueException();
    }

    public void onDraw(Canvas canvas) {
    }

    public void onFocusChanged(boolean z2, int i2, android.graphics.Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (!z2 && !hasFocus()) {
            getFocusOwner().s();
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.A0 = 0;
        this.u0.t(this.d1);
        this.s0 = null;
        j1();
        if (this.q0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public void onMeasure(int i2, int i3) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                J0(getRoot());
            }
            long w02 = w0(i2);
            long w03 = w0(i3);
            long a2 = Constraints.f19137b.a((int) ULong.f(w02 >>> 32), (int) ULong.f(w02 & 4294967295L), (int) ULong.f(w03 >>> 32), (int) ULong.f(4294967295L & w03));
            Constraints constraints = this.s0;
            boolean z2 = false;
            if (constraints == null) {
                this.s0 = Constraints.a(a2);
                this.t0 = false;
            } else {
                if (constraints != null) {
                    z2 = Constraints.f(constraints.r(), a2);
                }
                if (!z2) {
                    this.t0 = true;
                }
            }
            this.u0.K(a2);
            this.u0.v();
            setMeasuredDimension(getRoot().G0(), getRoot().U());
            if (this.q0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().G0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().U(), 1073741824));
            }
            Unit unit = Unit.f40552a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        AndroidAutofillManager androidAutofillManager;
        if (r0() && viewStructure != null) {
            if (ComposeUiFlags.f15476d && (androidAutofillManager = this.k0) != null) {
                androidAutofillManager.m(viewStructure);
            }
            AndroidAutofill androidAutofill = this.j0;
            if (androidAutofill != null) {
                AndroidAutofill_androidKt.b(androidAutofill, viewStructure);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r0 = getPointerIconService().a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent r3, int r4) {
        /*
            r2 = this;
            int r0 = r3.getToolType(r4)
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r1 = r3.isFromSource(r1)
            if (r1 != 0) goto L_0x002f
            r1 = 16386(0x4002, float:2.2962E-41)
            boolean r1 = r3.isFromSource(r1)
            if (r1 == 0) goto L_0x002f
            r1 = 2
            if (r0 == r1) goto L_0x001a
            r1 = 4
            if (r0 != r1) goto L_0x002f
        L_0x001a:
            androidx.compose.ui.input.pointer.PointerIconService r0 = r2.getPointerIconService()
            androidx.compose.ui.input.pointer.PointerIcon r0 = r0.a()
            if (r0 == 0) goto L_0x002f
            androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN r3 = androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN.f17588a
            android.content.Context r4 = r2.getContext()
            android.view.PointerIcon r3 = r3.b(r4, r0)
            return r3
        L_0x002f:
            android.view.PointerIcon r3 = super.onResolvePointerIcon(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onResolvePointerIcon(android.view.MotionEvent, int):android.view.PointerIcon");
    }

    public void onRtlPropertiesChanged(int i2) {
        if (this.f17494A) {
            LayoutDirection e2 = FocusInteropUtils_androidKt.e(i2);
            if (e2 == null) {
                e2 = LayoutDirection.Ltr;
            }
            setLayoutDirection(e2);
        }
    }

    public void onScrollCaptureSearch(android.graphics.Rect rect, Point point, Consumer consumer) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT >= 31 && (scrollCapture = this.g1) != null) {
            scrollCapture.d(this, getSemanticsOwner(), getCoroutineContext(), consumer);
        }
    }

    public void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        AndroidContentCaptureManager androidContentCaptureManager = this.V;
        androidContentCaptureManager.E(androidContentCaptureManager, longSparseArray);
    }

    public void onWindowFocusChanged(boolean z2) {
        boolean a2;
        this.J.f(z2);
        this.f1 = true;
        super.onWindowFocusChanged(z2);
        if (z2 && getShowLayoutBounds() != (a2 = j1.b())) {
            setShowLayoutBounds(a2);
            H0();
        }
    }

    public long p(long j2) {
        U0();
        return Matrix.f(this.z0, j2);
    }

    public final void p0(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        androidViewHolder.setImportantForAccessibility(1);
        ViewCompat.U(androidViewHolder, new AndroidComposeView$addAndroidView$1(this, layoutNode, this));
    }

    public void q(LayoutNode layoutNode, int i2) {
        getLayoutNodes().o(i2);
        getLayoutNodes().r(layoutNode.v(), layoutNode);
    }

    public final void q0(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int e2;
        if (Intrinsics.d(str, this.U.c0())) {
            int e3 = this.U.e0().e(i2, -1);
            if (e3 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, e3);
            }
        } else if (Intrinsics.d(str, this.U.b0()) && (e2 = this.U.d0().e(i2, -1)) != -1) {
            accessibilityNodeInfo.getExtras().putInt(str, e2);
        }
    }

    public void r(LayoutNode layoutNode, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            if (this.u0.F(layoutNode, z3) && z4) {
                a1(layoutNode);
            }
        } else if (this.u0.I(layoutNode, z3) && z4) {
            a1(layoutNode);
        }
    }

    public final boolean r0() {
        return true;
    }

    public boolean requestFocus(int i2, android.graphics.Rect rect) {
        View z02;
        Rect rect2 = null;
        if (!ComposeUiFlags.f15477e) {
            if (isFocused()) {
                return true;
            }
            if (getFocusOwner().j().d()) {
                return super.requestFocus(i2, rect);
            }
            FocusDirection d2 = FocusInteropUtils_androidKt.d(i2);
            int o2 = d2 != null ? d2.o() : FocusDirection.f15729b.b();
            FocusOwner focusOwner = getFocusOwner();
            if (rect != null) {
                rect2 = RectHelper_androidKt.e(rect);
            }
            return Intrinsics.d(focusOwner.x(o2, rect2, new AndroidComposeView$requestFocus$1(o2)), Boolean.TRUE);
        } else if (isFocused()) {
            return true;
        } else {
            if (this.K || getFocusOwner().l().i()) {
                return false;
            }
            FocusDirection d3 = FocusInteropUtils_androidKt.d(i2);
            int o3 = d3 != null ? d3.o() : FocusDirection.f15729b.b();
            if (hasFocus() && R0(o3)) {
                return true;
            }
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            Boolean x2 = getFocusOwner().x(o3, rect != null ? RectHelper_androidKt.e(rect) : null, new AndroidComposeView$requestFocus$focusSearchResult$1(booleanRef, o3));
            if (x2 == null) {
                return false;
            }
            if (x2.booleanValue()) {
                return true;
            }
            if (booleanRef.f40901z) {
                return false;
            }
            if ((rect != null && !hasFocus() && Intrinsics.d(getFocusOwner().x(o3, (Rect) null, new AndroidComposeView$requestFocus$altFocus$1(o3)), Boolean.TRUE)) || (z02 = z0(i2)) == null || z02 == this) {
                return true;
            }
            this.K = true;
            boolean requestFocus = z02.requestFocus(i2);
            this.K = false;
            return requestFocus;
        }
    }

    public void s(LayoutNode layoutNode) {
        this.U.p0(layoutNode);
        this.V.z();
    }

    public final Object s0(Continuation continuation) {
        Object O2 = this.U.O(continuation);
        return O2 == IntrinsicsKt.f() ? O2 : Unit.f40552a;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j2) {
        this.U.N0(j2);
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, Unit> function1) {
        this.i0 = function1;
    }

    public final void setContentCaptureManager$ui_release(AndroidContentCaptureManager androidContentCaptureManager) {
        this.V = androidContentCaptureManager;
    }

    public void setCoroutineContext(CoroutineContext coroutineContext) {
        this.H = coroutineContext;
        Modifier.Node k2 = getRoot().u0().k();
        if (k2 instanceof SuspendingPointerInputModifierNode) {
            ((SuspendingPointerInputModifierNode) k2).u2();
        }
        int a2 = NodeKind.a(16);
        if (!k2.M().F2()) {
            InlineClassHelperKt.c("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = k2.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector, k2.M(), false);
        } else {
            mutableVector.d(w2);
        }
        while (mutableVector.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.y(mutableVector.p() - 1);
            if ((node.v2() & a2) != 0) {
                for (Modifier.Node node2 = node; node2 != null; node2 = node2.w2()) {
                    if ((node2.A2() & a2) != 0) {
                        Modifier.Node node3 = node2;
                        MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            if (node3 instanceof PointerInputModifierNode) {
                                PointerInputModifierNode pointerInputModifierNode = (PointerInputModifierNode) node3;
                                if (pointerInputModifierNode instanceof SuspendingPointerInputModifierNode) {
                                    ((SuspendingPointerInputModifierNode) pointerInputModifierNode).u2();
                                }
                            } else if ((node3.A2() & a2) != 0 && (node3 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node3).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node3 = a3;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                mutableVector2.d(node3);
                                                node3 = null;
                                            }
                                            mutableVector2.d(a3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.h(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.c(mutableVector, node, false);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j2) {
        this.A0 = j2;
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super ViewTreeOwners, Unit> function1) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.G0 = function1;
        }
    }

    public void setShowLayoutBounds(boolean z2) {
        this.p0 = z2;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(View view) {
        this.f0 = true;
    }

    public final Object t0(Continuation continuation) {
        Object f2 = this.V.f(continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public void u(LayoutNode layoutNode, boolean z2) {
        this.u0.i(layoutNode, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r2.C0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u0(androidx.compose.ui.node.LayoutNode r2) {
        /*
            r1 = this;
            boolean r0 = r1.t0
            if (r0 != 0) goto L_0x0013
            androidx.compose.ui.node.LayoutNode r2 = r2.C0()
            if (r2 == 0) goto L_0x0011
            boolean r2 = r2.T()
            if (r2 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = 0
            goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.u0(androidx.compose.ui.node.LayoutNode):boolean");
    }

    public final void v0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).J();
            } else if (childAt instanceof ViewGroup) {
                v0((ViewGroup) childAt);
            }
        }
    }

    public long w(long j2) {
        U0();
        return Matrix.f(this.z0, Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (this.C0 >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (this.C0 & 4294967295L)))))));
    }

    public final long w0(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return T0(0, size);
        }
        if (mode == 0) {
            return T0(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return T0(size, size);
        }
        throw new IllegalStateException();
    }

    public final void x0() {
        if (this.f0) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.f0 = false;
        }
    }

    public void y() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.i1 == 0) {
                AndroidComposeViewSensitiveContent35.f17584a.a(getView(), true);
            }
            this.i1++;
        }
    }

    public final void y0(AndroidViewHolder androidViewHolder, Canvas canvas) {
        getAndroidViewsHandler$ui_release().a(androidViewHolder, canvas);
    }

    public void z(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        getLayoutNodes().o(layoutNode.v());
        this.u0.x(layoutNode);
        Z0();
        if (ComposeUiFlags.f15474b) {
            getRectManager().q(layoutNode);
        }
        if (r0() && ComposeUiFlags.f15476d && (androidAutofillManager = this.k0) != null) {
            androidAutofillManager.g(layoutNode);
        }
    }

    public final View z0(int i2) {
        FocusFinder instance = FocusFinder.getInstance();
        View view = this;
        while (view != null) {
            View rootView = getRootView();
            Intrinsics.g(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            view = instance.findNextFocus((ViewGroup) rootView, view, i2);
            if (view != null && !AndroidComposeView_androidKt.e(this, view)) {
                return view;
            }
        }
        return null;
    }

    public void addView(View view, int i2) {
        Intrinsics.f(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i2, layoutParams);
    }

    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.W;
    }

    public AndroidClipboard getClipboard() {
        return this.n0;
    }

    public AndroidClipboardManager getClipboardManager() {
        return this.m0;
    }

    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.I;
    }

    public MutableIntObjectMap<LayoutNode> getLayoutNodes() {
        return this.Q;
    }

    public void addView(View view, int i2, int i3) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i2;
        generateDefaultLayoutParams.height = i3;
        Unit unit = Unit.f40552a;
        addView(view, -1, generateDefaultLayoutParams);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i2, layoutParams, true);
    }
}
