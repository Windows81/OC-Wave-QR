package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class AdminPhysicalCards {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39200a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f39201b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdminPhysicalCards> serializer() {
            return AdminPhysicalCards$$serializer.f39202a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AdminPhysicalCards(int i2, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39200a = null;
        } else {
            this.f39200a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39201b = null;
        } else {
            this.f39201b = num;
        }
    }

    public static final /* synthetic */ void a(AdminPhysicalCards adminPhysicalCards, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || adminPhysicalCards.f39200a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, adminPhysicalCards.f39200a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || adminPhysicalCards.f39201b != null) {
            compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, adminPhysicalCards.f39201b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdminPhysicalCards)) {
            return false;
        }
        AdminPhysicalCards adminPhysicalCards = (AdminPhysicalCards) obj;
        return Intrinsics.d(this.f39200a, adminPhysicalCards.f39200a) && Intrinsics.d(this.f39201b, adminPhysicalCards.f39201b);
    }

    public int hashCode() {
        String str = this.f39200a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f39201b;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "AdminPhysicalCards(cardNumber=" + this.f39200a + ", securityCode=" + this.f39201b + ')';
    }
}
