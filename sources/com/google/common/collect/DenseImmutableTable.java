package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.Immutable;
import java.util.Map;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
@Immutable
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {

    /* renamed from: B  reason: collision with root package name */
    public final ImmutableMap f28071B;
    public final ImmutableMap C;
    public final ImmutableMap D;
    public final ImmutableMap E;
    public final int[] F;
    public final int[] G;
    public final Object[][] H;
    public final int[] I;
    public final int[] J;

    public final class Column extends ImmutableArrayMap<R, V> {
        public final int E;

        public Column(int i2) {
            super(DenseImmutableTable.this.G[i2]);
            this.E = i2;
        }

        public boolean k() {
            return true;
        }

        public Object t(int i2) {
            return DenseImmutableTable.this.H[i2][this.E];
        }

        public ImmutableMap v() {
            return DenseImmutableTable.this.f28071B;
        }
    }

    public final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        public final /* synthetic */ DenseImmutableTable E;

        public boolean k() {
            return false;
        }

        public ImmutableMap v() {
            return this.E.C;
        }

        /* renamed from: w */
        public ImmutableMap t(int i2) {
            return new Column(i2);
        }
    }

    public static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
        public final int D;

        public ImmutableArrayMap(int i2) {
            this.D = i2;
        }

        public ImmutableSet g() {
            return u() ? v().keySet() : super.g();
        }

        public Object get(Object obj) {
            Integer num = (Integer) v().get(obj);
            if (num == null) {
                return null;
            }
            return t(num.intValue());
        }

        public UnmodifiableIterator r() {
            return new AbstractIterator<Map.Entry<K, V>>() {

                /* renamed from: B  reason: collision with root package name */
                public int f28072B = -1;
                public final int C;

                {
                    this.C = ImmutableArrayMap.this.v().size();
                }

                /* renamed from: e */
                public Map.Entry b() {
                    int i2 = this.f28072B;
                    while (true) {
                        this.f28072B = i2 + 1;
                        int i3 = this.f28072B;
                        if (i3 >= this.C) {
                            return (Map.Entry) c();
                        }
                        Object t2 = ImmutableArrayMap.this.t(i3);
                        if (t2 != null) {
                            return Maps.t(ImmutableArrayMap.this.s(this.f28072B), t2);
                        }
                        i2 = this.f28072B;
                    }
                }
            };
        }

        public Object s(int i2) {
            return v().keySet().e().get(i2);
        }

        public int size() {
            return this.D;
        }

        public abstract Object t(int i2);

        public final boolean u() {
            return this.D == v().size();
        }

        public abstract ImmutableMap v();
    }

    public final class Row extends ImmutableArrayMap<C, V> {
        public final int E;

        public Row(int i2) {
            super(DenseImmutableTable.this.F[i2]);
            this.E = i2;
        }

        public boolean k() {
            return true;
        }

        public Object t(int i2) {
            return DenseImmutableTable.this.H[this.E][i2];
        }

        public ImmutableMap v() {
            return DenseImmutableTable.this.C;
        }
    }

    public final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        public final /* synthetic */ DenseImmutableTable E;

        public boolean k() {
            return false;
        }

        public ImmutableMap v() {
            return this.E.f28071B;
        }

        /* renamed from: w */
        public ImmutableMap t(int i2) {
            return new Row(i2);
        }
    }

    public Object e(Object obj, Object obj2) {
        Integer num = (Integer) this.f28071B.get(obj);
        Integer num2 = (Integer) this.C.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.H[num.intValue()][num2.intValue()];
    }

    /* renamed from: l */
    public ImmutableMap D() {
        return ImmutableMap.e(this.E);
    }

    /* renamed from: q */
    public ImmutableMap o() {
        return ImmutableMap.e(this.D);
    }

    public int size() {
        return this.I.length;
    }

    public Table.Cell t(int i2) {
        int i3 = this.I[i2];
        int i4 = this.J[i2];
        Object obj = p().e().get(i3);
        Object obj2 = k().e().get(i4);
        Object obj3 = this.H[i3][i4];
        Objects.requireNonNull(obj3);
        return ImmutableTable.i(obj, obj2, obj3);
    }

    public Object u(int i2) {
        Object obj = this.H[this.I[i2]][this.J[i2]];
        Objects.requireNonNull(obj);
        return obj;
    }
}
