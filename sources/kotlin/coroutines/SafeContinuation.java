package kotlin.coroutines;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SafeContinuation<T> implements Continuation<T>, CoroutineStackFrame {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f40722A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f40723B = AtomicReferenceFieldUpdater.newUpdater(SafeContinuation.class, Object.class, "result");
    private volatile Object result;

    /* renamed from: z  reason: collision with root package name */
    public final Continuation f40724z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SafeContinuation(Continuation continuation, Object obj) {
        Intrinsics.i(continuation, "delegate");
        this.f40724z = continuation;
        this.result = obj;
    }

    public CoroutineStackFrame e() {
        Continuation continuation = this.f40724z;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public CoroutineContext f() {
        return this.f40724z.f();
    }

    public StackTraceElement p() {
        return null;
    }

    public void q(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                if (a.a(f40723B, this, coroutineSingletons, obj)) {
                    return;
                }
            } else if (obj2 != IntrinsicsKt.f()) {
                throw new IllegalStateException("Already resumed");
            } else if (a.a(f40723B, this, IntrinsicsKt.f(), CoroutineSingletons.RESUMED)) {
                this.f40724z.q(obj);
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f40724z;
    }
}
