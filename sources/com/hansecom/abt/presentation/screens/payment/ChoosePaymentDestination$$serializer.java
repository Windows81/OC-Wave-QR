package com.hansecom.abt.presentation.screens.payment;

import java.util.List;
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
public /* synthetic */ class ChoosePaymentDestination$$serializer implements GeneratedSerializer<ChoosePaymentDestination> {

    /* renamed from: a  reason: collision with root package name */
    public static final ChoosePaymentDestination$$serializer f37735a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f37736b = 8;
    private static final SerialDescriptor descriptor;

    static {
        ChoosePaymentDestination$$serializer choosePaymentDestination$$serializer = new ChoosePaymentDestination$$serializer();
        f37735a = choosePaymentDestination$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.presentation.screens.payment.ChoosePaymentDestination", choosePaymentDestination$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("paymentMethodTypes", false);
        pluginGeneratedSerialDescriptor.q("ignorePaymentMethodIds", false);
        pluginGeneratedSerialDescriptor.q("fareMediaCardId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        KSerializer[] a2 = ChoosePaymentDestination.f37731e;
        return new KSerializer[]{a2[0], BuiltinSerializersKt.u(a2[1]), BuiltinSerializersKt.u(StringSerializer.f42197a)};
    }

    /* renamed from: f */
    public final ChoosePaymentDestination c(Decoder decoder) {
        String str;
        List list;
        List list2;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        KSerializer[] a2 = ChoosePaymentDestination.f37731e;
        List list3 = null;
        if (c2.y()) {
            list = (List) c2.v(serialDescriptor, 1, a2[1], (Object) null);
            list2 = (List) c2.m(serialDescriptor, 0, a2[0], (Object) null);
            str = (String) c2.v(serialDescriptor, 2, StringSerializer.f42197a, (Object) null);
            i2 = 7;
        } else {
            boolean z2 = true;
            int i3 = 0;
            List list4 = null;
            String str2 = null;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    list3 = (List) c2.m(serialDescriptor, 0, a2[0], list3);
                    i3 |= 1;
                } else if (x2 == 1) {
                    list4 = (List) c2.v(serialDescriptor, 1, a2[1], list4);
                    i3 |= 2;
                } else if (x2 == 2) {
                    str2 = (String) c2.v(serialDescriptor, 2, StringSerializer.f42197a, str2);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            list2 = list3;
            list = list4;
            str = str2;
        }
        c2.b(serialDescriptor);
        return new ChoosePaymentDestination(i2, list2, list, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, ChoosePaymentDestination choosePaymentDestination) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(choosePaymentDestination, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        ChoosePaymentDestination.e(choosePaymentDestination, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
