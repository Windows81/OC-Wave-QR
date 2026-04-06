package com.hansecom.mapi.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class ErrorResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer[] f39313h = {null, null, new ArrayListSerializer(ValidationError$$serializer.f39690a), null, null, null, new ArrayListSerializer(StringSerializer.f42197a)};

    /* renamed from: a  reason: collision with root package name */
    public final String f39314a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39315b;

    /* renamed from: c  reason: collision with root package name */
    public final List f39316c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39317d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39318e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39319f;

    /* renamed from: g  reason: collision with root package name */
    public final List f39320g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ErrorResponse> serializer() {
            return ErrorResponse$$serializer.f39321a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ErrorResponse(int i2, String str, String str2, List list, String str3, String str4, String str5, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39314a = null;
        } else {
            this.f39314a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39315b = null;
        } else {
            this.f39315b = str2;
        }
        if ((i2 & 4) == 0) {
            this.f39316c = null;
        } else {
            this.f39316c = list;
        }
        if ((i2 & 8) == 0) {
            this.f39317d = null;
        } else {
            this.f39317d = str3;
        }
        if ((i2 & 16) == 0) {
            this.f39318e = null;
        } else {
            this.f39318e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f39319f = null;
        } else {
            this.f39319f = str5;
        }
        if ((i2 & 64) == 0) {
            this.f39320g = null;
        } else {
            this.f39320g = list2;
        }
    }

    public static final /* synthetic */ void g(ErrorResponse errorResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39313h;
        if (compositeEncoder.w(serialDescriptor, 0) || errorResponse.f39314a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, errorResponse.f39314a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || errorResponse.f39315b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, errorResponse.f39315b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || errorResponse.f39316c != null) {
            compositeEncoder.m(serialDescriptor, 2, kSerializerArr[2], errorResponse.f39316c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || errorResponse.f39317d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, errorResponse.f39317d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || errorResponse.f39318e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, errorResponse.f39318e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || errorResponse.f39319f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, errorResponse.f39319f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || errorResponse.f39320g != null) {
            compositeEncoder.m(serialDescriptor, 6, kSerializerArr[6], errorResponse.f39320g);
        }
    }

    public final String b() {
        return this.f39314a;
    }

    public final String c() {
        return this.f39319f;
    }

    public final List d() {
        return this.f39320g;
    }

    public final String e() {
        return this.f39317d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) obj;
        return Intrinsics.d(this.f39314a, errorResponse.f39314a) && Intrinsics.d(this.f39315b, errorResponse.f39315b) && Intrinsics.d(this.f39316c, errorResponse.f39316c) && Intrinsics.d(this.f39317d, errorResponse.f39317d) && Intrinsics.d(this.f39318e, errorResponse.f39318e) && Intrinsics.d(this.f39319f, errorResponse.f39319f) && Intrinsics.d(this.f39320g, errorResponse.f39320g);
    }

    public final List f() {
        return this.f39316c;
    }

    public int hashCode() {
        String str = this.f39314a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39315b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f39316c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f39317d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39318e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39319f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list2 = this.f39320g;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode6 + i2;
    }

    public String toString() {
        return "ErrorResponse(errorCode=" + this.f39314a + ", developerMessage=" + this.f39315b + ", validationErrors=" + this.f39316c + ", userMessage=" + this.f39317d + ", moreInfo=" + this.f39318e + ", localizationKey=" + this.f39319f + ", localizationValues=" + this.f39320g + ')';
    }
}
