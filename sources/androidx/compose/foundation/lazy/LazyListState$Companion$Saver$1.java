package androidx.compose.foundation.lazy;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, LazyListState, List<? extends Integer>> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazyListState$Companion$Saver$1 f4488z = new LazyListState$Companion$Saver$1();

    public LazyListState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final List m(SaverScope saverScope, LazyListState lazyListState) {
        return CollectionsKt.p(Integer.valueOf(lazyListState.s()), Integer.valueOf(lazyListState.t()));
    }
}
