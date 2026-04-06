package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import java.util.Set;

class RealmModelValueOperator<K, V> extends MapValueOperator<K, V> {
    public boolean c(Object obj) {
        if (obj != null) {
            if (!RealmModel.class.isAssignableFrom(obj.getClass())) {
                throw new ClassCastException("Only RealmModel values can be used with 'containsValue'.");
            }
        }
        return d(obj);
    }

    public boolean d(Object obj) {
        if (obj == null) {
            return this.f39905c.c((Object) null);
        }
        if (obj instanceof RealmObjectProxy) {
            Row e2 = ((RealmObjectProxy) obj).b().e();
            return this.f39905c.e(e2.S(), e2.j().getNativePtr());
        }
        throw new IllegalArgumentException("Only managed models can be contained in this dictionary.");
    }

    public Set e() {
        return new RealmMapEntrySet(this.f39904b, this.f39905c, RealmMapEntrySet.IteratorType.OBJECT, this.f39906d);
    }

    public Object f(Object obj) {
        long k2 = this.f39905c.k(obj);
        if (k2 == -1) {
            return null;
        }
        return this.f39906d.b(this.f39904b, k2);
    }

    public Object i(Object obj, Object obj2) {
        return this.f39906d.e(this.f39904b, this.f39905c, obj, obj2);
    }
}
