package com.lokalise.sdk;

import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Lokalise$androidSDKVersion$2 extends Lambda implements Function0<String> {
    public static final Lokalise$androidSDKVersion$2 INSTANCE = new Lokalise$androidSDKVersion$2();

    public Lokalise$androidSDKVersion$2() {
        super(0);
    }

    public final String invoke() {
        Logger.INSTANCE.printDebug(LogType.SDK, "lazy initialization 'androidSDKVersion'");
        return "237";
    }
}
