package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

@Metadata
final class UnlimitedIoScheduler extends CoroutineDispatcher {

    /* renamed from: B  reason: collision with root package name */
    public static final UnlimitedIoScheduler f41913B = new UnlimitedIoScheduler();

    public CoroutineDispatcher E0(int i2, String str) {
        LimitedDispatcherKt.a(i2);
        return i2 >= TasksKt.f41910d ? LimitedDispatcherKt.b(this, str) : super.E0(i2, str);
    }

    public void o0(CoroutineContext coroutineContext, Runnable runnable) {
        DefaultScheduler.H.J0(runnable, true, false);
    }

    public void t0(CoroutineContext coroutineContext, Runnable runnable) {
        DefaultScheduler.H.J0(runnable, true, true);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
