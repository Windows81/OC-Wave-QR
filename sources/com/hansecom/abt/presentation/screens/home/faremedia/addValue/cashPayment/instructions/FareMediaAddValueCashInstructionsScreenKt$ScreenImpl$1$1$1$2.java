package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
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
public final class FareMediaAddValueCashInstructionsScreenKt$ScreenImpl$1$1$1$2 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f36175z;

    public FareMediaAddValueCashInstructionsScreenKt$ScreenImpl$1$1$1$2(Function0 function0) {
        this.f36175z = function0;
    }

    public final void b(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-416422174, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.ScreenImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FareMediaAddValueCashInstructionsScreen.kt:87)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 48)), composer, 6);
            String b2 = StringResources_androidKt.b(R.string.j0, composer, 0);
            int i3 = R.drawable.f33008j;
            AbtButtonKt.j(this.f36175z, SizeKt.h(companion, 0.0f, 1, (Object) null), (AbtButtonStyle) null, (AbtButtonState) null, b2, Integer.valueOf(i3), (AbtButtonIconPosition) null, composer, 48, 76);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
