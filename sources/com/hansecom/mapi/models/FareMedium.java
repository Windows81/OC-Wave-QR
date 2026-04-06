package com.hansecom.mapi.models;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class FareMedium {

    /* renamed from: B  reason: collision with root package name */
    public static final KSerializer[] f39368B = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AutoloadState.Companion.serializer(), null, null, null, null, null, null, null, null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final Boolean f39369A;

    /* renamed from: a  reason: collision with root package name */
    public final String f39370a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39371b;

    /* renamed from: c  reason: collision with root package name */
    public final double f39372c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39373d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39374e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39375f;

    /* renamed from: g  reason: collision with root package name */
    public final Boolean f39376g;

    /* renamed from: h  reason: collision with root package name */
    public final String f39377h;

    /* renamed from: i  reason: collision with root package name */
    public final Boolean f39378i;

    /* renamed from: j  reason: collision with root package name */
    public final Boolean f39379j;

    /* renamed from: k  reason: collision with root package name */
    public final String f39380k;

    /* renamed from: l  reason: collision with root package name */
    public final String f39381l;

    /* renamed from: m  reason: collision with root package name */
    public final Institution f39382m;

    /* renamed from: n  reason: collision with root package name */
    public final Boolean f39383n;

    /* renamed from: o  reason: collision with root package name */
    public final FareMediumWalletInformation f39384o;

    /* renamed from: p  reason: collision with root package name */
    public final Integer f39385p;

    /* renamed from: q  reason: collision with root package name */
    public final Boolean f39386q;

    /* renamed from: r  reason: collision with root package name */
    public final Boolean f39387r;

    /* renamed from: s  reason: collision with root package name */
    public final AutoloadState f39388s;

    /* renamed from: t  reason: collision with root package name */
    public final Boolean f39389t;

    /* renamed from: u  reason: collision with root package name */
    public final Integer f39390u;

    /* renamed from: v  reason: collision with root package name */
    public final String f39391v;

    /* renamed from: w  reason: collision with root package name */
    public final Long f39392w;

    /* renamed from: x  reason: collision with root package name */
    public final String f39393x;

    /* renamed from: y  reason: collision with root package name */
    public final Boolean f39394y;

    /* renamed from: z  reason: collision with root package name */
    public final String f39395z;

    @Metadata
    @Serializable
    public enum AutoloadState {
        OFF("OFF"),
        PAUSED("PAUSED"),
        ON("ON");
        

        /* renamed from: A  reason: collision with root package name */
        public static final Lazy f39397A = null;
        public static final Companion Companion = null;

        /* renamed from: z  reason: collision with root package name */
        public final String f39399z;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer a() {
                return (KSerializer) AutoloadState.f39397A.getValue();
            }

            public final KSerializer<AutoloadState> serializer() {
                return a();
            }

            public Companion() {
            }
        }

        static {
            AutoloadState[] d2;
            C = EnumEntriesKt.a(d2);
            Companion = new Companion((DefaultConstructorMarker) null);
            f39397A = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, Companion.AnonymousClass1.f39400z);
        }

        /* access modifiers changed from: public */
        AutoloadState(String str) {
            this.f39399z = str;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareMedium> serializer() {
            return FareMedium$$serializer.f39396a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareMedium(int i2, String str, String str2, double d2, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, Boolean bool3, String str7, String str8, Institution institution, Boolean bool4, FareMediumWalletInformation fareMediumWalletInformation, Integer num, Boolean bool5, Boolean bool6, AutoloadState autoloadState, Boolean bool7, Integer num2, String str9, Long l2, String str10, Boolean bool8, String str11, Boolean bool9, SerializationConstructorMarker serializationConstructorMarker) {
        int i3 = i2;
        if (7 != (i3 & 7)) {
            PluginExceptionsKt.a(i2, 7, FareMedium$$serializer.f39396a.a());
        }
        this.f39370a = str;
        this.f39371b = str2;
        this.f39372c = d2;
        if ((i3 & 8) == 0) {
            this.f39373d = null;
        } else {
            this.f39373d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f39374e = null;
        } else {
            this.f39374e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f39375f = null;
        } else {
            this.f39375f = str5;
        }
        if ((i3 & 64) == 0) {
            this.f39376g = null;
        } else {
            this.f39376g = bool;
        }
        if ((i3 & 128) == 0) {
            this.f39377h = null;
        } else {
            this.f39377h = str6;
        }
        if ((i3 & 256) == 0) {
            this.f39378i = null;
        } else {
            this.f39378i = bool2;
        }
        if ((i3 & 512) == 0) {
            this.f39379j = null;
        } else {
            this.f39379j = bool3;
        }
        if ((i3 & 1024) == 0) {
            this.f39380k = null;
        } else {
            this.f39380k = str7;
        }
        if ((i3 & 2048) == 0) {
            this.f39381l = null;
        } else {
            this.f39381l = str8;
        }
        if ((i3 & 4096) == 0) {
            this.f39382m = null;
        } else {
            this.f39382m = institution;
        }
        if ((i3 & 8192) == 0) {
            this.f39383n = null;
        } else {
            this.f39383n = bool4;
        }
        if ((i3 & 16384) == 0) {
            this.f39384o = null;
        } else {
            this.f39384o = fareMediumWalletInformation;
        }
        if ((32768 & i3) == 0) {
            this.f39385p = null;
        } else {
            this.f39385p = num;
        }
        if ((65536 & i3) == 0) {
            this.f39386q = null;
        } else {
            this.f39386q = bool5;
        }
        if ((131072 & i3) == 0) {
            this.f39387r = null;
        } else {
            this.f39387r = bool6;
        }
        if ((262144 & i3) == 0) {
            this.f39388s = null;
        } else {
            this.f39388s = autoloadState;
        }
        if ((524288 & i3) == 0) {
            this.f39389t = null;
        } else {
            this.f39389t = bool7;
        }
        if ((1048576 & i3) == 0) {
            this.f39390u = null;
        } else {
            this.f39390u = num2;
        }
        if ((2097152 & i3) == 0) {
            this.f39391v = null;
        } else {
            this.f39391v = str9;
        }
        if ((4194304 & i3) == 0) {
            this.f39392w = null;
        } else {
            this.f39392w = l2;
        }
        if ((8388608 & i3) == 0) {
            this.f39393x = null;
        } else {
            this.f39393x = str10;
        }
        if ((16777216 & i3) == 0) {
            this.f39394y = null;
        } else {
            this.f39394y = bool8;
        }
        if ((33554432 & i3) == 0) {
            this.f39395z = null;
        } else {
            this.f39395z = str11;
        }
        this.f39369A = (i3 & 67108864) == 0 ? Boolean.TRUE : bool9;
    }

    public static final /* synthetic */ void r(FareMedium fareMedium, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39368B;
        compositeEncoder.t(serialDescriptor, 0, fareMedium.f39370a);
        compositeEncoder.t(serialDescriptor, 1, fareMedium.f39371b);
        compositeEncoder.C(serialDescriptor, 2, fareMedium.f39372c);
        if (compositeEncoder.w(serialDescriptor, 3) || fareMedium.f39373d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, fareMedium.f39373d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || fareMedium.f39374e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, fareMedium.f39374e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || fareMedium.f39375f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, fareMedium.f39375f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || fareMedium.f39376g != null) {
            compositeEncoder.m(serialDescriptor, 6, BooleanSerializer.f42073a, fareMedium.f39376g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || fareMedium.f39377h != null) {
            compositeEncoder.m(serialDescriptor, 7, StringSerializer.f42197a, fareMedium.f39377h);
        }
        if (compositeEncoder.w(serialDescriptor, 8) || fareMedium.f39378i != null) {
            compositeEncoder.m(serialDescriptor, 8, BooleanSerializer.f42073a, fareMedium.f39378i);
        }
        if (compositeEncoder.w(serialDescriptor, 9) || fareMedium.f39379j != null) {
            compositeEncoder.m(serialDescriptor, 9, BooleanSerializer.f42073a, fareMedium.f39379j);
        }
        if (compositeEncoder.w(serialDescriptor, 10) || fareMedium.f39380k != null) {
            compositeEncoder.m(serialDescriptor, 10, StringSerializer.f42197a, fareMedium.f39380k);
        }
        if (compositeEncoder.w(serialDescriptor, 11) || fareMedium.f39381l != null) {
            compositeEncoder.m(serialDescriptor, 11, StringSerializer.f42197a, fareMedium.f39381l);
        }
        if (compositeEncoder.w(serialDescriptor, 12) || fareMedium.f39382m != null) {
            compositeEncoder.m(serialDescriptor, 12, Institution$$serializer.f39487a, fareMedium.f39382m);
        }
        if (compositeEncoder.w(serialDescriptor, 13) || fareMedium.f39383n != null) {
            compositeEncoder.m(serialDescriptor, 13, BooleanSerializer.f42073a, fareMedium.f39383n);
        }
        if (compositeEncoder.w(serialDescriptor, 14) || fareMedium.f39384o != null) {
            compositeEncoder.m(serialDescriptor, 14, FareMediumWalletInformation$$serializer.f39431a, fareMedium.f39384o);
        }
        if (compositeEncoder.w(serialDescriptor, 15) || fareMedium.f39385p != null) {
            compositeEncoder.m(serialDescriptor, 15, IntSerializer.f42129a, fareMedium.f39385p);
        }
        if (compositeEncoder.w(serialDescriptor, 16) || fareMedium.f39386q != null) {
            compositeEncoder.m(serialDescriptor, 16, BooleanSerializer.f42073a, fareMedium.f39386q);
        }
        if (compositeEncoder.w(serialDescriptor, 17) || fareMedium.f39387r != null) {
            compositeEncoder.m(serialDescriptor, 17, BooleanSerializer.f42073a, fareMedium.f39387r);
        }
        if (compositeEncoder.w(serialDescriptor, 18) || fareMedium.f39388s != null) {
            compositeEncoder.m(serialDescriptor, 18, kSerializerArr[18], fareMedium.f39388s);
        }
        if (compositeEncoder.w(serialDescriptor, 19) || fareMedium.f39389t != null) {
            compositeEncoder.m(serialDescriptor, 19, BooleanSerializer.f42073a, fareMedium.f39389t);
        }
        if (compositeEncoder.w(serialDescriptor, 20) || fareMedium.f39390u != null) {
            compositeEncoder.m(serialDescriptor, 20, IntSerializer.f42129a, fareMedium.f39390u);
        }
        if (compositeEncoder.w(serialDescriptor, 21) || fareMedium.f39391v != null) {
            compositeEncoder.m(serialDescriptor, 21, StringSerializer.f42197a, fareMedium.f39391v);
        }
        if (compositeEncoder.w(serialDescriptor, 22) || fareMedium.f39392w != null) {
            compositeEncoder.m(serialDescriptor, 22, LongSerializer.f42142a, fareMedium.f39392w);
        }
        if (compositeEncoder.w(serialDescriptor, 23) || fareMedium.f39393x != null) {
            compositeEncoder.m(serialDescriptor, 23, StringSerializer.f42197a, fareMedium.f39393x);
        }
        if (compositeEncoder.w(serialDescriptor, 24) || fareMedium.f39394y != null) {
            compositeEncoder.m(serialDescriptor, 24, BooleanSerializer.f42073a, fareMedium.f39394y);
        }
        if (compositeEncoder.w(serialDescriptor, 25) || fareMedium.f39395z != null) {
            compositeEncoder.m(serialDescriptor, 25, StringSerializer.f42197a, fareMedium.f39395z);
        }
        if (compositeEncoder.w(serialDescriptor, 26) || !Intrinsics.d(fareMedium.f39369A, Boolean.TRUE)) {
            compositeEncoder.m(serialDescriptor, 26, BooleanSerializer.f42073a, fareMedium.f39369A);
        }
    }

    public final AutoloadState b() {
        return this.f39388s;
    }

    public final double c() {
        return this.f39372c;
    }

    public final Boolean d() {
        return this.f39369A;
    }

    public final String e() {
        return this.f39373d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMedium)) {
            return false;
        }
        FareMedium fareMedium = (FareMedium) obj;
        return Intrinsics.d(this.f39370a, fareMedium.f39370a) && Intrinsics.d(this.f39371b, fareMedium.f39371b) && Double.compare(this.f39372c, fareMedium.f39372c) == 0 && Intrinsics.d(this.f39373d, fareMedium.f39373d) && Intrinsics.d(this.f39374e, fareMedium.f39374e) && Intrinsics.d(this.f39375f, fareMedium.f39375f) && Intrinsics.d(this.f39376g, fareMedium.f39376g) && Intrinsics.d(this.f39377h, fareMedium.f39377h) && Intrinsics.d(this.f39378i, fareMedium.f39378i) && Intrinsics.d(this.f39379j, fareMedium.f39379j) && Intrinsics.d(this.f39380k, fareMedium.f39380k) && Intrinsics.d(this.f39381l, fareMedium.f39381l) && Intrinsics.d(this.f39382m, fareMedium.f39382m) && Intrinsics.d(this.f39383n, fareMedium.f39383n) && Intrinsics.d(this.f39384o, fareMedium.f39384o) && Intrinsics.d(this.f39385p, fareMedium.f39385p) && Intrinsics.d(this.f39386q, fareMedium.f39386q) && Intrinsics.d(this.f39387r, fareMedium.f39387r) && this.f39388s == fareMedium.f39388s && Intrinsics.d(this.f39389t, fareMedium.f39389t) && Intrinsics.d(this.f39390u, fareMedium.f39390u) && Intrinsics.d(this.f39391v, fareMedium.f39391v) && Intrinsics.d(this.f39392w, fareMedium.f39392w) && Intrinsics.d(this.f39393x, fareMedium.f39393x) && Intrinsics.d(this.f39394y, fareMedium.f39394y) && Intrinsics.d(this.f39395z, fareMedium.f39395z) && Intrinsics.d(this.f39369A, fareMedium.f39369A);
    }

    public final String f() {
        return this.f39370a;
    }

    public final Integer g() {
        return this.f39390u;
    }

    public final Boolean h() {
        return this.f39379j;
    }

    public int hashCode() {
        int hashCode = ((((this.f39370a.hashCode() * 31) + this.f39371b.hashCode()) * 31) + Double.hashCode(this.f39372c)) * 31;
        String str = this.f39373d;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39374e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39375f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f39376g;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f39377h;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.f39378i;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f39379j;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.f39380k;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f39381l;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Institution institution = this.f39382m;
        int hashCode11 = (hashCode10 + (institution == null ? 0 : institution.hashCode())) * 31;
        Boolean bool4 = this.f39383n;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        FareMediumWalletInformation fareMediumWalletInformation = this.f39384o;
        int hashCode13 = (hashCode12 + (fareMediumWalletInformation == null ? 0 : fareMediumWalletInformation.hashCode())) * 31;
        Integer num = this.f39385p;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool5 = this.f39386q;
        int hashCode15 = (hashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f39387r;
        int hashCode16 = (hashCode15 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        AutoloadState autoloadState = this.f39388s;
        int hashCode17 = (hashCode16 + (autoloadState == null ? 0 : autoloadState.hashCode())) * 31;
        Boolean bool7 = this.f39389t;
        int hashCode18 = (hashCode17 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num2 = this.f39390u;
        int hashCode19 = (hashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.f39391v;
        int hashCode20 = (hashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l2 = this.f39392w;
        int hashCode21 = (hashCode20 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str8 = this.f39393x;
        int hashCode22 = (hashCode21 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool8 = this.f39394y;
        int hashCode23 = (hashCode22 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str9 = this.f39395z;
        int hashCode24 = (hashCode23 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool9 = this.f39369A;
        if (bool9 != null) {
            i2 = bool9.hashCode();
        }
        return hashCode24 + i2;
    }

    public final Boolean i() {
        return this.f39394y;
    }

    public final String j() {
        return this.f39375f;
    }

    public final String k() {
        return this.f39380k;
    }

    public final String l() {
        return this.f39395z;
    }

    public final String m() {
        return this.f39391v;
    }

    public final String n() {
        return this.f39374e;
    }

    public final Boolean o() {
        return this.f39376g;
    }

    public final FareMediumWalletInformation p() {
        return this.f39384o;
    }

    public final Boolean q() {
        return this.f39378i;
    }

    public String toString() {
        return "FareMedium(cardId=" + this.f39370a + ", expirationDate=" + this.f39371b + ", balance=" + this.f39372c + ", cardHolder=" + this.f39373d + ", staticBarcodePayload=" + this.f39374e + ", nextVerification=" + this.f39375f + ", unblockPossible=" + this.f39376g + ", unblockingReason=" + this.f39377h + ", isVirtualCard=" + this.f39378i + ", locked=" + this.f39379j + ", nickname=" + this.f39380k + ", typeName=" + this.f39381l + ", institution=" + this.f39382m + ", hasInstitutions=" + this.f39383n + ", wallet=" + this.f39384o + ", availablePassesQuantity=" + this.f39385p + ", hasStoredValueAutoload=" + this.f39386q + ", hasIntervalAutoload=" + this.f39387r + ", autoloadState=" + this.f39388s + ", hasAutoRenew=" + this.f39389t + ", fareCategory=" + this.f39390u + ", riderType=" + this.f39391v + ", transitAccountId=" + this.f39392w + ", validTo=" + this.f39393x + ", lowBalance=" + this.f39394y + ", payWithCashBarcode=" + this.f39395z + ", canBeConverted=" + this.f39369A + ')';
    }
}
