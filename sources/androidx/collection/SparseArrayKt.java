package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SparseArrayKt {
    public static final IntIterator a(SparseArrayCompat sparseArrayCompat) {
        Intrinsics.i(sparseArrayCompat, "<this>");
        return new SparseArrayKt$keyIterator$1(sparseArrayCompat);
    }

    public static final Iterator b(SparseArrayCompat sparseArrayCompat) {
        Intrinsics.i(sparseArrayCompat, "<this>");
        return new SparseArrayKt$valueIterator$1(sparseArrayCompat);
    }
}
