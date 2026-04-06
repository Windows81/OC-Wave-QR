package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
public final class ArraySet<E> implements Collection<E>, Set<E>, KMutableCollection, KMutableSet {

    /* renamed from: A  reason: collision with root package name */
    public Object[] f1723A;

    /* renamed from: B  reason: collision with root package name */
    public int f1724B;

    /* renamed from: z  reason: collision with root package name */
    public int[] f1725z;

    @Metadata
    public final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.m());
        }

        public Object b(int i2) {
            return ArraySet.this.s(i2);
        }

        public void c(int i2) {
            ArraySet.this.n(i2);
        }
    }

    public ArraySet() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public boolean add(Object obj) {
        int i2;
        int i3;
        Object obj2 = obj;
        int m2 = m();
        boolean z2 = false;
        if (obj2 == null) {
            i3 = ArraySetKt.d(this);
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            i3 = ArraySetKt.c(this, obj2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        if (m2 >= h().length) {
            int i5 = 8;
            if (m2 >= 8) {
                i5 = (m2 >> 1) + m2;
            } else if (m2 < 4) {
                i5 = 4;
            }
            int[] h2 = h();
            Object[] g2 = g();
            ArraySetKt.a(this, i5);
            if (m2 == m()) {
                if (h().length == 0) {
                    z2 = true;
                }
                if (!z2) {
                    ArraysKt.o(h2, h(), 0, 0, h2.length, 6, (Object) null);
                    ArraysKt.q(g2, g(), 0, 0, g2.length, 6, (Object) null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < m2) {
            int i6 = i4 + 1;
            ArraysKt.j(h(), h(), i6, i4, m2);
            ArraysKt.l(g(), g(), i6, i4, m2);
        }
        if (m2 != m() || i4 >= h().length) {
            throw new ConcurrentModificationException();
        }
        h()[i4] = i2;
        g()[i4] = obj2;
        q(m() + 1);
        return true;
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        e(m() + collection.size());
        boolean z2 = false;
        for (Object add : collection) {
            z2 |= add(add);
        }
        return z2;
    }

    public void clear() {
        if (m() != 0) {
            p(ContainerHelpersKt.f2006a);
            o(ContainerHelpersKt.f2008c);
            q(0);
        }
        if (m() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final void e(int i2) {
        int m2 = m();
        if (h().length < i2) {
            int[] h2 = h();
            Object[] g2 = g();
            ArraySetKt.a(this, i2);
            if (m() > 0) {
                ArraysKt.o(h2, h(), 0, 0, m(), 6, (Object) null);
                ArraysKt.q(g2, g(), 0, 0, m(), 6, (Object) null);
            }
        }
        if (m() != m2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int m2 = m();
                int i2 = 0;
                while (i2 < m2) {
                    if (((Set) obj).contains(s(i2))) {
                        i2++;
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final Object[] g() {
        return this.f1723A;
    }

    public final int[] h() {
        return this.f1725z;
    }

    public int hashCode() {
        int[] h2 = h();
        int m2 = m();
        int i2 = 0;
        for (int i3 = 0; i3 < m2; i3++) {
            i2 += h2[i3];
        }
        return i2;
    }

    public int i() {
        return this.f1724B;
    }

    public final int indexOf(Object obj) {
        return obj == null ? ArraySetKt.d(this) : ArraySetKt.c(this, obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return m() <= 0;
    }

    public Iterator iterator() {
        return new ElementIterator();
    }

    public final int m() {
        return this.f1724B;
    }

    public final Object n(int i2) {
        int m2 = m();
        Object obj = g()[i2];
        if (m2 <= 1) {
            clear();
        } else {
            int i3 = m2 - 1;
            int i4 = 8;
            if (h().length <= 8 || m() >= h().length / 3) {
                if (i2 < i3) {
                    int i5 = i2 + 1;
                    ArraysKt.j(h(), h(), i2, i5, m2);
                    ArraysKt.l(g(), g(), i2, i5, m2);
                }
                g()[i3] = null;
            } else {
                if (m() > 8) {
                    i4 = m() + (m() >> 1);
                }
                int[] h2 = h();
                Object[] g2 = g();
                ArraySetKt.a(this, i4);
                if (i2 > 0) {
                    int i6 = i2;
                    ArraysKt.o(h2, h(), 0, 0, i6, 6, (Object) null);
                    ArraysKt.q(g2, g(), 0, 0, i6, 6, (Object) null);
                }
                if (i2 < i3) {
                    int i7 = i2 + 1;
                    ArraysKt.j(h2, h(), i2, i7, m2);
                    ArraysKt.l(g2, g(), i2, i7, m2);
                }
            }
            if (m2 == m()) {
                q(i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public final void o(Object[] objArr) {
        Intrinsics.i(objArr, "<set-?>");
        this.f1723A = objArr;
    }

    public final void p(int[] iArr) {
        Intrinsics.i(iArr, "<set-?>");
        this.f1725z = iArr;
    }

    public final void q(int i2) {
        this.f1724B = i2;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        n(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        boolean z2 = false;
        for (Object remove : collection) {
            z2 |= remove(remove);
        }
        return z2;
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        boolean z2 = false;
        for (int m2 = m() - 1; -1 < m2; m2--) {
            if (!CollectionsKt.W(collection, g()[m2])) {
                n(m2);
                z2 = true;
            }
        }
        return z2;
    }

    public final Object s(int i2) {
        return g()[i2];
    }

    public final /* bridge */ int size() {
        return i();
    }

    public final Object[] toArray() {
        return ArraysKt.t(this.f1723A, 0, this.f1724B);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(m() * 14);
        sb.append('{');
        int m2 = m();
        for (int i2 = 0; i2 < m2; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object s2 = s(i2);
            if (s2 != this) {
                sb.append(s2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public ArraySet(int i2) {
        this.f1725z = ContainerHelpersKt.f2006a;
        this.f1723A = ContainerHelpersKt.f2008c;
        if (i2 > 0) {
            ArraySetKt.a(this, i2);
        }
    }

    public final Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        Object[] a2 = ArraySetJvmUtil.a(objArr, this.f1724B);
        ArraysKt.l(this.f1723A, a2, 0, 0, this.f1724B);
        Intrinsics.f(a2);
        return a2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArraySet(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
