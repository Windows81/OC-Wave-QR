package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata
public final class FlowKt__CollectionKt$toCollection$2<T> implements FlowCollector {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Collection f41592z;

    public FlowKt__CollectionKt$toCollection$2(Collection collection) {
        this.f41592z = collection;
    }

    public final Object c(Object obj, Continuation continuation) {
        this.f41592z.add(obj);
        return Unit.f40552a;
    }
}
