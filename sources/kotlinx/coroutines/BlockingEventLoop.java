package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
public final class BlockingEventLoop extends EventLoopImplBase {
    public final Thread H;

    public BlockingEventLoop(Thread thread) {
        this.H = thread;
    }

    public Thread G1() {
        return this.H;
    }
}
