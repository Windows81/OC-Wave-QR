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
public final class TransferTimeResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39607a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransferTimeResponse> serializer() {
            return TransferTimeResponse$$serializer.f39608a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TransferTimeResponse(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39607a = null;
        } else {
            this.f39607a = str;
        }
    }

    public static final /* synthetic */ void b(TransferTimeResponse transferTimeResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || transferTimeResponse.f39607a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, transferTimeResponse.f39607a);
        }
    }

    public final String a() {
        return this.f39607a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransferTimeResponse) && Intrinsics.d(this.f39607a, ((TransferTimeResponse) obj).f39607a);
    }

    public int hashCode() {
        String str = this.f39607a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "TransferTimeResponse(transferUntil=" + this.f39607a + ')';
    }
}
