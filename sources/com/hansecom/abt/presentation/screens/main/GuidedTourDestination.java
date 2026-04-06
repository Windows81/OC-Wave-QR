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
public final class GuidedTourDestination {
    public static final GuidedTourDestination INSTANCE = new GuidedTourDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f37546a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0615d());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.main.GuidedTourDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f37546a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof GuidedTourDestination);
    }

    public int hashCode() {
        return -1062967182;
    }

    public final KSerializer<GuidedTourDestination> serializer() {
        return c();
    }

    public String toString() {
        return "GuidedTourDestination";
    }
}
