package com.hansecom.mapi.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class CardPurchaseDefaults {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f39241d = {null, new ArrayListSerializer(IntSerializer.f42129a), null};

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39242a;

    /* renamed from: b  reason: collision with root package name */
    public final List f39243b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f39244c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardPurchaseDefaults> serializer() {
            return CardPurchaseDefaults$$serializer.f39245a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ CardPurchaseDefaults(int i2, Integer num, List list, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39242a = null;
        } else {
            this.f39242a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39243b = null;
        } else {
            this.f39243b = list;
        }
        if ((i2 & 4) == 0) {
            this.f39244c = null;
        } else {
            this.f39244c = num2;
        }
    }

    public static final /* synthetic */ void e(CardPurchaseDefaults cardPurchaseDefaults, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39241d;
        if (compositeEncoder.w(serialDescriptor, 0) || cardPurchaseDefaults.f39242a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, cardPurchaseDefaults.f39242a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || cardPurchaseDefaults.f39243b != null) {
            compositeEncoder.m(serialDescriptor, 1, kSerializerArr[1], cardPurchaseDefaults.f39243b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || cardPurchaseDefaults.f39244c != null) {
            compositeEncoder.m(serialDescriptor, 2, IntSerializer.f42129a, cardPurchaseDefaults.f39244c);
        }
    }

    public final Integer b() {
        return this.f39242a;
    }

    public final List c() {
        return this.f39243b;
    }

    public final Integer d() {
        return this.f39244c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardPurchaseDefaults)) {
            return false;
        }
        CardPurchaseDefaults cardPurchaseDefaults = (CardPurchaseDefaults) obj;
        return Intrinsics.d(this.f39242a, cardPurchaseDefaults.f39242a) && Intrinsics.d(this.f39243b, cardPurchaseDefaults.f39243b) && Intrinsics.d(this.f39244c, cardPurchaseDefaults.f39244c);
    }

    public int hashCode() {
        Integer num = this.f39242a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f39243b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f39244c;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "CardPurchaseDefaults(riderTypeId=" + this.f39242a + ", topUpAmounts=" + this.f39243b + ", topUpValue=" + this.f39244c + ')';
    }
}
