package kotlinx.coroutines.future;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;

@Metadata
final class FutureKt$setupCancellation$1 implements Function2 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Job f41822z;

    public final void b(Object obj, Throwable th) {
        Job job = this.f41822z;
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = ExceptionsKt.a("CompletableFuture was completed exceptionally", th);
            }
        }
        job.c(cancellationException);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b(obj, (Throwable) obj2);
        return Unit.f40552a;
    }
}
