package kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class UtilsKt {
    public static final int a(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static final PersistentList b() {
        return SmallPersistentVector.f41256B.a();
    }

    public static final int c(int i2) {
        return (i2 - 1) & -32;
    }
}
