package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public interface WeakMemoryCache {
    MemoryCache.Value a(MemoryCache.Key key);

    void b(int i2);

    void c(MemoryCache.Key key, Bitmap bitmap, Map map, int i2);
}
