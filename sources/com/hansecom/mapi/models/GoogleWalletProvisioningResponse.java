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
public final class GoogleWalletProvisioningResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39460a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39461b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GoogleWalletProvisioningResponse> serializer() {
            return GoogleWalletProvisioningResponse$$serializer.f39462a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ GoogleWalletProvisioningResponse(int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39460a = null;
        } else {
            this.f39460a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39461b = null;
        } else {
            this.f39461b = str2;
        }
    }

    public static final /* synthetic */ void c(GoogleWalletProvisioningResponse googleWalletProvisioningResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || googleWalletProvisioningResponse.f39460a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, googleWalletProvisioningResponse.f39460a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || googleWalletProvisioningResponse.f39461b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, googleWalletProvisioningResponse.f39461b);
        }
    }

    public final String a() {
        return this.f39461b;
    }

    public final String b() {
        return this.f39460a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleWalletProvisioningResponse)) {
            return false;
        }
        GoogleWalletProvisioningResponse googleWalletProvisioningResponse = (GoogleWalletProvisioningResponse) obj;
        return Intrinsics.d(this.f39460a, googleWalletProvisioningResponse.f39460a) && Intrinsics.d(this.f39461b, googleWalletProvisioningResponse.f39461b);
    }

    public int hashCode() {
        String str = this.f39460a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39461b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "GoogleWalletProvisioningResponse(provisioningLink=" + this.f39460a + ", provisioningJwt=" + this.f39461b + ')';
    }
}
