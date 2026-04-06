package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.Immutable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@Immutable
@ElementTypesAreNonnullByDefault
final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    public static final ImmutableTable F = new SparseImmutableTable(ImmutableList.D(), ImmutableSet.D(), ImmutableSet.D());

    /* renamed from: B  reason: collision with root package name */
    public final ImmutableMap f28562B;
    public final ImmutableMap C;
    public final int[] D;
    public final int[] E;

    public SparseImmutableTable(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        ImmutableMap u2 = Maps.u(immutableSet);
        LinkedHashMap B2 = Maps.B();
        UnmodifiableIterator o2 = immutableSet.iterator();
        while (o2.hasNext()) {
            B2.put(o2.next(), new LinkedHashMap());
        }
        LinkedHashMap B3 = Maps.B();
        UnmodifiableIterator o3 = immutableSet2.iterator();
        while (o3.hasNext()) {
            B3.put(o3.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            Table.Cell cell = (Table.Cell) immutableList.get(i2);
            Object b2 = cell.b();
            Object a2 = cell.a();
            Object value = cell.getValue();
            Integer num = (Integer) u2.get(b2);
            Objects.requireNonNull(num);
            iArr[i2] = num.intValue();
            Map map = (Map) B2.get(b2);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i2] = map2.size();
            s(b2, a2, map2.put(a2, value), value);
            Map map3 = (Map) B3.get(a2);
            Objects.requireNonNull(map3);
            map3.put(b2, value);
        }
        this.D = iArr;
        this.E = iArr2;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(B2.size());
        for (Map.Entry entry : B2.entrySet()) {
            builder.g(entry.getKey(), ImmutableMap.e((Map) entry.getValue()));
        }
        this.f28562B = builder.d();
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(B3.size());
        for (Map.Entry entry2 : B3.entrySet()) {
            builder2.g(entry2.getKey(), ImmutableMap.e((Map) entry2.getValue()));
        }
        this.C = builder2.d();
    }

    /* renamed from: l */
    public ImmutableMap D() {
        return ImmutableMap.e(this.C);
    }

    /* renamed from: q */
    public ImmutableMap o() {
        return ImmutableMap.e(this.f28562B);
    }

    public int size() {
        return this.D.length;
    }

    public Table.Cell t(int i2) {
        Map.Entry entry = (Map.Entry) this.f28562B.entrySet().e().get(this.D[i2]);
        Map.Entry entry2 = (Map.Entry) ((ImmutableMap) entry.getValue()).entrySet().e().get(this.E[i2]);
        return ImmutableTable.i(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    public Object u(int i2) {
        int i3 = this.D[i2];
        return ((ImmutableMap) this.f28562B.values().e().get(i3)).values().e().get(this.E[i2]);
    }
}
