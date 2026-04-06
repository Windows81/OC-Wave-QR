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
public final class CardOptionsCardHistoryDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36501a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsCardHistoryDestination> serializer() {
            return CardOptionsCardHistoryDestination$$serializer.f36502a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsCardHistoryDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsCardHistoryDestination$$serializer.f36502a.a());
        }
        this.f36501a = str;
    }

    public final String a() {
        return this.f36501a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsCardHistoryDestination) && Intrinsics.d(this.f36501a, ((CardOptionsCardHistoryDestination) obj).f36501a);
    }

    public int hashCode() {
        return this.f36501a.hashCode();
    }

    public String toString() {
        String str = this.f36501a;
        return "CardOptionsCardHistoryDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsCardHistoryDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36501a = str;
    }
}
