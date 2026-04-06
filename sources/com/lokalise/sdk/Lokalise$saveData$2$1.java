package com.lokalise.sdk;

import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import io.realm.Realm;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Lokalise$saveData$2$1 extends Lambda implements Function0<Unit> {
    public static final Lokalise$saveData$2$1 INSTANCE = new Lokalise$saveData$2$1();

    public Lokalise$saveData$2$1() {
        super(0);
    }

    public final void invoke() {
        if (Lokalise.threadExecutorRealmInstance != null) {
            Logger.INSTANCE.printDebug(LogType.REALM, "Reopen background Realm instance");
            Realm access$getThreadExecutorRealmInstance$p = Lokalise.threadExecutorRealmInstance;
            if (access$getThreadExecutorRealmInstance$p == null) {
                Intrinsics.y("threadExecutorRealmInstance");
                access$getThreadExecutorRealmInstance$p = null;
            }
            access$getThreadExecutorRealmInstance$p.close();
            Lokalise.threadExecutorRealmInstance = Lokalise.INSTANCE.newRealmInstance();
        }
    }
}
