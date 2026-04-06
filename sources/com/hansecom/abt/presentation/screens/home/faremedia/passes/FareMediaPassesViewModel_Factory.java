package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaPassesViewModel_Factory implements Factory<FareMediaPassesViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37008a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37009b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f37010c;

    public static FareMediaPassesViewModel b(SavedStateHandle savedStateHandle, FareMediaPassesRepository fareMediaPassesRepository, AppFeatures appFeatures) {
        return new FareMediaPassesViewModel(savedStateHandle, fareMediaPassesRepository, appFeatures);
    }

    /* renamed from: a */
    public FareMediaPassesViewModel get() {
        return b((SavedStateHandle) this.f37008a.get(), (FareMediaPassesRepository) this.f37009b.get(), (AppFeatures) this.f37010c.get());
    }
}
