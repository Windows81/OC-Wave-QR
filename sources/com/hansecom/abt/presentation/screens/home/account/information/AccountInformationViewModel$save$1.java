package com.hansecom.abt.presentation.screens.home.account.information;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel", f = "AccountInformationViewModel.kt", l = {118}, m = "save")
public final class AccountInformationViewModel$save$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ AccountInformationViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountInformationViewModel$save$1(AccountInformationViewModel accountInformationViewModel, Continuation continuation) {
        super(continuation);
        this.E = accountInformationViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.V(this);
    }
}
