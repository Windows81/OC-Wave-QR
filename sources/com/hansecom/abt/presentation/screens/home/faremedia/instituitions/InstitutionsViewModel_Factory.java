package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.FareMediaConfigRepository;
import com.hansecom.abt.data.repositories.FareMediaInstitutionsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class InstitutionsViewModel_Factory implements Factory<InstitutionsViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36783a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36784b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f36785c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f36786d;

    public static InstitutionsViewModel b(SavedStateHandle savedStateHandle, FareMediaInstitutionsRepository fareMediaInstitutionsRepository, FareMediaConfigRepository fareMediaConfigRepository, AppFeatures appFeatures) {
        return new InstitutionsViewModel(savedStateHandle, fareMediaInstitutionsRepository, fareMediaConfigRepository, appFeatures);
    }

    /* renamed from: a */
    public InstitutionsViewModel get() {
        return b((SavedStateHandle) this.f36783a.get(), (FareMediaInstitutionsRepository) this.f36784b.get(), (FareMediaConfigRepository) this.f36785c.get(), (AppFeatures) this.f36786d.get());
    }
}
