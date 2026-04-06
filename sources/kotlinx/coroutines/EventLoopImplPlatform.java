package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.EventLoopImplBase;

@Metadata
public abstract class EventLoopImplPlatform extends EventLoop {
    public abstract Thread G1();

    public void H1(long j2, EventLoopImplBase.DelayedTask delayedTask) {
        DefaultExecutor.H.V1(j2, delayedTask);
    }

    public final void I1() {
        Thread G1 = G1();
        if (Thread.currentThread() != G1) {
            AbstractTimeSource a2 = AbstractTimeSourceKt.f41360a;
            if (a2 != null) {
                a2.f(G1);
            } else {
                LockSupport.unpark(G1);
            }
        }
    }
}
