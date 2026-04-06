package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class UShortSerializer implements KSerializer<UShort> {

    /* renamed from: a  reason: collision with root package name */
    public static final UShortSerializer f42225a = new UShortSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42226b = InlineClassDescriptorKt.a("kotlin.UShort", BuiltinSerializersKt.H(ShortCompanionObject.f40912a));

    public SerialDescriptor a() {
        return f42226b;
    }

    public /* bridge */ /* synthetic */ Object c(Decoder decoder) {
        return UShort.d(f(decoder));
    }

    public /* bridge */ /* synthetic */ void d(Encoder encoder, Object obj) {
        g(encoder, ((UShort) obj).l());
    }

    public short f(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return UShort.f(decoder.z(a()).E());
    }

    public void g(Encoder encoder, short s2) {
        Intrinsics.i(encoder, "encoder");
        encoder.z(a()).j(s2);
    }
}
