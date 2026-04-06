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
public final class SecurityQuestionAllResponse$$serializer implements GeneratedSerializer<SecurityQuestionAllResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final SecurityQuestionAllResponse$$serializer f39575a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SecurityQuestionAllResponse$$serializer securityQuestionAllResponse$$serializer = new SecurityQuestionAllResponse$$serializer();
        f39575a = securityQuestionAllResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.SecurityQuestionAllResponse", securityQuestionAllResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("id", true);
        pluginGeneratedSerialDescriptor.q("value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{BuiltinSerializersKt.u(IntSerializer.f42129a), BuiltinSerializersKt.u(StringSerializer.f42197a)};
    }

    /* renamed from: f */
    public SecurityQuestionAllResponse c(Decoder decoder) {
        int i2;
        String str;
        Integer num;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        if (c2.y()) {
            num = (Integer) c2.v(a2, 0, IntSerializer.f42129a, (Object) null);
            str = (String) c2.v(a2, 1, StringSerializer.f42197a, (Object) null);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            num = null;
            String str2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str2 = (String) c2.v(a2, 1, StringSerializer.f42197a, str2);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            str = str2;
            i2 = i3;
        }
        c2.b(a2);
        return new SecurityQuestionAllResponse(i2, num, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, SecurityQuestionAllResponse securityQuestionAllResponse) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(securityQuestionAllResponse, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        SecurityQuestionAllResponse.c(securityQuestionAllResponse, c2, a2);
        c2.b(a2);
    }
}
