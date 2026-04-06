package kotlinx.coroutines.future;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.Job;

@Metadata
final class CompletableFutureCoroutine<T> extends AbstractCoroutine<T> implements BiFunction<T, Throwable, Unit> {
    public final CompletableFuture C;

    public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        v1(obj, (Throwable) obj2);
        return Unit.f40552a;
    }

    public void s1(Throwable th, boolean z2) {
        this.C.completeExceptionally(th);
    }

    public void t1(Object obj) {
        this.C.complete(obj);
    }

    public void v1(Object obj, Throwable th) {
        Job.DefaultImpls.a(this, (CancellationException) null, 1, (Object) null);
    }
}
