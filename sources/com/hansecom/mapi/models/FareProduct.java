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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class FareProduct {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Long f39432a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f39433b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f39434c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39435d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39436e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f39437f;

    /* renamed from: g  reason: collision with root package name */
    public final String f39438g;

    /* renamed from: h  reason: collision with root package name */
    public final String f39439h;

    /* renamed from: i  reason: collision with root package name */
    public final String f39440i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f39441j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f39442k;

    /* renamed from: l  reason: collision with root package name */
    public final String f39443l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f39444m;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareProduct> serializer() {
            return FareProduct$$serializer.f39445a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareProduct(int i2, Long l2, Boolean bool, Boolean bool2, String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, Boolean bool3, String str6, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        int i3 = i2;
        if ((i3 & 1) == 0) {
            this.f39432a = null;
        } else {
            this.f39432a = l2;
        }
        if ((i3 & 2) == 0) {
            this.f39433b = null;
        } else {
            this.f39433b = bool;
        }
        if ((i3 & 4) == 0) {
            this.f39434c = null;
        } else {
            this.f39434c = bool2;
        }
        if ((i3 & 8) == 0) {
            this.f39435d = null;
        } else {
            this.f39435d = str;
        }
        if ((i3 & 16) == 0) {
            this.f39436e = null;
        } else {
            this.f39436e = str2;
        }
        if ((i3 & 32) == 0) {
            this.f39437f = null;
        } else {
            this.f39437f = num;
        }
        if ((i3 & 64) == 0) {
            this.f39438g = null;
        } else {
            this.f39438g = str3;
        }
        if ((i3 & 128) == 0) {
            this.f39439h = null;
        } else {
            this.f39439h = str4;
        }
        if ((i3 & 256) == 0) {
            this.f39440i = null;
        } else {
            this.f39440i = str5;
        }
        if ((i3 & 512) == 0) {
            this.f39441j = null;
        } else {
            this.f39441j = num2;
        }
        if ((i3 & 1024) == 0) {
            this.f39442k = null;
        } else {
            this.f39442k = bool3;
        }
        if ((i3 & 2048) == 0) {
            this.f39443l = null;
        } else {
            this.f39443l = str6;
        }
        if ((i3 & 4096) == 0) {
            this.f39444m = null;
        } else {
            this.f39444m = num3;
        }
    }

    public static final /* synthetic */ void i(FareProduct fareProduct, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || fareProduct.f39432a != null) {
            compositeEncoder.m(serialDescriptor, 0, LongSerializer.f42142a, fareProduct.f39432a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareProduct.f39433b != null) {
            compositeEncoder.m(serialDescriptor, 1, BooleanSerializer.f42073a, fareProduct.f39433b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || fareProduct.f39434c != null) {
            compositeEncoder.m(serialDescriptor, 2, BooleanSerializer.f42073a, fareProduct.f39434c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || fareProduct.f39435d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, fareProduct.f39435d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || fareProduct.f39436e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, fareProduct.f39436e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || fareProduct.f39437f != null) {
            compositeEncoder.m(serialDescriptor, 5, IntSerializer.f42129a, fareProduct.f39437f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || fareProduct.f39438g != null) {
            compositeEncoder.m(serialDescriptor, 6, StringSerializer.f42197a, fareProduct.f39438g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || fareProduct.f39439h != null) {
            compositeEncoder.m(serialDescriptor, 7, StringSerializer.f42197a, fareProduct.f39439h);
        }
        if (compositeEncoder.w(serialDescriptor, 8) || fareProduct.f39440i != null) {
            compositeEncoder.m(serialDescriptor, 8, StringSerializer.f42197a, fareProduct.f39440i);
        }
        if (compositeEncoder.w(serialDescriptor, 9) || fareProduct.f39441j != null) {
            compositeEncoder.m(serialDescriptor, 9, IntSerializer.f42129a, fareProduct.f39441j);
        }
        if (compositeEncoder.w(serialDescriptor, 10) || fareProduct.f39442k != null) {
            compositeEncoder.m(serialDescriptor, 10, BooleanSerializer.f42073a, fareProduct.f39442k);
        }
        if (compositeEncoder.w(serialDescriptor, 11) || fareProduct.f39443l != null) {
            compositeEncoder.m(serialDescriptor, 11, StringSerializer.f42197a, fareProduct.f39443l);
        }
        if (compositeEncoder.w(serialDescriptor, 12) || fareProduct.f39444m != null) {
            compositeEncoder.m(serialDescriptor, 12, IntSerializer.f42129a, fareProduct.f39444m);
        }
    }

    public final String a() {
        return this.f39438g;
    }

    public final Boolean b() {
        return this.f39433b;
    }

    public final Integer c() {
        return this.f39444m;
    }

    public final Boolean d() {
        return this.f39442k;
    }

    public final Long e() {
        return this.f39432a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareProduct)) {
            return false;
        }
        FareProduct fareProduct = (FareProduct) obj;
        return Intrinsics.d(this.f39432a, fareProduct.f39432a) && Intrinsics.d(this.f39433b, fareProduct.f39433b) && Intrinsics.d(this.f39434c, fareProduct.f39434c) && Intrinsics.d(this.f39435d, fareProduct.f39435d) && Intrinsics.d(this.f39436e, fareProduct.f39436e) && Intrinsics.d(this.f39437f, fareProduct.f39437f) && Intrinsics.d(this.f39438g, fareProduct.f39438g) && Intrinsics.d(this.f39439h, fareProduct.f39439h) && Intrinsics.d(this.f39440i, fareProduct.f39440i) && Intrinsics.d(this.f39441j, fareProduct.f39441j) && Intrinsics.d(this.f39442k, fareProduct.f39442k) && Intrinsics.d(this.f39443l, fareProduct.f39443l) && Intrinsics.d(this.f39444m, fareProduct.f39444m);
    }

    public final String f() {
        return this.f39435d;
    }

    public final String g() {
        return this.f39440i;
    }

    public final Boolean h() {
        return this.f39434c;
    }

    public int hashCode() {
        Long l2 = this.f39432a;
        int i2 = 0;
        int hashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Boolean bool = this.f39433b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f39434c;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f39435d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39436e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f39437f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f39438g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39439h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39440i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.f39441j;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.f39442k;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str6 = this.f39443l;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.f39444m;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return hashCode12 + i2;
    }

    public String toString() {
        return "FareProduct(id=" + this.f39432a + ", autoloadEnabled=" + this.f39433b + ", isActive=" + this.f39434c + ", name=" + this.f39435d + ", description=" + this.f39436e + ", typeId=" + this.f39437f + ", activateUntil=" + this.f39438g + ", validFrom=" + this.f39439h + ", validTo=" + this.f39440i + ", price=" + this.f39441j + ", hasAutoloads=" + this.f39442k + ", validityDescription=" + this.f39443l + ", groupSize=" + this.f39444m + ')';
    }
}
