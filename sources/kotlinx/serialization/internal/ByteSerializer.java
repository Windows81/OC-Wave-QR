package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class ByteSerializer implements KSerializer<Byte> {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteSerializer f42078a = new ByteSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42079b = new PrimitiveSerialDescriptor("kotlin.Byte", PrimitiveKind.BYTE.f42030a);

    public SerialDescriptor a() {
        return f42079b;
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((Number) obj).byteValue());
    }

    /* renamed from: f */
    public Byte c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return Byte.valueOf(decoder.D());
    }

    public void g(Encoder encoder, byte b2) {
        Intrinsics.i(encoder, "encoder");
        encoder.k(b2);
    }
}
