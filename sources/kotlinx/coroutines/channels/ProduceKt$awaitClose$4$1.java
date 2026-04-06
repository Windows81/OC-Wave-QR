package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class ProduceKt$awaitClose$4$1 implements Function1<Throwable, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f41498z;

    public ProduceKt$awaitClose$4$1(CancellableContinuation cancellableContinuation) {
        this.f41498z = cancellableContinuation;
    }

    public final void b(Throwable th) {
        CancellableContinuation cancellableContinuation = this.f41498z;
        Result.Companion companion = Result.f40519A;
        cancellableContinuation.q(Result.b(Unit.f40552a));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
