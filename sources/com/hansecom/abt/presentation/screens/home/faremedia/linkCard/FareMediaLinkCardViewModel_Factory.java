package com.hansecom.abt.presentation.screens.home.faremedia.linkCard;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.useCases.fareMedia.LinkFareMediaCardUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaLinkCardViewModel_Factory implements Factory<FareMediaLinkCardViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36927a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36928b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f36929c;

    public static FareMediaLinkCardViewModel b(SavedStateHandle savedStateHandle, LinkFareMediaCardUseCase linkFareMediaCardUseCase, AppFeatures appFeatures) {
        return new FareMediaLinkCardViewModel(savedStateHandle, linkFareMediaCardUseCase, appFeatures);
    }

    /* renamed from: a */
    public FareMediaLinkCardViewModel get() {
        return b((SavedStateHandle) this.f36927a.get(), (LinkFareMediaCardUseCase) this.f36928b.get(), (AppFeatures) this.f36929c.get());
    }
}
