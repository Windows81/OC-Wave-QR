package com.hansecom.abt.presentation.screens.home.account.address;

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
public final class ChangeAddressDestination {
    public static final ChangeAddressDestination INSTANCE = new ChangeAddressDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35134a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0455e());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35134a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof ChangeAddressDestination);
    }

    public int hashCode() {
        return -1813931813;
    }

    public final KSerializer<ChangeAddressDestination> serializer() {
        return c();
    }

    public String toString() {
        return "ChangeAddressDestination";
    }
}
