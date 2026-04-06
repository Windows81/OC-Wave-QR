package kotlinx.coroutines;

import androidx.concurrent.futures.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

@Metadata
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame, Waiter {
    public static final /* synthetic */ AtomicIntegerFieldUpdater E;
    public static final /* synthetic */ AtomicReferenceFieldUpdater F;
    public static final /* synthetic */ AtomicReferenceFieldUpdater G;
    public final Continuation C;
    public final CoroutineContext D;
    private volatile /* synthetic */ int _decisionAndIndex$volatile = 536870911;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile = Active.f41361z;

    static {
        Class<CancellableContinuationImpl> cls = CancellableContinuationImpl.class;
        E = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex$volatile");
        Class<Object> cls2 = Object.class;
        F = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        G = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public CancellableContinuationImpl(Continuation continuation, int i2) {
        super(i2);
        this.C = continuation;
        this.D = continuation.f();
    }

    public static final Unit T(Function1 function1, Throwable th, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th);
        return Unit.f40552a;
    }

    public static /* synthetic */ void X(CancellableContinuationImpl cancellableContinuationImpl, Object obj, int i2, Function3 function3, int i3, Object obj2) {
        if (obj2 == null) {
            if ((i3 & 4) != 0) {
                function3 = null;
            }
            cancellableContinuationImpl.V(obj, i2, function3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    public final Object A() {
        Job job;
        boolean L = L();
        if (d0()) {
            if (z() == null) {
                H();
            }
            if (L) {
                R();
            }
            return IntrinsicsKt.f();
        }
        if (L) {
            R();
        }
        Object B2 = B();
        if (B2 instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) B2).f41376a;
        } else if (!DispatchedTaskKt.b(this.f41395B) || (job = (Job) f().d(Job.f41415x)) == null || job.b()) {
            return h(B2);
        } else {
            CancellationException F2 = job.F();
            a(B2, F2);
            throw F2;
        }
    }

    public final Object B() {
        return F.get(this);
    }

    public final String C() {
        Object B2 = B();
        return B2 instanceof NotCompleted ? "Active" : B2 instanceof CancelledContinuation ? "Cancelled" : "Completed";
    }

    public void G() {
        DisposableHandle H = H();
        if (H != null && t()) {
            H.d();
            G.set(this, NonDisposableHandle.f41433z);
        }
    }

    public final DisposableHandle H() {
        Job job = (Job) f().d(Job.f41415x);
        if (job == null) {
            return null;
        }
        DisposableHandle m2 = JobKt__JobKt.m(job, false, new ChildContinuation(this), 1, (Object) null);
        a.a(G, this, (Object) null, m2);
        return m2;
    }

    public final void I(Object obj) {
        Object obj2 = obj;
        AtomicReferenceFieldUpdater F2 = F;
        while (true) {
            Object obj3 = F2.get(this);
            if (obj3 instanceof Active) {
                if (a.a(F, this, obj3, obj2)) {
                    return;
                }
            } else if ((obj3 instanceof CancelHandler) || (obj3 instanceof Segment)) {
                N(obj2, obj3);
            } else if (obj3 instanceof CompletedExceptionally) {
                CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj3;
                if (!completedExceptionally.c()) {
                    N(obj2, obj3);
                }
                if (obj3 instanceof CancelledContinuation) {
                    Throwable th = null;
                    if (!(obj3 instanceof CompletedExceptionally)) {
                        completedExceptionally = null;
                    }
                    if (completedExceptionally != null) {
                        th = completedExceptionally.f41376a;
                    }
                    if (obj2 instanceof CancelHandler) {
                        m((CancelHandler) obj2, th);
                        return;
                    }
                    Intrinsics.g(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                    o((Segment) obj2, th);
                    return;
                }
                return;
            } else if (obj3 instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj3;
                if (completedContinuation.f41371b != null) {
                    N(obj2, obj3);
                }
                if (!(obj2 instanceof Segment)) {
                    Intrinsics.g(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    CancelHandler cancelHandler = (CancelHandler) obj2;
                    if (completedContinuation.c()) {
                        m(cancelHandler, completedContinuation.f41374e);
                        return;
                    }
                    if (a.a(F, this, obj3, CompletedContinuation.b(completedContinuation, (Object) null, cancelHandler, (Function3) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!(obj2 instanceof Segment)) {
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                if (a.a(F, this, obj3, new CompletedContinuation(obj3, (CancelHandler) obj2, (Function3) null, (Object) null, (Throwable) null, 28, (DefaultConstructorMarker) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public Object J(Throwable th) {
        return c0(new CompletedExceptionally(th, false, 2, (DefaultConstructorMarker) null), (Object) null, (Function3) null);
    }

    public final void K(CancelHandler cancelHandler) {
        I(cancelHandler);
    }

    public final boolean L() {
        if (DispatchedTaskKt.c(this.f41395B)) {
            Continuation continuation = this.C;
            Intrinsics.g(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((DispatchedContinuation) continuation).r()) {
                return true;
            }
        }
        return false;
    }

    public void M(CoroutineDispatcher coroutineDispatcher, Throwable th) {
        Continuation continuation = this.C;
        CoroutineDispatcher coroutineDispatcher2 = null;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        CompletedExceptionally completedExceptionally = new CompletedExceptionally(th, false, 2, (DefaultConstructorMarker) null);
        if (dispatchedContinuation != null) {
            coroutineDispatcher2 = dispatchedContinuation.C;
        }
        X(this, completedExceptionally, coroutineDispatcher2 == coroutineDispatcher ? 4 : this.f41395B, (Function3) null, 4, (Object) null);
    }

    public final void N(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String O() {
        return "CancellableContinuation";
    }

    public void P(CoroutineDispatcher coroutineDispatcher, Object obj) {
        Continuation continuation = this.C;
        CoroutineDispatcher coroutineDispatcher2 = null;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation != null) {
            coroutineDispatcher2 = dispatchedContinuation.C;
        }
        X(this, obj, coroutineDispatcher2 == coroutineDispatcher ? 4 : this.f41395B, (Function3) null, 4, (Object) null);
    }

    public final void Q(Throwable th) {
        if (!r(th)) {
            W(th);
            v();
        }
    }

    public final void R() {
        Throwable x2;
        Continuation continuation = this.C;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation != null && (x2 = dispatchedContinuation.x(this)) != null) {
            s();
            W(x2);
        }
    }

    public final boolean S() {
        Object obj = F.get(this);
        if (!(obj instanceof CompletedContinuation) || ((CompletedContinuation) obj).f41373d == null) {
            E.set(this, 536870911);
            F.set(this, Active.f41361z);
            return true;
        }
        s();
        return false;
    }

    public void U(Object obj, Function1 function1) {
        V(obj, this.f41395B, function1 != null ? new a(function1) : null);
    }

    public final void V(Object obj, int i2, Function3 function3) {
        Object obj2;
        AtomicReferenceFieldUpdater F2 = F;
        do {
            obj2 = F2.get(this);
            if (obj2 instanceof NotCompleted) {
            } else {
                if (obj2 instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) obj2;
                    if (cancelledContinuation.e()) {
                        if (function3 != null) {
                            n(function3, cancelledContinuation.f41376a, obj);
                            return;
                        }
                        return;
                    }
                }
                l(obj);
                throw new KotlinNothingValueException();
            }
        } while (!a.a(F, this, obj2, Y((NotCompleted) obj2, obj, i2, function3, (Object) null)));
        v();
        x(i2);
    }

    public boolean W(Throwable th) {
        Object obj;
        boolean z2;
        AtomicReferenceFieldUpdater F2 = F;
        do {
            obj = F2.get(this);
            z2 = false;
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            if ((obj instanceof CancelHandler) || (obj instanceof Segment)) {
                z2 = true;
            }
        } while (!a.a(F, this, obj, new CancelledContinuation(this, th, z2)));
        NotCompleted notCompleted = (NotCompleted) obj;
        if (notCompleted instanceof CancelHandler) {
            m((CancelHandler) obj, th);
        } else if (notCompleted instanceof Segment) {
            o((Segment) obj, th);
        }
        v();
        x(this.f41395B);
        return true;
    }

    public final Object Y(NotCompleted notCompleted, Object obj, int i2, Function3 function3, Object obj2) {
        if (obj instanceof CompletedExceptionally) {
            return obj;
        }
        if (!DispatchedTaskKt.b(i2) && obj2 == null) {
            return obj;
        }
        if (function3 == null && !(notCompleted instanceof CancelHandler) && obj2 == null) {
            return obj;
        }
        return new CompletedContinuation(obj, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, function3, obj2, (Throwable) null, 16, (DefaultConstructorMarker) null);
    }

    public Object Z(Object obj, Object obj2, Function3 function3) {
        return c0(obj, obj2, function3);
    }

    public void a(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater F2 = F;
        while (true) {
            Object obj2 = F2.get(this);
            if (obj2 instanceof NotCompleted) {
                throw new IllegalStateException("Not completed");
            } else if (!(obj2 instanceof CompletedExceptionally)) {
                if (obj2 instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj2;
                    if (!completedContinuation.c()) {
                        Throwable th2 = th;
                        if (a.a(F, this, obj2, CompletedContinuation.b(completedContinuation, (Object) null, (CancelHandler) null, (Function3) null, (Object) null, th, 15, (Object) null))) {
                            completedContinuation.d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once");
                    }
                } else {
                    Throwable th3 = th;
                    if (a.a(F, this, obj2, new CompletedContinuation(obj2, (CancelHandler) null, (Function3) null, (Object) null, th, 14, (DefaultConstructorMarker) null))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public void a0(Object obj) {
        x(this.f41395B);
    }

    public boolean b() {
        return B() instanceof NotCompleted;
    }

    public final boolean b0() {
        int i2;
        AtomicIntegerFieldUpdater D2 = E;
        do {
            i2 = D2.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!E.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
        return true;
    }

    public void c(Segment segment, int i2) {
        int i3;
        AtomicIntegerFieldUpdater D2 = E;
        do {
            i3 = D2.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!D2.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        I(segment);
    }

    public final Symbol c0(Object obj, Object obj2, Function3 function3) {
        Object obj3;
        AtomicReferenceFieldUpdater F2 = F;
        do {
            obj3 = F2.get(this);
            if (obj3 instanceof NotCompleted) {
            } else if (!(obj3 instanceof CompletedContinuation) || obj2 == null || ((CompletedContinuation) obj3).f41373d != obj2) {
                return null;
            } else {
                return CancellableContinuationImplKt.f41368a;
            }
        } while (!a.a(F, this, obj3, Y((NotCompleted) obj3, obj, this.f41395B, function3, obj2)));
        v();
        return CancellableContinuationImplKt.f41368a;
    }

    public final Continuation d() {
        return this.C;
    }

    public final boolean d0() {
        int i2;
        AtomicIntegerFieldUpdater D2 = E;
        do {
            i2 = D2.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!E.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        return true;
    }

    public CoroutineStackFrame e() {
        Continuation continuation = this.C;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public CoroutineContext f() {
        return this.D;
    }

    public Throwable g(Object obj) {
        Throwable g2 = super.g(obj);
        if (g2 != null) {
            return g2;
        }
        return null;
    }

    public Object h(Object obj) {
        return obj instanceof CompletedContinuation ? ((CompletedContinuation) obj).f41370a : obj;
    }

    public Object j() {
        return B();
    }

    public final Void l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void m(CancelHandler cancelHandler, Throwable th) {
        try {
            cancelHandler.e(th);
        } catch (Throwable th2) {
            CoroutineContext f2 = f();
            CoroutineExceptionHandlerKt.a(f2, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n(Function3 function3, Throwable th, Object obj) {
        try {
            function3.d(th, obj, f());
        } catch (Throwable th2) {
            CoroutineContext f2 = f();
            CoroutineExceptionHandlerKt.a(f2, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void o(Segment segment, Throwable th) {
        int i2 = E.get(this) & 536870911;
        if (i2 != 536870911) {
            try {
                segment.s(i2, th, f());
            } catch (Throwable th2) {
                CoroutineContext f2 = f();
                CoroutineExceptionHandlerKt.a(f2, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
    }

    public StackTraceElement p() {
        return null;
    }

    public void q(Object obj) {
        X(this, CompletionStateKt.c(obj, this), this.f41395B, (Function3) null, 4, (Object) null);
    }

    public final boolean r(Throwable th) {
        if (!L()) {
            return false;
        }
        Continuation continuation = this.C;
        Intrinsics.g(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((DispatchedContinuation) continuation).s(th);
    }

    public final void s() {
        DisposableHandle z2 = z();
        if (z2 != null) {
            z2.d();
            G.set(this, NonDisposableHandle.f41433z);
        }
    }

    public boolean t() {
        return !(B() instanceof NotCompleted);
    }

    public String toString() {
        return O() + '(' + DebugStringsKt.c(this.C) + "){" + C() + "}@" + DebugStringsKt.b(this);
    }

    public void u(Function1 function1) {
        CancellableContinuationKt.c(this, new CancelHandler.UserSupplied(function1));
    }

    public final void v() {
        if (!L()) {
            s();
        }
    }

    public void w(Object obj, Function3 function3) {
        V(obj, this.f41395B, function3);
    }

    public final void x(int i2) {
        if (!b0()) {
            DispatchedTaskKt.a(this, i2);
        }
    }

    public Throwable y(Job job) {
        return job.F();
    }

    public final DisposableHandle z() {
        return (DisposableHandle) G.get(this);
    }
}
