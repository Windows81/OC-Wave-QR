package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation;
import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel;
import com.hansecom.mapi.models.FareMedium;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class o implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f36463A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedium f36464z;

    public /* synthetic */ o(FareMedium fareMedium, List list) {
        this.f36464z = fareMedium;
        this.f36463A = list;
    }

    public final Object invoke(Object obj) {
        return CardInformationViewModel.AnonymousClass1.AnonymousClass1.C(this.f36464z, this.f36463A, (CardInformation.State) obj);
    }
}
