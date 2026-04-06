package com.hansecom.abt.util.resourcesResolvers;

import com.hansecom.abt.util.resourcesResolvers.StringValue;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Deprecated
public /* synthetic */ class StringValue$ResourceId$$serializer implements GeneratedSerializer<StringValue.ResourceId> {

    /* renamed from: a  reason: collision with root package name */
    public static final StringValue$ResourceId$$serializer f39090a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f39091b = 8;
    private static final SerialDescriptor descriptor;

    static {
        StringValue$ResourceId$$serializer stringValue$ResourceId$$serializer = new StringValue$ResourceId$$serializer();
        f39090a = stringValue$ResourceId$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.util.resourcesResolvers.StringValue.ResourceId", stringValue$ResourceId$$serializer, 1);
        pluginGeneratedSerialDescriptor.q("key", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        return new KSerializer[]{IntSerializer.f42129a};
    }

    /* renamed from: f */
    public final StringValue.ResourceId c(Decoder decoder) {
        int i2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder.c(serialDescriptor);
        int i3 = 1;
        if (c2.y()) {
            i2 = c2.k(serialDescriptor, 0);
        } else {
            boolean z2 = true;
            i2 = 0;
            int i4 = 0;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    i2 = c2.k(serialDescriptor, 0);
                    i4 = 1;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i3 = i4;
        }
        c2.b(serialDescriptor);
        return new StringValue.ResourceId(i3, i2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, StringValue.ResourceId resourceId) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(resourceId, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        c2.r(serialDescriptor, 0, resourceId.f39096A);
        c2.b(serialDescriptor);
    }
}
