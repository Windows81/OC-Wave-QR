package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;

@Metadata
public final class LazyGridSpanKt {
    public static final long a(int i2) {
        if (!(i2 > 0)) {
            InlineClassHelperKt.a("The span value should be higher than 0");
        }
        return GridItemSpan.b((long) i2);
    }
}
