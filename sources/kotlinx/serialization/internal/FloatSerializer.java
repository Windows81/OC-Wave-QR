package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class FloatSerializer implements KSerializer<Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final FloatSerializer f42120a = new FloatSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42121b = new PrimitiveSerialDescriptor("kotlin.Float", PrimitiveKind.FLOAT.f42033a);

    public SerialDescriptor a() {
        return f42121b;
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((Number) obj).floatValue());
    }

    /* renamed from: f */
    public Float c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return Float.valueOf(decoder.F());
    }

    public void g(Encoder encoder, float f2) {
        Intrinsics.i(encoder, "encoder");
        encoder.o(f2);
    }
}
