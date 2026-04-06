package com.hansecom.abt.presentation.screens.home.account;

import com.hansecom.abt.presentation.screens.home.account.Account;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class Y implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Account.Action f35103z;

    public /* synthetic */ Y(Account.Action action) {
        this.f35103z = action;
    }

    public final Object invoke(Object obj) {
        return AccountViewModel.M(this.f35103z, (Account.State) obj);
    }
}
