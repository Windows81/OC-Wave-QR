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
public final class BarcodeDisplayHelpDestination {
    public static final BarcodeDisplayHelpDestination INSTANCE = new BarcodeDisplayHelpDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f37524a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0613b());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.main.BarcodeDisplayHelpDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f37524a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof BarcodeDisplayHelpDestination);
    }

    public int hashCode() {
        return 1301722479;
    }

    public final KSerializer<BarcodeDisplayHelpDestination> serializer() {
        return c();
    }

    public String toString() {
        return "BarcodeDisplayHelpDestination";
    }
}
