package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class SelectorForMap<K, V> extends TypeSelectorForMap<K, V> {

    /* renamed from: c  reason: collision with root package name */
    public final Class f40069c;

    /* renamed from: d  reason: collision with root package name */
    public final Class f40070d;

    public Collection c() {
        return f(this.f40087a, this.f40088b.s(), !CollectionUtils.e(this.f40070d), this.f40070d);
    }

    public Set d() {
        return new HashSet(f(this.f40087a, this.f40088b.r(), true, this.f40069c));
    }

    public final RealmResults f(BaseRealm baseRealm, Pair pair, boolean z2, Class cls) {
        return new RealmResults(baseRealm, OsResults.f(baseRealm.D, ((Long) pair.f40372b).longValue()), cls, z2);
    }
}
