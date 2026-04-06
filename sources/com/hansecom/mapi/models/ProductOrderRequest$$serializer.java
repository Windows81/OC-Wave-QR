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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class ProductOrderRequest$$serializer implements GeneratedSerializer<ProductOrderRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final ProductOrderRequest$$serializer f39567a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ProductOrderRequest$$serializer productOrderRequest$$serializer = new ProductOrderRequest$$serializer();
        f39567a = productOrderRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.ProductOrderRequest", productOrderRequest$$serializer, 4);
        pluginGeneratedSerialDescriptor.q("paymentMethodId", true);
        pluginGeneratedSerialDescriptor.q("promoCode", true);
        pluginGeneratedSerialDescriptor.q("isStoredValuePayment", true);
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
        KSerializer[] a2 = ProductOrderRequest.f39562e;
        return new KSerializer[]{BuiltinSerializersKt.u(LongSerializer.f42142a), BuiltinSerializersKt.u(StringSerializer.f42197a), BuiltinSerializersKt.u(BooleanSerializer.f42073a), BuiltinSerializersKt.u(a2[3])};
    }

    /* renamed from: f */
    public ProductOrderRequest c(Decoder decoder) {
        List list;
        Boolean bool;
        String str;
        Long l2;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        KSerializer[] a3 = ProductOrderRequest.f39562e;
        Long l3 = null;
        if (c2.y()) {
            list = (List) c2.v(a2, 3, a3[3], (Object) null);
            l2 = (Long) c2.v(a2, 0, LongSerializer.f42142a, (Object) null);
            bool = (Boolean) c2.v(a2, 2, BooleanSerializer.f42073a, (Object) null);
            i2 = 15;
            str = (String) c2.v(a2, 1, StringSerializer.f42197a, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str2 = null;
            Boolean bool2 = null;
            List list2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    l3 = (Long) c2.v(a2, 0, LongSerializer.f42142a, l3);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str2 = (String) c2.v(a2, 1, StringSerializer.f42197a, str2);
                    i3 |= 2;
                } else if (x2 == 2) {
                    bool2 = (Boolean) c2.v(a2, 2, BooleanSerializer.f42073a, bool2);
                    i3 |= 4;
                } else if (x2 == 3) {
                    list2 = (List) c2.v(a2, 3, a3[3], list2);
                    i3 |= 8;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            l2 = l3;
            str = str2;
            bool = bool2;
            list = list2;
        }
        c2.b(a2);
        return new ProductOrderRequest(i2, l2, str, bool, list, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, ProductOrderRequest productOrderRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(productOrderRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        ProductOrderRequest.b(productOrderRequest, c2, a2);
        c2.b(a2);
    }
}
