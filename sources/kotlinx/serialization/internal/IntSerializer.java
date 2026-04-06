package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class IntSerializer implements KSerializer<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final IntSerializer f42129a = new IntSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42130b = new PrimitiveSerialDescriptor("kotlin.Int", PrimitiveKind.INT.f42034a);

    public SerialDescriptor a() {
        return f42130b;
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((Number) obj).intValue());
    }

    /* renamed from: f */
    public Integer c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return Integer.valueOf(decoder.j());
    }

    public void g(Encoder encoder, int i2) {
        Intrinsics.i(encoder, "encoder");
        encoder.y(i2);
    }
}
