package com.google.android.gms.common.internal;

import android.content.Context;
import com.google.android.gms.common.internal.service.zao;

public class TelemetryLogging {
    public static TelemetryLoggingClient a(Context context) {
        return b(context, TelemetryLoggingOptions.f24914A);
    }

    public static TelemetryLoggingClient b(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        return new zao(context, telemetryLoggingOptions);
    }
}
