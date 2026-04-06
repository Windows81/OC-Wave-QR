package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.components.historyItem.HistorySectionKt;
import com.hansecom.abt.ui.components.historyItem.HistorySectionState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CardHistoryScreenKt$Content$3$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f36381z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardHistoryScreenKt$Content$3$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3(List list) {
        super(4);
        this.f36381z = list;
    }

    public final void b(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
        int i4;
        if ((i3 & 6) == 0) {
            i4 = (composer.W(lazyItemScope) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composer.i(i2) ? 32 : 16;
        }
        if (composer.E((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            composer.X(-1962764434);
            Modifier.Companion companion = Modifier.f15489d;
            HistorySectionKt.b(SizeKt.h(companion, 0.0f, 1, (Object) null), (HistorySectionState) this.f36381z.get(i2), composer, 6);
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 32)), composer, 6);
            composer.M();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
