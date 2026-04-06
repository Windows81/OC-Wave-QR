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
final class ResetPasswordDestination {
    public static final ResetPasswordDestination INSTANCE = new ResetPasswordDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f34268a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new I());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.auth.ResetPasswordDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f34268a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof ResetPasswordDestination);
    }

    public int hashCode() {
        return -1092451023;
    }

    public final KSerializer<ResetPasswordDestination> serializer() {
        return c();
    }

    public String toString() {
        return "ResetPasswordDestination";
    }
}
