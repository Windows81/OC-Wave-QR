package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.ExceptionsKt;

@Metadata
class ActorCoroutine<E> extends ChannelCoroutine<E> implements ActorScope<E> {
    public boolean J0(Throwable th) {
        CoroutineExceptionHandlerKt.a(f(), th);
        return true;
    }

    public void Z0(Throwable th) {
        Channel w1 = w1();
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = ExceptionsKt.a(DebugStringsKt.a(this) + " was cancelled", th);
            }
        }
        w1.c(cancellationException);
    }
}
