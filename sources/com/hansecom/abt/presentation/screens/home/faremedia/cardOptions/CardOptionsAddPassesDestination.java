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
public final class CardOptionsAddPassesDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36488a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsAddPassesDestination> serializer() {
            return CardOptionsAddPassesDestination$$serializer.f36489a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsAddPassesDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsAddPassesDestination$$serializer.f36489a.a());
        }
        this.f36488a = str;
    }

    public final String a() {
        return this.f36488a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsAddPassesDestination) && Intrinsics.d(this.f36488a, ((CardOptionsAddPassesDestination) obj).f36488a);
    }

    public int hashCode() {
        return this.f36488a.hashCode();
    }

    public String toString() {
        String str = this.f36488a;
        return "CardOptionsAddPassesDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsAddPassesDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36488a = str;
    }
}
