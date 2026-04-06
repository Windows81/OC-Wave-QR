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
public final class WelcomeDestination {
    public static final WelcomeDestination INSTANCE = new WelcomeDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f34272a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new J());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.auth.WelcomeDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f34272a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof WelcomeDestination);
    }

    public int hashCode() {
        return -584372839;
    }

    public final KSerializer<WelcomeDestination> serializer() {
        return c();
    }

    public String toString() {
        return "WelcomeDestination";
    }
}
