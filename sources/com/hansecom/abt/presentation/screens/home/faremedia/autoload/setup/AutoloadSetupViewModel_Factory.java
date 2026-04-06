package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.AutoloadRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase;
import com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase;
import com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AutoloadSetupViewModel_Factory implements Factory<AutoloadSetupViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36320a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36321b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f36322c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f36323d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f36324e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f36325f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f36326g;

    /* renamed from: h  reason: collision with root package name */
    public final Provider f36327h;

    public static AutoloadSetupViewModel b(SavedStateHandle savedStateHandle, FareMediaRepository fareMediaRepository, AutoloadRepository autoloadRepository, PaymentMethodsRepository paymentMethodsRepository, GetAutoloadConfigurationsUseCase getAutoloadConfigurationsUseCase, CreateAutoloadUseCase createAutoloadUseCase, ChangeAutoloadUseCase changeAutoloadUseCase, AppFeatures appFeatures) {
        return new AutoloadSetupViewModel(savedStateHandle, fareMediaRepository, autoloadRepository, paymentMethodsRepository, getAutoloadConfigurationsUseCase, createAutoloadUseCase, changeAutoloadUseCase, appFeatures);
    }

    /* renamed from: a */
    public AutoloadSetupViewModel get() {
        return b((SavedStateHandle) this.f36320a.get(), (FareMediaRepository) this.f36321b.get(), (AutoloadRepository) this.f36322c.get(), (PaymentMethodsRepository) this.f36323d.get(), (GetAutoloadConfigurationsUseCase) this.f36324e.get(), (CreateAutoloadUseCase) this.f36325f.get(), (ChangeAutoloadUseCase) this.f36326g.get(), (AppFeatures) this.f36327h.get());
    }
}
