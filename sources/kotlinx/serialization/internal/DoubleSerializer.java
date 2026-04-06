package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class DoubleSerializer implements KSerializer<Double> {

    /* renamed from: a  reason: collision with root package name */
    public static final DoubleSerializer f42102a = new DoubleSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42103b = new PrimitiveSerialDescriptor("kotlin.Double", PrimitiveKind.DOUBLE.f42032a);

    public SerialDescriptor a() {
        return f42103b;
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((Number) obj).doubleValue());
    }

    /* renamed from: f */
    public Double c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return Double.valueOf(decoder.H());
    }

    public void g(Encoder encoder, double d2) {
        Intrinsics.i(encoder, "encoder");
        encoder.i(d2);
    }
}
