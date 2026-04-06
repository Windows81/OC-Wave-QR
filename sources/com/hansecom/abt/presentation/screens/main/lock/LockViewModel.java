package com.hansecom.abt.presentation.screens.main.lock;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.lock.SetIsLockedFlowUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.main.lock.Lock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LockViewModel extends MviViewModel<Lock.Action, Lock.State, Lock.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final SetIsLockedFlowUseCase f37675i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LockViewModel(SavedStateHandle savedStateHandle, SetIsLockedFlowUseCase setIsLockedFlowUseCase) {
        super(savedStateHandle, new Lock.State(false));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(setIsLockedFlowUseCase, "setIsLockedFlowUseCase");
        this.f37675i = setIsLockedFlowUseCase;
    }

    /* renamed from: u */
    public Object o(Lock.Action action, Continuation continuation) {
        if (Intrinsics.d(action, Lock.Action.Unlock.f37668a)) {
            Object a2 = this.f37675i.a(false, continuation);
            return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
        }
        if (action instanceof Lock.Action.ErrorOnUnlock) {
            String a3 = ((Lock.Action.ErrorOnUnlock) action).a();
            if (a3 == null) {
                a3 = "";
            }
            p(new Lock.Effect.Error(a3));
        } else if (Intrinsics.d(action, Lock.Action.ShowBiometricDialog.f37667a)) {
            p(Lock.Effect.ShowBiometricDialog.f37670a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }
}
