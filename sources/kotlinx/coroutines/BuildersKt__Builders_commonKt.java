package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

@Metadata
final /* synthetic */ class BuildersKt__Builders_commonKt {
    public static final Deferred a(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2) {
        CoroutineContext k2 = CoroutineContextKt.k(coroutineScope, coroutineContext);
        DeferredCoroutine lazyDeferredCoroutine = coroutineStart.h() ? new LazyDeferredCoroutine(k2, function2) : new DeferredCoroutine(k2, true);
        lazyDeferredCoroutine.u1(coroutineStart, lazyDeferredCoroutine, function2);
        return lazyDeferredCoroutine;
    }

    public static /* synthetic */ Deferred b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f40721z;
        }
        if ((i2 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.a(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final Job c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2) {
        CoroutineContext k2 = CoroutineContextKt.k(coroutineScope, coroutineContext);
        AbstractCoroutine lazyStandaloneCoroutine = coroutineStart.h() ? new LazyStandaloneCoroutine(k2, function2) : new StandaloneCoroutine(k2, true);
        lazyStandaloneCoroutine.u1(coroutineStart, lazyStandaloneCoroutine, function2);
        return lazyStandaloneCoroutine;
    }

    public static /* synthetic */ Job d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f40721z;
        }
        if ((i2 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.c(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    /* JADX INFO: finally extract failed */
    public static final Object e(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        Object obj;
        CoroutineContext f2 = continuation.f();
        CoroutineContext j2 = CoroutineContextKt.j(f2, coroutineContext);
        JobKt.i(j2);
        if (j2 == f2) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(j2, continuation);
            obj = UndispatchedKt.d(scopeCoroutine, scopeCoroutine, function2);
        } else {
            ContinuationInterceptor.Key key = ContinuationInterceptor.f40717v;
            if (Intrinsics.d(j2.d(key), f2.d(key))) {
                UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(j2, continuation);
                CoroutineContext f3 = undispatchedCoroutine.f();
                Object i2 = ThreadContextKt.i(f3, (Object) null);
                try {
                    Object d2 = UndispatchedKt.d(undispatchedCoroutine, undispatchedCoroutine, function2);
                    ThreadContextKt.f(f3, i2);
                    obj = d2;
                } catch (Throwable th) {
                    ThreadContextKt.f(f3, i2);
                    throw th;
                }
            } else {
                DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(j2, continuation);
                CancellableKt.c(function2, dispatchedCoroutine, dispatchedCoroutine);
                obj = dispatchedCoroutine.w1();
            }
        }
        if (obj == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return obj;
    }
}
