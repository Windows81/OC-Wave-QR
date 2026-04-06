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
public final class AdditionalPaymentInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39177a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39178b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39179c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdditionalPaymentInfo> serializer() {
            return AdditionalPaymentInfo$$serializer.f39180a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AdditionalPaymentInfo(int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39177a = null;
        } else {
            this.f39177a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39178b = null;
        } else {
            this.f39178b = str2;
        }
        if ((i2 & 4) == 0) {
            this.f39179c = null;
        } else {
            this.f39179c = str3;
        }
    }

    public static final /* synthetic */ void a(AdditionalPaymentInfo additionalPaymentInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || additionalPaymentInfo.f39177a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, additionalPaymentInfo.f39177a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || additionalPaymentInfo.f39178b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, additionalPaymentInfo.f39178b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || additionalPaymentInfo.f39179c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, additionalPaymentInfo.f39179c);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalPaymentInfo)) {
            return false;
        }
        AdditionalPaymentInfo additionalPaymentInfo = (AdditionalPaymentInfo) obj;
        return Intrinsics.d(this.f39177a, additionalPaymentInfo.f39177a) && Intrinsics.d(this.f39178b, additionalPaymentInfo.f39178b) && Intrinsics.d(this.f39179c, additionalPaymentInfo.f39179c);
    }

    public int hashCode() {
        String str = this.f39177a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39178b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39179c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "AdditionalPaymentInfo(cardexpiry=" + this.f39177a + ", cardnumber=" + this.f39178b + ", cardtype=" + this.f39179c + ')';
    }
}
