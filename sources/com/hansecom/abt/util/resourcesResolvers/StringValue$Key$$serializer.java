package com.hansecom.abt.util.resourcesResolvers;

import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.List;
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
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public /* synthetic */ class StringValue$Key$$serializer implements GeneratedSerializer<StringValue.Key> {

    /* renamed from: a  reason: collision with root package name */
    public static final StringValue$Key$$serializer f39088a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f39089b = 8;
    private static final SerialDescriptor descriptor;

    static {
        StringValue$Key$$serializer stringValue$Key$$serializer = new StringValue$Key$$serializer();
        f39088a = stringValue$Key$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.util.resourcesResolvers.StringValue.Key", stringValue$Key$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("key", false);
        pluginGeneratedSerialDescriptor.q("fallbackKey", true);
        pluginGeneratedSerialDescriptor.q("arguments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        KSerializer[] b2 = StringValue.Key.E;
        return new KSerializer[]{StringSerializer.f42197a, BuiltinSerializersKt.u(IntSerializer.f42129a), b2[2]};
    }

    /* renamed from: f */
    public final StringValue.Key c(Decoder decoder) {
        List list;
        Integer num;
        String str;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        KSerializer[] b2 = StringValue.Key.E;
        String str2 = null;
        if (c2.y()) {
            String t2 = c2.t(serialDescriptor, 0);
            list = (List) c2.m(serialDescriptor, 2, b2[2], (Object) null);
            str = t2;
            i2 = 7;
            num = (Integer) c2.v(serialDescriptor, 1, IntSerializer.f42129a, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            Integer num2 = null;
            List list2 = null;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str2 = c2.t(serialDescriptor, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    num2 = (Integer) c2.v(serialDescriptor, 1, IntSerializer.f42129a, num2);
                    i3 |= 2;
                } else if (x2 == 2) {
                    list2 = (List) c2.m(serialDescriptor, 2, b2[2], list2);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            str = str2;
            num = num2;
            list = list2;
        }
        c2.b(serialDescriptor);
        return new StringValue.Key(i2, str, num, list, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, StringValue.Key key) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(key, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        StringValue.Key.f(key, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
