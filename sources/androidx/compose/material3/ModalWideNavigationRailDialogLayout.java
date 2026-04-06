package androidx.compose.material3;

import android.os.Build;
import android.view.View;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.DialogWindowProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
final class ModalWideNavigationRailDialogLayout extends AbstractComposeView implements DialogWindowProvider {
    public final boolean H;
    public final Function0 I;
    public final Function1 J;
    public final Function0 K;
    public final RailPredictiveBackState L;
    public final LayoutDirection M;
    public final MutableState N;
    public Object O;
    public boolean P;

    @Metadata
    public static final class Api33Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Api33Impl f10343a = new Api33Impl();

        @JvmStatic
        public static final OnBackInvokedCallback b(Function0<Unit> function0) {
            return new C0057b4(function0);
        }

        public static final void c(Function0 function0) {
            function0.invoke();
        }

        @JvmStatic
        public static final void d(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
            }
        }

        @JvmStatic
        public static final void e(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
            }
        }
    }

    @Metadata
    public static final class Api34Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Api34Impl f10344a = new Api34Impl();

        @JvmStatic
        public static final OnBackAnimationCallback a(Function0<Unit> function0, Function1<? super Float, Unit> function1, Function0<Unit> function02, RailPredictiveBackState railPredictiveBackState, LayoutDirection layoutDirection) {
            return new ModalWideNavigationRailDialogLayout$Api34Impl$createBackCallback$1(railPredictiveBackState, layoutDirection, function1, function0, function02);
        }
    }

    private final Function2 getContent() {
        return (Function2) this.N.getValue();
    }

    public static final Unit m(ModalWideNavigationRailDialogLayout modalWideNavigationRailDialogLayout, int i2, Composer composer, int i3) {
        modalWideNavigationRailDialogLayout.b(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    private final void n() {
        int i2;
        if (this.H && (i2 = Build.VERSION.SDK_INT) >= 33) {
            if (this.O == null) {
                this.O = i2 >= 34 ? Api34Impl.a(this.I, this.J, this.K, this.L, this.M) : Api33Impl.b(this.I);
            }
            Api33Impl.d(this, this.O);
        }
    }

    private final void o() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.e(this, this.O);
        }
        this.O = null;
    }

    public void b(Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-640057148);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-640057148, i3, -1, "androidx.compose.material3.ModalWideNavigationRailDialogLayout.Content (WideNavigationRail.android.kt:202)");
            }
            getContent().m(q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0047a4(this, i2));
        }
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.P;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }
}
