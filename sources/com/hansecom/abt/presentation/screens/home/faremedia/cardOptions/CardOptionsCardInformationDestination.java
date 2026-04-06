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
public final class CardOptionsCardInformationDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36504a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsCardInformationDestination> serializer() {
            return CardOptionsCardInformationDestination$$serializer.f36505a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsCardInformationDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsCardInformationDestination$$serializer.f36505a.a());
        }
        this.f36504a = str;
    }

    public final String a() {
        return this.f36504a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsCardInformationDestination) && Intrinsics.d(this.f36504a, ((CardOptionsCardInformationDestination) obj).f36504a);
    }

    public int hashCode() {
        return this.f36504a.hashCode();
    }

    public String toString() {
        String str = this.f36504a;
        return "CardOptionsCardInformationDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsCardInformationDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36504a = str;
    }
}
