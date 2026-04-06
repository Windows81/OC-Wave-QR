package io.realm;

import io.realm.RealmAny;
import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class RealmAnySetOperator extends SetValueOperator<RealmAny> {
    public final RealmAny A(RealmAny realmAny) {
        if (realmAny == null) {
            return RealmAny.f();
        }
        if (realmAny.d() != RealmAny.Type.OBJECT) {
            return realmAny;
        }
        RealmModel a2 = realmAny.a(RealmModel.class);
        if (CollectionUtils.a(this.f40075a, a2, this.f40077c.getName(), "set")) {
            a2 = CollectionUtils.c(this.f40075a, a2);
        }
        return RealmAny.g((RealmObjectProxy) a2);
    }

    public final NativeRealmAnyCollection B(Collection collection) {
        long[] jArr = new long[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            RealmAny realmAny = (RealmAny) it.next();
            if (realmAny != null) {
                z(realmAny);
                jArr[i2] = realmAny.c();
                zArr[i2] = true;
            }
            i2++;
        }
        return NativeRealmAnyCollection.j(jArr, zArr);
    }

    public boolean c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(A((RealmAny) it.next()));
        }
        return this.f40076b.r(B(arrayList), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    public boolean g(Collection collection) {
        return this.f40076b.r(B(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    public boolean h(Object obj) {
        RealmAny f2 = obj == null ? RealmAny.f() : (RealmAny) obj;
        z(f2);
        return this.f40076b.D(f2.c());
    }

    public boolean t(Collection collection) {
        return this.f40076b.r(B(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    public boolean u(Object obj) {
        RealmAny f2 = obj == null ? RealmAny.f() : (RealmAny) obj;
        z(f2);
        return this.f40076b.X(f2.c());
    }

    public boolean w(Collection collection) {
        return this.f40076b.r(B(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    /* renamed from: y */
    public boolean a(RealmAny realmAny) {
        return this.f40076b.n(A(realmAny).c());
    }

    public final void z(RealmAny realmAny) {
        try {
            realmAny.b(this.f40075a);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("RealmAny collection contains unmanaged objects.", e2);
        }
    }
}
