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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class FareMediaAutoloadRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer[] f39344i = {null, null, null, null, null, new ArrayListSerializer(PrimaryAndBackupPM$$serializer.f39553a), null, null};

    /* renamed from: a  reason: collision with root package name */
    public final String f39345a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f39346b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f39347c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f39348d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f39349e;

    /* renamed from: f  reason: collision with root package name */
    public final List f39350f;

    /* renamed from: g  reason: collision with root package name */
    public final PaymentMethodShortened f39351g;

    /* renamed from: h  reason: collision with root package name */
    public final PaymentMethodShortened f39352h;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareMediaAutoloadRequest> serializer() {
            return FareMediaAutoloadRequest$$serializer.f39353a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareMediaAutoloadRequest(int i2, String str, Boolean bool, Integer num, Integer num2, Integer num3, List list, PaymentMethodShortened paymentMethodShortened, PaymentMethodShortened paymentMethodShortened2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39345a = null;
        } else {
            this.f39345a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39346b = null;
        } else {
            this.f39346b = bool;
        }
        if ((i2 & 4) == 0) {
            this.f39347c = null;
        } else {
            this.f39347c = num;
        }
        if ((i2 & 8) == 0) {
            this.f39348d = null;
        } else {
            this.f39348d = num2;
        }
        if ((i2 & 16) == 0) {
            this.f39349e = null;
        } else {
            this.f39349e = num3;
        }
        if ((i2 & 32) == 0) {
            this.f39350f = null;
        } else {
            this.f39350f = list;
        }
        if ((i2 & 64) == 0) {
            this.f39351g = null;
        } else {
            this.f39351g = paymentMethodShortened;
        }
        if ((i2 & 128) == 0) {
            this.f39352h = null;
        } else {
            this.f39352h = paymentMethodShortened2;
        }
    }

    public static final /* synthetic */ void b(FareMediaAutoloadRequest fareMediaAutoloadRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39344i;
        if (compositeEncoder.w(serialDescriptor, 0) || fareMediaAutoloadRequest.f39345a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, fareMediaAutoloadRequest.f39345a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareMediaAutoloadRequest.f39346b != null) {
            compositeEncoder.m(serialDescriptor, 1, BooleanSerializer.f42073a, fareMediaAutoloadRequest.f39346b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || fareMediaAutoloadRequest.f39347c != null) {
            compositeEncoder.m(serialDescriptor, 2, IntSerializer.f42129a, fareMediaAutoloadRequest.f39347c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || fareMediaAutoloadRequest.f39348d != null) {
            compositeEncoder.m(serialDescriptor, 3, IntSerializer.f42129a, fareMediaAutoloadRequest.f39348d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || fareMediaAutoloadRequest.f39349e != null) {
            compositeEncoder.m(serialDescriptor, 4, IntSerializer.f42129a, fareMediaAutoloadRequest.f39349e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || fareMediaAutoloadRequest.f39350f != null) {
            compositeEncoder.m(serialDescriptor, 5, kSerializerArr[5], fareMediaAutoloadRequest.f39350f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || fareMediaAutoloadRequest.f39351g != null) {
            compositeEncoder.m(serialDescriptor, 6, PaymentMethodShortened$$serializer.f39536a, fareMediaAutoloadRequest.f39351g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || fareMediaAutoloadRequest.f39352h != null) {
            compositeEncoder.m(serialDescriptor, 7, PaymentMethodShortened$$serializer.f39536a, fareMediaAutoloadRequest.f39352h);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMediaAutoloadRequest)) {
            return false;
        }
        FareMediaAutoloadRequest fareMediaAutoloadRequest = (FareMediaAutoloadRequest) obj;
        return Intrinsics.d(this.f39345a, fareMediaAutoloadRequest.f39345a) && Intrinsics.d(this.f39346b, fareMediaAutoloadRequest.f39346b) && Intrinsics.d(this.f39347c, fareMediaAutoloadRequest.f39347c) && Intrinsics.d(this.f39348d, fareMediaAutoloadRequest.f39348d) && Intrinsics.d(this.f39349e, fareMediaAutoloadRequest.f39349e) && Intrinsics.d(this.f39350f, fareMediaAutoloadRequest.f39350f) && Intrinsics.d(this.f39351g, fareMediaAutoloadRequest.f39351g) && Intrinsics.d(this.f39352h, fareMediaAutoloadRequest.f39352h);
    }

    public int hashCode() {
        String str = this.f39345a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f39346b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f39347c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f39348d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f39349e;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.f39350f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        PaymentMethodShortened paymentMethodShortened = this.f39351g;
        int hashCode7 = (hashCode6 + (paymentMethodShortened == null ? 0 : paymentMethodShortened.hashCode())) * 31;
        PaymentMethodShortened paymentMethodShortened2 = this.f39352h;
        if (paymentMethodShortened2 != null) {
            i2 = paymentMethodShortened2.hashCode();
        }
        return hashCode7 + i2;
    }

    public String toString() {
        return "FareMediaAutoloadRequest(cardId=" + this.f39345a + ", paused=" + this.f39346b + ", balanceThreshold=" + this.f39347c + ", dayOfMonthThreshold=" + this.f39348d + ", autoloadAmount=" + this.f39349e + ", multiplePaymentMethods=" + this.f39350f + ", primaryPaymentMethod=" + this.f39351g + ", backupPaymentMethod=" + this.f39352h + ')';
    }

    public FareMediaAutoloadRequest(String str, Boolean bool, Integer num, Integer num2, Integer num3, List list, PaymentMethodShortened paymentMethodShortened, PaymentMethodShortened paymentMethodShortened2) {
        this.f39345a = str;
        this.f39346b = bool;
        this.f39347c = num;
        this.f39348d = num2;
        this.f39349e = num3;
        this.f39350f = list;
        this.f39351g = paymentMethodShortened;
        this.f39352h = paymentMethodShortened2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FareMediaAutoloadRequest(java.lang.String r10, java.lang.Boolean r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.Integer r14, java.util.List r15, com.hansecom.mapi.models.PaymentMethodShortened r16, com.hansecom.mapi.models.PaymentMethodShortened r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.FareMediaAutoloadRequest.<init>(java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.util.List, com.hansecom.mapi.models.PaymentMethodShortened, com.hansecom.mapi.models.PaymentMethodShortened, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
