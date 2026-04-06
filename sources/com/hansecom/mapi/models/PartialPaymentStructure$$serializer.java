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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class PartialPaymentStructure$$serializer implements GeneratedSerializer<PartialPaymentStructure> {

    /* renamed from: a  reason: collision with root package name */
    public static final PartialPaymentStructure$$serializer f39522a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PartialPaymentStructure$$serializer partialPaymentStructure$$serializer = new PartialPaymentStructure$$serializer();
        f39522a = partialPaymentStructure$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.PartialPaymentStructure", partialPaymentStructure$$serializer, 4);
        pluginGeneratedSerialDescriptor.q("paymentMethodId", true);
        pluginGeneratedSerialDescriptor.q("paymentReference", true);
        pluginGeneratedSerialDescriptor.q("isStoredValuePayment", true);
        pluginGeneratedSerialDescriptor.q("amount", true);
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
        return new KSerializer[]{BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(StringSerializer.f42197a), BuiltinSerializersKt.u(BooleanSerializer.f42073a), BuiltinSerializersKt.u(intSerializer)};
    }

    /* renamed from: f */
    public PartialPaymentStructure c(Decoder decoder) {
        Integer num;
        Boolean bool;
        String str;
        Integer num2;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        Integer num3 = null;
        if (c2.y()) {
            IntSerializer intSerializer = IntSerializer.f42129a;
            num = (Integer) c2.v(a2, 3, intSerializer, (Object) null);
            i2 = 15;
            bool = (Boolean) c2.v(a2, 2, BooleanSerializer.f42073a, (Object) null);
            str = (String) c2.v(a2, 1, StringSerializer.f42197a, (Object) null);
            num2 = (Integer) c2.v(a2, 0, intSerializer, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str2 = null;
            Boolean bool2 = null;
            Integer num4 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num3 = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num3);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str2 = (String) c2.v(a2, 1, StringSerializer.f42197a, str2);
                    i3 |= 2;
                } else if (x2 == 2) {
                    bool2 = (Boolean) c2.v(a2, 2, BooleanSerializer.f42073a, bool2);
                    i3 |= 4;
                } else if (x2 == 3) {
                    num4 = (Integer) c2.v(a2, 3, IntSerializer.f42129a, num4);
                    i3 |= 8;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            num2 = num3;
            str = str2;
            bool = bool2;
            num = num4;
        }
        c2.b(a2);
        return new PartialPaymentStructure(i2, num2, str, bool, num, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, PartialPaymentStructure partialPaymentStructure) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(partialPaymentStructure, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        PartialPaymentStructure.a(partialPaymentStructure, c2, a2);
        c2.b(a2);
    }
}
