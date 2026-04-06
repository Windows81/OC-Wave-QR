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
public final class CardOptionsRemoveCardDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36562a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsRemoveCardDestination> serializer() {
            return CardOptionsRemoveCardDestination$$serializer.f36563a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsRemoveCardDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsRemoveCardDestination$$serializer.f36563a.a());
        }
        this.f36562a = str;
    }

    public final String a() {
        return this.f36562a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsRemoveCardDestination) && Intrinsics.d(this.f36562a, ((CardOptionsRemoveCardDestination) obj).f36562a);
    }

    public int hashCode() {
        return this.f36562a.hashCode();
    }

    public String toString() {
        String str = this.f36562a;
        return "CardOptionsRemoveCardDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsRemoveCardDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36562a = str;
    }
}
