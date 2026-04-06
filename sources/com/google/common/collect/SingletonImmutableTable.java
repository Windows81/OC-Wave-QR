package com.google.common.collect;

@ElementTypesAreNonnullByDefault
class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    /* renamed from: B  reason: collision with root package name */
    public final Object f28554B;
    public final Object C;
    public final Object D;

    /* renamed from: l */
    public ImmutableMap D() {
        return ImmutableMap.p(this.C, ImmutableMap.p(this.f28554B, this.D));
    }

    /* renamed from: m */
    public ImmutableSet c() {
        return ImmutableSet.E(ImmutableTable.i(this.f28554B, this.C, this.D));
    }

    /* renamed from: n */
    public ImmutableCollection d() {
        return ImmutableSet.E(this.D);
    }

    /* renamed from: q */
    public ImmutableMap o() {
        return ImmutableMap.p(this.f28554B, ImmutableMap.p(this.C, this.D));
    }

    public int size() {
        return 1;
    }
}
