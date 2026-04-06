package kotlinx.serialization.builtins;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class LongAsStringSerializer implements KSerializer<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static final LongAsStringSerializer f42014a = new LongAsStringSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42015b = SerialDescriptorsKt.c("kotlinx.serialization.LongAsStringSerializer", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f42015b;
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((Number) obj).longValue());
    }

    /* renamed from: f */
    public Long c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return Long.valueOf(Long.parseLong(decoder.n()));
    }

    public void g(Encoder encoder, long j2) {
        Intrinsics.i(encoder, "encoder");
        encoder.G(String.valueOf(j2));
    }
}
