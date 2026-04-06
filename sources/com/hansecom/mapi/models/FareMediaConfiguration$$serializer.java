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
public final class FareMediaConfiguration$$serializer implements GeneratedSerializer<FareMediaConfiguration> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareMediaConfiguration$$serializer f39355a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareMediaConfiguration$$serializer fareMediaConfiguration$$serializer = new FareMediaConfiguration$$serializer();
        f39355a = fareMediaConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareMediaConfiguration", fareMediaConfiguration$$serializer, 1);
        pluginGeneratedSerialDescriptor.q("maxLinkedCards", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{BuiltinSerializersKt.u(IntSerializer.f42129a)};
    }

    /* renamed from: f */
    public FareMediaConfiguration c(Decoder decoder) {
        Integer num;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        int i2 = 1;
        if (c2.y()) {
            num = (Integer) c2.v(a2, 0, IntSerializer.f42129a, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            num = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num);
                    i3 = 1;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
        }
        c2.b(a2);
        return new FareMediaConfiguration(i2, num, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareMediaConfiguration fareMediaConfiguration) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareMediaConfiguration, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareMediaConfiguration.a(fareMediaConfiguration, c2, a2);
        c2.b(a2);
    }
}
