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
public final class AuthGraph {
    public static final AuthGraph INSTANCE = new AuthGraph();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f34246a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0398a());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.auth.AuthGraph", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f34246a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof AuthGraph);
    }

    public int hashCode() {
        return 1006441369;
    }

    public final KSerializer<AuthGraph> serializer() {
        return c();
    }

    public String toString() {
        return "AuthGraph";
    }
}
