package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

@Metadata
class CollectionsKt___CollectionsKt extends CollectionsKt___CollectionsJvmKt {
    public static Object A0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        if (iterable instanceof List) {
            return CollectionsKt.B0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object B0(List list) {
        Intrinsics.i(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static Object C0(List list) {
        Intrinsics.i(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List D0(Iterable iterable, Comparator comparator) {
        Intrinsics.i(iterable, "<this>");
        Intrinsics.i(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return CollectionsKt.M0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            ArraysKt___ArraysJvmKt.K(array, comparator);
            return ArraysKt.d(array);
        }
        List O0 = O0(iterable);
        CollectionsKt.A(O0, comparator);
        return O0;
    }

    public static List E0(Iterable iterable, int i2) {
        Intrinsics.i(iterable, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        } else if (i2 == 0) {
            return CollectionsKt.m();
        } else {
            if (iterable instanceof Collection) {
                if (i2 >= ((Collection) iterable).size()) {
                    return CollectionsKt.M0(iterable);
                }
                if (i2 == 1) {
                    return CollectionsKt.e(CollectionsKt.d0(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            for (Object add : iterable) {
                arrayList.add(add);
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return CollectionsKt__CollectionsKt.t(arrayList);
        }
    }

    public static List F0(List list, int i2) {
        Intrinsics.i(list, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        } else if (i2 == 0) {
            return CollectionsKt.m();
        } else {
            int size = list.size();
            if (i2 >= size) {
                return CollectionsKt.M0(list);
            }
            if (i2 == 1) {
                return CollectionsKt.e(CollectionsKt.p0(list));
            }
            ArrayList arrayList = new ArrayList(i2);
            if (list instanceof RandomAccess) {
                for (int i3 = size - i2; i3 < size; i3++) {
                    arrayList.add(list.get(i3));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i2);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    public static boolean[] G0(Collection collection) {
        Intrinsics.i(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        return zArr;
    }

    public static Collection H0(Iterable iterable, Collection collection) {
        Intrinsics.i(iterable, "<this>");
        Intrinsics.i(collection, "destination");
        for (Object add : iterable) {
            collection.add(add);
        }
        return collection;
    }

    public static double[] I0(Collection collection) {
        Intrinsics.i(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            dArr[i2] = ((Number) it.next()).doubleValue();
            i2++;
        }
        return dArr;
    }

    public static float[] J0(Collection collection) {
        Intrinsics.i(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fArr[i2] = ((Number) it.next()).floatValue();
            i2++;
        }
        return fArr;
    }

    public static HashSet K0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        return (HashSet) CollectionsKt.H0(iterable, new HashSet(MapsKt.e(CollectionsKt.x(iterable, 12))));
    }

    public static int[] L0(Collection collection) {
        Intrinsics.i(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static List M0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return CollectionsKt__CollectionsKt.t(O0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return CollectionsKt.m();
        }
        if (size != 1) {
            return CollectionsKt.P0(collection);
        }
        return CollectionsKt.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] N0(Collection collection) {
        Intrinsics.i(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Number) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public static final List O0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        return iterable instanceof Collection ? CollectionsKt.P0((Collection) iterable) : (List) CollectionsKt.H0(iterable, new ArrayList());
    }

    public static List P0(Collection collection) {
        Intrinsics.i(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final Set Q0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) CollectionsKt.H0(iterable, new LinkedHashSet());
    }

    public static Set R0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return SetsKt__SetsKt.e((Set) CollectionsKt.H0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return SetsKt.d();
        }
        if (size != 1) {
            return (Set) CollectionsKt.H0(iterable, new LinkedHashSet(MapsKt.e(collection.size())));
        }
        return SetsKt.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List S0(Iterable iterable, Iterable iterable2) {
        Intrinsics.i(iterable, "<this>");
        Intrinsics.i(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.x(iterable, 10), CollectionsKt.x(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(TuplesKt.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Sequence V(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        return new CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1(iterable);
    }

    public static boolean W(Iterable iterable, Object obj) {
        Intrinsics.i(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : CollectionsKt.i0(iterable, obj) >= 0;
    }

    public static int X(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                CollectionsKt.v();
            }
        }
        return i2;
    }

    public static List Y(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        return CollectionsKt.M0(Q0(iterable));
    }

    public static List Z(Iterable iterable, int i2) {
        ArrayList arrayList;
        Intrinsics.i(iterable, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        } else if (i2 == 0) {
            return CollectionsKt.M0(iterable);
        } else {
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size() - i2;
                if (size <= 0) {
                    return CollectionsKt.m();
                }
                if (size == 1) {
                    return CollectionsKt.e(o0(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        List list = (List) iterable;
                        int size2 = list.size();
                        while (i2 < size2) {
                            arrayList.add(list.get(i2));
                            i2++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i2);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i3 = 0;
            for (Object next : iterable) {
                if (i3 >= i2) {
                    arrayList.add(next);
                } else {
                    i3++;
                }
            }
            return CollectionsKt__CollectionsKt.t(arrayList);
        }
    }

    public static List a0(List list, int i2) {
        Intrinsics.i(list, "<this>");
        if (i2 >= 0) {
            return CollectionsKt.E0(list, RangesKt.e(list.size() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static List b0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        return (List) c0(iterable, new ArrayList());
    }

    public static final Collection c0(Iterable iterable, Collection collection) {
        Intrinsics.i(iterable, "<this>");
        Intrinsics.i(collection, "destination");
        for (Object next : iterable) {
            if (next != null) {
                collection.add(next);
            }
        }
        return collection;
    }

    public static Object d0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        if (iterable instanceof List) {
            return CollectionsKt.e0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object e0(List list) {
        Intrinsics.i(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object f0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object g0(List list) {
        Intrinsics.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object h0(List list, int i2) {
        Intrinsics.i(list, "<this>");
        if (i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return list.get(i2);
    }

    public static int i0(Iterable iterable, Object obj) {
        Intrinsics.i(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i2 = 0;
        for (Object next : iterable) {
            if (i2 < 0) {
                CollectionsKt.w();
            }
            if (Intrinsics.d(obj, next)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static Set j0(Iterable iterable, Iterable iterable2) {
        Intrinsics.i(iterable, "<this>");
        Intrinsics.i(iterable2, "other");
        Set Q0 = Q0(iterable);
        CollectionsKt__MutableCollectionsKt.M(Q0, iterable2);
        return Q0;
    }

    public static final Appendable k0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1) {
        Intrinsics.i(iterable, "<this>");
        Intrinsics.i(appendable, "buffer");
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i3 = 0;
        for (Object next : iterable) {
            i3++;
            if (i3 > 1) {
                appendable.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            StringsKt.a(appendable, next, function1);
        }
        if (i2 >= 0 && i3 > i2) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static /* synthetic */ Appendable l0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        String str = (i3 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i3 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i3 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return k0(iterable, appendable, str, charSequence6, charSequence5, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? "..." : charSequence4, (i3 & 64) != 0 ? null : function1);
    }

    public static final String m0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1) {
        Intrinsics.i(iterable, "<this>");
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        return ((StringBuilder) k0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String n0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i3 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i3 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return m0(iterable, charSequence, charSequence6, charSequence5, i4, charSequence7, function1);
    }

    public static final Object o0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        if (iterable instanceof List) {
            return CollectionsKt.p0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object p0(List list) {
        Intrinsics.i(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(CollectionsKt.o(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object q0(List list) {
        Intrinsics.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable r0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float s0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Comparable t0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float u0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Object v0(Iterable iterable, Comparator comparator) {
        Intrinsics.i(iterable, "<this>");
        Intrinsics.i(comparator, "comparator");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static List w0(Iterable iterable, Object obj) {
        Intrinsics.i(iterable, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        boolean z2 = false;
        for (Object next : iterable) {
            boolean z3 = true;
            if (!z2 && Intrinsics.d(next, obj)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static List x0(Collection collection, Iterable iterable) {
        Intrinsics.i(collection, "<this>");
        Intrinsics.i(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        CollectionsKt.B(arrayList2, iterable);
        return arrayList2;
    }

    public static List y0(Collection collection, Object obj) {
        Intrinsics.i(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List z0(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return CollectionsKt.M0(iterable);
        }
        List O0 = O0(iterable);
        CollectionsKt.U(O0);
        return O0;
    }
}
