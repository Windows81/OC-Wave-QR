package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class SequenceBuilderIterator<T> extends SequenceScope<T> implements Iterator<T>, Continuation<Unit>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public Object f41049A;

    /* renamed from: B  reason: collision with root package name */
    public Iterator f41050B;
    public Continuation C;

    /* renamed from: z  reason: collision with root package name */
    public int f41051z;

    public Object c(Object obj, Continuation continuation) {
        this.f41049A = obj;
        this.f41051z = 3;
        this.C = continuation;
        Object f2 = IntrinsicsKt.f();
        if (f2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public Object e(Iterator it, Continuation continuation) {
        if (!it.hasNext()) {
            return Unit.f40552a;
        }
        this.f41050B = it;
        this.f41051z = 2;
        this.C = continuation;
        Object f2 = IntrinsicsKt.f();
        if (f2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public CoroutineContext f() {
        return EmptyCoroutineContext.f40721z;
    }

    public final Throwable h() {
        int i2 = this.f41051z;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f41051z);
    }

    public boolean hasNext() {
        while (true) {
            int i2 = this.f41051z;
            if (i2 != 0) {
                if (i2 == 1) {
                    Iterator it = this.f41050B;
                    Intrinsics.f(it);
                    if (it.hasNext()) {
                        this.f41051z = 2;
                        return true;
                    }
                    this.f41050B = null;
                } else if (i2 == 2 || i2 == 3) {
                    return true;
                } else {
                    if (i2 == 4) {
                        return false;
                    }
                    throw h();
                }
            }
            this.f41051z = 5;
            Continuation continuation = this.C;
            Intrinsics.f(continuation);
            this.C = null;
            Result.Companion companion = Result.f40519A;
            continuation.q(Result.b(Unit.f40552a));
        }
    }

    public final Object i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final void j(Continuation continuation) {
        this.C = continuation;
    }

    public Object next() {
        int i2 = this.f41051z;
        if (i2 == 0 || i2 == 1) {
            return i();
        }
        if (i2 == 2) {
            this.f41051z = 1;
            Iterator it = this.f41050B;
            Intrinsics.f(it);
            return it.next();
        } else if (i2 == 3) {
            this.f41051z = 0;
            Object obj = this.f41049A;
            this.f41049A = null;
            return obj;
        } else {
            throw h();
        }
    }

    public void q(Object obj) {
        ResultKt.b(obj);
        this.f41051z = 4;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
