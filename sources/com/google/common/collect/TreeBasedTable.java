package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

@ElementTypesAreNonnullByDefault
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    public final Comparator G;

    public static class Factory<C, V> implements Supplier<TreeMap<C, V>>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Comparator f28611z;

        /* renamed from: a */
        public TreeMap get() {
            return new TreeMap(this.f28611z);
        }
    }

    public class TreeRow extends StandardTable<R, C, V>.Row implements SortedMap<C, V> {
        public final Object C;
        public final Object D;
        public transient SortedMap E;

        public TreeRow(TreeBasedTable treeBasedTable, Object obj) {
            this(obj, (Object) null, (Object) null);
        }

        public void c() {
            k();
            SortedMap sortedMap = this.E;
            if (sortedMap != null && sortedMap.isEmpty()) {
                TreeBasedTable.this.f28563B.remove(this.f28580z);
                this.E = null;
                this.f28578A = null;
            }
        }

        public Comparator comparator() {
            return TreeBasedTable.this.E();
        }

        public boolean containsKey(Object obj) {
            return j(obj) && super.containsKey(obj);
        }

        public Object firstKey() {
            e();
            Map map = this.f28578A;
            if (map != null) {
                return ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        public int g(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        /* renamed from: h */
        public SortedMap b() {
            k();
            SortedMap sortedMap = this.E;
            if (sortedMap == null) {
                return null;
            }
            Object obj = this.C;
            if (obj != null) {
                sortedMap = sortedMap.tailMap(obj);
            }
            Object obj2 = this.D;
            return obj2 != null ? sortedMap.headMap(obj2) : sortedMap;
        }

        public SortedMap headMap(Object obj) {
            Preconditions.d(j(Preconditions.q(obj)));
            return new TreeRow(this.f28580z, this.C, obj);
        }

        /* renamed from: i */
        public SortedSet keySet() {
            return new Maps.SortedKeySet(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r0 = r1.C;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
            r0 = r1.D;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean j(java.lang.Object r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x0018
                java.lang.Object r0 = r1.C
                if (r0 == 0) goto L_0x000c
                int r0 = r1.g(r0, r2)
                if (r0 > 0) goto L_0x0018
            L_0x000c:
                java.lang.Object r0 = r1.D
                if (r0 == 0) goto L_0x0016
                int r2 = r1.g(r0, r2)
                if (r2 <= 0) goto L_0x0018
            L_0x0016:
                r2 = 1
                goto L_0x0019
            L_0x0018:
                r2 = 0
            L_0x0019:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeBasedTable.TreeRow.j(java.lang.Object):boolean");
        }

        public void k() {
            SortedMap sortedMap = this.E;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.f28563B.containsKey(this.f28580z))) {
                this.E = (SortedMap) TreeBasedTable.this.f28563B.get(this.f28580z);
            }
        }

        public Object lastKey() {
            e();
            Map map = this.f28578A;
            if (map != null) {
                return ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        public Object put(Object obj, Object obj2) {
            Preconditions.d(j(Preconditions.q(obj)));
            return super.put(obj, obj2);
        }

        public SortedMap subMap(Object obj, Object obj2) {
            Preconditions.d(j(Preconditions.q(obj)) && j(Preconditions.q(obj2)));
            return new TreeRow(this.f28580z, obj, obj2);
        }

        public SortedMap tailMap(Object obj) {
            Preconditions.d(j(Preconditions.q(obj)));
            return new TreeRow(this.f28580z, obj, this.D);
        }

        public TreeRow(Object obj, Object obj2, Object obj3) {
            super(obj);
            this.C = obj2;
            this.D = obj3;
            Preconditions.d(obj2 == null || obj3 == null || g(obj2, obj3) <= 0);
        }
    }

    public /* bridge */ /* synthetic */ Map D() {
        return super.D();
    }

    public Comparator E() {
        return this.G;
    }

    /* renamed from: G */
    public SortedMap x(Object obj) {
        return new TreeRow(this, obj);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        return super.e(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ Map k(Object obj) {
        return super.k(obj);
    }

    public /* bridge */ /* synthetic */ Set l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ boolean m(Object obj) {
        return super.m(obj);
    }

    public /* bridge */ /* synthetic */ boolean p(Object obj) {
        return super.p(obj);
    }

    public Iterator q() {
        final Comparator E = E();
        final UnmodifiableIterator x2 = Iterators.x(Iterables.s(this.f28563B.values(), new c()), E);
        return new AbstractIterator<C>(this) {

            /* renamed from: B  reason: collision with root package name */
            public Object f28610B;

            /* JADX WARNING: Removed duplicated region for block: B:2:0x0008  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object b() {
                /*
                    r3 = this;
                L_0x0000:
                    java.util.Iterator r0 = r1
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L_0x001e
                    java.util.Iterator r0 = r1
                    java.lang.Object r0 = r0.next()
                    java.lang.Object r1 = r3.f28610B
                    if (r1 == 0) goto L_0x001b
                    java.util.Comparator r2 = r0
                    int r1 = r2.compare(r0, r1)
                    if (r1 != 0) goto L_0x001b
                    goto L_0x0000
                L_0x001b:
                    r3.f28610B = r0
                    return r0
                L_0x001e:
                    r0 = 0
                    r3.f28610B = r0
                    java.lang.Object r0 = r3.c()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeBasedTable.AnonymousClass1.b():java.lang.Object");
            }
        };
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ Object t(Object obj, Object obj2, Object obj3) {
        return super.t(obj, obj2, obj3);
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ Object u(Object obj, Object obj2) {
        return super.u(obj, obj2);
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public /* bridge */ /* synthetic */ Set z() {
        return super.z();
    }

    public SortedMap o() {
        return super.o();
    }
}
