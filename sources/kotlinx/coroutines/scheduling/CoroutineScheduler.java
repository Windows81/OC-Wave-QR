package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;

@Metadata
public final class CoroutineScheduler implements Executor, Closeable {
    public static final Companion G = new Companion((DefaultConstructorMarker) null);
    public static final /* synthetic */ AtomicLongFieldUpdater H;
    public static final /* synthetic */ AtomicLongFieldUpdater I;
    public static final /* synthetic */ AtomicIntegerFieldUpdater J;
    public static final Symbol K = new Symbol("NOT_IN_STACK");

    /* renamed from: A  reason: collision with root package name */
    public final int f41893A;

    /* renamed from: B  reason: collision with root package name */
    public final long f41894B;
    public final String C;
    public final GlobalQueue D;
    public final GlobalQueue E;
    public final ResizableAtomicArray F;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: z  reason: collision with root package name */
    public final int f41895z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41896a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f41896a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.WhenMappings.<clinit>():void");
        }
    }

    @Metadata
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        static {
            WorkerState[] d2;
            F = EnumEntriesKt.a(d2);
        }
    }

    static {
        Class<CoroutineScheduler> cls = CoroutineScheduler.class;
        H = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack$volatile");
        I = AtomicLongFieldUpdater.newUpdater(cls, "controlState$volatile");
        J = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated$volatile");
    }

    public CoroutineScheduler(int i2, int i3, long j2, String str) {
        this.f41895z = i2;
        this.f41893A = i3;
        this.f41894B = j2;
        this.C = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        } else if (i3 < i2) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        } else if (i3 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j2 > 0) {
            this.D = new GlobalQueue();
            this.E = new GlobalQueue();
            this.F = new ResizableAtomicArray((i2 + 1) * 2);
            this.controlState$volatile = ((long) i2) << 42;
        } else {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
    }

    public static /* synthetic */ boolean I(CoroutineScheduler coroutineScheduler, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = I.get(coroutineScheduler);
        }
        return coroutineScheduler.H(j2);
    }

    public static /* synthetic */ void j(CoroutineScheduler coroutineScheduler, Runnable runnable, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        coroutineScheduler.g(runnable, z2, z3);
    }

    public final void C(Task task) {
        AbstractTimeSource a2;
        try {
            task.run();
            a2 = AbstractTimeSourceKt.f41360a;
            if (a2 == null) {
                return;
            }
        } catch (Throwable th) {
            AbstractTimeSource a3 = AbstractTimeSourceKt.f41360a;
            if (a3 != null) {
                a3.e();
            }
            throw th;
        }
        a2.e();
    }

    public final void D(long j2) {
        int i2;
        Task task;
        if (J.compareAndSet(this, 0, 1)) {
            Worker f2 = f();
            synchronized (this.F) {
                i2 = (int) (I.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object b2 = this.F.b(i3);
                    Intrinsics.f(b2);
                    Worker worker = (Worker) b2;
                    if (worker != f2) {
                        while (worker.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(worker);
                            worker.join(j2);
                        }
                        worker.f41899z.j(this.E);
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            this.E.b();
            this.D.b();
            while (true) {
                if (f2 != null) {
                    task = f2.e(true);
                    if (task != null) {
                        continue;
                        C(task);
                    }
                }
                task = (Task) this.D.e();
                if (task == null && (task = (Task) this.E.e()) == null) {
                    break;
                }
                C(task);
            }
            if (f2 != null) {
                f2.r(WorkerState.TERMINATED);
            }
            H.set(this, 0);
            I.set(this, 0);
        }
    }

    public final void E(long j2) {
        if (!N() && !H(j2)) {
            N();
        }
    }

    public final void F() {
        if (!N() && !I(this, 0, 1, (Object) null)) {
            N();
        }
    }

    public final Task G(Worker worker, Task task, boolean z2) {
        WorkerState workerState;
        if (worker == null || (workerState = worker.f41898B) == WorkerState.TERMINATED) {
            return task;
        }
        if (!task.f41904A && workerState == WorkerState.BLOCKING) {
            return task;
        }
        worker.F = true;
        return worker.f41899z.a(task, z2);
    }

    public final boolean H(long j2) {
        if (RangesKt.e(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0) < this.f41895z) {
            int c2 = c();
            if (c2 == 1 && this.f41895z > 1) {
                c();
            }
            if (c2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean N() {
        Worker t2;
        do {
            t2 = t();
            if (t2 == null) {
                return false;
            }
        } while (!Worker.H.compareAndSet(t2, -1, 0));
        LockSupport.unpark(t2);
        return true;
    }

    public final boolean b(Task task) {
        return task.f41904A ? this.E.a(task) : this.D.a(task);
    }

    public final int c() {
        synchronized (this.F) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j2 = I.get(this);
                int i2 = (int) (j2 & 2097151);
                int e2 = RangesKt.e(i2 - ((int) ((j2 & 4398044413952L) >> 21)), 0);
                if (e2 >= this.f41895z) {
                    return 0;
                }
                if (i2 >= this.f41893A) {
                    return 0;
                }
                int i3 = ((int) (I.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.F.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Worker worker = new Worker(this, i3);
                this.F.c(i3, worker);
                if (i3 == ((int) (2097151 & I.incrementAndGet(this)))) {
                    int i4 = e2 + 1;
                    worker.start();
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        D(10000);
    }

    public final Task d(Runnable runnable, boolean z2) {
        long a2 = TasksKt.f41912f.a();
        if (!(runnable instanceof Task)) {
            return TasksKt.b(runnable, a2, z2);
        }
        Task task = (Task) runnable;
        task.f41905z = a2;
        task.f41904A = z2;
        return task;
    }

    public void execute(Runnable runnable) {
        j(this, runnable, false, false, 6, (Object) null);
    }

    public final Worker f() {
        Thread currentThread = Thread.currentThread();
        Worker worker = currentThread instanceof Worker ? (Worker) currentThread : null;
        if (worker == null || !Intrinsics.d(CoroutineScheduler.this, this)) {
            return null;
        }
        return worker;
    }

    public final void g(Runnable runnable, boolean z2, boolean z3) {
        AbstractTimeSource a2 = AbstractTimeSourceKt.f41360a;
        if (a2 != null) {
            a2.d();
        }
        Task d2 = d(runnable, z2);
        boolean z4 = d2.f41904A;
        long addAndGet = z4 ? I.addAndGet(this, 2097152) : 0;
        Task G2 = G(f(), d2, z3);
        if (G2 != null && !b(G2)) {
            throw new RejectedExecutionException(this.C + " was terminated");
        } else if (z4) {
            E(addAndGet);
        } else {
            F();
        }
    }

    public final boolean isTerminated() {
        return J.get(this) == 1;
    }

    public final int r(Worker worker) {
        Object g2 = worker.g();
        while (g2 != K) {
            if (g2 == null) {
                return 0;
            }
            Worker worker2 = (Worker) g2;
            int f2 = worker2.f();
            if (f2 != 0) {
                return f2;
            }
            g2 = worker2.g();
        }
        return -1;
    }

    public final Worker t() {
        AtomicLongFieldUpdater l2 = H;
        while (true) {
            long j2 = l2.get(this);
            Worker worker = (Worker) this.F.b((int) (2097151 & j2));
            if (worker == null) {
                return null;
            }
            long j3 = (2097152 + j2) & -2097152;
            int r2 = r(worker);
            if (r2 >= 0) {
                if (H.compareAndSet(this, j2, ((long) r2) | j3)) {
                    worker.o(K);
                    return worker;
                }
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a2 = this.F.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            Worker worker = (Worker) this.F.b(i7);
            if (worker != null) {
                int i8 = worker.f41899z.i();
                int i9 = WhenMappings.f41896a[worker.f41898B.ordinal()];
                if (i9 == 1) {
                    i4++;
                } else if (i9 == 2) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i9 == 3) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i9 == 4) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i9 == 5) {
                    i6++;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        long j2 = I.get(this);
        return this.C + '@' + DebugStringsKt.b(this) + "[Pool Size {core = " + this.f41895z + ", max = " + this.f41893A + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i5 + ", terminated = " + i6 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.D.c() + ", global blocking queue size = " + this.E.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.f41895z - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    public final boolean x(Worker worker) {
        long j2;
        int f2;
        if (worker.g() != K) {
            return false;
        }
        AtomicLongFieldUpdater l2 = H;
        do {
            j2 = l2.get(this);
            f2 = worker.f();
            worker.o(this.F.b((int) (2097151 & j2)));
        } while (!H.compareAndSet(this, j2, ((2097152 + j2) & -2097152) | ((long) f2)));
        return true;
    }

    public final void y(Worker worker, int i2, int i3) {
        AtomicLongFieldUpdater l2 = H;
        while (true) {
            long j2 = l2.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & -2097152;
            if (i4 == i2) {
                i4 = i3 == 0 ? r(worker) : i3;
            }
            if (i4 >= 0) {
                if (H.compareAndSet(this, j2, j3 | ((long) i4))) {
                    return;
                }
            }
        }
    }

    @Metadata
    public final class Worker extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater H = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl$volatile");

        /* renamed from: A  reason: collision with root package name */
        public final Ref.ObjectRef f41897A;

        /* renamed from: B  reason: collision with root package name */
        public WorkerState f41898B;
        public long C;
        public long D;
        public int E;
        public boolean F;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        /* renamed from: z  reason: collision with root package name */
        public final WorkQueue f41899z;

        public Worker() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.f41899z = new WorkQueue();
            this.f41897A = new Ref.ObjectRef();
            this.f41898B = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.K;
            int nanoTime = (int) System.nanoTime();
            this.E = nanoTime == 0 ? 42 : nanoTime;
        }

        public final void b(Task task) {
            this.C = 0;
            if (this.f41898B == WorkerState.PARKING) {
                this.f41898B = WorkerState.BLOCKING;
            }
            if (task.f41904A) {
                if (r(WorkerState.BLOCKING)) {
                    CoroutineScheduler.this.F();
                }
                CoroutineScheduler.this.C(task);
                CoroutineScheduler.I.addAndGet(CoroutineScheduler.this, -2097152);
                if (this.f41898B != WorkerState.TERMINATED) {
                    this.f41898B = WorkerState.DORMANT;
                    return;
                }
                return;
            }
            CoroutineScheduler.this.C(task);
        }

        public final Task c(boolean z2) {
            Task l2;
            Task l3;
            if (z2) {
                boolean z3 = j(CoroutineScheduler.this.f41895z * 2) == 0;
                if (z3 && (l3 = l()) != null) {
                    return l3;
                }
                Task k2 = this.f41899z.k();
                if (k2 != null) {
                    return k2;
                }
                if (!z3 && (l2 = l()) != null) {
                    return l2;
                }
            } else {
                Task l4 = l();
                if (l4 != null) {
                    return l4;
                }
            }
            return s(3);
        }

        public final Task d() {
            Task l2 = this.f41899z.l();
            if (l2 != null) {
                return l2;
            }
            Task task = (Task) CoroutineScheduler.this.E.e();
            return task == null ? s(1) : task;
        }

        public final Task e(boolean z2) {
            return p() ? c(z2) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final boolean i() {
            return this.nextParkedWorker != CoroutineScheduler.K;
        }

        public final int j(int i2) {
            int i3 = this.E;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.E = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        public final void k() {
            if (this.C == 0) {
                this.C = System.nanoTime() + CoroutineScheduler.this.f41894B;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f41894B);
            if (System.nanoTime() - this.C >= 0) {
                this.C = 0;
                t();
            }
        }

        public final Task l() {
            if (j(2) == 0) {
                Task task = (Task) CoroutineScheduler.this.D.e();
                return task != null ? task : (Task) CoroutineScheduler.this.E.e();
            }
            Task task2 = (Task) CoroutineScheduler.this.E.e();
            return task2 != null ? task2 : (Task) CoroutineScheduler.this.D.e();
        }

        public final void m() {
            loop0:
            while (true) {
                boolean z2 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f41898B != WorkerState.TERMINATED) {
                    Task e2 = e(this.F);
                    if (e2 != null) {
                        this.D = 0;
                        b(e2);
                    } else {
                        this.F = false;
                        if (this.D == 0) {
                            q();
                        } else if (!z2) {
                            z2 = true;
                        } else {
                            r(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.D);
                            this.D = 0;
                        }
                    }
                }
            }
            r(WorkerState.TERMINATED);
        }

        public final void n(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.C);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean p() {
            long j2;
            if (this.f41898B == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater a2 = CoroutineScheduler.I;
            do {
                j2 = a2.get(coroutineScheduler);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.I.compareAndSet(coroutineScheduler, j2, j2 - 4398046511104L));
            this.f41898B = WorkerState.CPU_ACQUIRED;
            return true;
        }

        public final void q() {
            if (!i()) {
                CoroutineScheduler.this.x(this);
                return;
            }
            H.set(this, -1);
            while (i() && H.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.f41898B != WorkerState.TERMINATED) {
                r(WorkerState.PARKING);
                Thread.interrupted();
                k();
            }
        }

        public final boolean r(WorkerState workerState) {
            WorkerState workerState2 = this.f41898B;
            boolean z2 = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z2) {
                CoroutineScheduler.I.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f41898B = workerState;
            }
            return z2;
        }

        public void run() {
            m();
        }

        public final Task s(int i2) {
            int i3 = (int) (CoroutineScheduler.I.get(CoroutineScheduler.this) & 2097151);
            if (i3 < 2) {
                return null;
            }
            int j2 = j(i3);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j3 = Long.MAX_VALUE;
            for (int i4 = 0; i4 < i3; i4++) {
                j2++;
                if (j2 > i3) {
                    j2 = 1;
                }
                Worker worker = (Worker) coroutineScheduler.F.b(j2);
                if (worker == null || worker == this) {
                    int i5 = i2;
                } else {
                    long r2 = worker.f41899z.r(i2, this.f41897A);
                    if (r2 == -1) {
                        Ref.ObjectRef objectRef = this.f41897A;
                        Task task = (Task) objectRef.f40908z;
                        objectRef.f40908z = null;
                        return task;
                    } else if (r2 > 0) {
                        j3 = Math.min(j3, r2);
                    }
                }
            }
            if (j3 == Long.MAX_VALUE) {
                j3 = 0;
            }
            this.D = j3;
            return null;
        }

        public final void t() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.F) {
                try {
                    if (!coroutineScheduler.isTerminated()) {
                        if (((int) (CoroutineScheduler.I.get(coroutineScheduler) & 2097151)) > coroutineScheduler.f41895z) {
                            if (H.compareAndSet(this, -1, 1)) {
                                int i2 = this.indexInArray;
                                n(0);
                                coroutineScheduler.y(this, i2, 0);
                                int andDecrement = (int) (CoroutineScheduler.I.getAndDecrement(coroutineScheduler) & 2097151);
                                if (andDecrement != i2) {
                                    Object b2 = coroutineScheduler.F.b(andDecrement);
                                    Intrinsics.f(b2);
                                    Worker worker = (Worker) b2;
                                    coroutineScheduler.F.c(i2, worker);
                                    worker.n(i2);
                                    coroutineScheduler.y(worker, andDecrement, i2);
                                }
                                coroutineScheduler.F.c(andDecrement, (Object) null);
                                Unit unit = Unit.f40552a;
                                this.f41898B = WorkerState.TERMINATED;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public Worker(CoroutineScheduler coroutineScheduler, int i2) {
            this();
            n(i2);
        }
    }
}
