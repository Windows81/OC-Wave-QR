package com.hansecom.abt.ui.components.passCard;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition;
import com.hansecom.abt.ui.components.abtButton.AbtButtonKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GroupPassOfferCardKt$GroupPassOfferCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38611A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38612B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ String D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f38613z;

    public GroupPassOfferCardKt$GroupPassOfferCard$1(PassOfferCardState passOfferCardState, Function0 function0, Function0 function02, Function0 function03, String str) {
        this.f38613z = passOfferCardState;
        this.f38611A = function0;
        this.f38612B = function02;
        this.C = function03;
        this.D = str;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(columnScope, "$this$PassContainer");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1369243009, i3, -1, "com.hansecom.abt.ui.components.passCard.GroupPassOfferCard.<anonymous> (GroupPassOfferCard.kt:47)");
            }
            PassOfferCardKt.k(this.f38613z.h(), this.f38613z.j(), this.f38613z.l(), composer2, 0);
            Modifier.Companion companion = Modifier.f15489d;
            float f2 = (float) 16;
            SpacerKt.a(SizeKt.i(companion, Dp.m(f2)), composer2, 6);
            PassOfferCardKt.g(this.f38613z.c(), this.f38613z.k(), composer2, 0);
            DividerKt.e(PaddingKt.k(companion, 0.0f, Dp.m(f2), 1, (Object) null), 0.0f, AbtTheme.f38851a.b(composer2, 6).u(), composer, 6, 2);
            GroupPassOfferCardKt.i(this.f38613z, this.f38611A, this.f38612B, composer2, 0);
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 24)), composer2, 6);
            AbtButtonKt.j(this.C, TestTagKt.a(SizeKt.h(companion, 0.0f, 1, (Object) null), "group_pass_offer_add_button"), AbtButtonStyle.f37880f.a(composer2, 6).e(composer2, 0), (AbtButtonState) null, this.D, (Integer) null, (AbtButtonIconPosition) null, composer, 48, 104);
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
