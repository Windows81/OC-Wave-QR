package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class UuidSerializer implements KSerializer<Uuid> {

    /* renamed from: a  reason: collision with root package name */
    public static final UuidSerializer f42229a = new UuidSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42230b = new PrimitiveSerialDescriptor("kotlin.uuid.Uuid", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f42230b;
    }

    /* renamed from: f */
    public Uuid c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return Uuid.f41225B.c(decoder.n());
    }

    /* renamed from: g */
    public void d(Encoder encoder, Uuid uuid) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(uuid, "value");
        encoder.G(uuid.toString());
    }
}
