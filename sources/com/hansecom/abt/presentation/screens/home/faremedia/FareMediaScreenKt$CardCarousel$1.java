package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.model.TransferTimeState;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardKt;
import com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardTransferStyle;
import com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardTransferStyles;
import com.hansecom.abt.ui.components.fareMediaCard.FareMediaTransferCardKt;
import com.hansecom.abt.util.formatters.CurrencyValueFormater;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class FareMediaScreenKt$CardCarousel$1 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FareMedia.State f35953A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerState f35954z;

    public FareMediaScreenKt$CardCarousel$1(PagerState pagerState, FareMedia.State state) {
        this.f35954z = pagerState;
        this.f35953A = state;
    }

    public static final Unit e(PagerState pagerState, int i2, GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.i(graphicsLayerScope, "$this$graphicsLayer");
        float abs = Math.abs(((float) (pagerState.v() - i2)) + pagerState.w());
        graphicsLayerScope.d(MathHelpersKt.b(0.66f, 1.0f, 1.0f - RangesKt.n(abs, 0.0f, 1.0f)));
        float b2 = MathHelpersKt.b(0.875f, 1.0f, 1.0f - RangesKt.n(abs, 0.0f, 1.0f));
        graphicsLayerScope.j(b2);
        graphicsLayerScope.i(b2);
        return Unit.f40552a;
    }

    public final void c(PagerScope pagerScope, int i2, Composer composer, int i3) {
        FareMediaCardTransferStyle a2;
        int i4 = i2;
        Composer composer2 = composer;
        int i5 = i3;
        Intrinsics.i(pagerScope, "$this$HorizontalPager");
        if (ComposerKt.P()) {
            ComposerKt.Y(-2142357001, i5, -1, "com.hansecom.abt.presentation.screens.home.faremedia.CardCarousel.<anonymous> (FareMediaScreen.kt:716)");
        }
        Modifier h2 = SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null);
        composer2.X(-860412286);
        boolean W = ((((i5 & 112) ^ 48) > 32 && composer2.i(i4)) || (i5 & 48) == 32) | composer2.W(this.f35954z);
        PagerState pagerState = this.f35954z;
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new X(pagerState, i4);
            composer2.N(g2);
        }
        composer.M();
        Modifier a3 = GraphicsLayerModifierKt.a(h2, (Function1) g2);
        FareMedia.State.CardItem cardItem = (FareMedia.State.CardItem) this.f35953A.f().get(i4);
        if (cardItem instanceof FareMedia.State.CardItem.Card) {
            composer2.X(-902282812);
            FareMedia.State.CardItem.Card card = (FareMedia.State.CardItem.Card) cardItem;
            Modifier a4 = TestTagKt.a(a3, card.o() ? "card_virtual" : "card_physical");
            String d2 = CurrencyValueFormater.d(CurrencyValueFormater.f39045a, card.d(), false, 2, (Object) null);
            String f2 = card.f();
            StringValue c2 = card.c();
            String k2 = card.k();
            boolean o2 = card.o();
            boolean n2 = card.n();
            boolean h3 = card.h();
            long g3 = card.g();
            composer2.X(-860365232);
            TransferTimeState l2 = card.l();
            StringValue d3 = (l2 == null || !l2.b()) ? null : StringValueKt.d(StringResources_androidKt.a(R.plurals.f33034a, card.l().a(), new Object[]{Integer.valueOf(card.l().a())}, composer2, 0));
            composer.M();
            TransferTimeState l3 = card.l();
            if (l3 == null || !l3.c()) {
                composer2.X(-900955175);
                a2 = FareMediaCardTransferStyles.f38210a.a(composer2, 6);
                composer.M();
            } else {
                composer2.X(-901035558);
                a2 = FareMediaCardTransferStyles.f38210a.b(composer2, 6);
                composer.M();
            }
            Composer composer3 = composer2;
            FareMediaCardKt.e(d2, f2, k2, c2, o2, n2, h3, a4, g3, d3, a2, composer, 0, 0, 0);
            composer.M();
        } else {
            Composer composer4 = composer2;
            if (Intrinsics.d(cardItem, FareMedia.State.CardItem.CardPlaceholder.f35923z)) {
                composer4.X(-900814063);
                FareMediaTransferCardKt.b(StringResourceKt.a(R.string.l5, new Object[0], composer4, 0), a3, composer4, 0, 0);
                composer.M();
            } else {
                composer4.X(-860392163);
                composer.M();
                throw new NoWhenBranchMatchedException();
            }
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        c((PagerScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
