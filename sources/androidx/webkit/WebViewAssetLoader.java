package androidx.webkit;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.core.util.Pair;
import androidx.webkit.internal.AssetHelper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public final class WebViewAssetLoader {

    /* renamed from: a  reason: collision with root package name */
    public final List f23122a;

    public static final class AssetsPathHandler implements PathHandler {

        /* renamed from: a  reason: collision with root package name */
        public final AssetHelper f23123a;

        public AssetsPathHandler(Context context) {
            this.f23123a = new AssetHelper(context);
        }

        public WebResourceResponse a(String str) {
            try {
                return new WebResourceResponse(AssetHelper.e(str), (String) null, this.f23123a.g(str));
            } catch (IOException e2) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e2);
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            }
        }
    }

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f23124a;

        /* renamed from: b  reason: collision with root package name */
        public String f23125b = "appassets.androidplatform.net";

        /* renamed from: c  reason: collision with root package name */
        public final List f23126c = new ArrayList();

        public Builder a(String str, PathHandler pathHandler) {
            this.f23126c.add(Pair.a(str, pathHandler));
            return this;
        }

        public WebViewAssetLoader b() {
            ArrayList arrayList = new ArrayList();
            for (Pair pair : this.f23126c) {
                arrayList.add(new PathMatcher(this.f23125b, (String) pair.f20157a, this.f23124a, (PathHandler) pair.f20158b));
            }
            return new WebViewAssetLoader(arrayList);
        }

        public Builder c(String str) {
            this.f23125b = str;
            return this;
        }
    }

    public static final class InternalStoragePathHandler implements PathHandler {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f23127b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* renamed from: a  reason: collision with root package name */
        public final File f23128a;

        public WebResourceResponse a(String str) {
            try {
                File b2 = AssetHelper.b(this.f23128a, str);
                if (b2 != null) {
                    return new WebResourceResponse(AssetHelper.e(str), (String) null, AssetHelper.h(b2));
                }
                Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", new Object[]{str, this.f23128a}));
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            } catch (IOException e2) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e2);
            }
        }
    }

    public interface PathHandler {
        WebResourceResponse a(String str);
    }

    public static class PathMatcher {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f23129a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23130b;

        /* renamed from: c  reason: collision with root package name */
        public final String f23131c;

        /* renamed from: d  reason: collision with root package name */
        public final PathHandler f23132d;

        public PathMatcher(String str, String str2, boolean z2, PathHandler pathHandler) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            } else if (str2.endsWith("/")) {
                this.f23130b = str;
                this.f23131c = str2;
                this.f23129a = z2;
                this.f23132d = pathHandler;
            } else {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
        }

        public String a(String str) {
            return str.replaceFirst(this.f23131c, "");
        }

        public PathHandler b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.f23129a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f23130b) && uri.getPath().startsWith(this.f23131c)) {
                return this.f23132d;
            }
            return null;
        }
    }

    public static final class ResourcesPathHandler implements PathHandler {

        /* renamed from: a  reason: collision with root package name */
        public final AssetHelper f23133a;

        public ResourcesPathHandler(Context context) {
            this.f23133a = new AssetHelper(context);
        }

        public WebResourceResponse a(String str) {
            try {
                return new WebResourceResponse(AssetHelper.e(str), (String) null, this.f23133a.i(str));
            } catch (Resources.NotFoundException e2) {
                Log.e("WebViewAssetLoader", "Resource not found from the path: " + str, e2);
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            } catch (IOException e3) {
                Log.e("WebViewAssetLoader", "Error opening resource from the path: " + str, e3);
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            }
        }
    }

    public WebViewAssetLoader(List list) {
        this.f23122a = list;
    }

    public WebResourceResponse a(Uri uri) {
        WebResourceResponse a2;
        for (PathMatcher pathMatcher : this.f23122a) {
            PathHandler b2 = pathMatcher.b(uri);
            if (b2 != null && (a2 = b2.a(pathMatcher.a(uri.getPath()))) != null) {
                return a2;
            }
        }
        return null;
    }
}
