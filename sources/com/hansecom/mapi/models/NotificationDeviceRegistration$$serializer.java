package com.hansecom.mapi.models;

import com.hansecom.mapi.models.NotificationDeviceRegistration;
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
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class NotificationDeviceRegistration$$serializer implements GeneratedSerializer<NotificationDeviceRegistration> {

    /* renamed from: a  reason: collision with root package name */
    public static final NotificationDeviceRegistration$$serializer f39506a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NotificationDeviceRegistration$$serializer notificationDeviceRegistration$$serializer = new NotificationDeviceRegistration$$serializer();
        f39506a = notificationDeviceRegistration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.NotificationDeviceRegistration", notificationDeviceRegistration$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("messagingToken", false);
        pluginGeneratedSerialDescriptor.q("platform", false);
        pluginGeneratedSerialDescriptor.q("isActive", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{StringSerializer.f42197a, NotificationDeviceRegistration.f39502d[1], BuiltinSerializersKt.u(BooleanSerializer.f42073a)};
    }

    /* renamed from: f */
    public NotificationDeviceRegistration c(Decoder decoder) {
        Boolean bool;
        NotificationDeviceRegistration.Platform platform;
        String str;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        KSerializer[] a3 = NotificationDeviceRegistration.f39502d;
        String str2 = null;
        if (c2.y()) {
            String t2 = c2.t(a2, 0);
            platform = (NotificationDeviceRegistration.Platform) c2.m(a2, 1, a3[1], (Object) null);
            str = t2;
            bool = (Boolean) c2.v(a2, 2, BooleanSerializer.f42073a, (Object) null);
            i2 = 7;
        } else {
            boolean z2 = true;
            int i3 = 0;
            NotificationDeviceRegistration.Platform platform2 = null;
            Boolean bool2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str2 = c2.t(a2, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    platform2 = (NotificationDeviceRegistration.Platform) c2.m(a2, 1, a3[1], platform2);
                    i3 |= 2;
                } else if (x2 == 2) {
                    bool2 = (Boolean) c2.v(a2, 2, BooleanSerializer.f42073a, bool2);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            str = str2;
            platform = platform2;
            bool = bool2;
        }
        c2.b(a2);
        return new NotificationDeviceRegistration(i2, str, platform, bool, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, NotificationDeviceRegistration notificationDeviceRegistration) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(notificationDeviceRegistration, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        NotificationDeviceRegistration.b(notificationDeviceRegistration, c2, a2);
        c2.b(a2);
    }
}
