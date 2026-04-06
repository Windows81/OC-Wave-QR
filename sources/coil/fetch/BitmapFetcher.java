package coil.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.fetch.Fetcher;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class BitmapFetcher implements Fetcher {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f23433a;

    /* renamed from: b  reason: collision with root package name */
    public final Options f23434b;

    @Metadata
    public static final class Factory implements Fetcher.Factory<Bitmap> {
        /* renamed from: b */
        public Fetcher a(Bitmap bitmap, Options options, ImageLoader imageLoader) {
            return new BitmapFetcher(bitmap, options);
        }
    }

    public BitmapFetcher(Bitmap bitmap, Options options) {
        this.f23433a = bitmap;
        this.f23434b = options;
    }

    public Object a(Continuation continuation) {
        return new DrawableResult(new BitmapDrawable(this.f23434b.g().getResources(), this.f23433a), false, DataSource.MEMORY);
    }
}
