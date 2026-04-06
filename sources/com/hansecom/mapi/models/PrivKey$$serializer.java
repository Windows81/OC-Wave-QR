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
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class PrivKey$$serializer implements GeneratedSerializer<PrivKey> {

    /* renamed from: a  reason: collision with root package name */
    public static final PrivKey$$serializer f39557a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PrivKey$$serializer privKey$$serializer = new PrivKey$$serializer();
        f39557a = privKey$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.PrivKey", privKey$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("version", true);
        pluginGeneratedSerialDescriptor.q("key", true);
        pluginGeneratedSerialDescriptor.q("key_hex", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer u2 = BuiltinSerializersKt.u(IntSerializer.f42129a);
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{u2, BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* renamed from: f */
    public PrivKey c(Decoder decoder) {
        String str;
        String str2;
        Integer num;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        Integer num2 = null;
        if (c2.y()) {
            StringSerializer stringSerializer = StringSerializer.f42197a;
            num = (Integer) c2.v(a2, 0, IntSerializer.f42129a, (Object) null);
            str = (String) c2.v(a2, 2, stringSerializer, (Object) null);
            str2 = (String) c2.v(a2, 1, stringSerializer, (Object) null);
            i2 = 7;
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str3 = null;
            String str4 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num2 = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num2);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str3 = (String) c2.v(a2, 1, StringSerializer.f42197a, str3);
                    i3 |= 2;
                } else if (x2 == 2) {
                    str4 = (String) c2.v(a2, 2, StringSerializer.f42197a, str4);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            num = num2;
            str2 = str3;
            str = str4;
        }
        c2.b(a2);
        return new PrivKey(i2, num, str2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, PrivKey privKey) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(privKey, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        PrivKey.c(privKey, c2, a2);
        c2.b(a2);
    }
}
