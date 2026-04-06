package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class F implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FareMediaAddValueViewModel f36055A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f36056z;

    public /* synthetic */ F(String str, FareMediaAddValueViewModel fareMediaAddValueViewModel) {
        this.f36056z = str;
        this.f36055A = fareMediaAddValueViewModel;
    }

    public final Object invoke(Object obj) {
        return FareMediaAddValueViewModel.f0(this.f36056z, this.f36055A, (FareMediaAddValue.State) obj);
    }
}
