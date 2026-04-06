package com.lokalise.sdk;

import com.lokalise.sdk.api.RetrofitInitImpl;
import com.lokalise.sdk.api.SdkEndpoints;
import com.lokalise.sdk.api.SdkOkHttpClient;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Lokalise$apiExecutor$2 extends Lambda implements Function0<SdkEndpoints> {
    public static final Lokalise$apiExecutor$2 INSTANCE = new Lokalise$apiExecutor$2();

    public Lokalise$apiExecutor$2() {
        super(0);
    }

    public final SdkEndpoints invoke() {
        Logger.INSTANCE.printDebug(LogType.API, "lazy initialization 'apiExecutor'");
        return new RetrofitInitImpl(new SdkOkHttpClient()).getApi();
    }
}
