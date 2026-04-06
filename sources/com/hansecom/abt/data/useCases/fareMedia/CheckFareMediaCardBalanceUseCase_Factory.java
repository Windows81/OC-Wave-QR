package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class CheckFareMediaCardBalanceUseCase_Factory implements Factory<CheckFareMediaCardBalanceUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33891a;

    public static CheckFareMediaCardBalanceUseCase b(FareMediaManager fareMediaManager) {
        return new CheckFareMediaCardBalanceUseCase(fareMediaManager);
    }

    /* renamed from: a */
    public CheckFareMediaCardBalanceUseCase get() {
        return b((FareMediaManager) this.f33891a.get());
    }
}
