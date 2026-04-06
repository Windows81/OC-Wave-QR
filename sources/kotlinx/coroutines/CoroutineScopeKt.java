package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

@Metadata
public final class CoroutineScopeKt {
    public static final CoroutineScope a(CoroutineContext coroutineContext) {
        if (coroutineContext.d(Job.f41415x) == null) {
            coroutineContext = coroutineContext.y(JobKt__JobKt.b((Job) null, 1, (Object) null));
        }
        return new ContextScope(coroutineContext);
    }

    public static final CoroutineScope b() {
        return new ContextScope(SupervisorKt.b((Job) null, 1, (Object) null).y(Dispatchers.c()));
    }

    public static final void c(CoroutineScope coroutineScope, String str, Throwable th) {
        d(coroutineScope, ExceptionsKt.a(str, th));
    }

    public static final void d(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getCoroutineContext().d(Job.f41415x);
        if (job != null) {
            job.c(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
    }

    public static /* synthetic */ void e(CoroutineScope coroutineScope, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        d(coroutineScope, cancellationException);
    }

    public static final Object f(Function2 function2, Continuation continuation) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation.f(), continuation);
        Object d2 = UndispatchedKt.d(scopeCoroutine, scopeCoroutine, function2);
        if (d2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return d2;
    }

    public static final void g(CoroutineScope coroutineScope) {
        JobKt.i(coroutineScope.getCoroutineContext());
    }

    public static final boolean h(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getCoroutineContext().d(Job.f41415x);
        if (job != null) {
            return job.b();
        }
        return true;
    }

    public static final CoroutineScope i(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        return new ContextScope(coroutineScope.getCoroutineContext().y(coroutineContext));
    }
}
