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
public final class CardOptionsInstitutionsDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36528a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsInstitutionsDestination> serializer() {
            return CardOptionsInstitutionsDestination$$serializer.f36529a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsInstitutionsDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsInstitutionsDestination$$serializer.f36529a.a());
        }
        this.f36528a = str;
    }

    public final String a() {
        return this.f36528a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsInstitutionsDestination) && Intrinsics.d(this.f36528a, ((CardOptionsInstitutionsDestination) obj).f36528a);
    }

    public int hashCode() {
        return this.f36528a.hashCode();
    }

    public String toString() {
        String str = this.f36528a;
        return "CardOptionsInstitutionsDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsInstitutionsDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36528a = str;
    }
}
