package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ClassValueReferences<T> extends ClassValue<MutableSoftReference<T>> {
    /* renamed from: a */
    public MutableSoftReference computeValue(Class cls) {
        Intrinsics.i(cls, "type");
        return new MutableSoftReference();
    }
}
