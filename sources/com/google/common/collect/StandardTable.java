package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {

    /* renamed from: B  reason: collision with root package name */
    public final Map f28563B;
    public final Supplier C;
    public transient Set D;
    public transient Map E;
    public transient ColumnMap F;

    public class CellIterator implements Iterator<Table.Cell<R, C, V>> {

        /* renamed from: A  reason: collision with root package name */
        public Map.Entry f28564A;

        /* renamed from: B  reason: collision with root package name */
        public Iterator f28565B;

        /* renamed from: z  reason: collision with root package name */
        public final Iterator f28566z;

        public CellIterator() {
            this.f28566z = StandardTable.this.f28563B.entrySet().iterator();
            this.f28565B = Iterators.o();
        }

        /* renamed from: b */
        public Table.Cell next() {
            if (!this.f28565B.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f28566z.next();
                this.f28564A = entry;
                this.f28565B = ((Map) entry.getValue()).entrySet().iterator();
            }
            Objects.requireNonNull(this.f28564A);
            Map.Entry entry2 = (Map.Entry) this.f28565B.next();
            return Tables.c(this.f28564A.getKey(), entry2.getKey(), entry2.getValue());
        }

        public boolean hasNext() {
            return this.f28566z.hasNext() || this.f28565B.hasNext();
        }

        public void remove() {
            this.f28565B.remove();
            Map.Entry entry = this.f28564A;
            Objects.requireNonNull(entry);
            if (((Map) entry.getValue()).isEmpty()) {
                this.f28566z.remove();
                this.f28564A = null;
            }
        }
    }

    public class Column extends Maps.ViewCachingAbstractMap<R, V> {
        public final Object C;

        public class EntrySet extends Sets.ImprovedAbstractSet<Map.Entry<R, V>> {
            public EntrySet() {
            }

            public void clear() {
                Column.this.e(Predicates.b());
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.n(entry.getKey(), Column.this.C, entry.getValue());
            }

            public boolean isEmpty() {
                Column column = Column.this;
                return !StandardTable.this.m(column.C);
            }

            public Iterator iterator() {
                return new EntrySetIterator();
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.w(entry.getKey(), Column.this.C, entry.getValue());
            }

            public boolean retainAll(Collection collection) {
                return Column.this.e(Predicates.j(Predicates.g(collection)));
            }

            public int size() {
                int i2 = 0;
                for (Map containsKey : StandardTable.this.f28563B.values()) {
                    if (containsKey.containsKey(Column.this.C)) {
                        i2++;
                    }
                }
                return i2;
            }
        }

        public class EntrySetIterator extends AbstractIterator<Map.Entry<R, V>> {

            /* renamed from: B  reason: collision with root package name */
            public final Iterator f28568B;

            public EntrySetIterator() {
                this.f28568B = StandardTable.this.f28563B.entrySet().iterator();
            }

            /* renamed from: e */
            public Map.Entry b() {
                while (this.f28568B.hasNext()) {
                    final Map.Entry entry = (Map.Entry) this.f28568B.next();
                    if (((Map) entry.getValue()).containsKey(Column.this.C)) {
                        return new AbstractMapEntry<R, V>() {
                            public Object getKey() {
                                return entry.getKey();
                            }

                            public Object getValue() {
                                return ((Map) entry.getValue()).get(Column.this.C);
                            }

                            public Object setValue(Object obj) {
                                return NullnessCasts.a(((Map) entry.getValue()).put(Column.this.C, Preconditions.q(obj)));
                            }
                        };
                    }
                }
                return (Map.Entry) c();
            }
        }

        public class KeySet extends Maps.KeySet<R, V> {
            public KeySet() {
                super(Column.this);
            }

            public boolean contains(Object obj) {
                Column column = Column.this;
                return StandardTable.this.b(obj, column.C);
            }

            public boolean remove(Object obj) {
                Column column = Column.this;
                return StandardTable.this.u(obj, column.C) != null;
            }

            public boolean retainAll(Collection collection) {
                return Column.this.e(Maps.y(Predicates.j(Predicates.g(collection))));
            }
        }

        public class Values extends Maps.Values<R, V> {
            public Values() {
                super(Column.this);
            }

            public boolean remove(Object obj) {
                return obj != null && Column.this.e(Maps.Z(Predicates.f(obj)));
            }

            public boolean removeAll(Collection collection) {
                return Column.this.e(Maps.Z(Predicates.g(collection)));
            }

            public boolean retainAll(Collection collection) {
                return Column.this.e(Maps.Z(Predicates.j(Predicates.g(collection))));
            }
        }

        public Column(Object obj) {
            this.C = Preconditions.q(obj);
        }

        public Set a() {
            return new EntrySet();
        }

        public Set b() {
            return new KeySet();
        }

        public Collection c() {
            return new Values();
        }

        public boolean containsKey(Object obj) {
            return StandardTable.this.b(obj, this.C);
        }

        public boolean e(Predicate predicate) {
            Iterator it = StandardTable.this.f28563B.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Map map = (Map) entry.getValue();
                Object obj = map.get(this.C);
                if (obj != null && predicate.apply(Maps.t(entry.getKey(), obj))) {
                    map.remove(this.C);
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z2 = true;
                }
            }
            return z2;
        }

        public Object get(Object obj) {
            return StandardTable.this.e(obj, this.C);
        }

        public Object put(Object obj, Object obj2) {
            return StandardTable.this.t(obj, this.C, obj2);
        }

        public Object remove(Object obj) {
            return StandardTable.this.u(obj, this.C);
        }
    }

    public class ColumnKeyIterator extends AbstractIterator<C> {

        /* renamed from: B  reason: collision with root package name */
        public final Map f28573B;
        public final Iterator C;
        public Iterator D;

        public ColumnKeyIterator() {
            this.f28573B = (Map) StandardTable.this.C.get();
            this.C = StandardTable.this.f28563B.values().iterator();
            this.D = Iterators.m();
        }

        public Object b() {
            while (true) {
                if (this.D.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.D.next();
                    if (!this.f28573B.containsKey(entry.getKey())) {
                        this.f28573B.put(entry.getKey(), entry.getValue());
                        return entry.getKey();
                    }
                } else if (!this.C.hasNext()) {
                    return c();
                } else {
                    this.D = ((Map) this.C.next()).entrySet().iterator();
                }
            }
        }
    }

    public class ColumnKeySet extends StandardTable<R, C, V>.TableSet<C> {
        public ColumnKeySet() {
            super();
        }

        public boolean contains(Object obj) {
            return StandardTable.this.m(obj);
        }

        public Iterator iterator() {
            return StandardTable.this.q();
        }

        public boolean remove(Object obj) {
            boolean z2 = false;
            if (obj == null) {
                return false;
            }
            Iterator it = StandardTable.this.f28563B.values().iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (map.keySet().remove(obj)) {
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z2 = true;
                }
            }
            return z2;
        }

        public boolean removeAll(Collection collection) {
            Preconditions.q(collection);
            Iterator it = StandardTable.this.f28563B.values().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (Iterators.D(map.keySet().iterator(), collection)) {
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z2 = true;
                }
            }
            return z2;
        }

        public boolean retainAll(Collection collection) {
            Preconditions.q(collection);
            Iterator it = StandardTable.this.f28563B.values().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (map.keySet().retainAll(collection)) {
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z2 = true;
                }
            }
            return z2;
        }

        public int size() {
            return Iterators.H(iterator());
        }
    }

    public class ColumnMap extends Maps.ViewCachingAbstractMap<C, Map<R, V>> {

        public class ColumnMapEntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<C, Map<R, V>>> {
            public ColumnMapEntrySet() {
                super();
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!StandardTable.this.m(entry.getKey())) {
                    return false;
                }
                Map e2 = ColumnMap.this.get(entry.getKey());
                Objects.requireNonNull(e2);
                return e2.equals(entry.getValue());
            }

            public Iterator iterator() {
                return Maps.k(StandardTable.this.l(), new Function<C, Map<R, V>>() {
                    /* renamed from: a */
                    public Map apply(Object obj) {
                        return StandardTable.this.k(obj);
                    }
                });
            }

            public boolean remove(Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                Map unused = StandardTable.this.v(((Map.Entry) obj).getKey());
                return true;
            }

            public boolean removeAll(Collection collection) {
                Preconditions.q(collection);
                return Sets.n(this, collection.iterator());
            }

            public boolean retainAll(Collection collection) {
                Preconditions.q(collection);
                Iterator it = Lists.j(StandardTable.this.l().iterator()).iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(Maps.t(next, StandardTable.this.k(next)))) {
                        Map unused = StandardTable.this.v(next);
                        z2 = true;
                    }
                }
                return z2;
            }

            public int size() {
                return StandardTable.this.l().size();
            }
        }

        public class ColumnMapValues extends Maps.Values<C, Map<R, V>> {
            public ColumnMapValues() {
                super(ColumnMap.this);
            }

            public boolean remove(Object obj) {
                for (Map.Entry entry : ColumnMap.this.entrySet()) {
                    if (((Map) entry.getValue()).equals(obj)) {
                        Map unused = StandardTable.this.v(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            public boolean removeAll(Collection collection) {
                Preconditions.q(collection);
                Iterator it = Lists.j(StandardTable.this.l().iterator()).iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (collection.contains(StandardTable.this.k(next))) {
                        Map unused = StandardTable.this.v(next);
                        z2 = true;
                    }
                }
                return z2;
            }

            public boolean retainAll(Collection collection) {
                Preconditions.q(collection);
                Iterator it = Lists.j(StandardTable.this.l().iterator()).iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(StandardTable.this.k(next))) {
                        Map unused = StandardTable.this.v(next);
                        z2 = true;
                    }
                }
                return z2;
            }
        }

        public ColumnMap() {
        }

        public Set a() {
            return new ColumnMapEntrySet();
        }

        public Collection c() {
            return new ColumnMapValues();
        }

        public boolean containsKey(Object obj) {
            return StandardTable.this.m(obj);
        }

        /* renamed from: e */
        public Map get(Object obj) {
            if (!StandardTable.this.m(obj)) {
                return null;
            }
            StandardTable standardTable = StandardTable.this;
            Objects.requireNonNull(obj);
            return standardTable.k(obj);
        }

        /* renamed from: f */
        public Map remove(Object obj) {
            if (StandardTable.this.m(obj)) {
                return StandardTable.this.v(obj);
            }
            return null;
        }

        public Set keySet() {
            return StandardTable.this.l();
        }
    }

    public class Row extends Maps.IteratorBasedAbstractMap<C, V> {

        /* renamed from: A  reason: collision with root package name */
        public Map f28578A;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28580z;

        public Row(Object obj) {
            this.f28580z = Preconditions.q(obj);
        }

        public Iterator a() {
            e();
            Map map = this.f28578A;
            if (map == null) {
                return Iterators.o();
            }
            final Iterator it = map.entrySet().iterator();
            return new Iterator<Map.Entry<C, V>>() {
                /* renamed from: b */
                public Map.Entry next() {
                    return Row.this.f((Map.Entry) it.next());
                }

                public boolean hasNext() {
                    return it.hasNext();
                }

                public void remove() {
                    it.remove();
                    Row.this.c();
                }
            };
        }

        public Map b() {
            return (Map) StandardTable.this.f28563B.get(this.f28580z);
        }

        public void c() {
            e();
            Map map = this.f28578A;
            if (map != null && map.isEmpty()) {
                StandardTable.this.f28563B.remove(this.f28580z);
                this.f28578A = null;
            }
        }

        public void clear() {
            e();
            Map map = this.f28578A;
            if (map != null) {
                map.clear();
            }
            c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r1.f28578A;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean containsKey(java.lang.Object r2) {
            /*
                r1 = this;
                r1.e()
                if (r2 == 0) goto L_0x0011
                java.util.Map r0 = r1.f28578A
                if (r0 == 0) goto L_0x0011
                boolean r2 = com.google.common.collect.Maps.H(r0, r2)
                if (r2 == 0) goto L_0x0011
                r2 = 1
                goto L_0x0012
            L_0x0011:
                r2 = 0
            L_0x0012:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.StandardTable.Row.containsKey(java.lang.Object):boolean");
        }

        public final void e() {
            Map map = this.f28578A;
            if (map == null || (map.isEmpty() && StandardTable.this.f28563B.containsKey(this.f28580z))) {
                this.f28578A = b();
            }
        }

        public Map.Entry f(final Map.Entry entry) {
            return new ForwardingMapEntry<C, V>(this) {
                /* renamed from: Q */
                public Map.Entry M() {
                    return entry;
                }

                public boolean equals(Object obj) {
                    return R(obj);
                }

                public Object setValue(Object obj) {
                    return super.setValue(Preconditions.q(obj));
                }
            };
        }

        public Object get(Object obj) {
            Map map;
            e();
            if (obj == null || (map = this.f28578A) == null) {
                return null;
            }
            return Maps.I(map, obj);
        }

        public Object put(Object obj, Object obj2) {
            Preconditions.q(obj);
            Preconditions.q(obj2);
            Map map = this.f28578A;
            return (map == null || map.isEmpty()) ? StandardTable.this.t(this.f28580z, obj, obj2) : this.f28578A.put(obj, obj2);
        }

        public Object remove(Object obj) {
            e();
            Map map = this.f28578A;
            if (map == null) {
                return null;
            }
            Object J = Maps.J(map, obj);
            c();
            return J;
        }

        public int size() {
            e();
            Map map = this.f28578A;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    public class RowMap extends Maps.ViewCachingAbstractMap<R, Map<C, V>> {

        public class EntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<R, Map<C, V>>> {
            public EntrySet() {
                super();
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && Collections2.g(StandardTable.this.f28563B.entrySet(), entry);
            }

            public Iterator iterator() {
                return Maps.k(StandardTable.this.f28563B.keySet(), new Function<R, Map<C, V>>() {
                    /* renamed from: a */
                    public Map apply(Object obj) {
                        return StandardTable.this.x(obj);
                    }
                });
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && StandardTable.this.f28563B.entrySet().remove(entry);
            }

            public int size() {
                return StandardTable.this.f28563B.size();
            }
        }

        public RowMap() {
        }

        public Set a() {
            return new EntrySet();
        }

        public boolean containsKey(Object obj) {
            return StandardTable.this.p(obj);
        }

        /* renamed from: e */
        public Map get(Object obj) {
            if (!StandardTable.this.p(obj)) {
                return null;
            }
            StandardTable standardTable = StandardTable.this;
            Objects.requireNonNull(obj);
            return standardTable.x(obj);
        }

        /* renamed from: f */
        public Map remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return (Map) StandardTable.this.f28563B.remove(obj);
        }
    }

    public abstract class TableSet<T> extends Sets.ImprovedAbstractSet<T> {
        public TableSet() {
        }

        public void clear() {
            StandardTable.this.f28563B.clear();
        }

        public boolean isEmpty() {
            return StandardTable.this.f28563B.isEmpty();
        }
    }

    public StandardTable(Map map, Supplier supplier) {
        this.f28563B = map;
        this.C = supplier;
    }

    public Map D() {
        ColumnMap columnMap = this.F;
        if (columnMap != null) {
            return columnMap;
        }
        ColumnMap columnMap2 = new ColumnMap();
        this.F = columnMap2;
        return columnMap2;
    }

    public Iterator a() {
        return new CellIterator();
    }

    public boolean b(Object obj, Object obj2) {
        return (obj == null || obj2 == null || !super.b(obj, obj2)) ? false : true;
    }

    public void clear() {
        this.f28563B.clear();
    }

    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public Object e(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return super.e(obj, obj2);
    }

    public Map k(Object obj) {
        return new Column(obj);
    }

    public Set l() {
        Set set = this.D;
        if (set != null) {
            return set;
        }
        ColumnKeySet columnKeySet = new ColumnKeySet();
        this.D = columnKeySet;
        return columnKeySet;
    }

    public boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map H : this.f28563B.values()) {
            if (Maps.H(H, obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(Object obj, Object obj2, Object obj3) {
        return obj3 != null && obj3.equals(e(obj, obj2));
    }

    public Map o() {
        Map map = this.E;
        if (map != null) {
            return map;
        }
        Map r2 = r();
        this.E = r2;
        return r2;
    }

    public boolean p(Object obj) {
        return obj != null && Maps.H(this.f28563B, obj);
    }

    public Iterator q() {
        return new ColumnKeyIterator();
    }

    public Map r() {
        return new RowMap();
    }

    public final Map s(Object obj) {
        Map map = (Map) this.f28563B.get(obj);
        if (map != null) {
            return map;
        }
        Map map2 = (Map) this.C.get();
        this.f28563B.put(obj, map2);
        return map2;
    }

    public int size() {
        int i2 = 0;
        for (Map size : this.f28563B.values()) {
            i2 += size.size();
        }
        return i2;
    }

    public Object t(Object obj, Object obj2, Object obj3) {
        Preconditions.q(obj);
        Preconditions.q(obj2);
        Preconditions.q(obj3);
        return s(obj).put(obj2, obj3);
    }

    public Object u(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.I(this.f28563B, obj)) == null) {
            return null;
        }
        Object remove = map.remove(obj2);
        if (map.isEmpty()) {
            this.f28563B.remove(obj);
        }
        return remove;
    }

    public final Map v(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.f28563B.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object remove = ((Map) entry.getValue()).remove(obj);
            if (remove != null) {
                linkedHashMap.put(entry.getKey(), remove);
                if (((Map) entry.getValue()).isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    public Collection values() {
        return super.values();
    }

    public final boolean w(Object obj, Object obj2, Object obj3) {
        if (!n(obj, obj2, obj3)) {
            return false;
        }
        u(obj, obj2);
        return true;
    }

    public Map x(Object obj) {
        return new Row(obj);
    }

    public Set z() {
        return super.z();
    }
}
