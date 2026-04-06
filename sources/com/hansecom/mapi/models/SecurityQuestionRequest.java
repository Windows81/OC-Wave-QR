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
public final class SecurityQuestionRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39576a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39577b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SecurityQuestionRequest> serializer() {
            return SecurityQuestionRequest$$serializer.f39578a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ SecurityQuestionRequest(int i2, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39576a = null;
        } else {
            this.f39576a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39577b = null;
        } else {
            this.f39577b = str;
        }
    }

    public static final /* synthetic */ void a(SecurityQuestionRequest securityQuestionRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || securityQuestionRequest.f39576a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, securityQuestionRequest.f39576a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || securityQuestionRequest.f39577b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, securityQuestionRequest.f39577b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityQuestionRequest)) {
            return false;
        }
        SecurityQuestionRequest securityQuestionRequest = (SecurityQuestionRequest) obj;
        return Intrinsics.d(this.f39576a, securityQuestionRequest.f39576a) && Intrinsics.d(this.f39577b, securityQuestionRequest.f39577b);
    }

    public int hashCode() {
        Integer num = this.f39576a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39577b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "SecurityQuestionRequest(questionId=" + this.f39576a + ", answer=" + this.f39577b + ')';
    }

    public SecurityQuestionRequest(Integer num, String str) {
        this.f39576a = num;
        this.f39577b = str;
    }
}
