package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.useCases.GetMostRelevantFareCappingFlowUseCase;
import com.hansecom.abt.data.useCases.configurations.GetFareCategoryColorsUseCase;
import com.hansecom.abt.data.useCases.configurations.GetMoreInfoFareMediaLinkUseCase;
import com.hansecom.abt.data.useCases.configurations.GetRemoteFeatureConfigUseCase;
import com.hansecom.abt.data.useCases.fareMedia.FareMediaTransferValidUntilFlowUseCase;
import com.hansecom.abt.data.useCases.fareMedia.GetGoogleWalletProvisioningLinkUseCase;
import com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase;
import com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase;
import com.hansecom.abt.presentation.wallet.GoogleWalletHelper;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaViewModel_Factory implements Factory<FareMediaViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f35990a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35991b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35992c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f35993d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f35994e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f35995f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f35996g;

    /* renamed from: h  reason: collision with root package name */
    public final Provider f35997h;

    /* renamed from: i  reason: collision with root package name */
    public final Provider f35998i;

    /* renamed from: j  reason: collision with root package name */
    public final Provider f35999j;

    /* renamed from: k  reason: collision with root package name */
    public final Provider f36000k;

    /* renamed from: l  reason: collision with root package name */
    public final Provider f36001l;

    public static FareMediaViewModel b(SavedStateHandle savedStateHandle, FareMediaRepository fareMediaRepository, RefreshFareMediaDataUseCase refreshFareMediaDataUseCase, FareMediaTransferValidUntilFlowUseCase fareMediaTransferValidUntilFlowUseCase, TransferFareMediaCardUseCase transferFareMediaCardUseCase, GetRemoteFeatureConfigUseCase getRemoteFeatureConfigUseCase, GetMostRelevantFareCappingFlowUseCase getMostRelevantFareCappingFlowUseCase, GetMoreInfoFareMediaLinkUseCase getMoreInfoFareMediaLinkUseCase, GetFareCategoryColorsUseCase getFareCategoryColorsUseCase, GetGoogleWalletProvisioningLinkUseCase getGoogleWalletProvisioningLinkUseCase, AppFeatures appFeatures, GoogleWalletHelper googleWalletHelper) {
        return new FareMediaViewModel(savedStateHandle, fareMediaRepository, refreshFareMediaDataUseCase, fareMediaTransferValidUntilFlowUseCase, transferFareMediaCardUseCase, getRemoteFeatureConfigUseCase, getMostRelevantFareCappingFlowUseCase, getMoreInfoFareMediaLinkUseCase, getFareCategoryColorsUseCase, getGoogleWalletProvisioningLinkUseCase, appFeatures, googleWalletHelper);
    }

    /* renamed from: a */
    public FareMediaViewModel get() {
        return b((SavedStateHandle) this.f35990a.get(), (FareMediaRepository) this.f35991b.get(), (RefreshFareMediaDataUseCase) this.f35992c.get(), (FareMediaTransferValidUntilFlowUseCase) this.f35993d.get(), (TransferFareMediaCardUseCase) this.f35994e.get(), (GetRemoteFeatureConfigUseCase) this.f35995f.get(), (GetMostRelevantFareCappingFlowUseCase) this.f35996g.get(), (GetMoreInfoFareMediaLinkUseCase) this.f35997h.get(), (GetFareCategoryColorsUseCase) this.f35998i.get(), (GetGoogleWalletProvisioningLinkUseCase) this.f35999j.get(), (AppFeatures) this.f36000k.get(), (GoogleWalletHelper) this.f36001l.get());
    }
}
