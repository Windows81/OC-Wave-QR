package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
public final class EventLoopKt {
    public static final EventLoop a() {
        return new BlockingEventLoop(Thread.currentThread());
    }
}
