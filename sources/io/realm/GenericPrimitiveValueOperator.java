package io.realm;

import java.util.Set;

class GenericPrimitiveValueOperator<K, V> extends MapValueOperator<K, V> {

    /* renamed from: f  reason: collision with root package name */
    public final EqualsHelper f39893f;

    public boolean d(Object obj) {
        return this.f39905c.c(obj);
    }

    public Set e() {
        return new RealmMapEntrySet(this.f39904b, this.f39905c, this.f39907e, this.f39893f, (TypeSelectorForMap) null);
    }

    public Object f(Object obj) {
        Object g2 = this.f39905c.g(obj);
        if (g2 == null) {
            return null;
        }
        return n(g2);
    }

    public Object i(Object obj, Object obj2) {
        Object f2 = f(obj);
        this.f39905c.m(obj, obj2);
        return f2;
    }

    public Object n(Object obj) {
        return obj;
    }
}
