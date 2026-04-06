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
public final class FareProductOffer {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39450a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f39451b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f39452c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39453d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f39454e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39455f;

    /* renamed from: g  reason: collision with root package name */
    public final OfferConstraints f39456g;

    /* renamed from: h  reason: collision with root package name */
    public final GroupConstraints f39457h;

    /* renamed from: i  reason: collision with root package name */
    public final String f39458i;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareProductOffer> serializer() {
            return FareProductOffer$$serializer.f39459a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareProductOffer(int i2, String str, Boolean bool, Integer num, String str2, Integer num2, String str3, OfferConstraints offerConstraints, GroupConstraints groupConstraints, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39450a = null;
        } else {
            this.f39450a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39451b = null;
        } else {
            this.f39451b = bool;
        }
        if ((i2 & 4) == 0) {
            this.f39452c = null;
        } else {
            this.f39452c = num;
        }
        if ((i2 & 8) == 0) {
            this.f39453d = null;
        } else {
            this.f39453d = str2;
        }
        if ((i2 & 16) == 0) {
            this.f39454e = null;
        } else {
            this.f39454e = num2;
        }
        if ((i2 & 32) == 0) {
            this.f39455f = null;
        } else {
            this.f39455f = str3;
        }
        if ((i2 & 64) == 0) {
            this.f39456g = null;
        } else {
            this.f39456g = offerConstraints;
        }
        if ((i2 & 128) == 0) {
            this.f39457h = null;
        } else {
            this.f39457h = groupConstraints;
        }
        if ((i2 & 256) == 0) {
            this.f39458i = null;
        } else {
            this.f39458i = str4;
        }
    }

    public static final /* synthetic */ void h(FareProductOffer fareProductOffer, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || fareProductOffer.f39450a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, fareProductOffer.f39450a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareProductOffer.f39451b != null) {
            compositeEncoder.m(serialDescriptor, 1, BooleanSerializer.f42073a, fareProductOffer.f39451b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || fareProductOffer.f39452c != null) {
            compositeEncoder.m(serialDescriptor, 2, IntSerializer.f42129a, fareProductOffer.f39452c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || fareProductOffer.f39453d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, fareProductOffer.f39453d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || fareProductOffer.f39454e != null) {
            compositeEncoder.m(serialDescriptor, 4, IntSerializer.f42129a, fareProductOffer.f39454e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || fareProductOffer.f39455f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, fareProductOffer.f39455f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || fareProductOffer.f39456g != null) {
            compositeEncoder.m(serialDescriptor, 6, OfferConstraints$$serializer.f39517a, fareProductOffer.f39456g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || fareProductOffer.f39457h != null) {
            compositeEncoder.m(serialDescriptor, 7, GroupConstraints$$serializer.f39466a, fareProductOffer.f39457h);
        }
        if (compositeEncoder.w(serialDescriptor, 8) || fareProductOffer.f39458i != null) {
            compositeEncoder.m(serialDescriptor, 8, StringSerializer.f42197a, fareProductOffer.f39458i);
        }
    }

    public final String a() {
        return this.f39453d;
    }

    public final GroupConstraints b() {
        return this.f39457h;
    }

    public final String c() {
        return this.f39450a;
    }

    public final String d() {
        return this.f39458i;
    }

    public final Integer e() {
        return this.f39454e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareProductOffer)) {
            return false;
        }
        FareProductOffer fareProductOffer = (FareProductOffer) obj;
        return Intrinsics.d(this.f39450a, fareProductOffer.f39450a) && Intrinsics.d(this.f39451b, fareProductOffer.f39451b) && Intrinsics.d(this.f39452c, fareProductOffer.f39452c) && Intrinsics.d(this.f39453d, fareProductOffer.f39453d) && Intrinsics.d(this.f39454e, fareProductOffer.f39454e) && Intrinsics.d(this.f39455f, fareProductOffer.f39455f) && Intrinsics.d(this.f39456g, fareProductOffer.f39456g) && Intrinsics.d(this.f39457h, fareProductOffer.f39457h) && Intrinsics.d(this.f39458i, fareProductOffer.f39458i);
    }

    public final Integer f() {
        return this.f39452c;
    }

    public final String g() {
        return this.f39455f;
    }

    public int hashCode() {
        String str = this.f39450a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f39451b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f39452c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f39453d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f39454e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f39455f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OfferConstraints offerConstraints = this.f39456g;
        int hashCode7 = (hashCode6 + (offerConstraints == null ? 0 : offerConstraints.hashCode())) * 31;
        GroupConstraints groupConstraints = this.f39457h;
        int hashCode8 = (hashCode7 + (groupConstraints == null ? 0 : groupConstraints.hashCode())) * 31;
        String str4 = this.f39458i;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode8 + i2;
    }

    public String toString() {
        return "FareProductOffer(name=" + this.f39450a + ", canBePlacedInCart=" + this.f39451b + ", typeId=" + this.f39452c + ", description=" + this.f39453d + ", price=" + this.f39454e + ", validityDescription=" + this.f39455f + ", offerConstraints=" + this.f39456g + ", groupConstraints=" + this.f39457h + ", offerReference=" + this.f39458i + ')';
    }
}
