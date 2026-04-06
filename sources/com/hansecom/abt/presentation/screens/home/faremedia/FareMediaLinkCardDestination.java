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
public final class FareMediaLinkCardDestination {
    public static final FareMediaLinkCardDestination INSTANCE = new FareMediaLinkCardDestination();

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Lazy f35942a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new C0534c());

    public static final /* synthetic */ KSerializer b() {
        return new ObjectSerializer("com.hansecom.abt.presentation.screens.home.faremedia.FareMediaLinkCardDestination", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ KSerializer c() {
        return (KSerializer) f35942a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof FareMediaLinkCardDestination);
    }

    public int hashCode() {
        return 1374900348;
    }

    public final KSerializer<FareMediaLinkCardDestination> serializer() {
        return c();
    }

    public String toString() {
        return "FareMediaLinkCardDestination";
    }
}
