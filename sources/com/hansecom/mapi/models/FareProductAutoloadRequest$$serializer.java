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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Deprecated
public final class FareProductAutoloadRequest$$serializer implements GeneratedSerializer<FareProductAutoloadRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareProductAutoloadRequest$$serializer f39449a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareProductAutoloadRequest$$serializer fareProductAutoloadRequest$$serializer = new FareProductAutoloadRequest$$serializer();
        f39449a = fareProductAutoloadRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareProductAutoloadRequest", fareProductAutoloadRequest$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("paused", true);
        pluginGeneratedSerialDescriptor.q("primaryPaymentMethod", true);
        pluginGeneratedSerialDescriptor.q("backupPaymentMethod", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer u2 = BuiltinSerializersKt.u(BooleanSerializer.f42073a);
        PaymentMethodShortened$$serializer paymentMethodShortened$$serializer = PaymentMethodShortened$$serializer.f39536a;
        return new KSerializer[]{u2, BuiltinSerializersKt.u(paymentMethodShortened$$serializer), BuiltinSerializersKt.u(paymentMethodShortened$$serializer)};
    }

    /* renamed from: f */
    public FareProductAutoloadRequest c(Decoder decoder) {
        PaymentMethodShortened paymentMethodShortened;
        PaymentMethodShortened paymentMethodShortened2;
        Boolean bool;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        Boolean bool2 = null;
        if (c2.y()) {
            PaymentMethodShortened$$serializer paymentMethodShortened$$serializer = PaymentMethodShortened$$serializer.f39536a;
            bool = (Boolean) c2.v(a2, 0, BooleanSerializer.f42073a, (Object) null);
            paymentMethodShortened = (PaymentMethodShortened) c2.v(a2, 2, paymentMethodShortened$$serializer, (Object) null);
            paymentMethodShortened2 = (PaymentMethodShortened) c2.v(a2, 1, paymentMethodShortened$$serializer, (Object) null);
            i2 = 7;
        } else {
            boolean z2 = true;
            int i3 = 0;
            PaymentMethodShortened paymentMethodShortened3 = null;
            PaymentMethodShortened paymentMethodShortened4 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    bool2 = (Boolean) c2.v(a2, 0, BooleanSerializer.f42073a, bool2);
                    i3 |= 1;
                } else if (x2 == 1) {
                    paymentMethodShortened3 = (PaymentMethodShortened) c2.v(a2, 1, PaymentMethodShortened$$serializer.f39536a, paymentMethodShortened3);
                    i3 |= 2;
                } else if (x2 == 2) {
                    paymentMethodShortened4 = (PaymentMethodShortened) c2.v(a2, 2, PaymentMethodShortened$$serializer.f39536a, paymentMethodShortened4);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            bool = bool2;
            paymentMethodShortened2 = paymentMethodShortened3;
            paymentMethodShortened = paymentMethodShortened4;
        }
        c2.b(a2);
        return new FareProductAutoloadRequest(i2, bool, paymentMethodShortened2, paymentMethodShortened, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareProductAutoloadRequest fareProductAutoloadRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareProductAutoloadRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareProductAutoloadRequest.a(fareProductAutoloadRequest, c2, a2);
        c2.b(a2);
    }
}
