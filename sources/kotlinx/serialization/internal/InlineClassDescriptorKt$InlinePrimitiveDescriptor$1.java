package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;

@Metadata
public final class InlineClassDescriptorKt$InlinePrimitiveDescriptor$1 implements GeneratedSerializer<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KSerializer f42125a;

    public InlineClassDescriptorKt$InlinePrimitiveDescriptor$1(KSerializer kSerializer) {
        this.f42125a = kSerializer;
    }

    public SerialDescriptor a() {
        throw new IllegalStateException("unsupported");
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public Object c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        throw new IllegalStateException("unsupported");
    }

    public void d(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        throw new IllegalStateException("unsupported");
    }

    public KSerializer[] e() {
        return new KSerializer[]{this.f42125a};
    }
}
