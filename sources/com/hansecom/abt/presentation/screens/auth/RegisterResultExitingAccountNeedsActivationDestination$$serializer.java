package com.hansecom.abt.presentation.screens.auth;

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
public /* synthetic */ class RegisterResultExitingAccountNeedsActivationDestination$$serializer implements GeneratedSerializer<RegisterResultExitingAccountNeedsActivationDestination> {

    /* renamed from: a  reason: collision with root package name */
    public static final RegisterResultExitingAccountNeedsActivationDestination$$serializer f34263a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f34264b = 8;
    private static final SerialDescriptor descriptor;

    static {
        RegisterResultExitingAccountNeedsActivationDestination$$serializer registerResultExitingAccountNeedsActivationDestination$$serializer = new RegisterResultExitingAccountNeedsActivationDestination$$serializer();
        f34263a = registerResultExitingAccountNeedsActivationDestination$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.presentation.screens.auth.RegisterResultExitingAccountNeedsActivationDestination", registerResultExitingAccountNeedsActivationDestination$$serializer, 1);
        pluginGeneratedSerialDescriptor.q("email", false);
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
    public final RegisterResultExitingAccountNeedsActivationDestination c(Decoder decoder) {
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
        return new RegisterResultExitingAccountNeedsActivationDestination(i2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, RegisterResultExitingAccountNeedsActivationDestination registerResultExitingAccountNeedsActivationDestination) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(registerResultExitingAccountNeedsActivationDestination, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        c2.t(serialDescriptor, 0, registerResultExitingAccountNeedsActivationDestination.f34262a);
        c2.b(serialDescriptor);
    }
}
