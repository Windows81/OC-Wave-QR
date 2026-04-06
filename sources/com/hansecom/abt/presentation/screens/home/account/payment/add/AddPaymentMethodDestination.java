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
public final class AddPaymentMethodDestination {
    public static final AddPaymentMethodDestination INSTANCE = new AddPaymentMethodDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35535a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new c());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35535a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AddPaymentMethodDestination);
    }

    public int hashCode() {
        return 14015580;
    }

    public final KSerializer<AddPaymentMethodDestination> serializer() {
        return c();
    }

    public String toString() {
        return "AddPaymentMethodDestination";
    }
}
