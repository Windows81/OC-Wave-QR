package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.intrinsics.CancellableKt;

@Metadata
final class LazyBroadcastCoroutine<E> extends BroadcastCoroutine<E> {
    public final Continuation D;

    public ReceiveChannel B() {
        ReceiveChannel B2 = v1().B();
        start();
        return B2;
    }

    public void b1() {
        CancellableKt.b(this.D, this);
    }
}
