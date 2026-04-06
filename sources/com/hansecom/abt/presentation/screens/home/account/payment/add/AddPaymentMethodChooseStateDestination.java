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
public final class AddPaymentMethodChooseStateDestination {
    public static final AddPaymentMethodChooseStateDestination INSTANCE = new AddPaymentMethodChooseStateDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35534a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new b());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodChooseStateDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35534a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AddPaymentMethodChooseStateDestination);
    }

    public int hashCode() {
        return -423900698;
    }

    public final KSerializer<AddPaymentMethodChooseStateDestination> serializer() {
        return c();
    }

    public String toString() {
        return "AddPaymentMethodChooseStateDestination";
    }
}
