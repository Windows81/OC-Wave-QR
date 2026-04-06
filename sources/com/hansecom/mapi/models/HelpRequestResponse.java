package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class HelpRequestResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39467a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39468b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39469c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39470d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39471e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39472f;

    /* renamed from: g  reason: collision with root package name */
    public final String f39473g;

    /* renamed from: h  reason: collision with root package name */
    public final String f39474h;

    /* renamed from: i  reason: collision with root package name */
    public final String f39475i;

    /* renamed from: j  reason: collision with root package name */
    public final String f39476j;

    /* renamed from: k  reason: collision with root package name */
    public final String f39477k;

    /* renamed from: l  reason: collision with root package name */
    public final String f39478l;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HelpRequestResponse> serializer() {
            return HelpRequestResponse$$serializer.f39479a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ HelpRequestResponse(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39467a = null;
        } else {
            this.f39467a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39468b = null;
        } else {
            this.f39468b = str2;
        }
        if ((i2 & 4) == 0) {
            this.f39469c = null;
        } else {
            this.f39469c = str3;
        }
        if ((i2 & 8) == 0) {
            this.f39470d = null;
        } else {
            this.f39470d = str4;
        }
        if ((i2 & 16) == 0) {
            this.f39471e = null;
        } else {
            this.f39471e = str5;
        }
        if ((i2 & 32) == 0) {
            this.f39472f = null;
        } else {
            this.f39472f = str6;
        }
        if ((i2 & 64) == 0) {
            this.f39473g = null;
        } else {
            this.f39473g = str7;
        }
        if ((i2 & 128) == 0) {
            this.f39474h = null;
        } else {
            this.f39474h = str8;
        }
        if ((i2 & 256) == 0) {
            this.f39475i = null;
        } else {
            this.f39475i = str9;
        }
        if ((i2 & 512) == 0) {
            this.f39476j = null;
        } else {
            this.f39476j = str10;
        }
        if ((i2 & 1024) == 0) {
            this.f39477k = null;
        } else {
            this.f39477k = str11;
        }
        if ((i2 & 2048) == 0) {
            this.f39478l = null;
        } else {
            this.f39478l = str12;
        }
    }

    public static final /* synthetic */ void a(HelpRequestResponse helpRequestResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || helpRequestResponse.f39467a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, helpRequestResponse.f39467a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || helpRequestResponse.f39468b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, helpRequestResponse.f39468b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || helpRequestResponse.f39469c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, helpRequestResponse.f39469c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || helpRequestResponse.f39470d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, helpRequestResponse.f39470d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || helpRequestResponse.f39471e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, helpRequestResponse.f39471e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || helpRequestResponse.f39472f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, helpRequestResponse.f39472f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || helpRequestResponse.f39473g != null) {
            compositeEncoder.m(serialDescriptor, 6, StringSerializer.f42197a, helpRequestResponse.f39473g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || helpRequestResponse.f39474h != null) {
            compositeEncoder.m(serialDescriptor, 7, StringSerializer.f42197a, helpRequestResponse.f39474h);
        }
        if (compositeEncoder.w(serialDescriptor, 8) || helpRequestResponse.f39475i != null) {
            compositeEncoder.m(serialDescriptor, 8, StringSerializer.f42197a, helpRequestResponse.f39475i);
        }
        if (compositeEncoder.w(serialDescriptor, 9) || helpRequestResponse.f39476j != null) {
            compositeEncoder.m(serialDescriptor, 9, StringSerializer.f42197a, helpRequestResponse.f39476j);
        }
        if (compositeEncoder.w(serialDescriptor, 10) || helpRequestResponse.f39477k != null) {
            compositeEncoder.m(serialDescriptor, 10, StringSerializer.f42197a, helpRequestResponse.f39477k);
        }
        if (compositeEncoder.w(serialDescriptor, 11) || helpRequestResponse.f39478l != null) {
            compositeEncoder.m(serialDescriptor, 11, StringSerializer.f42197a, helpRequestResponse.f39478l);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpRequestResponse)) {
            return false;
        }
        HelpRequestResponse helpRequestResponse = (HelpRequestResponse) obj;
        return Intrinsics.d(this.f39467a, helpRequestResponse.f39467a) && Intrinsics.d(this.f39468b, helpRequestResponse.f39468b) && Intrinsics.d(this.f39469c, helpRequestResponse.f39469c) && Intrinsics.d(this.f39470d, helpRequestResponse.f39470d) && Intrinsics.d(this.f39471e, helpRequestResponse.f39471e) && Intrinsics.d(this.f39472f, helpRequestResponse.f39472f) && Intrinsics.d(this.f39473g, helpRequestResponse.f39473g) && Intrinsics.d(this.f39474h, helpRequestResponse.f39474h) && Intrinsics.d(this.f39475i, helpRequestResponse.f39475i) && Intrinsics.d(this.f39476j, helpRequestResponse.f39476j) && Intrinsics.d(this.f39477k, helpRequestResponse.f39477k) && Intrinsics.d(this.f39478l, helpRequestResponse.f39478l);
    }

    public int hashCode() {
        String str = this.f39467a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39468b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39469c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39470d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39471e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f39472f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f39473g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f39474h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f39475i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f39476j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f39477k;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f39478l;
        if (str12 != null) {
            i2 = str12.hashCode();
        }
        return hashCode11 + i2;
    }

    public String toString() {
        return "HelpRequestResponse(contactName=" + this.f39467a + ", email=" + this.f39468b + ", phoneNumber=" + this.f39469c + ", subject=" + this.f39470d + ", card=" + this.f39471e + ", description=" + this.f39472f + ", caseReason=" + this.f39473g + ", caseCategory=" + this.f39474h + ", caseResolution=" + this.f39475i + ", appVersion=" + this.f39476j + ", deviceType=" + this.f39477k + ", attachmentName=" + this.f39478l + ')';
    }
}
