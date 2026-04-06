package okhttp3;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

@Metadata
public final class Cache implements Closeable, Flushable {
    public static final Companion F = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public int f42500A;

    /* renamed from: B  reason: collision with root package name */
    public int f42501B;
    public int C;
    public int D;
    public int E;

    /* renamed from: z  reason: collision with root package name */
    public final DiskLruCache f42502z;

    @Metadata
    public static final class CacheResponseBody extends ResponseBody {

        /* renamed from: B  reason: collision with root package name */
        public final DiskLruCache.Snapshot f42503B;
        public final String C;
        public final String D;
        public final BufferedSource E;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            Intrinsics.i(snapshot, "snapshot");
            this.f42503B = snapshot;
            this.C = str;
            this.D = str2;
            this.E = Okio.d(new ForwardingSource(snapshot.b(1)) {
                public void close() {
                    this.l().close();
                    super.close();
                }
            });
        }

        public long d() {
            String str = this.D;
            if (str != null) {
                return Util.X(str, -1);
            }
            return -1;
        }

        public MediaType f() {
            String str = this.C;
            if (str != null) {
                return MediaType.f42680e.b(str);
            }
            return null;
        }

        public BufferedSource j() {
            return this.E;
        }

        public final DiskLruCache.Snapshot l() {
            return this.f42503B;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Response response) {
            Intrinsics.i(response, "<this>");
            return d(response.m()).contains("*");
        }

        public final String b(HttpUrl httpUrl) {
            Intrinsics.i(httpUrl, "url");
            return ByteString.C.d(httpUrl.toString()).D().p();
        }

