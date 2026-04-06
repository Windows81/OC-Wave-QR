package com.lokalise.sdk;

import android.content.Context;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Lokalise$appLabelResId$2 extends Lambda implements Function0<Integer> {
    public static final Lokalise$appLabelResId$2 INSTANCE = new Lokalise$appLabelResId$2();

    public Lokalise$appLabelResId$2() {
        super(0);
    }

    public final Integer invoke() {
        Logger.INSTANCE.printDebug(LogType.SDK, "lazy initialization 'appLabelResId'");
        Context access$getAppContext$p = Lokalise.appContext;
        if (access$getAppContext$p == null) {
            Intrinsics.y("appContext");
            access$getAppContext$p = null;
        }
        return Integer.valueOf(access$getAppContext$p.getApplicationInfo().labelRes);
    }
}
