package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

@Metadata
@LazyGridScopeMarker
public interface LazyGridScope {
    static /* synthetic */ void b(LazyGridScope lazyGridScope, int i2, Function1 function1, Function2 function2, Function1 function12, Function4 function4, int i3, Object obj) {
        if (obj == null) {
            Function1 function13 = (i3 & 2) != 0 ? null : function1;
            Function2 function22 = (i3 & 4) != 0 ? null : function2;
            if ((i3 & 8) != 0) {
                function12 = LazyGridScope$items$1.f4694z;
            }
            lazyGridScope.c(i2, function13, function22, function12, function4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    void c(int i2, Function1 function1, Function2 function2, Function1 function12, Function4 function4);
}
