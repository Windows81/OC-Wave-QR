package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class PaymentMethodItemKt {
    public static final void b(Composer composer, int i2) {
        Composer q2 = composer.q(405004216);
        if (i2 != 0 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(405004216, i2, -1, "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodDefaultEndIcon (PaymentMethodItem.kt:282)");
            }
            IconKt.d(PainterResources_androidKt.c(R.drawable.f33014p, q2, 0), (String) null, SizeKt.t(Modifier.f15489d, Dp.m((float) 24)), AbtTheme.f38851a.b(q2, 6).x(), q2, 432, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new t(i2));
        }
    }

    public static final Unit c(int i2, Composer composer, int i3) {
        b(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
