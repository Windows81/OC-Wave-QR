package com.lokalise.sdk;

import com.lokalise.sdk.local_db.LokaliseRealmConfig;
import com.lokalise.sdk.local_db.LokaliseRealmMigration;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import io.realm.RealmConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Lokalise$realmConfig$2 extends Lambda implements Function0<RealmConfiguration> {
    public static final Lokalise$realmConfig$2 INSTANCE = new Lokalise$realmConfig$2();

    public Lokalise$realmConfig$2() {
        super(0);
    }

    public final RealmConfiguration invoke() {
        Logger.INSTANCE.printDebug(LogType.REALM, "lazy initialization 'realmConfig'");
        RealmConfiguration.Builder builder = new RealmConfiguration.Builder();
        builder.j(Lokalise.INSTANCE.getClass().getSimpleName());
        builder.k(1);
        builder.h(new LokaliseRealmMigration());
        builder.i(new LokaliseRealmConfig(), new Object[0]);
        builder.b(true);
        builder.e();
        return builder.c();
    }
}
