package com.hansecom.abt.presentation.screens.auth;

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
public final class LoginDestination {
    public static final LoginDestination INSTANCE = new LoginDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f34257a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new G());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.auth.LoginDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f34257a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof LoginDestination);
    }

    public int hashCode() {
        return -522908046;
    }

    public final KSerializer<LoginDestination> serializer() {
        return c();
    }

    public String toString() {
        return "LoginDestination";
    }
}
