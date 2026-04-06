package androidx.lifecycle;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ProcessLifecycleOwner f22045z;

    public /* synthetic */ g(ProcessLifecycleOwner processLifecycleOwner) {
        this.f22045z = processLifecycleOwner;
    }

    public final void run() {
        ProcessLifecycleOwner.k(this.f22045z);
    }
}
