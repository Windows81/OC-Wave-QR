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
public final class AddPaymentMethodChooseCountryDestination {
    public static final AddPaymentMethodChooseCountryDestination INSTANCE = new AddPaymentMethodChooseCountryDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35533a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodChooseCountryDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35533a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AddPaymentMethodChooseCountryDestination);
    }

    public int hashCode() {
        return -1336120447;
    }

    public final KSerializer<AddPaymentMethodChooseCountryDestination> serializer() {
        return c();
    }

    public String toString() {
        return "AddPaymentMethodChooseCountryDestination";
    }
}
