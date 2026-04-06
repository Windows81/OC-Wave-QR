package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class CardOptionsFareCappingDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36518a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsFareCappingDestination> serializer() {
            return CardOptionsFareCappingDestination$$serializer.f36519a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsFareCappingDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsFareCappingDestination$$serializer.f36519a.a());
        }
        this.f36518a = str;
    }

    public final String a() {
        return this.f36518a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsFareCappingDestination) && Intrinsics.d(this.f36518a, ((CardOptionsFareCappingDestination) obj).f36518a);
    }

    public int hashCode() {
        return this.f36518a.hashCode();
    }

    public String toString() {
        String str = this.f36518a;
        return "CardOptionsFareCappingDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsFareCappingDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36518a = str;
    }
}
