package com.hansecom.abt.data.config.featureConfig;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Deprecated
public /* synthetic */ class RemoteFeatureConfig$$serializer implements GeneratedSerializer<RemoteFeatureConfig> {

    /* renamed from: a  reason: collision with root package name */
    public static final RemoteFeatureConfig$$serializer f33189a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33190b = 8;
    private static final SerialDescriptor descriptor;

    static {
        RemoteFeatureConfig$$serializer remoteFeatureConfig$$serializer = new RemoteFeatureConfig$$serializer();
        f33189a = remoteFeatureConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.data.config.featureConfig.RemoteFeatureConfig", remoteFeatureConfig$$serializer, 1);
        pluginGeneratedSerialDescriptor.q("transferTimeThresholdMin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        return new KSerializer[]{IntSerializer.f42129a};
    }

    /* renamed from: f */
    public final RemoteFeatureConfig c(Decoder decoder) {
        int i2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder.c(serialDescriptor);
        int i3 = 1;
        if (c2.y()) {
            i2 = c2.k(serialDescriptor, 0);
        } else {
            boolean z2 = true;
            i2 = 0;
            int i4 = 0;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    i2 = c2.k(serialDescriptor, 0);
                    i4 = 1;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i3 = i4;
        }
        c2.b(serialDescriptor);
        return new RemoteFeatureConfig(i3, i2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, RemoteFeatureConfig remoteFeatureConfig) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(remoteFeatureConfig, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        c2.r(serialDescriptor, 0, remoteFeatureConfig.f33188a);
        c2.b(serialDescriptor);
    }
}
