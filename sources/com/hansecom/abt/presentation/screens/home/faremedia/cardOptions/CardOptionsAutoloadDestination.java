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
public final class CardOptionsAutoloadDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36494a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsAutoloadDestination> serializer() {
            return CardOptionsAutoloadDestination$$serializer.f36495a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsAutoloadDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsAutoloadDestination$$serializer.f36495a.a());
        }
        this.f36494a = str;
    }

    public final String a() {
        return this.f36494a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsAutoloadDestination) && Intrinsics.d(this.f36494a, ((CardOptionsAutoloadDestination) obj).f36494a);
    }

    public int hashCode() {
        return this.f36494a.hashCode();
    }

    public String toString() {
        String str = this.f36494a;
        return "CardOptionsAutoloadDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsAutoloadDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36494a = str;
    }
}
