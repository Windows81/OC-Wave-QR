package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.Table;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

@ElementTypesAreNonnullByDefault
public final class Tables {

    /* renamed from: a  reason: collision with root package name */
    public static final Function f28599a = new Function<Map<Object, Object>, Map<Object, Object>>() {
        /* renamed from: a */
        public Map apply(Map map) {
            return Collections.unmodifiableMap(map);
        }
    };

    public static abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            return Objects.a(b(), cell.b()) && Objects.a(a(), cell.a()) && Objects.a(getValue(), cell.getValue());
        }

        public int hashCode() {
            return Objects.b(b(), a(), getValue());
        }

        public String toString() {
            String valueOf = String.valueOf(b());
            String valueOf2 = String.valueOf(a());
            String valueOf3 = String.valueOf(getValue());
            StringBuilder sb = new StringBuilder(valueOf.length() + 4 + valueOf2.length() + valueOf3.length());
            sb.append("(");
            sb.append(valueOf);
            sb.append(",");
            sb.append(valueOf2);
            sb.append(")=");
            sb.append(valueOf3);
            return sb.toString();
        }
    }

    public static final class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Object f28600A;

        /* renamed from: B  reason: collision with root package name */
        public final Object f28601B;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28602z;

        public ImmutableCell(Object obj, Object obj2, Object obj3) {
            this.f28602z = obj;
            this.f28600A = obj2;
            this.f28601B = obj3;
        }

        public Object a() {
            return this.f28600A;
        }

        public Object b() {
            return this.f28602z;
        }

        public Object getValue() {
            return this.f28601B;
        }
    }

    public static class TransformedTable<R, C, V1, V2> extends AbstractTable<R, C, V2> {

        /* renamed from: B  reason: collision with root package name */
        public final Table f28603B;
        public final Function C;

        public Map D() {
            return Maps.P(this.f28603B.D(), new Function<Map<R, V1>, Map<R, V2>>() {
                /* renamed from: a */
                public Map apply(Map map) {
                    return Maps.P(map, TransformedTable.this.C);
                }
            });
        }

        public Iterator a() {
            return Iterators.J(this.f28603B.z().iterator(), h());
        }

        public void clear() {
            this.f28603B.clear();
        }

        public Collection d() {
            return Collections2.j(this.f28603B.values(), this.C);
        }

        public Function h() {
            return new Function<Table.Cell<R, C, V1>, Table.Cell<R, C, V2>>() {
                /* renamed from: a */
                public Table.Cell apply(Table.Cell cell) {
                    return Tables.c(cell.b(), cell.a(), TransformedTable.this.C.apply(cell.getValue()));
                }
            };
        }

        public Map o() {
            return Maps.P(this.f28603B.o(), new Function<Map<C, V1>, Map<C, V2>>() {
                /* renamed from: a */
                public Map apply(Map map) {
                    return Maps.P(map, TransformedTable.this.C);
                }
            });
        }

        public int size() {
            return this.f28603B.size();
        }
    }

    public static class TransposeTable<C, R, V> extends AbstractTable<C, R, V> {
        public static final Function C = new Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>>() {
            /* renamed from: a */
            public Table.Cell apply(Table.Cell cell) {
                return Tables.c(cell.a(), cell.b(), cell.getValue());
            }
        };

        /* renamed from: B  reason: collision with root package name */
        public final Table f28607B;

        public Map D() {
            return this.f28607B.o();
        }

        public Iterator a() {
            return Iterators.J(this.f28607B.z().iterator(), C);
        }

        public void clear() {
            this.f28607B.clear();
        }

        public boolean containsValue(Object obj) {
            return this.f28607B.containsValue(obj);
        }

        public Map o() {
            return this.f28607B.D();
        }

        public int size() {
            return this.f28607B.size();
        }

        public Collection values() {
            return this.f28607B.values();
        }
    }

    public static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {
        /* renamed from: R */
        public RowSortedTable Q() {
            return (RowSortedTable) super.M();
        }

        public SortedMap o() {
            return Collections.unmodifiableSortedMap(Maps.Q(Q().o(), Tables.d()));
        }
    }

    public static class UnmodifiableTable<R, C, V> extends ForwardingTable<R, C, V> implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Table f28608z;

        public Map D() {
            return Collections.unmodifiableMap(Maps.P(super.D(), Tables.d()));
        }

        /* renamed from: Q */
        public Table M() {
            return this.f28608z;
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Map o() {
            return Collections.unmodifiableMap(Maps.P(super.o(), Tables.d()));
        }

        public Collection values() {
            return Collections.unmodifiableCollection(super.values());
        }

        public Set z() {
            return Collections.unmodifiableSet(super.z());
        }
    }

    public static boolean b(Table table, Object obj) {
        if (obj == table) {
            return true;
        }
        if (obj instanceof Table) {
            return table.z().equals(((Table) obj).z());
        }
        return false;
    }

    public static Table.Cell c(Object obj, Object obj2, Object obj3) {
        return new ImmutableCell(obj, obj2, obj3);
    }

    public static Function d() {
        return f28599a;
    }
}
