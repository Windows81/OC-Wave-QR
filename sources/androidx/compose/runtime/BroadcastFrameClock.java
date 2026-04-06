package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.AtomicInt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
public final class BroadcastFrameClock implements MonotonicFrameClock {

    /* renamed from: A  reason: collision with root package name */
    public final Object f14539A = new Object();

    /* renamed from: B  reason: collision with root package name */
    public Throwable f14540B;
    public final AtomicInt C = AtomicAwaitersCount.b();
    public MutableObjectList D = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);
    public MutableObjectList E = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public final Function0 f14541z;

    @JvmInline
    @Metadata
    public static final class AtomicAwaitersCount {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f14542b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInt f14543a;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        public static AtomicInt b() {
            return c(new AtomicInt(0));
        }

        public static AtomicInt c(AtomicInt atomicInt) {
            return atomicInt;
        }

        public static boolean d(AtomicInt atomicInt, Object obj) {
            return (obj instanceof AtomicAwaitersCount) && Intrinsics.d(atomicInt, ((AtomicAwaitersCount) obj).h());
        }

        public static int e(AtomicInt atomicInt) {
            return atomicInt.hashCode();
        }

        public static final int f(AtomicInt atomicInt, int i2, int i3) {
            return ((i2 & 15) << 27) | (134217727 & i3);
        }

        public static String g(AtomicInt atomicInt) {
            int i2 = atomicInt.get();
            return "AtomicAwaitersCount(version = " + ((i2 >>> 27) & 15) + ", count = " + (i2 & 134217727) + ')';
        }

        public boolean equals(Object obj) {
            return d(this.f14543a, obj);
        }

        public final /* synthetic */ AtomicInt h() {
            return this.f14543a;
        }

        public int hashCode() {
            return e(this.f14543a);
        }

        public String toString() {
            return g(this.f14543a);
        }
    }

    @Metadata
    public static final class FrameAwaiter<R> {

        /* renamed from: a  reason: collision with root package name */
        public Function1 f14544a;

        /* renamed from: b  reason: collision with root package name */
        public CancellableContinuation f14545b;

        public FrameAwaiter(Function1 function1, CancellableContinuation cancellableContinuation) {
            this.f14544a = function1;
            this.f14545b = cancellableContinuation;
        }

        public final void a() {
            this.f14544a = null;
            this.f14545b = null;
        }

        public final void b(long j2) {
            CancellableContinuation cancellableContinuation;
            Object obj;
            Function1 function1 = this.f14544a;
            if (function1 != null && (cancellableContinuation = this.f14545b) != null) {
                try {
                    Result.Companion companion = Result.f40519A;
                    obj = Result.b(function1.invoke(Long.valueOf(j2)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.f40519A;
                    obj = Result.b(ResultKt.a(th));
                }
                cancellableContinuation.q(obj);
            }
        }

        public final void c(Throwable th) {
            CancellableContinuation cancellableContinuation = this.f14545b;
            if (cancellableContinuation != null) {
                Result.Companion companion = Result.f40519A;
                cancellableContinuation.q(Result.b(ResultKt.a(th)));
            }
        }
    }

    public BroadcastFrameClock(Function0 function0) {
        this.f14541z = function0;
    }

    public Object Q(Function1 function1, Continuation continuation) {
        int i2;
        int i3;
        boolean z2 = true;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        FrameAwaiter frameAwaiter = new FrameAwaiter(function1, cancellableContinuationImpl);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f40906z = -1;
        synchronized (this.f14539A) {
            Throwable h2 = this.f14540B;
            if (h2 != null) {
                Result.Companion companion = Result.f40519A;
                cancellableContinuationImpl.q(Result.b(ResultKt.a(h2)));
            } else {
                AtomicInt o2 = this.C;
                do {
                    i2 = o2.get();
                    i3 = i2 + 1;
                } while (!o2.compareAndSet(i2, i3));
                if ((134217727 & i3) != 1) {
                    z2 = false;
                }
                intRef.f40906z = (i3 >>> 27) & 15;
                this.D.n(frameAwaiter);
                cancellableContinuationImpl.u(new BroadcastFrameClock$withFrameNanos$2$2(frameAwaiter, this, intRef));
                if (z2 && this.f14541z != null) {
                    try {
                        this.f14541z.invoke();
                    } catch (Throwable th) {
                        p(th);
                    }
                }
            }
        }
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2;
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return MonotonicFrameClock.DefaultImpls.b(this, key);
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return MonotonicFrameClock.DefaultImpls.c(this, key);
    }

    public Object k(Object obj, Function2 function2) {
        return MonotonicFrameClock.DefaultImpls.a(this, obj, function2);
    }

    public final void p(Throwable th) {
        int i2;
        synchronized (this.f14539A) {
            try {
                if (this.f14540B == null) {
                    this.f14540B = th;
                    MutableObjectList mutableObjectList = this.D;
                    Object[] objArr = mutableObjectList.f1937a;
                    int i3 = mutableObjectList.f1938b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ((FrameAwaiter) objArr[i4]).c(th);
                    }
                    this.D.t();
                    AtomicInt atomicInt = this.C;
                    do {
                        i2 = atomicInt.get();
                    } while (!atomicInt.compareAndSet(i2, AtomicAwaitersCount.f(atomicInt, ((i2 >>> 27) & 15) + 1, 0)));
                    Unit unit = Unit.f40552a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean q() {
        return (this.C.get() & 134217727) > 0;
    }

    public final void s(long j2) {
        int i2;
        int i3;
        synchronized (this.f14539A) {
            try {
                MutableObjectList mutableObjectList = this.D;
                this.D = this.E;
                this.E = mutableObjectList;
                AtomicInt atomicInt = this.C;
                do {
                    i2 = atomicInt.get();
                } while (!atomicInt.compareAndSet(i2, AtomicAwaitersCount.f(atomicInt, ((i2 >>> 27) & 15) + 1, 0)));
                int e2 = mutableObjectList.e();
                for (i3 = 0; i3 < e2; i3++) {
                    ((FrameAwaiter) mutableObjectList.d(i3)).b(j2);
                }
                mutableObjectList.t();
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.d(this, coroutineContext);
    }
}
