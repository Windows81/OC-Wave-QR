package com.hansecom.abt.api.networkMerchants;

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
public /* synthetic */ class CreateNetworkMerchantTokenResponse$$serializer implements GeneratedSerializer<CreateNetworkMerchantTokenResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final CreateNetworkMerchantTokenResponse$$serializer f33132a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33133b = 8;
    private static final SerialDescriptor descriptor;

    static {
        CreateNetworkMerchantTokenResponse$$serializer createNetworkMerchantTokenResponse$$serializer = new CreateNetworkMerchantTokenResponse$$serializer();
        f33132a = createNetworkMerchantTokenResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.api.networkMerchants.CreateNetworkMerchantTokenResponse", createNetworkMerchantTokenResponse$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("token", false);
        pluginGeneratedSerialDescriptor.q("merchantId", false);
        pluginGeneratedSerialDescriptor.q("merchantName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer};
    }

    /* renamed from: f */
    public final CreateNetworkMerchantTokenResponse c(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        if (c2.y()) {
            String t2 = c2.t(serialDescriptor, 0);
            String t3 = c2.t(serialDescriptor, 1);
            str3 = t2;
            str = c2.t(serialDescriptor, 2);
            str2 = t3;
            i2 = 7;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z2 = true;
            int i3 = 0;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str4 = c2.t(serialDescriptor, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str6 = c2.t(serialDescriptor, 1);
                    i3 |= 2;
                } else if (x2 == 2) {
                    str5 = c2.t(serialDescriptor, 2);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            str3 = str4;
            str = str5;
            str2 = str6;
            i2 = i3;
        }
        c2.b(serialDescriptor);
        return new CreateNetworkMerchantTokenResponse(i2, str3, str2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, CreateNetworkMerchantTokenResponse createNetworkMerchantTokenResponse) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(createNetworkMerchantTokenResponse, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        CreateNetworkMerchantTokenResponse.a(createNetworkMerchantTokenResponse, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
