package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

public class DataTransportCrashlyticsReportSender {

    /* renamed from: c  reason: collision with root package name */
    public static final CrashlyticsReportJsonTransform f30623c = new CrashlyticsReportJsonTransform();

    /* renamed from: d  reason: collision with root package name */
    public static final String f30624d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e  reason: collision with root package name */
    public static final String f30625e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f  reason: collision with root package name */
    public static final Transformer f30626f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ReportQueue f30627a;

    /* renamed from: b  reason: collision with root package name */
    public final Transformer f30628b;

    public DataTransportCrashlyticsReportSender(ReportQueue reportQueue, Transformer transformer) {
        this.f30627a = reportQueue;
        this.f30628b = transformer;
    }

    public static DataTransportCrashlyticsReportSender b(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        TransportRuntime.f(context);
        TransportFactory g2 = TransportRuntime.c().g(new CCTDestination(f30624d, f30625e));
        Encoding b2 = Encoding.b("json");
        Transformer transformer = f30626f;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(g2.a("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, b2, transformer), settingsProvider.b(), onDemandCounter), transformer);
    }

    public static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public Task c(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z2) {
        return this.f30627a.i(crashlyticsReportWithSessionId, z2).a();
    }
}
