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
public final class CombinedProductOrderRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer[] f39258k = {new ArrayListSerializer(PartialPaymentStructure$$serializer.f39522a), null, null, null, null, null, null, new ArrayListSerializer(TopUpReference$$serializer.f39592a), new ArrayListSerializer(ProductConfiguration$$serializer.f39561a), null};

    /* renamed from: a  reason: collision with root package name */
    public final List f39259a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39260b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39261c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f39262d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39263e;

    /* renamed from: f  reason: collision with root package name */
    public final AdditionalPaymentInfo f39264f;

    /* renamed from: g  reason: collision with root package name */
    public final Boolean f39265g;

    /* renamed from: h  reason: collision with root package name */
    public final List f39266h;

    /* renamed from: i  reason: collision with root package name */
    public final List f39267i;

    /* renamed from: j  reason: collision with root package name */
    public final UserAddress f39268j;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CombinedProductOrderRequest> serializer() {
            return CombinedProductOrderRequest$$serializer.f39269a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ CombinedProductOrderRequest(int i2, List list, String str, String str2, Long l2, String str3, AdditionalPaymentInfo additionalPaymentInfo, Boolean bool, List list2, List list3, UserAddress userAddress, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39259a = null;
        } else {
            this.f39259a = list;
        }
        if ((i2 & 2) == 0) {
            this.f39260b = null;
        } else {
            this.f39260b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39261c = null;
        } else {
            this.f39261c = str2;
        }
        if ((i2 & 8) == 0) {
            this.f39262d = null;
        } else {
            this.f39262d = l2;
        }
        if ((i2 & 16) == 0) {
            this.f39263e = null;
        } else {
            this.f39263e = str3;
        }
        if ((i2 & 32) == 0) {
            this.f39264f = null;
        } else {
            this.f39264f = additionalPaymentInfo;
        }
        if ((i2 & 64) == 0) {
            this.f39265g = Boolean.FALSE;
        } else {
            this.f39265g = bool;
        }
        if ((i2 & 128) == 0) {
            this.f39266h = null;
        } else {
            this.f39266h = list2;
        }
        if ((i2 & 256) == 0) {
            this.f39267i = null;
        } else {
            this.f39267i = list3;
        }
        if ((i2 & 512) == 0) {
            this.f39268j = null;
        } else {
            this.f39268j = userAddress;
        }
    }

    public static final /* synthetic */ void b(CombinedProductOrderRequest combinedProductOrderRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39258k;
        if (compositeEncoder.w(serialDescriptor, 0) || combinedProductOrderRequest.f39259a != null) {
            compositeEncoder.m(serialDescriptor, 0, kSerializerArr[0], combinedProductOrderRequest.f39259a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || combinedProductOrderRequest.f39260b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, combinedProductOrderRequest.f39260b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || combinedProductOrderRequest.f39261c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, combinedProductOrderRequest.f39261c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || combinedProductOrderRequest.f39262d != null) {
            compositeEncoder.m(serialDescriptor, 3, LongSerializer.f42142a, combinedProductOrderRequest.f39262d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || combinedProductOrderRequest.f39263e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, combinedProductOrderRequest.f39263e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || combinedProductOrderRequest.f39264f != null) {
            compositeEncoder.m(serialDescriptor, 5, AdditionalPaymentInfo$$serializer.f39180a, combinedProductOrderRequest.f39264f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || !Intrinsics.d(combinedProductOrderRequest.f39265g, Boolean.FALSE)) {
            compositeEncoder.m(serialDescriptor, 6, BooleanSerializer.f42073a, combinedProductOrderRequest.f39265g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || combinedProductOrderRequest.f39266h != null) {
            compositeEncoder.m(serialDescriptor, 7, kSerializerArr[7], combinedProductOrderRequest.f39266h);
        }
        if (compositeEncoder.w(serialDescriptor, 8) || combinedProductOrderRequest.f39267i != null) {
            compositeEncoder.m(serialDescriptor, 8, kSerializerArr[8], combinedProductOrderRequest.f39267i);
        }
        if (compositeEncoder.w(serialDescriptor, 9) || combinedProductOrderRequest.f39268j != null) {
            compositeEncoder.m(serialDescriptor, 9, UserAddress$$serializer.f39673a, combinedProductOrderRequest.f39268j);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedProductOrderRequest)) {
            return false;
        }
        CombinedProductOrderRequest combinedProductOrderRequest = (CombinedProductOrderRequest) obj;
        return Intrinsics.d(this.f39259a, combinedProductOrderRequest.f39259a) && Intrinsics.d(this.f39260b, combinedProductOrderRequest.f39260b) && Intrinsics.d(this.f39261c, combinedProductOrderRequest.f39261c) && Intrinsics.d(this.f39262d, combinedProductOrderRequest.f39262d) && Intrinsics.d(this.f39263e, combinedProductOrderRequest.f39263e) && Intrinsics.d(this.f39264f, combinedProductOrderRequest.f39264f) && Intrinsics.d(this.f39265g, combinedProductOrderRequest.f39265g) && Intrinsics.d(this.f39266h, combinedProductOrderRequest.f39266h) && Intrinsics.d(this.f39267i, combinedProductOrderRequest.f39267i) && Intrinsics.d(this.f39268j, combinedProductOrderRequest.f39268j);
    }

    public int hashCode() {
        List list = this.f39259a;
        int i2 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f39260b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39261c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.f39262d;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.f39263e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AdditionalPaymentInfo additionalPaymentInfo = this.f39264f;
        int hashCode6 = (hashCode5 + (additionalPaymentInfo == null ? 0 : additionalPaymentInfo.hashCode())) * 31;
        Boolean bool = this.f39265g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list2 = this.f39266h;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f39267i;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        UserAddress userAddress = this.f39268j;
        if (userAddress != null) {
            i2 = userAddress.hashCode();
        }
        return hashCode9 + i2;
    }

    public String toString() {
        return "CombinedProductOrderRequest(partialPayment=" + this.f39259a + ", paymentToken=" + this.f39260b + ", email=" + this.f39261c + ", paymentMethodId=" + this.f39262d + ", promoCode=" + this.f39263e + ", additionalPaymentInformation=" + this.f39264f + ", isStoredValuePayment=" + this.f39265g + ", topUps=" + this.f39266h + ", products=" + this.f39267i + ", invoiceAddress=" + this.f39268j + ')';
    }

    public CombinedProductOrderRequest(List list, String str, String str2, Long l2, String str3, AdditionalPaymentInfo additionalPaymentInfo, Boolean bool, List list2, List list3, UserAddress userAddress) {
        this.f39259a = list;
        this.f39260b = str;
        this.f39261c = str2;
        this.f39262d = l2;
        this.f39263e = str3;
        this.f39264f = additionalPaymentInfo;
        this.f39265g = bool;
        this.f39266h = list2;
        this.f39267i = list3;
        this.f39268j = userAddress;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CombinedProductOrderRequest(java.util.List r12, java.lang.String r13, java.lang.String r14, java.lang.Long r15, java.lang.String r16, com.hansecom.mapi.models.AdditionalPaymentInfo r17, java.lang.Boolean r18, java.util.List r19, java.util.List r20, com.hansecom.mapi.models.UserAddress r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto L_0x0038
        L_0x0036:
            r8 = r18
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r19
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r20
        L_0x0048:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r2 = r21
        L_0x004f:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.CombinedProductOrderRequest.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, com.hansecom.mapi.models.AdditionalPaymentInfo, java.lang.Boolean, java.util.List, java.util.List, com.hansecom.mapi.models.UserAddress, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
