package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class BooleanSerializer implements KSerializer<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final BooleanSerializer f42073a = new BooleanSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42074b = new PrimitiveSerialDescriptor("kotlin.Boolean", PrimitiveKind.BOOLEAN.f42029a);

    public SerialDescriptor a() {
        return f42074b;
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((Boolean) obj).booleanValue());
    }

    /* renamed from: f */
    public Boolean c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return Boolean.valueOf(decoder.e());
    }

    public void g(Encoder encoder, boolean z2) {
        Intrinsics.i(encoder, "encoder");
        encoder.l(z2);
    }
}
