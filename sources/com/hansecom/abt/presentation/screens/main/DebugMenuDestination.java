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
public final class DebugMenuDestination {
    public static final DebugMenuDestination INSTANCE = new DebugMenuDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f37544a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0614c());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.main.DebugMenuDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f37544a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof DebugMenuDestination);
    }

    public int hashCode() {
        return 172208632;
    }

    public final KSerializer<DebugMenuDestination> serializer() {
        return c();
    }

    public String toString() {
        return "DebugMenuDestination";
    }
}
