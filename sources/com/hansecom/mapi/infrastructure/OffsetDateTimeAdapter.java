package com.hansecom.mapi.infrastructure;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class OffsetDateTimeAdapter implements KSerializer<OffsetDateTime> {

    /* renamed from: a  reason: collision with root package name */
    public static final OffsetDateTimeAdapter f39149a = new OffsetDateTimeAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39150b = SerialDescriptorsKt.c("OffsetDateTime", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f39150b;
    }

    /* renamed from: f */
    public OffsetDateTime c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        OffsetDateTime parse = OffsetDateTime.parse(decoder.n(), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        Intrinsics.h(parse, "parse(...)");
        return parse;
    }

    /* renamed from: g */
    public void d(Encoder encoder, OffsetDateTime offsetDateTime) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(offsetDateTime, "value");
        String format = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(offsetDateTime);
        Intrinsics.h(format, "format(...)");
        encoder.G(format);
    }
}
