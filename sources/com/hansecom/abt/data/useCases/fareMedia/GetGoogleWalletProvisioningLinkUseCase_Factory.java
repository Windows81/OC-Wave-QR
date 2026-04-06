package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetGoogleWalletProvisioningLinkUseCase_Factory implements Factory<GetGoogleWalletProvisioningLinkUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33912a;

    public static GetGoogleWalletProvisioningLinkUseCase b(FareMediaManager fareMediaManager) {
        return new GetGoogleWalletProvisioningLinkUseCase(fareMediaManager);
    }

    /* renamed from: a */
    public GetGoogleWalletProvisioningLinkUseCase get() {
        return b((FareMediaManager) this.f33912a.get());
    }
}
