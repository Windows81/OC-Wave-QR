package coil.memory;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.DecodeUtils;
import coil.intercept.EngineInterceptor;
import coil.intercept.Interceptor;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.RequestService;
import coil.request.SuccessResult;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import coil.transform.Transformation;
import coil.util.Bitmaps;
import coil.util.Logger;
import coil.util.Requests;
import coil.util.Utils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class MemoryCacheService {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f23491d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final ImageLoader f23492a;

    /* renamed from: b  reason: collision with root package name */
    public final RequestService f23493b;

    /* renamed from: c  reason: collision with root package name */
    public final Logger f23494c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public MemoryCacheService(ImageLoader imageLoader, RequestService requestService, Logger logger) {
        this.f23492a = imageLoader;
        this.f23493b = requestService;
        this.f23494c = logger;
    }

    public final MemoryCache.Value a(ImageRequest imageRequest, MemoryCache.Key key, Size size, Scale scale) {
        if (!imageRequest.C().f()) {
            return null;
        }
        MemoryCache d2 = this.f23492a.d();
        MemoryCache.Value a2 = d2 != null ? d2.a(key) : null;
        if (a2 == null || !c(imageRequest, key, a2, size, scale)) {
            return null;
        }
        return a2;
    }

    public final String b(MemoryCache.Value value) {
        Object obj = value.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean c(ImageRequest imageRequest, MemoryCache.Key key, MemoryCache.Value value, Size size, Scale scale) {
        if (this.f23493b.c(imageRequest, Bitmaps.c(value.a()))) {
            return e(imageRequest, key, value, size, scale);
        }
        Logger logger = this.f23494c;
        if (logger == null || logger.a() > 3) {
            return false;
        }
        logger.b("MemoryCacheService", 3, imageRequest.m() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", (Throwable) null);
        return false;
    }

    public final boolean d(MemoryCache.Value value) {
        Object obj = value.b().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean e(ImageRequest imageRequest, MemoryCache.Key key, MemoryCache.Value value, Size size, Scale scale) {
        String str;
        Scale scale2 = scale;
        boolean d2 = d(value);
        if (!Sizes.a(size)) {
            String str2 = (String) key.c().get("coil#transformation_size");
            if (str2 != null) {
                return Intrinsics.d(str2, size.toString());
            }
            int width = value.a().getWidth();
            int height = value.a().getHeight();
            Dimension d3 = size.d();
            int i2 = Integer.MAX_VALUE;
            int i3 = d3 instanceof Dimension.Pixels ? ((Dimension.Pixels) d3).f23691a : Integer.MAX_VALUE;
            Dimension c2 = size.c();
            if (c2 instanceof Dimension.Pixels) {
                i2 = ((Dimension.Pixels) c2).f23691a;
            }
            double c3 = DecodeUtils.c(width, height, i3, i2, scale2);
            boolean a2 = Requests.a(imageRequest);
            if (a2) {
                double h2 = RangesKt.h(c3, 1.0d);
                str = "MemoryCacheService";
                if (Math.abs(((double) i3) - (((double) width) * h2)) <= 1.0d || Math.abs(((double) i2) - (h2 * ((double) height))) <= 1.0d) {
                    return true;
                }
            } else {
                str = "MemoryCacheService";
                if ((Utils.t(i3) || Math.abs(i3 - width) <= 1) && (Utils.t(i2) || Math.abs(i2 - height) <= 1)) {
                    return true;
                }
            }
            if (c3 != 1.0d && !a2) {
                Logger logger = this.f23494c;
                if (logger == null || logger.a() > 3) {
                    return false;
                }
                logger.b(str, 3, imageRequest.m() + ": Cached image's request size (" + width + ", " + height + ") does not exactly match the requested size (" + size.d() + ", " + size.c() + ", " + scale2 + ").", (Throwable) null);
                return false;
            }
            String str3 = str;
            if (c3 <= 1.0d || !d2) {
                return true;
            }
            Logger logger2 = this.f23494c;
            if (logger2 == null || logger2.a() > 3) {
                return false;
            }
            logger2.b(str3, 3, imageRequest.m() + ": Cached image's request size (" + width + ", " + height + ") is smaller than the requested size (" + size.d() + ", " + size.c() + ", " + scale2 + ").", (Throwable) null);
            return false;
        } else if (!d2) {
            return true;
        } else {
            Logger logger3 = this.f23494c;
            if (logger3 != null && logger3.a() <= 3) {
                logger3.b("MemoryCacheService", 3, imageRequest.m() + ": Requested original size, but cached image is sampled.", (Throwable) null);
            }
            return false;
        }
    }

    public final MemoryCache.Key f(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener) {
        MemoryCache.Key B2 = imageRequest.B();
        if (B2 != null) {
            return B2;
        }
        eventListener.r(imageRequest, obj);
        String f2 = this.f23492a.getComponents().f(obj, options);
        eventListener.e(imageRequest, f2);
        if (f2 == null) {
            return null;
        }
        List O = imageRequest.O();
        Map g2 = imageRequest.E().g();
        if (O.isEmpty() && g2.isEmpty()) {
            return new MemoryCache.Key(f2, (Map) null, 2, (DefaultConstructorMarker) null);
        }
        Map u2 = MapsKt.u(g2);
        if (!O.isEmpty()) {
            List O2 = imageRequest.O();
            int size = O2.size();
            for (int i2 = 0; i2 < size; i2++) {
                u2.put("coil#transformation_" + i2, ((Transformation) O2.get(i2)).a());
            }
            u2.put("coil#transformation_size", options.n().toString());
        }
        return new MemoryCache.Key(f2, u2);
    }

    public final SuccessResult g(Interceptor.Chain chain, ImageRequest imageRequest, MemoryCache.Key key, MemoryCache.Value value) {
        return new SuccessResult(new BitmapDrawable(imageRequest.l().getResources(), value.a()), imageRequest, DataSource.MEMORY_CACHE, key, b(value), d(value), Utils.u(chain));
    }

    public final boolean h(MemoryCache.Key key, ImageRequest imageRequest, EngineInterceptor.ExecuteResult executeResult) {
        MemoryCache d2;
        Bitmap bitmap;
        if (!(!imageRequest.C().h() || (d2 = this.f23492a.d()) == null || key == null)) {
            Drawable e2 = executeResult.e();
            BitmapDrawable bitmapDrawable = e2 instanceof BitmapDrawable ? (BitmapDrawable) e2 : null;
            if (!(bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(executeResult.f()));
                String d3 = executeResult.d();
                if (d3 != null) {
                    linkedHashMap.put("coil#disk_cache_key", d3);
                }
                d2.c(key, new MemoryCache.Value(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
