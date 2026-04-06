package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

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
public /* synthetic */ class CardOptionsAddInstitutionDestination$$serializer implements GeneratedSerializer<CardOptionsAddInstitutionDestination> {

    /* renamed from: a  reason: collision with root package name */
    public static final CardOptionsAddInstitutionDestination$$serializer f36486a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f36487b = 8;
    private static final SerialDescriptor descriptor;

    static {
        CardOptionsAddInstitutionDestination$$serializer cardOptionsAddInstitutionDestination$$serializer = new CardOptionsAddInstitutionDestination$$serializer();
        f36486a = cardOptionsAddInstitutionDestination$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAddInstitutionDestination", cardOptionsAddInstitutionDestination$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("fareMediaId", false);
        pluginGeneratedSerialDescriptor.q("institutionId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        return new KSerializer[]{StringSerializer.f42197a, IntSerializer.f42129a};
    }

    /* renamed from: f */
    public final CardOptionsAddInstitutionDestination c(Decoder decoder) {
        int i2;
        int i3;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder.c(serialDescriptor);
        if (c2.y()) {
            str = c2.t(serialDescriptor, 0);
            i3 = c2.k(serialDescriptor, 1);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i4 = 0;
            int i5 = 0;
            str = null;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str = c2.t(serialDescriptor, 0);
                    i5 |= 1;
                } else if (x2 == 1) {
                    i4 = c2.k(serialDescriptor, 1);
                    i5 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i3 = i4;
            i2 = i5;
        }
        c2.b(serialDescriptor);
        return new CardOptionsAddInstitutionDestination(i2, str, i3, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, CardOptionsAddInstitutionDestination cardOptionsAddInstitutionDestination) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(cardOptionsAddInstitutionDestination, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        CardOptionsAddInstitutionDestination.a(cardOptionsAddInstitutionDestination, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
