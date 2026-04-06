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
public final class PublicKey {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39568a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39569b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PublicKey> serializer() {
            return PublicKey$$serializer.f39570a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PublicKey(int i2, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39568a = null;
        } else {
            this.f39568a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39569b = null;
        } else {
            this.f39569b = str;
        }
    }

    public static final /* synthetic */ void a(PublicKey publicKey, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || publicKey.f39568a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, publicKey.f39568a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || publicKey.f39569b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, publicKey.f39569b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicKey)) {
            return false;
        }
        PublicKey publicKey = (PublicKey) obj;
        return Intrinsics.d(this.f39568a, publicKey.f39568a) && Intrinsics.d(this.f39569b, publicKey.f39569b);
    }

    public int hashCode() {
        Integer num = this.f39568a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39569b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "PublicKey(version=" + this.f39568a + ", key=" + this.f39569b + ')';
    }
}
