package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridState$Companion$Saver$2 extends Lambda implements Function1<List<? extends Integer>, LazyGridState> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazyGridState$Companion$Saver$2 f4747z = new LazyGridState$Companion$Saver$2();

    public LazyGridState$Companion$Saver$2() {
        super(1);
    }

    /* renamed from: b */
    public final LazyGridState invoke(List list) {
        return new LazyGridState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }
}
