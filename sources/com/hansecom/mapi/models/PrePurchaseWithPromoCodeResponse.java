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
public final class PrePurchaseWithPromoCodeResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39541a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f39542b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f39543c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f39544d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PrePurchaseWithPromoCodeResponse> serializer() {
            return PrePurchaseWithPromoCodeResponse$$serializer.f39545a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PrePurchaseWithPromoCodeResponse(int i2, Integer num, Integer num2, Integer num3, Integer num4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39541a = null;
        } else {
            this.f39541a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39542b = null;
        } else {
            this.f39542b = num2;
        }
        if ((i2 & 4) == 0) {
            this.f39543c = null;
        } else {
            this.f39543c = num3;
        }
        if ((i2 & 8) == 0) {
            this.f39544d = null;
        } else {
            this.f39544d = num4;
        }
    }

    public static final /* synthetic */ void e(PrePurchaseWithPromoCodeResponse prePurchaseWithPromoCodeResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || prePurchaseWithPromoCodeResponse.f39541a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, prePurchaseWithPromoCodeResponse.f39541a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || prePurchaseWithPromoCodeResponse.f39542b != null) {
            compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, prePurchaseWithPromoCodeResponse.f39542b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || prePurchaseWithPromoCodeResponse.f39543c != null) {
            compositeEncoder.m(serialDescriptor, 2, IntSerializer.f42129a, prePurchaseWithPromoCodeResponse.f39543c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || prePurchaseWithPromoCodeResponse.f39544d != null) {
            compositeEncoder.m(serialDescriptor, 3, IntSerializer.f42129a, prePurchaseWithPromoCodeResponse.f39544d);
        }
    }

    public final Integer a() {
        return this.f39543c;
    }

    public final Integer b() {
        return this.f39542b;
    }

    public final Integer c() {
        return this.f39541a;
    }

    public final Integer d() {
        return this.f39544d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrePurchaseWithPromoCodeResponse)) {
            return false;
        }
        PrePurchaseWithPromoCodeResponse prePurchaseWithPromoCodeResponse = (PrePurchaseWithPromoCodeResponse) obj;
        return Intrinsics.d(this.f39541a, prePurchaseWithPromoCodeResponse.f39541a) && Intrinsics.d(this.f39542b, prePurchaseWithPromoCodeResponse.f39542b) && Intrinsics.d(this.f39543c, prePurchaseWithPromoCodeResponse.f39543c) && Intrinsics.d(this.f39544d, prePurchaseWithPromoCodeResponse.f39544d);
    }

    public int hashCode() {
        Integer num = this.f39541a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f39542b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f39543c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f39544d;
        if (num4 != null) {
            i2 = num4.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "PrePurchaseWithPromoCodeResponse(originalPrice=" + this.f39541a + ", couponValue=" + this.f39542b + ", couponPercentage=" + this.f39543c + ", priceToPay=" + this.f39544d + ')';
    }
}
