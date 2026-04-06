package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {22}, m = "toCollection")
public final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public int E;

    public FlowKt__CollectionKt$toCollection$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.E |= Integer.MIN_VALUE;
        return FlowKt.g0((Flow) null, (Collection) null, this);
    }
}
