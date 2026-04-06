package com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance;

import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class i implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CheckFareMediaBalanceViewModel f34743A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f34744z;

    public /* synthetic */ i(String str, CheckFareMediaBalanceViewModel checkFareMediaBalanceViewModel) {
        this.f34744z = str;
        this.f34743A = checkFareMediaBalanceViewModel;
    }

    public final Object invoke(Object obj) {
        return CheckFareMediaBalanceViewModel.P(this.f34744z, this.f34743A, (CheckFareMediaBalance.State) obj);
    }
}
