package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.channels.SendChannel;

@Metadata
final class ProducerCoroutine<E> extends ChannelCoroutine<E> implements ProducerScope<E> {
    public ProducerCoroutine(CoroutineContext coroutineContext, Channel channel) {
        super(coroutineContext, channel, true, true);
    }

    public /* bridge */ /* synthetic */ SendChannel A() {
        return v1();
    }

    public boolean b() {
        return super.b();
    }

    public void s1(Throwable th, boolean z2) {
        if (!w1().z(th) && !z2) {
            CoroutineExceptionHandlerKt.a(f(), th);
        }
    }

    /* renamed from: x1 */
    public void t1(Unit unit) {
        SendChannel.DefaultImpls.a(w1(), (Throwable) null, 1, (Object) null);
    }
}
