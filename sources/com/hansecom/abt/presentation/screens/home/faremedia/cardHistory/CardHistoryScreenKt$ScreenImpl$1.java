package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import com.hansecom.abt.ui.components.loading.LoadingContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class CardHistoryScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36388A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CardHistory.State f36389z;

    public CardHistoryScreenKt$ScreenImpl$1(CardHistory.State state, Function1 function1) {
        this.f36389z = state;
        this.f36388A = function1;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1678073035, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.ScreenImpl.<anonymous> (CardHistoryScreen.kt:60)");
            }
            if (this.f36389z.e() == null) {
                composer.X(1835770583);
                LoadingContentKt.b(composer, 0);
                composer.M();
            } else {
                composer.X(1835816401);
                CardHistoryScreenKt.h(this.f36389z, this.f36388A, composer, 0);
                composer.M();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
