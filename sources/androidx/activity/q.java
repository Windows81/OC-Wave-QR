package androidx.activity;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FullyDrawnReporter f214z;

    public /* synthetic */ q(FullyDrawnReporter fullyDrawnReporter) {
        this.f214z = fullyDrawnReporter;
    }

    public final void run() {
        FullyDrawnReporter.h(this.f214z);
    }
}
