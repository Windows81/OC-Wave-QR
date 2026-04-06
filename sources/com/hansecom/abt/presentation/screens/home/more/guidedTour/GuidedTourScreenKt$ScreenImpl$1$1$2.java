package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.data.config.guidedTour.GuidedTourPage;
import com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTour;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GuidedTourScreenKt$ScreenImpl$1$1$2 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GuidedTour.State f37450z;

    public GuidedTourScreenKt$ScreenImpl$1$1$2(GuidedTour.State state) {
        this.f37450z = state;
    }

    public final void b(PagerScope pagerScope, int i2, Composer composer, int i3) {
        Intrinsics.i(pagerScope, "$this$HorizontalPager");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1104579144, i3, -1, "com.hansecom.abt.presentation.screens.home.more.guidedTour.ScreenImpl.<anonymous>.<anonymous>.<anonymous> (GuidedTourScreen.kt:91)");
        }
        GuidedTourScreenKt.j((GuidedTourPage) this.f37450z.b().get(i2), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((PagerScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
