package okhttp3.internal.concurrent;

import com.lokalise.sdk.api.Params;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

@Metadata
public final class TaskRunner {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f42890h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final TaskRunner f42891i = new TaskRunner(new RealBackend(Util.N(Util.f42806i + " TaskRunner", true)));

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f42892j;

    /* renamed from: a  reason: collision with root package name */
    public final Backend f42893a;

    /* renamed from: b  reason: collision with root package name */
    public int f42894b = Params.Timeout.CONNECT_LONG;

    /* renamed from: c  reason: collision with root package name */
    public boolean f42895c;

    /* renamed from: d  reason: collision with root package name */
    public long f42896d;

    /* renamed from: e  reason: collision with root package name */
    public final List f42897e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List f42898f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f42899g = new TaskRunner$runnable$1(this);

    @Metadata
    public interface Backend {
        void a(TaskRunner taskRunner);

        long b();

        void c(TaskRunner taskRunner, long j2);

        void execute(Runnable runnable);
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return TaskRunner.f42892j;
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class RealBackend implements Backend {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadPoolExecutor f42900a;

        public RealBackend(ThreadFactory threadFactory) {
            Intrinsics.i(threadFactory, "threadFactory");
            this.f42900a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public void a(TaskRunner taskRunner) {
            Intrinsics.i(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        public long b() {
            return System.nanoTime();
        }

        public void c(TaskRunner taskRunner, long j2) {
            Intrinsics.i(taskRunner, "taskRunner");
            long j3 = j2 / 1000000;
            long j4 = j2 - (1000000 * j3);
            if (j3 > 0 || j2 > 0) {
                taskRunner.wait(j3, (int) j4);
            }
        }

        public void execute(Runnable runnable) {
            Intrinsics.i(runnable, "runnable");
            this.f42900a.execute(runnable);
        }
    }

    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        Intrinsics.h(logger, "getLogger(TaskRunner::class.java.name)");
        f42892j = logger;
    }

    public TaskRunner(Backend backend) {
        Intrinsics.i(backend, "backend");
        this.f42893a = backend;
    }

    public final void c(Task task, long j2) {
        if (!Util.f42805h || Thread.holdsLock(this)) {
            TaskQueue d2 = task.d();
            Intrinsics.f(d2);
            if (d2.c() == task) {
                boolean d3 = d2.d();
                d2.m(false);
                d2.l((Task) null);
                this.f42897e.remove(d2);
                if (j2 != -1 && !d3 && !d2.g()) {
                    d2.k(task, j2, true);
                }
                if (!d2.e().isEmpty()) {
                    this.f42898f.add(d2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00bf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.concurrent.Task d() {
        /*
            r14 = this;
            boolean r0 = okhttp3.internal.Util.f42805h
            if (r0 == 0) goto L_0x0032
            boolean r0 = java.lang.Thread.holdsLock(r14)
            if (r0 == 0) goto L_0x000b
            goto L_0x0032
        L_0x000b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0032:
            java.util.List r0 = r14.f42898f
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x003c
            return r1
        L_0x003c:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.f42893a
            long r2 = r0.b()
            java.util.List r0 = r14.f42898f
            java.util.Iterator r0 = r0.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r1
        L_0x004e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0080
            java.lang.Object r7 = r0.next()
            okhttp3.internal.concurrent.TaskQueue r7 = (okhttp3.internal.concurrent.TaskQueue) r7
            java.util.List r7 = r7.e()
            java.lang.Object r7 = r7.get(r9)
            okhttp3.internal.concurrent.Task r7 = (okhttp3.internal.concurrent.Task) r7
            long r10 = r7.c()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x007a
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x004e
        L_0x007a:
            if (r6 == 0) goto L_0x007e
            r0 = r8
            goto L_0x0081
        L_0x007e:
            r6 = r7
            goto L_0x004e
        L_0x0080:
            r0 = r9
        L_0x0081:
            if (r6 == 0) goto L_0x009e
            r14.e(r6)
            if (r0 != 0) goto L_0x0096
            boolean r0 = r14.f42895c
            if (r0 != 0) goto L_0x009d
            java.util.List r0 = r14.f42898f
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x009d
        L_0x0096:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.f42893a
            java.lang.Runnable r1 = r14.f42899g
            r0.execute(r1)
        L_0x009d:
            return r6
        L_0x009e:
            boolean r0 = r14.f42895c
            if (r0 == 0) goto L_0x00af
            long r6 = r14.f42896d
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ae
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.f42893a
            r0.a(r14)
        L_0x00ae:
            return r1
        L_0x00af:
            r14.f42895c = r8
            long r2 = r2 + r4
            r14.f42896d = r2
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.f42893a     // Catch:{ InterruptedException -> 0x00bf }
            r0.c(r14, r4)     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00b9:
            r14.f42895c = r9
            goto L_0x0032
        L_0x00bd:
            r0 = move-exception
            goto L_0x00c3
        L_0x00bf:
            r14.f()     // Catch:{ all -> 0x00bd }
            goto L_0x00b9
        L_0x00c3:
            r14.f42895c = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskRunner.d():okhttp3.internal.concurrent.Task");
    }

    public final void e(Task task) {
        if (!Util.f42805h || Thread.holdsLock(this)) {
            task.g(-1);
            TaskQueue d2 = task.d();
            Intrinsics.f(d2);
            d2.e().remove(task);
            this.f42898f.remove(d2);
            d2.l(task);
            this.f42897e.add(d2);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final void f() {
        int size = this.f42897e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            ((TaskQueue) this.f42897e.get(size)).b();
        }
        for (int size2 = this.f42898f.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = (TaskQueue) this.f42898f.get(size2);
            taskQueue.b();
            if (taskQueue.e().isEmpty()) {
                this.f42898f.remove(size2);
            }
        }
    }

    public final Backend g() {
        return this.f42893a;
    }

    public final void h(TaskQueue taskQueue) {
        Intrinsics.i(taskQueue, "taskQueue");
        if (!Util.f42805h || Thread.holdsLock(this)) {
            if (taskQueue.c() == null) {
                if (!taskQueue.e().isEmpty()) {
                    Util.c(this.f42898f, taskQueue);
                } else {
                    this.f42898f.remove(taskQueue);
                }
            }
            if (this.f42895c) {
                this.f42893a.a(this);
            } else {
                this.f42893a.execute(this.f42899g);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
    }

    public final TaskQueue i() {
        int i2;
        synchronized (this) {
            i2 = this.f42894b;
            this.f42894b = i2 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i2);
        return new TaskQueue(this, sb.toString());
    }

    public final void j(Task task) {
        if (!Util.f42805h || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(task.b());
            try {
                long f2 = task.f();
                synchronized (this) {
                    c(task, f2);
                    Unit unit = Unit.f40552a;
                }
                currentThread.setName(name);
            } catch (Throwable th) {
                synchronized (this) {
                    c(task, -1);
                    Unit unit2 = Unit.f40552a;
                    currentThread.setName(name);
                    throw th;
                }
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }
}
