package com.hansecom.abt.presentation.screens.home.account;

import com.hansecom.abt.presentation.screens.home.account.Account;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class b0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Account.Action f35228z;

    public /* synthetic */ b0(Account.Action action) {
        this.f35228z = action;
    }

    public final Object invoke(Object obj) {
        return AccountViewModel.P(this.f35228z, (Account.State) obj);
    }
}
