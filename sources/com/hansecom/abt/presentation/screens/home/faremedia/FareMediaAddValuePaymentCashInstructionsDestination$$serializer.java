package com.hansecom.abt.presentation.screens.home.faremedia;

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
public /* synthetic */ class FareMediaAddValuePaymentCashInstructionsDestination$$serializer implements GeneratedSerializer<FareMediaAddValuePaymentCashInstructionsDestination> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareMediaAddValuePaymentCashInstructionsDestination$$serializer f35934a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f35935b = 8;
    private static final SerialDescriptor descriptor;

    static {
        FareMediaAddValuePaymentCashInstructionsDestination$$serializer fareMediaAddValuePaymentCashInstructionsDestination$$serializer = new FareMediaAddValuePaymentCashInstructionsDestination$$serializer();
        f35934a = fareMediaAddValuePaymentCashInstructionsDestination$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.presentation.screens.home.faremedia.FareMediaAddValuePaymentCashInstructionsDestination", fareMediaAddValuePaymentCashInstructionsDestination$$serializer, 1);
        pluginGeneratedSerialDescriptor.q("fareMediaId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        return new KSerializer[]{StringSerializer.f42197a};
    }

    /* renamed from: f */
    public final FareMediaAddValuePaymentCashInstructionsDestination c(Decoder decoder) {
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder.c(serialDescriptor);
        int i2 = 1;
        if (c2.y()) {
            str = c2.t(serialDescriptor, 0);
        } else {
            boolean z2 = true;
            int i3 = 0;
            str = null;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str = c2.t(serialDescriptor, 0);
                    i3 = 1;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
        }
        c2.b(serialDescriptor);
        return new FareMediaAddValuePaymentCashInstructionsDestination(i2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, FareMediaAddValuePaymentCashInstructionsDestination fareMediaAddValuePaymentCashInstructionsDestination) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareMediaAddValuePaymentCashInstructionsDestination, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        c2.t(serialDescriptor, 0, fareMediaAddValuePaymentCashInstructionsDestination.f35933a);
        c2.b(serialDescriptor);
    }
}
