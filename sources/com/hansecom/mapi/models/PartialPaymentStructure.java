package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class PartialPaymentStructure {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39518a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39519b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f39520c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f39521d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PartialPaymentStructure> serializer() {
            return PartialPaymentStructure$$serializer.f39522a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PartialPaymentStructure(int i2, Integer num, String str, Boolean bool, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39518a = null;
        } else {
            this.f39518a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39519b = null;
        } else {
            this.f39519b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39520c = null;
        } else {
            this.f39520c = bool;
        }
        if ((i2 & 8) == 0) {
            this.f39521d = null;
        } else {
            this.f39521d = num2;
        }
    }

    public static final /* synthetic */ void a(PartialPaymentStructure partialPaymentStructure, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || partialPaymentStructure.f39518a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, partialPaymentStructure.f39518a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || partialPaymentStructure.f39519b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, partialPaymentStructure.f39519b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || partialPaymentStructure.f39520c != null) {
            compositeEncoder.m(serialDescriptor, 2, BooleanSerializer.f42073a, partialPaymentStructure.f39520c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || partialPaymentStructure.f39521d != null) {
            compositeEncoder.m(serialDescriptor, 3, IntSerializer.f42129a, partialPaymentStructure.f39521d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialPaymentStructure)) {
            return false;
        }
        PartialPaymentStructure partialPaymentStructure = (PartialPaymentStructure) obj;
        return Intrinsics.d(this.f39518a, partialPaymentStructure.f39518a) && Intrinsics.d(this.f39519b, partialPaymentStructure.f39519b) && Intrinsics.d(this.f39520c, partialPaymentStructure.f39520c) && Intrinsics.d(this.f39521d, partialPaymentStructure.f39521d);
    }

    public int hashCode() {
        Integer num = this.f39518a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39519b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f39520c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.f39521d;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "PartialPaymentStructure(paymentMethodId=" + this.f39518a + ", paymentReference=" + this.f39519b + ", isStoredValuePayment=" + this.f39520c + ", amount=" + this.f39521d + ')';
    }
}
