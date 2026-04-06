package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public int F;

    public ProduceKt$awaitClose$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return ProduceKt.a((ProducerScope) null, (Function0) null, this);
    }
}
