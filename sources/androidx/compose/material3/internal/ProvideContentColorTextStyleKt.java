package androidx.compose.material3.internal;

import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ProvideContentColorTextStyleKt {
    public static final void b(long j2, TextStyle textStyle, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-684938728);
        if ((i2 & 6) == 0) {
            i3 = (q2.j(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(textStyle) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function2) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-684938728, i3, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(j2)), TextKt.q().d(((TextStyle) q2.C(TextKt.q())).J(textStyle))}, function2, q2, ((i3 >> 3) & 112) | ProvidedValue.f14769i);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new S(j2, textStyle, function2, i2));
        }
    }

    public static final Unit c(long j2, TextStyle textStyle, Function2 function2, int i2, Composer composer, int i3) {
        b(j2, textStyle, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
