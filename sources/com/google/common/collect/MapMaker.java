package com.google.common.collect;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@ElementTypesAreNonnullByDefault
public final class MapMaker {

    /* renamed from: a  reason: collision with root package name */
    public boolean f28321a;

    /* renamed from: b  reason: collision with root package name */
    public int f28322b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f28323c = -1;

    /* renamed from: d  reason: collision with root package name */
    public MapMakerInternalMap.Strength f28324d;

    /* renamed from: e  reason: collision with root package name */
    public MapMakerInternalMap.Strength f28325e;

    /* renamed from: f  reason: collision with root package name */
    public Equivalence f28326f;

    public enum Dummy {
        VALUE
    }

    public int a() {
        int i2 = this.f28323c;
        if (i2 == -1) {
            return 4;
        }
        return i2;
    }

    public int b() {
        int i2 = this.f28322b;
        if (i2 == -1) {
            return 16;
        }
        return i2;
    }

    public Equivalence c() {
        return (Equivalence) MoreObjects.a(this.f28326f, d().f());
    }

    public MapMakerInternalMap.Strength d() {
        return (MapMakerInternalMap.Strength) MoreObjects.a(this.f28324d, MapMakerInternalMap.Strength.STRONG);
    }

    public MapMakerInternalMap.Strength e() {
        return (MapMakerInternalMap.Strength) MoreObjects.a(this.f28325e, MapMakerInternalMap.Strength.STRONG);
    }

    public ConcurrentMap f() {
        return !this.f28321a ? new ConcurrentHashMap(b(), 0.75f, a()) : MapMakerInternalMap.b(this);
    }

    public MapMaker g(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f28324d;
        Preconditions.z(strength2 == null, "Key strength was already set to %s", strength2);
        this.f28324d = (MapMakerInternalMap.Strength) Preconditions.q(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f28321a = true;
        }
        return this;
    }

    public MapMaker h() {
        return g(MapMakerInternalMap.Strength.WEAK);
    }

    public String toString() {
        MoreObjects.ToStringHelper c2 = MoreObjects.c(this);
        int i2 = this.f28322b;
        if (i2 != -1) {
            c2.b("initialCapacity", i2);
        }
        int i3 = this.f28323c;
        if (i3 != -1) {
            c2.b("concurrencyLevel", i3);
        }
        MapMakerInternalMap.Strength strength = this.f28324d;
        if (strength != null) {
            c2.d("keyStrength", Ascii.c(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.f28325e;
        if (strength2 != null) {
            c2.d("valueStrength", Ascii.c(strength2.toString()));
        }
        if (this.f28326f != null) {
            c2.j("keyEquivalence");
        }
        return c2.toString();
    }
}
