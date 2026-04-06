package com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.SavedStateHandleKt;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.auth.RegisterResultExitingAccountDestination;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccount;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class RegisterResultExitingAccountViewModel extends MviViewModel<RegisterResultExitingAccount.Action, RegisterResultExitingAccount.State, RegisterResultExitingAccount.Effect> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public RegisterResultExitingAccountViewModel(SavedStateHandle savedStateHandle) {
        super(savedStateHandle, new RegisterResultExitingAccount.State(((RegisterResultExitingAccountDestination) SavedStateHandleKt.a(savedStateHandle, Reflection.b(RegisterResultExitingAccountDestination.class), MapsKt.h())).a()));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
    }

    /* renamed from: u */
    public Object o(RegisterResultExitingAccount.Action action, Continuation continuation) {
        return Unit.f40552a;
    }
}
