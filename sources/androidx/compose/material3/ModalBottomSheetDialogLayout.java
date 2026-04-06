package androidx.compose.material3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.DialogWindowProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class ModalBottomSheetDialogLayout extends AbstractComposeView implements DialogWindowProvider {
    public final Window H;
    public final MutableState I = SnapshotStateKt__SnapshotStateKt.e(ComposableSingletons$ModalBottomSheet_androidKt.f9563a.a(), (SnapshotMutationPolicy) null, 2, (Object) null);
    public boolean J;

    public ModalBottomSheetDialogLayout(Context context, Window window) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.H = window;
    }

    private final Function2 getContent() {
        return (Function2) this.I.getValue();
    }

    public static final Unit m(ModalBottomSheetDialogLayout modalBottomSheetDialogLayout, int i2, Composer composer, int i3) {
        modalBottomSheetDialogLayout.b(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    private final void setContent(Function2 function2) {
        this.I.setValue(function2);
    }

    public void b(Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(576708319);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(576708319, i3, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:437)");
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
            x2.a(new C0247t3(this, i2));
        }
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.J;
    }

    public final void n(CompositionContext compositionContext, Function2 function2) {
        setParentCompositionContext(compositionContext);
        setContent(function2);
        this.J = true;
        e();
    }
}
