package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class j implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CardInformation.Action f36461z;

    public /* synthetic */ j(CardInformation.Action action) {
        this.f36461z = action;
    }

    public final Object invoke(Object obj) {
        return CardInformationViewModel.G(this.f36461z, (CardInformation.State) obj);
    }
}
