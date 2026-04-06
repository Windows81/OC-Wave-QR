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
public final class PrivKey {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer keyVersion;

    /* renamed from: b  reason: collision with root package name */
    public final String privateKey;

    /* renamed from: c  reason: collision with root package name */
    public final String privateKeyHex;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PrivKey> serializer() {
            return PrivKey$$serializer.f39557a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PrivKey(int i2, Integer num, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.keyVersion = null;
        } else {
            this.keyVersion = num;
        }
        if ((i2 & 2) == 0) {
            this.privateKey = null;
        } else {
            this.privateKey = str;
        }
        if ((i2 & 4) == 0) {
            this.privateKeyHex = null;
        } else {
            this.privateKeyHex = str2;
        }
    }

    public static final /* synthetic */ void c(PrivKey privKey, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || privKey.keyVersion != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, privKey.keyVersion);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || privKey.privateKey != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, privKey.privateKey);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || privKey.privateKeyHex != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, privKey.privateKeyHex);
        }
    }

    public final String a() {
        return this.privateKey;
    }

    public final Integer b() {
        return this.keyVersion;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivKey)) {
            return false;
        }
        PrivKey privKey = (PrivKey) obj;
        return Intrinsics.d(this.keyVersion, privKey.keyVersion) && Intrinsics.d(this.privateKey, privKey.privateKey) && Intrinsics.d(this.privateKeyHex, privKey.privateKeyHex);
    }

    public int hashCode() {
        Integer num = this.keyVersion;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.privateKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.privateKeyHex;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "PrivKey(version=" + this.keyVersion + ", key=" + this.privateKey + ", keyHex=" + this.privateKeyHex + ')';
    }
}
