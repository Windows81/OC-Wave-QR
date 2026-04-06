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
public final class CardOptionsConvertToVirtualDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36512a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsConvertToVirtualDestination> serializer() {
            return CardOptionsConvertToVirtualDestination$$serializer.f36513a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsConvertToVirtualDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsConvertToVirtualDestination$$serializer.f36513a.a());
        }
        this.f36512a = str;
    }

    public final String a() {
        return this.f36512a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsConvertToVirtualDestination) && Intrinsics.d(this.f36512a, ((CardOptionsConvertToVirtualDestination) obj).f36512a);
    }

    public int hashCode() {
        return this.f36512a.hashCode();
    }

    public String toString() {
        String str = this.f36512a;
        return "CardOptionsConvertToVirtualDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsConvertToVirtualDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36512a = str;
    }
}
