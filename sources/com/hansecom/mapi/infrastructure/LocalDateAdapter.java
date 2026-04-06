package com.hansecom.mapi.infrastructure;

import java.time.LocalDate;
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
public final class LocalDateAdapter implements KSerializer<LocalDate> {

    /* renamed from: a  reason: collision with root package name */
    public static final LocalDateAdapter f39145a = new LocalDateAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39146b = SerialDescriptorsKt.c("LocalDate", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f39146b;
    }

    /* renamed from: f */
    public LocalDate c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        LocalDate parse = LocalDate.parse(decoder.n(), DateTimeFormatter.ISO_LOCAL_DATE);
        Intrinsics.h(parse, "parse(...)");
        return parse;
    }

    /* renamed from: g */
    public void d(Encoder encoder, LocalDate localDate) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(localDate, "value");
        String format = DateTimeFormatter.ISO_LOCAL_DATE.format(localDate);
        Intrinsics.h(format, "format(...)");
        encoder.G(format);
    }
}
