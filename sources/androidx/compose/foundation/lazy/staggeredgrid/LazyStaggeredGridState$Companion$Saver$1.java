package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, LazyStaggeredGridState, List<? extends int[]>> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazyStaggeredGridState$Companion$Saver$1 f5211z = new LazyStaggeredGridState$Companion$Saver$1();

    public LazyStaggeredGridState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final List m(SaverScope saverScope, LazyStaggeredGridState lazyStaggeredGridState) {
        return CollectionsKt.p(lazyStaggeredGridState.H().d(), lazyStaggeredGridState.H().g());
    }
}
