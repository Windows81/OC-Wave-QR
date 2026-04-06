package io.realm;

import io.realm.RealmModel;
import io.realm.internal.OsSet;
import java.util.ArrayList;

class RealmModelSetIterator<T extends RealmModel> extends SetIterator<T> {
    public final Class C;

    public RealmModelSetIterator(OsSet osSet, BaseRealm baseRealm, Class cls) {
        super(osSet, baseRealm);
        this.C = cls;
    }

    /* renamed from: c */
    public RealmModel b(int i2) {
        return this.f40072A.A(this.C, this.f40074z.G(i2), false, new ArrayList());
    }
}
