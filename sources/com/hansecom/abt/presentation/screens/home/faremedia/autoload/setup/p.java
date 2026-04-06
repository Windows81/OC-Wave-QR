package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class p implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AutoloadSetup.State.TopUpValidationError f36359A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AutoloadSetup.State.BalanceValidationError f36360z;

    public /* synthetic */ p(AutoloadSetup.State.BalanceValidationError balanceValidationError, AutoloadSetup.State.TopUpValidationError topUpValidationError) {
        this.f36360z = balanceValidationError;
        this.f36359A = topUpValidationError;
    }

    public final Object invoke(Object obj) {
        return AutoloadSetupViewModel.K(this.f36360z, this.f36359A, (AutoloadSetup.State) obj);
    }
}
