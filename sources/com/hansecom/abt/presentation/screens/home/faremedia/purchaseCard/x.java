package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class x implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f37223A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ BigDecimal f37224B;
    public final /* synthetic */ FareMediaPurchaseCard.RiderType C;
    public final /* synthetic */ boolean D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f37225z;

    public /* synthetic */ x(List list, List list2, BigDecimal bigDecimal, FareMediaPurchaseCard.RiderType riderType, boolean z2) {
        this.f37225z = list;
        this.f37223A = list2;
        this.f37224B = bigDecimal;
        this.C = riderType;
        this.D = z2;
    }

    public final Object invoke(Object obj) {
        return FareMediaPurchaseCardViewModel.AnonymousClass1.AnonymousClass1.C(this.f37225z, this.f37223A, this.f37224B, this.C, this.D, (FareMediaPurchaseCard.State) obj);
    }
}
