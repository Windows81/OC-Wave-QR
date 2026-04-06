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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class FareMediaCredentialsWithValidityExtention$$serializer implements GeneratedSerializer<FareMediaCredentialsWithValidityExtention> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareMediaCredentialsWithValidityExtention$$serializer f39364a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareMediaCredentialsWithValidityExtention$$serializer fareMediaCredentialsWithValidityExtention$$serializer = new FareMediaCredentialsWithValidityExtention$$serializer();
        f39364a = fareMediaCredentialsWithValidityExtention$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareMediaCredentialsWithValidityExtention", fareMediaCredentialsWithValidityExtention$$serializer, 4);
        pluginGeneratedSerialDescriptor.q("cardId", true);
        pluginGeneratedSerialDescriptor.q("nickname", true);
        pluginGeneratedSerialDescriptor.q("securityCode", true);
        pluginGeneratedSerialDescriptor.q("extendedValidity", true);
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
        return new KSerializer[]{BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(BooleanSerializer.f42073a)};
    }

    /* renamed from: f */
    public FareMediaCredentialsWithValidityExtention c(Decoder decoder) {
        Boolean bool;
        String str;
        String str2;
        String str3;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        String str4 = null;
        if (c2.y()) {
            StringSerializer stringSerializer = StringSerializer.f42197a;
            str = (String) c2.v(a2, 2, stringSerializer, (Object) null);
            bool = (Boolean) c2.v(a2, 3, BooleanSerializer.f42073a, (Object) null);
            i2 = 15;
            str2 = (String) c2.v(a2, 1, stringSerializer, (Object) null);
            str3 = (String) c2.v(a2, 0, stringSerializer, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str5 = null;
            String str6 = null;
            Boolean bool2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str4 = (String) c2.v(a2, 0, StringSerializer.f42197a, str4);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str5 = (String) c2.v(a2, 1, StringSerializer.f42197a, str5);
                    i3 |= 2;
                } else if (x2 == 2) {
                    str6 = (String) c2.v(a2, 2, StringSerializer.f42197a, str6);
                    i3 |= 4;
                } else if (x2 == 3) {
                    bool2 = (Boolean) c2.v(a2, 3, BooleanSerializer.f42073a, bool2);
                    i3 |= 8;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            str3 = str4;
            str2 = str5;
            str = str6;
            bool = bool2;
        }
        c2.b(a2);
        return new FareMediaCredentialsWithValidityExtention(i2, str3, str2, str, bool, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareMediaCredentialsWithValidityExtention fareMediaCredentialsWithValidityExtention) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareMediaCredentialsWithValidityExtention, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareMediaCredentialsWithValidityExtention.a(fareMediaCredentialsWithValidityExtention, c2, a2);
        c2.b(a2);
    }
}
