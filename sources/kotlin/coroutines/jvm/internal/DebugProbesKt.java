package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DebugProbesKt {
    public static final Continuation a(Continuation continuation) {
        Intrinsics.i(continuation, "completion");
        return continuation;
    }

    public static final void b(Continuation continuation) {
        Intrinsics.i(continuation, "frame");
    }

    public static final void c(Continuation continuation) {
        Intrinsics.i(continuation, "frame");
    }
}