        public final int c(BufferedSource bufferedSource) {
            Intrinsics.i(bufferedSource, "source");
            try {
                long v0 = bufferedSource.v0();
                String a1 = bufferedSource.a1();
                if (v0 >= 0 && v0 <= 2147483647L && a1.length() <= 0) {
                    return (int) v0;
                }
                throw new IOException("expected an int but was \"" + v0 + a1 + '\"');
            } catch (NumberFormatException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final Set d(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i2 = 0; i2 < size; i2++) {
                if (StringsKt.B("Vary", headers.h(i2), true)) {
                    String o2 = headers.o(i2);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt.D(StringCompanionObject.f40914a));
                    }
                    for (String f1 : StringsKt.M0(o2, new char[]{','}, false, 0, 6, (Object) null)) {
                        treeSet.add(StringsKt.f1(f1).toString());
                    }
                }
            }
            return treeSet == null ? SetsKt.d() : treeSet;
        }

        public final Headers e(Headers headers, Headers headers2) {
            Set d2 = d(headers2);
            if (d2.isEmpty()) {
                return Util.f42799b;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                String h2 = headers.h(i2);
                if (d2.contains(h2)) {
                    builder.a(h2, headers.o(i2));
                }
            }
            return builder.f();
        }

        public final Headers f(Response response) {
            Intrinsics.i(response, "<this>");
            Response x2 = response.x();
            Intrinsics.f(x2);
            return e(x2.E().f(), response.m());
        }

        public final boolean g(Response response, Headers headers, Request request) {
            Intrinsics.i(response, "cachedResponse");
            Intrinsics.i(headers, "cachedRequest");
            Intrinsics.i(request, "newRequest");
            Iterable<String> d2 = d(response.m());
            if ((d2 instanceof Collection) && ((Collection) d2).isEmpty()) {
                return true;
            }
            for (String str : d2) {
                if (!Intrinsics.d(headers.p(str), request.e(str))) {
                    return false;
                }
            }
            return true;
        }

        public Companion() {
        }
    }

    @Metadata
    public final class RealCacheRequest implements CacheRequest {

        /* renamed from: a  reason: collision with root package name */
        public final DiskLruCache.Editor f42518a;

        /* renamed from: b  reason: collision with root package name */
        public final Sink f42519b;

        /* renamed from: c  reason: collision with root package name */
        public final Sink f42520c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f42521d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Cache f42522e;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            Intrinsics.i(editor, "editor");
            this.f42522e = cache;
            this.f42518a = editor;
            Sink f2 = editor.f(1);
            this.f42519b = f2;
            this.f42520c = new ForwardingSink(f2) {
                public void close() {
                    Cache cache = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache) {
                        if (!realCacheRequest.d()) {
                            realCacheRequest.e(true);
                            cache.k(cache.d() + 1);
                            super.close();
                            this.f42518a.b();
                        }
                    }
                }
            };
        }

        public void a() {
            Cache cache = this.f42522e;
            synchronized (cache) {
                if (!this.f42521d) {
                    this.f42521d = true;
                    cache.j(cache.c() + 1);
                    Util.m(this.f42519b);
                    try {
                        this.f42518a.a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public Sink b() {
            return this.f42520c;
        }

        public final boolean d() {
            return this.f42521d;
        }

        public final void e(boolean z2) {
            this.f42521d = z2;
        }
    }

    public final void a(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.a();
            } catch (IOException unused) {
            }
        }
    }

    public final Response b(Request request) {
        Intrinsics.i(request, "request");
        try {
            DiskLruCache.Snapshot y2 = this.f42502z.y(F.b(request.k()));
            if (y2 == null) {
                return null;
            }
            try {
                Entry entry = new Entry(y2.b(0));
                Response d2 = entry.d(y2);
                if (entry.b(request, d2)) {
                    return d2;
                }
                ResponseBody a2 = d2.a();
                if (a2 != null) {
                    Util.m(a2);
                }
                return null;
            } catch (IOException unused) {
                Util.m(y2);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public final int c() {
        return this.f42501B;
    }

    public void close() {
        this.f42502z.close();
    }

    public final int d() {
        return this.f42500A;
    }

    public final CacheRequest f(Response response) {
        DiskLruCache.Editor editor;
        Intrinsics.i(response, "response");
        String h2 = response.E().h();
        if (HttpMethod.f42988a.a(response.E().h())) {
            try {
                g(response.E());
            } catch (IOException unused) {
            }
            return null;
        } else if (!Intrinsics.d(h2, "GET")) {
            return null;
        } else {
            Companion companion = F;
            if (companion.a(response)) {
                return null;
            }
            Entry entry = new Entry(response);
            try {
                editor = DiskLruCache.x(this.f42502z, companion.b(response.E().k()), 0, 2, (Object) null);
                if (editor == null) {
                    return null;
                }
                try {
                    entry.f(editor);
                    return new RealCacheRequest(this, editor);
                } catch (IOException unused2) {
                    a(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
                a(editor);
                return null;
            }
        }
    }

    public void flush() {
        this.f42502z.flush();
    }

    public final void g(Request request) {
        Intrinsics.i(request, "request");
        this.f42502z.S(F.b(request.k()));
    }

    public final void j(int i2) {
        this.f42501B = i2;
    }

    public final void k(int i2) {
        this.f42500A = i2;
    }

    public final synchronized void l() {
        this.D++;
    }

    public final synchronized void m(CacheStrategy cacheStrategy) {
        try {
            Intrinsics.i(cacheStrategy, "cacheStrategy");
            this.E++;
            if (cacheStrategy.b() != null) {
                this.C++;
            } else if (cacheStrategy.a() != null) {
                this.D++;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void r(Response response, Response response2) {
        DiskLruCache.Editor editor;
        Intrinsics.i(response, "cached");
        Intrinsics.i(response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody a2 = response.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editor = ((CacheResponseBody) a2).l().a();
            if (editor != null) {
                try {
                    entry.f(editor);
                    editor.b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            editor = null;
            a(editor);
        }
    }

    @Metadata
    public static final class Entry {

        /* renamed from: k  reason: collision with root package name */
        public static final Companion f42505k = new Companion((DefaultConstructorMarker) null);

        /* renamed from: l  reason: collision with root package name */
        public static final String f42506l;

        /* renamed from: m  reason: collision with root package name */
        public static final String f42507m;

        /* renamed from: a  reason: collision with root package name */
        public final HttpUrl f42508a;

        /* renamed from: b  reason: collision with root package name */
        public final Headers f42509b;

        /* renamed from: c  reason: collision with root package name */
        public final String f42510c;

        /* renamed from: d  reason: collision with root package name */
        public final Protocol f42511d;

        /* renamed from: e  reason: collision with root package name */
        public final int f42512e;

        /* renamed from: f  reason: collision with root package name */
        public final String f42513f;

        /* renamed from: g  reason: collision with root package name */
        public final Headers f42514g;

        /* renamed from: h  reason: collision with root package name */
        public final Handshake f42515h;

        /* renamed from: i  reason: collision with root package name */
        public final long f42516i;

        /* renamed from: j  reason: collision with root package name */
        public final long f42517j;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.f43200a;
            sb.append(companion.g().g());
            sb.append("-Sent-Millis");
            f42506l = sb.toString();
            f42507m = companion.g().g() + "-Received-Millis";
        }

        public Entry(Source source) {
            TlsVersion tlsVersion;
            Intrinsics.i(source, "rawSource");
            try {
                BufferedSource d2 = Okio.d(source);
                String a1 = d2.a1();
                HttpUrl f2 = HttpUrl.f42657k.f(a1);
                if (f2 != null) {
                    this.f42508a = f2;
                    this.f42510c = d2.a1();
                    Headers.Builder builder = new Headers.Builder();
                    int c2 = Cache.F.c(d2);
                    for (int i2 = 0; i2 < c2; i2++) {
                        builder.c(d2.a1());
                    }
                    this.f42509b = builder.f();
                    StatusLine a2 = StatusLine.f43002d.a(d2.a1());
                    this.f42511d = a2.f43003a;
                    this.f42512e = a2.f43004b;
                    this.f42513f = a2.f43005c;
                    Headers.Builder builder2 = new Headers.Builder();
                    int c3 = Cache.F.c(d2);
                    for (int i3 = 0; i3 < c3; i3++) {
                        builder2.c(d2.a1());
                    }
                    String str = f42506l;
                    String g2 = builder2.g(str);
                    String str2 = f42507m;
                    String g3 = builder2.g(str2);
                    builder2.i(str);
                    builder2.i(str2);
                    long j2 = 0;
                    this.f42516i = g2 != null ? Long.parseLong(g2) : 0;
                    this.f42517j = g3 != null ? Long.parseLong(g3) : j2;
                    this.f42514g = builder2.f();
                    if (a()) {
                        String a12 = d2.a1();
                        if (a12.length() <= 0) {
                            CipherSuite b2 = CipherSuite.f42567b.b(d2.a1());
                            List c4 = c(d2);
                            List c5 = c(d2);
                            if (!d2.l0()) {
                                tlsVersion = TlsVersion.f42795A.a(d2.a1());
                            } else {
                                tlsVersion = TlsVersion.SSL_3_0;
                            }
                            this.f42515h = Handshake.f42646e.b(tlsVersion, b2, c4, c5);
                        } else {
                            throw new IOException("expected \"\" but was \"" + a12 + '\"');
                        }
                    } else {
                        this.f42515h = null;
                    }
                    Unit unit = Unit.f40552a;
                    CloseableKt.a(source, (Throwable) null);
                    return;
                }
                IOException iOException = new IOException("Cache corruption for " + a1);
                Platform.f43200a.g().k("cache corruption", 5, iOException);
                throw iOException;
            } catch (Throwable th) {
                CloseableKt.a(source, th);
                throw th;
            }
        }

        public final boolean a() {
            return Intrinsics.d(this.f42508a.s(), "https");
        }

        public final boolean b(Request request, Response response) {
            Intrinsics.i(request, "request");
            Intrinsics.i(response, "response");
            return Intrinsics.d(this.f42508a, request.k()) && Intrinsics.d(this.f42510c, request.h()) && Cache.F.g(response, this.f42509b, request);
        }

        public final List c(BufferedSource bufferedSource) {
            int c2 = Cache.F.c(bufferedSource);
            if (c2 == -1) {
                return CollectionsKt.m();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c2);
                int i2 = 0;
                while (i2 < c2) {
                    String a1 = bufferedSource.a1();
                    Buffer buffer = new Buffer();
                    ByteString a2 = ByteString.C.a(a1);
                    if (a2 != null) {
                        buffer.k1(a2);
                        arrayList.add(instance.generateCertificate(buffer.B1()));
                        i2++;
                    } else {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final Response d(DiskLruCache.Snapshot snapshot) {
            Intrinsics.i(snapshot, "snapshot");
            String e2 = this.f42514g.e("Content-Type");
            String e3 = this.f42514g.e("Content-Length");
            return new Response.Builder().r(new Request.Builder().k(this.f42508a).f(this.f42510c, (RequestBody) null).e(this.f42509b).b()).p(this.f42511d).g(this.f42512e).m(this.f42513f).k(this.f42514g).b(new CacheResponseBody(snapshot, e2, e3)).i(this.f42515h).s(this.f42516i).q(this.f42517j).c();
        }

        public final void e(BufferedSink bufferedSink, List list) {
            try {
                bufferedSink.x1((long) list.size()).writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                    ByteString.Companion companion = ByteString.C;
                    Intrinsics.h(encoded, "bytes");
                    bufferedSink.K0(ByteString.Companion.f(companion, encoded, 0, 0, 3, (Object) null).d()).writeByte(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final void f(DiskLruCache.Editor editor) {
            Intrinsics.i(editor, "editor");
            BufferedSink c2 = Okio.c(editor.f(0));
            try {
                c2.K0(this.f42508a.toString()).writeByte(10);
                c2.K0(this.f42510c).writeByte(10);
                c2.x1((long) this.f42509b.size()).writeByte(10);
                int size = this.f42509b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    c2.K0(this.f42509b.h(i2)).K0(": ").K0(this.f42509b.o(i2)).writeByte(10);
                }
                c2.K0(new StatusLine(this.f42511d, this.f42512e, this.f42513f).toString()).writeByte(10);
                c2.x1((long) (this.f42514g.size() + 2)).writeByte(10);
                int size2 = this.f42514g.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c2.K0(this.f42514g.h(i3)).K0(": ").K0(this.f42514g.o(i3)).writeByte(10);
                }
                c2.K0(f42506l).K0(": ").x1(this.f42516i).writeByte(10);
                c2.K0(f42507m).K0(": ").x1(this.f42517j).writeByte(10);
                if (a()) {
                    c2.writeByte(10);
                    Handshake handshake = this.f42515h;
                    Intrinsics.f(handshake);
                    c2.K0(handshake.a().c()).writeByte(10);
                    e(c2, this.f42515h.d());
                    e(c2, this.f42515h.c());
                    c2.K0(this.f42515h.e().f()).writeByte(10);
                }
                Unit unit = Unit.f40552a;
                CloseableKt.a(c2, (Throwable) null);
            } catch (Throwable th) {
                CloseableKt.a(c2, th);
                throw th;
            }
        }

        public Entry(Response response) {
            Intrinsics.i(response, "response");
            this.f42508a = response.E().k();
            this.f42509b = Cache.F.f(response);
            this.f42510c = response.E().h();
            this.f42511d = response.C();
            this.f42512e = response.f();
            this.f42513f = response.t();
            this.f42514g = response.m();
            this.f42515h = response.j();
            this.f42516i = response.F();
            this.f42517j = response.D();
        }
    }
}
