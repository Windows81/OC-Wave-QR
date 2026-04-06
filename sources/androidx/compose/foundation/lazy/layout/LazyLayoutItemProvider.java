package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;

@Metadata
public interface LazyLayoutItemProvider {
    int b();

    Object c(int i2) {
        return Lazy_androidKt.a(i2);
    }

    int e(Object obj) {
        return -1;
    }

    Object f(int i2) {
        return null;
    }

    void i(int i2, Object obj, Composer composer, int i3);
}
