package com.google.common.collect;

import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public class HashBasedTable<R, C, V> extends StandardTable<R, C, V> {

    public static class Factory<C, V> implements Supplier<Map<C, V>>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final int f28115z;

        /* renamed from: a */
        public Map get() {
            return Maps.C(this.f28115z);
        }
    }

    public /* bridge */ /* synthetic */ Map D() {
        return super.D();
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        return super.e(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ Map k(Object obj) {
        return super.k(obj);
    }

    public /* bridge */ /* synthetic */ Set l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ boolean m(Object obj) {
        return super.m(obj);
    }

    public /* bridge */ /* synthetic */ Map o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ boolean p(Object obj) {
        return super.p(obj);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ Object t(Object obj, Object obj2, Object obj3) {
        return super.t(obj, obj2, obj3);
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ Object u(Object obj, Object obj2) {
        return super.u(obj, obj2);
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public /* bridge */ /* synthetic */ Map x(Object obj) {
        return super.x(obj);
    }

    public /* bridge */ /* synthetic */ Set z() {
        return super.z();
    }
}
