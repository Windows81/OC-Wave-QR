package com.hansecom.abt.ui.components.passCard;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition;
import com.hansecom.abt.ui.components.abtButton.AbtButtonKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PassOfferCardKt$PassOfferCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38629A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f38630B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f38631z;

    public PassOfferCardKt$PassOfferCard$1(PassOfferCardState passOfferCardState, Function0 function0, String str) {
        this.f38631z = passOfferCardState;
        this.f38629A = function0;
        this.f38630B = str;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Intrinsics.i(columnScope, "$this$PassContainer");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-867004359, i2, -1, "com.hansecom.abt.ui.components.passCard.PassOfferCard.<anonymous> (PassOfferCard.kt:42)");
            }
            PassOfferCardKt.k(this.f38631z.h(), this.f38631z.j(), this.f38631z.l(), composer, 0);
            Modifier.Companion companion = Modifier.f15489d;
            float f2 = (float) 16;
            SpacerKt.a(SizeKt.i(companion, Dp.m(f2)), composer, 6);
            PassOfferCardKt.g(this.f38631z.c(), this.f38631z.k(), composer, 0);
            SpacerKt.a(SizeKt.i(companion, Dp.m(f2)), composer, 6);
            AbtButtonKt.j(this.f38629A, TestTagKt.a(SizeKt.h(companion, 0.0f, 1, (Object) null), "pass_offer_add_button"), AbtButtonStyle.f37880f.a(composer, 6).e(composer, 0), (AbtButtonState) null, this.f38630B, (Integer) null, (AbtButtonIconPosition) null, composer, 48, 104);
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
