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
public final class HardUpdateDestination {
    public static final HardUpdateDestination INSTANCE = new HardUpdateDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f37550a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0616e());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.main.HardUpdateDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f37550a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof HardUpdateDestination);
    }

    public int hashCode() {
        return 1759233470;
    }

    public final KSerializer<HardUpdateDestination> serializer() {
        return c();
    }

    public String toString() {
        return "HardUpdateDestination";
    }
}
