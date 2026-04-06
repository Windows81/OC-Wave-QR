package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class FareMediaMoneyLoadRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39365a;

    /* renamed from: b  reason: collision with root package name */
    public final PaymentMethodShortened f39366b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareMediaMoneyLoadRequest> serializer() {
            return FareMediaMoneyLoadRequest$$serializer.f39367a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareMediaMoneyLoadRequest(int i2, String str, PaymentMethodShortened paymentMethodShortened, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39365a = null;
        } else {
            this.f39365a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39366b = null;
        } else {
            this.f39366b = paymentMethodShortened;
        }
    }

    public static final /* synthetic */ void a(FareMediaMoneyLoadRequest fareMediaMoneyLoadRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || fareMediaMoneyLoadRequest.f39365a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, fareMediaMoneyLoadRequest.f39365a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareMediaMoneyLoadRequest.f39366b != null) {
            compositeEncoder.m(serialDescriptor, 1, PaymentMethodShortened$$serializer.f39536a, fareMediaMoneyLoadRequest.f39366b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMediaMoneyLoadRequest)) {
            return false;
        }
        FareMediaMoneyLoadRequest fareMediaMoneyLoadRequest = (FareMediaMoneyLoadRequest) obj;
        return Intrinsics.d(this.f39365a, fareMediaMoneyLoadRequest.f39365a) && Intrinsics.d(this.f39366b, fareMediaMoneyLoadRequest.f39366b);
    }

    public int hashCode() {
        String str = this.f39365a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentMethodShortened paymentMethodShortened = this.f39366b;
        if (paymentMethodShortened != null) {
            i2 = paymentMethodShortened.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "FareMediaMoneyLoadRequest(amount=" + this.f39365a + ", paymentMethod=" + this.f39366b + ')';
    }
}
