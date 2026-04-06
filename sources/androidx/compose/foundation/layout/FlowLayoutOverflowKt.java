package androidx.compose.foundation.layout;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class FlowLayoutOverflowKt {
    public static final Lazy a(String str, Function0 function0) {
        return new LazyImpl(function0, str);
    }

    public static /* synthetic */ Lazy b(String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "Lazy item is not yet initialized";
        }
        return a(str, function0);
    }
}
