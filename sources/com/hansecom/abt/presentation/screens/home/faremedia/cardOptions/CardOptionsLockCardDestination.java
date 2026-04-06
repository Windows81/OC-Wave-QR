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
public final class CardOptionsLockCardDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36531a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsLockCardDestination> serializer() {
            return CardOptionsLockCardDestination$$serializer.f36532a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsLockCardDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsLockCardDestination$$serializer.f36532a.a());
        }
        this.f36531a = str;
    }

    public final String a() {
        return this.f36531a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsLockCardDestination) && Intrinsics.d(this.f36531a, ((CardOptionsLockCardDestination) obj).f36531a);
    }

    public int hashCode() {
        return this.f36531a.hashCode();
    }

    public String toString() {
        String str = this.f36531a;
        return "CardOptionsLockCardDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsLockCardDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36531a = str;
    }
}
