package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridStateKt$EmptyLazyGridLayoutInfo$2 extends Lambda implements Function1<Integer, List<? extends Pair<? extends Integer, ? extends Constraints>>> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazyGridStateKt$EmptyLazyGridLayoutInfo$2 f4759z = new LazyGridStateKt$EmptyLazyGridLayoutInfo$2();

    public LazyGridStateKt$EmptyLazyGridLayoutInfo$2() {
        super(1);
    }

    public final List b(int i2) {
        return CollectionsKt.m();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
