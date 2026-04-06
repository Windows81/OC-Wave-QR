package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class ArrayTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {

    /* renamed from: B  reason: collision with root package name */
    public final ImmutableList f27999B;
    public final ImmutableList C;
    public final ImmutableMap D;
    public final ImmutableMap E;
    public final Object[][] F;
    public transient ColumnMap G;
    public transient RowMap H;

    public static abstract class ArrayMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> {

        /* renamed from: z  reason: collision with root package name */
        public final ImmutableMap f28005z;

        public Iterator a() {
            return new AbstractIndexedListIterator<Map.Entry<K, V>>(size()) {
                /* renamed from: c */
                public Map.Entry b(int i2) {
                    return ArrayMap.this.b(i2);
                }
            };
        }

        public Map.Entry b(final int i2) {
            Preconditions.o(i2, size());
            return new AbstractMapEntry<K, V>() {
                public Object getKey() {
                    return ArrayMap.this.c(i2);
                }

                public Object getValue() {
                    return ArrayMap.this.f(i2);
                }

                public Object setValue(Object obj) {
                    return ArrayMap.this.g(i2, obj);
                }
            };
        }

        public Object c(int i2) {
            return this.f28005z.keySet().e().get(i2);
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public boolean containsKey(Object obj) {
            return this.f28005z.containsKey(obj);
        }

        public abstract String e();

        public abstract Object f(int i2);

        public abstract Object g(int i2, Object obj);

        public Object get(Object obj) {
            Integer num = (Integer) this.f28005z.get(obj);
            if (num == null) {
                return null;
            }
            return f(num.intValue());
        }

        public boolean isEmpty() {
            return this.f28005z.isEmpty();
        }

        public Set keySet() {
            return this.f28005z.keySet();
        }

        public Object put(Object obj, Object obj2) {
            Integer num = (Integer) this.f28005z.get(obj);
            if (num != null) {
                return g(num.intValue(), obj2);
            }
            String e2 = e();
            String valueOf = String.valueOf(obj);
            String valueOf2 = String.valueOf(this.f28005z.keySet());
            StringBuilder sb = new StringBuilder(String.valueOf(e2).length() + 9 + valueOf.length() + valueOf2.length());
            sb.append(e2);
            sb.append(" ");
            sb.append(valueOf);
            sb.append(" not in ");
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }

        public Object remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.f28005z.size();
        }

        public ArrayMap(ImmutableMap immutableMap) {
            this.f28005z = immutableMap;
        }
    }

    public class Column extends ArrayMap<R, V> {

        /* renamed from: A  reason: collision with root package name */
        public final int f28009A;

        public Column(int i2) {
            super(ArrayTable.this.D);
            this.f28009A = i2;
        }

        public String e() {
            return "Row";
        }

        public Object f(int i2) {
            return ArrayTable.this.n(i2, this.f28009A);
        }

        public Object g(int i2, Object obj) {
            return ArrayTable.this.r(i2, this.f28009A, obj);
        }
    }

    public class ColumnMap extends ArrayMap<C, Map<R, V>> {
        public String e() {
            return "Column";
        }

        /* renamed from: h */
        public Map f(int i2) {
            return new Column(i2);
        }

        /* renamed from: i */
        public Map put(Object obj, Map map) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public Map g(int i2, Map map) {
            throw new UnsupportedOperationException();
        }

        public ColumnMap() {
            super(ArrayTable.this.E);
        }
    }

    public class Row extends ArrayMap<C, V> {

        /* renamed from: A  reason: collision with root package name */
        public final int f28012A;

        public Row(int i2) {
            super(ArrayTable.this.E);
            this.f28012A = i2;
        }

        public String e() {
            return "Column";
        }

        public Object f(int i2) {
            return ArrayTable.this.n(this.f28012A, i2);
        }

        public Object g(int i2, Object obj) {
            return ArrayTable.this.r(this.f28012A, i2, obj);
        }
    }

    public class RowMap extends ArrayMap<R, Map<C, V>> {
        public String e() {
            return "Row";
        }

        /* renamed from: h */
        public Map f(int i2) {
            return new Row(i2);
        }

        /* renamed from: i */
        public Map put(Object obj, Map map) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public Map g(int i2, Map map) {
            throw new UnsupportedOperationException();
        }

        public RowMap() {
            super(ArrayTable.this.D);
        }
    }

    /* access modifiers changed from: private */
    public Table.Cell p(int i2) {
        return new Tables.AbstractCell<R, C, V>(i2) {

            /* renamed from: A  reason: collision with root package name */
            public final int f28001A;

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ int f28002B;

            /* renamed from: z  reason: collision with root package name */
            public final int f28003z;

            {
                this.f28002B = r3;
                this.f28003z = r3 / ArrayTable.this.C.size();
                this.f28001A = r3 % ArrayTable.this.C.size();
            }

            public Object a() {
                return ArrayTable.this.C.get(this.f28001A);
            }

            public Object b() {
                return ArrayTable.this.f27999B.get(this.f28003z);
            }

            public Object getValue() {
                return ArrayTable.this.n(this.f28003z, this.f28001A);
            }
        };
    }

    /* access modifiers changed from: private */
    public Object q(int i2) {
        return n(i2 / this.C.size(), i2 % this.C.size());
    }

    public Map D() {
        ColumnMap columnMap = this.G;
        if (columnMap != null) {
            return columnMap;
        }
        ColumnMap columnMap2 = new ColumnMap();
        this.G = columnMap2;
        return columnMap2;
    }

    public Iterator a() {
        return new AbstractIndexedListIterator<Table.Cell<R, C, V>>(size()) {
            /* renamed from: c */
            public Table.Cell b(int i2) {
                return ArrayTable.this.p(i2);
            }
        };
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsValue(Object obj) {
        for (Object[] objArr : this.F) {
            for (Object a2 : r0[r3]) {
                if (Objects.a(obj, a2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Iterator g() {
        return new AbstractIndexedListIterator<V>(size()) {
            public Object b(int i2) {
                return ArrayTable.this.q(i2);
            }
        };
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public Object n(int i2, int i3) {
        Preconditions.o(i2, this.f27999B.size());
        Preconditions.o(i3, this.C.size());
        return this.F[i2][i3];
    }

    public Map o() {
        RowMap rowMap = this.H;
        if (rowMap != null) {
            return rowMap;
        }
        RowMap rowMap2 = new RowMap();
        this.H = rowMap2;
        return rowMap2;
    }

    public Object r(int i2, int i3, Object obj) {
        Preconditions.o(i2, this.f27999B.size());
        Preconditions.o(i3, this.C.size());
        Object[] objArr = this.F[i2];
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public int size() {
        return this.f27999B.size() * this.C.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Collection values() {
        return super.values();
    }

    public Set z() {
        return super.z();
    }
}
