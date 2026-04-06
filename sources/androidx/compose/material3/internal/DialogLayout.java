package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.DialogWindowProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider {
    public final MutableState H;
    public boolean I;

    private final Function2 getContent() {
        return (Function2) this.H.getValue();
    }

    public static final Unit m(DialogLayout dialogLayout, int i2, Composer composer, int i3) {
        dialogLayout.b(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public void b(Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-2017021053);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2017021053, i3, -1, "androidx.compose.material3.internal.DialogLayout.Content (BasicEdgeToEdgeDialog.android.kt:329)");
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
            x2.a(new K(this, i2));
        }
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.I;
    }
}
