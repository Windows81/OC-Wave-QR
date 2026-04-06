package com.hansecom.mapi.infrastructure;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class BigDecimalAdapter implements KSerializer<BigDecimal> {

    /* renamed from: a  reason: collision with root package name */
    public static final BigDecimalAdapter f39140a = new BigDecimalAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39141b = SerialDescriptorsKt.c("BigDecimal", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f39141b;
    }

    /* renamed from: f */
    public BigDecimal c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return new BigDecimal(decoder.n());
    }

    /* renamed from: g */
    public void d(Encoder encoder, BigDecimal bigDecimal) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(bigDecimal, "value");
        String plainString = bigDecimal.toPlainString();
        Intrinsics.h(plainString, "toPlainString(...)");
        encoder.G(plainString);
    }
}
