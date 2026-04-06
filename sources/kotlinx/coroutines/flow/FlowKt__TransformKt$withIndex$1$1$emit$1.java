package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", l = {67}, m = "emit")
public final class FlowKt__TransformKt$withIndex$1$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ FlowKt__TransformKt$withIndex$1$1 D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$withIndex$1$1$emit$1(FlowKt__TransformKt$withIndex$1$1 flowKt__TransformKt$withIndex$1$1, Continuation continuation) {
        super(continuation);
        this.D = flowKt__TransformKt$withIndex$1$1;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c((Object) null, this);
    }
}
