package androidx.appcompat.app;

import androidx.appcompat.app.AppLocalesStorageHelper;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Runnable f700A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AppLocalesStorageHelper.SerialExecutor f701z;

    public /* synthetic */ i(AppLocalesStorageHelper.SerialExecutor serialExecutor, Runnable runnable) {
        this.f701z = serialExecutor;
        this.f700A = runnable;
    }

    public final void run() {
        this.f701z.b(this.f700A);
    }
}
