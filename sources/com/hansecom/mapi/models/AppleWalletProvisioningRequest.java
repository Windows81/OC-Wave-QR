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
public final class AppleWalletProvisioningRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39211a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39212b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39213c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppleWalletProvisioningRequest> serializer() {
            return AppleWalletProvisioningRequest$$serializer.f39214a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AppleWalletProvisioningRequest(int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i2 & 7)) {
            PluginExceptionsKt.a(i2, 7, AppleWalletProvisioningRequest$$serializer.f39214a.a());
        }
        this.f39211a = str;
        this.f39212b = str2;
        this.f39213c = str3;
    }

    public static final /* synthetic */ void a(AppleWalletProvisioningRequest appleWalletProvisioningRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, appleWalletProvisioningRequest.f39211a);
        compositeEncoder.t(serialDescriptor, 1, appleWalletProvisioningRequest.f39212b);
        compositeEncoder.t(serialDescriptor, 2, appleWalletProvisioningRequest.f39213c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppleWalletProvisioningRequest)) {
            return false;
        }
        AppleWalletProvisioningRequest appleWalletProvisioningRequest = (AppleWalletProvisioningRequest) obj;
        return Intrinsics.d(this.f39211a, appleWalletProvisioningRequest.f39211a) && Intrinsics.d(this.f39212b, appleWalletProvisioningRequest.f39212b) && Intrinsics.d(this.f39213c, appleWalletProvisioningRequest.f39213c);
    }

    public int hashCode() {
        return (((this.f39211a.hashCode() * 31) + this.f39212b.hashCode()) * 31) + this.f39213c.hashCode();
    }

    public String toString() {
        return "AppleWalletProvisioningRequest(certificate=" + this.f39211a + ", nonce=" + this.f39212b + ", nonceSignature=" + this.f39213c + ')';
    }
}
