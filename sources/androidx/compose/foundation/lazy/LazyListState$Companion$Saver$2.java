package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListState$Companion$Saver$2 extends Lambda implements Function1<List<? extends Integer>, LazyListState> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazyListState$Companion$Saver$2 f4489z = new LazyListState$Companion$Saver$2();

    public LazyListState$Companion$Saver$2() {
        super(1);
    }

    /* renamed from: b */
    public final LazyListState invoke(List list) {
        return new LazyListState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }
}
