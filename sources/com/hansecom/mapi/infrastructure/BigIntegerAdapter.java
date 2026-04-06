package com.hansecom.mapi.infrastructure;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class BigIntegerAdapter implements KSerializer<BigInteger> {

    /* renamed from: a  reason: collision with root package name */
    public static final BigIntegerAdapter f39142a = new BigIntegerAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39143b = SerialDescriptorsKt.c("BigInteger", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f39143b;
    }

    /* renamed from: f */
    public BigInteger c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return new BigInteger(decoder.n());
    }

    /* renamed from: g */
    public void d(Encoder encoder, BigInteger bigInteger) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(bigInteger, "value");
        String bigInteger2 = bigInteger.toString();
        Intrinsics.h(bigInteger2, "toString(...)");
        encoder.G(bigInteger2);
    }
}
