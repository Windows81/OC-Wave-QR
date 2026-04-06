package coil.fetch;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSource;
import coil.decode.ImageSources;
import coil.disk.DiskCache;
import coil.fetch.Fetcher;
import coil.network.CacheStrategy;
import coil.request.Options;
import coil.util.Utils;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.FileSystem;

@Metadata
public final class HttpUriFetcher implements Fetcher {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f23445f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final CacheControl f23446g = new CacheControl.Builder().d().e().a();

    /* renamed from: h  reason: collision with root package name */
    public static final CacheControl f23447h = new CacheControl.Builder().d().f().a();

    /* renamed from: a  reason: collision with root package name */
    public final String f23448a;

    /* renamed from: b  reason: collision with root package name */
    public final Options f23449b;

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f23450c;

    /* renamed from: d  reason: collision with root package name */
    public final Lazy f23451d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f23452e;

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

        /* renamed from: a  reason: collision with root package name */
        public final Lazy f23453a;

        /* renamed from: b  reason: collision with root package name */
        public final Lazy f23454b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f23455c;

        public Factory(Lazy lazy, Lazy lazy2, boolean z2) {
            this.f23453a = lazy;
            this.f23454b = lazy2;
            this.f23455c = z2;
        }

        private final boolean c(Uri uri) {
            return Intrinsics.d(uri.getScheme(), "http") || Intrinsics.d(uri.getScheme(), "https");
        }

