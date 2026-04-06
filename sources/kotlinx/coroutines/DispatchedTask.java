package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.Task;

@Metadata
public abstract class DispatchedTask<T> extends Task {

    /* renamed from: B  reason: collision with root package name */
    public int f41395B;

    public DispatchedTask(int i2) {
        this.f41395B = i2;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract Continuation d();

    public Throwable g(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.f41376a;
        }
        return null;
    }

    public Object h(Object obj) {
        return obj;
    }

    public final void i(Throwable th) {
        CoroutineExceptionHandlerKt.a(d().f(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    public final void run() {
        CoroutineContext f2;
        Object i2;
        UndispatchedCoroutine m2;
        try {
            Continuation d2 = d();
            Intrinsics.g(d2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) d2;
            Continuation continuation = dispatchedContinuation.D;
            Object obj = dispatchedContinuation.F;
            f2 = continuation.f();
            i2 = ThreadContextKt.i(f2, obj);
            Job job = null;
            m2 = i2 != ThreadContextKt.f41871a ? CoroutineContextKt.m(continuation, f2, i2) : null;
            CoroutineContext f3 = continuation.f();
            Object j2 = j();
            Throwable g2 = g(j2);
            if (g2 == null && DispatchedTaskKt.b(this.f41395B)) {
                job = (Job) f3.d(Job.f41415x);
            }
            if (job != null && !job.b()) {
                CancellationException F = job.F();
                a(j2, F);
                Result.Companion companion = Result.f40519A;
                continuation.q(Result.b(ResultKt.a(F)));
            } else if (g2 != null) {
                Result.Companion companion2 = Result.f40519A;
                continuation.q(Result.b(ResultKt.a(g2)));
            } else {
                Result.Companion companion3 = Result.f40519A;
                continuation.q(Result.b(h(j2)));
            }
            Unit unit = Unit.f40552a;
            if (m2 != null) {
                if (!m2.w1()) {
                    return;
                }
            }
            ThreadContextKt.f(f2, i2);
        } catch (DispatchException e2) {
            CoroutineExceptionHandlerKt.a(d().f(), e2.getCause());
        } catch (Throwable th) {
            i(th);
        }
    }
}
