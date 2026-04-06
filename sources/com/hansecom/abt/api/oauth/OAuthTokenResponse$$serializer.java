package com.hansecom.abt.api.oauth;

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
public /* synthetic */ class OAuthTokenResponse$$serializer implements GeneratedSerializer<OAuthTokenResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final OAuthTokenResponse$$serializer f33166a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33167b = 8;
    private static final SerialDescriptor descriptor;

    static {
        OAuthTokenResponse$$serializer oAuthTokenResponse$$serializer = new OAuthTokenResponse$$serializer();
        f33166a = oAuthTokenResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.api.oauth.OAuthTokenResponse", oAuthTokenResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("access_token", true);
        pluginGeneratedSerialDescriptor.q("refresh_token", true);
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
        return new KSerializer[]{stringSerializer, stringSerializer};
    }

    /* renamed from: f */
    public final OAuthTokenResponse c(Decoder decoder) {
        int i2;
        String str;
        String str2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder.c(serialDescriptor);
        if (c2.y()) {
            str2 = c2.t(serialDescriptor, 0);
            str = c2.t(serialDescriptor, 1);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            str2 = null;
            String str3 = null;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str2 = c2.t(serialDescriptor, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str3 = c2.t(serialDescriptor, 1);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            str = str3;
            i2 = i3;
        }
        c2.b(serialDescriptor);
        return new OAuthTokenResponse(i2, str2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, OAuthTokenResponse oAuthTokenResponse) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(oAuthTokenResponse, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        OAuthTokenResponse.c(oAuthTokenResponse, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
