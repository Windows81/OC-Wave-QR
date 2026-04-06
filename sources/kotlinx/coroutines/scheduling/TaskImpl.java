package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.DebugStringsKt;

@Metadata
final class TaskImpl extends Task {

    /* renamed from: B  reason: collision with root package name */
    public final Runnable f41906B;

    public TaskImpl(Runnable runnable, long j2, boolean z2) {
        super(j2, z2);
        this.f41906B = runnable;
    }

    public void run() {
        this.f41906B.run();
    }

    public String toString() {
        return "Task[" + DebugStringsKt.a(this.f41906B) + '@' + DebugStringsKt.b(this.f41906B) + ", " + this.f41905z + ", " + TasksKt.c(this.f41904A) + ']';
    }
}
