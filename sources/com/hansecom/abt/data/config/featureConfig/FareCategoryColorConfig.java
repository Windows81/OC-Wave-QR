package com.hansecom.abt.data.config.featureConfig;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class FareCategoryColorConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f33183a;

    /* renamed from: b  reason: collision with root package name */
    public final int f33184b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33185c;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FareCategoryColorConfig> serializer() {
            return FareCategoryColorConfig$$serializer.f33186a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FareCategoryColorConfig(int i2, String str, int i3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i2 & 7)) {
            PluginExceptionsKt.a(i2, 7, FareCategoryColorConfig$$serializer.f33186a.a());
        }
        this.f33183a = str;
        this.f33184b = i3;
        this.f33185c = str2;
    }

    public static final /* synthetic */ void c(FareCategoryColorConfig fareCategoryColorConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, fareCategoryColorConfig.f33183a);
        compositeEncoder.r(serialDescriptor, 1, fareCategoryColorConfig.f33184b);
        compositeEncoder.t(serialDescriptor, 2, fareCategoryColorConfig.f33185c);
    }

    public final String a() {
        return this.f33185c;
    }

    public final int b() {
        return this.f33184b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareCategoryColorConfig)) {
            return false;
        }
        FareCategoryColorConfig fareCategoryColorConfig = (FareCategoryColorConfig) obj;
        return Intrinsics.d(this.f33183a, fareCategoryColorConfig.f33183a) && this.f33184b == fareCategoryColorConfig.f33184b && Intrinsics.d(this.f33185c, fareCategoryColorConfig.f33185c);
    }

    public int hashCode() {
        return (((this.f33183a.hashCode() * 31) + Integer.hashCode(this.f33184b)) * 31) + this.f33185c.hashCode();
    }

    public String toString() {
        String str = this.f33183a;
        int i2 = this.f33184b;
        String str2 = this.f33185c;
        return "FareCategoryColorConfig(name=" + str + ", fareCategoryId=" + i2 + ", color=" + str2 + ")";
    }
}
