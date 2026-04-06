package com.hansecom.mapi.infrastructure;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class AtomicIntegerAdapter implements KSerializer<AtomicInteger> {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicIntegerAdapter f39136a = new AtomicIntegerAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39137b = SerialDescriptorsKt.c("AtomicInteger", PrimitiveKind.INT.f42034a);

    public SerialDescriptor a() {
        return f39137b;
    }

    /* renamed from: f */
    public AtomicInteger c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return new AtomicInteger(decoder.j());
    }

    /* renamed from: g */
    public void d(Encoder encoder, AtomicInteger atomicInteger) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(atomicInteger, "value");
        encoder.y(atomicInteger.get());
    }
}
