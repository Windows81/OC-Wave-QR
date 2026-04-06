package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import coil.util.Bitmaps;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class RealStrongMemoryCache implements StrongMemoryCache {

    /* renamed from: a  reason: collision with root package name */
    public final WeakMemoryCache f23497a;

    /* renamed from: b  reason: collision with root package name */
    public final RealStrongMemoryCache$cache$1 f23498b;

    @Metadata
    public static final class InternalValue {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f23499a;

        /* renamed from: b  reason: collision with root package name */
        public final Map f23500b;

        /* renamed from: c  reason: collision with root package name */
        public final int f23501c;

        public InternalValue(Bitmap bitmap, Map map, int i2) {
            this.f23499a = bitmap;
            this.f23500b = map;
            this.f23501c = i2;
        }

        public final Bitmap a() {
            return this.f23499a;
        }

        public final Map b() {
            return this.f23500b;
        }

        public final int c() {
            return this.f23501c;
        }
    }

    public RealStrongMemoryCache(int i2, WeakMemoryCache weakMemoryCache) {
        this.f23497a = weakMemoryCache;
        this.f23498b = new RealStrongMemoryCache$cache$1(i2, this);
    }

    public MemoryCache.Value a(MemoryCache.Key key) {
        InternalValue internalValue = (InternalValue) this.f23498b.d(key);
        if (internalValue != null) {
            return new MemoryCache.Value(internalValue.a(), internalValue.b());
        }
        return null;
    }

    public void b(int i2) {
        if (i2 >= 40) {
            e();
        } else if (10 <= i2 && i2 < 20) {
            this.f23498b.l(g() / 2);
        }
    }

    public void c(MemoryCache.Key key, Bitmap bitmap, Map map) {
        int a2 = Bitmaps.a(bitmap);
        if (a2 <= f()) {
            this.f23498b.f(key, new InternalValue(bitmap, map, a2));
            return;
        }
        this.f23498b.g(key);
        this.f23497a.c(key, bitmap, map, a2);
    }

    public void e() {
        this.f23498b.c();
    }

    public int f() {
        return this.f23498b.e();
    }

    public int g() {
        return this.f23498b.i();
    }
}
