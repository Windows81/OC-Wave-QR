package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.d;

@Metadata
public final class WorkQueue {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41914b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f41915c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f41916d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f41917e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray f41918a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Class<WorkQueue> cls = WorkQueue.class;
        f41914b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask$volatile");
        f41915c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex$volatile");
        f41916d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex$volatile");
        f41917e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer$volatile");
    }

    public final Task a(Task task, boolean z2) {
        if (z2) {
            return b(task);
        }
        Task task2 = (Task) f41914b.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return b(task2);
    }

    public final Task b(Task task) {
        if (e() == 127) {
            return task;
        }
        if (task.f41904A) {
            f41917e.incrementAndGet(this);
        }
        int i2 = f41915c.get(this) & 127;
        while (this.f41918a.get(i2) != null) {
            Thread.yield();
        }
        this.f41918a.lazySet(i2, task);
        f41915c.incrementAndGet(this);
        return null;
    }

    public final void c(Task task) {
        if (task != null && task.f41904A) {
            f41917e.decrementAndGet(this);
        }
    }

    public final int e() {
        return f41915c.get(this) - f41916d.get(this);
    }

    public final int i() {
        return f41914b.get(this) != null ? e() + 1 : e();
    }

    public final void j(GlobalQueue globalQueue) {
        Task task = (Task) f41914b.getAndSet(this, (Object) null);
        if (task != null) {
            globalQueue.a(task);
        }
        do {
        } while (n(globalQueue));
    }

    public final Task k() {
        Task task = (Task) f41914b.getAndSet(this, (Object) null);
        return task == null ? m() : task;
    }

    public final Task l() {
        return o(true);
    }

    public final Task m() {
        Task task;
        while (true) {
            int i2 = f41916d.get(this);
            if (i2 - f41915c.get(this) == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f41916d.compareAndSet(this, i2, i2 + 1) && (task = (Task) this.f41918a.getAndSet(i3, (Object) null)) != null) {
                c(task);
                return task;
            }
        }
    }

    public final boolean n(GlobalQueue globalQueue) {
        Task m2 = m();
        if (m2 == null) {
            return false;
        }
        globalQueue.a(m2);
        return true;
    }

    public final Task o(boolean z2) {
        Task task;
        do {
            task = (Task) f41914b.get(this);
            if (task == null || task.f41904A != z2) {
                int i2 = f41916d.get(this);
                int i3 = f41915c.get(this);
                while (i2 != i3) {
                    if (z2 && f41917e.get(this) == 0) {
                        return null;
                    }
                    i3--;
                    Task q2 = q(i3, z2);
                    if (q2 != null) {
                        return q2;
                    }
                }
                return null;
            }
        } while (!a.a(f41914b, this, task, (Object) null));
        return task;
    }

    public final Task p(int i2) {
        int i3 = f41916d.get(this);
        int i4 = f41915c.get(this);
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        while (i3 != i4) {
            if (z2 && f41917e.get(this) == 0) {
                return null;
            }
            int i5 = i3 + 1;
            Task q2 = q(i3, z2);
            if (q2 != null) {
                return q2;
            }
            i3 = i5;
        }
        return null;
    }

    public final Task q(int i2, boolean z2) {
        int i3 = i2 & 127;
        Task task = (Task) this.f41918a.get(i3);
        if (task == null || task.f41904A != z2 || !d.a(this.f41918a, i3, task, (Object) null)) {
            return null;
        }
        if (z2) {
            f41917e.decrementAndGet(this);
        }
        return task;
    }

    public final long r(int i2, Ref.ObjectRef objectRef) {
        Task m2 = i2 == 3 ? m() : p(i2);
        if (m2 == null) {
            return s(i2, objectRef);
        }
        objectRef.f40908z = m2;
        return -1;
    }

    public final long s(int i2, Ref.ObjectRef objectRef) {
        Task task;
        do {
            task = (Task) f41914b.get(this);
            if (task == null) {
                return -2;
            }
            if (((task.f41904A ? 1 : 2) & i2) == 0) {
                return -2;
            }
            long a2 = TasksKt.f41912f.a() - task.f41905z;
            long j2 = TasksKt.f41908b;
            if (a2 < j2) {
                return j2 - a2;
            }
        } while (!a.a(f41914b, this, task, (Object) null));
        objectRef.f40908z = task;
        return -1;
    }
}
