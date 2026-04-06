package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, LazyGridState, List<? extends Integer>> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazyGridState$Companion$Saver$1 f4746z = new LazyGridState$Companion$Saver$1();

    public LazyGridState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final List m(SaverScope saverScope, LazyGridState lazyGridState) {
        return CollectionsKt.p(Integer.valueOf(lazyGridState.r()), Integer.valueOf(lazyGridState.s()));
    }
}
