package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;

@Metadata
public final class CompletableDeferredKt {
    public static final CompletableDeferred a(Job job) {
        return new CompletableDeferredImpl(job);
    }

    public static /* synthetic */ CompletableDeferred b(Job job, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            job = null;
        }
        return a(job);
    }

    public static final boolean c(CompletableDeferred completableDeferred, Object obj) {
        Throwable e2 = Result.e(obj);
        return e2 == null ? completableDeferred.c0(obj) : completableDeferred.j(e2);
    }
}
