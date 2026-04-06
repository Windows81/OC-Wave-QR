package coil.fetch;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.AssetMetadata;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.fetch.Fetcher;
import coil.request.Options;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import okio.Okio;

@Metadata
public final class AssetUriFetcher implements Fetcher {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f23431a;

    /* renamed from: b  reason: collision with root package name */
    public final Options f23432b;

    @Metadata
    public static final class Factory implements Fetcher.Factory<Uri> {
        /* renamed from: b */
        public Fetcher a(Uri uri, Options options, ImageLoader imageLoader) {
            if (!Utils.r(uri)) {
                return null;
            }
            return new AssetUriFetcher(uri, options);
        }
    }

    public AssetUriFetcher(Uri uri, Options options) {
        this.f23431a = uri;
        this.f23432b = options;
    }

    public Object a(Continuation continuation) {
        String n0 = CollectionsKt.n0(CollectionsKt.Z(this.f23431a.getPathSegments(), 1), "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        return new SourceResult(ImageSources.b(Okio.d(Okio.k(this.f23432b.g().getAssets().open(n0))), this.f23432b.g(), new AssetMetadata(n0)), Utils.k(MimeTypeMap.getSingleton(), n0), DataSource.DISK);
    }
}
