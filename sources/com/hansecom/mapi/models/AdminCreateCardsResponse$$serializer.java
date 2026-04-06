package com.hansecom.mapi.models;

import java.util.List;
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

@Metadata
@Deprecated
public final class AdminCreateCardsResponse$$serializer implements GeneratedSerializer<AdminCreateCardsResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final AdminCreateCardsResponse$$serializer f39187a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AdminCreateCardsResponse$$serializer adminCreateCardsResponse$$serializer = new AdminCreateCardsResponse$$serializer();
        f39187a = adminCreateCardsResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.AdminCreateCardsResponse", adminCreateCardsResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("totalCards", true);
        pluginGeneratedSerialDescriptor.q("cards", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = AdminCreateCardsResponse.f39184c;
        return new KSerializer[]{BuiltinSerializersKt.u(IntSerializer.f42129a), BuiltinSerializersKt.u(a2[1])};
    }

    /* renamed from: f */
    public AdminCreateCardsResponse c(Decoder decoder) {
        int i2;
        Integer num;
        List list;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        KSerializer[] a3 = AdminCreateCardsResponse.f39184c;
        if (c2.y()) {
            num = (Integer) c2.v(a2, 0, IntSerializer.f42129a, (Object) null);
            list = (List) c2.v(a2, 1, a3[1], (Object) null);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            List list2 = null;
            Integer num2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num2 = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num2);
                    i3 |= 1;
                } else if (x2 == 1) {
                    list2 = (List) c2.v(a2, 1, a3[1], list2);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            list = list2;
            num = num2;
            i2 = i3;
        }
        c2.b(a2);
        return new AdminCreateCardsResponse(i2, num, list, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, AdminCreateCardsResponse adminCreateCardsResponse) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(adminCreateCardsResponse, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        AdminCreateCardsResponse.b(adminCreateCardsResponse, c2, a2);
        c2.b(a2);
    }
}
