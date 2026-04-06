package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.internal.SystemPropsKt;

@Metadata
public final class DefaultIoScheduler extends ExecutorCoroutineDispatcher implements Executor {
    public static final DefaultIoScheduler C = new DefaultIoScheduler();
    public static final CoroutineDispatcher D = CoroutineDispatcher.G0(UnlimitedIoScheduler.f41913B, SystemPropsKt__SystemProps_commonKt.e("kotlinx.coroutines.io.parallelism", RangesKt.e(64, SystemPropsKt.a()), 0, 0, 12, (Object) null), (String) null, 2, (Object) null);

    public CoroutineDispatcher E0(int i2, String str) {
        return UnlimitedIoScheduler.f41913B.E0(i2, str);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    public void execute(Runnable runnable) {
        o0(EmptyCoroutineContext.f40721z, runnable);
    }

    public void o0(CoroutineContext coroutineContext, Runnable runnable) {
        D.o0(coroutineContext, runnable);
    }

    public void t0(CoroutineContext coroutineContext, Runnable runnable) {
        D.t0(coroutineContext, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
