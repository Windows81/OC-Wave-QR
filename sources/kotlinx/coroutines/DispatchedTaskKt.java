package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata
public final class DispatchedTaskKt {
    public static final void a(DispatchedTask dispatchedTask, int i2) {
        Continuation d2 = dispatchedTask.d();
        boolean z2 = i2 == 4;
        if (z2 || !(d2 instanceof DispatchedContinuation) || b(i2) != b(dispatchedTask.f41395B)) {
            d(dispatchedTask, d2, z2);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) d2;
        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.C;
        CoroutineContext f2 = dispatchedContinuation.f();
        if (DispatchedContinuationKt.d(coroutineDispatcher, f2)) {
            DispatchedContinuationKt.c(coroutineDispatcher, f2, dispatchedTask);
        } else {
            e(dispatchedTask);
        }
    }

    public static final boolean b(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final boolean c(int i2) {
        return i2 == 2;
    }

    public static final void d(DispatchedTask dispatchedTask, Continuation continuation, boolean z2) {
        Object h2;
        Object j2 = dispatchedTask.j();
        Throwable g2 = dispatchedTask.g(j2);
        if (g2 != null) {
            Result.Companion companion = Result.f40519A;
            h2 = ResultKt.a(g2);
        } else {
            Result.Companion companion2 = Result.f40519A;
            h2 = dispatchedTask.h(j2);
        }
        Object b2 = Result.b(h2);
        if (z2) {
            Intrinsics.g(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
            Continuation continuation2 = dispatchedContinuation.D;
            Object obj = dispatchedContinuation.F;
            CoroutineContext f2 = continuation2.f();
            Object i2 = ThreadContextKt.i(f2, obj);
            UndispatchedCoroutine m2 = i2 != ThreadContextKt.f41871a ? CoroutineContextKt.m(continuation2, f2, i2) : null;
            try {
                dispatchedContinuation.D.q(b2);
                Unit unit = Unit.f40552a;
            } finally {
                if (m2 == null || m2.w1()) {
                    ThreadContextKt.f(f2, i2);
                }
            }
        } else {
            continuation.q(b2);
        }
    }

    public static final void e(DispatchedTask dispatchedTask) {
        EventLoop b2 = ThreadLocalEventLoop.f41437a.b();
        if (b2.j1()) {
            b2.S0(dispatchedTask);
            return;
        }
        b2.W0(true);
        try {
            d(dispatchedTask, dispatchedTask.d(), true);
            do {
            } while (b2.E1());
        } catch (Throwable th) {
            b2.H0(true);
            throw th;
        }
        b2.H0(true);
    }
}
