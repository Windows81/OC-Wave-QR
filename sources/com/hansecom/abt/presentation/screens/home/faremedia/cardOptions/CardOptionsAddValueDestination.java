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
public final class CardOptionsAddValueDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36491a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsAddValueDestination> serializer() {
            return CardOptionsAddValueDestination$$serializer.f36492a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsAddValueDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsAddValueDestination$$serializer.f36492a.a());
        }
        this.f36491a = str;
    }

    public final String a() {
        return this.f36491a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsAddValueDestination) && Intrinsics.d(this.f36491a, ((CardOptionsAddValueDestination) obj).f36491a);
    }

    public int hashCode() {
        return this.f36491a.hashCode();
    }

    public String toString() {
        String str = this.f36491a;
        return "CardOptionsAddValueDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsAddValueDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36491a = str;
    }
}
