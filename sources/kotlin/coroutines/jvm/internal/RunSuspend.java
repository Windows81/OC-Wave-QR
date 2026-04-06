package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class RunSuspend implements Continuation<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public Result f40745z;

    public CoroutineContext f() {
        return EmptyCoroutineContext.f40721z;
    }

    public void q(Object obj) {
        synchronized (this) {
            this.f40745z = Result.a(obj);
            Intrinsics.g(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            Unit unit = Unit.f40552a;
        }
    }
}
