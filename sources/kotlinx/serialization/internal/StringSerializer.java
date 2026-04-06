package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class StringSerializer implements KSerializer<String> {

    /* renamed from: a  reason: collision with root package name */
    public static final StringSerializer f42197a = new StringSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42198b = new PrimitiveSerialDescriptor("kotlin.String", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f42198b;
    }

    /* renamed from: f */
    public String c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return decoder.n();
    }

    /* renamed from: g */
    public void d(Encoder encoder, String str) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(str, "value");
        encoder.G(str);
    }
}
