package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata
public final class TrieNodeKt {
    public static final Object[] c(Object[] objArr, int i2, Object obj) {
        Object[] objArr2 = new Object[(objArr.length + 1)];
        ArraysKt.q(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt.l(objArr, objArr2, i2 + 1, i2, objArr.length);
        objArr2[i2] = obj;
        return objArr2;
    }

    public static final int d(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static final Object[] e(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        ArraysKt.q(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt.l(objArr, objArr2, i2, i2 + 1, objArr.length);
        return objArr2;
    }
}
