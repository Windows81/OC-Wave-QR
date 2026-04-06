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
public final class FareMediaCredentials$$serializer implements GeneratedSerializer<FareMediaCredentials> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareMediaCredentials$$serializer f39359a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareMediaCredentials$$serializer fareMediaCredentials$$serializer = new FareMediaCredentials$$serializer();
        f39359a = fareMediaCredentials$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareMediaCredentials", fareMediaCredentials$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("cardId", false);
        pluginGeneratedSerialDescriptor.q("securityCode", false);
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
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.u(stringSerializer)};
    }

    /* renamed from: f */
    public FareMediaCredentials c(Decoder decoder) {
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
            String t2 = c2.t(a2, 0);
            String t3 = c2.t(a2, 1);
            str3 = t2;
            str = (String) c2.v(a2, 2, StringSerializer.f42197a, (Object) null);
            str2 = t3;
            i2 = 7;
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str5 = null;
            String str6 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str4 = c2.t(a2, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str5 = c2.t(a2, 1);
                    i3 |= 2;
                } else if (x2 == 2) {
                    str6 = (String) c2.v(a2, 2, StringSerializer.f42197a, str6);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            str3 = str4;
            str2 = str5;
            str = str6;
        }
        c2.b(a2);
        return new FareMediaCredentials(i2, str3, str2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareMediaCredentials fareMediaCredentials) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareMediaCredentials, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareMediaCredentials.a(fareMediaCredentials, c2, a2);
        c2.b(a2);
    }
}
