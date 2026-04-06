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
public final class AdminActivateAccountRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39181a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39182b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdminActivateAccountRequest> serializer() {
            return AdminActivateAccountRequest$$serializer.f39183a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AdminActivateAccountRequest(int i2, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39181a = null;
        } else {
            this.f39181a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39182b = null;
        } else {
            this.f39182b = str;
        }
    }

    public static final /* synthetic */ void a(AdminActivateAccountRequest adminActivateAccountRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || adminActivateAccountRequest.f39181a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, adminActivateAccountRequest.f39181a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || adminActivateAccountRequest.f39182b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, adminActivateAccountRequest.f39182b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdminActivateAccountRequest)) {
            return false;
        }
        AdminActivateAccountRequest adminActivateAccountRequest = (AdminActivateAccountRequest) obj;
        return Intrinsics.d(this.f39181a, adminActivateAccountRequest.f39181a) && Intrinsics.d(this.f39182b, adminActivateAccountRequest.f39182b);
    }

    public int hashCode() {
        Integer num = this.f39181a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39182b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "AdminActivateAccountRequest(accountId=" + this.f39181a + ", email=" + this.f39182b + ')';
    }
}
