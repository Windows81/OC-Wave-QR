package com.hansecom.abt.presentation.screens.auth.register;

import com.hansecom.abt.presentation.screens.auth.register.RegistrationStep;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Deprecated
public /* synthetic */ class RegistrationStep$ChooseQuestion$$serializer implements GeneratedSerializer<RegistrationStep.ChooseQuestion> {

    /* renamed from: a  reason: collision with root package name */
    public static final RegistrationStep$ChooseQuestion$$serializer f34429a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f34430b = 8;
    private static final SerialDescriptor descriptor;

    static {
        RegistrationStep$ChooseQuestion$$serializer registrationStep$ChooseQuestion$$serializer = new RegistrationStep$ChooseQuestion$$serializer();
        f34429a = registrationStep$ChooseQuestion$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.presentation.screens.auth.register.RegistrationStep.ChooseQuestion", registrationStep$ChooseQuestion$$serializer, 1);
        pluginGeneratedSerialDescriptor.q("secondQuestion", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        return new KSerializer[]{BooleanSerializer.f42073a};
    }

    /* renamed from: f */
    public final RegistrationStep.ChooseQuestion c(Decoder decoder) {
        boolean z2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder.c(serialDescriptor);
        int i2 = 1;
        if (c2.y()) {
            z2 = c2.s(serialDescriptor, 0);
        } else {
            boolean z3 = true;
            z2 = false;
            int i3 = 0;
            while (z3) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z3 = false;
                } else if (x2 == 0) {
                    z2 = c2.s(serialDescriptor, 0);
                    i3 = 1;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
        }
        c2.b(serialDescriptor);
        return new RegistrationStep.ChooseQuestion(i2, z2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, RegistrationStep.ChooseQuestion chooseQuestion) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(chooseQuestion, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        c2.s(serialDescriptor, 0, chooseQuestion.f34431a);
        c2.b(serialDescriptor);
    }
}
