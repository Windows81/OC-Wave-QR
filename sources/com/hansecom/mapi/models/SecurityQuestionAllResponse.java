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
public final class SecurityQuestionAllResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39573a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39574b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SecurityQuestionAllResponse> serializer() {
            return SecurityQuestionAllResponse$$serializer.f39575a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ SecurityQuestionAllResponse(int i2, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39573a = null;
        } else {
            this.f39573a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39574b = null;
        } else {
            this.f39574b = str;
        }
    }

    public static final /* synthetic */ void c(SecurityQuestionAllResponse securityQuestionAllResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || securityQuestionAllResponse.f39573a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, securityQuestionAllResponse.f39573a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || securityQuestionAllResponse.f39574b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, securityQuestionAllResponse.f39574b);
        }
    }

    public final Integer a() {
        return this.f39573a;
    }

    public final String b() {
        return this.f39574b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityQuestionAllResponse)) {
            return false;
        }
        SecurityQuestionAllResponse securityQuestionAllResponse = (SecurityQuestionAllResponse) obj;
        return Intrinsics.d(this.f39573a, securityQuestionAllResponse.f39573a) && Intrinsics.d(this.f39574b, securityQuestionAllResponse.f39574b);
    }

    public int hashCode() {
        Integer num = this.f39573a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39574b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "SecurityQuestionAllResponse(id=" + this.f39573a + ", value=" + this.f39574b + ')';
    }
}
