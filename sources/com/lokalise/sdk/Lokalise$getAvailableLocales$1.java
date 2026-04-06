package com.lokalise.sdk;

import com.lokalise.sdk.local_db.LocaleConfig;
import io.realm.Realm;
import io.realm.RealmResults;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Lokalise$getAvailableLocales$1 extends Lambda implements Function0<Object> {
    public static final Lokalise$getAvailableLocales$1 INSTANCE = new Lokalise$getAvailableLocales$1();

    public Lokalise$getAvailableLocales$1() {
        super(0);
    }

    public final Object invoke() {
        if (Lokalise.threadExecutorRealmInstance == null) {
            Lokalise.threadExecutorRealmInstance = Lokalise.INSTANCE.newRealmInstance();
        }
        Lokalise lokalise = Lokalise.INSTANCE;
        Realm access$getThreadExecutorRealmInstance$p = Lokalise.threadExecutorRealmInstance;
        if (access$getThreadExecutorRealmInstance$p == null) {
            Intrinsics.y("threadExecutorRealmInstance");
            access$getThreadExecutorRealmInstance$p = null;
        }
        RealmResults k2 = access$getThreadExecutorRealmInstance$p.E1(LocaleConfig.class).k();
        Intrinsics.h(k2, "threadExecutorRealmInsta…ig::class.java).findAll()");
        return lokalise.parseLocalesToArray(k2);
    }
}
