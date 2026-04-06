package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class CharSerializer implements KSerializer<Character> {

    /* renamed from: a  reason: collision with root package name */
    public static final CharSerializer f42085a = new CharSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42086b = new PrimitiveSerialDescriptor("kotlin.Char", PrimitiveKind.CHAR.f42031a);

    public SerialDescriptor a() {
        return f42086b;
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((Character) obj).charValue());
    }

    /* renamed from: f */
    public Character c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return Character.valueOf(decoder.f());
    }

    public void g(Encoder encoder, char c2) {
        Intrinsics.i(encoder, "encoder");
        encoder.p(c2);
    }
}
