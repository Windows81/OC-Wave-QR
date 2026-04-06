package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class O implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Throwable f36116A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaAddValueViewModel f36117z;

    public /* synthetic */ O(FareMediaAddValueViewModel fareMediaAddValueViewModel, Throwable th) {
        this.f36117z = fareMediaAddValueViewModel;
        this.f36116A = th;
    }

    public final Object invoke(Object obj) {
        return FareMediaAddValueViewModel$applyCoupon$1.G(this.f36117z, this.f36116A, (FareMediaAddValue.State) obj);
    }
}
