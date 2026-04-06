package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import com.hansecom.abt.ui.components.emptyView.EmptyViewKt;
import com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt;
import com.hansecom.abt.ui.theme.Dimensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CardHistoryScreenKt$Content$3$1$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CardHistory.State f36387z;

    public CardHistoryScreenKt$Content$3$1$1$1(CardHistory.State state) {
        this.f36387z = state;
    }

    public final void b(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(967582632, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardHistoryScreen.kt:96)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            SpacerKt.a(SizeKt.i(companion, Dimensions.f38856a.d()), composer2, 6);
            ScreenHeaderKt.b((Modifier) null, (PaddingValues) null, 0, 0, this.f36387z.d(), (CharSequence) null, false, composer, 0, 111);
            if (this.f36387z.e().isEmpty()) {
                SpacerKt.a(SizeKt.i(companion, Dp.m((float) 80)), composer2, 6);
                EmptyViewKt.b(SizeKt.h(companion, 0.0f, 1, (Object) null), Integer.valueOf(R.drawable.J), StringResources_androidKt.b(R.string.r1, composer2, 0), StringResources_androidKt.b(R.string.q1, composer2, 0), (String) null, (String) null, (Integer) null, (Function0) null, false, composer, 6, 496);
            }
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
