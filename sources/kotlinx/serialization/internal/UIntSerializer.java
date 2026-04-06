package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class UIntSerializer implements KSerializer<UInt> {

    /* renamed from: a  reason: collision with root package name */
    public static final UIntSerializer f42215a = new UIntSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42216b = InlineClassDescriptorKt.a("kotlin.UInt", BuiltinSerializersKt.F(IntCompanionObject.f40897a));

    public SerialDescriptor a() {
        return f42216b;
    }

    public /* bridge */ /* synthetic */ Object c(Decoder decoder) {
        return UInt.d(f(decoder));
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((UInt) obj).l());
    }

    public int f(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return UInt.f(decoder.z(a()).j());
    }

    public void g(Encoder encoder, int i2) {
        Intrinsics.i(encoder, "encoder");
        encoder.z(a()).y(i2);
    }
}
