package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class FareProductAutoloadRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f39446a;

    /* renamed from: b  reason: collision with root package name */
    public final PaymentMethodShortened f39447b;

    /* renamed from: c  reason: collision with root package name */
    public final PaymentMethodShortened f39448c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareProductAutoloadRequest> serializer() {
            return FareProductAutoloadRequest$$serializer.f39449a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareProductAutoloadRequest(int i2, Boolean bool, PaymentMethodShortened paymentMethodShortened, PaymentMethodShortened paymentMethodShortened2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39446a = null;
        } else {
            this.f39446a = bool;
        }
        if ((i2 & 2) == 0) {
            this.f39447b = null;
        } else {
            this.f39447b = paymentMethodShortened;
        }
        if ((i2 & 4) == 0) {
            this.f39448c = null;
        } else {
            this.f39448c = paymentMethodShortened2;
        }
    }

    public static final /* synthetic */ void a(FareProductAutoloadRequest fareProductAutoloadRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || fareProductAutoloadRequest.f39446a != null) {
            compositeEncoder.m(serialDescriptor, 0, BooleanSerializer.f42073a, fareProductAutoloadRequest.f39446a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareProductAutoloadRequest.f39447b != null) {
            compositeEncoder.m(serialDescriptor, 1, PaymentMethodShortened$$serializer.f39536a, fareProductAutoloadRequest.f39447b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || fareProductAutoloadRequest.f39448c != null) {
            compositeEncoder.m(serialDescriptor, 2, PaymentMethodShortened$$serializer.f39536a, fareProductAutoloadRequest.f39448c);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareProductAutoloadRequest)) {
            return false;
        }
        FareProductAutoloadRequest fareProductAutoloadRequest = (FareProductAutoloadRequest) obj;
        return Intrinsics.d(this.f39446a, fareProductAutoloadRequest.f39446a) && Intrinsics.d(this.f39447b, fareProductAutoloadRequest.f39447b) && Intrinsics.d(this.f39448c, fareProductAutoloadRequest.f39448c);
    }

    public int hashCode() {
        Boolean bool = this.f39446a;
        int i2 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        PaymentMethodShortened paymentMethodShortened = this.f39447b;
        int hashCode2 = (hashCode + (paymentMethodShortened == null ? 0 : paymentMethodShortened.hashCode())) * 31;
        PaymentMethodShortened paymentMethodShortened2 = this.f39448c;
        if (paymentMethodShortened2 != null) {
            i2 = paymentMethodShortened2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "FareProductAutoloadRequest(paused=" + this.f39446a + ", primaryPaymentMethod=" + this.f39447b + ", backupPaymentMethod=" + this.f39448c + ')';
    }
}
