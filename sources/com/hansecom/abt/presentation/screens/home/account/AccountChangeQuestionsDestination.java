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
public final class AccountChangeQuestionsDestination {
    public static final AccountChangeQuestionsDestination INSTANCE = new AccountChangeQuestionsDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35035a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0461c());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.AccountChangeQuestionsDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35035a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AccountChangeQuestionsDestination);
    }

    public int hashCode() {
        return -165954969;
    }

    public final KSerializer<AccountChangeQuestionsDestination> serializer() {
        return c();
    }

    public String toString() {
        return "AccountChangeQuestionsDestination";
    }
}
