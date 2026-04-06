package com.hansecom.abt.api.networkMerchants;

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
public final class CreateNetworkMerchantTokenResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f33129a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33130b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33131c;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CreateNetworkMerchantTokenResponse> serializer() {
            return CreateNetworkMerchantTokenResponse$$serializer.f33132a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreateNetworkMerchantTokenResponse(int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i2 & 7)) {
            PluginExceptionsKt.a(i2, 7, CreateNetworkMerchantTokenResponse$$serializer.f33132a.a());
        }
        this.f33129a = str;
        this.f33130b = str2;
        this.f33131c = str3;
    }

    public static final /* synthetic */ void a(CreateNetworkMerchantTokenResponse createNetworkMerchantTokenResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, createNetworkMerchantTokenResponse.f33129a);
        compositeEncoder.t(serialDescriptor, 1, createNetworkMerchantTokenResponse.f33130b);
        compositeEncoder.t(serialDescriptor, 2, createNetworkMerchantTokenResponse.f33131c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateNetworkMerchantTokenResponse)) {
            return false;
        }
        CreateNetworkMerchantTokenResponse createNetworkMerchantTokenResponse = (CreateNetworkMerchantTokenResponse) obj;
        return Intrinsics.d(this.f33129a, createNetworkMerchantTokenResponse.f33129a) && Intrinsics.d(this.f33130b, createNetworkMerchantTokenResponse.f33130b) && Intrinsics.d(this.f33131c, createNetworkMerchantTokenResponse.f33131c);
    }

    public int hashCode() {
        return (((this.f33129a.hashCode() * 31) + this.f33130b.hashCode()) * 31) + this.f33131c.hashCode();
    }

    public String toString() {
        String str = this.f33129a;
        String str2 = this.f33130b;
        String str3 = this.f33131c;
        return "CreateNetworkMerchantTokenResponse(cardToken=" + str + ", merchantId=" + str2 + ", merchantName=" + str3 + ")";
    }
}
