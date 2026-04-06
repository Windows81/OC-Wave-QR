package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata
@Deprecated
public final class ConflatedBroadcastChannel<E> implements BroadcastChannel<E> {

    /* renamed from: z  reason: collision with root package name */
    public final BroadcastChannelImpl f41497z;

    public ReceiveChannel B() {
        return this.f41497z.B();
    }

    public void K(Function1 function1) {
        this.f41497z.K(function1);
    }

    public Object L(Object obj) {
        return this.f41497z.L(obj);
    }

    public Object O(Object obj, Continuation continuation) {
        return this.f41497z.O(obj, continuation);
    }

    public boolean R() {
        return this.f41497z.R();
    }

    public void c(CancellationException cancellationException) {
        this.f41497z.c(cancellationException);
    }

    public boolean z(Throwable th) {
        return this.f41497z.z(th);
    }
}
