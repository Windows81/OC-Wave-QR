package com.hansecom.abt.data.preferences.base;

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

@Metadata
@Deprecated
public /* synthetic */ class CacheValue$$serializer<T> implements GeneratedSerializer<CacheValue<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KSerializer f33344a;
    private final SerialDescriptor descriptor;

    public CacheValue$$serializer() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.data.preferences.base.CacheValue", this, 3);
        pluginGeneratedSerialDescriptor.q("value", false);
        pluginGeneratedSerialDescriptor.q("expirationDateEpoch", true);
        pluginGeneratedSerialDescriptor.q("freshnessExpirationDateEpoch", true);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return this.descriptor;
    }

    public final KSerializer[] b() {
        return new KSerializer[]{this.f33344a};
    }

    public final KSerializer[] e() {
        LongSerializer longSerializer = LongSerializer.f42142a;
        return new KSerializer[]{this.f33344a, longSerializer, longSerializer};
    }

    /* renamed from: f */
    public final CacheValue c(Decoder decoder) {
        long j2;
        long j3;
        Object obj;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = this.descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        Object obj2 = null;
        if (c2.y()) {
            obj = c2.m(serialDescriptor, 0, this.f33344a, (Object) null);
            i2 = 7;
            j3 = c2.h(serialDescriptor, 1);
            j2 = c2.h(serialDescriptor, 2);
        } else {
            long j4 = 0;
            boolean z2 = true;
            int i3 = 0;
            long j5 = 0;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    obj2 = c2.m(serialDescriptor, 0, this.f33344a, obj2);
                    i3 |= 1;
                } else if (x2 == 1) {
                    j4 = c2.h(serialDescriptor, 1);
                    i3 |= 2;
                } else if (x2 == 2) {
                    j5 = c2.h(serialDescriptor, 2);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            obj = obj2;
            j3 = j4;
            j2 = j5;
        }
        c2.b(serialDescriptor);
        return new CacheValue(i2, obj, j3, j2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, CacheValue cacheValue) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(cacheValue, "value");
        SerialDescriptor serialDescriptor = this.descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        CacheValue.h(cacheValue, c2, serialDescriptor, this.f33344a);
        c2.b(serialDescriptor);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CacheValue$$serializer(KSerializer kSerializer) {
        this();
        Intrinsics.i(kSerializer, "typeSerial0");
        this.f33344a = kSerializer;
    }
}
