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
public final class AccountInformationDestination {
    public static final AccountInformationDestination INSTANCE = new AccountInformationDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35045a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0465f());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.AccountInformationDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35045a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AccountInformationDestination);
    }

    public int hashCode() {
        return 756981848;
    }

    public final KSerializer<AccountInformationDestination> serializer() {
        return c();
    }

    public String toString() {
        return "AccountInformationDestination";
    }
}
