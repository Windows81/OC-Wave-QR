package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

@Metadata
public final class PausingDispatcher extends CoroutineDispatcher {

    /* renamed from: B  reason: collision with root package name */
    public final DispatchQueue f21947B = new DispatchQueue();

    public void o0(CoroutineContext coroutineContext, Runnable runnable) {
        Intrinsics.i(coroutineContext, "context");
        Intrinsics.i(runnable, "block");
        this.f21947B.c(coroutineContext, runnable);
    }

    public boolean w0(CoroutineContext coroutineContext) {
        Intrinsics.i(coroutineContext, "context");
        if (Dispatchers.c().H0().w0(coroutineContext)) {
            return true;
        }
        return !this.f21947B.b();
    }
}
