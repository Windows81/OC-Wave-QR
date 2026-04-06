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
public final class PreTopUpPromoCode$$serializer implements GeneratedSerializer<PreTopUpPromoCode> {

    /* renamed from: a  reason: collision with root package name */
    public static final PreTopUpPromoCode$$serializer f39548a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PreTopUpPromoCode$$serializer preTopUpPromoCode$$serializer = new PreTopUpPromoCode$$serializer();
        f39548a = preTopUpPromoCode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.PreTopUpPromoCode", preTopUpPromoCode$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("amount", false);
        pluginGeneratedSerialDescriptor.q("promoCodeNumber", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{IntSerializer.f42129a, StringSerializer.f42197a};
    }

    /* renamed from: f */
    public PreTopUpPromoCode c(Decoder decoder) {
        int i2;
        String str;
        int i3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        if (c2.y()) {
            i3 = c2.k(a2, 0);
            str = c2.t(a2, 1);
            i2 = 3;
        } else {
            boolean z2 = true;
            i3 = 0;
            int i4 = 0;
            String str2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    i3 = c2.k(a2, 0);
                    i4 |= 1;
                } else if (x2 == 1) {
                    str2 = c2.t(a2, 1);
                    i4 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            str = str2;
            i2 = i4;
        }
        c2.b(a2);
        return new PreTopUpPromoCode(i2, i3, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, PreTopUpPromoCode preTopUpPromoCode) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(preTopUpPromoCode, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        PreTopUpPromoCode.a(preTopUpPromoCode, c2, a2);
        c2.b(a2);
    }
}
