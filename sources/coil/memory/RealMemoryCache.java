package coil.memory;

import coil.memory.MemoryCache;
import coil.util.Collections;
import kotlin.Metadata;

@Metadata
public final class RealMemoryCache implements MemoryCache {

    /* renamed from: a  reason: collision with root package name */
    public final StrongMemoryCache f23495a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakMemoryCache f23496b;

    public RealMemoryCache(StrongMemoryCache strongMemoryCache, WeakMemoryCache weakMemoryCache) {
        this.f23495a = strongMemoryCache;
        this.f23496b = weakMemoryCache;
    }

    public MemoryCache.Value a(MemoryCache.Key key) {
        MemoryCache.Value a2 = this.f23495a.a(key);
        return a2 == null ? this.f23496b.a(key) : a2;
    }

    public void b(int i2) {
        this.f23495a.b(i2);
        this.f23496b.b(i2);
    }

    public void c(MemoryCache.Key key, MemoryCache.Value value) {
        this.f23495a.c(MemoryCache.Key.b(key, (String) null, Collections.b(key.c()), 1, (Object) null), value.a(), Collections.b(value.b()));
    }
}
