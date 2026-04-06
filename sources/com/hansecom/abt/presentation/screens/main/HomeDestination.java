package com.hansecom.abt.presentation.screens.main;

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
public final class HomeDestination {
    public static final HomeDestination INSTANCE = new HomeDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f37551a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0617f());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.main.HomeDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f37551a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof HomeDestination);
    }

    public int hashCode() {
        return -479172461;
    }

    public final KSerializer<HomeDestination> serializer() {
        return c();
    }

    public String toString() {
        return "HomeDestination";
    }
}
