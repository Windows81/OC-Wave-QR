package com.hansecom.abt.data.useCases.autoload;

import com.hansecom.abt.data.managers.AutoloadManager;
import com.hansecom.abt.data.repositories.AutoloadRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ChangeAutoloadUseCase_Factory implements Factory<ChangeAutoloadUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33825a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33826b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33827c;

    public static ChangeAutoloadUseCase b(AutoloadRepository autoloadRepository, FareMediaRepository fareMediaRepository, AutoloadManager autoloadManager) {
        return new ChangeAutoloadUseCase(autoloadRepository, fareMediaRepository, autoloadManager);
    }

    /* renamed from: a */
    public ChangeAutoloadUseCase get() {
        return b((AutoloadRepository) this.f33825a.get(), (FareMediaRepository) this.f33826b.get(), (AutoloadManager) this.f33827c.get());
    }
}
