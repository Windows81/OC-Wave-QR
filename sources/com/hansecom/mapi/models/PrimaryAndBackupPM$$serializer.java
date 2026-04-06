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

@Metadata
@Deprecated
public final class PrimaryAndBackupPM$$serializer implements GeneratedSerializer<PrimaryAndBackupPM> {

    /* renamed from: a  reason: collision with root package name */
    public static final PrimaryAndBackupPM$$serializer f39553a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PrimaryAndBackupPM$$serializer primaryAndBackupPM$$serializer = new PrimaryAndBackupPM$$serializer();
        f39553a = primaryAndBackupPM$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.PrimaryAndBackupPM", primaryAndBackupPM$$serializer, 4);
        pluginGeneratedSerialDescriptor.q("primaryPaymentMethodId", true);
        pluginGeneratedSerialDescriptor.q("backupPaymentMethodId", true);
        pluginGeneratedSerialDescriptor.q("order", true);
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
        return new KSerializer[]{BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer)};
    }

    /* renamed from: f */
    public PrimaryAndBackupPM c(Decoder decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        Integer num5 = null;
        if (c2.y()) {
            IntSerializer intSerializer = IntSerializer.f42129a;
            num = (Integer) c2.v(a2, 3, intSerializer, (Object) null);
            i2 = 15;
            num2 = (Integer) c2.v(a2, 2, intSerializer, (Object) null);
            num3 = (Integer) c2.v(a2, 1, intSerializer, (Object) null);
            num4 = (Integer) c2.v(a2, 0, intSerializer, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num5 = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num5);
                    i3 |= 1;
                } else if (x2 == 1) {
                    num6 = (Integer) c2.v(a2, 1, IntSerializer.f42129a, num6);
                    i3 |= 2;
                } else if (x2 == 2) {
                    num7 = (Integer) c2.v(a2, 2, IntSerializer.f42129a, num7);
                    i3 |= 4;
                } else if (x2 == 3) {
                    num8 = (Integer) c2.v(a2, 3, IntSerializer.f42129a, num8);
                    i3 |= 8;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            num4 = num5;
            num3 = num6;
            num2 = num7;
            num = num8;
        }
        c2.b(a2);
        return new PrimaryAndBackupPM(i2, num4, num3, num2, num, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, PrimaryAndBackupPM primaryAndBackupPM) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(primaryAndBackupPM, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        PrimaryAndBackupPM.a(primaryAndBackupPM, c2, a2);
        c2.b(a2);
    }
}
