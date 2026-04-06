package com.hansecom.abt.presentation.screens.auth.register;

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
public final class Registration {
    public static final Registration INSTANCE = new Registration();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f34428a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new N());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.auth.register.Registration", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f34428a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof Registration);
    }

    public int hashCode() {
        return 729472247;
    }

    public final KSerializer<Registration> serializer() {
        return c();
    }

    public String toString() {
        return "Registration";
    }
}
