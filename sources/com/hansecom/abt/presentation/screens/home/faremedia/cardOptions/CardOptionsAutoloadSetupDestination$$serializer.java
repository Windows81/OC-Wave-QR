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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public /* synthetic */ class CardOptionsAutoloadSetupDestination$$serializer implements GeneratedSerializer<CardOptionsAutoloadSetupDestination> {

    /* renamed from: a  reason: collision with root package name */
    public static final CardOptionsAutoloadSetupDestination$$serializer f36499a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f36500b = 8;
    private static final SerialDescriptor descriptor;

    static {
        CardOptionsAutoloadSetupDestination$$serializer cardOptionsAutoloadSetupDestination$$serializer = new CardOptionsAutoloadSetupDestination$$serializer();
        f36499a = cardOptionsAutoloadSetupDestination$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAutoloadSetupDestination", cardOptionsAutoloadSetupDestination$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("fareMediaId", false);
        pluginGeneratedSerialDescriptor.q("autoloadId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        return new KSerializer[]{StringSerializer.f42197a, BuiltinSerializersKt.u(LongSerializer.f42142a)};
    }

    /* renamed from: f */
    public final CardOptionsAutoloadSetupDestination c(Decoder decoder) {
        int i2;
        Long l2;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder.c(serialDescriptor);
        if (c2.y()) {
            str = c2.t(serialDescriptor, 0);
            l2 = (Long) c2.v(serialDescriptor, 1, LongSerializer.f42142a, (Object) null);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            str = null;
            Long l3 = null;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str = c2.t(serialDescriptor, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    l3 = (Long) c2.v(serialDescriptor, 1, LongSerializer.f42142a, l3);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            l2 = l3;
            i2 = i3;
        }
        c2.b(serialDescriptor);
        return new CardOptionsAutoloadSetupDestination(i2, str, l2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, CardOptionsAutoloadSetupDestination cardOptionsAutoloadSetupDestination) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(cardOptionsAutoloadSetupDestination, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        CardOptionsAutoloadSetupDestination.c(cardOptionsAutoloadSetupDestination, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
