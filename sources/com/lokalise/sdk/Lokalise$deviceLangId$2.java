package com.lokalise.sdk;

import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Lokalise$deviceLangId$2 extends Lambda implements Function0<String> {
    public static final Lokalise$deviceLangId$2 INSTANCE = new Lokalise$deviceLangId$2();

    public Lokalise$deviceLangId$2() {
        super(0);
    }

    public final String invoke() {
        String str;
        Logger.INSTANCE.printDebug(LogType.SDK, "lazy initialization 'deviceLangId'");
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        Intrinsics.h(country, "defaultLocale.country");
        if (country.length() > 0) {
            str = "_" + locale.getCountry();
        } else {
            str = "";
        }
        return language + str;
    }
}
