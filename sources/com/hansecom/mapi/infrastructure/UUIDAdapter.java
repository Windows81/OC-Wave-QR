package com.hansecom.mapi.infrastructure;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class UUIDAdapter implements KSerializer<UUID> {

    /* renamed from: a  reason: collision with root package name */
    public static final UUIDAdapter f39162a = new UUIDAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39163b = SerialDescriptorsKt.c("UUID", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f39163b;
    }

    /* renamed from: f */
    public UUID c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        UUID fromString = UUID.fromString(decoder.n());
        Intrinsics.h(fromString, "fromString(...)");
        return fromString;
    }

    /* renamed from: g */
    public void d(Encoder encoder, UUID uuid) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(uuid, "value");
        String uuid2 = uuid.toString();
        Intrinsics.h(uuid2, "toString(...)");
        encoder.G(uuid2);
    }
}
