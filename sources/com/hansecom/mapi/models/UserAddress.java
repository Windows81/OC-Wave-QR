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
public final class UserAddress {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Long f39665a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39666b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39667c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39668d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39669e;

    /* renamed from: f  reason: collision with root package name */
    public final Boolean f39670f;

    /* renamed from: g  reason: collision with root package name */
    public final String f39671g;

    /* renamed from: h  reason: collision with root package name */
    public final String f39672h;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserAddress> serializer() {
            return UserAddress$$serializer.f39673a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ UserAddress(int i2, Long l2, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39665a = null;
        } else {
            this.f39665a = l2;
        }
        if ((i2 & 2) == 0) {
            this.f39666b = null;
        } else {
            this.f39666b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39667c = null;
        } else {
            this.f39667c = str2;
        }
        if ((i2 & 8) == 0) {
            this.f39668d = null;
        } else {
            this.f39668d = str3;
        }
        if ((i2 & 16) == 0) {
            this.f39669e = null;
        } else {
            this.f39669e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f39670f = Boolean.FALSE;
        } else {
            this.f39670f = bool;
        }
        if ((i2 & 64) == 0) {
            this.f39671g = null;
        } else {
            this.f39671g = str5;
        }
        if ((i2 & 128) == 0) {
            this.f39672h = null;
        } else {
            this.f39672h = str6;
        }
    }

    public static final /* synthetic */ void h(UserAddress userAddress, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || userAddress.f39665a != null) {
            compositeEncoder.m(serialDescriptor, 0, LongSerializer.f42142a, userAddress.f39665a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || userAddress.f39666b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, userAddress.f39666b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || userAddress.f39667c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, userAddress.f39667c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || userAddress.f39668d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, userAddress.f39668d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || userAddress.f39669e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, userAddress.f39669e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || !Intrinsics.d(userAddress.f39670f, Boolean.FALSE)) {
            compositeEncoder.m(serialDescriptor, 5, BooleanSerializer.f42073a, userAddress.f39670f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || userAddress.f39671g != null) {
            compositeEncoder.m(serialDescriptor, 6, StringSerializer.f42197a, userAddress.f39671g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || userAddress.f39672h != null) {
            compositeEncoder.m(serialDescriptor, 7, StringSerializer.f42197a, userAddress.f39672h);
        }
    }

    public final String a() {
        return this.f39668d;
    }

    public final String b() {
        return this.f39671g;
    }

    public final String c() {
        return this.f39669e;
    }

    public final Boolean d() {
        return this.f39670f;
    }

    public final String e() {
        return this.f39666b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAddress)) {
            return false;
        }
        UserAddress userAddress = (UserAddress) obj;
        return Intrinsics.d(this.f39665a, userAddress.f39665a) && Intrinsics.d(this.f39666b, userAddress.f39666b) && Intrinsics.d(this.f39667c, userAddress.f39667c) && Intrinsics.d(this.f39668d, userAddress.f39668d) && Intrinsics.d(this.f39669e, userAddress.f39669e) && Intrinsics.d(this.f39670f, userAddress.f39670f) && Intrinsics.d(this.f39671g, userAddress.f39671g) && Intrinsics.d(this.f39672h, userAddress.f39672h);
    }

    public final String f() {
        return this.f39667c;
    }

    public final String g() {
        return this.f39672h;
    }

    public int hashCode() {
        Long l2 = this.f39665a;
        int i2 = 0;
        int hashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.f39666b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39667c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39668d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39669e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f39670f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f39671g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f39672h;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode7 + i2;
    }

    public String toString() {
        return "UserAddress(userAddressId=" + this.f39665a + ", street=" + this.f39666b + ", streetOptional=" + this.f39667c + ", city=" + this.f39668d + ", state=" + this.f39669e + ", stateIsEnum=" + this.f39670f + ", country=" + this.f39671g + ", zip=" + this.f39672h + ')';
    }

    public UserAddress(Long l2, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        this.f39665a = l2;
        this.f39666b = str;
        this.f39667c = str2;
        this.f39668d = str3;
        this.f39669e = str4;
        this.f39670f = bool;
        this.f39671g = str5;
        this.f39672h = str6;
    }
}
