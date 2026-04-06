package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.repositories.FareMediaConfigRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.useCases.AddBalanceUseCase;
import com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase;
import com.hansecom.abt.util.GooglePayClient;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaAddValueViewModel_Factory implements Factory<FareMediaAddValueViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36097a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36098b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f36099c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f36100d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f36101e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f36102f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f36103g;

    /* renamed from: h  reason: collision with root package name */
    public final Provider f36104h;

    /* renamed from: i  reason: collision with root package name */
    public final Provider f36105i;

    /* renamed from: j  reason: collision with root package name */
    public final Provider f36106j;

    public static FareMediaAddValueViewModel b(SavedStateHandle savedStateHandle, AppFeatures appFeatures, FareMediaRepository fareMediaRepository, AddBalanceUseCase addBalanceUseCase, AddBalanceWithGooglePayUseCase addBalanceWithGooglePayUseCase, GetDefaultPaymentMethodUseCase getDefaultPaymentMethodUseCase, FareMediaConfigRepository fareMediaConfigRepository, PurchaseManager purchaseManager, GooglePayClient googlePayClient, AppPreferences appPreferences) {
        return new FareMediaAddValueViewModel(savedStateHandle, appFeatures, fareMediaRepository, addBalanceUseCase, addBalanceWithGooglePayUseCase, getDefaultPaymentMethodUseCase, fareMediaConfigRepository, purchaseManager, googlePayClient, appPreferences);
    }

    /* renamed from: a */
    public FareMediaAddValueViewModel get() {
        return b((SavedStateHandle) this.f36097a.get(), (AppFeatures) this.f36098b.get(), (FareMediaRepository) this.f36099c.get(), (AddBalanceUseCase) this.f36100d.get(), (AddBalanceWithGooglePayUseCase) this.f36101e.get(), (GetDefaultPaymentMethodUseCase) this.f36102f.get(), (FareMediaConfigRepository) this.f36103g.get(), (PurchaseManager) this.f36104h.get(), (GooglePayClient) this.f36105i.get(), (AppPreferences) this.f36106j.get());
    }
}
