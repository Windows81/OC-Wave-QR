package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class EmptyWeakMemoryCache implements WeakMemoryCache {
    public MemoryCache.Value a(MemoryCache.Key key) {
        return null;
    }

    public void b(int i2) {
    }

    public void c(MemoryCache.Key key, Bitmap bitmap, Map map, int i2) {
    }
}
