package coil.fetch;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.fetch.Fetcher;
import coil.request.Options;
import coil.util.DrawableUtils;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class DrawableFetcher implements Fetcher {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f23439a;

    /* renamed from: b  reason: collision with root package name */
    public final Options f23440b;

    @Metadata
    public static final class Factory implements Fetcher.Factory<Drawable> {
        /* renamed from: b */
        public Fetcher a(Drawable drawable, Options options, ImageLoader imageLoader) {
            return new DrawableFetcher(drawable, options);
        }
    }

    public DrawableFetcher(Drawable drawable, Options options) {
        this.f23439a = drawable;
        this.f23440b = options;
    }

    public Object a(Continuation continuation) {
        Drawable drawable;
        boolean v2 = Utils.v(this.f23439a);
        if (v2) {
            drawable = new BitmapDrawable(this.f23440b.g().getResources(), DrawableUtils.f23746a.a(this.f23439a, this.f23440b.f(), this.f23440b.n(), this.f23440b.m(), this.f23440b.c()));
        } else {
            drawable = this.f23439a;
        }
        return new DrawableResult(drawable, v2, DataSource.MEMORY);
    }
}
