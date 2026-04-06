package com.hansecom.abt.data.useCases;

import com.hansecom.abt.presentation.wallet.GoogleWalletHelper;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetGoogleWalletAvailableUseCase_Factory implements Factory<GetGoogleWalletAvailableUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33733a;

    public static GetGoogleWalletAvailableUseCase b(GoogleWalletHelper googleWalletHelper) {
        return new GetGoogleWalletAvailableUseCase(googleWalletHelper);
    }

    /* renamed from: a */
    public GetGoogleWalletAvailableUseCase get() {
        return b((GoogleWalletHelper) this.f33733a.get());
    }
}
