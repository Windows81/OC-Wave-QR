package kotlinx.coroutines.android;

import kotlinx.coroutines.CancellableContinuation;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ HandlerContext f41450A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f41451z;

    public /* synthetic */ b(CancellableContinuation cancellableContinuation, HandlerContext handlerContext) {
        this.f41451z = cancellableContinuation;
        this.f41450A = handlerContext;
    }

    public final void run() {
        HandlerContext.w1(this.f41451z, this.f41450A);
    }
}
