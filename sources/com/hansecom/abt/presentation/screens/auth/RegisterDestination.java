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
final class RegisterDestination {
    public static final RegisterDestination INSTANCE = new RegisterDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f34258a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new H());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.auth.RegisterDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f34258a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof RegisterDestination);
    }

    public int hashCode() {
        return -771971906;
    }

    public final KSerializer<RegisterDestination> serializer() {
        return c();
    }

    public String toString() {
        return "RegisterDestination";
    }
}
