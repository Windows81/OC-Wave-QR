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
public final class FareMediaMoneyLoadRequest$$serializer implements GeneratedSerializer<FareMediaMoneyLoadRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareMediaMoneyLoadRequest$$serializer f39367a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareMediaMoneyLoadRequest$$serializer fareMediaMoneyLoadRequest$$serializer = new FareMediaMoneyLoadRequest$$serializer();
        f39367a = fareMediaMoneyLoadRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareMediaMoneyLoadRequest", fareMediaMoneyLoadRequest$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("amount", true);
        pluginGeneratedSerialDescriptor.q("paymentMethod", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{BuiltinSerializersKt.u(StringSerializer.f42197a), BuiltinSerializersKt.u(PaymentMethodShortened$$serializer.f39536a)};
    }

    /* renamed from: f */
    public FareMediaMoneyLoadRequest c(Decoder decoder) {
        int i2;
        PaymentMethodShortened paymentMethodShortened;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        if (c2.y()) {
            str = (String) c2.v(a2, 0, StringSerializer.f42197a, (Object) null);
            paymentMethodShortened = (PaymentMethodShortened) c2.v(a2, 1, PaymentMethodShortened$$serializer.f39536a, (Object) null);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            str = null;
            PaymentMethodShortened paymentMethodShortened2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str = (String) c2.v(a2, 0, StringSerializer.f42197a, str);
                    i3 |= 1;
                } else if (x2 == 1) {
                    paymentMethodShortened2 = (PaymentMethodShortened) c2.v(a2, 1, PaymentMethodShortened$$serializer.f39536a, paymentMethodShortened2);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            paymentMethodShortened = paymentMethodShortened2;
            i2 = i3;
        }
        c2.b(a2);
        return new FareMediaMoneyLoadRequest(i2, str, paymentMethodShortened, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareMediaMoneyLoadRequest fareMediaMoneyLoadRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareMediaMoneyLoadRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareMediaMoneyLoadRequest.a(fareMediaMoneyLoadRequest, c2, a2);
        c2.b(a2);
    }
}
