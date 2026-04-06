package coil.fetch;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.decode.ResourceMetadata;
import coil.fetch.Fetcher;
import coil.request.Options;
import coil.util.Contexts;
import coil.util.DrawableUtils;
import coil.util.Utils;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Okio;

@Metadata
public final class ResourceUriFetcher implements Fetcher {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f23456c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Uri f23457a;

    /* renamed from: b  reason: collision with root package name */
    public final Options f23458b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Factory implements Fetcher.Factory<Uri> {
        private final boolean c(Uri uri) {
            return Intrinsics.d(uri.getScheme(), "android.resource");
        }

        /* renamed from: b */
        public Fetcher a(Uri uri, Options options, ImageLoader imageLoader) {
            if (!c(uri)) {
                return null;
            }
            return new ResourceUriFetcher(uri, options);
        }
    }

    public ResourceUriFetcher(Uri uri, Options options) {
        this.f23457a = uri;
        this.f23458b = options;
    }

    public Object a(Continuation continuation) {
        Integer q2;
        String authority = this.f23457a.getAuthority();
        if (authority != null) {
            if (StringsKt.l0(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt.q0(this.f23457a.getPathSegments());
                if (str == null || (q2 = StringsKt.q(str)) == null) {
                    b(this.f23457a);
                    throw new KotlinNothingValueException();
                }
                int intValue = q2.intValue();
                Context g2 = this.f23458b.g();
                Resources resources = Intrinsics.d(authority, g2.getPackageName()) ? g2.getResources() : g2.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String k2 = Utils.k(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.p0(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                if (Intrinsics.d(k2, "text/xml")) {
                    Drawable a2 = Intrinsics.d(authority, g2.getPackageName()) ? Contexts.a(g2, intValue) : Contexts.d(g2, resources, intValue);
                    boolean v2 = Utils.v(a2);
                    if (v2) {
                        a2 = new BitmapDrawable(g2.getResources(), DrawableUtils.f23746a.a(a2, this.f23458b.f(), this.f23458b.n(), this.f23458b.m(), this.f23458b.c()));
                    }
                    return new DrawableResult(a2, v2, DataSource.DISK);
                }
                TypedValue typedValue2 = new TypedValue();
                return new SourceResult(ImageSources.b(Okio.d(Okio.k(resources.openRawResource(intValue, typedValue2))), g2, new ResourceMetadata(authority, intValue, typedValue2.density)), k2, DataSource.DISK);
            }
        }
        b(this.f23457a);
        throw new KotlinNothingValueException();
    }

    public final Void b(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }
}
