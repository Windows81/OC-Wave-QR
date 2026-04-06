package com.hansecom.abt.presentation.screens.home.more;

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
public final class MoreGraph {
    public static final MoreGraph INSTANCE = new MoreGraph();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f37430a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new g());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.more.MoreGraph", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f37430a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof MoreGraph);
    }

    public int hashCode() {
        return -1858719722;
    }

    public final KSerializer<MoreGraph> serializer() {
        return c();
    }

    public String toString() {
        return "MoreGraph";
    }
}
