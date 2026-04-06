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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class NicknameUpdateModel$$serializer implements GeneratedSerializer<NicknameUpdateModel> {

    /* renamed from: a  reason: collision with root package name */
    public static final NicknameUpdateModel$$serializer f39501a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NicknameUpdateModel$$serializer nicknameUpdateModel$$serializer = new NicknameUpdateModel$$serializer();
        f39501a = nicknameUpdateModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.NicknameUpdateModel", nicknameUpdateModel$$serializer, 1);
        pluginGeneratedSerialDescriptor.q("nickname", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{BuiltinSerializersKt.u(StringSerializer.f42197a)};
    }

    /* renamed from: f */
    public NicknameUpdateModel c(Decoder decoder) {
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        int i2 = 1;
        if (c2.y()) {
            str = (String) c2.v(a2, 0, StringSerializer.f42197a, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            str = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str = (String) c2.v(a2, 0, StringSerializer.f42197a, str);
                    i3 = 1;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
        }
        c2.b(a2);
        return new NicknameUpdateModel(i2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, NicknameUpdateModel nicknameUpdateModel) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(nicknameUpdateModel, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        NicknameUpdateModel.a(nicknameUpdateModel, c2, a2);
        c2.b(a2);
    }
}
