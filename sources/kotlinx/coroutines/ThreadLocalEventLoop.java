package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadLocalKt;

@Metadata
public final class ThreadLocalEventLoop {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocalEventLoop f41437a = new ThreadLocalEventLoop();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f41438b = ThreadLocalKt.a(new Symbol("ThreadLocalEventLoop"));

    public final EventLoop a() {
        return (EventLoop) f41438b.get();
    }

    public final EventLoop b() {
        ThreadLocal threadLocal = f41438b;
        EventLoop eventLoop = (EventLoop) threadLocal.get();
        if (eventLoop != null) {
            return eventLoop;
        }
        EventLoop a2 = EventLoopKt.a();
        threadLocal.set(a2);
        return a2;
    }

    public final void c() {
        f41438b.set((Object) null);
    }

    public final void d(EventLoop eventLoop) {
        f41438b.set(eventLoop);
    }
}
