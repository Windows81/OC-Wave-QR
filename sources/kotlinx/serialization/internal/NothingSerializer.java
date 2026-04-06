package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class NothingSerializer implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final NothingSerializer f42159a = new NothingSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42160b = NothingSerialDescriptor.f42156a;

    public SerialDescriptor a() {
        return f42160b;
    }

    /* renamed from: f */
    public Void c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    /* renamed from: g */
    public void d(Encoder encoder, Void voidR) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(voidR, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
