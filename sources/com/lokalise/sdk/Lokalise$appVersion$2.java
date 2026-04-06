package com.lokalise.sdk;

import android.content.Context;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Lokalise$appVersion$2 extends Lambda implements Function0<String> {
    public static final Lokalise$appVersion$2 INSTANCE = new Lokalise$appVersion$2();

    public Lokalise$appVersion$2() {
        super(0);
    }

    public final String invoke() {
        Logger.INSTANCE.printDebug(LogType.SDK, "lazy initialization 'appVersion'");
        Lokalise lokalise = Lokalise.INSTANCE;
        Context access$getAppContext$p = Lokalise.appContext;
        if (access$getAppContext$p == null) {
            Intrinsics.y("appContext");
            access$getAppContext$p = null;
        }
        return lokalise.getApplicationVersionCode(access$getAppContext$p);
    }
}
