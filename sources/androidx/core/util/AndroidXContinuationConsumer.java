package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {

    /* renamed from: z  reason: collision with root package name */
    public final Continuation f20139z;

    public void accept(Object obj) {
        if (compareAndSet(false, true)) {
            this.f20139z.q(Result.b(obj));
        }
    }

    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
