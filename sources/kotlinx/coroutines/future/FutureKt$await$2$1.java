package kotlinx.coroutines.future;

import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
final class FutureKt$await$2$1 implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ContinuationHandler f41820A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CompletableFuture f41821z;

    public final void b(Throwable th) {
        this.f41821z.cancel(false);
        this.f41820A.cont = null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
