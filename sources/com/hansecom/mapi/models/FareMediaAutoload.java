package com.hansecom.mapi.models;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class FareMediaAutoload {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    public static final KSerializer[] f39325n = {null, Type.Companion.serializer(), null, null, null, null, null, null, null, new ArrayListSerializer(PrimaryAndBackupPM$$serializer.f39553a), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f39326a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f39327b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39328c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f39329d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f39330e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f39331f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f39332g;

    /* renamed from: h  reason: collision with root package name */
    public final Boolean f39333h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f39334i;

    /* renamed from: j  reason: collision with root package name */
    public final List f39335j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f39336k;

    /* renamed from: l  reason: collision with root package name */
    public final Long f39337l;

    /* renamed from: m  reason: collision with root package name */
    public final FareProduct f39338m;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareMediaAutoload> serializer() {
            return FareMediaAutoload$$serializer.f39339a;
        }

        public Companion() {
        }
    }

    @Metadata
    @Serializable
    public enum Type {
        STORED_VALUE("STORED_VALUE"),
        PASS("PASS");
        

        /* renamed from: A  reason: collision with root package name */
        public static final Lazy f39340A = null;
        public static final Companion Companion = null;

        /* renamed from: z  reason: collision with root package name */
        public final String f39342z;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer a() {
                return (KSerializer) Type.f39340A.getValue();
            }

            public final KSerializer<Type> serializer() {
                return a();
            }

            public Companion() {
            }
        }

        static {
            Type[] d2;
            C = EnumEntriesKt.a(d2);
            Companion = new Companion((DefaultConstructorMarker) null);
            f39340A = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, Companion.AnonymousClass1.f39343z);
        }

        /* access modifiers changed from: public */
        Type(String str) {
            this.f39342z = str;
        }
    }

    public /* synthetic */ FareMediaAutoload(int i2, Boolean bool, Type type, String str, Long l2, Integer num, Long l3, Long l4, Boolean bool2, Long l5, List list, Boolean bool3, Long l6, FareProduct fareProduct, SerializationConstructorMarker serializationConstructorMarker) {
        int i3 = i2;
        if ((i3 & 1) == 0) {
            this.f39326a = null;
        } else {
            this.f39326a = bool;
        }
        if ((i3 & 2) == 0) {
            this.f39327b = null;
        } else {
            this.f39327b = type;
        }
        if ((i3 & 4) == 0) {
            this.f39328c = null;
        } else {
            this.f39328c = str;
        }
        if ((i3 & 8) == 0) {
            this.f39329d = null;
        } else {
            this.f39329d = l2;
        }
        if ((i3 & 16) == 0) {
            this.f39330e = null;
        } else {
            this.f39330e = num;
        }
        if ((i3 & 32) == 0) {
            this.f39331f = null;
        } else {
            this.f39331f = l3;
        }
        if ((i3 & 64) == 0) {
            this.f39332g = null;
        } else {
            this.f39332g = l4;
        }
        if ((i3 & 128) == 0) {
            this.f39333h = null;
        } else {
            this.f39333h = bool2;
        }
        if ((i3 & 256) == 0) {
            this.f39334i = null;
        } else {
            this.f39334i = l5;
        }
        if ((i3 & 512) == 0) {
            this.f39335j = null;
        } else {
            this.f39335j = list;
        }
        if ((i3 & 1024) == 0) {
            this.f39336k = null;
        } else {
            this.f39336k = bool3;
        }
        if ((i3 & 2048) == 0) {
            this.f39337l = null;
        } else {
            this.f39337l = l6;
        }
        if ((i3 & 4096) == 0) {
            this.f39338m = null;
        } else {
            this.f39338m = fareProduct;
        }
    }

    public static final /* synthetic */ void h(FareMediaAutoload fareMediaAutoload, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39325n;
        if (compositeEncoder.w(serialDescriptor, 0) || fareMediaAutoload.f39326a != null) {
            compositeEncoder.m(serialDescriptor, 0, BooleanSerializer.f42073a, fareMediaAutoload.f39326a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareMediaAutoload.f39327b != null) {
            compositeEncoder.m(serialDescriptor, 1, kSerializerArr[1], fareMediaAutoload.f39327b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || fareMediaAutoload.f39328c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, fareMediaAutoload.f39328c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || fareMediaAutoload.f39329d != null) {
            compositeEncoder.m(serialDescriptor, 3, LongSerializer.f42142a, fareMediaAutoload.f39329d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || fareMediaAutoload.f39330e != null) {
            compositeEncoder.m(serialDescriptor, 4, IntSerializer.f42129a, fareMediaAutoload.f39330e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || fareMediaAutoload.f39331f != null) {
            compositeEncoder.m(serialDescriptor, 5, LongSerializer.f42142a, fareMediaAutoload.f39331f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || fareMediaAutoload.f39332g != null) {
            compositeEncoder.m(serialDescriptor, 6, LongSerializer.f42142a, fareMediaAutoload.f39332g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || fareMediaAutoload.f39333h != null) {
            compositeEncoder.m(serialDescriptor, 7, BooleanSerializer.f42073a, fareMediaAutoload.f39333h);
        }
        if (compositeEncoder.w(serialDescriptor, 8) || fareMediaAutoload.f39334i != null) {
            compositeEncoder.m(serialDescriptor, 8, LongSerializer.f42142a, fareMediaAutoload.f39334i);
        }
        if (compositeEncoder.w(serialDescriptor, 9) || fareMediaAutoload.f39335j != null) {
            compositeEncoder.m(serialDescriptor, 9, kSerializerArr[9], fareMediaAutoload.f39335j);
        }
        if (compositeEncoder.w(serialDescriptor, 10) || fareMediaAutoload.f39336k != null) {
            compositeEncoder.m(serialDescriptor, 10, BooleanSerializer.f42073a, fareMediaAutoload.f39336k);
        }
        if (compositeEncoder.w(serialDescriptor, 11) || fareMediaAutoload.f39337l != null) {
            compositeEncoder.m(serialDescriptor, 11, LongSerializer.f42142a, fareMediaAutoload.f39337l);
        }
        if (compositeEncoder.w(serialDescriptor, 12) || fareMediaAutoload.f39338m != null) {
            compositeEncoder.m(serialDescriptor, 12, FareProduct$$serializer.f39445a, fareMediaAutoload.f39338m);
        }
    }

    public final Long b() {
        return this.f39331f;
    }

    public final Long c() {
        return this.f39332g;
    }

    public final Long d() {
        return this.f39337l;
    }

    public final Long e() {
        return this.f39329d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMediaAutoload)) {
            return false;
        }
        FareMediaAutoload fareMediaAutoload = (FareMediaAutoload) obj;
        return Intrinsics.d(this.f39326a, fareMediaAutoload.f39326a) && this.f39327b == fareMediaAutoload.f39327b && Intrinsics.d(this.f39328c, fareMediaAutoload.f39328c) && Intrinsics.d(this.f39329d, fareMediaAutoload.f39329d) && Intrinsics.d(this.f39330e, fareMediaAutoload.f39330e) && Intrinsics.d(this.f39331f, fareMediaAutoload.f39331f) && Intrinsics.d(this.f39332g, fareMediaAutoload.f39332g) && Intrinsics.d(this.f39333h, fareMediaAutoload.f39333h) && Intrinsics.d(this.f39334i, fareMediaAutoload.f39334i) && Intrinsics.d(this.f39335j, fareMediaAutoload.f39335j) && Intrinsics.d(this.f39336k, fareMediaAutoload.f39336k) && Intrinsics.d(this.f39337l, fareMediaAutoload.f39337l) && Intrinsics.d(this.f39338m, fareMediaAutoload.f39338m);
    }

    public final Long f() {
        return this.f39334i;
    }

    public final Boolean g() {
        return this.f39326a;
    }

    public int hashCode() {
        Boolean bool = this.f39326a;
        int i2 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Type type = this.f39327b;
        int hashCode2 = (hashCode + (type == null ? 0 : type.hashCode())) * 31;
        String str = this.f39328c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f39329d;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f39330e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.f39331f;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f39332g;
        int hashCode7 = (hashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool2 = this.f39333h;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l5 = this.f39334i;
        int hashCode9 = (hashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        List list = this.f39335j;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool3 = this.f39336k;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l6 = this.f39337l;
        int hashCode12 = (hashCode11 + (l6 == null ? 0 : l6.hashCode())) * 31;
        FareProduct fareProduct = this.f39338m;
        if (fareProduct != null) {
            i2 = fareProduct.hashCode();
        }
        return hashCode12 + i2;
    }

    public String toString() {
        return "FareMediaAutoload(paused=" + this.f39326a + ", type=" + this.f39327b + ", passName=" + this.f39328c + ", balanceThreshold=" + this.f39329d + ", dayOfMonthThreshold=" + this.f39330e + ", autoloadAmount=" + this.f39331f + ", autoloadId=" + this.f39332g + ", isFundingSourceStoredValue=" + this.f39333h + ", fundingSourceId=" + this.f39334i + ", multiplePaymentMethods=" + this.f39335j + ", isBackupFundingSourceStoredValue=" + this.f39336k + ", backupFundingSourceId=" + this.f39337l + ", relatedPass=" + this.f39338m + ')';
    }
}
