package com.hansecom.mapi.models;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
public final class LoadMoneyConfig$$serializer implements GeneratedSerializer<LoadMoneyConfig> {

    /* renamed from: a  reason: collision with root package name */
    public static final LoadMoneyConfig$$serializer f39499a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LoadMoneyConfig$$serializer loadMoneyConfig$$serializer = new LoadMoneyConfig$$serializer();
        f39499a = loadMoneyConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.LoadMoneyConfig", loadMoneyConfig$$serializer, 5);
        pluginGeneratedSerialDescriptor.q("minAmountToAdd", true);
        pluginGeneratedSerialDescriptor.q("minAutoloadAmount", true);
        pluginGeneratedSerialDescriptor.q("defaultAutoloadAmount", true);
        pluginGeneratedSerialDescriptor.q("maxAmountToAdd", true);
        pluginGeneratedSerialDescriptor.q("maxBalance", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        IntSerializer intSerializer = IntSerializer.f42129a;
        return new KSerializer[]{BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer)};
    }

    /* renamed from: f */
    public LoadMoneyConfig c(Decoder decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        Integer num6 = null;
        if (c2.y()) {
            IntSerializer intSerializer = IntSerializer.f42129a;
            num = (Integer) c2.v(a2, 4, intSerializer, (Object) null);
            num2 = (Integer) c2.v(a2, 3, intSerializer, (Object) null);
            i2 = 31;
            num3 = (Integer) c2.v(a2, 2, intSerializer, (Object) null);
            num4 = (Integer) c2.v(a2, 1, intSerializer, (Object) null);
            num5 = (Integer) c2.v(a2, 0, intSerializer, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            Integer num7 = null;
            Integer num8 = null;
            Integer num9 = null;
            Integer num10 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num6 = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num6);
                    i3 |= 1;
                } else if (x2 == 1) {
                    num7 = (Integer) c2.v(a2, 1, IntSerializer.f42129a, num7);
                    i3 |= 2;
                } else if (x2 == 2) {
                    num8 = (Integer) c2.v(a2, 2, IntSerializer.f42129a, num8);
                    i3 |= 4;
                } else if (x2 == 3) {
                    num9 = (Integer) c2.v(a2, 3, IntSerializer.f42129a, num9);
                    i3 |= 8;
                } else if (x2 == 4) {
                    num10 = (Integer) c2.v(a2, 4, IntSerializer.f42129a, num10);
                    i3 |= 16;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            num5 = num6;
            num4 = num7;
            num3 = num8;
            num2 = num9;
            num = num10;
        }
        c2.b(a2);
        return new LoadMoneyConfig(i2, num5, num4, num3, num2, num, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, LoadMoneyConfig loadMoneyConfig) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(loadMoneyConfig, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        LoadMoneyConfig.a(loadMoneyConfig, c2, a2);
        c2.b(a2);
    }
}
