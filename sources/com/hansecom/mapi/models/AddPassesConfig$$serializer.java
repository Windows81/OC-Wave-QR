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
public final class AddPassesConfig$$serializer implements GeneratedSerializer<AddPassesConfig> {

    /* renamed from: a  reason: collision with root package name */
    public static final AddPassesConfig$$serializer f39167a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AddPassesConfig$$serializer addPassesConfig$$serializer = new AddPassesConfig$$serializer();
        f39167a = addPassesConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.AddPassesConfig", addPassesConfig$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("maxTotalNumberOfPasses", true);
        pluginGeneratedSerialDescriptor.q("maxPassesPerPurchase", true);
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
        return new KSerializer[]{BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer)};
    }

    /* renamed from: f */
    public AddPassesConfig c(Decoder decoder) {
        Integer num;
        int i2;
        Integer num2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        if (c2.y()) {
            IntSerializer intSerializer = IntSerializer.f42129a;
            num = (Integer) c2.v(a2, 0, intSerializer, (Object) null);
            num2 = (Integer) c2.v(a2, 1, intSerializer, (Object) null);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            num2 = null;
            Integer num3 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num3 = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num3);
                    i3 |= 1;
                } else if (x2 == 1) {
                    num2 = (Integer) c2.v(a2, 1, IntSerializer.f42129a, num2);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            num = num3;
        }
        c2.b(a2);
        return new AddPassesConfig(i2, num, num2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, AddPassesConfig addPassesConfig) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(addPassesConfig, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        AddPassesConfig.a(addPassesConfig, c2, a2);
        c2.b(a2);
    }
}
