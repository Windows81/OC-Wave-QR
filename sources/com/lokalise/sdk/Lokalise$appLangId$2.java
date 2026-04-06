package com.lokalise.sdk;

import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Lokalise$appLangId$2 extends Lambda implements Function0<String> {
    public static final Lokalise$appLangId$2 INSTANCE = new Lokalise$appLangId$2();

    public Lokalise$appLangId$2() {
        super(0);
    }

    public final String invoke() {
        String str;
        Logger.INSTANCE.printDebug(LogType.SDK, "lazy initialization 'appLangId'");
        Lokalise lokalise = Lokalise.INSTANCE;
        String appLanguage$sdk_release = lokalise.getAppLanguage$sdk_release();
        String appCountry$sdk_release = lokalise.getAppCountry$sdk_release();
        Intrinsics.h(appCountry$sdk_release, "appCountry");
        if (appCountry$sdk_release.length() > 0) {
            str = "_" + lokalise.getAppCountry$sdk_release();
        } else {
            str = "";
        }
        return appLanguage$sdk_release + str;
    }
}
