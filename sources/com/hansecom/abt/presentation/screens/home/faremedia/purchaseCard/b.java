package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37204A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f37205B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaPurchaseCard.State f37206z;

    public /* synthetic */ b(FareMediaPurchaseCard.State state, Function1 function1, Flow flow, Function0 function0, int i2) {
        this.f37206z = state;
        this.f37204A = function1;
        this.f37205B = flow;
        this.C = function0;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaPurchaseCardScreenKt.g(this.f37206z, this.f37204A, this.f37205B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
