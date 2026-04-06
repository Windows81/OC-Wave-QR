package com.lokalise.sdk;

import android.content.Context;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Lokalise$packageName$2 extends Lambda implements Function0<String> {
    public static final Lokalise$packageName$2 INSTANCE = new Lokalise$packageName$2();

    public Lokalise$packageName$2() {
        super(0);
    }

    public final String invoke() {
        Logger.INSTANCE.printDebug(LogType.SDK, "lazy initialization 'packageName'");
        Context access$getAppContext$p = Lokalise.appContext;
        if (access$getAppContext$p == null) {
            Intrinsics.y("appContext");
            access$getAppContext$p = null;
        }
        return access$getAppContext$p.getPackageName();
    }
}
