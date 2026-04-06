package com.hansecom.mapi.models;

import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ContextualSerializer;
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
public final class URpassTicketsResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    public static final KSerializer[] f39626o = {new ContextualSerializer(Reflection.b(UUID.class), (KSerializer) null, new KSerializer[0]), new ContextualSerializer(Reflection.b(Object.class), (KSerializer) null, new KSerializer[0]), null, null, null, null, Type.Companion.serializer(), UrPassRiderClass.Companion.serializer(), null, null, null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final UUID f39627a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f39628b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f39629c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39630d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39631e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39632f;

    /* renamed from: g  reason: collision with root package name */
    public final Type f39633g;

    /* renamed from: h  reason: collision with root package name */
    public final UrPassRiderClass f39634h;

    /* renamed from: i  reason: collision with root package name */
    public final String f39635i;

    /* renamed from: j  reason: collision with root package name */
    public final String f39636j;

    /* renamed from: k  reason: collision with root package name */
    public final Integer f39637k;

    /* renamed from: l  reason: collision with root package name */
    public final String f39638l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f39639m;

    /* renamed from: n  reason: collision with root package name */
    public final Integer f39640n;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<URpassTicketsResponse> serializer() {
            return URpassTicketsResponse$$serializer.f39641a;
        }

        public Companion() {
        }
    }

    @Metadata
    @Serializable
    public enum Type {
        SINGLE("SINGLE"),
        RETURN("RETURN"),
        DAY_PASS("DAY_PASS"),
        MONTH_PASS("MONTH_PASS"),
        HOLIDAY_PASS("HOLIDAY_PASS"),
        TIME_PASS("TIME_PASS"),
        FLEX("FLEX");
        

        /* renamed from: A  reason: collision with root package name */
        public static final Lazy f39642A = null;
        public static final Companion Companion = null;

        /* renamed from: z  reason: collision with root package name */
        public final String f39644z;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer a() {
                return (KSerializer) Type.f39642A.getValue();
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
            f39642A = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, Companion.AnonymousClass1.f39645z);
        }

        /* access modifiers changed from: public */
        Type(String str) {
            this.f39644z = str;
        }
    }

    @Metadata
    @Serializable
    public enum UrPassRiderClass {
        ADULT("ADULT"),
        CHILD("CHILD"),
        SENIOR("SENIOR"),
        REDUCED("REDUCED"),
        OTHER("OTHER");
        

        /* renamed from: A  reason: collision with root package name */
        public static final Lazy f39646A = null;
        public static final Companion Companion = null;

        /* renamed from: z  reason: collision with root package name */
        public final String f39648z;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer a() {
                return (KSerializer) UrPassRiderClass.f39646A.getValue();
            }

            public final KSerializer<UrPassRiderClass> serializer() {
                return a();
            }

            public Companion() {
            }
        }

        static {
            UrPassRiderClass[] d2;
            C = EnumEntriesKt.a(d2);
            Companion = new Companion((DefaultConstructorMarker) null);
            f39646A = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, Companion.AnonymousClass1.f39649z);
        }

        /* access modifiers changed from: public */
        UrPassRiderClass(String str) {
            this.f39648z = str;
        }
    }

    public /* synthetic */ URpassTicketsResponse(int i2, UUID uuid, Object obj, Boolean bool, String str, String str2, String str3, Type type, UrPassRiderClass urPassRiderClass, String str4, String str5, Integer num, String str6, Integer num2, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        int i3 = i2;
        if ((i3 & 1) == 0) {
            this.f39627a = null;
        } else {
            this.f39627a = uuid;
        }
        if ((i3 & 2) == 0) {
            this.f39628b = null;
        } else {
            this.f39628b = obj;
        }
        if ((i3 & 4) == 0) {
            this.f39629c = null;
        } else {
            this.f39629c = bool;
        }
        if ((i3 & 8) == 0) {
            this.f39630d = null;
        } else {
            this.f39630d = str;
        }
        if ((i3 & 16) == 0) {
            this.f39631e = null;
        } else {
            this.f39631e = str2;
        }
        if ((i3 & 32) == 0) {
            this.f39632f = null;
        } else {
            this.f39632f = str3;
        }
        if ((i3 & 64) == 0) {
            this.f39633g = null;
        } else {
            this.f39633g = type;
        }
        if ((i3 & 128) == 0) {
            this.f39634h = null;
        } else {
            this.f39634h = urPassRiderClass;
        }
        if ((i3 & 256) == 0) {
            this.f39635i = null;
        } else {
            this.f39635i = str4;
        }
        if ((i3 & 512) == 0) {
            this.f39636j = null;
        } else {
            this.f39636j = str5;
        }
        if ((i3 & 1024) == 0) {
            this.f39637k = null;
        } else {
            this.f39637k = num;
        }
        if ((i3 & 2048) == 0) {
            this.f39638l = null;
        } else {
            this.f39638l = str6;
        }
        if ((i3 & 4096) == 0) {
            this.f39639m = null;
        } else {
            this.f39639m = num2;
        }
        if ((i3 & 8192) == 0) {
            this.f39640n = null;
        } else {
            this.f39640n = num3;
        }
    }

    public static final /* synthetic */ void b(URpassTicketsResponse uRpassTicketsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39626o;
        if (compositeEncoder.w(serialDescriptor, 0) || uRpassTicketsResponse.f39627a != null) {
            compositeEncoder.m(serialDescriptor, 0, kSerializerArr[0], uRpassTicketsResponse.f39627a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || uRpassTicketsResponse.f39628b != null) {
            compositeEncoder.m(serialDescriptor, 1, kSerializerArr[1], uRpassTicketsResponse.f39628b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || uRpassTicketsResponse.f39629c != null) {
            compositeEncoder.m(serialDescriptor, 2, BooleanSerializer.f42073a, uRpassTicketsResponse.f39629c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || uRpassTicketsResponse.f39630d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, uRpassTicketsResponse.f39630d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || uRpassTicketsResponse.f39631e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, uRpassTicketsResponse.f39631e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || uRpassTicketsResponse.f39632f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, uRpassTicketsResponse.f39632f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || uRpassTicketsResponse.f39633g != null) {
            compositeEncoder.m(serialDescriptor, 6, kSerializerArr[6], uRpassTicketsResponse.f39633g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || uRpassTicketsResponse.f39634h != null) {
            compositeEncoder.m(serialDescriptor, 7, kSerializerArr[7], uRpassTicketsResponse.f39634h);
        }
        if (compositeEncoder.w(serialDescriptor, 8) || uRpassTicketsResponse.f39635i != null) {
            compositeEncoder.m(serialDescriptor, 8, StringSerializer.f42197a, uRpassTicketsResponse.f39635i);
        }
        if (compositeEncoder.w(serialDescriptor, 9) || uRpassTicketsResponse.f39636j != null) {
            compositeEncoder.m(serialDescriptor, 9, StringSerializer.f42197a, uRpassTicketsResponse.f39636j);
        }
        if (compositeEncoder.w(serialDescriptor, 10) || uRpassTicketsResponse.f39637k != null) {
            compositeEncoder.m(serialDescriptor, 10, IntSerializer.f42129a, uRpassTicketsResponse.f39637k);
        }
        if (compositeEncoder.w(serialDescriptor, 11) || uRpassTicketsResponse.f39638l != null) {
            compositeEncoder.m(serialDescriptor, 11, StringSerializer.f42197a, uRpassTicketsResponse.f39638l);
        }
        if (compositeEncoder.w(serialDescriptor, 12) || uRpassTicketsResponse.f39639m != null) {
            compositeEncoder.m(serialDescriptor, 12, IntSerializer.f42129a, uRpassTicketsResponse.f39639m);
        }
        if (compositeEncoder.w(serialDescriptor, 13) || uRpassTicketsResponse.f39640n != null) {
            compositeEncoder.m(serialDescriptor, 13, IntSerializer.f42129a, uRpassTicketsResponse.f39640n);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URpassTicketsResponse)) {
            return false;
        }
        URpassTicketsResponse uRpassTicketsResponse = (URpassTicketsResponse) obj;
        return Intrinsics.d(this.f39627a, uRpassTicketsResponse.f39627a) && Intrinsics.d(this.f39628b, uRpassTicketsResponse.f39628b) && Intrinsics.d(this.f39629c, uRpassTicketsResponse.f39629c) && Intrinsics.d(this.f39630d, uRpassTicketsResponse.f39630d) && Intrinsics.d(this.f39631e, uRpassTicketsResponse.f39631e) && Intrinsics.d(this.f39632f, uRpassTicketsResponse.f39632f) && this.f39633g == uRpassTicketsResponse.f39633g && this.f39634h == uRpassTicketsResponse.f39634h && Intrinsics.d(this.f39635i, uRpassTicketsResponse.f39635i) && Intrinsics.d(this.f39636j, uRpassTicketsResponse.f39636j) && Intrinsics.d(this.f39637k, uRpassTicketsResponse.f39637k) && Intrinsics.d(this.f39638l, uRpassTicketsResponse.f39638l) && Intrinsics.d(this.f39639m, uRpassTicketsResponse.f39639m) && Intrinsics.d(this.f39640n, uRpassTicketsResponse.f39640n);
    }

    public int hashCode() {
        UUID uuid = this.f39627a;
        int i2 = 0;
        int hashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        Object obj = this.f39628b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool = this.f39629c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f39630d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39631e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39632f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Type type = this.f39633g;
        int hashCode7 = (hashCode6 + (type == null ? 0 : type.hashCode())) * 31;
        UrPassRiderClass urPassRiderClass = this.f39634h;
        int hashCode8 = (hashCode7 + (urPassRiderClass == null ? 0 : urPassRiderClass.hashCode())) * 31;
        String str4 = this.f39635i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39636j;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f39637k;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f39638l;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.f39639m;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f39640n;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return hashCode13 + i2;
    }

    public String toString() {
        return "URpassTicketsResponse(id=" + this.f39627a + ", urpassTenantId=" + this.f39628b + ", isActive=" + this.f39629c + ", status=" + this.f39630d + ", name=" + this.f39631e + ", description=" + this.f39632f + ", type=" + this.f39633g + ", urPassRiderClass=" + this.f39634h + ", inspectionCode=" + this.f39635i + ", validTo=" + this.f39636j + ", price=" + this.f39637k + ", barcodeContent=" + this.f39638l + ", activationCount=" + this.f39639m + ", maxActivationCount=" + this.f39640n + ')';
    }
}
