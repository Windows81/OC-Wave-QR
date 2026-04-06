package androidx.compose.material3;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.activity.BackEventCompat;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.animation.core.Animatable;
import androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class ModalBottomSheetDialogWrapper extends ComponentDialog implements ViewRootForInspector {
    public Function0 C;
    public ModalBottomSheetProperties D;
    public long E;
    public final View F;
    public final ModalBottomSheetDialogLayout G;
    public final float H;

    @Metadata
    public static final class PredictiveBackOnBackPressedCallback extends OnBackPressedCallback {

        /* renamed from: d  reason: collision with root package name */
        public final CoroutineScope f10313d;

        /* renamed from: e  reason: collision with root package name */
        public final Animatable f10314e;

        /* renamed from: f  reason: collision with root package name */
        public Function0 f10315f;

        public PredictiveBackOnBackPressedCallback(boolean z2, CoroutineScope coroutineScope, Animatable animatable, Function0 function0) {
            super(z2);
            this.f10313d = coroutineScope;
            this.f10314e = animatable;
            this.f10315f = function0;
        }

        public void c() {
            Job unused = BuildersKt__Builders_commonKt.d(this.f10313d, (CoroutineContext) null, (CoroutineStart) null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1(this, (Continuation) null), 3, (Object) null);
        }

        public void d() {
            this.f10315f.invoke();
        }

        public void e(BackEventCompat backEventCompat) {
            Job unused = BuildersKt__Builders_commonKt.d(this.f10313d, (CoroutineContext) null, (CoroutineStart) null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackProgressed$1(this, backEventCompat, (Continuation) null), 3, (Object) null);
        }

        public void f(BackEventCompat backEventCompat) {
            Job unused = BuildersKt__Builders_commonKt.d(this.f10313d, (CoroutineContext) null, (CoroutineStart) null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1(this, backEventCompat, (Continuation) null), 3, (Object) null);
        }

        public final Animatable l() {
            return this.f10314e;
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10316a;

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
                f10316a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetDialogWrapper.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ ModalBottomSheetDialogWrapper(Function0 function0, ModalBottomSheetProperties modalBottomSheetProperties, long j2, View view, LayoutDirection layoutDirection, Density density, UUID uuid, Animatable animatable, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, modalBottomSheetProperties, j2, view, layoutDirection, density, uuid, animatable, coroutineScope);
    }

    public static final Unit j(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper) {
        modalBottomSheetDialogWrapper.C.invoke();
        return Unit.f40552a;
    }

    private final void m(LayoutDirection layoutDirection) {
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = this.G;
        int i2 = WhenMappings.f10316a[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        modalBottomSheetDialogLayout.setLayoutDirection(i3);
    }

    public void cancel() {
    }

    public final void k() {
        this.G.f();
    }

    public final void l(CompositionContext compositionContext, Function2 function2) {
        this.G.n(compositionContext, function2);
    }

    public final void n(SecureFlagPolicy secureFlagPolicy) {
        boolean g2 = BasicEdgeToEdgeDialog_androidKt.g(secureFlagPolicy, ModalBottomSheet_androidKt.m(this.F));
        Window window = getWindow();
        Intrinsics.f(window);
        window.setFlags(g2 ? 8192 : -8193, 8192);
    }

    public final void o(Function0 function0, ModalBottomSheetProperties modalBottomSheetProperties, long j2, LayoutDirection layoutDirection) {
        this.C = function0;
        this.D = modalBottomSheetProperties;
        this.E = j2;
        n(modalBottomSheetProperties.a());
        m(layoutDirection);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.C.invoke();
        }
        return onTouchEvent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetDialogWrapper(Function0 function0, ModalBottomSheetProperties modalBottomSheetProperties, long j2, View view, LayoutDirection layoutDirection, Density density, UUID uuid, Animatable animatable, CoroutineScope coroutineScope) {
        super(new ContextThemeWrapper(view.getContext(), R.style.f10680a), 0, 2, (DefaultConstructorMarker) null);
        this.C = function0;
        this.D = modalBottomSheetProperties;
        this.E = j2;
        this.F = view;
        float m2 = Dp.m((float) 8);
        this.H = m2;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            WindowCompat.b(window, false);
            ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(getContext(), window);
            int i2 = R.id.H;
            modalBottomSheetDialogLayout.setTag(i2, "Dialog:" + uuid);
            modalBottomSheetDialogLayout.setClipChildren(false);
            modalBottomSheetDialogLayout.setElevation(density.B1(m2));
            modalBottomSheetDialogLayout.setOutlineProvider(new ModalBottomSheetDialogWrapper$1$2());
            this.G = modalBottomSheetDialogLayout;
            setContentView((View) modalBottomSheetDialogLayout);
            ViewTreeLifecycleOwner.b(modalBottomSheetDialogLayout, ViewTreeLifecycleOwner.a(view));
            ViewTreeViewModelStoreOwner.b(modalBottomSheetDialogLayout, ViewTreeViewModelStoreOwner.a(view));
            ViewTreeSavedStateRegistryOwner.b(modalBottomSheetDialogLayout, ViewTreeSavedStateRegistryOwner.a(view));
            o(this.C, this.D, this.E, layoutDirection);
            WindowInsetsControllerCompat a2 = WindowCompat.a(window, window.getDecorView());
            Boolean d2 = this.D.d();
            a2.c(d2 != null ? d2.booleanValue() : ModalBottomSheet_androidKt.l(this.E));
            Boolean c2 = this.D.c();
            a2.b(c2 != null ? c2.booleanValue() : ModalBottomSheet_androidKt.l(this.E));
            c().i(this, new PredictiveBackOnBackPressedCallback(this.D.b(), coroutineScope, animatable, new C0256u3(this)));
            return;
        }
        throw new IllegalStateException("Dialog has no window");
    }
}
