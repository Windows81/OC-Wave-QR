package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import kotlin.Metadata;

@Metadata
public final class UtilsKt {
    public static final int a(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static final PersistentList b() {
        return SmallPersistentVector.f15037B.a();
    }

    public static final Object[] c(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i2) {
        return (i2 - 1) & -32;
    }
}
