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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class ProductOrderRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f39562e = {null, null, null, new ArrayListSerializer(ProductConfiguration$$serializer.f39561a)};

    /* renamed from: a  reason: collision with root package name */
    public final Long f39563a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39564b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f39565c;

    /* renamed from: d  reason: collision with root package name */
    public final List f39566d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProductOrderRequest> serializer() {
            return ProductOrderRequest$$serializer.f39567a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ProductOrderRequest(int i2, Long l2, String str, Boolean bool, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39563a = null;
        } else {
            this.f39563a = l2;
        }
        if ((i2 & 2) == 0) {
            this.f39564b = null;
        } else {
            this.f39564b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39565c = null;
        } else {
            this.f39565c = bool;
        }
        if ((i2 & 8) == 0) {
            this.f39566d = null;
        } else {
            this.f39566d = list;
        }
    }

    public static final /* synthetic */ void b(ProductOrderRequest productOrderRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39562e;
        if (compositeEncoder.w(serialDescriptor, 0) || productOrderRequest.f39563a != null) {
            compositeEncoder.m(serialDescriptor, 0, LongSerializer.f42142a, productOrderRequest.f39563a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || productOrderRequest.f39564b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, productOrderRequest.f39564b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || productOrderRequest.f39565c != null) {
            compositeEncoder.m(serialDescriptor, 2, BooleanSerializer.f42073a, productOrderRequest.f39565c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || productOrderRequest.f39566d != null) {
            compositeEncoder.m(serialDescriptor, 3, kSerializerArr[3], productOrderRequest.f39566d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductOrderRequest)) {
            return false;
        }
        ProductOrderRequest productOrderRequest = (ProductOrderRequest) obj;
        return Intrinsics.d(this.f39563a, productOrderRequest.f39563a) && Intrinsics.d(this.f39564b, productOrderRequest.f39564b) && Intrinsics.d(this.f39565c, productOrderRequest.f39565c) && Intrinsics.d(this.f39566d, productOrderRequest.f39566d);
    }

    public int hashCode() {
        Long l2 = this.f39563a;
        int i2 = 0;
        int hashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.f39564b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f39565c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f39566d;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "ProductOrderRequest(paymentMethodId=" + this.f39563a + ", promoCode=" + this.f39564b + ", isStoredValuePayment=" + this.f39565c + ", products=" + this.f39566d + ')';
    }
}
