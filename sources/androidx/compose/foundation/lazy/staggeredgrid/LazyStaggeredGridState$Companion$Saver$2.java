package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridState$Companion$Saver$2 extends Lambda implements Function1<List<? extends int[]>, LazyStaggeredGridState> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazyStaggeredGridState$Companion$Saver$2 f5212z = new LazyStaggeredGridState$Companion$Saver$2();

    public LazyStaggeredGridState$Companion$Saver$2() {
        super(1);
    }

    /* renamed from: b */
    public final LazyStaggeredGridState invoke(List list) {
        return new LazyStaggeredGridState((int[]) list.get(0), (int[]) list.get(1), (PrefetchScheduler) null);
    }
}
