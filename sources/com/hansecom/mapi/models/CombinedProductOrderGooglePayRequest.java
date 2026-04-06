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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class CombinedProductOrderGooglePayRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f39252e = {null, null, new ArrayListSerializer(TopUpReference$$serializer.f39592a), new ArrayListSerializer(ProductConfiguration$$serializer.f39561a)};

    /* renamed from: a  reason: collision with root package name */
    public final String f39253a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39254b;

    /* renamed from: c  reason: collision with root package name */
    public final List f39255c;

    /* renamed from: d  reason: collision with root package name */
    public final List f39256d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CombinedProductOrderGooglePayRequest> serializer() {
            return CombinedProductOrderGooglePayRequest$$serializer.f39257a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ CombinedProductOrderGooglePayRequest(int i2, String str, String str2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CombinedProductOrderGooglePayRequest$$serializer.f39257a.a());
        }
        this.f39253a = str;
        if ((i2 & 2) == 0) {
            this.f39254b = null;
        } else {
            this.f39254b = str2;
        }
        if ((i2 & 4) == 0) {
            this.f39255c = null;
        } else {
            this.f39255c = list;
        }
        if ((i2 & 8) == 0) {
            this.f39256d = null;
        } else {
            this.f39256d = list2;
        }
    }

    public static final /* synthetic */ void b(CombinedProductOrderGooglePayRequest combinedProductOrderGooglePayRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39252e;
        compositeEncoder.t(serialDescriptor, 0, combinedProductOrderGooglePayRequest.f39253a);
        if (compositeEncoder.w(serialDescriptor, 1) || combinedProductOrderGooglePayRequest.f39254b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, combinedProductOrderGooglePayRequest.f39254b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || combinedProductOrderGooglePayRequest.f39255c != null) {
            compositeEncoder.m(serialDescriptor, 2, kSerializerArr[2], combinedProductOrderGooglePayRequest.f39255c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || combinedProductOrderGooglePayRequest.f39256d != null) {
            compositeEncoder.m(serialDescriptor, 3, kSerializerArr[3], combinedProductOrderGooglePayRequest.f39256d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedProductOrderGooglePayRequest)) {
            return false;
        }
        CombinedProductOrderGooglePayRequest combinedProductOrderGooglePayRequest = (CombinedProductOrderGooglePayRequest) obj;
        return Intrinsics.d(this.f39253a, combinedProductOrderGooglePayRequest.f39253a) && Intrinsics.d(this.f39254b, combinedProductOrderGooglePayRequest.f39254b) && Intrinsics.d(this.f39255c, combinedProductOrderGooglePayRequest.f39255c) && Intrinsics.d(this.f39256d, combinedProductOrderGooglePayRequest.f39256d);
    }

    public int hashCode() {
        int hashCode = this.f39253a.hashCode() * 31;
        String str = this.f39254b;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f39255c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f39256d;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "CombinedProductOrderGooglePayRequest(googlePaymentData=" + this.f39253a + ", promoCode=" + this.f39254b + ", topUps=" + this.f39255c + ", products=" + this.f39256d + ')';
    }

    public CombinedProductOrderGooglePayRequest(String str, String str2, List list, List list2) {
        Intrinsics.i(str, "googlePaymentData");
        this.f39253a = str;
        this.f39254b = str2;
        this.f39255c = list;
        this.f39256d = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CombinedProductOrderGooglePayRequest(String str, String str2, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2);
    }
}
