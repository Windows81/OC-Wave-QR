package kotlinx.coroutines.android;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class c implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Runnable f41452A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HandlerContext f41453z;

    public /* synthetic */ c(HandlerContext handlerContext, Runnable runnable) {
        this.f41453z = handlerContext;
        this.f41452A = runnable;
    }

    public final Object invoke(Object obj) {
        return HandlerContext.E1(this.f41453z, this.f41452A, (Throwable) obj);
    }
}
