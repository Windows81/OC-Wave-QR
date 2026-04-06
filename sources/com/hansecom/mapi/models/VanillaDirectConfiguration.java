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
public final class VanillaDirectConfiguration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39691a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39692b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39693c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VanillaDirectConfiguration> serializer() {
            return VanillaDirectConfiguration$$serializer.f39694a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ VanillaDirectConfiguration(int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39691a = null;
        } else {
            this.f39691a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39692b = null;
        } else {
            this.f39692b = str2;
        }
        if ((i2 & 4) == 0) {
            this.f39693c = null;
        } else {
            this.f39693c = str3;
        }
    }

    public static final /* synthetic */ void d(VanillaDirectConfiguration vanillaDirectConfiguration, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || vanillaDirectConfiguration.f39691a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, vanillaDirectConfiguration.f39691a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || vanillaDirectConfiguration.f39692b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, vanillaDirectConfiguration.f39692b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || vanillaDirectConfiguration.f39693c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, vanillaDirectConfiguration.f39693c);
        }
    }

    public final String a() {
        return this.f39691a;
    }

    public final String b() {
        return this.f39692b;
    }

    public final String c() {
        return this.f39693c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VanillaDirectConfiguration)) {
            return false;
        }
        VanillaDirectConfiguration vanillaDirectConfiguration = (VanillaDirectConfiguration) obj;
        return Intrinsics.d(this.f39691a, vanillaDirectConfiguration.f39691a) && Intrinsics.d(this.f39692b, vanillaDirectConfiguration.f39692b) && Intrinsics.d(this.f39693c, vanillaDirectConfiguration.f39693c);
    }

    public int hashCode() {
        String str = this.f39691a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39692b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39693c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "VanillaDirectConfiguration(billerId=" + this.f39691a + ", defaultLat=" + this.f39692b + ", defaultLng=" + this.f39693c + ')';
    }
}
