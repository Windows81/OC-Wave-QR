package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class LongSerializer implements KSerializer<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static final LongSerializer f42142a = new LongSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42143b = new PrimitiveSerialDescriptor("kotlin.Long", PrimitiveKind.LONG.f42035a);

    public SerialDescriptor a() {
        return f42143b;
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((Number) obj).longValue());
    }

    /* renamed from: f */
    public Long c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return Long.valueOf(decoder.r());
    }

    public void g(Encoder encoder, long j2) {
        Intrinsics.i(encoder, "encoder");
        encoder.D(j2);
    }
}
