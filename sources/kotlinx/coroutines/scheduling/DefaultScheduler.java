package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

@Metadata
public final class DefaultScheduler extends SchedulerCoroutineDispatcher {
    public static final DefaultScheduler H = new DefaultScheduler();

    public DefaultScheduler() {
        super(TasksKt.f41909c, TasksKt.f41910d, TasksKt.f41911e, TasksKt.f41907a);
    }

    public CoroutineDispatcher E0(int i2, String str) {
        LimitedDispatcherKt.a(i2);
        return i2 >= TasksKt.f41909c ? LimitedDispatcherKt.b(this, str) : super.E0(i2, str);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
