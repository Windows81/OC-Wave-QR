package androidx.compose.foundation.lazy;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
@LazyScopeMarker
public interface LazyItemScope {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ Modifier a(LazyItemScope lazyItemScope, Modifier modifier, float f2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                f2 = 1.0f;
            }
            return lazyItemScope.b(modifier, f2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
    }

    Modifier b(Modifier modifier, float f2);
}
