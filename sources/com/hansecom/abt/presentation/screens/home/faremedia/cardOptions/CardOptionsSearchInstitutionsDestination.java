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
public final class CardOptionsSearchInstitutionsDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36567a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsSearchInstitutionsDestination> serializer() {
            return CardOptionsSearchInstitutionsDestination$$serializer.f36568a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsSearchInstitutionsDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsSearchInstitutionsDestination$$serializer.f36568a.a());
        }
        this.f36567a = str;
    }

    public final String a() {
        return this.f36567a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsSearchInstitutionsDestination) && Intrinsics.d(this.f36567a, ((CardOptionsSearchInstitutionsDestination) obj).f36567a);
    }

    public int hashCode() {
        return this.f36567a.hashCode();
    }

    public String toString() {
        String str = this.f36567a;
        return "CardOptionsSearchInstitutionsDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsSearchInstitutionsDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36567a = str;
    }
}
