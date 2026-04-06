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

@Metadata
@Deprecated
public final class PaymentMethodConfiguration$$serializer implements GeneratedSerializer<PaymentMethodConfiguration> {

    /* renamed from: a  reason: collision with root package name */
    public static final PaymentMethodConfiguration$$serializer f39532a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaymentMethodConfiguration$$serializer paymentMethodConfiguration$$serializer = new PaymentMethodConfiguration$$serializer();
        f39532a = paymentMethodConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.PaymentMethodConfiguration", paymentMethodConfiguration$$serializer, 1);
        pluginGeneratedSerialDescriptor.q("maxPaymentMethods", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{BuiltinSerializersKt.u(IntSerializer.f42129a)};
    }

    /* renamed from: f */
    public PaymentMethodConfiguration c(Decoder decoder) {
        Integer num;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        int i2 = 1;
        if (c2.y()) {
            num = (Integer) c2.v(a2, 0, IntSerializer.f42129a, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            num = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num);
                    i3 = 1;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
        }
        c2.b(a2);
        return new PaymentMethodConfiguration(i2, num, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, PaymentMethodConfiguration paymentMethodConfiguration) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(paymentMethodConfiguration, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        PaymentMethodConfiguration.b(paymentMethodConfiguration, c2, a2);
        c2.b(a2);
    }
}
