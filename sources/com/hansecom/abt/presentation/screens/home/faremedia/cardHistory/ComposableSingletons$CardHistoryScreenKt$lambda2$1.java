package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import com.hansecom.abt.ui.SampleStates;
import com.hansecom.abt.ui.components.historyItem.HistorySectionState;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.ComposableSingletons$CardHistoryScreenKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$CardHistoryScreenKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$CardHistoryScreenKt$lambda2$1 f36409z = new ComposableSingletons$CardHistoryScreenKt$lambda2$1();

    /* access modifiers changed from: private */
    public static final Unit e(CardHistory.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(478098775, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.ComposableSingletons$CardHistoryScreenKt.lambda-2.<anonymous> (CardHistoryScreen.kt:136)");
            }
            LocalDate of = LocalDate.of(2025, 11, 1);
            Intrinsics.h(of, "of(...)");
            SampleStates sampleStates = SampleStates.f37859a;
            HistorySectionState historySectionState = new HistorySectionState(of, ExtensionsKt.b(sampleStates.h(), sampleStates.h()));
            LocalDate of2 = LocalDate.of(2025, 12, 15);
            Intrinsics.h(of2, "of(...)");
            CardHistory.State state = new CardHistory.State("card", false, 0, false, ExtensionsKt.b(historySectionState, new HistorySectionState(of2, ExtensionsKt.b(sampleStates.h()))), 14, (DefaultConstructorMarker) null);
            composer.X(576121177);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new l();
                composer.N(g2);
            }
            composer.M();
            CardHistoryScreenKt.k(state, (Function1) g2, FlowKt.A(), composer, 48, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
