package kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata
public final class TrieNodeKt {
    public static final int e(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static final Object[] f(Object[] objArr, int i2, Object obj, Object obj2) {
        Object[] objArr2 = new Object[(objArr.length + 2)];
        ArraysKt.q(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt.l(objArr, objArr2, i2 + 2, i2, objArr.length);
        objArr2[i2] = obj;
        objArr2[i2 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] g(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[(objArr.length - 2)];
        ArraysKt.q(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt.l(objArr, objArr2, i2, i2 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] h(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        ArraysKt.q(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt.l(objArr, objArr2, i2, i2 + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] i(Object[] objArr, int i2, int i3, TrieNode trieNode) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        ArraysKt.q(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt.l(objArr, objArr2, i2, i2 + 2, i3);
        objArr2[i3 - 2] = trieNode;
        ArraysKt.l(objArr, objArr2, i3 - 1, i3, objArr.length);
        return objArr2;
    }
}
