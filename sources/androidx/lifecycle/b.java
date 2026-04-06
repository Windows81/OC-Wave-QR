package androidx.lifecycle;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Runnable f22019A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DispatchQueue f22020z;

    public /* synthetic */ b(DispatchQueue dispatchQueue, Runnable runnable) {
        this.f22020z = dispatchQueue;
        this.f22019A = runnable;
    }

    public final void run() {
        DispatchQueue.d(this.f22020z, this.f22019A);
    }
}
