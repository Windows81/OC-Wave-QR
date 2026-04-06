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
public final class CardOptionsDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36515a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsDestination> serializer() {
            return CardOptionsDestination$$serializer.f36516a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsDestination$$serializer.f36516a.a());
        }
        this.f36515a = str;
    }

    public final String a() {
        return this.f36515a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsDestination) && Intrinsics.d(this.f36515a, ((CardOptionsDestination) obj).f36515a);
    }

    public int hashCode() {
        return this.f36515a.hashCode();
    }

    public String toString() {
        String str = this.f36515a;
        return "CardOptionsDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36515a = str;
    }
}
