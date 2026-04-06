package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.preferences.AppPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaAddValueCashPaymentInstructionsViewModel_Factory implements Factory<FareMediaAddValueCashPaymentInstructionsViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36178a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36179b;

    public static FareMediaAddValueCashPaymentInstructionsViewModel b(SavedStateHandle savedStateHandle, AppPreferences appPreferences) {
        return new FareMediaAddValueCashPaymentInstructionsViewModel(savedStateHandle, appPreferences);
    }

    /* renamed from: a */
    public FareMediaAddValueCashPaymentInstructionsViewModel get() {
        return b((SavedStateHandle) this.f36178a.get(), (AppPreferences) this.f36179b.get());
    }
}
