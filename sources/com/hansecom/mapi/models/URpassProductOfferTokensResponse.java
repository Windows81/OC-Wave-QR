package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class URpassProductOfferTokensResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39609a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39610b;

    /* renamed from: c  reason: collision with root package name */
    public final int f39611c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39612d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<URpassProductOfferTokensResponse> serializer() {
            return URpassProductOfferTokensResponse$$serializer.f39613a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ URpassProductOfferTokensResponse(int i2, String str, String str2, int i3, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i2 & 15)) {
            PluginExceptionsKt.a(i2, 15, URpassProductOfferTokensResponse$$serializer.f39613a.a());
        }
        this.f39609a = str;
        this.f39610b = str2;
        this.f39611c = i3;
        this.f39612d = str3;
    }

    public static final /* synthetic */ void a(URpassProductOfferTokensResponse uRpassProductOfferTokensResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, uRpassProductOfferTokensResponse.f39609a);
        compositeEncoder.t(serialDescriptor, 1, uRpassProductOfferTokensResponse.f39610b);
        compositeEncoder.r(serialDescriptor, 2, uRpassProductOfferTokensResponse.f39611c);
        compositeEncoder.t(serialDescriptor, 3, uRpassProductOfferTokensResponse.f39612d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URpassProductOfferTokensResponse)) {
            return false;
        }
        URpassProductOfferTokensResponse uRpassProductOfferTokensResponse = (URpassProductOfferTokensResponse) obj;
        return Intrinsics.d(this.f39609a, uRpassProductOfferTokensResponse.f39609a) && Intrinsics.d(this.f39610b, uRpassProductOfferTokensResponse.f39610b) && this.f39611c == uRpassProductOfferTokensResponse.f39611c && Intrinsics.d(this.f39612d, uRpassProductOfferTokensResponse.f39612d);
    }

    public int hashCode() {
        return (((((this.f39609a.hashCode() * 31) + this.f39610b.hashCode()) * 31) + Integer.hashCode(this.f39611c)) * 31) + this.f39612d.hashCode();
    }

    public String toString() {
        return "URpassProductOfferTokensResponse(name=" + this.f39609a + ", description=" + this.f39610b + ", price=" + this.f39611c + ", offerToken=" + this.f39612d + ')';
    }
}
