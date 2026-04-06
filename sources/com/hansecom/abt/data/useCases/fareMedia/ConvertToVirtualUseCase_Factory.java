package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ConvertToVirtualUseCase_Factory implements Factory<ConvertToVirtualUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33894a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33895b;

    public static ConvertToVirtualUseCase b(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        return new ConvertToVirtualUseCase(fareMediaManager, fareMediaRepository);
    }

    /* renamed from: a */
    public ConvertToVirtualUseCase get() {
        return b((FareMediaManager) this.f33894a.get(), (FareMediaRepository) this.f33895b.get());
    }
}
