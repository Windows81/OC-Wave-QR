package coil.memory;

import androidx.collection.LruCache;
import coil.memory.MemoryCache;
import coil.memory.RealStrongMemoryCache;
import kotlin.Metadata;

@Metadata
public final class RealStrongMemoryCache$cache$1 extends LruCache<MemoryCache.Key, RealStrongMemoryCache.InternalValue> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ RealStrongMemoryCache f23502j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealStrongMemoryCache$cache$1(int i2, RealStrongMemoryCache realStrongMemoryCache) {
        super(i2);
        this.f23502j = realStrongMemoryCache;
    }

    /* renamed from: m */
    public void b(boolean z2, MemoryCache.Key key, RealStrongMemoryCache.InternalValue internalValue, RealStrongMemoryCache.InternalValue internalValue2) {
        this.f23502j.f23497a.c(key, internalValue.a(), internalValue.b(), internalValue.c());
    }

    /* renamed from: n */
    public int j(MemoryCache.Key key, RealStrongMemoryCache.InternalValue internalValue) {
        return internalValue.c();
    }
}