        /* renamed from: b */
        public Fetcher a(Uri uri, Options options, ImageLoader imageLoader) {
            if (!c(uri)) {
                return null;
            }
            return new HttpUriFetcher(uri.toString(), options, this.f23453a, this.f23454b, this.f23455c);
        }
    }

    public HttpUriFetcher(String str, Options options, Lazy lazy, Lazy lazy2, boolean z2) {
        this.f23448a = str;
        this.f23449b = options;
        this.f23450c = lazy;
        this.f23451d = lazy2;
        this.f23452e = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012c A[Catch:{ Exception -> 0x013f }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014d A[Catch:{ Exception -> 0x013f }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof coil.fetch.HttpUriFetcher$fetch$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            coil.fetch.HttpUriFetcher$fetch$1 r0 = (coil.fetch.HttpUriFetcher$fetch$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            coil.fetch.HttpUriFetcher$fetch$1 r0 = new coil.fetch.HttpUriFetcher$fetch$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005e
            if (r2 == r6) goto L_0x0047
            if (r2 != r5) goto L_0x003f
            java.lang.Object r1 = r0.E
            okhttp3.Response r1 = (okhttp3.Response) r1
            java.lang.Object r2 = r0.D
            coil.disk.DiskCache$Snapshot r2 = (coil.disk.DiskCache.Snapshot) r2
            java.lang.Object r0 = r0.C
            coil.fetch.HttpUriFetcher r0 = (coil.fetch.HttpUriFetcher) r0
            kotlin.ResultKt.b(r13)     // Catch:{ Exception -> 0x003c }
            goto L_0x0186
        L_0x003c:
            r13 = move-exception
            goto L_0x01a4
        L_0x003f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0047:
            java.lang.Object r2 = r0.E
            coil.network.CacheStrategy r2 = (coil.network.CacheStrategy) r2
            java.lang.Object r6 = r0.D
            coil.disk.DiskCache$Snapshot r6 = (coil.disk.DiskCache.Snapshot) r6
            java.lang.Object r8 = r0.C
            coil.fetch.HttpUriFetcher r8 = (coil.fetch.HttpUriFetcher) r8
            kotlin.ResultKt.b(r13)     // Catch:{ Exception -> 0x005b }
            r11 = r6
            r6 = r2
            r2 = r11
            goto L_0x0118
        L_0x005b:
            r13 = move-exception
            goto L_0x01aa
        L_0x005e:
            kotlin.ResultKt.b(r13)
            coil.disk.DiskCache$Snapshot r13 = r12.i()
            if (r13 == 0) goto L_0x00f0
            okio.FileSystem r2 = r12.e()     // Catch:{ Exception -> 0x0094 }
            okio.Path r8 = r13.v()     // Catch:{ Exception -> 0x0094 }
            okio.FileMetadata r2 = r2.m(r8)     // Catch:{ Exception -> 0x0094 }
            java.lang.Long r2 = r2.d()     // Catch:{ Exception -> 0x0094 }
            if (r2 != 0) goto L_0x007a
            goto L_0x0099
        L_0x007a:
            long r8 = r2.longValue()     // Catch:{ Exception -> 0x0094 }
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0099
            coil.fetch.SourceResult r0 = new coil.fetch.SourceResult     // Catch:{ Exception -> 0x0094 }
            coil.decode.ImageSource r1 = r12.l(r13)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = r12.f23448a     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = r12.f(r2, r7)     // Catch:{ Exception -> 0x0094 }
            coil.decode.DataSource r3 = coil.decode.DataSource.DISK     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0094 }
            return r0
        L_0x0094:
            r0 = move-exception
            r6 = r13
            r13 = r0
            goto L_0x01aa
        L_0x0099:
            boolean r2 = r12.f23452e     // Catch:{ Exception -> 0x0094 }
            if (r2 == 0) goto L_0x00d4
            coil.network.CacheStrategy$Factory r2 = new coil.network.CacheStrategy$Factory     // Catch:{ Exception -> 0x0094 }
            okhttp3.Request r8 = r12.h()     // Catch:{ Exception -> 0x0094 }
            coil.network.CacheResponse r9 = r12.j(r13)     // Catch:{ Exception -> 0x0094 }
            r2.<init>(r8, r9)     // Catch:{ Exception -> 0x0094 }
            coil.network.CacheStrategy r2 = r2.b()     // Catch:{ Exception -> 0x0094 }
            okhttp3.Request r8 = r2.b()     // Catch:{ Exception -> 0x0094 }
            if (r8 != 0) goto L_0x00fd
            coil.network.CacheResponse r8 = r2.a()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x00fd
            coil.fetch.SourceResult r0 = new coil.fetch.SourceResult     // Catch:{ Exception -> 0x0094 }
            coil.decode.ImageSource r1 = r12.l(r13)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r3 = r12.f23448a     // Catch:{ Exception -> 0x0094 }
            coil.network.CacheResponse r2 = r2.a()     // Catch:{ Exception -> 0x0094 }
            okhttp3.MediaType r2 = r2.b()     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = r12.f(r3, r2)     // Catch:{ Exception -> 0x0094 }
            coil.decode.DataSource r3 = coil.decode.DataSource.DISK     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0094 }
            return r0
        L_0x00d4:
            coil.fetch.SourceResult r0 = new coil.fetch.SourceResult     // Catch:{ Exception -> 0x0094 }
            coil.decode.ImageSource r1 = r12.l(r13)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = r12.f23448a     // Catch:{ Exception -> 0x0094 }
            coil.network.CacheResponse r3 = r12.j(r13)     // Catch:{ Exception -> 0x0094 }
            if (r3 == 0) goto L_0x00e6
            okhttp3.MediaType r7 = r3.b()     // Catch:{ Exception -> 0x0094 }
        L_0x00e6:
            java.lang.String r2 = r12.f(r2, r7)     // Catch:{ Exception -> 0x0094 }
            coil.decode.DataSource r3 = coil.decode.DataSource.DISK     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0094 }
            return r0
        L_0x00f0:
            coil.network.CacheStrategy$Factory r2 = new coil.network.CacheStrategy$Factory     // Catch:{ Exception -> 0x0094 }
            okhttp3.Request r8 = r12.h()     // Catch:{ Exception -> 0x0094 }
            r2.<init>(r8, r7)     // Catch:{ Exception -> 0x0094 }
            coil.network.CacheStrategy r2 = r2.b()     // Catch:{ Exception -> 0x0094 }
        L_0x00fd:
            okhttp3.Request r8 = r2.b()     // Catch:{ Exception -> 0x0094 }
            kotlin.jvm.internal.Intrinsics.f(r8)     // Catch:{ Exception -> 0x0094 }
            r0.C = r12     // Catch:{ Exception -> 0x0094 }
            r0.D = r13     // Catch:{ Exception -> 0x0094 }
            r0.E = r2     // Catch:{ Exception -> 0x0094 }
            r0.H = r6     // Catch:{ Exception -> 0x0094 }
            java.lang.Object r6 = r12.c(r8, r0)     // Catch:{ Exception -> 0x0094 }
            if (r6 != r1) goto L_0x0113
            return r1
        L_0x0113:
            r8 = r12
            r11 = r2
            r2 = r13
            r13 = r6
            r6 = r11
        L_0x0118:
            okhttp3.Response r13 = (okhttp3.Response) r13     // Catch:{ Exception -> 0x01a8 }
            okhttp3.ResponseBody r9 = coil.util.Utils.z(r13)     // Catch:{ Exception -> 0x01a8 }
            okhttp3.Request r10 = r6.b()     // Catch:{ Exception -> 0x013f }
            coil.network.CacheResponse r6 = r6.a()     // Catch:{ Exception -> 0x013f }
            coil.disk.DiskCache$Snapshot r2 = r8.n(r2, r10, r13, r6)     // Catch:{ Exception -> 0x013f }
            if (r2 == 0) goto L_0x014d
            coil.fetch.SourceResult r0 = new coil.fetch.SourceResult     // Catch:{ Exception -> 0x013f }
            coil.decode.ImageSource r1 = r8.l(r2)     // Catch:{ Exception -> 0x013f }
            java.lang.String r3 = r8.f23448a     // Catch:{ Exception -> 0x013f }
            coil.network.CacheResponse r4 = r8.j(r2)     // Catch:{ Exception -> 0x013f }
            if (r4 == 0) goto L_0x0143
            okhttp3.MediaType r7 = r4.b()     // Catch:{ Exception -> 0x013f }
            goto L_0x0143
        L_0x013f:
            r0 = move-exception
            r1 = r13
            r13 = r0
            goto L_0x01a4
        L_0x0143:
            java.lang.String r3 = r8.f(r3, r7)     // Catch:{ Exception -> 0x013f }
            coil.decode.DataSource r4 = coil.decode.DataSource.NETWORK     // Catch:{ Exception -> 0x013f }
            r0.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x013f }
            return r0
        L_0x014d:
            long r6 = r9.d()     // Catch:{ Exception -> 0x013f }
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x016d
            coil.fetch.SourceResult r0 = new coil.fetch.SourceResult     // Catch:{ Exception -> 0x013f }
            coil.decode.ImageSource r1 = r8.m(r9)     // Catch:{ Exception -> 0x013f }
            java.lang.String r3 = r8.f23448a     // Catch:{ Exception -> 0x013f }
            okhttp3.MediaType r4 = r9.f()     // Catch:{ Exception -> 0x013f }
            java.lang.String r3 = r8.f(r3, r4)     // Catch:{ Exception -> 0x013f }
            coil.decode.DataSource r4 = r8.k(r13)     // Catch:{ Exception -> 0x013f }
            r0.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x013f }
            return r0
        L_0x016d:
            coil.util.Utils.d(r13)     // Catch:{ Exception -> 0x013f }
            okhttp3.Request r3 = r8.h()     // Catch:{ Exception -> 0x013f }
            r0.C = r8     // Catch:{ Exception -> 0x013f }
            r0.D = r2     // Catch:{ Exception -> 0x013f }
            r0.E = r13     // Catch:{ Exception -> 0x013f }
            r0.H = r5     // Catch:{ Exception -> 0x013f }
            java.lang.Object r0 = r8.c(r3, r0)     // Catch:{ Exception -> 0x013f }
            if (r0 != r1) goto L_0x0183
            return r1
        L_0x0183:
            r1 = r13
            r13 = r0
            r0 = r8
        L_0x0186:
            okhttp3.Response r13 = (okhttp3.Response) r13     // Catch:{ Exception -> 0x003c }
            okhttp3.ResponseBody r1 = coil.util.Utils.z(r13)     // Catch:{ Exception -> 0x013f }
            coil.fetch.SourceResult r3 = new coil.fetch.SourceResult     // Catch:{ Exception -> 0x013f }
            coil.decode.ImageSource r4 = r0.m(r1)     // Catch:{ Exception -> 0x013f }
            java.lang.String r5 = r0.f23448a     // Catch:{ Exception -> 0x013f }
            okhttp3.MediaType r1 = r1.f()     // Catch:{ Exception -> 0x013f }
            java.lang.String r1 = r0.f(r5, r1)     // Catch:{ Exception -> 0x013f }
            coil.decode.DataSource r0 = r0.k(r13)     // Catch:{ Exception -> 0x013f }
            r3.<init>(r4, r1, r0)     // Catch:{ Exception -> 0x013f }
            return r3
        L_0x01a4:
            coil.util.Utils.d(r1)     // Catch:{ Exception -> 0x01a8 }
            throw r13     // Catch:{ Exception -> 0x01a8 }
        L_0x01a8:
            r13 = move-exception
            r6 = r2
        L_0x01aa:
            if (r6 == 0) goto L_0x01af
            coil.util.Utils.d(r6)
        L_0x01af:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(okhttp3.Request r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof coil.fetch.HttpUriFetcher$executeNetworkRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            coil.fetch.HttpUriFetcher$executeNetworkRequest$1 r0 = (coil.fetch.HttpUriFetcher$executeNetworkRequest$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            coil.fetch.HttpUriFetcher$executeNetworkRequest$1 r0 = new coil.fetch.HttpUriFetcher$executeNetworkRequest$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r6)
            goto L_0x0072
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r6)
            boolean r6 = coil.util.Utils.s()
            if (r6 == 0) goto L_0x005d
            coil.request.Options r6 = r4.f23449b
            coil.request.CachePolicy r6 = r6.k()
            boolean r6 = r6.f()
            if (r6 != 0) goto L_0x0057
            kotlin.Lazy r6 = r4.f23450c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.b(r5)
            okhttp3.Response r5 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r5)
            goto L_0x0075
        L_0x0057:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L_0x005d:
            kotlin.Lazy r6 = r4.f23450c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.b(r5)
            r0.E = r3
            java.lang.Object r6 = coil.util.Calls.a(r5, r0)
            if (r6 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L_0x0075:
            boolean r6 = r5.r()
            if (r6 != 0) goto L_0x0092
            int r6 = r5.f()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L_0x0092
            okhttp3.ResponseBody r6 = r5.a()
            if (r6 == 0) goto L_0x008c
            coil.util.Utils.d(r6)
        L_0x008c:
            coil.network.HttpException r6 = new coil.network.HttpException
            r6.<init>(r5)
            throw r6
        L_0x0092:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.c(okhttp3.Request, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String d() {
        String h2 = this.f23449b.h();
        return h2 == null ? this.f23448a : h2;
    }

    public final FileSystem e() {
        Object value = this.f23451d.getValue();
        Intrinsics.f(value);
        return ((DiskCache) value).c();
    }

    public final String f(String str, MediaType mediaType) {
        String k2;
        String mediaType2 = mediaType != null ? mediaType.toString() : null;
        if ((mediaType2 == null || StringsKt.Q(mediaType2, "text/plain", false, 2, (Object) null)) && (k2 = Utils.k(MimeTypeMap.getSingleton(), str)) != null) {
            return k2;
        }
        if (mediaType2 != null) {
            return StringsKt.b1(mediaType2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    public final boolean g(Request request, Response response) {
        return this.f23449b.i().h() && (!this.f23452e || CacheStrategy.f23518c.c(request, response));
    }

    public final Request h() {
        Request.Builder e2 = new Request.Builder().i(this.f23448a).e(this.f23449b.j());
        for (Map.Entry entry : this.f23449b.o().a().entrySet()) {
            Object key = entry.getKey();
            Intrinsics.g(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            e2.h((Class) key, entry.getValue());
        }
        boolean f2 = this.f23449b.i().f();
        boolean f3 = this.f23449b.k().f();
        if (!f3 && f2) {
            e2.c(CacheControl.f42530p);
        } else if (!f3 || f2) {
            if (!f3 && !f2) {
                e2.c(f23447h);
            }
        } else if (this.f23449b.i().h()) {
            e2.c(CacheControl.f42529o);
        } else {
            e2.c(f23446g);
        }
        return e2.b();
    }

    public final DiskCache.Snapshot i() {
        DiskCache diskCache;
        if (!this.f23449b.i().f() || (diskCache = (DiskCache) this.f23451d.getValue()) == null) {
            return null;
        }
        return diskCache.b(d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f A[Catch:{ IOException -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033 A[Catch:{ IOException -> 0x0034 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final coil.network.CacheResponse j(coil.disk.DiskCache.Snapshot r3) {
        /*
            r2 = this;
            r0 = 0
            okio.FileSystem r1 = r2.e()     // Catch:{ IOException -> 0x0034 }
            okio.Path r3 = r3.v()     // Catch:{ IOException -> 0x0034 }
            okio.Source r3 = r1.t(r3)     // Catch:{ IOException -> 0x0034 }
            okio.BufferedSource r3 = okio.Okio.d(r3)     // Catch:{ IOException -> 0x0034 }
            coil.network.CacheResponse r1 = new coil.network.CacheResponse     // Catch:{ all -> 0x0020 }
            r1.<init>((okio.BufferedSource) r3)     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x001e
            r3.close()     // Catch:{ all -> 0x001c }
            goto L_0x001e
        L_0x001c:
            r3 = move-exception
            goto L_0x002d
        L_0x001e:
            r3 = r0
            goto L_0x002d
        L_0x0020:
            r1 = move-exception
            if (r3 == 0) goto L_0x002b
            r3.close()     // Catch:{ all -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r3 = move-exception
            kotlin.ExceptionsKt.a(r1, r3)     // Catch:{ IOException -> 0x0034 }
        L_0x002b:
            r3 = r1
            r1 = r0
        L_0x002d:
            if (r3 != 0) goto L_0x0033
            kotlin.jvm.internal.Intrinsics.f(r1)     // Catch:{ IOException -> 0x0034 }
            return r1
        L_0x0033:
            throw r3     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.j(coil.disk.DiskCache$Snapshot):coil.network.CacheResponse");
    }

    public final DataSource k(Response response) {
        return response.x() != null ? DataSource.NETWORK : DataSource.DISK;
    }

    public final ImageSource l(DiskCache.Snapshot snapshot) {
        return ImageSources.c(snapshot.getData(), e(), d(), snapshot);
    }

    public final ImageSource m(ResponseBody responseBody) {
        return ImageSources.a(responseBody.j(), this.f23449b.g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089 A[Catch:{ Exception -> 0x0081, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e A[Catch:{ Exception -> 0x0081, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c2 A[Catch:{ Exception -> 0x0081, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0100 A[Catch:{ Exception -> 0x0081, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x010b A[SYNTHETIC, Splitter:B:76:0x010b] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010c A[Catch:{ Exception -> 0x0081, all -> 0x007e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final coil.disk.DiskCache.Snapshot n(coil.disk.DiskCache.Snapshot r6, okhttp3.Request r7, okhttp3.Response r8, coil.network.CacheResponse r9) {
        /*
            r5 = this;
            boolean r7 = r5.g(r7, r8)
            r0 = 0
            if (r7 != 0) goto L_0x000d
            if (r6 == 0) goto L_0x000c
            coil.util.Utils.d(r6)
        L_0x000c:
            return r0
        L_0x000d:
            if (r6 == 0) goto L_0x0014
            coil.disk.DiskCache$Editor r6 = r6.B0()
            goto L_0x0028
        L_0x0014:
            kotlin.Lazy r6 = r5.f23451d
            java.lang.Object r6 = r6.getValue()
            coil.disk.DiskCache r6 = (coil.disk.DiskCache) r6
            if (r6 == 0) goto L_0x0027
            java.lang.String r7 = r5.d()
            coil.disk.DiskCache$Editor r6 = r6.a(r7)
            goto L_0x0028
        L_0x0027:
            r6 = r0
        L_0x0028:
            if (r6 != 0) goto L_0x002b
            return r0
        L_0x002b:
            int r7 = r8.f()     // Catch:{ Exception -> 0x0081 }
            r1 = 304(0x130, float:4.26E-43)
            r2 = 0
            if (r7 != r1) goto L_0x008f
            if (r9 == 0) goto L_0x008f
            okhttp3.Response$Builder r7 = r8.y()     // Catch:{ Exception -> 0x0081 }
            coil.network.CacheStrategy$Companion r1 = coil.network.CacheStrategy.f23518c     // Catch:{ Exception -> 0x0081 }
            okhttp3.Headers r9 = r9.d()     // Catch:{ Exception -> 0x0081 }
            okhttp3.Headers r3 = r8.m()     // Catch:{ Exception -> 0x0081 }
            okhttp3.Headers r9 = r1.a(r9, r3)     // Catch:{ Exception -> 0x0081 }
            okhttp3.Response$Builder r7 = r7.k(r9)     // Catch:{ Exception -> 0x0081 }
            okhttp3.Response r7 = r7.c()     // Catch:{ Exception -> 0x0081 }
            okio.FileSystem r9 = r5.e()     // Catch:{ Exception -> 0x0081 }
            okio.Path r1 = r6.v()     // Catch:{ Exception -> 0x0081 }
            okio.Sink r9 = r9.s(r1, r2)     // Catch:{ Exception -> 0x0081 }
            okio.BufferedSink r9 = okio.Okio.c(r9)     // Catch:{ Exception -> 0x0081 }
            coil.network.CacheResponse r1 = new coil.network.CacheResponse     // Catch:{ all -> 0x0072 }
            r1.<init>((okhttp3.Response) r7)     // Catch:{ all -> 0x0072 }
            r1.g(r9)     // Catch:{ all -> 0x0072 }
            kotlin.Unit r7 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0072 }
            if (r9 == 0) goto L_0x0087
            r9.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0087
        L_0x0070:
            r0 = move-exception
            goto L_0x0087
        L_0x0072:
            r7 = move-exception
            if (r9 == 0) goto L_0x0084
            r9.close()     // Catch:{ all -> 0x0079 }
            goto L_0x0084
        L_0x0079:
            r9 = move-exception
            kotlin.ExceptionsKt.a(r7, r9)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0084
        L_0x007e:
            r6 = move-exception
            goto L_0x0111
        L_0x0081:
            r7 = move-exception
            goto L_0x010d
        L_0x0084:
            r4 = r0
            r0 = r7
            r7 = r4
        L_0x0087:
            if (r0 != 0) goto L_0x008e
            kotlin.jvm.internal.Intrinsics.f(r7)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0103
        L_0x008e:
            throw r0     // Catch:{ Exception -> 0x0081 }
        L_0x008f:
            okio.FileSystem r7 = r5.e()     // Catch:{ Exception -> 0x0081 }
            okio.Path r9 = r6.v()     // Catch:{ Exception -> 0x0081 }
            okio.Sink r7 = r7.s(r9, r2)     // Catch:{ Exception -> 0x0081 }
            okio.BufferedSink r7 = okio.Okio.c(r7)     // Catch:{ Exception -> 0x0081 }
            coil.network.CacheResponse r9 = new coil.network.CacheResponse     // Catch:{ all -> 0x00b3 }
            r9.<init>((okhttp3.Response) r8)     // Catch:{ all -> 0x00b3 }
            r9.g(r7)     // Catch:{ all -> 0x00b3 }
            kotlin.Unit r9 = kotlin.Unit.f40552a     // Catch:{ all -> 0x00b3 }
            if (r7 == 0) goto L_0x00b1
            r7.close()     // Catch:{ all -> 0x00af }
            goto L_0x00b1
        L_0x00af:
            r7 = move-exception
            goto L_0x00c0
        L_0x00b1:
            r7 = r0
            goto L_0x00c0
        L_0x00b3:
            r9 = move-exception
            if (r7 == 0) goto L_0x00be
            r7.close()     // Catch:{ all -> 0x00ba }
            goto L_0x00be
        L_0x00ba:
            r7 = move-exception
            kotlin.ExceptionsKt.a(r9, r7)     // Catch:{ Exception -> 0x0081 }
        L_0x00be:
            r7 = r9
            r9 = r0
        L_0x00c0:
            if (r7 != 0) goto L_0x010c
            kotlin.jvm.internal.Intrinsics.f(r9)     // Catch:{ Exception -> 0x0081 }
            okio.FileSystem r7 = r5.e()     // Catch:{ Exception -> 0x0081 }
            okio.Path r9 = r6.getData()     // Catch:{ Exception -> 0x0081 }
            okio.Sink r7 = r7.s(r9, r2)     // Catch:{ Exception -> 0x0081 }
            okio.BufferedSink r7 = okio.Okio.c(r7)     // Catch:{ Exception -> 0x0081 }
            okhttp3.ResponseBody r9 = r8.a()     // Catch:{ all -> 0x00f0 }
            kotlin.jvm.internal.Intrinsics.f(r9)     // Catch:{ all -> 0x00f0 }
            okio.BufferedSource r9 = r9.j()     // Catch:{ all -> 0x00f0 }
            long r1 = r9.r1(r7)     // Catch:{ all -> 0x00f0 }
            java.lang.Long r9 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x00f0 }
            if (r7 == 0) goto L_0x00fe
            r7.close()     // Catch:{ all -> 0x00ee }
            goto L_0x00fe
        L_0x00ee:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f0:
            r9 = move-exception
            if (r7 == 0) goto L_0x00fb
            r7.close()     // Catch:{ all -> 0x00f7 }
            goto L_0x00fb
        L_0x00f7:
            r7 = move-exception
            kotlin.ExceptionsKt.a(r9, r7)     // Catch:{ Exception -> 0x0081 }
        L_0x00fb:
            r4 = r0
            r0 = r9
            r9 = r4
        L_0x00fe:
            if (r0 != 0) goto L_0x010b
            kotlin.jvm.internal.Intrinsics.f(r9)     // Catch:{ Exception -> 0x0081 }
        L_0x0103:
            coil.disk.DiskCache$Snapshot r6 = r6.w()     // Catch:{ Exception -> 0x0081 }
            coil.util.Utils.d(r8)
            return r6
        L_0x010b:
            throw r0     // Catch:{ Exception -> 0x0081 }
        L_0x010c:
            throw r7     // Catch:{ Exception -> 0x0081 }
        L_0x010d:
            coil.util.Utils.a(r6)     // Catch:{ all -> 0x007e }
            throw r7     // Catch:{ all -> 0x007e }
        L_0x0111:
            coil.util.Utils.d(r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.n(coil.disk.DiskCache$Snapshot, okhttp3.Request, okhttp3.Response, coil.network.CacheResponse):coil.disk.DiskCache$Snapshot");
    }
}
