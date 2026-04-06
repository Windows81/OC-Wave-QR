package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase;
import com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase;
import com.hansecom.abt.data.useCases.institution.GetInstitutionsUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class CardInformationViewModel_Factory implements Factory<CardInformationViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36438a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36439b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f36440c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f36441d;

    public static CardInformationViewModel b(SavedStateHandle savedStateHandle, GetFareMediaUseCase getFareMediaUseCase, GetInstitutionsUseCase getInstitutionsUseCase, UpdateNicknameUseCase updateNicknameUseCase) {
        return new CardInformationViewModel(savedStateHandle, getFareMediaUseCase, getInstitutionsUseCase, updateNicknameUseCase);
    }

    /* renamed from: a */
    public CardInformationViewModel get() {
        return b((SavedStateHandle) this.f36438a.get(), (GetFareMediaUseCase) this.f36439b.get(), (GetInstitutionsUseCase) this.f36440c.get(), (UpdateNicknameUseCase) this.f36441d.get());
    }
}
