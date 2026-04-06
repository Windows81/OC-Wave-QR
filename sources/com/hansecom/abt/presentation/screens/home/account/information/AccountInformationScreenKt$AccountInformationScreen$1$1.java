package com.hansecom.abt.presentation.screens.home.account.information;

import com.hansecom.abt.presentation.screens.home.account.information.AccountInformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class AccountInformationScreenKt$AccountInformationScreen$1$1 extends FunctionReferenceImpl implements Function1<AccountInformation.Action, Unit> {
    public AccountInformationScreenKt$AccountInformationScreen$1$1(Object obj) {
        super(1, obj, AccountInformationViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((AccountInformation.Action) obj);
        return Unit.f40552a;
    }

    public final void v(AccountInformation.Action action) {
        Intrinsics.i(action, "p0");
        ((AccountInformationViewModel) this.f40885A).k(action);
    }
}
