package com.lokalise.sdk.local_db;

import io.realm.DynamicRealm;
import io.realm.RealmMigration;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LokaliseRealmMigration implements RealmMigration {
    public void migrate(DynamicRealm dynamicRealm, long j2, long j3) {
        RealmObjectSchema d2;
        Intrinsics.i(dynamicRealm, "realm");
        RealmSchema G = dynamicRealm.G();
        if (j2 == 0 && (d2 = G.d("Translations")) != null) {
            d2.g("type");
            d2.g("langId");
        }
    }
}
