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
public final class VirtualCardVerification {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39695a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VirtualCardVerification> serializer() {
            return VirtualCardVerification$$serializer.f39696a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ VirtualCardVerification(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39695a = null;
        } else {
            this.f39695a = str;
        }
    }

    public static final /* synthetic */ void a(VirtualCardVerification virtualCardVerification, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || virtualCardVerification.f39695a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, virtualCardVerification.f39695a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VirtualCardVerification) && Intrinsics.d(this.f39695a, ((VirtualCardVerification) obj).f39695a);
    }

    public int hashCode() {
        String str = this.f39695a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "VirtualCardVerification(nextVerification=" + this.f39695a + ')';
    }
}
