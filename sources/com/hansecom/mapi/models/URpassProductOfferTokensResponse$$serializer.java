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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class URpassProductOfferTokensResponse$$serializer implements GeneratedSerializer<URpassProductOfferTokensResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final URpassProductOfferTokensResponse$$serializer f39613a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        URpassProductOfferTokensResponse$$serializer uRpassProductOfferTokensResponse$$serializer = new URpassProductOfferTokensResponse$$serializer();
        f39613a = uRpassProductOfferTokensResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.URpassProductOfferTokensResponse", uRpassProductOfferTokensResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.q("name", false);
        pluginGeneratedSerialDescriptor.q("description", false);
        pluginGeneratedSerialDescriptor.q("price", false);
        pluginGeneratedSerialDescriptor.q("offerToken", false);
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
        return new KSerializer[]{stringSerializer, stringSerializer, IntSerializer.f42129a, stringSerializer};
    }

    /* renamed from: f */
    public URpassProductOfferTokensResponse c(Decoder decoder) {
        String str;
        int i2;
        String str2;
        String str3;
        int i3;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        if (c2.y()) {
            String t2 = c2.t(a2, 0);
            String t3 = c2.t(a2, 1);
            int k2 = c2.k(a2, 2);
            str3 = t2;
            str = c2.t(a2, 3);
            i2 = k2;
            str2 = t3;
            i3 = 15;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z2 = true;
            int i4 = 0;
            int i5 = 0;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str4 = c2.t(a2, 0);
                    i5 |= 1;
                } else if (x2 == 1) {
                    str6 = c2.t(a2, 1);
                    i5 |= 2;
                } else if (x2 == 2) {
                    i4 = c2.k(a2, 2);
                    i5 |= 4;
                } else if (x2 == 3) {
                    str5 = c2.t(a2, 3);
                    i5 |= 8;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            str3 = str4;
            str = str5;
            i2 = i4;
            str2 = str6;
            i3 = i5;
        }
        c2.b(a2);
        return new URpassProductOfferTokensResponse(i3, str3, str2, i2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, URpassProductOfferTokensResponse uRpassProductOfferTokensResponse) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(uRpassProductOfferTokensResponse, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        URpassProductOfferTokensResponse.a(uRpassProductOfferTokensResponse, c2, a2);
        c2.b(a2);
    }
}
