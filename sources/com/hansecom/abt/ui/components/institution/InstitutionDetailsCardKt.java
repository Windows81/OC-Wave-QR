package com.hansecom.abt.ui.components.institution;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.presentation.model.InstitutionState;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InstitutionDetailsCardKt {
    public static final void b(Modifier modifier, InstitutionState institutionState, boolean z2, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        Modifier.Companion companion;
        InstitutionState institutionState2 = institutionState;
        boolean z3 = z2;
        int i5 = i2;
        Intrinsics.i(institutionState2, "state");
        Composer q2 = composer.q(2125524086);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i4 = (q2.W(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i4 = i5;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i5 & 48) == 0) {
            i4 |= q2.W(institutionState2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i5 & 384) == 0) {
            i4 |= q2.d(z3) ? 256 : 128;
        }
        int i7 = i4;
        if ((i7 & 147) != 146 || !q2.t()) {
            companion = i6 != 0 ? Modifier.f15489d : modifier2;
            if (ComposerKt.P()) {
                ComposerKt.Y(2125524086, i7, -1, "com.hansecom.abt.ui.components.institution.InstitutionDetailsCard (InstitutionDetailsCard.kt:28)");
            }
            CardDefaults cardDefaults = CardDefaults.f9356a;
            float m2 = Dp.m((float) 1);
            int i8 = CardDefaults.f9357b;
            CardElevation c2 = cardDefaults.c(m2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, q2, (i8 << 18) | 6, 62);
            RoundedCornerShape d2 = RoundedCornerShapeKt.d(Dp.m((float) 8));
            CardColors a2 = cardDefaults.a(q2, i8);
            AbtTheme abtTheme = AbtTheme.f38851a;
            CardKt.c(companion, d2, CardColors.d(a2, abtTheme.b(q2, 6).A(), abtTheme.b(q2, 6).q(), 0, 0, 12, (Object) null), c2, (BorderStroke) null, ComposableLambdaKt.e(-338233752, true, new InstitutionDetailsCardKt$InstitutionDetailsCard$1(institutionState2, z3), q2, 54), q2, (i7 & 14) | 196608, 16);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            companion = modifier2;
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new c(companion, institutionState, z2, i2, i3));
        }
    }

    public static final Unit c(Modifier modifier, InstitutionState institutionState, boolean z2, int i2, int i3, Composer composer, int i4) {
        b(modifier, institutionState, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
