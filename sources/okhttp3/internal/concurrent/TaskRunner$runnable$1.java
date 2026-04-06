package okhttp3.internal.concurrent;

import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TaskRunner$runnable$1 implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TaskRunner f42901z;

    public TaskRunner$runnable$1(TaskRunner taskRunner) {
        this.f42901z = taskRunner;
    }

    public void run() {
        Task d2;
        long j2;
        while (true) {
            TaskRunner taskRunner = this.f42901z;
            synchronized (taskRunner) {
                d2 = taskRunner.d();
            }
            if (d2 != null) {
                TaskQueue d3 = d2.d();
                Intrinsics.f(d3);
                TaskRunner taskRunner2 = this.f42901z;
                boolean isLoggable = TaskRunner.f42890h.a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j2 = d3.h().g().b();
                    TaskLoggerKt.c(d2, d3, "starting");
                } else {
                    j2 = -1;
                }
                try {
                    taskRunner2.j(d2);
                    Unit unit = Unit.f40552a;
                    if (isLoggable) {
                        long b2 = d3.h().g().b() - j2;
                        TaskLoggerKt.c(d2, d3, "finished run in " + TaskLoggerKt.b(b2));
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        TaskLoggerKt.c(d2, d3, "failed a run in " + TaskLoggerKt.b(d3.h().g().b() - j2));
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
