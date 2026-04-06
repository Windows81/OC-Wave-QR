package com.hansecom.abt.data.config.featureConfig;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class RemoteFeatureConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f33188a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<RemoteFeatureConfig> serializer() {
            return RemoteFeatureConfig$$serializer.f33189a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RemoteFeatureConfig(int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, RemoteFeatureConfig$$serializer.f33189a.a());
        }
        this.f33188a = i3;
    }

    public final int a() {
        return this.f33188a;
    }

    public RemoteFeatureConfig(int i2) {
        this.f33188a = i2;
    }
}
