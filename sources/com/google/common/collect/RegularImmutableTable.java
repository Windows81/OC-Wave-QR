package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Table;

@ElementTypesAreNonnullByDefault
abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    public final class CellSet extends IndexedImmutableSet<Table.Cell<R, C, V>> {
        public CellSet() {
        }

        /* renamed from: K */
        public Table.Cell get(int i2) {
            return RegularImmutableTable.this.t(i2);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Object e2 = RegularImmutableTable.this.e(cell.b(), cell.a());
            return e2 != null && e2.equals(cell.getValue());
        }

        public boolean n() {
            return false;
        }

        public int size() {
            return RegularImmutableTable.this.size();
        }
    }

    public final class Values extends ImmutableList<V> {
        public Values() {
        }

        public Object get(int i2) {
            return RegularImmutableTable.this.u(i2);
        }

        public boolean n() {
            return true;
        }

        public int size() {
            return RegularImmutableTable.this.size();
        }
    }

    /* renamed from: m */
    public final ImmutableSet c() {
        return f() ? ImmutableSet.D() : new CellSet();
    }

    /* renamed from: n */
    public final ImmutableCollection d() {
        return f() ? ImmutableList.D() : new Values();
    }

    public final void s(Object obj, Object obj2, Object obj3, Object obj4) {
        Preconditions.n(obj3 == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", obj, obj2, obj4, obj3);
    }

    public abstract Table.Cell t(int i2);

    public abstract Object u(int i2);
}
