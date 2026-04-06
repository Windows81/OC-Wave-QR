package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class NullableSerializer<T> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f42161a;

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f42162b;

    public NullableSerializer(KSerializer kSerializer) {
        Intrinsics.i(kSerializer, "serializer");
        this.f42161a = kSerializer;
        this.f42162b = new SerialDescriptorForNullable(kSerializer.a());
    }

    public SerialDescriptor a() {
        return this.f42162b;
    }

    public Object c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return decoder.u() ? decoder.C(this.f42161a) : decoder.l();
    }

    public void d(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        if (obj != null) {
            encoder.q();
            encoder.e(this.f42161a, obj);
            return;
        }
        encoder.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && NullableSerializer.class == obj.getClass() && Intrinsics.d(this.f42161a, ((NullableSerializer) obj).f42161a);
    }

    public int hashCode() {
        return this.f42161a.hashCode();
    }
}
