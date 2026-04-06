package com.hansecom.abt.ui.components.passCard;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.passCard.ComposableSingletons$GroupPassOfferCardKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$GroupPassOfferCardKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$GroupPassOfferCardKt$lambda2$1 f38591z = new ComposableSingletons$GroupPassOfferCardKt$lambda2$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1082304340, i2, -1, "com.hansecom.abt.ui.components.passCard.ComposableSingletons$GroupPassOfferCardKt.lambda-2.<anonymous> (GroupPassOfferCard.kt:133)");
            }
            IconKt.d(PainterResources_androidKt.c(R.drawable.Q, composer, 0), (String) null, SizeKt.t(Modifier.f15489d, Dp.m((float) 24)), 0, composer, 432, 8);
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
