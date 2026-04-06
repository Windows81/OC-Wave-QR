package com.hansecom.abt.presentation.screens.home.account;

import com.hansecom.abt.presentation.screens.home.account.Account;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class X implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Account.Action f35102z;

    public /* synthetic */ X(Account.Action action) {
        this.f35102z = action;
    }

    public final Object invoke(Object obj) {
        return AccountViewModel.L(this.f35102z, (Account.State) obj);
    }
}
