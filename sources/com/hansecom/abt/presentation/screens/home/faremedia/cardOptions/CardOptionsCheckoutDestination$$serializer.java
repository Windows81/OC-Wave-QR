package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

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
public /* synthetic */ class CardOptionsCheckoutDestination$$serializer implements GeneratedSerializer<CardOptionsCheckoutDestination> {

    /* renamed from: a  reason: collision with root package name */
    public static final CardOptionsCheckoutDestination$$serializer f36510a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f36511b = 8;
    private static final SerialDescriptor descriptor;

    static {
        CardOptionsCheckoutDestination$$serializer cardOptionsCheckoutDestination$$serializer = new CardOptionsCheckoutDestination$$serializer();
        f36510a = cardOptionsCheckoutDestination$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCheckoutDestination", cardOptionsCheckoutDestination$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("fareMediaId", false);
        pluginGeneratedSerialDescriptor.q("passId", false);
        pluginGeneratedSerialDescriptor.q("groupSize", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        IntSerializer intSerializer = IntSerializer.f42129a;
        return new KSerializer[]{StringSerializer.f42197a, intSerializer, BuiltinSerializersKt.u(intSerializer)};
    }

    /* renamed from: f */
    public final CardOptionsCheckoutDestination c(Decoder decoder) {
        Integer num;
        int i2;
        String str;
        int i3;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        if (c2.y()) {
            String t2 = c2.t(serialDescriptor, 0);
            int k2 = c2.k(serialDescriptor, 1);
            str = t2;
            num = (Integer) c2.v(serialDescriptor, 2, IntSerializer.f42129a, (Object) null);
            i2 = k2;
            i3 = 7;
        } else {
            boolean z2 = true;
            int i4 = 0;
            String str2 = null;
            Integer num2 = null;
            int i5 = 0;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str2 = c2.t(serialDescriptor, 0);
                    i5 |= 1;
                } else if (x2 == 1) {
                    i4 = c2.k(serialDescriptor, 1);
                    i5 |= 2;
                } else if (x2 == 2) {
                    num2 = (Integer) c2.v(serialDescriptor, 2, IntSerializer.f42129a, num2);
                    i5 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i4;
            i3 = i5;
            str = str2;
            num = num2;
        }
        c2.b(serialDescriptor);
        return new CardOptionsCheckoutDestination(i3, str, i2, num, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, CardOptionsCheckoutDestination cardOptionsCheckoutDestination) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(cardOptionsCheckoutDestination, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        CardOptionsCheckoutDestination.d(cardOptionsCheckoutDestination, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
