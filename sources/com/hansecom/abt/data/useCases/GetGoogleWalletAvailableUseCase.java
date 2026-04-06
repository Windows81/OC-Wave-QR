package com.hansecom.abt.data.useCases;

import com.hansecom.abt.presentation.wallet.GoogleWalletHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GetGoogleWalletAvailableUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final GoogleWalletHelper f33732a;

    public GetGoogleWalletAvailableUseCase(GoogleWalletHelper googleWalletHelper) {
        Intrinsics.i(googleWalletHelper, "googleWalletHelper");
        this.f33732a = googleWalletHelper;
    }
}
