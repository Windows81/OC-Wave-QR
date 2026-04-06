package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Callback f44308A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Throwable f44309B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f44310z;

    public /* synthetic */ b(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 r1, Callback callback, Throwable th) {
        this.f44310z = r1;
        this.f44308A = callback;
        this.f44309B = th;
    }

    public final void run() {
        this.f44310z.c(this.f44308A, this.f44309B);
    }
}
