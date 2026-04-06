package coil;

import android.content.Context;
import coil.EventListener;
import coil.decode.ExifOrientationPolicy;
import coil.memory.MemoryCache;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.util.ImageLoaderOptions;
import coil.util.Logger;
import coil.util.Requests;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public interface ImageLoader {

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Context f23242a;

        /* renamed from: b  reason: collision with root package name */
        public DefaultRequestOptions f23243b = Requests.b();

        /* renamed from: c  reason: collision with root package name */
        public Lazy f23244c = null;

        /* renamed from: d  reason: collision with root package name */
        public Lazy f23245d = null;

        /* renamed from: e  reason: collision with root package name */
        public Lazy f23246e = null;

        /* renamed from: f  reason: collision with root package name */
        public EventListener.Factory f23247f = null;

        /* renamed from: g  reason: collision with root package name */
        public ComponentRegistry f23248g = null;

        /* renamed from: h  reason: collision with root package name */
        public ImageLoaderOptions f23249h = new ImageLoaderOptions(false, false, false, 0, (ExifOrientationPolicy) null, 31, (DefaultConstructorMarker) null);

        /* renamed from: i  reason: collision with root package name */
        public Logger f23250i = null;

        public Builder(Context context) {
            this.f23242a = context.getApplicationContext();
        }

        public final ImageLoader b() {
            Context context = this.f23242a;
            DefaultRequestOptions defaultRequestOptions = this.f23243b;
            Lazy lazy = this.f23244c;
            if (lazy == null) {
                lazy = LazyKt.b(new ImageLoader$Builder$build$1(this));
            }
            Lazy lazy2 = lazy;
            Lazy lazy3 = this.f23245d;
            if (lazy3 == null) {
                lazy3 = LazyKt.b(new ImageLoader$Builder$build$2(this));
            }
            Lazy lazy4 = lazy3;
            Lazy lazy5 = this.f23246e;
            if (lazy5 == null) {
                lazy5 = LazyKt.b(ImageLoader$Builder$build$3.f23253z);
            }
            Lazy lazy6 = lazy5;
            EventListener.Factory factory = this.f23247f;
            if (factory == null) {
                factory = EventListener.Factory.f23240b;
            }
            EventListener.Factory factory2 = factory;
            ComponentRegistry componentRegistry = this.f23248g;
            if (componentRegistry == null) {
                componentRegistry = new ComponentRegistry();
            }
            return new RealImageLoader(context, defaultRequestOptions, lazy2, lazy4, lazy6, factory2, componentRegistry, this.f23249h, this.f23250i);
        }
    }

    DefaultRequestOptions a();

    Disposable b(ImageRequest imageRequest);

    Object c(ImageRequest imageRequest, Continuation continuation);

    MemoryCache d();

    ComponentRegistry getComponents();
}
