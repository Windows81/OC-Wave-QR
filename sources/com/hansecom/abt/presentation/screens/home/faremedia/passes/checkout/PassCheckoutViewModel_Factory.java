package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase;
import com.hansecom.abt.data.useCases.passes.PurchasePassUseCase;
import com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase;
import com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase;
import com.hansecom.abt.util.GooglePayClient;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class PassCheckoutViewModel_Factory implements Factory<PassCheckoutViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37120a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37121b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f37122c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f37123d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f37124e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f37125f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f37126g;

    /* renamed from: h  reason: collision with root package name */
    public final Provider f37127h;

    /* renamed from: i  reason: collision with root package name */
    public final Provider f37128i;

    /* renamed from: j  reason: collision with root package name */
    public final Provider f37129j;

    public static PassCheckoutViewModel b(SavedStateHandle savedStateHandle, FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository, AppFeatures appFeatures, GetFareMediaUseCase getFareMediaUseCase, GetDefaultPaymentMethodUseCase getDefaultPaymentMethodUseCase, PurchasePassUseCase purchasePassUseCase, PurchasePassWithGooglePayUseCase purchasePassWithGooglePayUseCase, PurchasePassWithFareMediaUseCase purchasePassWithFareMediaUseCase, PurchaseManager purchaseManager, GooglePayClient googlePayClient) {
        return new PassCheckoutViewModel(savedStateHandle, fareMediaPassesToOfferRepository, appFeatures, getFareMediaUseCase, getDefaultPaymentMethodUseCase, purchasePassUseCase, purchasePassWithGooglePayUseCase, purchasePassWithFareMediaUseCase, purchaseManager, googlePayClient);
    }

    /* renamed from: a */
    public PassCheckoutViewModel get() {
        return b((SavedStateHandle) this.f37120a.get(), (FareMediaPassesToOfferRepository) this.f37121b.get(), (AppFeatures) this.f37122c.get(), (GetFareMediaUseCase) this.f37123d.get(), (GetDefaultPaymentMethodUseCase) this.f37124e.get(), (PurchasePassUseCase) this.f37125f.get(), (PurchasePassWithGooglePayUseCase) this.f37126g.get(), (PurchasePassWithFareMediaUseCase) this.f37127h.get(), (PurchaseManager) this.f37128i.get(), (GooglePayClient) this.f37129j.get());
    }
}
