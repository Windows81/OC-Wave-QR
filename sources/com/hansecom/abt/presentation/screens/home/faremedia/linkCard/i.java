package com.hansecom.abt.presentation.screens.home.faremedia.linkCard;

import com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class i implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FareMediaLinkCardViewModel f36944A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f36945z;

    public /* synthetic */ i(String str, FareMediaLinkCardViewModel fareMediaLinkCardViewModel) {
        this.f36945z = str;
        this.f36944A = fareMediaLinkCardViewModel;
    }

    public final Object invoke(Object obj) {
        return FareMediaLinkCardViewModel.O(this.f36945z, this.f36944A, (FareMediaLinkCard.State) obj);
    }
}
