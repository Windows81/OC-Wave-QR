package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Callback f44305A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Response f44306B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f44307z;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 r1, Callback callback, Response response) {
        this.f44307z = r1;
        this.f44305A = callback;
        this.f44306B = response;
    }

    public final void run() {
        this.f44307z.d(this.f44305A, this.f44306B);
    }
}
