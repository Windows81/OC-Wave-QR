package androidx.compose.runtime.collection;

import java.util.List;
import kotlin.Metadata;

@Metadata
public final class MutableVectorKt {
    public static final void a(List list, int i2) {
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            c(i2, size);
        }
    }

    public static final void b(List list, int i2, int i3) {
        if (i2 > i3) {
            f(i2, i3);
        }
        if (i2 < 0) {
            d(i2);
        }
        if (i3 > list.size()) {
            e(i3, list.size());
        }
    }

    private static final void c(int i2, int i3) {
        throw new IndexOutOfBoundsException("Index " + i2 + " is out of bounds. The list has " + i3 + " elements.");
    }

    private static final void d(int i2) {
        throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than 0.");
    }

    private static final void e(int i2, int i3) {
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + i3 + ')');
    }

    private static final void f(int i2, int i3) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
    }
}
