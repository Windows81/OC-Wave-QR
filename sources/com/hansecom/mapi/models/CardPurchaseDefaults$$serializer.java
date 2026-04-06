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
public final class CardPurchaseDefaults$$serializer implements GeneratedSerializer<CardPurchaseDefaults> {

    /* renamed from: a  reason: collision with root package name */
    public static final CardPurchaseDefaults$$serializer f39245a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CardPurchaseDefaults$$serializer cardPurchaseDefaults$$serializer = new CardPurchaseDefaults$$serializer();
        f39245a = cardPurchaseDefaults$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.CardPurchaseDefaults", cardPurchaseDefaults$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("riderTypeId", true);
        pluginGeneratedSerialDescriptor.q("topUpAmounts", true);
        pluginGeneratedSerialDescriptor.q("topUpValue", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = CardPurchaseDefaults.f39241d;
        IntSerializer intSerializer = IntSerializer.f42129a;
        return new KSerializer[]{BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(a2[1]), BuiltinSerializersKt.u(intSerializer)};
    }

    /* renamed from: f */
    public CardPurchaseDefaults c(Decoder decoder) {
        Integer num;
        List list;
        Integer num2;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        KSerializer[] a3 = CardPurchaseDefaults.f39241d;
        Integer num3 = null;
        if (c2.y()) {
            IntSerializer intSerializer = IntSerializer.f42129a;
            list = (List) c2.v(a2, 1, a3[1], (Object) null);
            num = (Integer) c2.v(a2, 2, intSerializer, (Object) null);
            i2 = 7;
            num2 = (Integer) c2.v(a2, 0, intSerializer, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            List list2 = null;
            Integer num4 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num3 = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num3);
                    i3 |= 1;
                } else if (x2 == 1) {
                    list2 = (List) c2.v(a2, 1, a3[1], list2);
                    i3 |= 2;
                } else if (x2 == 2) {
                    num4 = (Integer) c2.v(a2, 2, IntSerializer.f42129a, num4);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            num2 = num3;
            list = list2;
            num = num4;
        }
        c2.b(a2);
        return new CardPurchaseDefaults(i2, num2, list, num, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, CardPurchaseDefaults cardPurchaseDefaults) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(cardPurchaseDefaults, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        CardPurchaseDefaults.e(cardPurchaseDefaults, c2, a2);
        c2.b(a2);
    }
}
