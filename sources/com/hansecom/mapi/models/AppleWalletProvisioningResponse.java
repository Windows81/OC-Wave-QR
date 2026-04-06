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
public final class AppleWalletProvisioningResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39215a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39216b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppleWalletProvisioningResponse> serializer() {
            return AppleWalletProvisioningResponse$$serializer.f39217a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AppleWalletProvisioningResponse(int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, AppleWalletProvisioningResponse$$serializer.f39217a.a());
        }
        this.f39215a = str;
        this.f39216b = str2;
    }

    public static final /* synthetic */ void a(AppleWalletProvisioningResponse appleWalletProvisioningResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, appleWalletProvisioningResponse.f39215a);
        compositeEncoder.t(serialDescriptor, 1, appleWalletProvisioningResponse.f39216b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppleWalletProvisioningResponse)) {
            return false;
        }
        AppleWalletProvisioningResponse appleWalletProvisioningResponse = (AppleWalletProvisioningResponse) obj;
        return Intrinsics.d(this.f39215a, appleWalletProvisioningResponse.f39215a) && Intrinsics.d(this.f39216b, appleWalletProvisioningResponse.f39216b);
    }

    public int hashCode() {
        return (this.f39215a.hashCode() * 31) + this.f39216b.hashCode();
    }

    public String toString() {
        return "AppleWalletProvisioningResponse(ciphertext=" + this.f39215a + ", ephemeralPublicKey=" + this.f39216b + ')';
    }
}
