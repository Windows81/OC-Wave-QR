package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class C implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TransferBalanceViewModel f37264A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f37265z;

    public /* synthetic */ C(String str, TransferBalanceViewModel transferBalanceViewModel) {
        this.f37265z = str;
        this.f37264A = transferBalanceViewModel;
    }

    public final Object invoke(Object obj) {
        return TransferBalanceViewModel.K(this.f37265z, this.f37264A, (TransferBalance.State) obj);
    }
}
