package coil;

import android.content.Context;
import kotlin.Metadata;

@Metadata
public final class Coil {

    /* renamed from: a  reason: collision with root package name */
    public static final Coil f23223a = new Coil();

    /* renamed from: b  reason: collision with root package name */
    public static ImageLoader f23224b;

    /* renamed from: c  reason: collision with root package name */
    public static ImageLoaderFactory f23225c;

    public static final ImageLoader a(Context context) {
        ImageLoader imageLoader = f23224b;
        return imageLoader == null ? f23223a.b(context) : imageLoader;
    }

    public static final synchronized void c(ImageLoader imageLoader) {
        synchronized (Coil.class) {
            f23225c = null;
            f23224b = imageLoader;
        }
    }

    public final synchronized ImageLoader b(Context context) {
        ImageLoader imageLoader;
        try {
            ImageLoader imageLoader2 = f23224b;
            if (imageLoader2 != null) {
                return imageLoader2;
            }
            ImageLoaderFactory imageLoaderFactory = f23225c;
            if (imageLoaderFactory != null) {
                imageLoader = imageLoaderFactory.a();
                if (imageLoader == null) {
                }
                f23225c = null;
                f23224b = imageLoader;
                return imageLoader;
            }
            Context applicationContext = context.getApplicationContext();
            ImageLoaderFactory imageLoaderFactory2 = applicationContext instanceof ImageLoaderFactory ? (ImageLoaderFactory) applicationContext : null;
            imageLoader = imageLoaderFactory2 != null ? imageLoaderFactory2.a() : ImageLoaders.a(context);
            f23225c = null;
            f23224b = imageLoader;
            return imageLoader;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
