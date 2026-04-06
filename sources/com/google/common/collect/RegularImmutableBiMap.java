package com.google.common.collect;

import com.google.common.collect.RegularImmutableMap;

@ElementTypesAreNonnullByDefault
final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    public static final RegularImmutableBiMap I = new RegularImmutableBiMap();
    public final transient Object D;
    public final transient Object[] E;
    public final transient int F;
    public final transient int G;
    public final transient RegularImmutableBiMap H;

    public RegularImmutableBiMap() {
        this.D = null;
        this.E = new Object[0];
        this.F = 0;
        this.G = 0;
        this.H = this;
    }

    public ImmutableSet f() {
        return new RegularImmutableMap.EntrySet(this, this.E, this.F, this.G);
    }

    public ImmutableSet g() {
        return new RegularImmutableMap.KeySet(this, new RegularImmutableMap.KeysOrValuesAsList(this.E, this.F, this.G));
    }

    public Object get(Object obj) {
        Object v2 = RegularImmutableMap.v(this.D, this.E, this.G, this.F, obj);
        if (v2 == null) {
            return null;
        }
        return v2;
    }

    public boolean k() {
        return false;
    }

    /* renamed from: s */
    public ImmutableBiMap q1() {
        return this.H;
    }

    public int size() {
        return this.G;
    }

    public RegularImmutableBiMap(Object[] objArr, int i2) {
        this.E = objArr;
        this.G = i2;
        this.F = 0;
        int u2 = i2 >= 2 ? ImmutableSet.u(i2) : 0;
        this.D = RegularImmutableMap.u(objArr, i2, u2, 0);
        this.H = new RegularImmutableBiMap(RegularImmutableMap.u(objArr, i2, u2, 1), objArr, i2, this);
    }

    public RegularImmutableBiMap(Object obj, Object[] objArr, int i2, RegularImmutableBiMap regularImmutableBiMap) {
        this.D = obj;
        this.E = objArr;
        this.F = 1;
        this.G = i2;
        this.H = regularImmutableBiMap;
    }
}
