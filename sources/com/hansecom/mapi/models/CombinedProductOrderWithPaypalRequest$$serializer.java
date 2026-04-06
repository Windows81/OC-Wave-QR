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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class CombinedProductOrderWithPaypalRequest$$serializer implements GeneratedSerializer<CombinedProductOrderWithPaypalRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final CombinedProductOrderWithPaypalRequest$$serializer f39275a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CombinedProductOrderWithPaypalRequest$$serializer combinedProductOrderWithPaypalRequest$$serializer = new CombinedProductOrderWithPaypalRequest$$serializer();
        f39275a = combinedProductOrderWithPaypalRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.CombinedProductOrderWithPaypalRequest", combinedProductOrderWithPaypalRequest$$serializer, 4);
        pluginGeneratedSerialDescriptor.q("payPalRequestId", false);
        pluginGeneratedSerialDescriptor.q("isPreTax", true);
        pluginGeneratedSerialDescriptor.q("topUps", true);
        pluginGeneratedSerialDescriptor.q("products", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = CombinedProductOrderWithPaypalRequest.f39270e;
        return new KSerializer[]{StringSerializer.f42197a, BuiltinSerializersKt.u(BooleanSerializer.f42073a), BuiltinSerializersKt.u(a2[2]), BuiltinSerializersKt.u(a2[3])};
    }

    /* renamed from: f */
    public CombinedProductOrderWithPaypalRequest c(Decoder decoder) {
        List list;
        List list2;
        Boolean bool;
        String str;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        KSerializer[] a3 = CombinedProductOrderWithPaypalRequest.f39270e;
        String str2 = null;
        if (c2.y()) {
            String t2 = c2.t(a2, 0);
            list = (List) c2.v(a2, 3, a3[3], (Object) null);
            str = t2;
            i2 = 15;
            list2 = (List) c2.v(a2, 2, a3[2], (Object) null);
            bool = (Boolean) c2.v(a2, 1, BooleanSerializer.f42073a, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            Boolean bool2 = null;
            List list3 = null;
            List list4 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str2 = c2.t(a2, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    bool2 = (Boolean) c2.v(a2, 1, BooleanSerializer.f42073a, bool2);
                    i3 |= 2;
                } else if (x2 == 2) {
                    list3 = (List) c2.v(a2, 2, a3[2], list3);
                    i3 |= 4;
                } else if (x2 == 3) {
                    list4 = (List) c2.v(a2, 3, a3[3], list4);
                    i3 |= 8;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            str = str2;
            bool = bool2;
            list2 = list3;
            list = list4;
        }
        c2.b(a2);
        return new CombinedProductOrderWithPaypalRequest(i2, str, bool, list2, list, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, CombinedProductOrderWithPaypalRequest combinedProductOrderWithPaypalRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(combinedProductOrderWithPaypalRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        CombinedProductOrderWithPaypalRequest.b(combinedProductOrderWithPaypalRequest, c2, a2);
        c2.b(a2);
    }
}
