package com.hansecom.abt.presentation.screens.home.account.payment;

import com.hansecom.abt.presentation.model.PaymentMethodStateKt;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods;
import com.hansecom.mapi.models.PaymentMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;

@Metadata
public final class PaymentMethodsViewModel$1$2$1$1 implements Function1<PaymentMethods.State, PaymentMethods.State> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f35524z;

    public PaymentMethodsViewModel$1$2$1$1(List list) {
        this.f35524z = list;
    }

    /* renamed from: b */
    public final PaymentMethods.State invoke(PaymentMethods.State state) {
        Intrinsics.i(state, "$this$update");
        Iterable<PaymentMethod> iterable = this.f35524z;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (PaymentMethod a2 : iterable) {
            arrayList.add(PaymentMethodStateKt.a(a2));
        }
        return PaymentMethods.State.b(state, false, false, false, ExtensionsKt.e(arrayList), (Integer) null, 18, (Object) null);
    }
}
