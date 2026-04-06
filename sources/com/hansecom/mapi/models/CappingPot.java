package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class CappingPot {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Long f39231a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39232b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39233c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39234d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f39235e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f39236f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f39237g;

    /* renamed from: h  reason: collision with root package name */
    public final String f39238h;

    /* renamed from: i  reason: collision with root package name */
    public final String f39239i;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CappingPot> serializer() {
            return CappingPot$$serializer.f39240a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ CappingPot(int i2, Long l2, String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39231a = null;
        } else {
            this.f39231a = l2;
        }
        if ((i2 & 2) == 0) {
            this.f39232b = null;
        } else {
            this.f39232b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39233c = null;
        } else {
            this.f39233c = str2;
        }
        if ((i2 & 8) == 0) {
            this.f39234d = null;
        } else {
            this.f39234d = str3;
        }
        if ((i2 & 16) == 0) {
            this.f39235e = null;
        } else {
            this.f39235e = num;
        }
        if ((i2 & 32) == 0) {
            this.f39236f = null;
        } else {
            this.f39236f = num2;
        }
        if ((i2 & 64) == 0) {
            this.f39237g = null;
        } else {
            this.f39237g = num3;
        }
        if ((i2 & 128) == 0) {
            this.f39238h = null;
        } else {
            this.f39238h = str4;
        }
        if ((i2 & 256) == 0) {
            this.f39239i = null;
        } else {
            this.f39239i = str5;
        }
    }

    public static final /* synthetic */ void h(CappingPot cappingPot, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || cappingPot.f39231a != null) {
            compositeEncoder.m(serialDescriptor, 0, LongSerializer.f42142a, cappingPot.f39231a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || cappingPot.f39232b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, cappingPot.f39232b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || cappingPot.f39233c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, cappingPot.f39233c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || cappingPot.f39234d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, cappingPot.f39234d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || cappingPot.f39235e != null) {
            compositeEncoder.m(serialDescriptor, 4, IntSerializer.f42129a, cappingPot.f39235e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || cappingPot.f39236f != null) {
            compositeEncoder.m(serialDescriptor, 5, IntSerializer.f42129a, cappingPot.f39236f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || cappingPot.f39237g != null) {
            compositeEncoder.m(serialDescriptor, 6, IntSerializer.f42129a, cappingPot.f39237g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || cappingPot.f39238h != null) {
            compositeEncoder.m(serialDescriptor, 7, StringSerializer.f42197a, cappingPot.f39238h);
        }
        if (compositeEncoder.w(serialDescriptor, 8) || cappingPot.f39239i != null) {
            compositeEncoder.m(serialDescriptor, 8, StringSerializer.f42197a, cappingPot.f39239i);
        }
    }

    public final Integer a() {
        return this.f39235e;
    }

    public final Integer b() {
        return this.f39236f;
    }

    public final String c() {
        return this.f39238h;
    }

    public final Integer d() {
        return this.f39237g;
    }

    public final String e() {
        return this.f39232b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CappingPot)) {
            return false;
        }
        CappingPot cappingPot = (CappingPot) obj;
        return Intrinsics.d(this.f39231a, cappingPot.f39231a) && Intrinsics.d(this.f39232b, cappingPot.f39232b) && Intrinsics.d(this.f39233c, cappingPot.f39233c) && Intrinsics.d(this.f39234d, cappingPot.f39234d) && Intrinsics.d(this.f39235e, cappingPot.f39235e) && Intrinsics.d(this.f39236f, cappingPot.f39236f) && Intrinsics.d(this.f39237g, cappingPot.f39237g) && Intrinsics.d(this.f39238h, cappingPot.f39238h) && Intrinsics.d(this.f39239i, cappingPot.f39239i);
    }

    public final String f() {
        return this.f39233c;
    }

    public final String g() {
        return this.f39234d;
    }

    public int hashCode() {
        Long l2 = this.f39231a;
        int i2 = 0;
        int hashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.f39232b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39233c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39234d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f39235e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f39236f;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f39237g;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f39238h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39239i;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode8 + i2;
    }

    public String toString() {
        return "CappingPot(potId=" + this.f39231a + ", name=" + this.f39232b + ", validFrom=" + this.f39233c + ", validTo=" + this.f39234d + ", amount=" + this.f39235e + ", currentValue=" + this.f39236f + ", missingValue=" + this.f39237g + ", description=" + this.f39238h + ", dateCapped=" + this.f39239i + ')';
    }
}
