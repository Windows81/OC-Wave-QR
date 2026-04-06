package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.AutoloadRepository;
import com.hansecom.abt.data.repositories.FareMediaConfigRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase;
import com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AutoloadViewModel_Factory implements Factory<AutoloadViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36248a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36249b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f36250c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f36251d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f36252e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f36253f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f36254g;

    public static AutoloadViewModel b(SavedStateHandle savedStateHandle, FareMediaRepository fareMediaRepository, FareMediaConfigRepository fareMediaConfigRepository, AutoloadRepository autoloadRepository, PaymentMethodsRepository paymentMethodsRepository, ChangeAutoloadUseCase changeAutoloadUseCase, DeleteAutoloadUseCase deleteAutoloadUseCase) {
        return new AutoloadViewModel(savedStateHandle, fareMediaRepository, fareMediaConfigRepository, autoloadRepository, paymentMethodsRepository, changeAutoloadUseCase, deleteAutoloadUseCase);
    }

    /* renamed from: a */
    public AutoloadViewModel get() {
        return b((SavedStateHandle) this.f36248a.get(), (FareMediaRepository) this.f36249b.get(), (FareMediaConfigRepository) this.f36250c.get(), (AutoloadRepository) this.f36251d.get(), (PaymentMethodsRepository) this.f36252e.get(), (ChangeAutoloadUseCase) this.f36253f.get(), (DeleteAutoloadUseCase) this.f36254g.get());
    }
}
