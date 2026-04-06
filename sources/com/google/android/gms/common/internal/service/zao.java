package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;

public final class zao extends GoogleApi implements TelemetryLoggingClient {

    /* renamed from: k  reason: collision with root package name */
    public static final Api.ClientKey f24923k;

    /* renamed from: l  reason: collision with root package name */
    public static final Api.AbstractClientBuilder f24924l;

    /* renamed from: m  reason: collision with root package name */
    public static final Api f24925m;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f24923k = clientKey;
        zan zan = new zan();
        f24924l = zan;
        f24925m = new Api("ClientTelemetry.API", zan, clientKey);
    }

    public zao(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        super(context, f24925m, telemetryLoggingOptions, GoogleApi.Settings.f24436c);
    }

    public final Task a(TelemetryData telemetryData) {
        TaskApiCall.Builder a2 = TaskApiCall.a();
        a2.d(zaf.f25262a);
        a2.c(false);
        a2.b(new zam(telemetryData));
        return e(a2.a());
    }
}
