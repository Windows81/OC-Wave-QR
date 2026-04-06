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
public final class GroupConstraints$$serializer implements GeneratedSerializer<GroupConstraints> {

    /* renamed from: a  reason: collision with root package name */
    public static final GroupConstraints$$serializer f39466a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GroupConstraints$$serializer groupConstraints$$serializer = new GroupConstraints$$serializer();
        f39466a = groupConstraints$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.GroupConstraints", groupConstraints$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("maxGroupSize", true);
        pluginGeneratedSerialDescriptor.q("minGroupSize", true);
        pluginGeneratedSerialDescriptor.q("isGroupPass", true);
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
        return new KSerializer[]{BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(BooleanSerializer.f42073a)};
    }

    /* renamed from: f */
    public GroupConstraints c(Decoder decoder) {
        Boolean bool;
        Integer num;
        Integer num2;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        Integer num3 = null;
        if (c2.y()) {
            IntSerializer intSerializer = IntSerializer.f42129a;
            num = (Integer) c2.v(a2, 1, intSerializer, (Object) null);
            bool = (Boolean) c2.v(a2, 2, BooleanSerializer.f42073a, (Object) null);
            i2 = 7;
            num2 = (Integer) c2.v(a2, 0, intSerializer, (Object) null);
        } else {
            boolean z2 = true;
            int i3 = 0;
            Integer num4 = null;
            Boolean bool2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num3 = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num3);
                    i3 |= 1;
                } else if (x2 == 1) {
                    num4 = (Integer) c2.v(a2, 1, IntSerializer.f42129a, num4);
                    i3 |= 2;
                } else if (x2 == 2) {
                    bool2 = (Boolean) c2.v(a2, 2, BooleanSerializer.f42073a, bool2);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            num2 = num3;
            num = num4;
            bool = bool2;
        }
        c2.b(a2);
        return new GroupConstraints(i2, num2, num, bool, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, GroupConstraints groupConstraints) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(groupConstraints, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        GroupConstraints.d(groupConstraints, c2, a2);
        c2.b(a2);
    }
}
