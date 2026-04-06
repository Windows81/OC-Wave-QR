package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class DurationSerializer implements KSerializer<Duration> {

    /* renamed from: a  reason: collision with root package name */
    public static final DurationSerializer f42104a = new DurationSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42105b = new PrimitiveSerialDescriptor("kotlin.time.Duration", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f42105b;
    }

    public /* bridge */ /* synthetic */ Object c(Decoder decoder) {
        return Duration.l(f(decoder));
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((Duration) obj).a0());
    }

    public long f(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return Duration.f41206A.d(decoder.n());
    }

    public void g(Encoder encoder, long j2) {
        Intrinsics.i(encoder, "encoder");
        encoder.G(Duration.W(j2));
    }
}
