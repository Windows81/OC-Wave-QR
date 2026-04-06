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
public final class ResetPasswordRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39571a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ResetPasswordRequest> serializer() {
            return ResetPasswordRequest$$serializer.f39572a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ResetPasswordRequest(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39571a = null;
        } else {
            this.f39571a = str;
        }
    }

    public static final /* synthetic */ void a(ResetPasswordRequest resetPasswordRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || resetPasswordRequest.f39571a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, resetPasswordRequest.f39571a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResetPasswordRequest) && Intrinsics.d(this.f39571a, ((ResetPasswordRequest) obj).f39571a);
    }

    public int hashCode() {
        String str = this.f39571a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ResetPasswordRequest(email=" + this.f39571a + ')';
    }

    public ResetPasswordRequest(String str) {
        this.f39571a = str;
    }
}
