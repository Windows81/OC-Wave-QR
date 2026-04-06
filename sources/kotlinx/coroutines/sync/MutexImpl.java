package kotlinx.coroutines.sync;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;

@Metadata
public class MutexImpl extends SemaphoreAndMutexImpl implements Mutex {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41958i = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");

    /* renamed from: h  reason: collision with root package name */
    public final Function3 f41959h;
    private volatile /* synthetic */ Object owner$volatile;

    @Metadata
    public final class CancellableContinuationWithOwner implements CancellableContinuation<Unit>, Waiter {

        /* renamed from: A  reason: collision with root package name */
        public final Object f41960A;

        /* renamed from: z  reason: collision with root package name */
        public final CancellableContinuationImpl f41962z;

        public CancellableContinuationWithOwner(CancellableContinuationImpl cancellableContinuationImpl, Object obj) {
            this.f41962z = cancellableContinuationImpl;
            this.f41960A = obj;
        }

        public static final Unit h(MutexImpl mutexImpl, CancellableContinuationWithOwner cancellableContinuationWithOwner, Throwable th) {
            mutexImpl.e(cancellableContinuationWithOwner.f41960A);
            return Unit.f40552a;
        }

        public static final Unit k(MutexImpl mutexImpl, CancellableContinuationWithOwner cancellableContinuationWithOwner, Throwable th, Unit unit, CoroutineContext coroutineContext) {
            MutexImpl.f41958i.set(mutexImpl, cancellableContinuationWithOwner.f41960A);
            mutexImpl.e(cancellableContinuationWithOwner.f41960A);
            return Unit.f40552a;
        }

        public Object J(Throwable th) {
            return this.f41962z.J(th);
        }

        public void M(CoroutineDispatcher coroutineDispatcher, Throwable th) {
            this.f41962z.M(coroutineDispatcher, th);
        }

        public boolean W(Throwable th) {
            return this.f41962z.W(th);
        }

        public void a0(Object obj) {
            this.f41962z.a0(obj);
        }

        public boolean b() {
            return this.f41962z.b();
        }

        public void c(Segment segment, int i2) {
            this.f41962z.c(segment, i2);
        }

        /* renamed from: e */
        public void U(Unit unit, Function1 function1) {
            this.f41962z.U(unit, function1);
        }

        public CoroutineContext f() {
            return this.f41962z.f();
        }

        /* renamed from: g */
        public void w(Unit unit, Function3 function3) {
            MutexImpl.f41958i.set(MutexImpl.this, this.f41960A);
            this.f41962z.U(unit, new d(MutexImpl.this, this));
        }

        /* renamed from: i */
        public void P(CoroutineDispatcher coroutineDispatcher, Unit unit) {
            this.f41962z.P(coroutineDispatcher, unit);
        }

        /* renamed from: j */
        public Object Z(Unit unit, Object obj, Function3 function3) {
            Object Z = this.f41962z.Z(unit, obj, new c(MutexImpl.this, this));
            if (Z != null) {
                MutexImpl.f41958i.set(MutexImpl.this, this.f41960A);
            }
            return Z;
        }

        public void q(Object obj) {
            this.f41962z.q(obj);
        }

        public boolean t() {
            return this.f41962z.t();
        }

        public void u(Function1 function1) {
            this.f41962z.u(function1);
        }
    }

    @Metadata
    public final class SelectInstanceWithOwner<Q> implements SelectInstanceInternal<Q> {

        /* renamed from: A  reason: collision with root package name */
        public final Object f41963A;

        /* renamed from: z  reason: collision with root package name */
        public final SelectInstanceInternal f41965z;

        public SelectInstanceWithOwner(SelectInstanceInternal selectInstanceInternal, Object obj) {
            this.f41965z = selectInstanceInternal;
            this.f41963A = obj;
        }

        public void a(DisposableHandle disposableHandle) {
            this.f41965z.a(disposableHandle);
        }

        public void c(Segment segment, int i2) {
            this.f41965z.c(segment, i2);
        }

        public boolean d(Object obj, Object obj2) {
            boolean d2 = this.f41965z.d(obj, obj2);
            MutexImpl mutexImpl = MutexImpl.this;
            if (d2) {
                MutexImpl.f41958i.set(mutexImpl, this.f41963A);
            }
            return d2;
        }

        public CoroutineContext f() {
            return this.f41965z.f();
        }

        public void h(Object obj) {
            MutexImpl.f41958i.set(MutexImpl.this, this.f41963A);
            this.f41965z.h(obj);
        }
    }

    public MutexImpl(boolean z2) {
        super(1, z2 ? 1 : 0);
        this.owner$volatile = z2 ? null : MutexKt.f41966a;
        this.f41959h = new a(this);
    }

    public static /* synthetic */ Object E(MutexImpl mutexImpl, Object obj, Continuation continuation) {
        if (mutexImpl.a(obj)) {
            return Unit.f40552a;
        }
        Object F = mutexImpl.F(obj, continuation);
        return F == IntrinsicsKt.f() ? F : Unit.f40552a;
    }

    public static final Function3 I(MutexImpl mutexImpl, SelectInstance selectInstance, Object obj, Object obj2) {
        return new b(mutexImpl, obj);
    }

    public static final Unit J(MutexImpl mutexImpl, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        mutexImpl.e(obj);
        return Unit.f40552a;
    }

    public boolean C(Object obj) {
        return D(obj) == 1;
    }

    public final int D(Object obj) {
        while (b()) {
            Object obj2 = f41958i.get(this);
            if (obj2 != MutexKt.f41966a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public final Object F(Object obj, Continuation continuation) {
        CancellableContinuationImpl b2 = CancellableContinuationKt.b(IntrinsicsKt.c(continuation));
        try {
            i(new CancellableContinuationWithOwner(b2, obj));
            Object A2 = b2.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
        } catch (Throwable th) {
            b2.R();
            throw th;
        }
    }

    public Object G(Object obj, Object obj2) {
        if (!Intrinsics.d(obj2, MutexKt.f41967b)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public void H(SelectInstance selectInstance, Object obj) {
        if (obj == null || !C(obj)) {
            Intrinsics.g(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            t(new SelectInstanceWithOwner((SelectInstanceInternal) selectInstance, obj), obj);
            return;
        }
        selectInstance.h(MutexKt.f41967b);
    }

    public final int K(Object obj) {
        while (!v()) {
            if (obj == null) {
                return 1;
            }
            int D = D(obj);
            if (D == 1) {
                return 2;
            }
            if (D == 2) {
                return 1;
            }
        }
        f41958i.set(this, obj);
        return 0;
    }

    public boolean a(Object obj) {
        int K = K(obj);
        if (K == 0) {
            return true;
        }
        if (K == 1) {
            return false;
        }
        if (K != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public boolean b() {
        return n() == 0;
    }

    public Object d(Object obj, Continuation continuation) {
        return E(this, obj, continuation);
    }

    public void e(Object obj) {
        while (b()) {
            Object obj2 = f41958i.get(this);
            if (obj2 != MutexKt.f41966a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                } else if (a.a(f41958i, this, obj2, MutexKt.f41966a)) {
                    g();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + DebugStringsKt.b(this) + "[isLocked=" + b() + ",owner=" + f41958i.get(this) + ']';
    }
}
