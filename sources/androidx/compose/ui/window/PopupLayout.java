package androidx.compose.ui.window;

import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.R;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
    public static final Companion e0 = new Companion((DefaultConstructorMarker) null);
    public static final int f0 = 8;
    public static final Function1 g0 = PopupLayout$Companion$onCommitAffectingPopupPosition$1.f19326z;
    public Function0 H;
    public PopupProperties I;
    public String J;
    public final View K;
    public final PopupLayoutHelper L;
    public final WindowManager M;
    public final WindowManager.LayoutParams N;
    public PopupPositionProvider O;
    public LayoutDirection P;
    public final MutableState Q;
    public final MutableState R;
    public IntRect S;
    public final State T;
    public final float U;
    public final Rect V;
    public final SnapshotStateObserver W;
    public Object a0;
    public final MutableState b0;
    public boolean c0;
    public final int[] d0;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19327a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f19327a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupLayout.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupLayout(kotlin.jvm.functions.Function0 r11, androidx.compose.ui.window.PopupProperties r12, java.lang.String r13, android.view.View r14, androidx.compose.ui.unit.Density r15, androidx.compose.ui.window.PopupPositionProvider r16, java.util.UUID r17, androidx.compose.ui.window.PopupLayoutHelper r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0012
            androidx.compose.ui.window.PopupLayoutHelperImpl29 r0 = new androidx.compose.ui.window.PopupLayoutHelperImpl29
            r0.<init>()
            goto L_0x0017
        L_0x0012:
            androidx.compose.ui.window.PopupLayoutHelperImpl r0 = new androidx.compose.ui.window.PopupLayoutHelperImpl
            r0.<init>()
        L_0x0017:
            r9 = r0
            goto L_0x001b
        L_0x0019:
            r9 = r18
        L_0x001b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupLayout.<init>(kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, java.lang.String, android.view.View, androidx.compose.ui.unit.Density, androidx.compose.ui.window.PopupPositionProvider, java.util.UUID, androidx.compose.ui.window.PopupLayoutHelper, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) this.b0.getValue();
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.R.getValue();
    }

    private final IntRect getVisibleDisplayBounds() {
        Rect rect = this.V;
        this.L.c(this.K, rect);
        return AndroidPopup_androidKt.l(rect);
    }

    private final WindowManager.LayoutParams m() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = AndroidPopup_androidKt.j(this.I, AndroidPopup_androidKt.k(this.K));
        layoutParams.type = 1002;
        layoutParams.token = this.K.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.K.getContext().getResources().getString(R.string.f15529e));
        return layoutParams;
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.b0.setValue(function2);
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.R.setValue(layoutCoordinates);
    }

    private final void t(LayoutDirection layoutDirection) {
        int i2 = WhenMappings.f19327a[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i3);
    }

    public void b(Composer composer, int i2) {
        composer.X(-857613600);
        if (ComposerKt.P()) {
            ComposerKt.Y(-857613600, i2, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
        }
        getContent().m(composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.I.a()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            } else if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.H;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.T.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.N;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.P;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final IntSize m12getPopupContentSizebOM6tXw() {
        return (IntSize) this.Q.getValue();
    }

    public final PopupPositionProvider getPositionProvider() {
        return this.O;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.c0;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.J;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    public void h(boolean z2, int i2, int i3, int i4, int i5) {
        View childAt;
        super.h(z2, i2, i3, i4, i5);
        if (!this.I.f() && (childAt = getChildAt(0)) != null) {
            this.N.width = childAt.getMeasuredWidth();
            this.N.height = childAt.getMeasuredHeight();
            this.L.a(this.M, this, this.N);
        }
    }

    public void i(int i2, int i3) {
        if (this.I.f()) {
            super.i(i2, i3);
            return;
        }
        IntRect visibleDisplayBounds = getVisibleDisplayBounds();
        super.i(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.l(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f(), Integer.MIN_VALUE));
    }

    public final void n() {
        ViewTreeLifecycleOwner.b(this, (LifecycleOwner) null);
        this.M.removeViewImmediate(this);
    }

    public final void o() {
        if (this.I.a() && Build.VERSION.SDK_INT >= 33) {
            if (this.a0 == null) {
                this.a0 = Api33Impl.b(this.H);
            }
            Api33Impl.d(this, this.a0);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W.q();
        o();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.W.r();
        this.W.f();
        p();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.I.b()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= ((float) getWidth()) || motionEvent.getY() < 0.0f || motionEvent.getY() >= ((float) getHeight()))) {
            Function0 function0 = this.H;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        } else if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        } else {
            Function0 function02 = this.H;
            if (function02 != null) {
                function02.invoke();
            }
            return true;
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.e(this, this.a0);
        }
        this.a0 = null;
    }

    public final void q() {
        int[] iArr = this.d0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        this.K.getLocationOnScreen(iArr);
        int[] iArr2 = this.d0;
        if (i2 != iArr2[0] || i3 != iArr2[1]) {
            v();
        }
    }

    public final void r(CompositionContext compositionContext, Function2 function2) {
        setParentCompositionContext(compositionContext);
        setContent(function2);
        this.c0 = true;
    }

    public final void s() {
        this.M.addView(this, this.N);
    }

    public void setLayoutDirection(int i2) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.P = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m13setPopupContentSizefhxjrPA(IntSize intSize) {
        this.Q.setValue(intSize);
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider) {
        this.O = popupPositionProvider;
    }

    public final void setTestTag(String str) {
        this.J = str;
    }

    public final void u(Function0 function0, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        this.H = function0;
        this.J = str;
        x(popupProperties);
        t(layoutDirection);
    }

    public final void v() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.b()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long a2 = parentLayoutCoordinates.a();
                long g2 = LayoutCoordinatesKt.g(parentLayoutCoordinates);
                IntRect a3 = IntRectKt.a(IntOffset.f((((long) Math.round(Float.intBitsToFloat((int) (g2 >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (g2 & 4294967295L)))))), a2);
                if (!Intrinsics.d(a3, this.S)) {
                    this.S = a3;
                    y();
                }
            }
        }
    }

    public final void w(LayoutCoordinates layoutCoordinates) {
        setParentLayoutCoordinates(layoutCoordinates);
        v();
    }

    public final void x(PopupProperties popupProperties) {
        if (!Intrinsics.d(this.I, popupProperties)) {
            if (popupProperties.f() && !this.I.f()) {
                WindowManager.LayoutParams layoutParams = this.N;
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.I = popupProperties;
            this.N.flags = AndroidPopup_androidKt.j(popupProperties, AndroidPopup_androidKt.k(this.K));
            this.L.a(this.M, this, this.N);
        }
    }

    public final void y() {
        IntSize r0;
        IntRect intRect = this.S;
        if (intRect != null && (r0 = m12getPopupContentSizebOM6tXw()) != null) {
            long j2 = r0.j();
            IntRect visibleDisplayBounds = getVisibleDisplayBounds();
            long c2 = IntSize.c((((long) visibleDisplayBounds.l()) << 32) | (((long) visibleDisplayBounds.f()) & 4294967295L));
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.f40907z = IntOffset.f19160b.b();
            SnapshotStateObserver snapshotStateObserver = this.W;
            Function1 function1 = g0;
            PopupLayout$updatePosition$1 popupLayout$updatePosition$1 = r0;
            PopupLayout$updatePosition$1 popupLayout$updatePosition$12 = new PopupLayout$updatePosition$1(longRef, this, intRect, c2, j2);
            snapshotStateObserver.k(this, function1, popupLayout$updatePosition$1);
            this.N.x = IntOffset.k(longRef.f40907z);
            this.N.y = IntOffset.l(longRef.f40907z);
            if (this.I.c()) {
                this.L.b(this, (int) (c2 >> 32), (int) (4294967295L & c2));
            }
            this.L.a(this.M, this, this.N);
        }
    }

    public PopupLayout(Function0 function0, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid, PopupLayoutHelper popupLayoutHelper) {
        super(view.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.H = function0;
        this.I = popupProperties;
        this.J = str;
        this.K = view;
        this.L = popupLayoutHelper;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.M = (WindowManager) systemService;
        this.N = m();
        this.O = popupPositionProvider;
        this.P = LayoutDirection.Ltr;
        this.Q = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.R = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.T = SnapshotStateKt.e(new PopupLayout$canCalculatePosition$2(this));
        float m2 = Dp.m((float) 8);
        this.U = m2;
        this.V = new Rect();
        this.W = new SnapshotStateObserver(new PopupLayout$snapshotStateObserver$1(this));
        setId(16908290);
        ViewTreeLifecycleOwner.b(this, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(this, ViewTreeSavedStateRegistryOwner.a(view));
        int i2 = R.id.H;
        setTag(i2, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.B1(m2));
        setOutlineProvider(new ViewOutlineProvider() {
            public void getOutline(View view, Outline outline) {
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.b0 = SnapshotStateKt__SnapshotStateKt.e(ComposableSingletons$AndroidPopup_androidKt.f19315a.a(), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.d0 = new int[2];
    }
}
