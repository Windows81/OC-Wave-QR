package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

@Metadata
public final class CompletedContinuation implements Continuation<Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final CompletedContinuation f40735z = new CompletedContinuation();

    public CoroutineContext f() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public void q(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
