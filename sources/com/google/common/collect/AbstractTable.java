package com.google.common.collect;

import com.google.common.collect.Table;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class AbstractTable<R, C, V> implements Table<R, C, V> {

    /* renamed from: A  reason: collision with root package name */
    public transient Collection f27994A;

    /* renamed from: z  reason: collision with root package name */
    public transient Set f27995z;

    public class CellSet extends AbstractSet<Table.Cell<R, C, V>> {
        public CellSet() {
        }

        public void clear() {
            AbstractTable.this.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.I(AbstractTable.this.o(), cell.b());
            return map != null && Collections2.g(map.entrySet(), Maps.t(cell.a(), cell.getValue()));
        }

        public Iterator iterator() {
            return AbstractTable.this.a();
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.I(AbstractTable.this.o(), cell.b());
            return map != null && Collections2.h(map.entrySet(), Maps.t(cell.a(), cell.getValue()));
        }

        public int size() {
            return AbstractTable.this.size();
        }
    }

    public class Values extends AbstractCollection<V> {
        public Values() {
        }

        public void clear() {
            AbstractTable.this.clear();
        }

        public boolean contains(Object obj) {
            return AbstractTable.this.containsValue(obj);
        }

        public Iterator iterator() {
            return AbstractTable.this.g();
        }

        public int size() {
            return AbstractTable.this.size();
        }
    }

    public abstract Iterator a();

    public boolean b(Object obj, Object obj2) {
        Map map = (Map) Maps.I(o(), obj);
        return map != null && Maps.H(map, obj2);
    }

    public Set c() {
        return new CellSet();
    }

    public void clear() {
        Iterators.e(z().iterator());
    }

    public boolean containsValue(Object obj) {
        for (Map containsValue : o().values()) {
            if (containsValue.containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public Collection d() {
        return new Values();
    }

    public Object e(Object obj, Object obj2) {
        Map map = (Map) Maps.I(o(), obj);
        if (map == null) {
            return null;
        }
        return Maps.I(map, obj2);
    }

    public boolean equals(Object obj) {
        return Tables.b(this, obj);
    }

    public boolean f() {
        return size() == 0;
    }

    public Iterator g() {
        return new TransformedIterator<Table.Cell<R, C, V>, V>(this, z().iterator()) {
            /* renamed from: c */
            public Object b(Table.Cell cell) {
                return cell.getValue();
            }
        };
    }

    public int hashCode() {
        return z().hashCode();
    }

    public String toString() {
        return o().toString();
    }

    public Collection values() {
        Collection collection = this.f27994A;
        if (collection != null) {
            return collection;
        }
        Collection d2 = d();
        this.f27994A = d2;
        return d2;
    }

    public Set z() {
        Set set = this.f27995z;
        if (set != null) {
            return set;
        }
        Set c2 = c();
        this.f27995z = c2;
        return c2;
    }
}
