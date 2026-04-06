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
public final class AccountChangePasswordDestination {
    public static final AccountChangePasswordDestination INSTANCE = new AccountChangePasswordDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35033a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0450a());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.AccountChangePasswordDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35033a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AccountChangePasswordDestination);
    }

    public int hashCode() {
        return -1382069299;
    }

    public final KSerializer<AccountChangePasswordDestination> serializer() {
        return c();
    }

    public String toString() {
        return "AccountChangePasswordDestination";
    }
}
