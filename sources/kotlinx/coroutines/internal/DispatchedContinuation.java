package kotlinx.coroutines.internal;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.ThreadLocalEventLoop;

@Metadata
public final class DispatchedContinuation<T> extends DispatchedTask<T> implements CoroutineStackFrame, Continuation<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    public final CoroutineDispatcher C;
    public final Continuation D;
    public Object E = DispatchedContinuationKt.f41832a;
    public final Object F = ThreadContextKt.g(f());
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public DispatchedContinuation(CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        super(-1);
        this.C = coroutineDispatcher;
        this.D = continuation;
    }

    public Continuation d() {
        return this;
    }

    public CoroutineStackFrame e() {
        Continuation continuation = this.D;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public CoroutineContext f() {
        return this.D.f();
    }

    public Object j() {
        Object obj = this.E;
        this.E = DispatchedContinuationKt.f41832a;
        return obj;
    }

    public final void k() {
        do {
        } while (G.get(this) == DispatchedContinuationKt.f41833b);
    }

    public final CancellableContinuationImpl l() {
        AtomicReferenceFieldUpdater o2 = G;
        while (true) {
            Object obj = o2.get(this);
            if (obj == null) {
                G.set(this, DispatchedContinuationKt.f41833b);
                return null;
            } else if (obj instanceof CancellableContinuationImpl) {
                if (a.a(G, this, obj, DispatchedContinuationKt.f41833b)) {
                    return (CancellableContinuationImpl) obj;
                }
            } else if (obj != DispatchedContinuationKt.f41833b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void m(CoroutineContext coroutineContext, Object obj) {
        this.E = obj;
        this.f41395B = 1;
        this.C.t0(coroutineContext, this);
    }

    public final CancellableContinuationImpl n() {
        Object obj = G.get(this);
        if (obj instanceof CancellableContinuationImpl) {
            return (CancellableContinuationImpl) obj;
        }
        return null;
    }

    public StackTraceElement p() {
        return null;
    }

    public void q(Object obj) {
        CoroutineContext f2;
        Object i2;
        Object b2 = CompletionStateKt.b(obj);
        if (DispatchedContinuationKt.d(this.C, f())) {
            this.E = b2;
            this.f41395B = 0;
            DispatchedContinuationKt.c(this.C, f(), this);
            return;
        }
        EventLoop b3 = ThreadLocalEventLoop.f41437a.b();
        if (b3.j1()) {
            this.E = b2;
            this.f41395B = 0;
            b3.S0(this);
            return;
        }
        b3.W0(true);
        try {
            f2 = f();
            i2 = ThreadContextKt.i(f2, this.F);
            this.D.q(obj);
            Unit unit = Unit.f40552a;
            ThreadContextKt.f(f2, i2);
            do {
            } while (b3.E1());
        } catch (Throwable th) {
            b3.H0(true);
            throw th;
        }
        b3.H0(true);
    }

    public final boolean r() {
        return G.get(this) != null;
    }

    public final boolean s(Throwable th) {
        AtomicReferenceFieldUpdater o2 = G;
        while (true) {
            Object obj = o2.get(this);
            Symbol symbol = DispatchedContinuationKt.f41833b;
            if (Intrinsics.d(obj, symbol)) {
                if (a.a(G, this, symbol, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (a.a(G, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.C + ", " + DebugStringsKt.c(this.D) + ']';
    }

    public final void v() {
        k();
        CancellableContinuationImpl n2 = n();
        if (n2 != null) {
            n2.s();
        }
    }

    public final Throwable x(CancellableContinuation cancellableContinuation) {
        Symbol symbol;
        AtomicReferenceFieldUpdater o2 = G;
        do {
            Object obj = o2.get(this);
            symbol = DispatchedContinuationKt.f41833b;
            if (obj != symbol) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (a.a(G, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
        } while (!a.a(G, this, symbol, cancellableContinuation));
        return null;
    }
}
