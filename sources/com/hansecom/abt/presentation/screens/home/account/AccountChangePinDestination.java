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
public final class AccountChangePinDestination {
    public static final AccountChangePinDestination INSTANCE = new AccountChangePinDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35034a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0460b());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.AccountChangePinDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35034a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AccountChangePinDestination);
    }

    public int hashCode() {
        return -735268449;
    }

    public final KSerializer<AccountChangePinDestination> serializer() {
        return c();
    }

    public String toString() {
        return "AccountChangePinDestination";
    }
}
