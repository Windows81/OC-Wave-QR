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
public final class SendActivationEmailRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39583a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SendActivationEmailRequest> serializer() {
            return SendActivationEmailRequest$$serializer.f39584a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ SendActivationEmailRequest(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39583a = null;
        } else {
            this.f39583a = str;
        }
    }

    public static final /* synthetic */ void a(SendActivationEmailRequest sendActivationEmailRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || sendActivationEmailRequest.f39583a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, sendActivationEmailRequest.f39583a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SendActivationEmailRequest) && Intrinsics.d(this.f39583a, ((SendActivationEmailRequest) obj).f39583a);
    }

    public int hashCode() {
        String str = this.f39583a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "SendActivationEmailRequest(email=" + this.f39583a + ')';
    }

    public SendActivationEmailRequest(String str) {
        this.f39583a = str;
    }
}
