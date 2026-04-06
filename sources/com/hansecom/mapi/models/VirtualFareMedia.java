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
public final class VirtualFareMedia {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39697a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39698b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39699c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f39700d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f39701e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39702f;

    /* renamed from: g  reason: collision with root package name */
    public final String f39703g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VirtualFareMedia> serializer() {
            return VirtualFareMedia$$serializer.f39704a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ VirtualFareMedia(int i2, Integer num, String str, String str2, Integer num2, Integer num3, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39697a = null;
        } else {
            this.f39697a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39698b = null;
        } else {
            this.f39698b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39699c = null;
        } else {
            this.f39699c = str2;
        }
        if ((i2 & 8) == 0) {
            this.f39700d = null;
        } else {
            this.f39700d = num2;
        }
        if ((i2 & 16) == 0) {
            this.f39701e = null;
        } else {
            this.f39701e = num3;
        }
        if ((i2 & 32) == 0) {
            this.f39702f = null;
        } else {
            this.f39702f = str3;
        }
        if ((i2 & 64) == 0) {
            this.f39703g = null;
        } else {
            this.f39703g = str4;
        }
    }

    public static final /* synthetic */ void f(VirtualFareMedia virtualFareMedia, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || virtualFareMedia.f39697a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, virtualFareMedia.f39697a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || virtualFareMedia.f39698b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, virtualFareMedia.f39698b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || virtualFareMedia.f39699c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, virtualFareMedia.f39699c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || virtualFareMedia.f39700d != null) {
            compositeEncoder.m(serialDescriptor, 3, IntSerializer.f42129a, virtualFareMedia.f39700d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || virtualFareMedia.f39701e != null) {
            compositeEncoder.m(serialDescriptor, 4, IntSerializer.f42129a, virtualFareMedia.f39701e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || virtualFareMedia.f39702f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, virtualFareMedia.f39702f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || virtualFareMedia.f39703g != null) {
            compositeEncoder.m(serialDescriptor, 6, StringSerializer.f42197a, virtualFareMedia.f39703g);
        }
    }

    public final Integer a() {
        return this.f39697a;
    }

    public final Integer b() {
        return this.f39700d;
    }

    public final Integer c() {
        return this.f39701e;
    }

    public final String d() {
        return this.f39702f;
    }

    public final String e() {
        return this.f39703g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualFareMedia)) {
            return false;
        }
        VirtualFareMedia virtualFareMedia = (VirtualFareMedia) obj;
        return Intrinsics.d(this.f39697a, virtualFareMedia.f39697a) && Intrinsics.d(this.f39698b, virtualFareMedia.f39698b) && Intrinsics.d(this.f39699c, virtualFareMedia.f39699c) && Intrinsics.d(this.f39700d, virtualFareMedia.f39700d) && Intrinsics.d(this.f39701e, virtualFareMedia.f39701e) && Intrinsics.d(this.f39702f, virtualFareMedia.f39702f) && Intrinsics.d(this.f39703g, virtualFareMedia.f39703g);
    }

    public int hashCode() {
        Integer num = this.f39697a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39698b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39699c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f39700d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f39701e;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.f39702f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39703g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode6 + i2;
    }

    public String toString() {
        return "VirtualFareMedia(id=" + this.f39697a + ", name=" + this.f39698b + ", description=" + this.f39699c + ", price=" + this.f39700d + ", riderTypeId=" + this.f39701e + ", riderTypeName=" + this.f39702f + ", riderTypeTerms=" + this.f39703g + ')';
    }
}
