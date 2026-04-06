package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class ShortSerializer implements KSerializer<Short> {

    /* renamed from: a  reason: collision with root package name */
    public static final ShortSerializer f42195a = new ShortSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42196b = new PrimitiveSerialDescriptor("kotlin.Short", PrimitiveKind.SHORT.f42036a);

    public SerialDescriptor a() {
        return f42196b;
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((Number) obj).shortValue());
    }

    /* renamed from: f */
    public Short c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return Short.valueOf(decoder.E());
    }

    public void g(Encoder encoder, short s2) {
        Intrinsics.i(encoder, "encoder");
        encoder.j(s2);
    }
}
