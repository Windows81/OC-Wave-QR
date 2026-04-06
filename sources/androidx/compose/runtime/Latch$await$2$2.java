package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class Latch$await$2$2 implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f14700A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Latch f14701z;

    public Latch$await$2$2(Latch latch, CancellableContinuation cancellableContinuation) {
        this.f14701z = latch;
        this.f14700A = cancellableContinuation;
    }

    public final void b(Throwable th) {
        Object b2 = this.f14701z.f14696a;
        Latch latch = this.f14701z;
        CancellableContinuation cancellableContinuation = this.f14700A;
        synchronized (b2) {
            latch.f14697b.remove(cancellableContinuation);
            Unit unit = Unit.f40552a;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
