package com.hansecom.abt.presentation.screens.main.lock;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.lock.SetIsLockedFlowUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class LockViewModel_Factory implements Factory<LockViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37676a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37677b;

    public static LockViewModel b(SavedStateHandle savedStateHandle, SetIsLockedFlowUseCase setIsLockedFlowUseCase) {
        return new LockViewModel(savedStateHandle, setIsLockedFlowUseCase);
    }

    /* renamed from: a */
    public LockViewModel get() {
        return b((SavedStateHandle) this.f37676a.get(), (SetIsLockedFlowUseCase) this.f37677b.get());
    }
}
