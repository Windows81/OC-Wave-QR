package com.hansecom.mapi.infrastructure;

import java.time.LocalDateTime;
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
public final class LocalDateTimeAdapter implements KSerializer<LocalDateTime> {

    /* renamed from: a  reason: collision with root package name */
    public static final LocalDateTimeAdapter f39147a = new LocalDateTimeAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39148b = SerialDescriptorsKt.c("LocalDateTime", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f39148b;
    }

    /* renamed from: f */
    public LocalDateTime c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        LocalDateTime parse = LocalDateTime.parse(decoder.n(), DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        Intrinsics.h(parse, "parse(...)");
        return parse;
    }

    /* renamed from: g */
    public void d(Encoder encoder, LocalDateTime localDateTime) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(localDateTime, "value");
        String format = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(localDateTime);
        Intrinsics.h(format, "format(...)");
        encoder.G(format);
    }
}
