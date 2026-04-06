package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;

@Metadata
public final class EmittedSource implements DisposableHandle {

    /* renamed from: A  reason: collision with root package name */
    public final MediatorLiveData f21887A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f21888B;

    /* renamed from: z  reason: collision with root package name */
    public final LiveData f21889z;

    public EmittedSource(LiveData liveData, MediatorLiveData mediatorLiveData) {
        Intrinsics.i(liveData, "source");
        Intrinsics.i(mediatorLiveData, "mediator");
        this.f21889z = liveData;
        this.f21887A = mediatorLiveData;
    }

    public final Object b(Continuation continuation) {
        Object g2 = BuildersKt.g(Dispatchers.c().H0(), new EmittedSource$disposeNow$2(this, (Continuation) null), continuation);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }

    public final void c() {
        if (!this.f21888B) {
            this.f21887A.q(this.f21889z);
            this.f21888B = true;
        }
    }

    public void d() {
        Job unused = BuildersKt__Builders_commonKt.d(CoroutineScopeKt.a(Dispatchers.c().H0()), (CoroutineContext) null, (CoroutineStart) null, new EmittedSource$dispose$1(this, (Continuation) null), 3, (Object) null);
    }
}
