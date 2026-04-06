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
public final class ChangeAddressGraph {
    public static final ChangeAddressGraph INSTANCE = new ChangeAddressGraph();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35135a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0456f());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressGraph", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35135a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof ChangeAddressGraph);
    }

    public int hashCode() {
        return -400886821;
    }

    public final KSerializer<ChangeAddressGraph> serializer() {
        return c();
    }

    public String toString() {
        return "ChangeAddressGraph";
    }
}
