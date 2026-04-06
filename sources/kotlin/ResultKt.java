package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ResultKt {
    public static final Object a(Throwable th) {
        Intrinsics.i(th, "exception");
        return new Result.Failure(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f40521z;
        }
    }
}
