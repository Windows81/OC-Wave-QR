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
public final class AdminResetTransferLimitRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39208a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39209b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdminResetTransferLimitRequest> serializer() {
            return AdminResetTransferLimitRequest$$serializer.f39210a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AdminResetTransferLimitRequest(int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39208a = null;
        } else {
            this.f39208a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39209b = null;
        } else {
            this.f39209b = str2;
        }
    }

    public static final /* synthetic */ void a(AdminResetTransferLimitRequest adminResetTransferLimitRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || adminResetTransferLimitRequest.f39208a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, adminResetTransferLimitRequest.f39208a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || adminResetTransferLimitRequest.f39209b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, adminResetTransferLimitRequest.f39209b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdminResetTransferLimitRequest)) {
            return false;
        }
        AdminResetTransferLimitRequest adminResetTransferLimitRequest = (AdminResetTransferLimitRequest) obj;
        return Intrinsics.d(this.f39208a, adminResetTransferLimitRequest.f39208a) && Intrinsics.d(this.f39209b, adminResetTransferLimitRequest.f39209b);
    }

    public int hashCode() {
        String str = this.f39208a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39209b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "AdminResetTransferLimitRequest(cardId=" + this.f39208a + ", email=" + this.f39209b + ')';
    }
}
