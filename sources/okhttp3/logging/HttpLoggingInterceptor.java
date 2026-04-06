package okhttp3.logging;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;

@Metadata
public final class HttpLoggingInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final Logger f43307a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Set f43308b = SetsKt.d();

    /* renamed from: c  reason: collision with root package name */
    public volatile Level f43309c = Level.NONE;

    @Metadata
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @Metadata
    public interface Logger {

        @Metadata
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ Companion f43313a = new Companion();

            @Metadata
            public static final class DefaultLogger implements Logger {
                public void a(String str) {
                    Intrinsics.i(str, "message");
                    Platform.l(Platform.f43200a.g(), str, 0, (Throwable) null, 6, (Object) null);
                }
            }
        }

        void a(String str);
    }

    public HttpLoggingInterceptor(Logger logger) {
        Intrinsics.i(logger, "logger");
        this.f43307a = logger;
    }

    public final boolean a(Headers headers) {
        String e2 = headers.e("Content-Encoding");
        return e2 != null && !StringsKt.B(e2, "identity", true) && !StringsKt.B(e2, "gzip", true);
    }

    public final void b(Level level) {
        Intrinsics.i(level, "<set-?>");
        this.f43309c = level;
    }

    public final void c(Headers headers, int i2) {
        String o2 = this.f43308b.contains(headers.h(i2)) ? "██" : headers.o(i2);
        Logger logger = this.f43307a;
        logger.a(headers.h(i2) + ": " + o2);
    }

    public Response intercept(Interceptor.Chain chain) {
        String str;
        String str2;
        String str3;
        String str4;
        char c2;
        String str5;
        Charset charset;
        Throwable th;
        Charset charset2;
        Interceptor.Chain chain2 = chain;
        Intrinsics.i(chain2, "chain");
        Level level = this.f43309c;
        Request m2 = chain.m();
        if (level == Level.NONE) {
            return chain2.b(m2);
        }
        boolean z2 = level == Level.BODY;
        boolean z3 = z2 || level == Level.HEADERS;
        RequestBody a2 = m2.a();
        Connection c3 = chain.c();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(m2.h());
        sb.append(' ');
        sb.append(m2.k());
        if (c3 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            sb2.append(c3.a());
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        String sb3 = sb.toString();
        if (!z3 && a2 != null) {
            sb3 = sb3 + " (" + a2.a() + "-byte body)";
        }
        this.f43307a.a(sb3);
        if (z3) {
            Headers f2 = m2.f();
            if (a2 != null) {
                MediaType b2 = a2.b();
                if (b2 != null && f2.e("Content-Type") == null) {
                    this.f43307a.a("Content-Type: " + b2);
                }
                if (a2.a() != -1 && f2.e("Content-Length") == null) {
                    this.f43307a.a("Content-Length: " + a2.a());
                }
            }
            int size = f2.size();
            for (int i2 = 0; i2 < size; i2++) {
                c(f2, i2);
            }
            if (!z2 || a2 == null) {
                this.f43307a.a("--> END " + m2.h());
            } else if (a(m2.f())) {
                this.f43307a.a("--> END " + m2.h() + " (encoded body omitted)");
            } else if (a2.f()) {
                this.f43307a.a("--> END " + m2.h() + " (duplex request body omitted)");
            } else if (a2.g()) {
                this.f43307a.a("--> END " + m2.h() + " (one-shot body omitted)");
            } else {
                Buffer buffer = new Buffer();
                a2.h(buffer);
                MediaType b3 = a2.b();
                if (b3 == null || (charset2 = b3.c(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    Intrinsics.h(charset2, "UTF_8");
                }
                this.f43307a.a("");
                if (Utf8Kt.a(buffer)) {
                    this.f43307a.a(buffer.M0(charset2));
                    this.f43307a.a("--> END " + m2.h() + " (" + a2.a() + "-byte body)");
                } else {
                    this.f43307a.a("--> END " + m2.h() + " (binary " + a2.a() + "-byte body omitted)");
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response b4 = chain2.b(m2);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody a3 = b4.a();
            Intrinsics.f(a3);
            long d2 = a3.d();
            if (d2 != -1) {
                str2 = d2 + "-byte";
            } else {
                str2 = "unknown-length";
            }
            Logger logger = this.f43307a;
            String str6 = "-byte body)";
            StringBuilder sb4 = new StringBuilder();
            long j2 = d2;
            sb4.append("<-- ");
            sb4.append(b4.f());
            if (b4.t().length() == 0) {
                str3 = "-byte body omitted)";
                str4 = "";
                c2 = ' ';
            } else {
                String t2 = b4.t();
                StringBuilder sb5 = new StringBuilder();
                str3 = "-byte body omitted)";
                c2 = ' ';
                sb5.append(' ');
                sb5.append(t2);
                str4 = sb5.toString();
            }
            sb4.append(str4);
            sb4.append(c2);
            sb4.append(b4.E().k());
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            if (!z3) {
                str5 = ", " + str2 + " body";
            } else {
                str5 = "";
            }
            sb4.append(str5);
            sb4.append(')');
            logger.a(sb4.toString());
            if (z3) {
                Headers m3 = b4.m();
                int size2 = m3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c(m3, i3);
                }
                if (!z2 || !HttpHeaders.b(b4)) {
                    this.f43307a.a("<-- END HTTP");
                } else if (a(b4.m())) {
                    this.f43307a.a("<-- END HTTP (encoded body omitted)");
                } else {
                    BufferedSource j3 = a3.j();
                    j3.V0(Long.MAX_VALUE);
                    Buffer s2 = j3.s();
                    Long l2 = null;
                    if (StringsKt.B("gzip", m3.e("Content-Encoding"), true)) {
                        Long valueOf = Long.valueOf(s2.n0());
                        GzipSource gzipSource = new GzipSource(s2.clone());
                        try {
                            s2 = new Buffer();
                            s2.P0(gzipSource);
                            CloseableKt.a(gzipSource, (Throwable) null);
                            l2 = valueOf;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            CloseableKt.a(gzipSource, th);
                            throw th3;
                        }
                    }
                    MediaType f3 = a3.f();
                    if (f3 == null || (charset = f3.c(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        Intrinsics.h(charset, "UTF_8");
                    }
                    if (!Utf8Kt.a(s2)) {
                        this.f43307a.a("");
                        this.f43307a.a("<-- END HTTP (binary " + s2.n0() + str3);
                        return b4;
                    }
                    if (j2 != 0) {
                        this.f43307a.a("");
                        this.f43307a.a(s2.clone().M0(charset));
                    }
                    if (l2 != null) {
                        this.f43307a.a("<-- END HTTP (" + s2.n0() + "-byte, " + l2 + "-gzipped-byte body)");
                    } else {
                        this.f43307a.a("<-- END HTTP (" + s2.n0() + str6);
                    }
                }
            }
            return b4;
        } catch (Exception e2) {
            Exception exc = e2;
            this.f43307a.a("<-- HTTP FAILED: " + exc);
            throw exc;
        }
    }
}
