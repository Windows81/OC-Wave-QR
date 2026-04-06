package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class LinkFareMediaCardUseCase_Factory implements Factory<LinkFareMediaCardUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33915a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33916b;

    public static LinkFareMediaCardUseCase b(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        return new LinkFareMediaCardUseCase(fareMediaManager, fareMediaRepository);
    }

    /* renamed from: a */
    public LinkFareMediaCardUseCase get() {
        return b((FareMediaManager) this.f33915a.get(), (FareMediaRepository) this.f33916b.get());
    }
}
