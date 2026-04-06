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
public final class MainGraph {
    public static final MainGraph INSTANCE = new MainGraph();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f37557a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0619h());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.main.MainGraph", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f37557a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof MainGraph);
    }

    public int hashCode() {
        return -220834567;
    }

    public final KSerializer<MainGraph> serializer() {
        return c();
    }

    public String toString() {
        return "MainGraph";
    }
}
