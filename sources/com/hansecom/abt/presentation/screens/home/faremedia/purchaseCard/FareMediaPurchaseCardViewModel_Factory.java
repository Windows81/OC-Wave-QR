package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.useCases.GetAllVirtualFareMediaUseCase;
import com.hansecom.abt.data.useCases.GetEnvironmentConfigurationUseCase;
import com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase;
import com.hansecom.abt.presentation.wallet.GoogleWalletHelper;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaPurchaseCardViewModel_Factory implements Factory<FareMediaPurchaseCardViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37192a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37193b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f37194c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f37195d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f37196e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f37197f;

    public static FareMediaPurchaseCardViewModel b(SavedStateHandle savedStateHandle, AppFeatures appFeatures, GoogleWalletHelper googleWalletHelper, PurchaseVirtualCardUseCase purchaseVirtualCardUseCase, GetAllVirtualFareMediaUseCase getAllVirtualFareMediaUseCase, GetEnvironmentConfigurationUseCase getEnvironmentConfigurationUseCase) {
        return new FareMediaPurchaseCardViewModel(savedStateHandle, appFeatures, googleWalletHelper, purchaseVirtualCardUseCase, getAllVirtualFareMediaUseCase, getEnvironmentConfigurationUseCase);
    }

    /* renamed from: a */
    public FareMediaPurchaseCardViewModel get() {
        return b((SavedStateHandle) this.f37192a.get(), (AppFeatures) this.f37193b.get(), (GoogleWalletHelper) this.f37194c.get(), (PurchaseVirtualCardUseCase) this.f37195d.get(), (GetAllVirtualFareMediaUseCase) this.f37196e.get(), (GetEnvironmentConfigurationUseCase) this.f37197f.get());
    }
}
