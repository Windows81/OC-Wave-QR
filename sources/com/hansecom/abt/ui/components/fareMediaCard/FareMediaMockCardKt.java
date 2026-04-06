package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class FareMediaMockCardKt {
    public static final void b(Modifier modifier, boolean z2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(732518571);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.d(z2) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !q2.t()) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (i6 != 0) {
                z2 = false;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(732518571, i4, -1, "com.hansecom.abt.ui.components.fareMediaCard.FareMediaMockCard (FareMediaMockCard.kt:21)");
            }
            FareMediaCardBaseKt.c(modifier, (Function0) null, ComposableLambdaKt.e(1351920369, true, new FareMediaMockCardKt$FareMediaMockCard$1(z2 ? R.drawable.j0 : R.drawable.i0), q2, 54), q2, (i4 & 14) | 384, 2);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new e(modifier, z2, i2, i3));
        }
    }

    public static final Unit c(Modifier modifier, boolean z2, int i2, int i3, Composer composer, int i4) {
        b(modifier, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
