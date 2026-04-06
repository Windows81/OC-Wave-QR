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
public final class PaymentMethodConfiguration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39531a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PaymentMethodConfiguration> serializer() {
            return PaymentMethodConfiguration$$serializer.f39532a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PaymentMethodConfiguration(int i2, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39531a = null;
        } else {
            this.f39531a = num;
        }
    }

    public static final /* synthetic */ void b(PaymentMethodConfiguration paymentMethodConfiguration, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || paymentMethodConfiguration.f39531a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, paymentMethodConfiguration.f39531a);
        }
    }

    public final Integer a() {
        return this.f39531a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentMethodConfiguration) && Intrinsics.d(this.f39531a, ((PaymentMethodConfiguration) obj).f39531a);
    }

    public int hashCode() {
        Integer num = this.f39531a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "PaymentMethodConfiguration(maxPaymentMethods=" + this.f39531a + ')';
    }
}
