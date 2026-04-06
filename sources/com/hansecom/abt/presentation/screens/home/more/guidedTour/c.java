package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37459A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37460B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerState f37461z;

    public /* synthetic */ c(PagerState pagerState, Function0 function0, int i2) {
        this.f37461z = pagerState;
        this.f37459A = function0;
        this.f37460B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return GuidedTourScreenKt.n(this.f37461z, this.f37459A, this.f37460B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
