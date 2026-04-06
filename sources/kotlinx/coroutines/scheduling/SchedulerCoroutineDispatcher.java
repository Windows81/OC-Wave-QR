package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

@Metadata
public class SchedulerCoroutineDispatcher extends ExecutorCoroutineDispatcher {
    public final int C;
    public final int D;
    public final long E;
    public final String F;
    public CoroutineScheduler G = H0();

    public SchedulerCoroutineDispatcher(int i2, int i3, long j2, String str) {
        this.C = i2;
        this.D = i3;
        this.E = j2;
        this.F = str;
    }

    public final CoroutineScheduler H0() {
        return new CoroutineScheduler(this.C, this.D, this.E, this.F);
    }

    public final void J0(Runnable runnable, boolean z2, boolean z3) {
        this.G.g(runnable, z2, z3);
    }

    public void close() {
        this.G.close();
    }

    public void o0(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.j(this.G, runnable, false, false, 6, (Object) null);
    }

    public void t0(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.j(this.G, runnable, false, true, 2, (Object) null);
    }
}
