package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class UByteSerializer implements KSerializer<UByte> {

    /* renamed from: a  reason: collision with root package name */
    public static final UByteSerializer f42210a = new UByteSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42211b = InlineClassDescriptorKt.a("kotlin.UByte", BuiltinSerializersKt.B(ByteCompanionObject.f40884a));

    public SerialDescriptor a() {
        return f42211b;
    }

    public /* bridge */ /* synthetic */ Object c(Decoder decoder) {
        return UByte.d(f(decoder));
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((UByte) obj).l());
    }

    public byte f(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return UByte.f(decoder.z(a()).D());
    }

    public void g(Encoder encoder, byte b2) {
        Intrinsics.i(encoder, "encoder");
        encoder.z(a()).k(b2);
    }
}
