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
public final class SecurityQuestionResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39579a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39580b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39581c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SecurityQuestionResponse> serializer() {
            return SecurityQuestionResponse$$serializer.f39582a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ SecurityQuestionResponse(int i2, Integer num, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39579a = null;
        } else {
            this.f39579a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39580b = null;
        } else {
            this.f39580b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39581c = null;
        } else {
            this.f39581c = str2;
        }
    }

    public static final /* synthetic */ void d(SecurityQuestionResponse securityQuestionResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || securityQuestionResponse.f39579a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, securityQuestionResponse.f39579a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || securityQuestionResponse.f39580b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, securityQuestionResponse.f39580b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || securityQuestionResponse.f39581c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, securityQuestionResponse.f39581c);
        }
    }

    public final String a() {
        return this.f39581c;
    }

    public final Integer b() {
        return this.f39579a;
    }

    public final String c() {
        return this.f39580b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityQuestionResponse)) {
            return false;
        }
        SecurityQuestionResponse securityQuestionResponse = (SecurityQuestionResponse) obj;
        return Intrinsics.d(this.f39579a, securityQuestionResponse.f39579a) && Intrinsics.d(this.f39580b, securityQuestionResponse.f39580b) && Intrinsics.d(this.f39581c, securityQuestionResponse.f39581c);
    }

    public int hashCode() {
        Integer num = this.f39579a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39580b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39581c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "SecurityQuestionResponse(questionId=" + this.f39579a + ", questionText=" + this.f39580b + ", answer=" + this.f39581c + ')';
    }
}
