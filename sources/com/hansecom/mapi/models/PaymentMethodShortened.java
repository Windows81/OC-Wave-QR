package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class PaymentMethodShortened {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Long f39533a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f39534b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39535c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PaymentMethodShortened> serializer() {
            return PaymentMethodShortened$$serializer.f39536a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PaymentMethodShortened(int i2, Long l2, Boolean bool, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39533a = null;
        } else {
            this.f39533a = l2;
        }
        if ((i2 & 2) == 0) {
            this.f39534b = null;
        } else {
            this.f39534b = bool;
        }
        if ((i2 & 4) == 0) {
            this.f39535c = null;
        } else {
            this.f39535c = str;
        }
    }

    public static final /* synthetic */ void a(PaymentMethodShortened paymentMethodShortened, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || paymentMethodShortened.f39533a != null) {
            compositeEncoder.m(serialDescriptor, 0, LongSerializer.f42142a, paymentMethodShortened.f39533a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || paymentMethodShortened.f39534b != null) {
            compositeEncoder.m(serialDescriptor, 1, BooleanSerializer.f42073a, paymentMethodShortened.f39534b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || paymentMethodShortened.f39535c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, paymentMethodShortened.f39535c);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodShortened)) {
            return false;
        }
        PaymentMethodShortened paymentMethodShortened = (PaymentMethodShortened) obj;
        return Intrinsics.d(this.f39533a, paymentMethodShortened.f39533a) && Intrinsics.d(this.f39534b, paymentMethodShortened.f39534b) && Intrinsics.d(this.f39535c, paymentMethodShortened.f39535c);
    }

    public int hashCode() {
        Long l2 = this.f39533a;
        int i2 = 0;
        int hashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Boolean bool = this.f39534b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f39535c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "PaymentMethodShortened(id=" + this.f39533a + ", isStoredValuePayment=" + this.f39534b + ", cardType=" + this.f39535c + ')';
    }

    public PaymentMethodShortened(Long l2, Boolean bool, String str) {
        this.f39533a = l2;
        this.f39534b = bool;
        this.f39535c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentMethodShortened(Long l2, Boolean bool, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : l2, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : str);
    }
}
