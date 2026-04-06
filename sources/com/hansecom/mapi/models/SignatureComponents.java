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
public final class SignatureComponents {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39585a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f39586b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f39587c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39588d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignatureComponents> serializer() {
            return SignatureComponents$$serializer.f39589a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ SignatureComponents(int i2, String str, Integer num, Integer num2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39585a = null;
        } else {
            this.f39585a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39586b = null;
        } else {
            this.f39586b = num;
        }
        if ((i2 & 4) == 0) {
            this.f39587c = null;
        } else {
            this.f39587c = num2;
        }
        if ((i2 & 8) == 0) {
            this.f39588d = null;
        } else {
            this.f39588d = str2;
        }
    }

    public static final /* synthetic */ void a(SignatureComponents signatureComponents, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || signatureComponents.f39585a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, signatureComponents.f39585a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || signatureComponents.f39586b != null) {
            compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, signatureComponents.f39586b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || signatureComponents.f39587c != null) {
            compositeEncoder.m(serialDescriptor, 2, IntSerializer.f42129a, signatureComponents.f39587c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || signatureComponents.f39588d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, signatureComponents.f39588d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignatureComponents)) {
            return false;
        }
        SignatureComponents signatureComponents = (SignatureComponents) obj;
        return Intrinsics.d(this.f39585a, signatureComponents.f39585a) && Intrinsics.d(this.f39586b, signatureComponents.f39586b) && Intrinsics.d(this.f39587c, signatureComponents.f39587c) && Intrinsics.d(this.f39588d, signatureComponents.f39588d);
    }

    public int hashCode() {
        String str = this.f39585a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f39586b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f39587c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f39588d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "SignatureComponents(privateKey=" + this.f39585a + ", validitySeconds=" + this.f39586b + ", keyVersion=" + this.f39587c + ", staticBarcodePart=" + this.f39588d + ')';
    }
}
