package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.core.NativeRealmAny;
import java.util.Set;

class RealmAnyValueOperator<K> extends MapValueOperator<K, RealmAny> {
    public boolean d(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof RealmAny) {
            return this.f39905c.d(((RealmAny) obj).c());
        }
        throw new IllegalArgumentException("This dictionary can only contain 'RealmAny' values.");
    }

    public Set e() {
        return new RealmMapEntrySet(this.f39904b, this.f39905c, RealmMapEntrySet.IteratorType.MIXED, (TypeSelectorForMap) null);
    }

    /* renamed from: n */
    public RealmAny f(Object obj) {
        long l2 = this.f39905c.l(obj);
        if (l2 == -1) {
            return null;
        }
        return new RealmAny(RealmAnyOperator.c(this.f39904b, new NativeRealmAny(l2)));
    }

    /* renamed from: o */
    public RealmAny i(Object obj, RealmAny realmAny) {
        RealmAny n2 = f(obj);
        if (realmAny == null) {
            this.f39905c.m(obj, (Object) null);
        } else {
            this.f39905c.n(obj, CollectionUtils.d(this.f39904b, realmAny).c());
        }
        return n2;
    }
}
