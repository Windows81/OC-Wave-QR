package com.hansecom.mapi.models;

import java.util.List;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class URpassPurchaseRequest$$serializer implements GeneratedSerializer<URpassPurchaseRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final URpassPurchaseRequest$$serializer f39621a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        URpassPurchaseRequest$$serializer uRpassPurchaseRequest$$serializer = new URpassPurchaseRequest$$serializer();
        f39621a = uRpassPurchaseRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.URpassPurchaseRequest", uRpassPurchaseRequest$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("urpassTenant", false);
        pluginGeneratedSerialDescriptor.q("items", false);
        pluginGeneratedSerialDescriptor.q("paymentMethodId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{StringSerializer.f42197a, URpassPurchaseRequest.f39617d[1], LongSerializer.f42142a};
    }

    /* renamed from: f */
    public URpassPurchaseRequest c(Decoder decoder) {
        long j2;
        List list;
        String str;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        KSerializer[] a3 = URpassPurchaseRequest.f39617d;
        String str2 = null;
        if (c2.y()) {
            String t2 = c2.t(a2, 0);
            list = (List) c2.m(a2, 1, a3[1], (Object) null);
            str = t2;
            j2 = c2.h(a2, 2);
            i2 = 7;
        } else {
            long j3 = 0;
            boolean z2 = true;
            int i3 = 0;
            List list2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str2 = c2.t(a2, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    list2 = (List) c2.m(a2, 1, a3[1], list2);
                    i3 |= 2;
                } else if (x2 == 2) {
                    j3 = c2.h(a2, 2);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            str = str2;
            j2 = j3;
            list = list2;
        }
        c2.b(a2);
        return new URpassPurchaseRequest(i2, str, list, j2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, URpassPurchaseRequest uRpassPurchaseRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(uRpassPurchaseRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        URpassPurchaseRequest.b(uRpassPurchaseRequest, c2, a2);
        c2.b(a2);
    }
}
