package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
final class LazyGridState$Companion$saver$3 extends Lambda implements Function2<SaverScope, LazyGridState, List<? extends Integer>> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazyGridState$Companion$saver$3 f4748z = new LazyGridState$Companion$saver$3();

    public LazyGridState$Companion$saver$3() {
        super(2);
    }

    /* renamed from: b */
    public final List m(SaverScope saverScope, LazyGridState lazyGridState) {
        return CollectionsKt.p(Integer.valueOf(lazyGridState.r()), Integer.valueOf(lazyGridState.s()));
    }
}
