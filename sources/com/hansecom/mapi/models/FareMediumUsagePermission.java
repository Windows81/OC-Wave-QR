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
public final class FareMediumUsagePermission {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39425a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f39426b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareMediumUsagePermission> serializer() {
            return FareMediumUsagePermission$$serializer.f39427a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FareMediumUsagePermission(int i2, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39425a = null;
        } else {
            this.f39425a = str;
        }
        if ((i2 & 2) == 0) {
            this.f39426b = null;
        } else {
            this.f39426b = num;
        }
    }

    public static final /* synthetic */ void b(FareMediumUsagePermission fareMediumUsagePermission, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || fareMediumUsagePermission.f39425a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, fareMediumUsagePermission.f39425a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareMediumUsagePermission.f39426b != null) {
            compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, fareMediumUsagePermission.f39426b);
        }
    }

    public final String a() {
        return this.f39425a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMediumUsagePermission)) {
            return false;
        }
        FareMediumUsagePermission fareMediumUsagePermission = (FareMediumUsagePermission) obj;
        return Intrinsics.d(this.f39425a, fareMediumUsagePermission.f39425a) && Intrinsics.d(this.f39426b, fareMediumUsagePermission.f39426b);
    }

    public int hashCode() {
        String str = this.f39425a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f39426b;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "FareMediumUsagePermission(usagePermission=" + this.f39425a + ", expiresIn=" + this.f39426b + ')';
    }
}
