package kotlinx.coroutines.intrinsics;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata
public final class UndispatchedKt {
    public static final Void a(ScopeCoroutine scopeCoroutine, DispatchException dispatchException) {
        scopeCoroutine.R0(new CompletedExceptionally(dispatchException.getCause(), false, 2, (DefaultConstructorMarker) null));
        throw dispatchException.getCause();
    }

    public static final boolean b(ScopeCoroutine scopeCoroutine, Throwable th) {
        return !(th instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th).f41439z != scopeCoroutine;
    }

    public static final void c(Function2 function2, Object obj, Continuation continuation) {
        CoroutineContext f2;
        Object i2;
        Continuation a2 = DebugProbesKt.a(continuation);
        try {
            f2 = a2.f();
            i2 = ThreadContextKt.i(f2, (Object) null);
            DebugProbesKt.b(a2);
            Object d2 = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.d(function2, obj, a2) : ((Function2) TypeIntrinsics.e(function2, 2)).m(obj, a2);
            ThreadContextKt.f(f2, i2);
            if (d2 != IntrinsicsKt.f()) {
                a2.q(Result.b(d2));
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            Result.Companion companion = Result.f40519A;
            a2.q(Result.b(ResultKt.a(th)));
        }
    }

    public static final Object d(ScopeCoroutine scopeCoroutine, Object obj, Function2 function2) {
        return f(scopeCoroutine, true, obj, function2);
    }

    public static final Object e(ScopeCoroutine scopeCoroutine, Object obj, Function2 function2) {
        return f(scopeCoroutine, false, obj, function2);
    }

    public static final Object f(ScopeCoroutine scopeCoroutine, boolean z2, Object obj, Function2 function2) {
        Object obj2;
        try {
            obj2 = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.d(function2, obj, scopeCoroutine) : ((Function2) TypeIntrinsics.e(function2, 2)).m(obj, scopeCoroutine);
        } catch (DispatchException e2) {
            a(scopeCoroutine, e2);
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            obj2 = new CompletedExceptionally(th, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj2 == IntrinsicsKt.f()) {
            return IntrinsicsKt.f();
        }
        Object S0 = scopeCoroutine.S0(obj2);
        if (S0 == JobSupportKt.f41426b) {
            return IntrinsicsKt.f();
        }
        scopeCoroutine.v1();
        if (!(S0 instanceof CompletedExceptionally)) {
            return JobSupportKt.h(S0);
        }
        if (z2 || b(scopeCoroutine, ((CompletedExceptionally) S0).f41376a)) {
            throw ((CompletedExceptionally) S0).f41376a;
        } else if (!(obj2 instanceof CompletedExceptionally)) {
            return obj2;
        } else {
            throw ((CompletedExceptionally) obj2).f41376a;
        }
    }
}
