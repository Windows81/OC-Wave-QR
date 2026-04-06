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
public final class LockDestination {
    public static final LockDestination INSTANCE = new LockDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f37552a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0618g());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.main.LockDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f37552a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof LockDestination);
    }

    public int hashCode() {
        return 669626567;
    }

    public final KSerializer<LockDestination> serializer() {
        return c();
    }

    public String toString() {
        return "LockDestination";
    }
}
