package com.hansecom.abt.ui.components.passCard;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PassOfferCardKt$PassOfferCardSmall$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f38632z;

    public PassOfferCardKt$PassOfferCardSmall$1(PassOfferCardState passOfferCardState) {
        this.f38632z = passOfferCardState;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Intrinsics.i(columnScope, "$this$PassContainer");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(824084241, i2, -1, "com.hansecom.abt.ui.components.passCard.PassOfferCardSmall.<anonymous> (PassOfferCard.kt:70)");
            }
            PassOfferCardKt.k(this.f38632z.h(), this.f38632z.j(), this.f38632z.l(), composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
