package com.hansecom.abt.presentation.screens.home.account.payment.add;

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
public final class AddPaymentMethodGraph {
    public static final AddPaymentMethodGraph INSTANCE = new AddPaymentMethodGraph();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35536a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new d());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodGraph", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35536a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AddPaymentMethodGraph);
    }

    public int hashCode() {
        return -1536938980;
    }

    public final KSerializer<AddPaymentMethodGraph> serializer() {
        return c();
    }

    public String toString() {
        return "AddPaymentMethodGraph";
    }
}
