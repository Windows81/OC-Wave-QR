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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class PaymentMethodShortened$$serializer implements GeneratedSerializer<PaymentMethodShortened> {

    /* renamed from: a  reason: collision with root package name */
    public static final PaymentMethodShortened$$serializer f39536a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaymentMethodShortened$$serializer paymentMethodShortened$$serializer = new PaymentMethodShortened$$serializer();
        f39536a = paymentMethodShortened$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.PaymentMethodShortened", paymentMethodShortened$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("id", true);
        pluginGeneratedSerialDescriptor.q("isStoredValuePayment", true);
        pluginGeneratedSerialDescriptor.q("cardType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{BuiltinSerializersKt.u(LongSerializer.f42142a), BuiltinSerializersKt.u(BooleanSerializer.f42073a), BuiltinSerializersKt.u(StringSerializer.f42197a)};
    }

    /* renamed from: f */
    public PaymentMethodShortened c(Decoder decoder) {
        String str;
        Boolean bool;
        Long l2;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        Long l3 = null;
        if (c2.y()) {
            l2 = (Long) c2.v(a2, 0, LongSerializer.f42142a, (Object) null);
            str = (String) c2.v(a2, 2, StringSerializer.f42197a, (Object) null);
            bool = (Boolean) c2.v(a2, 1, BooleanSerializer.f42073a, (Object) null);
            i2 = 7;
        } else {
            boolean z2 = true;
            int i3 = 0;
            Boolean bool2 = null;
            String str2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    l3 = (Long) c2.v(a2, 0, LongSerializer.f42142a, l3);
                    i3 |= 1;
                } else if (x2 == 1) {
                    bool2 = (Boolean) c2.v(a2, 1, BooleanSerializer.f42073a, bool2);
                    i3 |= 2;
                } else if (x2 == 2) {
                    str2 = (String) c2.v(a2, 2, StringSerializer.f42197a, str2);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            l2 = l3;
            bool = bool2;
            str = str2;
        }
        c2.b(a2);
        return new PaymentMethodShortened(i2, l2, bool, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, PaymentMethodShortened paymentMethodShortened) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(paymentMethodShortened, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        PaymentMethodShortened.a(paymentMethodShortened, c2, a2);
        c2.b(a2);
    }
}
