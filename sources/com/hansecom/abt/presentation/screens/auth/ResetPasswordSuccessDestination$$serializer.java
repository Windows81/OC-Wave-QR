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
public /* synthetic */ class ResetPasswordSuccessDestination$$serializer implements GeneratedSerializer<ResetPasswordSuccessDestination> {

    /* renamed from: a  reason: collision with root package name */
    public static final ResetPasswordSuccessDestination$$serializer f34270a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f34271b = 8;
    private static final SerialDescriptor descriptor;

    static {
        ResetPasswordSuccessDestination$$serializer resetPasswordSuccessDestination$$serializer = new ResetPasswordSuccessDestination$$serializer();
        f34270a = resetPasswordSuccessDestination$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.presentation.screens.auth.ResetPasswordSuccessDestination", resetPasswordSuccessDestination$$serializer, 1);
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
    public final ResetPasswordSuccessDestination c(Decoder decoder) {
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
        return new ResetPasswordSuccessDestination(i2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, ResetPasswordSuccessDestination resetPasswordSuccessDestination) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(resetPasswordSuccessDestination, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        c2.t(serialDescriptor, 0, resetPasswordSuccessDestination.f34269a);
        c2.b(serialDescriptor);
    }
}
