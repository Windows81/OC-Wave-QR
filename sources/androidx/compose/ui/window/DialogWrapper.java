package androidx.compose.ui.window;

import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {
    public Function0 C;
    public DialogProperties D;
    public final View E;
    public final DialogLayout F;
    public final float G;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19325a;

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
                f19325a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.DialogWrapper.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DialogWrapper(kotlin.jvm.functions.Function0 r7, androidx.compose.ui.window.DialogProperties r8, android.view.View r9, androidx.compose.ui.unit.LayoutDirection r10, androidx.compose.ui.unit.Density r11, java.util.UUID r12) {
        /*
            r6 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            boolean r2 = r8.a()
            if (r2 == 0) goto L_0x000f
            int r2 = androidx.compose.ui.R.style.f15544a
            goto L_0x0011
        L_0x000f:
            int r2 = androidx.compose.ui.R.style.f15545b
        L_0x0011:
            r0.<init>(r1, r2)
            r1 = 2
            r2 = 0
            r3 = 0
            r6.<init>(r0, r2, r1, r3)
            r6.C = r7
            r6.D = r8
            r6.E = r9
            r7 = 8
            float r7 = (float) r7
            float r7 = androidx.compose.ui.unit.Dp.m(r7)
            r6.G = r7
            android.view.Window r8 = r6.getWindow()
            if (r8 == 0) goto L_0x00ba
            r0 = 1
            r8.requestFeature(r0)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r8.setBackgroundDrawableResource(r0)
            androidx.compose.ui.window.DialogProperties r0 = r6.D
            boolean r0 = r0.a()
            androidx.core.view.WindowCompat.b(r8, r0)
            r0 = 17
            r8.setGravity(r0)
            androidx.compose.ui.window.DialogLayout r0 = new androidx.compose.ui.window.DialogLayout
            android.content.Context r1 = r6.getContext()
            r0.<init>(r1, r8)
            int r1 = androidx.compose.ui.R.id.H
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Dialog:"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r0.setTag(r1, r12)
            r0.setClipChildren(r2)
            float r7 = r11.B1(r7)
            r0.setElevation(r7)
            androidx.compose.ui.window.DialogWrapper$1$2 r7 = new androidx.compose.ui.window.DialogWrapper$1$2
            r7.<init>()
            r0.setOutlineProvider(r7)
            r6.F = r0
            android.view.View r7 = r8.getDecorView()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x0085
            r3 = r7
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x0085:
            if (r3 == 0) goto L_0x008a
            g(r3)
        L_0x008a:
            r6.setContentView((android.view.View) r0)
            androidx.lifecycle.LifecycleOwner r7 = androidx.lifecycle.ViewTreeLifecycleOwner.a(r9)
            androidx.lifecycle.ViewTreeLifecycleOwner.b(r0, r7)
            androidx.lifecycle.ViewModelStoreOwner r7 = androidx.lifecycle.ViewTreeViewModelStoreOwner.a(r9)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.b(r0, r7)
            androidx.savedstate.SavedStateRegistryOwner r7 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.a(r9)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.b(r0, r7)
            kotlin.jvm.functions.Function0 r7 = r6.C
            androidx.compose.ui.window.DialogProperties r8 = r6.D
            r6.p(r7, r8, r10)
            androidx.activity.OnBackPressedDispatcher r0 = r6.c()
            androidx.compose.ui.window.DialogWrapper$2 r3 = new androidx.compose.ui.window.DialogWrapper$2
            r3.<init>(r6)
            r4 = 2
            r5 = 0
            r2 = 0
            r1 = r6
            androidx.activity.OnBackPressedDispatcherKt.b(r0, r1, r2, r3, r4, r5)
            return
        L_0x00ba:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Dialog has no window"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.DialogWrapper.<init>(kotlin.jvm.functions.Function0, androidx.compose.ui.window.DialogProperties, android.view.View, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, java.util.UUID):void");
    }

    public static final void g(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof DialogLayout)) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                if (viewGroup2 != null) {
                    g(viewGroup2);
                }
            }
        }
    }

    private final void n(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.F;
        int i2 = WhenMappings.f19325a[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i3);
    }

    private final void o(SecureFlagPolicy secureFlagPolicy) {
        boolean a2 = SecureFlagPolicy_androidKt.a(secureFlagPolicy, AndroidPopup_androidKt.k(this.E));
        Window window = getWindow();
        Intrinsics.f(window);
        window.setFlags(a2 ? 8192 : -8193, 8192);
    }

    public void cancel() {
    }

    public final void l() {
        this.F.f();
    }

    public final void m(CompositionContext compositionContext, Function2 function2) {
        this.F.o(compositionContext, function2);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (!this.D.b() || !keyEvent.isTracking() || keyEvent.isCanceled() || i2 != 111) {
            return super.onKeyUp(i2, keyEvent);
        }
        this.C.invoke();
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.D.c() || this.F.n(motionEvent)) {
            return onTouchEvent;
        }
        this.C.invoke();
        return true;
    }

    public final void p(Function0 function0, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        this.C = function0;
        this.D = dialogProperties;
        o(dialogProperties.d());
        n(layoutDirection);
        boolean a2 = dialogProperties.a();
        this.F.p(dialogProperties.e(), a2);
        setCanceledOnTouchOutside(dialogProperties.c());
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(a2 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }
}
