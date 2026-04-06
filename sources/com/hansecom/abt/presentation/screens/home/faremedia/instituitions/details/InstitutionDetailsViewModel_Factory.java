package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.InstitutionsRepository;
import com.hansecom.abt.data.useCases.institution.UnlinkInstitutionUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class InstitutionDetailsViewModel_Factory implements Factory<InstitutionDetailsViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36837a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36838b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f36839c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f36840d;

    public static InstitutionDetailsViewModel b(SavedStateHandle savedStateHandle, AppFeatures appFeatures, InstitutionsRepository institutionsRepository, UnlinkInstitutionUseCase unlinkInstitutionUseCase) {
        return new InstitutionDetailsViewModel(savedStateHandle, appFeatures, institutionsRepository, unlinkInstitutionUseCase);
    }

    /* renamed from: a */
    public InstitutionDetailsViewModel get() {
        return b((SavedStateHandle) this.f36837a.get(), (AppFeatures) this.f36838b.get(), (InstitutionsRepository) this.f36839c.get(), (UnlinkInstitutionUseCase) this.f36840d.get());
    }
}
