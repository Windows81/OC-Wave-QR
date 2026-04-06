package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses;
import com.hansecom.abt.ui.components.passCard.PassOfferCardState;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class g implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f37069A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f37070z;

    public /* synthetic */ g(PassOfferCardState passOfferCardState, PassOfferCardState passOfferCardState2) {
        this.f37070z = passOfferCardState;
        this.f37069A = passOfferCardState2;
    }

    public final Object invoke(Object obj) {
        return AddPassesViewModel.A(this.f37070z, this.f37069A, (AddPasses.State) obj);
    }
}
