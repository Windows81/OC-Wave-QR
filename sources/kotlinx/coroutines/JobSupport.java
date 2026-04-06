package kotlinx.coroutines;

import androidx.concurrent.futures.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata
@Deprecated
public class JobSupport implements Job, ChildJob, ParentJob {

    /* renamed from: A  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41419A;

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41420z;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @Metadata
    public static final class AwaitContinuation<T> extends CancellableContinuationImpl<T> {
        public final JobSupport H;

        public AwaitContinuation(Continuation continuation, JobSupport jobSupport) {
            super(continuation, 1);
            this.H = jobSupport;
        }

        public String O() {
            return "AwaitContinuation";
        }

        public Throwable y(Job job) {
            Throwable f2;
            Object G0 = this.H.G0();
            return (!(G0 instanceof Finishing) || (f2 = ((Finishing) G0).f()) == null) ? G0 instanceof CompletedExceptionally ? ((CompletedExceptionally) G0).f41376a : job.F() : f2;
        }
    }

    @Metadata
    public static final class ChildCompletion extends JobNode {
        public final JobSupport D;
        public final Finishing E;
        public final ChildHandleNode F;
        public final Object G;

        public ChildCompletion(JobSupport jobSupport, Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
            this.D = jobSupport;
            this.E = finishing;
            this.F = childHandleNode;
            this.G = obj;
        }

        public boolean w() {
            return false;
        }

        public void x(Throwable th) {
            this.D.v0(this.E, this.F, this.G);
        }
    }

    @Metadata
    public static final class Finishing implements Incomplete {

        /* renamed from: A  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f41421A;

        /* renamed from: B  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f41422B;
        public static final /* synthetic */ AtomicReferenceFieldUpdater C;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: z  reason: collision with root package name */
        public final NodeList f41423z;

        static {
            Class<Finishing> cls = Finishing.class;
            f41421A = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting$volatile");
            Class<Object> cls2 = Object.class;
            f41422B = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause$volatile");
            C = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder$volatile");
        }

        public Finishing(NodeList nodeList, boolean z2, Throwable th) {
            this.f41423z = nodeList;
            this._isCompleting$volatile = z2 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        public NodeList a() {
            return this.f41423z;
        }

        public boolean b() {
            return f() == null;
        }

        public final void c(Throwable th) {
            Throwable f2 = f();
            if (f2 == null) {
                p(th);
            } else if (th != f2) {
                Object e2 = e();
                if (e2 == null) {
                    o(th);
                } else if (e2 instanceof Throwable) {
                    if (th != e2) {
                        ArrayList d2 = d();
                        d2.add(e2);
                        d2.add(th);
                        o(d2);
                    }
                } else if (e2 instanceof ArrayList) {
                    ((ArrayList) e2).add(th);
                } else {
                    throw new IllegalStateException(("State is " + e2).toString());
                }
            }
        }

        public final ArrayList d() {
            return new ArrayList(4);
        }

        public final Object e() {
            return C.get(this);
        }

        public final Throwable f() {
            return (Throwable) f41422B.get(this);
        }

        public final boolean j() {
            return f() != null;
        }

        public final boolean k() {
            return f41421A.get(this) == 1;
        }

        public final boolean l() {
            return e() == JobSupportKt.f41429e;
        }

        public final List m(Throwable th) {
            ArrayList arrayList;
            Object e2 = e();
            if (e2 == null) {
                arrayList = d();
            } else if (e2 instanceof Throwable) {
                ArrayList d2 = d();
                d2.add(e2);
                arrayList = d2;
            } else if (e2 instanceof ArrayList) {
                arrayList = (ArrayList) e2;
            } else {
                throw new IllegalStateException(("State is " + e2).toString());
            }
            Throwable f2 = f();
            if (f2 != null) {
                arrayList.add(0, f2);
            }
            if (th != null && !Intrinsics.d(th, f2)) {
                arrayList.add(th);
            }
            o(JobSupportKt.f41429e);
            return arrayList;
        }

        public final void n(boolean z2) {
            f41421A.set(this, z2 ? 1 : 0);
        }

        public final void o(Object obj) {
            C.set(this, obj);
        }

        public final void p(Throwable th) {
            f41422B.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + a() + ']';
        }
    }

