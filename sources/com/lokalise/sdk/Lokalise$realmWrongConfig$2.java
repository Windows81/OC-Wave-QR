package com.lokalise.sdk;

import com.lokalise.sdk.local_db.LokaliseRealmConfig;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import io.realm.RealmConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Lokalise$realmWrongConfig$2 extends Lambda implements Function0<RealmConfiguration> {
    public static final Lokalise$realmWrongConfig$2 INSTANCE = new Lokalise$realmWrongConfig$2();

    public Lokalise$realmWrongConfig$2() {
        super(0);
    }

    public final RealmConfiguration invoke() {
        Logger.INSTANCE.printDebug(LogType.REALM, "lazy initialization 'realmWrongConfig'");
        RealmConfiguration.Builder builder = new RealmConfiguration.Builder();
        builder.j(RealmConfiguration.Builder.class.getSimpleName());
        builder.i(new LokaliseRealmConfig(), new Object[0]);
        return builder.c();
    }
}
