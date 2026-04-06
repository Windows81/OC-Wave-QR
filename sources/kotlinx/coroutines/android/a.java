package kotlinx.coroutines.android;

import kotlinx.coroutines.DisposableHandle;

public final /* synthetic */ class a implements DisposableHandle {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Runnable f41448A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HandlerContext f41449z;

    public /* synthetic */ a(HandlerContext handlerContext, Runnable runnable) {
        this.f41449z = handlerContext;
        this.f41448A = runnable;
    }

    public final void d() {
        HandlerContext.q1(this.f41449z, this.f41448A);
    }
}
