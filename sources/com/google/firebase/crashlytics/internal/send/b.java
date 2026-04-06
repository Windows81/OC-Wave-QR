package com.google.firebase.crashlytics.internal.send;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;

public final /* synthetic */ class b implements TransportScheduleCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReportQueue f30643a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f30644b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f30645c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CrashlyticsReportWithSessionId f30646d;

    public /* synthetic */ b(ReportQueue reportQueue, TaskCompletionSource taskCompletionSource, boolean z2, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        this.f30643a = reportQueue;
        this.f30644b = taskCompletionSource;
        this.f30645c = z2;
        this.f30646d = crashlyticsReportWithSessionId;
    }

    public final void a(Exception exc) {
        this.f30643a.n(this.f30644b, this.f30645c, this.f30646d, exc);
    }
}
