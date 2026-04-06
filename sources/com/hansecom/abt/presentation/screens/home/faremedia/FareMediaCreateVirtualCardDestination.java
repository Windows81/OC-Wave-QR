package com.hansecom.abt.presentation.screens.home.faremedia;

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
public final class FareMediaCreateVirtualCardDestination {
    public static final FareMediaCreateVirtualCardDestination INSTANCE = new FareMediaCreateVirtualCardDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35936a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0507a());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.faremedia.FareMediaCreateVirtualCardDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35936a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof FareMediaCreateVirtualCardDestination);
    }

    public int hashCode() {
        return -13708681;
    }

    public final KSerializer<FareMediaCreateVirtualCardDestination> serializer() {
        return c();
    }

    public String toString() {
        return "FareMediaCreateVirtualCardDestination";
    }
}
