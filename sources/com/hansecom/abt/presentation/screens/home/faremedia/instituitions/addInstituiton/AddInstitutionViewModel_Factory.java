package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.InstitutionsRepository;
import com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AddInstitutionViewModel_Factory implements Factory<AddInstitutionViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36804a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36805b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f36806c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f36807d;

    public static AddInstitutionViewModel b(SavedStateHandle savedStateHandle, AppFeatures appFeatures, InstitutionsRepository institutionsRepository, LinkInstitutionUseCase linkInstitutionUseCase) {
        return new AddInstitutionViewModel(savedStateHandle, appFeatures, institutionsRepository, linkInstitutionUseCase);
    }

    /* renamed from: a */
    public AddInstitutionViewModel get() {
        return b((SavedStateHandle) this.f36804a.get(), (AppFeatures) this.f36805b.get(), (InstitutionsRepository) this.f36806c.get(), (LinkInstitutionUseCase) this.f36807d.get());
    }
}
