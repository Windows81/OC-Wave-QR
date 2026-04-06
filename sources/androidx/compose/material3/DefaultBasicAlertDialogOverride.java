package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class DefaultBasicAlertDialogOverride implements BasicAlertDialogOverride {

    /* renamed from: a  reason: collision with root package name */
    public static final DefaultBasicAlertDialogOverride f9823a = new DefaultBasicAlertDialogOverride();

    public static final Unit c(DefaultBasicAlertDialogOverride defaultBasicAlertDialogOverride, BasicAlertDialogOverrideScope basicAlertDialogOverrideScope, int i2, Composer composer, int i3) {
        defaultBasicAlertDialogOverride.a(basicAlertDialogOverrideScope, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public void a(BasicAlertDialogOverrideScope basicAlertDialogOverrideScope, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(1565826668);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(basicAlertDialogOverrideScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1565826668, i3, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog (AlertDialog.kt:163)");
            }
            AndroidDialog_androidKt.a(basicAlertDialogOverrideScope.c(), basicAlertDialogOverrideScope.d(), ComposableLambdaKt.e(1163527043, true, new DefaultBasicAlertDialogOverride$BasicAlertDialog$1(basicAlertDialogOverrideScope), q2, 54), q2, 384, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0075d2(this, basicAlertDialogOverrideScope, i2));
        }
    }
}
