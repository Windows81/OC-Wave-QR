package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class LazyGridState$Companion$saver$4 extends Lambda implements Function1<List<? extends Integer>, LazyGridState> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyGridPrefetchStrategy f4749z;

    /* renamed from: b */
    public final LazyGridState invoke(List list) {
        return new LazyGridState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), this.f4749z);
    }
}
