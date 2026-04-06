package com.hansecom.abt.presentation.screens.helpRequest;

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
public final class HelpGraph {
    public static final HelpGraph INSTANCE = new HelpGraph();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f34821a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0435l());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.helpRequest.HelpGraph", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f34821a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof HelpGraph);
    }

    public int hashCode() {
        return 1637821044;
    }

    public final KSerializer<HelpGraph> serializer() {
        return c();
    }

    public String toString() {
        return "HelpGraph";
    }
}
