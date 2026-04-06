package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
class CollectionsKt__MutableCollectionsKt extends CollectionsKt__MutableCollectionsJVMKt {
    public static boolean B(Collection collection, Iterable iterable) {
        Intrinsics.i(collection, "<this>");
        Intrinsics.i(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z2 = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean C(Collection collection, Object[] objArr) {
        Intrinsics.i(collection, "<this>");
        Intrinsics.i(objArr, "elements");
        return collection.addAll(ArraysKt.d(objArr));
    }

    public static Collection D(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = CollectionsKt.M0(iterable);
        }
        return (Collection) iterable;
    }

    public static final boolean E(Iterable iterable, Function1 function1, boolean z2) {
        Iterator it = iterable.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z2) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    public static final boolean F(List list, Function1 function1, boolean z2) {
        int i2;
        if (!(list instanceof RandomAccess)) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return E(TypeIntrinsics.b(list), function1, z2);
        }
        int o2 = CollectionsKt.o(list);
        if (o2 >= 0) {
            int i3 = 0;
            i2 = 0;
            while (true) {
                Object obj = list.get(i3);
                if (((Boolean) function1.invoke(obj)).booleanValue() != z2) {
                    if (i2 != i3) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i3 == o2) {
                    break;
                }
                i3++;
            }
        } else {
            i2 = 0;
        }
        if (i2 >= list.size()) {
            return false;
        }
        int o3 = CollectionsKt.o(list);
        if (i2 > o3) {
            return true;
        }
        while (true) {
            list.remove(o3);
            if (o3 == i2) {
                return true;
            }
            o3--;
        }
    }

    public static boolean G(Iterable iterable, Function1 function1) {
        Intrinsics.i(iterable, "<this>");
        Intrinsics.i(function1, "predicate");
        return E(iterable, function1, true);
    }

    public static boolean H(List list, Function1 function1) {
        Intrinsics.i(list, "<this>");
        Intrinsics.i(function1, "predicate");
        return F(list, function1, true);
    }

    public static Object I(List list) {
        Intrinsics.i(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object J(List list) {
        Intrinsics.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object K(List list) {
        Intrinsics.i(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(CollectionsKt.o(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object L(List list) {
        Intrinsics.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(CollectionsKt.o(list));
    }

    public static final boolean M(Collection collection, Iterable iterable) {
        Intrinsics.i(collection, "<this>");
        Intrinsics.i(iterable, "elements");
        return collection.retainAll(CollectionsKt.D(iterable));
    }
}
