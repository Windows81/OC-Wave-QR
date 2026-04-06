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
public final class PrePurchasePromoCode$$serializer implements GeneratedSerializer<PrePurchasePromoCode> {

    /* renamed from: a  reason: collision with root package name */
    public static final PrePurchasePromoCode$$serializer f39540a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PrePurchasePromoCode$$serializer prePurchasePromoCode$$serializer = new PrePurchasePromoCode$$serializer();
        f39540a = prePurchasePromoCode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.PrePurchasePromoCode", prePurchasePromoCode$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("offerRef", false);
        pluginGeneratedSerialDescriptor.q("promoCodeNumber", false);
        pluginGeneratedSerialDescriptor.q("groupSize", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer u2 = BuiltinSerializersKt.u(IntSerializer.f42129a);
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{stringSerializer, stringSerializer, u2};
    }

    /* renamed from: f */
    public PrePurchasePromoCode c(Decoder decoder) {
        Integer num;
        String str;
        String str2;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        String str3 = null;
        if (c2.y()) {
            String t2 = c2.t(a2, 0);
            String t3 = c2.t(a2, 1);
            str2 = t2;
            num = (Integer) c2.v(a2, 2, IntSerializer.f42129a, (Object) null);
            str = t3;
            i2 = 7;
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str4 = null;
            Integer num2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str3 = c2.t(a2, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str4 = c2.t(a2, 1);
                    i3 |= 2;
                } else if (x2 == 2) {
                    num2 = (Integer) c2.v(a2, 2, IntSerializer.f42129a, num2);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            str2 = str3;
            str = str4;
            num = num2;
        }
        c2.b(a2);
        return new PrePurchasePromoCode(i2, str2, str, num, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, PrePurchasePromoCode prePurchasePromoCode) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(prePurchasePromoCode, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        PrePurchasePromoCode.a(prePurchasePromoCode, c2, a2);
        c2.b(a2);
    }
}
