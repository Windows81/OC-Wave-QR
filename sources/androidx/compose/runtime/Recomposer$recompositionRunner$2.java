package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

@Metadata
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1160}, m = "invokeSuspend")
public final class Recomposer$recompositionRunner$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Recomposer G;
    public final /* synthetic */ Function3 H;
    public final /* synthetic */ MonotonicFrameClock I;

    @Metadata
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1160}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(function3, monotonicFrameClock, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Function3 function3 = function3;
                MonotonicFrameClock monotonicFrameClock = monotonicFrameClock;
                this.D = 1;
                if (function3.d((CoroutineScope) this.E, monotonicFrameClock, this) == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, Function3 function3, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
        super(2, continuation);
        this.G = recomposer;
        this.H = function3;
        this.I = monotonicFrameClock;
    }

    public static final Unit C(Recomposer recomposer, Set set, Snapshot snapshot) {
        CancellableContinuation cancellableContinuation;
        Set set2 = set;
        synchronized (recomposer.f14792c) {
            try {
                if (((Recomposer.State) recomposer.f14812w.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                    MutableScatterSet S = recomposer.f14797h;
                    if (set2 instanceof ScatterSetWrapper) {
                        ScatterSet e2 = ((ScatterSetWrapper) set2).e();
                        Object[] objArr = e2.f1967b;
                        long[] jArr = e2.f1966a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j2 = jArr[i2];
                                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((255 & j2) < 128) {
                                            Object obj = objArr[(i2 << 3) + i4];
                                            if (!(obj instanceof StateObjectImpl) || ((StateObjectImpl) obj).t(ReaderKind.a(1))) {
                                                S.h(obj);
                                            }
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i3 != 8) {
                                        break;
                                    }
                                }
                                if (i2 == length) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        for (Object next : set2) {
                            if (!(next instanceof StateObjectImpl) || ((StateObjectImpl) next).t(ReaderKind.a(1))) {
                                S.h(next);
                            }
                        }
                    }
                    cancellableContinuation = recomposer.s0();
                } else {
                    cancellableContinuation = null;
                }
            } finally {
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.f40519A;
            cancellableContinuation.q(Result.b(Unit.f40552a));
        }
        return Unit.f40552a;
    }

    /* renamed from: B */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((Recomposer$recompositionRunner$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.G, this.H, this.I, continuation);
        recomposer$recompositionRunner$2.F = obj;
        return recomposer$recompositionRunner$2;
    }

    public final Object x(Object obj) {
        Throwable th;
        Job job;
        ObserverHandle observerHandle;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            job = JobKt.k(((CoroutineScope) this.F).getCoroutineContext());
            this.G.V0(job);
            ObserverHandle i3 = Snapshot.f15255e.i(new x(this.G));
            Recomposer.C.c(this.G.f14789B);
            try {
                List W = this.G.F0();
                int size = W.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((ControlledComposition) W.get(i4)).A();
                }
                final Function3 function3 = this.H;
                final MonotonicFrameClock monotonicFrameClock = this.I;
                AnonymousClass2 r4 = new AnonymousClass2((Continuation) null);
                this.F = job;
                this.D = i3;
                this.E = 1;
                if (CoroutineScopeKt.f(r4, this) == f2) {
                    return f2;
                }
                observerHandle = i3;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                observerHandle = i3;
                th = th3;
                observerHandle.d();
                Object T = this.G.f14792c;
                Recomposer recomposer = this.G;
                synchronized (T) {
                    try {
                        if (recomposer.f14793d == job) {
                            recomposer.f14793d = null;
                        }
                        CancellableContinuation unused = recomposer.s0();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                Recomposer.C.d(this.G.f14789B);
                throw th;
            }
        } else if (i2 == 1) {
            observerHandle = (ObserverHandle) this.D;
            job = (Job) this.F;
            try {
                ResultKt.b(obj);
            } catch (Throwable th5) {
                th = th5;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        observerHandle.d();
        Object T2 = this.G.f14792c;
        Recomposer recomposer2 = this.G;
        synchronized (T2) {
            try {
                if (recomposer2.f14793d == job) {
                    recomposer2.f14793d = null;
                }
                CancellableContinuation unused2 = recomposer2.s0();
            } catch (Throwable th6) {
                throw th6;
            }
        }
        Recomposer.C.d(this.G.f14789B);
        return Unit.f40552a;
    }
}
