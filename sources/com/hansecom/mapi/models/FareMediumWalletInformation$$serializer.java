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

@Metadata
@Deprecated
public final class FareMediumWalletInformation$$serializer implements GeneratedSerializer<FareMediumWalletInformation> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareMediumWalletInformation$$serializer f39431a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareMediumWalletInformation$$serializer fareMediumWalletInformation$$serializer = new FareMediumWalletInformation$$serializer();
        f39431a = fareMediumWalletInformation$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareMediumWalletInformation", fareMediumWalletInformation$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("availableReplacements", true);
        pluginGeneratedSerialDescriptor.q("isProvisioned", true);
        pluginGeneratedSerialDescriptor.q("onCurrentDevice", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer u2 = BuiltinSerializersKt.u(IntSerializer.f42129a);
        BooleanSerializer booleanSerializer = BooleanSerializer.f42073a;
        return new KSerializer[]{u2, BuiltinSerializersKt.u(booleanSerializer), BuiltinSerializersKt.u(booleanSerializer)};
    }

    /* renamed from: f */
    public FareMediumWalletInformation c(Decoder decoder) {
        Boolean bool;
        Boolean bool2;
        Integer num;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        Integer num2 = null;
        if (c2.y()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.f42073a;
            num = (Integer) c2.v(a2, 0, IntSerializer.f42129a, (Object) null);
            bool = (Boolean) c2.v(a2, 2, booleanSerializer, (Object) null);
            bool2 = (Boolean) c2.v(a2, 1, booleanSerializer, (Object) null);
            i2 = 7;
        } else {
            boolean z2 = true;
            int i3 = 0;
            Boolean bool3 = null;
            Boolean bool4 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num2 = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num2);
                    i3 |= 1;
                } else if (x2 == 1) {
                    bool3 = (Boolean) c2.v(a2, 1, BooleanSerializer.f42073a, bool3);
                    i3 |= 2;
                } else if (x2 == 2) {
                    bool4 = (Boolean) c2.v(a2, 2, BooleanSerializer.f42073a, bool4);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            num = num2;
            bool2 = bool3;
            bool = bool4;
        }
        c2.b(a2);
        return new FareMediumWalletInformation(i2, num, bool2, bool, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareMediumWalletInformation fareMediumWalletInformation) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareMediumWalletInformation, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareMediumWalletInformation.b(fareMediumWalletInformation, c2, a2);
        c2.b(a2);
    }
}
