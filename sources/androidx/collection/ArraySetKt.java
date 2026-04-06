package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ArraySetKt {
    public static final void a(ArraySet arraySet, int i2) {
        Intrinsics.i(arraySet, "<this>");
        arraySet.p(new int[i2]);
        arraySet.o(new Object[i2]);
    }

    public static final int b(ArraySet arraySet, int i2) {
        Intrinsics.i(arraySet, "<this>");
        try {
            return ContainerHelpersKt.a(arraySet.h(), arraySet.m(), i2);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(ArraySet arraySet, Object obj, int i2) {
        Intrinsics.i(arraySet, "<this>");
        int m2 = arraySet.m();
        if (m2 == 0) {
            return -1;
        }
        int b2 = b(arraySet, i2);
        if (b2 < 0 || Intrinsics.d(obj, arraySet.g()[b2])) {
            return b2;
        }
        int i3 = b2 + 1;
        while (i3 < m2 && arraySet.h()[i3] == i2) {
            if (Intrinsics.d(obj, arraySet.g()[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = b2 - 1;
        while (i4 >= 0 && arraySet.h()[i4] == i2) {
            if (Intrinsics.d(obj, arraySet.g()[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public static final int d(ArraySet arraySet) {
        Intrinsics.i(arraySet, "<this>");
        return c(arraySet, (Object) null, 0);
    }
}
