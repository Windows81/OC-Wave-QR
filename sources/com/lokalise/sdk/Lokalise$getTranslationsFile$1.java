package com.lokalise.sdk;

import com.google.gson.Gson;
import com.lokalise.sdk.ota.LokaliseOtaUpdateErrorType;
import com.lokalise.sdk.ota.LokaliseOtaUpdateStatusType;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
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
public final class Lokalise$getTranslationsFile$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ long $bundleId;
    final /* synthetic */ Ref.IntRef $countOfAttempts;
    final /* synthetic */ String $url;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Lokalise$getTranslationsFile$1(Ref.IntRef intRef, String str, long j2) {
        super(1);
        this.$countOfAttempts = intRef;
        this.$url = str;
        this.$bundleId = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.f40552a;
    }

    public final void invoke(int i2) {
        Call<ResponseBody> readJsonObject = Lokalise.INSTANCE.getApiExecutor().readJsonObject(this.$countOfAttempts.f40906z, this.$url);
        final Ref.IntRef intRef = this.$countOfAttempts;
        final long j2 = this.$bundleId;
        readJsonObject.G0(new Callback<ResponseBody>() {
            public void onFailure(Call<ResponseBody> call, Throwable th) {
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
                logger.printInfo(logType, "Bundle was not not received(attempt=" + i2 + "). Reason: \"" + localizedMessage + "\"");
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

            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Object obj;
                Intrinsics.i(call, "call");
                Intrinsics.i(response, "response");
                Lokalise lokalise = Lokalise.INSTANCE;
                Request m2 = call.m();
                Intrinsics.h(m2, "call.request()");
                lokalise.printQueryLog(m2, response.g().E());
                Logger logger = Logger.INSTANCE;
                LogType logType = LogType.API;
                int b2 = response.b();
                logger.printInfo(logType, "Bundle was received with " + b2 + " status code");
                if (response.e()) {
                    ResponseBody responseBody = (ResponseBody) response.a();
                    if (responseBody != null) {
                        long j2 = j2;
                        String k2 = responseBody.k();
                        try {
                            Result.Companion companion = Result.f40519A;
                            obj = Result.b((List) new Gson().k(k2, new Lokalise$getTranslationsFile$1$1$onResponse$1$1$deserializationType$1().getType()));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.f40519A;
                            obj = Result.b(ResultKt.a(th));
                        }
                        if (Result.h(obj)) {
                            List list = (List) obj;
                            Lokalise lokalise2 = Lokalise.INSTANCE;
                            Intrinsics.h(list, "deserializedResponse");
                            lokalise2.saveData(j2, list);
                            if (Lokalise.shouldTranslationsBeUpdated) {
                                lokalise2.saveAppVersionToDB(lokalise2.getAppVersion$sdk_release());
                                Lokalise.shouldTranslationsBeUpdated = false;
                            }
                        }
                        Throwable e2 = Result.e(obj);
                        if (e2 != null) {
                            Logger.INSTANCE.printInfo(LogType.API, "Something went wrong when parsing bundle. Continue without saving bundle");
                            e2.printStackTrace();
                        }
                        Result.a(obj);
                    }
                } else {
                    logger.printInfo(logType, "Bundle was not downloaded");
                    Lokalise.notifySubscribers$default(lokalise, 0, 0, LokaliseOtaUpdateStatusType.FAILED, LokaliseOtaUpdateErrorType.OTHER, 3, (Object) null);
                }
                Lokalise.isUpdating.set(false);
            }
        });
    }
}
