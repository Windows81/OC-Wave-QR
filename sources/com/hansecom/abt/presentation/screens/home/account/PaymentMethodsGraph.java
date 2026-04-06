package com.hansecom.abt.presentation.screens.home.account;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;

@Metadata
@Serializable
public final class PaymentMethodsGraph {
    public static final PaymentMethodsGraph INSTANCE = new PaymentMethodsGraph();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35100a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new f0());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.PaymentMethodsGraph", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35100a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof PaymentMethodsGraph);
    }

    public int hashCode() {
        return 1707397035;
    }

    public final KSerializer<PaymentMethodsGraph> serializer() {
        return c();
    }

    public String toString() {
        return "PaymentMethodsGraph";
    }
}
