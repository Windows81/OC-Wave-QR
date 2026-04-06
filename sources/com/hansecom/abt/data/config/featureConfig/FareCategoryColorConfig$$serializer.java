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
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public /* synthetic */ class FareCategoryColorConfig$$serializer implements GeneratedSerializer<FareCategoryColorConfig> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareCategoryColorConfig$$serializer f33186a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33187b = 8;
    private static final SerialDescriptor descriptor;

    static {
        FareCategoryColorConfig$$serializer fareCategoryColorConfig$$serializer = new FareCategoryColorConfig$$serializer();
        f33186a = fareCategoryColorConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.data.config.featureConfig.FareCategoryColorConfig", fareCategoryColorConfig$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("name", false);
        pluginGeneratedSerialDescriptor.q("fareCategoryId", false);
        pluginGeneratedSerialDescriptor.q("color", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{stringSerializer, IntSerializer.f42129a, stringSerializer};
    }

    /* renamed from: f */
    public final FareCategoryColorConfig c(Decoder decoder) {
        String str;
        int i2;
        String str2;
        int i3;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        if (c2.y()) {
            String t2 = c2.t(serialDescriptor, 0);
            int k2 = c2.k(serialDescriptor, 1);
            str2 = t2;
            str = c2.t(serialDescriptor, 2);
            i2 = k2;
            i3 = 7;
        } else {
            String str3 = null;
            String str4 = null;
            boolean z2 = true;
            int i4 = 0;
            int i5 = 0;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str3 = c2.t(serialDescriptor, 0);
                    i5 |= 1;
                } else if (x2 == 1) {
                    i4 = c2.k(serialDescriptor, 1);
                    i5 |= 2;
                } else if (x2 == 2) {
                    str4 = c2.t(serialDescriptor, 2);
                    i5 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            str2 = str3;
            str = str4;
            i2 = i4;
            i3 = i5;
        }
        c2.b(serialDescriptor);
        return new FareCategoryColorConfig(i3, str2, i2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, FareCategoryColorConfig fareCategoryColorConfig) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareCategoryColorConfig, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        FareCategoryColorConfig.c(fareCategoryColorConfig, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
