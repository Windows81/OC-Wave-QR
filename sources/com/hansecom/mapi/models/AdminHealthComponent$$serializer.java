package com.hansecom.mapi.models;

import com.hansecom.mapi.models.AdminHealthComponent;
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
public final class AdminHealthComponent$$serializer implements GeneratedSerializer<AdminHealthComponent> {

    /* renamed from: a  reason: collision with root package name */
    public static final AdminHealthComponent$$serializer f39191a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AdminHealthComponent$$serializer adminHealthComponent$$serializer = new AdminHealthComponent$$serializer();
        f39191a = adminHealthComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.AdminHealthComponent", adminHealthComponent$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("status", true);
        pluginGeneratedSerialDescriptor.q("details", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{BuiltinSerializersKt.u(AdminHealthComponent.f39188c[0]), BuiltinSerializersKt.u(StringSerializer.f42197a)};
    }

    /* renamed from: f */
    public AdminHealthComponent c(Decoder decoder) {
        int i2;
        String str;
        AdminHealthComponent.Status status;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        KSerializer[] a3 = AdminHealthComponent.f39188c;
        if (c2.y()) {
            status = (AdminHealthComponent.Status) c2.v(a2, 0, a3[0], (Object) null);
            str = (String) c2.v(a2, 1, StringSerializer.f42197a, (Object) null);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            AdminHealthComponent.Status status2 = null;
            String str2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    status2 = (AdminHealthComponent.Status) c2.v(a2, 0, a3[0], status2);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str2 = (String) c2.v(a2, 1, StringSerializer.f42197a, str2);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            status = status2;
            str = str2;
            i2 = i3;
        }
        c2.b(a2);
        return new AdminHealthComponent(i2, status, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, AdminHealthComponent adminHealthComponent) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(adminHealthComponent, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        AdminHealthComponent.b(adminHealthComponent, c2, a2);
        c2.b(a2);
    }
}
