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
public final class CardOptionsPassesDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36559a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsPassesDestination> serializer() {
            return CardOptionsPassesDestination$$serializer.f36560a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsPassesDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsPassesDestination$$serializer.f36560a.a());
        }
        this.f36559a = str;
    }

    public final String a() {
        return this.f36559a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsPassesDestination) && Intrinsics.d(this.f36559a, ((CardOptionsPassesDestination) obj).f36559a);
    }

    public int hashCode() {
        return this.f36559a.hashCode();
    }

    public String toString() {
        String str = this.f36559a;
        return "CardOptionsPassesDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsPassesDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36559a = str;
    }
}
