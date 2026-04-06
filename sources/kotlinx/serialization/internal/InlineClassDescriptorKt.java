package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class InlineClassDescriptorKt {
    public static final SerialDescriptor a(String str, KSerializer kSerializer) {
        Intrinsics.i(str, "name");
        Intrinsics.i(kSerializer, "primitiveSerializer");
        return new InlineClassDescriptor(str, new InlineClassDescriptorKt$InlinePrimitiveDescriptor$1(kSerializer));
    }
}
