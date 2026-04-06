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
public final class GuestDestination {
    public static final GuestDestination INSTANCE = new GuestDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f34697a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new h());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.guest.GuestDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f34697a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof GuestDestination);
    }

    public int hashCode() {
        return -1880097915;
    }

    public final KSerializer<GuestDestination> serializer() {
        return c();
    }

    public String toString() {
        return "GuestDestination";
    }
}
