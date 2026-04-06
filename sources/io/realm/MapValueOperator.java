package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class MapValueOperator<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final Class f39903a;

    /* renamed from: b  reason: collision with root package name */
    public final BaseRealm f39904b;

    /* renamed from: c  reason: collision with root package name */
    public final OsMap f39905c;

    /* renamed from: d  reason: collision with root package name */
    public final TypeSelectorForMap f39906d;

    /* renamed from: e  reason: collision with root package name */
    public final RealmMapEntrySet.IteratorType f39907e;

    public void a() {
        this.f39905c.a();
    }

    public boolean b(Object obj) {
        return this.f39905c.b(obj);
    }

    public boolean c(Object obj) {
        if (obj == null || obj.getClass() == this.f39903a) {
            return d(obj);
        }
        throw new ClassCastException("Only '" + this.f39903a.getSimpleName() + "'  values can be used with 'containsValue'.");
    }

    public abstract boolean d(Object obj);

    public abstract Set e();

    public abstract Object f(Object obj);

    public boolean g() {
        return this.f39905c.q() == 0;
    }

    public Set h() {
        return this.f39906d.d();
    }

    public abstract Object i(Object obj, Object obj2);

    public void j(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            i(entry.getKey(), entry.getValue());
        }
    }

    public void k(Object obj) {
        this.f39905c.p(obj);
    }

    public int l() {
        return (int) this.f39905c.q();
    }

    public Collection m() {
        return this.f39906d.c();
    }
}
