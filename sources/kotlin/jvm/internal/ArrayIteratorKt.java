package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata
public final class ArrayIteratorKt {
    public static final Iterator a(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return new ArrayIterator(objArr);
    }
}
