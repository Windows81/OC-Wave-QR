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
public final class PriorityGraph {
    public static final PriorityGraph INSTANCE = new PriorityGraph();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f37595a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new E());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.main.PriorityGraph", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f37595a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof PriorityGraph);
    }

    public int hashCode() {
        return -1018557970;
    }

    public final KSerializer<PriorityGraph> serializer() {
        return c();
    }

    public String toString() {
        return "PriorityGraph";
    }
}
