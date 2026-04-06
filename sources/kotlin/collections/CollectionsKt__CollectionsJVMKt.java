package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class CollectionsKt__CollectionsJVMKt {
    public static List a(List list) {
        Intrinsics.i(list, "builder");
        return ((ListBuilder) list).z();
    }

    public static final Object[] b(Object[] objArr, boolean z2) {
        Intrinsics.i(objArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (z2 && Intrinsics.d(objArr.getClass(), cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        Intrinsics.h(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static List c() {
        return new ListBuilder(0, 1, (DefaultConstructorMarker) null);
    }

    public static List d(int i2) {
        return new ListBuilder(i2);
    }

    public static List e(Object obj) {
        List singletonList = Collections.singletonList(obj);
        Intrinsics.h(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static Object[] f(int i2, Object[] objArr) {
        Intrinsics.i(objArr, "array");
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
