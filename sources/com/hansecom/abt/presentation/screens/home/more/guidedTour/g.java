package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTour;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37468A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37469B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GuidedTour.State f37470z;

    public /* synthetic */ g(GuidedTour.State state, Function0 function0, int i2) {
        this.f37470z = state;
        this.f37468A = function0;
        this.f37469B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return GuidedTourScreenKt.q(this.f37470z, this.f37468A, this.f37469B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
