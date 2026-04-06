package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class Task {

    /* renamed from: a  reason: collision with root package name */
    public final String f42877a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f42878b;

    /* renamed from: c  reason: collision with root package name */
    public TaskQueue f42879c;

    /* renamed from: d  reason: collision with root package name */
    public long f42880d;

    public Task(String str, boolean z2) {
        Intrinsics.i(str, "name");
        this.f42877a = str;
        this.f42878b = z2;
        this.f42880d = -1;
    }

    public final boolean a() {
        return this.f42878b;
    }

    public final String b() {
        return this.f42877a;
    }

    public final long c() {
        return this.f42880d;
    }

    public final TaskQueue d() {
        return this.f42879c;
    }

    public final void e(TaskQueue taskQueue) {
        Intrinsics.i(taskQueue, "queue");
        TaskQueue taskQueue2 = this.f42879c;
        if (taskQueue2 != taskQueue) {
            if (taskQueue2 == null) {
                this.f42879c = taskQueue;
                return;
            }
            throw new IllegalStateException("task is in multiple queues");
        }
    }

    public abstract long f();

    public final void g(long j2) {
        this.f42880d = j2;
    }

    public String toString() {
        return this.f42877a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Task(String str, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? true : z2);
    }
}
