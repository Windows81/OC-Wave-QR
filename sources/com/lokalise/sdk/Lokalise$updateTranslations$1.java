package com.lokalise.sdk;

import com.google.gson.GsonBuilder;
import com.lokalise.sdk.api.poko.BundleResponse;
import com.lokalise.sdk.ota.LokaliseOtaUpdateErrorType;
import com.lokalise.sdk.ota.LokaliseOtaUpdateStatusType;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata
public final class Lokalise$updateTranslations$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ Ref.IntRef $countOfAttempts;
    final /* synthetic */ String $requestId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Lokalise$updateTranslations$1(String str, Ref.IntRef intRef) {
        super(1);
        this.$requestId = str;
        this.$countOfAttempts = intRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.f40552a;
    }

    public final void invoke(int i2) {
        Call<BundleResponse> linkOnTranslationsFile = Lokalise.INSTANCE.getApiExecutor().getLinkOnTranslationsFile(this.$requestId, this.$countOfAttempts.f40906z);
        final Ref.IntRef intRef = this.$countOfAttempts;
        linkOnTranslationsFile.G0(new Callback<BundleResponse>() {
            public void onFailure(Call<BundleResponse> call, Throwable th) {
                Intrinsics.i(call, "call");
                Intrinsics.i(th, "t");
                Lokalise lokalise = Lokalise.INSTANCE;
                Request m2 = call.m();
                Intrinsics.h(m2, "call.request()");
                Function1 function1 = null;
                Lokalise.printQueryLog$default(lokalise, m2, (Request) null, 2, (Object) null);
                Logger logger = Logger.INSTANCE;
                LogType logType = LogType.API;
                int i2 = intRef.f40906z;
                String localizedMessage = th.getLocalizedMessage();
                logger.printInfo(logType, "Bundle info was not not received(attempt=" + i2 + "). Reason: \"" + localizedMessage + "\"");
                if (th instanceof UnknownHostException) {
                    intRef.f40906z = 5;
                    Lokalise.notifySubscribers$default(lokalise, 0, 0, LokaliseOtaUpdateStatusType.FAILED, LokaliseOtaUpdateErrorType.UNKNOWN_HOST, 3, (Object) null);
                } else if (intRef.f40906z < 5) {
                    Function1 access$getLastQuery$p = Lokalise.lastQuery;
                    if (access$getLastQuery$p == null) {
                        Intrinsics.y("lastQuery");
                    } else {
                        function1 = access$getLastQuery$p;
                    }
                    Ref.IntRef intRef = intRef;
                    int i3 = intRef.f40906z;
                    intRef.f40906z = i3 + 1;
                    function1.invoke(Integer.valueOf(i3));
                } else {
                    Lokalise.notifySubscribers$default(lokalise, 0, 0, LokaliseOtaUpdateStatusType.FAILED, th instanceof SocketTimeoutException ? LokaliseOtaUpdateErrorType.TIMEOUT : LokaliseOtaUpdateErrorType.OTHER, 3, (Object) null);
                }
                Lokalise.isUpdating.set(false);
            }

            public void onResponse(Call<BundleResponse> call, Response<BundleResponse> response) {
                Intrinsics.i(call, "call");
                Intrinsics.i(response, "response");
                Lokalise lokalise = Lokalise.INSTANCE;
                Request m2 = call.m();
                Intrinsics.h(m2, "call.request()");
                lokalise.printQueryLog(m2, response.g().E());
                Logger logger = Logger.INSTANCE;
                LogType logType = LogType.API;
                int b2 = response.b();
                logger.printInfo(logType, "Bundle info was received with " + b2 + " status code");
                if (response.e()) {
                    BundleResponse bundleResponse = (BundleResponse) response.a();
                    if (bundleResponse != null) {
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        gsonBuilder.f();
                        gsonBuilder.c();
                        String s2 = gsonBuilder.b().s(bundleResponse);
                        logger.printInfo(logType, "Response JSON: " + s2);
                        if (Lokalise.getCurrentBundleId() != bundleResponse.getBundle().getVersion()) {
                            String file = bundleResponse.getBundle().getFile();
                            logger.printInfo(logType, "Start downloading new bundle version by link: " + file);
                            lokalise.getTranslationsFile(bundleResponse.getBundle().getFile(), bundleResponse.getBundle().getVersion());
                        } else {
                            logger.printInfo(logType, "Bundle version is the same. No need to update bundle");
                            if (Lokalise.shouldTranslationsBeUpdated) {
                                lokalise.saveAppVersionToDB(lokalise.getAppVersion$sdk_release());
                                Lokalise.shouldTranslationsBeUpdated = false;
                                Lokalise.notifySubscribers$default(lokalise, 0, 0, LokaliseOtaUpdateStatusType.UPDATED, (LokaliseOtaUpdateErrorType) null, 11, (Object) null);
                            } else {
                                Lokalise.notifySubscribers$default(lokalise, 0, 0, LokaliseOtaUpdateStatusType.NOT_NEEDED, (LokaliseOtaUpdateErrorType) null, 11, (Object) null);
                            }
                        }
                    }
                } else {
                    ResponseBody d2 = response.d();
                    String k2 = d2 != null ? d2.k() : null;
                    logger.printInfo(logType, "Error response JSON: " + k2);
                    logger.printInfo(logType, "Bundle info was not received");
                    Lokalise.notifySubscribers$default(lokalise, 0, 0, LokaliseOtaUpdateStatusType.FAILED, LokaliseOtaUpdateErrorType.OTHER, 3, (Object) null);
                }
                Lokalise.isUpdating.set(false);
            }
        });
    }
}
