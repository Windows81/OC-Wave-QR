package com.hansecom.abt.ui.components.passCard;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class PassCardStatusKt$CardTitle$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RowScope f38625z;

    public PassCardStatusKt$CardTitle$1$1(RowScope rowScope) {
        this.f38625z = rowScope;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1595391995, i2, -1, "com.hansecom.abt.ui.components.passCard.CardTitle.<anonymous>.<anonymous> (PassCardStatus.kt:74)");
            }
            IconKt.d(PainterResources_androidKt.c(R.drawable.O, composer, 0), (String) null, this.f38625z.d(PaddingKt.i(Modifier.f15489d, Dp.m((float) 8)), Alignment.f15444a.i()), 0, composer, 48, 8);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
