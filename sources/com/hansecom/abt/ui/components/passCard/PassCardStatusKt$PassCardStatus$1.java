package com.hansecom.abt.ui.components.passCard;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PassCardStatusKt$PassCardStatus$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38626A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassCardState f38627z;

    public PassCardStatusKt$PassCardStatus$1(PassCardState passCardState, Function1 function1) {
        this.f38627z = passCardState;
        this.f38626A = function1;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(columnScope, "$this$PassContainer");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1244189979, i3, -1, "com.hansecom.abt.ui.components.passCard.PassCardStatus.<anonymous> (PassCardStatus.kt:47)");
            }
            PassCardStatusKt.i(this.f38627z, composer2, 0);
            Modifier.Companion companion = Modifier.f15489d;
            float f2 = (float) 16;
            SpacerKt.a(SizeKt.i(companion, Dp.m(f2)), composer2, 6);
            AbtTheme abtTheme = AbtTheme.f38851a;
            DividerKt.e((Modifier) null, 0.0f, abtTheme.b(composer2, 6).u(), composer, 0, 3);
            composer2.X(-1598091936);
            if (this.f38627z.e()) {
                PassCardStatusKt.f(PaddingKt.k(companion, 0.0f, Dp.m((float) 8), 1, (Object) null), this.f38627z.j(), this.f38626A, composer2, 6);
                DividerKt.e((Modifier) null, 0.0f, abtTheme.b(composer2, 6).u(), composer, 0, 3);
            }
            composer.M();
            SpacerKt.a(SizeKt.i(companion, Dp.m(f2)), composer2, 6);
            TextKt.j(PassCardStatusKt.r(this.f38627z, composer2, 0), (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).d(), composer, 0, 0, 131070);
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
