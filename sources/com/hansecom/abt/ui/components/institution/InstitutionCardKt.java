package com.hansecom.abt.ui.components.institution;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InstitutionCardKt {
    public static final void b(Modifier modifier, InstitutionState institutionState, Function0 function0, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        Composer composer2;
        Modifier.Companion companion;
        InstitutionState institutionState2 = institutionState;
        Function0 function02 = function0;
        int i5 = i2;
        Intrinsics.i(institutionState2, "state");
        Intrinsics.i(function02, "onClick");
        Composer q2 = composer.q(-1114856072);
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
            i4 |= q2.l(function02) ? 256 : 128;
        }
        if ((i4 & 147) != 146 || !q2.t()) {
            companion = i6 != 0 ? Modifier.f15489d : modifier2;
            if (ComposerKt.P()) {
                ComposerKt.Y(-1114856072, i4, -1, "com.hansecom.abt.ui.components.institution.InstitutionCard (InstitutionCard.kt:31)");
            }
            RoundedCornerShape d2 = RoundedCornerShapeKt.d(Dp.m((float) 8));
            CardColors a2 = CardDefaults.f9356a.a(q2, CardDefaults.f9357b);
            AbtTheme abtTheme = AbtTheme.f38851a;
            composer2 = q2;
            CardKt.d(function0, companion, false, d2, CardColors.d(a2, abtTheme.b(q2, 6).A(), abtTheme.b(q2, 6).q(), 0, 0, 12, (Object) null), (CardElevation) null, (BorderStroke) null, (MutableInteractionSource) null, ComposableLambdaKt.e(-1381000915, true, new InstitutionCardKt$InstitutionCard$1(institutionState2), q2, 54), q2, ((i4 >> 6) & 14) | 100663296 | ((i4 << 3) & 112), 228);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            companion = modifier2;
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new b(companion, institutionState, function0, i2, i3));
        }
    }

    public static final Unit c(Modifier modifier, InstitutionState institutionState, Function0 function0, int i2, int i3, Composer composer, int i4) {
        b(modifier, institutionState, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
