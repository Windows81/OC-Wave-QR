package com.hansecom.abt.data.useCases.autoload;

import com.hansecom.abt.data.managers.AutoloadManager;
import com.hansecom.abt.data.repositories.AutoloadRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class CreateAutoloadUseCase_Factory implements Factory<CreateAutoloadUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33831a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33832b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33833c;

    public static CreateAutoloadUseCase b(AutoloadRepository autoloadRepository, FareMediaRepository fareMediaRepository, AutoloadManager autoloadManager) {
        return new CreateAutoloadUseCase(autoloadRepository, fareMediaRepository, autoloadManager);
    }

    /* renamed from: a */
    public CreateAutoloadUseCase get() {
        return b((AutoloadRepository) this.f33831a.get(), (FareMediaRepository) this.f33832b.get(), (AutoloadManager) this.f33833c.get());
    }
}
