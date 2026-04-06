package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import coil.util.Bitmaps;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class EmptyStrongMemoryCache implements StrongMemoryCache {

    /* renamed from: a  reason: collision with root package name */
    public final WeakMemoryCache f23480a;

    public EmptyStrongMemoryCache(WeakMemoryCache weakMemoryCache) {
        this.f23480a = weakMemoryCache;
    }

    public MemoryCache.Value a(MemoryCache.Key key) {
        return null;
    }

    public void b(int i2) {
    }

    public void c(MemoryCache.Key key, Bitmap bitmap, Map map) {
        this.f23480a.c(key, bitmap, map, Bitmaps.a(bitmap));
    }
}
