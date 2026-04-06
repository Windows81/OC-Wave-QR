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

@Metadata
@Serializable
public final class OfferConstraints {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39515a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f39516b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OfferConstraints> serializer() {
            return OfferConstraints$$serializer.f39517a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ OfferConstraints(int i2, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39515a = null;
        } else {
            this.f39515a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39516b = null;
        } else {
            this.f39516b = num2;
        }
    }

    public static final /* synthetic */ void a(OfferConstraints offerConstraints, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || offerConstraints.f39515a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, offerConstraints.f39515a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || offerConstraints.f39516b != null) {
            compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, offerConstraints.f39516b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferConstraints)) {
            return false;
        }
        OfferConstraints offerConstraints = (OfferConstraints) obj;
        return Intrinsics.d(this.f39515a, offerConstraints.f39515a) && Intrinsics.d(this.f39516b, offerConstraints.f39516b);
    }

    public int hashCode() {
        Integer num = this.f39515a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f39516b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "OfferConstraints(minQuantity=" + this.f39515a + ", maxQuantity=" + this.f39516b + ')';
    }
}
