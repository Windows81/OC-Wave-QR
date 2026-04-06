package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class Institution {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39480a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39481b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39482c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39483d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39484e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39485f;

    /* renamed from: g  reason: collision with root package name */
    public final UserAddress f39486g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Institution> serializer() {
            return Institution$$serializer.f39487a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Institution(int i2, Integer num, String str, String str2, String str3, String str4, String str5, UserAddress userAddress, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39480a = null;
        } else {
            this.f39480a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39481b = null;
        } else {
            this.f39481b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39482c = null;
        } else {
            this.f39482c = str2;
        }
        if ((i2 & 8) == 0) {
            this.f39483d = null;
        } else {
            this.f39483d = str3;
        }
        if ((i2 & 16) == 0) {
            this.f39484e = null;
        } else {
            this.f39484e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f39485f = null;
        } else {
            this.f39485f = str5;
        }
        if ((i2 & 64) == 0) {
            this.f39486g = null;
        } else {
            this.f39486g = userAddress;
        }
    }

    public static final /* synthetic */ void g(Institution institution, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || institution.f39480a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, institution.f39480a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || institution.f39481b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, institution.f39481b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || institution.f39482c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, institution.f39482c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || institution.f39483d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, institution.f39483d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || institution.f39484e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, institution.f39484e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || institution.f39485f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, institution.f39485f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || institution.f39486g != null) {
            compositeEncoder.m(serialDescriptor, 6, UserAddress$$serializer.f39673a, institution.f39486g);
        }
    }

    public final Integer a() {
        return this.f39480a;
    }

    public final UserAddress b() {
        return this.f39486g;
    }

    public final String c() {
        return this.f39485f;
    }

    public final String d() {
        return this.f39481b;
    }

    public final String e() {
        return this.f39484e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Institution)) {
            return false;
        }
        Institution institution = (Institution) obj;
        return Intrinsics.d(this.f39480a, institution.f39480a) && Intrinsics.d(this.f39481b, institution.f39481b) && Intrinsics.d(this.f39482c, institution.f39482c) && Intrinsics.d(this.f39483d, institution.f39483d) && Intrinsics.d(this.f39484e, institution.f39484e) && Intrinsics.d(this.f39485f, institution.f39485f) && Intrinsics.d(this.f39486g, institution.f39486g);
    }

    public final String f() {
        return this.f39482c;
    }

    public int hashCode() {
        Integer num = this.f39480a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39481b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39482c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39483d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39484e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39485f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        UserAddress userAddress = this.f39486g;
        if (userAddress != null) {
            i2 = userAddress.hashCode();
        }
        return hashCode6 + i2;
    }

    public String toString() {
        return "Institution(id=" + this.f39480a + ", name=" + this.f39481b + ", phoneNumber=" + this.f39482c + ", faxNumber=" + this.f39483d + ", participantName=" + this.f39484e + ", institutionType=" + this.f39485f + ", institutionAddress=" + this.f39486g + ')';
    }
}
