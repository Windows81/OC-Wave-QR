package com.hansecom.abt.presentation.screens.home.account.changeAccountPin;

import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class p implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ChangeAccountPinViewModel f35274A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAccountPin.Action f35275z;

    public /* synthetic */ p(ChangeAccountPin.Action action, ChangeAccountPinViewModel changeAccountPinViewModel) {
        this.f35275z = action;
        this.f35274A = changeAccountPinViewModel;
    }

    public final Object invoke(Object obj) {
        return ChangeAccountPinViewModel.H(this.f35275z, this.f35274A, (ChangeAccountPin.State) obj);
    }
}
