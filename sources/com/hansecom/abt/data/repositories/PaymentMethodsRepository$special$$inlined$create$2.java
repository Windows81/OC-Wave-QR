package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.PaymentMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class PaymentMethodsRepository$special$$inlined$create$2 extends ValueLocalDataProvider<List<? extends PaymentMethod>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodsRepository$special$$inlined$create$1 f33534f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, PaymentMethodsRepository$special$$inlined$create$1 paymentMethodsRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33534f = paymentMethodsRepository$special$$inlined$create$1;
    }

    public Function1 x() {
        return this.f33534f.a();
    }

    public Function1 y() {
        return this.f33534f.b();
    }
}
