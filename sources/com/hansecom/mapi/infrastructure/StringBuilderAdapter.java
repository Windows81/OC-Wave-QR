package com.hansecom.mapi.infrastructure;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class StringBuilderAdapter implements KSerializer<StringBuilder> {

    /* renamed from: a  reason: collision with root package name */
    public static final StringBuilderAdapter f39156a = new StringBuilderAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39157b = SerialDescriptorsKt.c("StringBuilder", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f39157b;
    }

    /* renamed from: f */
    public StringBuilder c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return new StringBuilder(decoder.n());
    }

    /* renamed from: g */
    public void d(Encoder encoder, StringBuilder sb) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(sb, "value");
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        encoder.G(sb2);
    }
}
