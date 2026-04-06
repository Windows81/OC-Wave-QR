package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, 30}, m = "emit")
public final class CombineKt$combineInternal$2$1$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ CombineKt$combineInternal$2.AnonymousClass1.AnonymousClass1 D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2$1$1$emit$1(CombineKt$combineInternal$2.AnonymousClass1.AnonymousClass1 r1, Continuation continuation) {
        super(continuation);
        this.D = r1;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c((Object) null, this);
    }
}
