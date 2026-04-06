package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause2;

@Metadata
public class ChannelCoroutine<E> extends AbstractCoroutine<Unit> implements Channel<E> {
    public final Channel C;

    public ChannelCoroutine(CoroutineContext coroutineContext, Channel channel, boolean z2, boolean z3) {
        super(coroutineContext, z2, z3);
        this.C = channel;
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

    public final void c(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(r0(), (Throwable) null, this);
            }
            o0(cancellationException);
        }
    }

    public SelectClause1 h() {
        return this.C.h();
    }

    public SelectClause1 i() {
        return this.C.i();
    }

    public ChannelIterator iterator() {
        return this.C.iterator();
    }

    public Object n() {
        return this.C.n();
    }

    public Object o(Continuation continuation) {
        Object o2 = this.C.o(continuation);
        IntrinsicsKt.f();
        return o2;
    }

    public void o0(Throwable th) {
        CancellationException k1 = JobSupport.k1(this, th, (String) null, 1, (Object) null);
        this.C.c(k1);
        k0(k1);
    }

    public SelectClause2 s() {
        return this.C.s();
    }

    public Object v(Continuation continuation) {
        return this.C.v(continuation);
    }

    public final Channel v1() {
        return this;
    }

    public final Channel w1() {
        return this.C;
    }

    public boolean z(Throwable th) {
        return this.C.z(th);
    }
}
