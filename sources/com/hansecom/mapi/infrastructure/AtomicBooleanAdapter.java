package com.hansecom.mapi.infrastructure;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class AtomicBooleanAdapter implements KSerializer<AtomicBoolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBooleanAdapter f39134a = new AtomicBooleanAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39135b = SerialDescriptorsKt.c("AtomicBoolean", PrimitiveKind.BOOLEAN.f42029a);

    public SerialDescriptor a() {
        return f39135b;
    }

    /* renamed from: f */
    public AtomicBoolean c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return new AtomicBoolean(decoder.e());
    }

    /* renamed from: g */
    public void d(Encoder encoder, AtomicBoolean atomicBoolean) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(atomicBoolean, "value");
        encoder.l(atomicBoolean.get());
    }
}
