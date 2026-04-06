package com.hansecom.abt.presentation.screens.guest;

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
public final class GuestGraph {
    public static final GuestGraph INSTANCE = new GuestGraph();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f34698a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new i());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.guest.GuestGraph", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f34698a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof GuestGraph);
    }

    public int hashCode() {
        return 480976389;
    }

    public final KSerializer<GuestGraph> serializer() {
        return c();
    }

    public String toString() {
        return "GuestGraph";
    }
}
