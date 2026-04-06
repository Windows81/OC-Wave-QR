package androidx.compose.foundation.lazy;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
final class LazyListState$Companion$saver$3 extends Lambda implements Function2<SaverScope, LazyListState, List<? extends Integer>> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazyListState$Companion$saver$3 f4490z = new LazyListState$Companion$saver$3();

    public LazyListState$Companion$saver$3() {
        super(2);
    }

    /* renamed from: b */
    public final List m(SaverScope saverScope, LazyListState lazyListState) {
        return CollectionsKt.p(Integer.valueOf(lazyListState.s()), Integer.valueOf(lazyListState.t()));
    }
}
