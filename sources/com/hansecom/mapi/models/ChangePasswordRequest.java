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
public final class ChangePasswordRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39249a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39250b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChangePasswordRequest> serializer() {
            return ChangePasswordRequest$$serializer.f39251a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ChangePasswordRequest(int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39249a = null;
        } else {
            this.f39249a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39250b = null;
        } else {
            this.f39250b = str2;
        }
    }

    public static final /* synthetic */ void a(ChangePasswordRequest changePasswordRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || changePasswordRequest.f39249a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, changePasswordRequest.f39249a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || changePasswordRequest.f39250b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, changePasswordRequest.f39250b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePasswordRequest)) {
            return false;
        }
        ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) obj;
        return Intrinsics.d(this.f39249a, changePasswordRequest.f39249a) && Intrinsics.d(this.f39250b, changePasswordRequest.f39250b);
    }

    public int hashCode() {
        String str = this.f39249a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39250b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "ChangePasswordRequest(oldPassword=" + this.f39249a + ", newPassword=" + this.f39250b + ')';
    }

    public ChangePasswordRequest(String str, String str2) {
        this.f39249a = str;
        this.f39250b = str2;
    }
}
