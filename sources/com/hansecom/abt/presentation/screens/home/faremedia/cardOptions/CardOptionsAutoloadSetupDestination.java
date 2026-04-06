package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class CardOptionsAutoloadSetupDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36497a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f36498b;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsAutoloadSetupDestination> serializer() {
            return CardOptionsAutoloadSetupDestination$$serializer.f36499a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsAutoloadSetupDestination(int i2, String str, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, CardOptionsAutoloadSetupDestination$$serializer.f36499a.a());
        }
        this.f36497a = str;
        this.f36498b = l2;
    }

    public static final /* synthetic */ void c(CardOptionsAutoloadSetupDestination cardOptionsAutoloadSetupDestination, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, cardOptionsAutoloadSetupDestination.f36497a);
        compositeEncoder.m(serialDescriptor, 1, LongSerializer.f42142a, cardOptionsAutoloadSetupDestination.f36498b);
    }

    public final Long a() {
        return this.f36498b;
    }

    public final String b() {
        return this.f36497a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardOptionsAutoloadSetupDestination)) {
            return false;
        }
        CardOptionsAutoloadSetupDestination cardOptionsAutoloadSetupDestination = (CardOptionsAutoloadSetupDestination) obj;
        return Intrinsics.d(this.f36497a, cardOptionsAutoloadSetupDestination.f36497a) && Intrinsics.d(this.f36498b, cardOptionsAutoloadSetupDestination.f36498b);
    }

    public int hashCode() {
        int hashCode = this.f36497a.hashCode() * 31;
        Long l2 = this.f36498b;
        return hashCode + (l2 == null ? 0 : l2.hashCode());
    }

    public String toString() {
        String str = this.f36497a;
        Long l2 = this.f36498b;
        return "CardOptionsAutoloadSetupDestination(fareMediaId=" + str + ", autoloadId=" + l2 + ")";
    }

    public CardOptionsAutoloadSetupDestination(String str, Long l2) {
        Intrinsics.i(str, "fareMediaId");
        this.f36497a = str;
        this.f36498b = l2;
    }
}
