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
public final class ProductConfiguration$$serializer implements GeneratedSerializer<ProductConfiguration> {

    /* renamed from: a  reason: collision with root package name */
    public static final ProductConfiguration$$serializer f39561a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ProductConfiguration$$serializer productConfiguration$$serializer = new ProductConfiguration$$serializer();
        f39561a = productConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.ProductConfiguration", productConfiguration$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("offerRef", false);
        pluginGeneratedSerialDescriptor.q("quantity", false);
        pluginGeneratedSerialDescriptor.q("groupSize", true);
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
        return new KSerializer[]{StringSerializer.f42197a, intSerializer, BuiltinSerializersKt.u(intSerializer)};
    }

    /* renamed from: f */
    public ProductConfiguration c(Decoder decoder) {
        Integer num;
        int i2;
        String str;
        int i3;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        if (c2.y()) {
            String t2 = c2.t(a2, 0);
            int k2 = c2.k(a2, 1);
            str = t2;
            num = (Integer) c2.v(a2, 2, IntSerializer.f42129a, (Object) null);
            i2 = k2;
            i3 = 7;
        } else {
            boolean z2 = true;
            int i4 = 0;
            String str2 = null;
            Integer num2 = null;
            int i5 = 0;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str2 = c2.t(a2, 0);
                    i5 |= 1;
                } else if (x2 == 1) {
                    i4 = c2.k(a2, 1);
                    i5 |= 2;
                } else if (x2 == 2) {
                    num2 = (Integer) c2.v(a2, 2, IntSerializer.f42129a, num2);
                    i5 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i4;
            i3 = i5;
            str = str2;
            num = num2;
        }
        c2.b(a2);
        return new ProductConfiguration(i3, str, i2, num, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, ProductConfiguration productConfiguration) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(productConfiguration, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        ProductConfiguration.a(productConfiguration, c2, a2);
        c2.b(a2);
    }
}
