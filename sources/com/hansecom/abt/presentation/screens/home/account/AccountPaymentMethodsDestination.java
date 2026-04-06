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
public final class AccountPaymentMethodsDestination {
    public static final AccountPaymentMethodsDestination INSTANCE = new AccountPaymentMethodsDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35057a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0500w());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.AccountPaymentMethodsDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35057a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AccountPaymentMethodsDestination);
    }

    public int hashCode() {
        return 652376268;
    }

    public final KSerializer<AccountPaymentMethodsDestination> serializer() {
        return c();
    }

    public String toString() {
        return "AccountPaymentMethodsDestination";
    }
}
