package com.hansecom.abt.presentation.screens.main.update;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class HardUpdateScreenKt {
    public static final void b(Composer composer, int i2) {
        Composer q2 = composer.q(-838154931);
        if (i2 != 0 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-838154931, i2, -1, "com.hansecom.abt.presentation.screens.main.update.HardUpdateScreen (HardUpdateScreen.kt:34)");
            }
            AbtTheme abtTheme = AbtTheme.f38851a;
            long o2 = abtTheme.b(q2, 6).o();
            SurfaceKt.c(SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null), (Shape) null, abtTheme.b(q2, 6).x(), o2, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$HardUpdateScreenKt.f37709a.a(), q2, 12582918, 114);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new b(i2));
        }
    }

    public static final Unit c(int i2, Composer composer, int i3) {
        b(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
