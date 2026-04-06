package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", l = {34}, m = "whileSelect")
public final class WhileSelectKt$whileSelect$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public int E;

    public WhileSelectKt$whileSelect$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.E |= Integer.MIN_VALUE;
        return WhileSelectKt.a((Function1) null, this);
    }
}
