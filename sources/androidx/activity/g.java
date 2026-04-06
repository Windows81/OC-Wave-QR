package androidx.activity;

import androidx.activity.ComponentActivity;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.ReportFullyDrawnExecutorImpl f203z;

    public /* synthetic */ g(ComponentActivity.ReportFullyDrawnExecutorImpl reportFullyDrawnExecutorImpl) {
        this.f203z = reportFullyDrawnExecutorImpl;
    }

    public final void run() {
        ComponentActivity.ReportFullyDrawnExecutorImpl.b(this.f203z);
    }
}
