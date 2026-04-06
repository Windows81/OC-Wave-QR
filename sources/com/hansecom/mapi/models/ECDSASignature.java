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
public final class ECDSASignature {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39300a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ECDSASignature> serializer() {
            return ECDSASignature$$serializer.f39301a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ECDSASignature(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39300a = null;
        } else {
            this.f39300a = str;
        }
    }

    public static final /* synthetic */ void a(ECDSASignature eCDSASignature, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || eCDSASignature.f39300a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, eCDSASignature.f39300a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ECDSASignature) && Intrinsics.d(this.f39300a, ((ECDSASignature) obj).f39300a);
    }

    public int hashCode() {
        String str = this.f39300a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ECDSASignature(signedBarcode=" + this.f39300a + ')';
    }
}
