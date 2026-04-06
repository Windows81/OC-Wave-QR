package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.CancellableKt;

@Metadata
final class LazyStandaloneCoroutine extends StandaloneCoroutine {
    public final Continuation C;

    public LazyStandaloneCoroutine(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.C = IntrinsicsKt.a(function2, this, this);
    }

    public void b1() {
        CancellableKt.b(this.C, this);
    }
}
