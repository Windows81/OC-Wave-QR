package com.hansecom.mapi.models;

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
public final class NotificationDeviceResponse$$serializer implements GeneratedSerializer<NotificationDeviceResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final NotificationDeviceResponse$$serializer f39514a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NotificationDeviceResponse$$serializer notificationDeviceResponse$$serializer = new NotificationDeviceResponse$$serializer();
        f39514a = notificationDeviceResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.NotificationDeviceResponse", notificationDeviceResponse$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("messagingToken", false);
        pluginGeneratedSerialDescriptor.q("isActive", false);
        pluginGeneratedSerialDescriptor.q("expiration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{stringSerializer, BooleanSerializer.f42073a, BuiltinSerializersKt.u(stringSerializer)};
    }

    /* renamed from: f */
    public NotificationDeviceResponse c(Decoder decoder) {
        String str;
        boolean z2;
        String str2;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        if (c2.y()) {
            String t2 = c2.t(a2, 0);
            boolean s2 = c2.s(a2, 1);
            str2 = t2;
            str = (String) c2.v(a2, 2, StringSerializer.f42197a, (Object) null);
            z2 = s2;
            i2 = 7;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            String str3 = null;
            String str4 = null;
            int i3 = 0;
            while (z3) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z3 = false;
                } else if (x2 == 0) {
                    str3 = c2.t(a2, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    z4 = c2.s(a2, 1);
                    i3 |= 2;
                } else if (x2 == 2) {
                    str4 = (String) c2.v(a2, 2, StringSerializer.f42197a, str4);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            z2 = z4;
            i2 = i3;
            str2 = str3;
            str = str4;
        }
        c2.b(a2);
        return new NotificationDeviceResponse(i2, str2, z2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, NotificationDeviceResponse notificationDeviceResponse) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(notificationDeviceResponse, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        NotificationDeviceResponse.a(notificationDeviceResponse, c2, a2);
        c2.b(a2);
    }
}
