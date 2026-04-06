package com.hansecom.abt.data.useCases.autoload;

import com.hansecom.abt.data.managers.AutoloadManager;
import com.hansecom.abt.data.repositories.AutoloadRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class DeleteAutoloadUseCase_Factory implements Factory<DeleteAutoloadUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33837a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33838b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33839c;

    public static DeleteAutoloadUseCase b(AutoloadRepository autoloadRepository, FareMediaRepository fareMediaRepository, AutoloadManager autoloadManager) {
        return new DeleteAutoloadUseCase(autoloadRepository, fareMediaRepository, autoloadManager);
    }

    /* renamed from: a */
    public DeleteAutoloadUseCase get() {
        return b((AutoloadRepository) this.f33837a.get(), (FareMediaRepository) this.f33838b.get(), (AutoloadManager) this.f33839c.get());
    }
}
