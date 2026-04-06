package com.hansecom.abt.presentation.screens.home.account.changeAccountPin;

import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class q implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ChangeAccountPinViewModel f35276A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAccountPin.Action f35277z;

    public /* synthetic */ q(ChangeAccountPin.Action action, ChangeAccountPinViewModel changeAccountPinViewModel) {
        this.f35277z = action;
        this.f35276A = changeAccountPinViewModel;
    }

    public final Object invoke(Object obj) {
        return ChangeAccountPinViewModel.I(this.f35277z, this.f35276A, (ChangeAccountPin.State) obj);
    }
}