    @Metadata
    public final class SelectOnAwaitCompletionHandler extends JobNode {
        public final SelectInstance D;

        public SelectOnAwaitCompletionHandler(SelectInstance selectInstance) {
            this.D = selectInstance;
        }

        public boolean w() {
            return false;
        }

        public void x(Throwable th) {
            Object G0 = JobSupport.this.G0();
            if (!(G0 instanceof CompletedExceptionally)) {
                G0 = JobSupportKt.h(G0);
            }
            this.D.d(JobSupport.this, G0);
        }
    }

    @Metadata
    public final class SelectOnJoinCompletionHandler extends JobNode {
        public final SelectInstance D;

        public SelectOnJoinCompletionHandler(SelectInstance selectInstance) {
            this.D = selectInstance;
        }

        public boolean w() {
            return false;
        }

        public void x(Throwable th) {
            this.D.d(JobSupport.this, Unit.f40552a);
        }
    }

    static {
        Class<JobSupport> cls = JobSupport.class;
        Class<Object> cls2 = Object.class;
        f41420z = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        f41419A = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public JobSupport(boolean z2) {
        this._state$volatile = z2 ? JobSupportKt.f41431g : JobSupportKt.f41430f;
    }

    public static /* synthetic */ CancellationException k1(JobSupport jobSupport, Throwable th, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            return jobSupport.j1(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable A0(kotlinx.coroutines.JobSupport.Finishing r5, java.util.List r6) {
        /*
            r4 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r5 = r5.j()
            if (r5 == 0) goto L_0x0017
            kotlinx.coroutines.JobCancellationException r5 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r6 = r4.r0()
            r5.<init>(r6, r1, r4)
            return r5
        L_0x0017:
            return r1
        L_0x0018:
            r5 = r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r0 = r5.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L_0x001f
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L_0x0037
            return r2
        L_0x0037:
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            boolean r0 = r6 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r0 == 0) goto L_0x005f
            java.util.Iterator r5 = r5.iterator()
        L_0x0046:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r5.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == r6) goto L_0x0046
            boolean r2 = r2 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r2 == 0) goto L_0x0046
            r1 = r0
        L_0x005a:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x005f
            return r1
        L_0x005f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.A0(kotlinx.coroutines.JobSupport$Finishing, java.util.List):java.lang.Throwable");
    }

    public boolean B0() {
        return true;
    }

    public final Sequence C() {
        return SequencesKt.b(new JobSupport$children$1(this, (Continuation) null));
    }

    public boolean C0() {
        return false;
    }

    public final Object D(Continuation continuation) {
        if (!O0()) {
            JobKt.i(continuation.f());
            return Unit.f40552a;
        }
        Object P0 = P0(continuation);
        return P0 == IntrinsicsKt.f() ? P0 : Unit.f40552a;
    }

    public final NodeList D0(Incomplete incomplete) {
        NodeList a2 = incomplete.a();
        if (a2 != null) {
            return a2;
        }
        if (incomplete instanceof Empty) {
            return new NodeList();
        }
        if (incomplete instanceof JobNode) {
            d1((JobNode) incomplete);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + incomplete).toString());
    }

    public final DisposableHandle E(boolean z2, boolean z3, Function1 function1) {
        return M0(z3, z2 ? new InvokeOnCancelling(function1) : new InvokeOnCompletion(function1));
    }

    public Job E0() {
        ChildHandle F0 = F0();
        if (F0 != null) {
            return F0.getParent();
        }
        return null;
    }

    public final CancellationException F() {
        Object G0 = G0();
        if (G0 instanceof Finishing) {
            Throwable f2 = ((Finishing) G0).f();
            if (f2 != null) {
                CancellationException j1 = j1(f2, DebugStringsKt.a(this) + " is cancelling");
                if (j1 != null) {
                    return j1;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (G0 instanceof Incomplete) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (G0 instanceof CompletedExceptionally) {
            return k1(this, ((CompletedExceptionally) G0).f41376a, (String) null, 1, (Object) null);
        } else {
            return new JobCancellationException(DebugStringsKt.a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    public final ChildHandle F0() {
        return (ChildHandle) f41419A.get(this);
    }

    public final Object G0() {
        return f41420z.get(this);
    }

    public boolean J0(Throwable th) {
        return false;
    }

    public void K0(Throwable th) {
        throw th;
    }

    public final void L0(Job job) {
        if (job == null) {
            g1(NonDisposableHandle.f41433z);
            return;
        }
        job.start();
        ChildHandle s0 = job.s0(this);
        g1(s0);
        if (t()) {
            s0.d();
            g1(NonDisposableHandle.f41433z);
        }
    }

    public final DisposableHandle M0(boolean z2, JobNode jobNode) {
        boolean z3;
        Throwable th;
        boolean z4;
        jobNode.y(this);
        while (true) {
            Object G0 = G0();
            z3 = true;
            th = null;
            if (!(G0 instanceof Empty)) {
                if (!(G0 instanceof Incomplete)) {
                    z3 = false;
                    break;
                }
                Incomplete incomplete = (Incomplete) G0;
                NodeList a2 = incomplete.a();
                if (a2 == null) {
                    Intrinsics.g(G0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    d1((JobNode) G0);
                } else {
                    if (jobNode.w()) {
                        Finishing finishing = incomplete instanceof Finishing ? (Finishing) incomplete : null;
                        Throwable f2 = finishing != null ? finishing.f() : null;
                        if (f2 == null) {
                            z4 = a2.c(jobNode, 5);
                        } else {
                            if (z2) {
                                jobNode.x(f2);
                            }
                            return NonDisposableHandle.f41433z;
                        }
                    } else {
                        z4 = a2.c(jobNode, 1);
                    }
                    if (z4) {
                        break;
                    }
                }
            } else {
                Empty empty = (Empty) G0;
                if (!empty.b()) {
                    c1(empty);
                } else if (a.a(f41420z, this, G0, jobNode)) {
                    break;
                }
            }
        }
        if (z3) {
            return jobNode;
        }
        if (z2) {
            Object G02 = G0();
            CompletedExceptionally completedExceptionally = G02 instanceof CompletedExceptionally ? (CompletedExceptionally) G02 : null;
            if (completedExceptionally != null) {
                th = completedExceptionally.f41376a;
            }
            jobNode.x(th);
        }
        return NonDisposableHandle.f41433z;
    }

    public final void N(ParentJob parentJob) {
        l0(parentJob);
    }

    public boolean N0() {
        return false;
    }

    public final boolean O0() {
        Object G0;
        do {
            G0 = G0();
            if (!(G0 instanceof Incomplete)) {
                return false;
            }
        } while (h1(G0) < 0);
        return true;
    }

    public final Object P0(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        CancellableContinuationKt.a(cancellableContinuationImpl, JobKt__JobKt.m(this, false, new ResumeOnCompletion(cancellableContinuationImpl), 1, (Object) null));
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        V0(((kotlinx.coroutines.JobSupport.Finishing) r2).a(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return kotlinx.coroutines.JobSupportKt.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Q0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.G0()
            boolean r3 = r2 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r3 == 0) goto L_0x0050
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3     // Catch:{ all -> 0x001a }
            boolean r3 = r3.l()     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x001c
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.f41428d     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r7 = move-exception
            goto L_0x004e
        L_0x001c:
            r3 = r2
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3     // Catch:{ all -> 0x001a }
            boolean r3 = r3.j()     // Catch:{ all -> 0x001a }
            if (r7 != 0) goto L_0x0027
            if (r3 != 0) goto L_0x0033
        L_0x0027:
            if (r1 != 0) goto L_0x002d
            java.lang.Throwable r1 = r6.w0(r7)     // Catch:{ all -> 0x001a }
        L_0x002d:
            r7 = r2
            kotlinx.coroutines.JobSupport$Finishing r7 = (kotlinx.coroutines.JobSupport.Finishing) r7     // Catch:{ all -> 0x001a }
            r7.c(r1)     // Catch:{ all -> 0x001a }
        L_0x0033:
            r7 = r2
            kotlinx.coroutines.JobSupport$Finishing r7 = (kotlinx.coroutines.JobSupport.Finishing) r7     // Catch:{ all -> 0x001a }
            java.lang.Throwable r7 = r7.f()     // Catch:{ all -> 0x001a }
            if (r3 != 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            kotlinx.coroutines.JobSupport$Finishing r2 = (kotlinx.coroutines.JobSupport.Finishing) r2
            kotlinx.coroutines.NodeList r7 = r2.a()
            r6.V0(r7, r0)
        L_0x0049:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.f41425a
            return r7
        L_0x004e:
            monitor-exit(r2)
            throw r7
        L_0x0050:
            boolean r3 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r3 == 0) goto L_0x00a1
            if (r1 != 0) goto L_0x005a
            java.lang.Throwable r1 = r6.w0(r7)
        L_0x005a:
            r3 = r2
            kotlinx.coroutines.Incomplete r3 = (kotlinx.coroutines.Incomplete) r3
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x006e
            boolean r2 = r6.n1(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.f41425a
            return r7
        L_0x006e:
            kotlinx.coroutines.CompletedExceptionally r3 = new kotlinx.coroutines.CompletedExceptionally
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.o1(r2, r3)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.f41425a
            if (r3 == r4) goto L_0x0086
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.f41427c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0086:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a1:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.f41428d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.Q0(java.lang.Object):java.lang.Object");
    }

    public final boolean R0(Object obj) {
        Object o1;
        do {
            o1 = o1(G0(), obj);
            if (o1 == JobSupportKt.f41425a) {
                return false;
            }
            if (o1 == JobSupportKt.f41426b) {
                return true;
            }
        } while (o1 == JobSupportKt.f41427c);
        h0(o1);
        return true;
    }

    public final DisposableHandle S(Function1 function1) {
        return M0(true, new InvokeOnCompletion(function1));
    }

    public final Object S0(Object obj) {
        Object o1;
        do {
            o1 = o1(G0(), obj);
            if (o1 == JobSupportKt.f41425a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, z0(obj));
            }
        } while (o1 == JobSupportKt.f41427c);
        return o1;
    }

    public String T0() {
        return DebugStringsKt.a(this);
    }

    public final ChildHandleNode U0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.r()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.n();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m();
            if (!lockFreeLinkedListNode.r()) {
                if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                    return (ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof NodeList) {
                    return null;
                }
            }
        }
    }

    public final void V0(NodeList nodeList, Throwable th) {
        Z0(th);
        nodeList.g(4);
        Object l2 = nodeList.l();
        Intrinsics.g(l2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) l2; !Intrinsics.d(lockFreeLinkedListNode, nodeList); lockFreeLinkedListNode = lockFreeLinkedListNode.m()) {
            if ((lockFreeLinkedListNode instanceof JobNode) && ((JobNode) lockFreeLinkedListNode).w()) {
                try {
                    ((JobNode) lockFreeLinkedListNode).x(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ExceptionsKt.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNode + " for " + this, th2);
                        Unit unit = Unit.f40552a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            K0(completionHandlerException);
        }
        q0(th);
    }

    public final void W0(NodeList nodeList, Throwable th) {
        nodeList.g(1);
        Object l2 = nodeList.l();
        Intrinsics.g(l2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) l2; !Intrinsics.d(lockFreeLinkedListNode, nodeList); lockFreeLinkedListNode = lockFreeLinkedListNode.m()) {
            if (lockFreeLinkedListNode instanceof JobNode) {
                try {
                    ((JobNode) lockFreeLinkedListNode).x(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ExceptionsKt.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNode + " for " + this, th2);
                        Unit unit = Unit.f40552a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            K0(completionHandlerException);
        }
    }

    public final Object X0(Object obj, Object obj2) {
        if (!(obj2 instanceof CompletedExceptionally)) {
            return obj2;
        }
        throw ((CompletedExceptionally) obj2).f41376a;
    }

    public final void Y0(SelectInstance selectInstance, Object obj) {
        Object G0;
        do {
            G0 = G0();
            if (!(G0 instanceof Incomplete)) {
                if (!(G0 instanceof CompletedExceptionally)) {
                    G0 = JobSupportKt.h(G0);
                }
                selectInstance.h(G0);
                return;
            }
        } while (h1(G0) < 0);
        selectInstance.a(JobKt__JobKt.m(this, false, new SelectOnAwaitCompletionHandler(selectInstance), 1, (Object) null));
    }

    public void Z0(Throwable th) {
    }

    public void a1(Object obj) {
    }

    public boolean b() {
        Object G0 = G0();
        return (G0 instanceof Incomplete) && ((Incomplete) G0).b();
    }

    public void b1() {
    }

    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(r0(), (Throwable) null, this);
        }
        o0(cancellationException);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.InactiveNodeList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c1(kotlinx.coroutines.Empty r3) {
        /*
            r2 = this;
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.InactiveNodeList r1 = new kotlinx.coroutines.InactiveNodeList
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f41420z
            androidx.concurrent.futures.a.a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.c1(kotlinx.coroutines.Empty):void");
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return Job.DefaultImpls.c(this, key);
    }

    public final void d1(JobNode jobNode) {
        jobNode.f(new NodeList());
        a.a(f41420z, this, jobNode, jobNode.m());
    }

    public final void e1(SelectInstance selectInstance, Object obj) {
        if (!O0()) {
            selectInstance.h(Unit.f40552a);
        } else {
            selectInstance.a(JobKt__JobKt.m(this, false, new SelectOnJoinCompletionHandler(selectInstance), 1, (Object) null));
        }
    }

    public final void f0(Throwable th, List list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    ExceptionsKt.a(th, th2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f1(kotlinx.coroutines.JobNode r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.G0()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobNode
            if (r1 == 0) goto L_0x001a
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f41420z
            kotlinx.coroutines.Empty r2 = kotlinx.coroutines.JobSupportKt.f41431g
            boolean r0 = androidx.concurrent.futures.a.a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x001a:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 == 0) goto L_0x0029
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            kotlinx.coroutines.NodeList r0 = r0.a()
            if (r0 == 0) goto L_0x0029
            r4.s()
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.f1(kotlinx.coroutines.JobNode):void");
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return Job.DefaultImpls.d(this, key);
    }

    public CancellationException g0() {
        Throwable th;
        Object G0 = G0();
        CancellationException cancellationException = null;
        if (G0 instanceof Finishing) {
            th = ((Finishing) G0).f();
        } else if (G0 instanceof CompletedExceptionally) {
            th = ((CompletedExceptionally) G0).f41376a;
        } else if (!(G0 instanceof Incomplete)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + G0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + i1(G0), th, this);
    }

    public final void g1(ChildHandle childHandle) {
        f41419A.set(this, childHandle);
    }

    public final CoroutineContext.Key getKey() {
        return Job.f41415x;
    }

    public void h0(Object obj) {
    }

    public final int h1(Object obj) {
        if (obj instanceof Empty) {
            if (((Empty) obj).b()) {
                return 0;
            }
            if (!a.a(f41420z, this, obj, JobSupportKt.f41431g)) {
                return -1;
            }
            b1();
            return 1;
        } else if (!(obj instanceof InactiveNodeList)) {
            return 0;
        } else {
            if (!a.a(f41420z, this, obj, ((InactiveNodeList) obj).a())) {
                return -1;
            }
            b1();
            return 1;
        }
    }

    public final Object i0(Continuation continuation) {
        Object G0;
        do {
            G0 = G0();
            if (!(G0 instanceof Incomplete)) {
                if (!(G0 instanceof CompletedExceptionally)) {
                    return JobSupportKt.h(G0);
                }
                throw ((CompletedExceptionally) G0).f41376a;
            }
        } while (h1(G0) < 0);
        return j0(continuation);
    }

    public final String i1(Object obj) {
        if (!(obj instanceof Finishing)) {
            return obj instanceof Incomplete ? ((Incomplete) obj).b() ? "Active" : "New" : obj instanceof CompletedExceptionally ? "Cancelled" : "Completed";
        }
        Finishing finishing = (Finishing) obj;
        return finishing.j() ? "Cancelling" : finishing.k() ? "Completing" : "Active";
    }

    public final boolean isCancelled() {
        Object G0 = G0();
        return (G0 instanceof CompletedExceptionally) || ((G0 instanceof Finishing) && ((Finishing) G0).j());
    }

    public final Object j0(Continuation continuation) {
        AwaitContinuation awaitContinuation = new AwaitContinuation(IntrinsicsKt.c(continuation), this);
        awaitContinuation.G();
        CancellableContinuationKt.a(awaitContinuation, JobKt__JobKt.m(this, false, new ResumeAwaitOnCompletion(awaitContinuation), 1, (Object) null));
        Object A2 = awaitContinuation.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2;
    }

    public final CancellationException j1(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = r0();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    public Object k(Object obj, Function2 function2) {
        return Job.DefaultImpls.b(this, obj, function2);
    }

    public final boolean k0(Throwable th) {
        return l0(th);
    }

    public final boolean l0(Object obj) {
        Object a2 = JobSupportKt.f41425a;
        if (C0() && (a2 = p0(obj)) == JobSupportKt.f41426b) {
            return true;
        }
        if (a2 == JobSupportKt.f41425a) {
            a2 = Q0(obj);
        }
        if (a2 == JobSupportKt.f41425a || a2 == JobSupportKt.f41426b) {
            return true;
        }
        if (a2 == JobSupportKt.f41428d) {
            return false;
        }
        h0(a2);
        return true;
    }

    public final String l1() {
        return T0() + '{' + i1(G0()) + '}';
    }

    public final boolean m1(Incomplete incomplete, Object obj) {
        if (!a.a(f41420z, this, incomplete, JobSupportKt.g(obj))) {
            return false;
        }
        Z0((Throwable) null);
        a1(obj);
        u0(incomplete, obj);
        return true;
    }

    public final boolean n1(Incomplete incomplete, Throwable th) {
        NodeList D0 = D0(incomplete);
        if (D0 == null) {
            return false;
        }
        if (!a.a(f41420z, this, incomplete, new Finishing(D0, false, th))) {
            return false;
        }
        V0(D0, th);
        return true;
    }

    public void o0(Throwable th) {
        l0(th);
    }

    public final Object o1(Object obj, Object obj2) {
        return !(obj instanceof Incomplete) ? JobSupportKt.f41425a : (((obj instanceof Empty) || (obj instanceof JobNode)) && !(obj instanceof ChildHandleNode) && !(obj2 instanceof CompletedExceptionally)) ? m1((Incomplete) obj, obj2) ? obj2 : JobSupportKt.f41427c : p1((Incomplete) obj, obj2);
    }

    public final Object p0(Object obj) {
        Object o1;
        do {
            Object G0 = G0();
            if (!(G0 instanceof Incomplete) || ((G0 instanceof Finishing) && ((Finishing) G0).k())) {
                return JobSupportKt.f41425a;
            }
            o1 = o1(G0, new CompletedExceptionally(w0(obj), false, 2, (DefaultConstructorMarker) null));
        } while (o1 == JobSupportKt.f41427c);
        return o1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0067, code lost:
        if (r2 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0069, code lost:
        V0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006c, code lost:
        r6 = U0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
        if (r6 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0076, code lost:
        if (q1(r1, r6, r7) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007a, code lost:
        return kotlinx.coroutines.JobSupportKt.f41426b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007b, code lost:
        r0.g(2);
        r6 = U0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0083, code lost:
        if (r6 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0089, code lost:
        if (q1(r1, r6, r7) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008d, code lost:
        return kotlinx.coroutines.JobSupportKt.f41426b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0092, code lost:
        return x0(r1, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p1(kotlinx.coroutines.Incomplete r6, java.lang.Object r7) {
        /*
            r5 = this;
            kotlinx.coroutines.NodeList r0 = r5.D0(r6)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.JobSupportKt.f41427c
            return r6
        L_0x000b:
            boolean r1 = r6 instanceof kotlinx.coroutines.JobSupport.Finishing
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r6
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            kotlinx.coroutines.JobSupport$Finishing r1 = new kotlinx.coroutines.JobSupport$Finishing
            r1.<init>(r0, r3, r2)
        L_0x001d:
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            monitor-enter(r1)
            boolean r4 = r1.k()     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x0031
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.JobSupportKt.f41425a     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            return r6
        L_0x002f:
            r6 = move-exception
            goto L_0x0093
        L_0x0031:
            r4 = 1
            r1.n(r4)     // Catch:{ all -> 0x002f }
            if (r1 == r6) goto L_0x0047
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f41420z     // Catch:{ all -> 0x002f }
            boolean r6 = androidx.concurrent.futures.a.a(r4, r5, r6, r1)     // Catch:{ all -> 0x002f }
            if (r6 != 0) goto L_0x0047
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.JobSupportKt.f41427c     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            return r6
        L_0x0047:
            boolean r6 = r1.j()     // Catch:{ all -> 0x002f }
            boolean r4 = r7 instanceof kotlinx.coroutines.CompletedExceptionally     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x0053
            r4 = r7
            kotlinx.coroutines.CompletedExceptionally r4 = (kotlinx.coroutines.CompletedExceptionally) r4     // Catch:{ all -> 0x002f }
            goto L_0x0054
        L_0x0053:
            r4 = r2
        L_0x0054:
            if (r4 == 0) goto L_0x005b
            java.lang.Throwable r4 = r4.f41376a     // Catch:{ all -> 0x002f }
            r1.c(r4)     // Catch:{ all -> 0x002f }
        L_0x005b:
            java.lang.Throwable r4 = r1.f()     // Catch:{ all -> 0x002f }
            if (r6 != 0) goto L_0x0062
            r2 = r4
        L_0x0062:
            r3.f40908z = r2     // Catch:{ all -> 0x002f }
            kotlin.Unit r6 = kotlin.Unit.f40552a     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x006c
            r5.V0(r0, r2)
        L_0x006c:
            kotlinx.coroutines.ChildHandleNode r6 = r5.U0(r0)
            if (r6 == 0) goto L_0x007b
            boolean r6 = r5.q1(r1, r6, r7)
            if (r6 == 0) goto L_0x007b
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.JobSupportKt.f41426b
            return r6
        L_0x007b:
            r6 = 2
            r0.g(r6)
            kotlinx.coroutines.ChildHandleNode r6 = r5.U0(r0)
            if (r6 == 0) goto L_0x008e
            boolean r6 = r5.q1(r1, r6, r7)
            if (r6 == 0) goto L_0x008e
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.JobSupportKt.f41426b
            return r6
        L_0x008e:
            java.lang.Object r6 = r5.x0(r1, r7)
            return r6
        L_0x0093:
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.p1(kotlinx.coroutines.Incomplete, java.lang.Object):java.lang.Object");
    }

    public final boolean q0(Throwable th) {
        if (N0()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        ChildHandle F0 = F0();
        return (F0 == null || F0 == NonDisposableHandle.f41433z) ? z2 : F0.h(th) || z2;
    }

    public final boolean q1(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        while (JobKt.l(childHandleNode.D, false, new ChildCompletion(this, finishing, childHandleNode, obj)) == NonDisposableHandle.f41433z) {
            childHandleNode = U0(childHandleNode);
            if (childHandleNode == null) {
                return false;
            }
        }
        return true;
    }

    public String r0() {
        return "Job was cancelled";
    }

    public final ChildHandle s0(ChildJob childJob) {
        ChildHandleNode childHandleNode = new ChildHandleNode(childJob);
        childHandleNode.y(this);
        while (true) {
            Object G0 = G0();
            if (G0 instanceof Empty) {
                Empty empty = (Empty) G0;
                if (!empty.b()) {
                    c1(empty);
                } else if (a.a(f41420z, this, G0, childHandleNode)) {
                    break;
                }
            } else {
                Throwable th = null;
                if (G0 instanceof Incomplete) {
                    NodeList a2 = ((Incomplete) G0).a();
                    if (a2 == null) {
                        Intrinsics.g(G0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        d1((JobNode) G0);
                    } else if (!a2.c(childHandleNode, 7)) {
                        boolean c2 = a2.c(childHandleNode, 3);
                        Object G02 = G0();
                        if (G02 instanceof Finishing) {
                            th = ((Finishing) G02).f();
                        } else {
                            CompletedExceptionally completedExceptionally = G02 instanceof CompletedExceptionally ? (CompletedExceptionally) G02 : null;
                            if (completedExceptionally != null) {
                                th = completedExceptionally.f41376a;
                            }
                        }
                        childHandleNode.x(th);
                        if (!c2) {
                            return NonDisposableHandle.f41433z;
                        }
                    }
                } else {
                    Object G03 = G0();
                    CompletedExceptionally completedExceptionally2 = G03 instanceof CompletedExceptionally ? (CompletedExceptionally) G03 : null;
                    if (completedExceptionally2 != null) {
                        th = completedExceptionally2.f41376a;
                    }
                    childHandleNode.x(th);
                    return NonDisposableHandle.f41433z;
                }
            }
        }
        return childHandleNode;
    }

    public final boolean start() {
        int h1;
        do {
            h1 = h1(G0());
            if (h1 == 0) {
                return false;
            }
        } while (h1 != 1);
        return true;
    }

    public final boolean t() {
        return !(G0() instanceof Incomplete);
    }

    public boolean t0(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return l0(th) && B0();
    }

    public String toString() {
        return l1() + '@' + DebugStringsKt.b(this);
    }

    public final void u0(Incomplete incomplete, Object obj) {
        ChildHandle F0 = F0();
        if (F0 != null) {
            F0.d();
            g1(NonDisposableHandle.f41433z);
        }
        Throwable th = null;
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            th = completedExceptionally.f41376a;
        }
        if (incomplete instanceof JobNode) {
            try {
                ((JobNode) incomplete).x(th);
            } catch (Throwable th2) {
                K0(new CompletionHandlerException("Exception in completion handler " + incomplete + " for " + this, th2));
            }
        } else {
            NodeList a2 = incomplete.a();
            if (a2 != null) {
                W0(a2, th);
            }
        }
    }

    public final void v0(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        ChildHandleNode U0 = U0(childHandleNode);
        if (U0 == null || !q1(finishing, U0, obj)) {
            finishing.a().g(2);
            ChildHandleNode U02 = U0(childHandleNode);
            if (U02 == null || !q1(finishing, U02, obj)) {
                h0(x0(finishing, obj));
            }
        }
    }

    public final Throwable w0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(r0(), (Throwable) null, this) : th;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ParentJob) obj).g0();
    }

    public final Object x0(Finishing finishing, Object obj) {
        boolean j2;
        Throwable A0;
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.f41376a : null;
        synchronized (finishing) {
            j2 = finishing.j();
            List m2 = finishing.m(th);
            A0 = A0(finishing, m2);
            if (A0 != null) {
                f0(A0, m2);
            }
        }
        if (!(A0 == null || A0 == th)) {
            obj = new CompletedExceptionally(A0, false, 2, (DefaultConstructorMarker) null);
        }
        if (A0 != null && (q0(A0) || J0(A0))) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((CompletedExceptionally) obj).c();
        }
        if (!j2) {
            Z0(A0);
        }
        a1(obj);
        a.a(f41420z, this, finishing, JobSupportKt.g(obj));
        u0(finishing, obj);
        return obj;
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return Job.DefaultImpls.e(this, coroutineContext);
    }

    public final Object y0() {
        Object G0 = G0();
        if (G0 instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        } else if (!(G0 instanceof CompletedExceptionally)) {
            return JobSupportKt.h(G0);
        } else {
            throw ((CompletedExceptionally) G0).f41376a;
        }
    }

    public final Throwable z0(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.f41376a;
        }
        return null;
    }
}
