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
public final class BarcodeDisplayDestination {
    public static final BarcodeDisplayDestination INSTANCE = new BarcodeDisplayDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f37523a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0612a());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.main.BarcodeDisplayDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f37523a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof BarcodeDisplayDestination);
    }

    public int hashCode() {
        return -385662864;
    }

    public final KSerializer<BarcodeDisplayDestination> serializer() {
        return c();
    }

    public String toString() {
        return "BarcodeDisplayDestination";
    }
}
