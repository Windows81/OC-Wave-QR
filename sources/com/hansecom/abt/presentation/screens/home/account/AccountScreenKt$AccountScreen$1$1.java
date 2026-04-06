package com.hansecom.abt.presentation.screens.home.account;

import com.hansecom.abt.presentation.screens.home.account.Account;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class AccountScreenKt$AccountScreen$1$1 extends FunctionReferenceImpl implements Function1<Account.Action, Unit> {
    public AccountScreenKt$AccountScreen$1$1(Object obj) {
        super(1, obj, AccountViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Account.Action) obj);
        return Unit.f40552a;
    }

    public final void v(Account.Action action) {
        Intrinsics.i(action, "p0");
        ((AccountViewModel) this.f40885A).k(action);
    }
}
