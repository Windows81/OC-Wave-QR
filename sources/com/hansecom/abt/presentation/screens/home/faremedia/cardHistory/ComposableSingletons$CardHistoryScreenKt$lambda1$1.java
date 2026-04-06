package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.ComposableSingletons$CardHistoryScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$CardHistoryScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$CardHistoryScreenKt$lambda1$1 f36408z = new ComposableSingletons$CardHistoryScreenKt$lambda1$1();

    public static final Unit e(CardHistory.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(459851037, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.ComposableSingletons$CardHistoryScreenKt.lambda-1.<anonymous> (CardHistoryScreen.kt:124)");
            }
            CardHistory.State state = new CardHistory.State("Card", false, 0, false, (PersistentList) null, 30, (DefaultConstructorMarker) null);
            composer.X(-931458600);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new k();
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
