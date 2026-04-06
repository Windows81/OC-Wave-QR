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
public final class GoogleWalletProvisioningResponse$$serializer implements GeneratedSerializer<GoogleWalletProvisioningResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final GoogleWalletProvisioningResponse$$serializer f39462a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GoogleWalletProvisioningResponse$$serializer googleWalletProvisioningResponse$$serializer = new GoogleWalletProvisioningResponse$$serializer();
        f39462a = googleWalletProvisioningResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.GoogleWalletProvisioningResponse", googleWalletProvisioningResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("provisioningLink", true);
        pluginGeneratedSerialDescriptor.q("provisioningJwt", true);
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
        return new KSerializer[]{BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* renamed from: f */
    public GoogleWalletProvisioningResponse c(Decoder decoder) {
        String str;
        int i2;
        String str2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        if (c2.y()) {
            StringSerializer stringSerializer = StringSerializer.f42197a;
            str = (String) c2.v(a2, 0, stringSerializer, (Object) null);
            str2 = (String) c2.v(a2, 1, stringSerializer, (Object) null);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            str2 = null;
            String str3 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str3 = (String) c2.v(a2, 0, StringSerializer.f42197a, str3);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str2 = (String) c2.v(a2, 1, StringSerializer.f42197a, str2);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            str = str3;
        }
        c2.b(a2);
        return new GoogleWalletProvisioningResponse(i2, str, str2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, GoogleWalletProvisioningResponse googleWalletProvisioningResponse) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(googleWalletProvisioningResponse, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        GoogleWalletProvisioningResponse.c(googleWalletProvisioningResponse, c2, a2);
        c2.b(a2);
    }
}
