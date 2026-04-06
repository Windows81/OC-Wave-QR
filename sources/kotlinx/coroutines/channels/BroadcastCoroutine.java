package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.SendChannel;

@Metadata
class BroadcastCoroutine<E> extends AbstractCoroutine<Unit> implements ProducerScope<E>, BroadcastChannel<E> {
    public final BroadcastChannel C;

    public SendChannel A() {
        return this;
    }

    public ReceiveChannel B() {
        return this.C.B();
    }

    public void K(Function1 function1) {
        this.C.K(function1);
    }

    public Object L(Object obj) {
        return this.C.L(obj);
    }

    public Object O(Object obj, Continuation continuation) {
        return this.C.O(obj, continuation);
    }

    public boolean R() {
        return this.C.R();
    }

    public boolean b() {
        return super.b();
    }

    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(r0(), (Throwable) null, this);
        }
        o0(cancellationException);
    }

    public void o0(Throwable th) {
        CancellationException k1 = JobSupport.k1(this, th, (String) null, 1, (Object) null);
        this.C.c(k1);
        k0(k1);
    }

    public void s1(Throwable th, boolean z2) {
        if (!this.C.z(th) && !z2) {
            CoroutineExceptionHandlerKt.a(f(), th);
        }
    }

    public final BroadcastChannel v1() {
        return this.C;
    }

    /* renamed from: w1 */
    public void t1(Unit unit) {
        SendChannel.DefaultImpls.a(this.C, (Throwable) null, 1, (Object) null);
    }

    public boolean z(Throwable th) {
        boolean z2 = this.C.z(th);
        start();
        return z2;
    }
}
