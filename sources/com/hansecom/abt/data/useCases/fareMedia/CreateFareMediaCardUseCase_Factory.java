package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class CreateFareMediaCardUseCase_Factory implements Factory<CreateFareMediaCardUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33899a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33900b;

    public static CreateFareMediaCardUseCase b(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        return new CreateFareMediaCardUseCase(fareMediaManager, fareMediaRepository);
    }

    /* renamed from: a */
    public CreateFareMediaCardUseCase get() {
        return b((FareMediaManager) this.f33899a.get(), (FareMediaRepository) this.f33900b.get());
    }
}
