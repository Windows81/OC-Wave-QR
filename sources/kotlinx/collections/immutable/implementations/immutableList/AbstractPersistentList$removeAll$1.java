package kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AbstractPersistentList$removeAll$1 extends Lambda implements Function1<Object, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Collection f41243z;

    /* renamed from: b */
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(this.f41243z.contains(obj));
    }
}
