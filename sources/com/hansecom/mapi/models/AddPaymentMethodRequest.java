package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class AddPaymentMethodRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39168a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39169b;

    /* renamed from: c  reason: collision with root package name */
    public final BillingAddress f39170c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39171d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39172e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39173f;

    /* renamed from: g  reason: collision with root package name */
    public final String f39174g;

    /* renamed from: h  reason: collision with root package name */
    public final String f39175h;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddPaymentMethodRequest> serializer() {
            return AddPaymentMethodRequest$$serializer.f39176a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AddPaymentMethodRequest(int i2, String str, String str2, BillingAddress billingAddress, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i2 & 7)) {
            PluginExceptionsKt.a(i2, 7, AddPaymentMethodRequest$$serializer.f39176a.a());
        }
        this.f39168a = str;
        this.f39169b = str2;
        this.f39170c = billingAddress;
        if ((i2 & 8) == 0) {
            this.f39171d = null;
        } else {
            this.f39171d = str3;
        }
        if ((i2 & 16) == 0) {
            this.f39172e = null;
        } else {
            this.f39172e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f39173f = null;
        } else {
            this.f39173f = str5;
        }
        if ((i2 & 64) == 0) {
            this.f39174g = null;
        } else {
            this.f39174g = str6;
        }
        if ((i2 & 128) == 0) {
            this.f39175h = null;
        } else {
            this.f39175h = str7;
        }
    }

    public static final /* synthetic */ void a(AddPaymentMethodRequest addPaymentMethodRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, addPaymentMethodRequest.f39168a);
        compositeEncoder.t(serialDescriptor, 1, addPaymentMethodRequest.f39169b);
        compositeEncoder.A(serialDescriptor, 2, BillingAddress$$serializer.f39230a, addPaymentMethodRequest.f39170c);
        if (compositeEncoder.w(serialDescriptor, 3) || addPaymentMethodRequest.f39171d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, addPaymentMethodRequest.f39171d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || addPaymentMethodRequest.f39172e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, addPaymentMethodRequest.f39172e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || addPaymentMethodRequest.f39173f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, addPaymentMethodRequest.f39173f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || addPaymentMethodRequest.f39174g != null) {
            compositeEncoder.m(serialDescriptor, 6, StringSerializer.f42197a, addPaymentMethodRequest.f39174g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || addPaymentMethodRequest.f39175h != null) {
            compositeEncoder.m(serialDescriptor, 7, StringSerializer.f42197a, addPaymentMethodRequest.f39175h);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddPaymentMethodRequest)) {
            return false;
        }
        AddPaymentMethodRequest addPaymentMethodRequest = (AddPaymentMethodRequest) obj;
        return Intrinsics.d(this.f39168a, addPaymentMethodRequest.f39168a) && Intrinsics.d(this.f39169b, addPaymentMethodRequest.f39169b) && Intrinsics.d(this.f39170c, addPaymentMethodRequest.f39170c) && Intrinsics.d(this.f39171d, addPaymentMethodRequest.f39171d) && Intrinsics.d(this.f39172e, addPaymentMethodRequest.f39172e) && Intrinsics.d(this.f39173f, addPaymentMethodRequest.f39173f) && Intrinsics.d(this.f39174g, addPaymentMethodRequest.f39174g) && Intrinsics.d(this.f39175h, addPaymentMethodRequest.f39175h);
    }

    public int hashCode() {
        int hashCode = ((((this.f39168a.hashCode() * 31) + this.f39169b.hashCode()) * 31) + this.f39170c.hashCode()) * 31;
        String str = this.f39171d;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39172e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39173f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39174g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39175h;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        return "AddPaymentMethodRequest(paymentToken=" + this.f39168a + ", cardNumber=" + this.f39169b + ", address=" + this.f39170c + ", nickname=" + this.f39171d + ", cardType=" + this.f39172e + ", expiryDate=" + this.f39173f + ", checkaba=" + this.f39174g + ", checkaccount=" + this.f39175h + ')';
    }

    public AddPaymentMethodRequest(String str, String str2, BillingAddress billingAddress, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.i(str, "paymentToken");
        Intrinsics.i(str2, "cardNumber");
        Intrinsics.i(billingAddress, "address");
        this.f39168a = str;
        this.f39169b = str2;
        this.f39170c = billingAddress;
        this.f39171d = str3;
        this.f39172e = str4;
        this.f39173f = str5;
        this.f39174g = str6;
        this.f39175h = str7;
    }
}
