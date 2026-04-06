package io.realm;

import io.realm.internal.RealmAnyNativeFunctions;
import io.realm.internal.TableQuery;
import io.realm.internal.objectstore.OsKeyPathMapping;

public class RealmAnyNativeFunctionsImpl implements RealmAnyNativeFunctions {
    public void a(TableQuery tableQuery, OsKeyPathMapping osKeyPathMapping, String str, RealmAny... realmAnyArr) {
        long[] jArr = new long[realmAnyArr.length];
        int i2 = 0;
        while (i2 < realmAnyArr.length) {
            try {
                jArr[i2] = realmAnyArr[i2].c();
                i2++;
            } catch (IllegalStateException e2) {
                throw new IllegalArgumentException("Unmanaged Realm objects are not valid query arguments", e2);
            }
        }
        tableQuery.h(osKeyPathMapping, str, jArr);
    }
}
