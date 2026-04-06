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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class AdminPhysicalFareMedia$$serializer implements GeneratedSerializer<AdminPhysicalFareMedia> {

    /* renamed from: a  reason: collision with root package name */
    public static final AdminPhysicalFareMedia$$serializer f39207a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AdminPhysicalFareMedia$$serializer adminPhysicalFareMedia$$serializer = new AdminPhysicalFareMedia$$serializer();
        f39207a = adminPhysicalFareMedia$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.AdminPhysicalFareMedia", adminPhysicalFareMedia$$serializer, 4);
        pluginGeneratedSerialDescriptor.q("id", true);
        pluginGeneratedSerialDescriptor.q("name", true);
        pluginGeneratedSerialDescriptor.q("riderTypeId", true);
        pluginGeneratedSerialDescriptor.q("riderTypeName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        IntSerializer intSerializer = IntSerializer.f42129a;
        KSerializer u2 = BuiltinSerializersKt.u(intSerializer);
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{u2, BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* renamed from: f */
    public AdminPhysicalFareMedia c(Decoder decoder) {
        String str;
        Integer num;
        String str2;
        Integer num2;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        Integer num3 = null;
        if (c2.y()) {
            IntSerializer intSerializer = IntSerializer.f42129a;
            StringSerializer stringSerializer = StringSerializer.f42197a;
            num = (Integer) c2.v(a2, 2, intSerializer, (Object) null);
            str = (String) c2.v(a2, 3, stringSerializer, (Object) null);
            i2 = 15;
            str2 = (String) c2.v(a2, 1, stringSerializer, (Object) null);
            num2 = (Integer) c2.v(a2, 0, intSerializer, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str3 = null;
            Integer num4 = null;
            String str4 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num3 = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num3);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str3 = (String) c2.v(a2, 1, StringSerializer.f42197a, str3);
                    i3 |= 2;
                } else if (x2 == 2) {
                    num4 = (Integer) c2.v(a2, 2, IntSerializer.f42129a, num4);
                    i3 |= 4;
                } else if (x2 == 3) {
                    str4 = (String) c2.v(a2, 3, StringSerializer.f42197a, str4);
                    i3 |= 8;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            num2 = num3;
            str2 = str3;
            num = num4;
            str = str4;
        }
        c2.b(a2);
        return new AdminPhysicalFareMedia(i2, num2, str2, num, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, AdminPhysicalFareMedia adminPhysicalFareMedia) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(adminPhysicalFareMedia, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        AdminPhysicalFareMedia.a(adminPhysicalFareMedia, c2, a2);
        c2.b(a2);
    }
}
