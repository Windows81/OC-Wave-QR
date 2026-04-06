package androidx.compose.material.internal;

import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class PopupLayout extends AbstractComposeView implements ViewRootForInspector, ViewTreeObserver.OnGlobalLayoutListener {
    public Function0 H;
    public String I;
    public final View J;
    public final WindowManager K;
    public final WindowManager.LayoutParams L = l();
    public PopupPositionProvider M;
    public LayoutDirection N;
    public final MutableState O;
    public final MutableState P;
    public final State Q;
    public final float R;
    public final Rect S;
    public final Rect T;
    public final Function2 U;
    public final MutableState V;
    public boolean W;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8996a;

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
                f8996a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.PopupLayout.WhenMappings.<clinit>():void");
        }
    }

    public PopupLayout(Function0 function0, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid) {
        super(view.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.H = function0;
        this.I = str;
        this.J = view;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.K = (WindowManager) systemService;
        this.M = popupPositionProvider;
        this.N = LayoutDirection.Ltr;
        this.O = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.P = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.Q = SnapshotStateKt.e(new PopupLayout$canCalculatePosition$2(this));
        float m2 = Dp.m((float) 8);
        this.R = m2;
        this.S = new Rect();
        this.T = new Rect();
        this.U = PopupLayout$dismissOnOutsideClick$1.f8998z;
        setId(16908290);
        ViewTreeLifecycleOwner.b(this, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(this, ViewTreeSavedStateRegistryOwner.a(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
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
        this.V = SnapshotStateKt__SnapshotStateKt.e(ComposableSingletons$ExposedDropdownMenuPopup_androidKt.f8962a.a(), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    private final void setContent(Function2 function2) {
        this.V.setValue(function2);
    }

    public void b(Composer composer, int i2) {
        composer.X(-864350873);
        if (ComposerKt.P()) {
            ComposerKt.Y(-864350873, i2, -1, "androidx.compose.material.internal.PopupLayout.Content (ExposedDropdownMenuPopup.android.kt:303)");
        }
        getContent().m(composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
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
        return ((Boolean) this.Q.getValue()).booleanValue();
    }

    public final Function2 getContent() {
        return (Function2) this.V.getValue();
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final IntSize m0getPopupContentSizebOM6tXw() {
        return (IntSize) this.P.getValue();
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.W;
    }

    public final WindowManager.LayoutParams l() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = this.J.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.J.getContext().getResources().getString(R.string.f15529e));
        return layoutParams;
    }

    public final void m() {
        ViewTreeLifecycleOwner.b(this, (LifecycleOwner) null);
        this.J.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.K.removeViewImmediate(this);
    }

    public final IntRect n() {
        return (IntRect) this.O.getValue();
    }

    public final void o(CompositionContext compositionContext, Function2 function2) {
        setParentCompositionContext(compositionContext);
        setContent(function2);
        this.W = true;
    }

    public void onGlobalLayout() {
        this.J.getWindowVisibleDisplayFrame(this.T);
        if (!Intrinsics.d(this.T, this.S)) {
            u();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (((java.lang.Boolean) r5.U.m((r6.getRawX() == 0.0f || r6.getRawY() == 0.0f) ? null : androidx.compose.ui.geometry.Offset.d(androidx.compose.ui.geometry.OffsetKt.a(r6.getRawX(), r6.getRawY())), r0)).booleanValue() != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0007
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L_0x0007:
            int r0 = r6.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x0038
            float r0 = r6.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003f
            float r0 = r6.getX()
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            float r0 = r6.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003f
            float r0 = r6.getY()
            int r2 = r5.getHeight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
        L_0x0038:
            int r0 = r6.getAction()
            r2 = 4
            if (r0 != r2) goto L_0x007f
        L_0x003f:
            androidx.compose.ui.unit.IntRect r0 = r5.n()
            if (r0 == 0) goto L_0x0076
            kotlin.jvm.functions.Function2 r2 = r5.U
            float r3 = r6.getRawX()
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0050
            goto L_0x0058
        L_0x0050:
            float r3 = r6.getRawY()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x005a
        L_0x0058:
            r1 = 0
            goto L_0x006a
        L_0x005a:
            float r1 = r6.getRawX()
            float r3 = r6.getRawY()
            long r3 = androidx.compose.ui.geometry.OffsetKt.a(r1, r3)
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.d(r3)
        L_0x006a:
            java.lang.Object r0 = r2.m(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007f
        L_0x0076:
            kotlin.jvm.functions.Function0 r6 = r5.H
            if (r6 == 0) goto L_0x007d
            r6.invoke()
        L_0x007d:
            r6 = 1
            return r6
        L_0x007f:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.PopupLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(IntRect intRect) {
        this.O.setValue(intRect);
    }

    public final void q() {
        this.K.addView(this, this.L);
    }

    public final void r(LayoutDirection layoutDirection) {
        int i2 = WhenMappings.f8996a[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i3);
    }

    public final IntRect s(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setLayoutDirection(int i2) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.N = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(IntSize intSize) {
        this.P.setValue(intSize);
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider) {
        this.M = popupPositionProvider;
    }

    public final void t(Function0 function0, String str, LayoutDirection layoutDirection) {
        this.H = function0;
        this.I = str;
        r(layoutDirection);
    }

    public final void u() {
        IntSize r0;
        IntRect n2 = n();
        if (n2 != null && (r0 = m0getPopupContentSizebOM6tXw()) != null) {
            long j2 = r0.j();
            Rect rect = this.S;
            this.J.getWindowVisibleDisplayFrame(rect);
            IntRect s2 = s(rect);
            long a2 = this.M.a(n2, IntSizeKt.a(s2.l(), s2.f()), this.N, j2);
            this.L.x = IntOffset.k(a2);
            this.L.y = IntOffset.l(a2);
            this.K.updateViewLayout(this, this.L);
        }
    }
}
