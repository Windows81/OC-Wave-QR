package com.hansecom.mapi.models;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
public final class AppleWalletProvisioningResponse$$serializer implements GeneratedSerializer<AppleWalletProvisioningResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final AppleWalletProvisioningResponse$$serializer f39217a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AppleWalletProvisioningResponse$$serializer appleWalletProvisioningResponse$$serializer = new AppleWalletProvisioningResponse$$serializer();
        f39217a = appleWalletProvisioningResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.AppleWalletProvisioningResponse", appleWalletProvisioningResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("ciphertext", false);
        pluginGeneratedSerialDescriptor.q("ephemeralPublicKey", false);
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
        return new KSerializer[]{stringSerializer, stringSerializer};
    }

    /* renamed from: f */
    public AppleWalletProvisioningResponse c(Decoder decoder) {
        int i2;
        String str;
        String str2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        if (c2.y()) {
            str2 = c2.t(a2, 0);
            str = c2.t(a2, 1);
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
                    str2 = c2.t(a2, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str3 = c2.t(a2, 1);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            str = str3;
            i2 = i3;
        }
        c2.b(a2);
        return new AppleWalletProvisioningResponse(i2, str2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, AppleWalletProvisioningResponse appleWalletProvisioningResponse) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(appleWalletProvisioningResponse, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        AppleWalletProvisioningResponse.a(appleWalletProvisioningResponse, c2, a2);
        c2.b(a2);
    }
}
