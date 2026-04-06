package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class ULongSerializer implements KSerializer<ULong> {

    /* renamed from: a  reason: collision with root package name */
    public static final ULongSerializer f42220a = new ULongSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42221b = InlineClassDescriptorKt.a("kotlin.ULong", BuiltinSerializersKt.G(LongCompanionObject.f40898a));

    public SerialDescriptor a() {
        return f42221b;
    }

    public /* bridge */ /* synthetic */ Object c(Decoder decoder) {
        return ULong.d(f(decoder));
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((ULong) obj).m());
    }

    public long f(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return ULong.f(decoder.z(a()).r());
    }

    public void g(Encoder encoder, long j2) {
        Intrinsics.i(encoder, "encoder");
        encoder.z(a()).D(j2);
    }
}
