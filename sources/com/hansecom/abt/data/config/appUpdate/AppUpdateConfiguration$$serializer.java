package com.hansecom.abt.data.config.appUpdate;

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
public /* synthetic */ class AppUpdateConfiguration$$serializer implements GeneratedSerializer<AppUpdateConfiguration> {

    /* renamed from: a  reason: collision with root package name */
    public static final AppUpdateConfiguration$$serializer f33181a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33182b = 8;
    private static final SerialDescriptor descriptor;

    static {
        AppUpdateConfiguration$$serializer appUpdateConfiguration$$serializer = new AppUpdateConfiguration$$serializer();
        f33181a = appUpdateConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.data.config.appUpdate.AppUpdateConfiguration", appUpdateConfiguration$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("showNotificationForVersionsBelow", false);
        pluginGeneratedSerialDescriptor.q("forceUpdateVersionUpTo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* renamed from: f */
    public final AppUpdateConfiguration c(Decoder decoder) {
        String str;
        int i2;
        String str2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder.c(serialDescriptor);
        if (c2.y()) {
            StringSerializer stringSerializer = StringSerializer.f42197a;
            str = (String) c2.v(serialDescriptor, 0, stringSerializer, (Object) null);
            str2 = (String) c2.v(serialDescriptor, 1, stringSerializer, (Object) null);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            str2 = null;
            String str3 = null;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str3 = (String) c2.v(serialDescriptor, 0, StringSerializer.f42197a, str3);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str2 = (String) c2.v(serialDescriptor, 1, StringSerializer.f42197a, str2);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            str = str3;
        }
        c2.b(serialDescriptor);
        return new AppUpdateConfiguration(i2, str, str2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, AppUpdateConfiguration appUpdateConfiguration) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(appUpdateConfiguration, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        AppUpdateConfiguration.c(appUpdateConfiguration, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
