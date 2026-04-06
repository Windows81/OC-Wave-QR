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
public final class AccountChangeQuestionsGraph {
    public static final AccountChangeQuestionsGraph INSTANCE = new AccountChangeQuestionsGraph();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35036a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0463d());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.AccountChangeQuestionsGraph", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35036a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AccountChangeQuestionsGraph);
    }

    public int hashCode() {
        return -2101334425;
    }

    public final KSerializer<AccountChangeQuestionsGraph> serializer() {
        return c();
    }

    public String toString() {
        return "AccountChangeQuestionsGraph";
    }
}
