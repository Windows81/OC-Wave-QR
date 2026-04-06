package kotlin.collections;

import java.lang.reflect.Array;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class ArraysKt__ArraysJVMKt {
    public static final Object[] a(Object[] objArr, int i2) {
        Intrinsics.i(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
        Intrinsics.g(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    public static final void b(int i2, int i3) {
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
        }
    }
}
