package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements RowSortedTable<R, C, V> {

    public class RowSortedMap extends StandardTable<R, C, V>.RowMap implements SortedMap<R, Map<C, V>> {
        public RowSortedMap() {
            super();
        }

        public Comparator comparator() {
            return StandardRowSortedTable.this.B().comparator();
        }

        public Object firstKey() {
            return StandardRowSortedTable.this.B().firstKey();
        }

        /* renamed from: g */
        public SortedSet b() {
            return new Maps.SortedKeySet(this);
        }

        /* renamed from: h */
        public SortedSet keySet() {
            return (SortedSet) super.keySet();
        }

        public SortedMap headMap(Object obj) {
            Preconditions.q(obj);
            return new StandardRowSortedTable(StandardRowSortedTable.this.B().headMap(obj), StandardRowSortedTable.this.C).o();
        }

        public Object lastKey() {
            return StandardRowSortedTable.this.B().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            Preconditions.q(obj);
            Preconditions.q(obj2);
            return new StandardRowSortedTable(StandardRowSortedTable.this.B().subMap(obj, obj2), StandardRowSortedTable.this.C).o();
        }

        public SortedMap tailMap(Object obj) {
            Preconditions.q(obj);
            return new StandardRowSortedTable(StandardRowSortedTable.this.B().tailMap(obj), StandardRowSortedTable.this.C).o();
        }
    }

    public StandardRowSortedTable(SortedMap sortedMap, Supplier supplier) {
        super(sortedMap, supplier);
    }

    /* renamed from: A */
    public SortedMap r() {
        return new RowSortedMap();
    }

    public final SortedMap B() {
        return (SortedMap) this.f28563B;
    }

    public SortedMap o() {
        return (SortedMap) super.o();
    }
}
