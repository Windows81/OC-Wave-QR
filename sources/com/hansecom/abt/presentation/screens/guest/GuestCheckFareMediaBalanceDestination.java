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
public final class GuestCheckFareMediaBalanceDestination {
    public static final GuestCheckFareMediaBalanceDestination INSTANCE = new GuestCheckFareMediaBalanceDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f34696a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new g());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.guest.GuestCheckFareMediaBalanceDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f34696a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof GuestCheckFareMediaBalanceDestination);
    }

    public int hashCode() {
        return 176851273;
    }

    public final KSerializer<GuestCheckFareMediaBalanceDestination> serializer() {
        return c();
    }

    public String toString() {
        return "GuestCheckFareMediaBalanceDestination";
    }
}
