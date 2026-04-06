package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class X implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f36046A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerState f36047z;

    public /* synthetic */ X(PagerState pagerState, int i2) {
        this.f36047z = pagerState;
        this.f36046A = i2;
    }

    public final Object invoke(Object obj) {
        return FareMediaScreenKt$CardCarousel$1.e(this.f36047z, this.f36046A, (GraphicsLayerScope) obj);
    }
}
