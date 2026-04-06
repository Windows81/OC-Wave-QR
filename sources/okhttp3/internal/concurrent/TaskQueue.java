package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

@Metadata
public final class TaskQueue {

    /* renamed from: a  reason: collision with root package name */
    public final TaskRunner f42881a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42882b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f42883c;

    /* renamed from: d  reason: collision with root package name */
    public Task f42884d;

    /* renamed from: e  reason: collision with root package name */
    public final List f42885e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f42886f;

    @Metadata
    public static final class AwaitIdleTask extends Task {

        /* renamed from: e  reason: collision with root package name */
        public final CountDownLatch f42887e;

        public long f() {
            this.f42887e.countDown();
            return -1;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
        Intrinsics.i(taskRunner, "taskRunner");
        Intrinsics.i(str, "name");
        this.f42881a = taskRunner;
        this.f42882b = str;
    }

    public static /* synthetic */ void j(TaskQueue taskQueue, Task task, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        taskQueue.i(task, j2);
    }

    public final void a() {
        if (!Util.f42805h || !Thread.holdsLock(this)) {
            synchronized (this.f42881a) {
                try {
                    if (b()) {
                        this.f42881a.h(this);
                    }
                    Unit unit = Unit.f40552a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean b() {
        Task task = this.f42884d;
        if (task != null) {
            Intrinsics.f(task);
            if (task.a()) {
                this.f42886f = true;
            }
        }
        boolean z2 = false;
        for (int size = this.f42885e.size() - 1; -1 < size; size--) {
            if (((Task) this.f42885e.get(size)).a()) {
                Task task2 = (Task) this.f42885e.get(size);
                if (TaskRunner.f42890h.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task2, this, "canceled");
                }
                this.f42885e.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final Task c() {
        return this.f42884d;
    }

    public final boolean d() {
        return this.f42886f;
    }

    public final List e() {
        return this.f42885e;
    }

    public final String f() {
        return this.f42882b;
    }

    public final boolean g() {
        return this.f42883c;
    }

    public final TaskRunner h() {
        return this.f42881a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(okhttp3.internal.concurrent.Task r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.Intrinsics.i(r3, r0)
            okhttp3.internal.concurrent.TaskRunner r0 = r2.f42881a
            monitor-enter(r0)
            boolean r1 = r2.f42883c     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0043
            boolean r4 = r3.a()     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x002a
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.f42890h     // Catch:{ all -> 0x0026 }
            java.util.logging.Logger r4 = r4.a()     // Catch:{ all -> 0x0026 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0026 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.c(r3, r2, r4)     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r3 = move-exception
            goto L_0x0053
        L_0x0028:
            monitor-exit(r0)
            return
        L_0x002a:
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.f42890h     // Catch:{ all -> 0x0026 }
            java.util.logging.Logger r4 = r4.a()     // Catch:{ all -> 0x0026 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0026 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x003d
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.c(r3, r2, r4)     // Catch:{ all -> 0x0026 }
        L_0x003d:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0026 }
            r3.<init>()     // Catch:{ all -> 0x0026 }
            throw r3     // Catch:{ all -> 0x0026 }
        L_0x0043:
            r1 = 0
            boolean r3 = r2.k(r3, r4, r1)     // Catch:{ all -> 0x0026 }
            if (r3 == 0) goto L_0x004f
            okhttp3.internal.concurrent.TaskRunner r3 = r2.f42881a     // Catch:{ all -> 0x0026 }
            r3.h(r2)     // Catch:{ all -> 0x0026 }
        L_0x004f:
            kotlin.Unit r3 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0026 }
            monitor-exit(r0)
            return
        L_0x0053:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskQueue.i(okhttp3.internal.concurrent.Task, long):void");
    }

    public final boolean k(Task task, long j2, boolean z2) {
        String str;
        Intrinsics.i(task, "task");
        task.e(this);
        long b2 = this.f42881a.g().b();
        long j3 = b2 + j2;
        int indexOf = this.f42885e.indexOf(task);
        if (indexOf != -1) {
            if (task.c() <= j3) {
                if (TaskRunner.f42890h.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f42885e.remove(indexOf);
        }
        task.g(j3);
        if (TaskRunner.f42890h.a().isLoggable(Level.FINE)) {
            if (z2) {
                str = "run again after " + TaskLoggerKt.b(j3 - b2);
            } else {
                str = "scheduled after " + TaskLoggerKt.b(j3 - b2);
            }
            TaskLoggerKt.c(task, this, str);
        }
        Iterator it = this.f42885e.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((Task) it.next()).c() - b2 > j2) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            i2 = this.f42885e.size();
        }
        this.f42885e.add(i2, task);
        return i2 == 0;
    }

    public final void l(Task task) {
        this.f42884d = task;
    }

    public final void m(boolean z2) {
        this.f42886f = z2;
    }

    public final void n() {
        if (!Util.f42805h || !Thread.holdsLock(this)) {
            synchronized (this.f42881a) {
                try {
                    this.f42883c = true;
                    if (b()) {
                        this.f42881a.h(this);
                    }
                    Unit unit = Unit.f40552a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public String toString() {
        return this.f42882b;
    }
}
