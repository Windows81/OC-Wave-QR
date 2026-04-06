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
public final class FareMediaGraph {
    public static final FareMediaGraph INSTANCE = new FareMediaGraph();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35941a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0532b());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.faremedia.FareMediaGraph", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35941a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof FareMediaGraph);
    }

    public int hashCode() {
        return -609228730;
    }

    public final KSerializer<FareMediaGraph> serializer() {
        return c();
    }

    public String toString() {
        return "FareMediaGraph";
    }
}
