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
public final class PaymentMethod {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Long f39523a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39524b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f39525c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39526d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39527e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39528f;

    /* renamed from: g  reason: collision with root package name */
    public final String f39529g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PaymentMethod> serializer() {
            return PaymentMethod$$serializer.f39530a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PaymentMethod(int i2, Long l2, String str, Boolean bool, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39523a = null;
        } else {
            this.f39523a = l2;
        }
        if ((i2 & 2) == 0) {
            this.f39524b = null;
        } else {
            this.f39524b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39525c = null;
        } else {
            this.f39525c = bool;
        }
        if ((i2 & 8) == 0) {
            this.f39526d = null;
        } else {
            this.f39526d = str2;
        }
        if ((i2 & 16) == 0) {
            this.f39527e = null;
        } else {
            this.f39527e = str3;
        }
        if ((i2 & 32) == 0) {
            this.f39528f = null;
        } else {
            this.f39528f = str4;
        }
        if ((i2 & 64) == 0) {
            this.f39529g = null;
        } else {
            this.f39529g = str5;
        }
    }

    public static /* synthetic */ PaymentMethod b(PaymentMethod paymentMethod, Long l2, String str, Boolean bool, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l2 = paymentMethod.f39523a;
        }
        if ((i2 & 2) != 0) {
            str = paymentMethod.f39524b;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            bool = paymentMethod.f39525c;
        }
        Boolean bool2 = bool;
        if ((i2 & 8) != 0) {
            str2 = paymentMethod.f39526d;
        }
        String str7 = str2;
        if ((i2 & 16) != 0) {
            str3 = paymentMethod.f39527e;
        }
        String str8 = str3;
        if ((i2 & 32) != 0) {
            str4 = paymentMethod.f39528f;
        }
        String str9 = str4;
        if ((i2 & 64) != 0) {
            str5 = paymentMethod.f39529g;
        }
        return paymentMethod.a(l2, str6, bool2, str7, str8, str9, str5);
    }

    public static final /* synthetic */ void i(PaymentMethod paymentMethod, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || paymentMethod.f39523a != null) {
            compositeEncoder.m(serialDescriptor, 0, LongSerializer.f42142a, paymentMethod.f39523a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || paymentMethod.f39524b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, paymentMethod.f39524b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || paymentMethod.f39525c != null) {
            compositeEncoder.m(serialDescriptor, 2, BooleanSerializer.f42073a, paymentMethod.f39525c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || paymentMethod.f39526d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, paymentMethod.f39526d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || paymentMethod.f39527e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, paymentMethod.f39527e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || paymentMethod.f39528f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, paymentMethod.f39528f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || paymentMethod.f39529g != null) {
            compositeEncoder.m(serialDescriptor, 6, StringSerializer.f42197a, paymentMethod.f39529g);
        }
    }

    public final PaymentMethod a(Long l2, String str, Boolean bool, String str2, String str3, String str4, String str5) {
        return new PaymentMethod(l2, str, bool, str2, str3, str4, str5);
    }

    public final String c() {
        return this.f39528f;
    }

    public final String d() {
        return this.f39529g;
    }

    public final Long e() {
        return this.f39523a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        return Intrinsics.d(this.f39523a, paymentMethod.f39523a) && Intrinsics.d(this.f39524b, paymentMethod.f39524b) && Intrinsics.d(this.f39525c, paymentMethod.f39525c) && Intrinsics.d(this.f39526d, paymentMethod.f39526d) && Intrinsics.d(this.f39527e, paymentMethod.f39527e) && Intrinsics.d(this.f39528f, paymentMethod.f39528f) && Intrinsics.d(this.f39529g, paymentMethod.f39529g);
    }

    public final String f() {
        return this.f39526d;
    }

    public final String g() {
        return this.f39524b;
    }

    public final Boolean h() {
        return this.f39525c;
    }

    public int hashCode() {
        Long l2 = this.f39523a;
        int i2 = 0;
        int hashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.f39524b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f39525c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f39526d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39527e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39528f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39529g;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode6 + i2;
    }

    public String toString() {
        return "PaymentMethod(id=" + this.f39523a + ", nickname=" + this.f39524b + ", isDefault=" + this.f39525c + ", maskedPan=" + this.f39526d + ", cardType=" + this.f39527e + ", creditCardType=" + this.f39528f + ", expiryDate=" + this.f39529g + ')';
    }

    public PaymentMethod(Long l2, String str, Boolean bool, String str2, String str3, String str4, String str5) {
        this.f39523a = l2;
        this.f39524b = str;
        this.f39525c = bool;
        this.f39526d = str2;
        this.f39527e = str3;
        this.f39528f = str4;
        this.f39529g = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaymentMethod(java.lang.Long r7, java.lang.String r8, java.lang.Boolean r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.PaymentMethod.<init>(java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
