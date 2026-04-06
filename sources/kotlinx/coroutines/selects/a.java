package kotlinx.coroutines.selects;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ OnTimeout f41954A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectInstance f41955z;

    public /* synthetic */ a(SelectInstance selectInstance, OnTimeout onTimeout) {
        this.f41955z = selectInstance;
        this.f41954A = onTimeout;
    }

    public final void run() {
        OnTimeout.e(this.f41955z, this.f41954A);
    }
}
