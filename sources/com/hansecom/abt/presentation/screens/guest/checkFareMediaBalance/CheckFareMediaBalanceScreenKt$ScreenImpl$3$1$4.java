package com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance;
import com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardKt;
import com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardTransferStyle;
import com.hansecom.abt.util.formatters.CurrencyValueFormater;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CheckFareMediaBalanceScreenKt$ScreenImpl$3$1$4 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CheckFareMediaBalance.State f34723z;

    public CheckFareMediaBalanceScreenKt$ScreenImpl$3$1$4(CheckFareMediaBalance.State state) {
        this.f34723z = state;
    }

    public final void b(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        Intrinsics.i(animatedVisibilityScope, "$this$AnimatedVisibility");
        if (ComposerKt.P()) {
            ComposerKt.Y(93070820, i2, -1, "com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.ScreenImpl.<anonymous>.<anonymous>.<anonymous> (CheckFareMediaBalanceScreen.kt:136)");
        }
        if (this.f34723z.f().length() > 0) {
            FareMediaCardKt.e(CurrencyValueFormater.d(CurrencyValueFormater.f39045a, this.f34723z.f(), false, 2, (Object) null), this.f34723z.g(), "", StringValue.Companion.a(), false, false, false, SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), 0, (StringValue) null, (FareMediaCardTransferStyle) null, composer, 14380416, 0, 1792);
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
