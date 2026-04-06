package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class CardOptionsCheckoutDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36507a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36508b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f36509c;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsCheckoutDestination> serializer() {
            return CardOptionsCheckoutDestination$$serializer.f36510a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsCheckoutDestination(int i2, String str, int i3, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i2 & 7)) {
            PluginExceptionsKt.a(i2, 7, CardOptionsCheckoutDestination$$serializer.f36510a.a());
        }
        this.f36507a = str;
        this.f36508b = i3;
        this.f36509c = num;
    }

    public static final /* synthetic */ void d(CardOptionsCheckoutDestination cardOptionsCheckoutDestination, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, cardOptionsCheckoutDestination.f36507a);
        compositeEncoder.r(serialDescriptor, 1, cardOptionsCheckoutDestination.f36508b);
        compositeEncoder.m(serialDescriptor, 2, IntSerializer.f42129a, cardOptionsCheckoutDestination.f36509c);
    }

    public final String a() {
        return this.f36507a;
    }

    public final Integer b() {
        return this.f36509c;
    }

    public final int c() {
        return this.f36508b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardOptionsCheckoutDestination)) {
            return false;
        }
        CardOptionsCheckoutDestination cardOptionsCheckoutDestination = (CardOptionsCheckoutDestination) obj;
        return Intrinsics.d(this.f36507a, cardOptionsCheckoutDestination.f36507a) && this.f36508b == cardOptionsCheckoutDestination.f36508b && Intrinsics.d(this.f36509c, cardOptionsCheckoutDestination.f36509c);
    }

    public int hashCode() {
        int hashCode = ((this.f36507a.hashCode() * 31) + Integer.hashCode(this.f36508b)) * 31;
        Integer num = this.f36509c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.f36507a;
        int i2 = this.f36508b;
        Integer num = this.f36509c;
        return "CardOptionsCheckoutDestination(fareMediaId=" + str + ", passId=" + i2 + ", groupSize=" + num + ")";
    }

    public CardOptionsCheckoutDestination(String str, int i2, Integer num) {
        Intrinsics.i(str, "fareMediaId");
        this.f36507a = str;
        this.f36508b = i2;
        this.f36509c = num;
    }
}
