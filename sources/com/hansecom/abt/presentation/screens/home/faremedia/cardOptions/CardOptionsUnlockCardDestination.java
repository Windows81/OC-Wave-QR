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
public final class CardOptionsUnlockCardDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36573a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsUnlockCardDestination> serializer() {
            return CardOptionsUnlockCardDestination$$serializer.f36574a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsUnlockCardDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsUnlockCardDestination$$serializer.f36574a.a());
        }
        this.f36573a = str;
    }

    public final String a() {
        return this.f36573a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsUnlockCardDestination) && Intrinsics.d(this.f36573a, ((CardOptionsUnlockCardDestination) obj).f36573a);
    }

    public int hashCode() {
        return this.f36573a.hashCode();
    }

    public String toString() {
        String str = this.f36573a;
        return "CardOptionsUnlockCardDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsUnlockCardDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36573a = str;
    }
}
