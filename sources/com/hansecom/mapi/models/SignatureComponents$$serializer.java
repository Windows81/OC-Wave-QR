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
public final class SignatureComponents$$serializer implements GeneratedSerializer<SignatureComponents> {

    /* renamed from: a  reason: collision with root package name */
    public static final SignatureComponents$$serializer f39589a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SignatureComponents$$serializer signatureComponents$$serializer = new SignatureComponents$$serializer();
        f39589a = signatureComponents$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.SignatureComponents", signatureComponents$$serializer, 4);
        pluginGeneratedSerialDescriptor.q("privateKey", true);
        pluginGeneratedSerialDescriptor.q("validitySeconds", true);
        pluginGeneratedSerialDescriptor.q("keyVersion", true);
        pluginGeneratedSerialDescriptor.q("staticBarcodePart", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        StringSerializer stringSerializer = StringSerializer.f42197a;
        KSerializer u2 = BuiltinSerializersKt.u(stringSerializer);
        IntSerializer intSerializer = IntSerializer.f42129a;
        return new KSerializer[]{u2, BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* renamed from: f */
    public SignatureComponents c(Decoder decoder) {
        String str;
        Integer num;
        Integer num2;
        String str2;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        String str3 = null;
        if (c2.y()) {
            StringSerializer stringSerializer = StringSerializer.f42197a;
            IntSerializer intSerializer = IntSerializer.f42129a;
            str = (String) c2.v(a2, 3, stringSerializer, (Object) null);
            i2 = 15;
            num = (Integer) c2.v(a2, 2, intSerializer, (Object) null);
            num2 = (Integer) c2.v(a2, 1, intSerializer, (Object) null);
            str2 = (String) c2.v(a2, 0, stringSerializer, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            Integer num3 = null;
            Integer num4 = null;
            String str4 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str3 = (String) c2.v(a2, 0, StringSerializer.f42197a, str3);
                    i3 |= 1;
                } else if (x2 == 1) {
                    num3 = (Integer) c2.v(a2, 1, IntSerializer.f42129a, num3);
                    i3 |= 2;
                } else if (x2 == 2) {
                    num4 = (Integer) c2.v(a2, 2, IntSerializer.f42129a, num4);
                    i3 |= 4;
                } else if (x2 == 3) {
                    str4 = (String) c2.v(a2, 3, StringSerializer.f42197a, str4);
                    i3 |= 8;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            str2 = str3;
            num2 = num3;
            num = num4;
            str = str4;
        }
        c2.b(a2);
        return new SignatureComponents(i2, str2, num2, num, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, SignatureComponents signatureComponents) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(signatureComponents, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        SignatureComponents.a(signatureComponents, c2, a2);
        c2.b(a2);
    }
}
