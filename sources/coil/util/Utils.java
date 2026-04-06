package coil.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Looper;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil.EventListener;
import coil.decode.DataSource;
import coil.disk.DiskCache;
import coil.intercept.Interceptor;
import coil.intercept.RealInterceptorChain;
import coil.request.Parameters;
import coil.request.Tags;
import coil.size.Dimension;
import coil.size.Scale;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata
/* renamed from: coil.util.-Utils  reason: invalid class name */
public final class Utils {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap.Config[] f23736a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* renamed from: b  reason: collision with root package name */
    public static final Bitmap.Config f23737b = Bitmap.Config.HARDWARE;

    /* renamed from: c  reason: collision with root package name */
    public static final Headers f23738c = new Headers.Builder().f();

    @Metadata
    /* renamed from: coil.util.-Utils$WhenMappings */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23739a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f23740b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f23741c;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|33) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|33) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0065 */
        static {
            /*
                coil.decode.DataSource[] r0 = coil.decode.DataSource.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                coil.decode.DataSource r2 = coil.decode.DataSource.MEMORY_CACHE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                coil.decode.DataSource r3 = coil.decode.DataSource.MEMORY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                coil.decode.DataSource r4 = coil.decode.DataSource.DISK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                coil.decode.DataSource r5 = coil.decode.DataSource.NETWORK     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f23739a = r0
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f23740b = r0
                coil.size.Scale[] r0 = coil.size.Scale.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                coil.size.Scale r3 = coil.size.Scale.FILL     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                coil.size.Scale r1 = coil.size.Scale.FIT     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                f23741c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coil.util.Utils.WhenMappings.<clinit>():void");
        }
    }

    public static final int A(String str, int i2) {
        Long s2 = StringsKt.s(str);
        if (s2 == null) {
            return i2;
        }
        long longValue = s2.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final int B(Dimension dimension, Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).f23691a;
        }
        int i2 = WhenMappings.f23741c[scale.ordinal()];
        if (i2 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i2 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void a(DiskCache.Editor editor) {
        try {
            editor.a();
        } catch (Exception unused) {
        }
    }

    public static final Headers.Builder b(Headers.Builder builder, String str) {
        int i0 = StringsKt.i0(str, ':', 0, false, 6, (Object) null);
        if (i0 != -1) {
            String substring = str.substring(0, i0);
            Intrinsics.h(substring, "substring(...)");
            String obj = StringsKt.f1(substring).toString();
            String substring2 = str.substring(i0 + 1);
            Intrinsics.h(substring2, "substring(...)");
            builder.e(obj, substring2);
            return builder;
        }
        throw new IllegalArgumentException(("Unexpected header: " + str).toString());
    }

    public static final int c(Context context, double d2) {
        int i2;
        try {
            Object h2 = ContextCompat.h(context, ActivityManager.class);
            Intrinsics.f(h2);
            ActivityManager activityManager = (ActivityManager) h2;
            i2 = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            i2 = 256;
        }
        double d3 = (double) 1024;
        return (int) (d2 * ((double) i2) * d3 * d3);
    }

    public static final void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final double e(Context context) {
        try {
            Object h2 = ContextCompat.h(context, ActivityManager.class);
            Intrinsics.f(h2);
            return ((ActivityManager) h2).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Bitmap.Config f() {
        return f23737b;
    }

    public static final String g(DataSource dataSource) {
        int i2 = WhenMappings.f23739a[dataSource.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return "🧠";
        }
        if (i2 == 3) {
            return "💾";
        }
        if (i2 == 4) {
            return "☁️ ";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final EventListener h(Interceptor.Chain chain) {
        return chain instanceof RealInterceptorChain ? ((RealInterceptorChain) chain).f() : EventListener.f23237b;
    }

    public static final String i(Uri uri) {
        return (String) CollectionsKt.g0(uri.getPathSegments());
    }

    public static final int j(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final String k(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || StringsKt.l0(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.Y0(StringsKt.Z0(StringsKt.d1(StringsKt.d1(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    public static final int l(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: coil.request.ViewTargetRequestManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final coil.request.ViewTargetRequestManager m(android.view.View r3) {
        /*
            int r0 = coil.base.R.id.f23271a
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof coil.request.ViewTargetRequestManager
            r2 = 0
            if (r1 == 0) goto L_0x000e
            coil.request.ViewTargetRequestManager r0 = (coil.request.ViewTargetRequestManager) r0
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            if (r0 != 0) goto L_0x0037
            monitor-enter(r3)
            int r0 = coil.base.R.id.f23271a     // Catch:{ all -> 0x0020 }
            java.lang.Object r0 = r3.getTag(r0)     // Catch:{ all -> 0x0020 }
            boolean r1 = r0 instanceof coil.request.ViewTargetRequestManager     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0022
            r2 = r0
            coil.request.ViewTargetRequestManager r2 = (coil.request.ViewTargetRequestManager) r2     // Catch:{ all -> 0x0020 }
            goto L_0x0022
        L_0x0020:
            r0 = move-exception
            goto L_0x0035
        L_0x0022:
            if (r2 == 0) goto L_0x0026
            r0 = r2
            goto L_0x0033
        L_0x0026:
            coil.request.ViewTargetRequestManager r0 = new coil.request.ViewTargetRequestManager     // Catch:{ all -> 0x0020 }
            r0.<init>(r3)     // Catch:{ all -> 0x0020 }
            r3.addOnAttachStateChangeListener(r0)     // Catch:{ all -> 0x0020 }
            int r1 = coil.base.R.id.f23271a     // Catch:{ all -> 0x0020 }
            r3.setTag(r1, r0)     // Catch:{ all -> 0x0020 }
        L_0x0033:
            monitor-exit(r3)
            goto L_0x0037
        L_0x0035:
            monitor-exit(r3)
            throw r0
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.Utils.m(android.view.View):coil.request.ViewTargetRequestManager");
    }

    public static final File n(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            cacheDir.mkdirs();
            return cacheDir;
        }
        throw new IllegalStateException("cacheDir == null");
    }

    public static final Scale o(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i2 = scaleType == null ? -1 : WhenMappings.f23740b[scaleType.ordinal()];
        return (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? Scale.FIT : Scale.FILL;
    }

    public static final Bitmap.Config[] p() {
        return f23736a;
    }

    public static final int q(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean r(Uri uri) {
        return Intrinsics.d(uri.getScheme(), "file") && Intrinsics.d(i(uri), "android_asset");
    }

    public static final boolean s() {
        return Intrinsics.d(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean t(int i2) {
        return i2 == Integer.MIN_VALUE || i2 == Integer.MAX_VALUE;
    }

    public static final boolean u(Interceptor.Chain chain) {
        return (chain instanceof RealInterceptorChain) && ((RealInterceptorChain) chain).g();
    }

    public static final boolean v(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    public static final Parameters w(Parameters parameters) {
        return parameters == null ? Parameters.f23665B : parameters;
    }

    public static final Tags x(Tags tags) {
        return tags == null ? Tags.f23681c : tags;
    }

    public static final Headers y(Headers headers) {
        return headers == null ? f23738c : headers;
    }

    public static final ResponseBody z(Response response) {
        ResponseBody a2 = response.a();
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("response body == null");
    }
}
