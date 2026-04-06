package com.hansecom.abt.api.oauth;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class OAuthErrorResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f33156c = 8;

    /* renamed from: a  reason: collision with root package name */
    public String f33157a;

    /* renamed from: b  reason: collision with root package name */
    public String f33158b;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<OAuthErrorResponse> serializer() {
            return OAuthErrorResponse$$serializer.f33159a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OAuthErrorResponse(int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f33157a = "";
        } else {
            this.f33157a = str;
        }
        if ((i2 & 2) == 0) {
            this.f33158b = "";
        } else {
            this.f33158b = str2;
        }
    }

    public static final /* synthetic */ void c(OAuthErrorResponse oAuthErrorResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || !Intrinsics.d(oAuthErrorResponse.f33157a, "")) {
            compositeEncoder.t(serialDescriptor, 0, oAuthErrorResponse.f33157a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || !Intrinsics.d(oAuthErrorResponse.f33158b, "")) {
            compositeEncoder.t(serialDescriptor, 1, oAuthErrorResponse.f33158b);
        }
    }

    public final String a() {
        return this.f33157a;
    }

    public final String b() {
        return this.f33158b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthErrorResponse)) {
            return false;
        }
        OAuthErrorResponse oAuthErrorResponse = (OAuthErrorResponse) obj;
        return Intrinsics.d(this.f33157a, oAuthErrorResponse.f33157a) && Intrinsics.d(this.f33158b, oAuthErrorResponse.f33158b);
    }

    public int hashCode() {
        return (this.f33157a.hashCode() * 31) + this.f33158b.hashCode();
    }

    public String toString() {
        String str = this.f33157a;
        String str2 = this.f33158b;
        return "OAuthErrorResponse(error=" + str + ", errorDescription=" + str2 + ")";
    }
}
