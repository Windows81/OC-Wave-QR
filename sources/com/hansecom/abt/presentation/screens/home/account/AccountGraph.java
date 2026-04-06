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
public final class AccountGraph {
    public static final AccountGraph INSTANCE = new AccountGraph();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35044a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0464e());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.AccountGraph", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35044a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AccountGraph);
    }

    public int hashCode() {
        return 1807187320;
    }

    public final KSerializer<AccountGraph> serializer() {
        return c();
    }

    public String toString() {
        return "AccountGraph";
    }
}
