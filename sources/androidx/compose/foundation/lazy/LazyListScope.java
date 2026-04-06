package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

@Metadata
@LazyScopeMarker
public interface LazyListScope {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ void e(LazyListScope lazyListScope, int i2, Function1 function1, Function1 function12, Function4 function4, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                function1 = null;
            }
            if ((i3 & 4) != 0) {
                function12 = LazyListScope$items$1.f4452z;
            }
            lazyListScope.d(i2, function1, function12, function4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    static /* synthetic */ void f(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i2, Object obj3) {
        if (obj3 == null) {
            if ((i2 & 1) != 0) {
                obj = null;
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.a(obj, obj2, function3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    void a(Object obj, Object obj2, Function3 function3) {
        throw new IllegalStateException("The method is not implemented");
    }

    void d(int i2, Function1 function1, Function1 function12, Function4 function4) {
        throw new IllegalStateException("The method is not implemented");
    }
}
