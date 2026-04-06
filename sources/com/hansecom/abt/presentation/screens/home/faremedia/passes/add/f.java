package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses;
import com.hansecom.abt.ui.components.passCard.PassOfferCardState;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class f implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f37067A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f37068z;

    public /* synthetic */ f(PassOfferCardState passOfferCardState, PassOfferCardState passOfferCardState2) {
        this.f37068z = passOfferCardState;
        this.f37067A = passOfferCardState2;
    }

    public final Object invoke(Object obj) {
        return AddPassesViewModel.z(this.f37068z, this.f37067A, (AddPasses.State) obj);
    }
}
