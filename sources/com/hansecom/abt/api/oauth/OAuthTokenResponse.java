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
public final class OAuthTokenResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f33163c = 8;

    /* renamed from: a  reason: collision with root package name */
    public String f33164a;

    /* renamed from: b  reason: collision with root package name */
    public String f33165b;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<OAuthTokenResponse> serializer() {
            return OAuthTokenResponse$$serializer.f33166a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OAuthTokenResponse(int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f33164a = "";
        } else {
            this.f33164a = str;
        }
        if ((i2 & 2) == 0) {
            this.f33165b = "";
        } else {
            this.f33165b = str2;
        }
    }

    public static final /* synthetic */ void c(OAuthTokenResponse oAuthTokenResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || !Intrinsics.d(oAuthTokenResponse.f33164a, "")) {
            compositeEncoder.t(serialDescriptor, 0, oAuthTokenResponse.f33164a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || !Intrinsics.d(oAuthTokenResponse.f33165b, "")) {
            compositeEncoder.t(serialDescriptor, 1, oAuthTokenResponse.f33165b);
        }
    }

    public final String a() {
        return this.f33164a;
    }

    public final String b() {
        return this.f33165b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthTokenResponse)) {
            return false;
        }
        OAuthTokenResponse oAuthTokenResponse = (OAuthTokenResponse) obj;
        return Intrinsics.d(this.f33164a, oAuthTokenResponse.f33164a) && Intrinsics.d(this.f33165b, oAuthTokenResponse.f33165b);
    }

    public int hashCode() {
        return (this.f33164a.hashCode() * 31) + this.f33165b.hashCode();
    }

    public String toString() {
        String str = this.f33164a;
        String str2 = this.f33165b;
        return "OAuthTokenResponse(accessToken=" + str + ", refreshToken=" + str2 + ")";
    }
}
