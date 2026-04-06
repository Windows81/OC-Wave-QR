package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Map;

@ElementTypesAreNonnullByDefault
public class ImmutableRangeMap<K extends Comparable<?>, V> implements RangeMap<K, V>, Serializable {

    /* renamed from: B  reason: collision with root package name */
    public static final ImmutableRangeMap f28190B = new ImmutableRangeMap(ImmutableList.D(), ImmutableList.D());

    /* renamed from: A  reason: collision with root package name */
    public final transient ImmutableList f28191A;

    /* renamed from: z  reason: collision with root package name */
    public final transient ImmutableList f28192z;

    /* renamed from: com.google.common.collect.ImmutableRangeMap$1  reason: invalid class name */
    class AnonymousClass1 extends ImmutableList<Range<Comparable<?>>> {

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ int f28193B;
        public final /* synthetic */ int C;
        public final /* synthetic */ Range D;
        public final /* synthetic */ ImmutableRangeMap E;

        /* renamed from: Q */
        public Range get(int i2) {
            Preconditions.o(i2, this.f28193B);
            return (i2 == 0 || i2 == this.f28193B + -1) ? ((Range) this.E.f28192z.get(i2 + this.C)).n(this.D) : (Range) this.E.f28192z.get(i2 + this.C);
        }

        public boolean n() {
            return true;
        }

        public int size() {
            return this.f28193B;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeMap$2  reason: invalid class name */
    class AnonymousClass2 extends ImmutableRangeMap<Comparable<?>, Object> {
        public /* bridge */ /* synthetic */ Map a() {
            return ImmutableRangeMap.super.a();
        }
    }

    @DoNotMock
    public static final class Builder<K extends Comparable<?>, V> {
    }

    public static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
    }

    public ImmutableRangeMap(ImmutableList immutableList, ImmutableList immutableList2) {
        this.f28192z = immutableList;
        this.f28191A = immutableList2;
    }

    /* renamed from: c */
    public ImmutableMap a() {
        return this.f28192z.isEmpty() ? ImmutableMap.o() : new ImmutableSortedMap(new RegularImmutableSortedSet(this.f28192z, Range.v()), this.f28191A);
    }

    public boolean equals(Object obj) {
        if (obj instanceof RangeMap) {
            return a().equals(((RangeMap) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
