package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {

    /* renamed from: A  reason: collision with root package name */
    public final CoroutineContext f21905A;

    /* renamed from: z  reason: collision with root package name */
    public final Lifecycle f21906z;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.i(lifecycle, "lifecycle");
        Intrinsics.i(coroutineContext, "coroutineContext");
        this.f21906z = lifecycle;
        this.f21905A = coroutineContext;
        if (b().b() == Lifecycle.State.DESTROYED) {
            JobKt__JobKt.e(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public Lifecycle b() {
        return this.f21906z;
    }

    public final void d() {
        Job unused = BuildersKt__Builders_commonKt.d(this, Dispatchers.c().H0(), (CoroutineStart) null, new LifecycleCoroutineScopeImpl$register$1(this, (Continuation) null), 2, (Object) null);
    }

    public CoroutineContext getCoroutineContext() {
        return this.f21905A;
    }

    public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "source");
        Intrinsics.i(event, "event");
        if (b().b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            b().d(this);
            JobKt__JobKt.e(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }
}
