package com.hansecom.mapi.infrastructure;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class AtomicLongAdapter implements KSerializer<AtomicLong> {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicLongAdapter f39138a = new AtomicLongAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39139b = SerialDescriptorsKt.c("AtomicLong", PrimitiveKind.LONG.f42035a);

    public SerialDescriptor a() {
        return f39139b;
    }

    /* renamed from: f */
    public AtomicLong c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return new AtomicLong(decoder.r());
    }

    /* renamed from: g */
    public void d(Encoder encoder, AtomicLong atomicLong) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(atomicLong, "value");
        encoder.D(atomicLong.get());
    }
}
