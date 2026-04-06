package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class LazyListState$Companion$saver$4 extends Lambda implements Function1<List<? extends Integer>, LazyListState> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListPrefetchStrategy f4491z;

    /* renamed from: b */
    public final LazyListState invoke(List list) {
        return new LazyListState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), this.f4491z);
    }
}
