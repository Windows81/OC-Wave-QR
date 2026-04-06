package kotlin.collections.builders;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ListBuilderKt {
    public static final Object[] d(int i2) {
        if (i2 >= 0) {
            return new Object[i2];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final Object[] e(Object[] objArr, int i2) {
        Intrinsics.i(objArr, "<this>");
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.h(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static final void f(Object[] objArr, int i2) {
        Intrinsics.i(objArr, "<this>");
        objArr[i2] = null;
    }

    public static final void g(Object[] objArr, int i2, int i3) {
        Intrinsics.i(objArr, "<this>");
        while (i2 < i3) {
            f(objArr, i2);
            i2++;
        }
    }

    public static final boolean h(Object[] objArr, int i2, int i3, List list) {
        if (i3 != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!Intrinsics.d(objArr[i2 + i4], list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static final int i(Object[] objArr, int i2, int i3) {
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i2 + i5];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public static final String j(Object[] objArr, int i2, int i3, Collection collection) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Collection collection2 = objArr[i2 + i4];
            if (collection2 == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(collection2);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }
}
