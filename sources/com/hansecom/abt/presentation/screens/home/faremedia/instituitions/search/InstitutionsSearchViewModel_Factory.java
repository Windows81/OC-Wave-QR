package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.FareMediaInstitutionsRepository;
import com.hansecom.abt.data.repositories.InstitutionsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class InstitutionsSearchViewModel_Factory implements Factory<InstitutionsSearchViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36884a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36885b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f36886c;

    public static InstitutionsSearchViewModel b(SavedStateHandle savedStateHandle, FareMediaInstitutionsRepository fareMediaInstitutionsRepository, InstitutionsRepository institutionsRepository) {
        return new InstitutionsSearchViewModel(savedStateHandle, fareMediaInstitutionsRepository, institutionsRepository);
    }

    /* renamed from: a */
    public InstitutionsSearchViewModel get() {
        return b((SavedStateHandle) this.f36884a.get(), (FareMediaInstitutionsRepository) this.f36885b.get(), (InstitutionsRepository) this.f36886c.get());
    }
}
