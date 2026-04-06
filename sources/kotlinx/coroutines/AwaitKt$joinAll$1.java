package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {47}, m = "joinAll")
public final class AwaitKt$joinAll$1 extends ContinuationImpl {
    public Object C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public int G;

    public AwaitKt$joinAll$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.G |= Integer.MIN_VALUE;
        return AwaitKt.c((Job[]) null, this);
    }
}
