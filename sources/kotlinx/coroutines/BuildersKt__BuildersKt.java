package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata
final /* synthetic */ class BuildersKt__BuildersKt {
    public static final Object a(CoroutineContext coroutineContext, Function2 function2) {
        CoroutineContext coroutineContext2;
        EventLoop eventLoop;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.d(ContinuationInterceptor.f40717v);
        if (continuationInterceptor == null) {
            eventLoop = ThreadLocalEventLoop.f41437a.b();
            coroutineContext2 = CoroutineContextKt.k(GlobalScope.f41412z, coroutineContext.y(eventLoop));
        } else {
            EventLoop eventLoop2 = null;
            EventLoop eventLoop3 = continuationInterceptor instanceof EventLoop ? (EventLoop) continuationInterceptor : null;
            if (eventLoop3 != null) {
                if (eventLoop3.F1()) {
                    eventLoop2 = eventLoop3;
                }
                if (eventLoop2 != null) {
                    eventLoop = eventLoop2;
                    coroutineContext2 = CoroutineContextKt.k(GlobalScope.f41412z, coroutineContext);
                }
            }
            eventLoop = ThreadLocalEventLoop.f41437a.a();
            coroutineContext2 = CoroutineContextKt.k(GlobalScope.f41412z, coroutineContext);
        }
        BlockingCoroutine blockingCoroutine = new BlockingCoroutine(coroutineContext2, currentThread, eventLoop);
        blockingCoroutine.u1(CoroutineStart.DEFAULT, blockingCoroutine, function2);
        return blockingCoroutine.v1();
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f40721z;
        }
        return BuildersKt.e(coroutineContext, function2);
    }
}
