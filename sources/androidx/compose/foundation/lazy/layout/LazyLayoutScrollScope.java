package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;

@Metadata
public interface LazyLayoutScrollScope extends ScrollScope {
    static /* synthetic */ int a(LazyLayoutScrollScope lazyLayoutScrollScope, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                i3 = 0;
            }
            return lazyLayoutScrollScope.d(i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateDistanceTo");
    }

    int b();

    int c();

    int d(int i2, int i3);

    void e(int i2, int i3);

    int f();

    int h();
}
