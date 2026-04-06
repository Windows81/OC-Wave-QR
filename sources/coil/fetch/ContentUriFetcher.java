package coil.fetch;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import coil.ImageLoader;
import coil.decode.ContentMetadata;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.fetch.Fetcher;
import coil.request.Options;
import coil.size.Dimension;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;

@Metadata
public final class ContentUriFetcher implements Fetcher {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f23437a;

    /* renamed from: b  reason: collision with root package name */
    public final Options f23438b;

    @Metadata
    public static final class Factory implements Fetcher.Factory<Uri> {
        /* renamed from: b */
        public Fetcher a(Uri uri, Options options, ImageLoader imageLoader) {
            if (!c(uri)) {
                return null;
            }
            return new ContentUriFetcher(uri, options);
        }

        public final boolean c(Uri uri) {
            return Intrinsics.d(uri.getScheme(), "content");
        }
    }

    public ContentUriFetcher(Uri uri, Options options) {
        this.f23437a = uri;
        this.f23438b = options;
    }

    public Object a(Continuation continuation) {
        ContentResolver contentResolver = this.f23438b.g().getContentResolver();
        InputStream inputStream = null;
        if (b(this.f23437a)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f23437a, "r");
            if (openAssetFileDescriptor != null) {
                inputStream = openAssetFileDescriptor.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f23437a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.f23437a)) {
            inputStream = contentResolver.openInputStream(this.f23437a);
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f23437a + "'.").toString());
            }
        } else {
            AssetFileDescriptor a2 = contentResolver.openTypedAssetFile(this.f23437a, "image/*", d(), (CancellationSignal) null);
            if (a2 != null) {
                inputStream = a2.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f23437a + "'.").toString());
            }
        }
        return new SourceResult(ImageSources.b(Okio.d(Okio.k(inputStream)), this.f23438b.g(), new ContentMetadata(this.f23437a)), contentResolver.getType(this.f23437a), DataSource.DISK);
    }

    public final boolean b(Uri uri) {
        return Intrinsics.d(uri.getAuthority(), "com.android.contacts") && Intrinsics.d(uri.getLastPathSegment(), "display_photo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r5 = r5.getPathSegments();
        r0 = r5.size();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getAuthority()
            java.lang.String r1 = "media"
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.List r5 = r5.getPathSegments()
            int r0 = r5.size()
            r2 = 3
            if (r0 < r2) goto L_0x0036
            int r2 = r0 + -3
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r3 = "audio"
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r2 == 0) goto L_0x0036
            int r0 = r0 + -2
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r0 = "albums"
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r0)
            if (r5 == 0) goto L_0x0036
            r1 = 1
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.ContentUriFetcher.c(android.net.Uri):boolean");
    }

    public final Bundle d() {
        Dimension d2 = this.f23438b.n().d();
        Dimension.Pixels pixels = d2 instanceof Dimension.Pixels ? (Dimension.Pixels) d2 : null;
        if (pixels == null) {
            return null;
        }
        int i2 = pixels.f23691a;
        Dimension c2 = this.f23438b.n().c();
        Dimension.Pixels pixels2 = c2 instanceof Dimension.Pixels ? (Dimension.Pixels) c2 : null;
        if (pixels2 == null) {
            return null;
        }
        int i3 = pixels2.f23691a;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i2, i3));
        return bundle;
    }
}
