package coil.network;

import coil.util.Time;
import coil.util.Utils;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

@Metadata
public final class CacheStrategy {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f23518c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Request f23519a;

    /* renamed from: b  reason: collision with root package name */
    public final CacheResponse f23520b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Headers a(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                String h2 = headers.h(i2);
                String o2 = headers.o(i2);
                if ((!StringsKt.B("Warning", h2, true) || !StringsKt.Q(o2, "1", false, 2, (Object) null)) && (d(h2) || !e(h2) || headers2.e(h2) == null)) {
                    builder.e(h2, o2);
                }
            }
            int size2 = headers2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String h3 = headers2.h(i3);
                if (!d(h3) && e(h3)) {
                    builder.e(h3, headers2.o(i3));
                }
            }
            return builder.f();
        }

        public final boolean b(Request request, CacheResponse cacheResponse) {
            return !request.b().h() && !cacheResponse.a().h() && !Intrinsics.d(cacheResponse.d().e("Vary"), "*");
        }

        public final boolean c(Request request, Response response) {
            return !request.b().h() && !response.b().h() && !Intrinsics.d(response.m().e("Vary"), "*");
        }

        public final boolean d(String str) {
            return StringsKt.B("Content-Length", str, true) || StringsKt.B("Content-Encoding", str, true) || StringsKt.B("Content-Type", str, true);
        }

        public final boolean e(String str) {
            return !StringsKt.B("Connection", str, true) && !StringsKt.B("Keep-Alive", str, true) && !StringsKt.B("Proxy-Authenticate", str, true) && !StringsKt.B("Proxy-Authorization", str, true) && !StringsKt.B("TE", str, true) && !StringsKt.B("Trailers", str, true) && !StringsKt.B("Transfer-Encoding", str, true) && !StringsKt.B("Upgrade", str, true);
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Factory {

        /* renamed from: a  reason: collision with root package name */
        public final Request f23521a;

        /* renamed from: b  reason: collision with root package name */
        public final CacheResponse f23522b;

        /* renamed from: c  reason: collision with root package name */
        public Date f23523c;

        /* renamed from: d  reason: collision with root package name */
        public String f23524d;

        /* renamed from: e  reason: collision with root package name */
        public Date f23525e;

        /* renamed from: f  reason: collision with root package name */
        public String f23526f;

        /* renamed from: g  reason: collision with root package name */
        public Date f23527g;

        /* renamed from: h  reason: collision with root package name */
        public long f23528h;

        /* renamed from: i  reason: collision with root package name */
        public long f23529i;

        /* renamed from: j  reason: collision with root package name */
        public String f23530j;

        /* renamed from: k  reason: collision with root package name */
        public int f23531k = -1;

        public Factory(Request request, CacheResponse cacheResponse) {
            this.f23521a = request;
            this.f23522b = cacheResponse;
            if (cacheResponse != null) {
                this.f23528h = cacheResponse.e();
                this.f23529i = cacheResponse.c();
                Headers d2 = cacheResponse.d();
                int size = d2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String h2 = d2.h(i2);
                    if (StringsKt.B(h2, "Date", true)) {
                        this.f23523c = d2.g("Date");
                        this.f23524d = d2.o(i2);
                    } else if (StringsKt.B(h2, "Expires", true)) {
                        this.f23527g = d2.g("Expires");
                    } else if (StringsKt.B(h2, "Last-Modified", true)) {
                        this.f23525e = d2.g("Last-Modified");
                        this.f23526f = d2.o(i2);
                    } else if (StringsKt.B(h2, "ETag", true)) {
                        this.f23530j = d2.o(i2);
                    } else if (StringsKt.B(h2, "Age", true)) {
                        this.f23531k = Utils.A(d2.o(i2), -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.f23523c;
            long j2 = 0;
            if (date != null) {
                j2 = Math.max(0, this.f23529i - date.getTime());
            }
            int i2 = this.f23531k;
            if (i2 != -1) {
                j2 = Math.max(j2, TimeUnit.SECONDS.toMillis((long) i2));
            }
            return j2 + (this.f23529i - this.f23528h) + (Time.f23766a.a() - this.f23529i);
        }

        public final CacheStrategy b() {
            String str;
            if (this.f23522b == null) {
                return new CacheStrategy(this.f23521a, (CacheResponse) null, (DefaultConstructorMarker) null);
            }
            if (this.f23521a.g() && !this.f23522b.f()) {
                return new CacheStrategy(this.f23521a, (CacheResponse) null, (DefaultConstructorMarker) null);
            }
            CacheControl a2 = this.f23522b.a();
            if (!CacheStrategy.f23518c.b(this.f23521a, this.f23522b)) {
                return new CacheStrategy(this.f23521a, (CacheResponse) null, (DefaultConstructorMarker) null);
            }
            CacheControl b2 = this.f23521a.b();
            if (b2.g() || d(this.f23521a)) {
                return new CacheStrategy(this.f23521a, (CacheResponse) null, (DefaultConstructorMarker) null);
            }
            long a3 = a();
            long c2 = c();
            if (b2.c() != -1) {
                c2 = Math.min(c2, TimeUnit.SECONDS.toMillis((long) b2.c()));
            }
            long j2 = 0;
            long millis = b2.e() != -1 ? TimeUnit.SECONDS.toMillis((long) b2.e()) : 0;
            if (!a2.f() && b2.d() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) b2.d());
            }
            if (!a2.g() && a3 + millis < c2 + j2) {
                return new CacheStrategy((Request) null, this.f23522b, (DefaultConstructorMarker) null);
            }
            String str2 = this.f23530j;
            if (str2 != null) {
                Intrinsics.f(str2);
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.f23525e != null) {
                    str2 = this.f23526f;
                    Intrinsics.f(str2);
                } else if (this.f23523c == null) {
                    return new CacheStrategy(this.f23521a, (CacheResponse) null, (DefaultConstructorMarker) null);
                } else {
                    str2 = this.f23524d;
                    Intrinsics.f(str2);
                }
            }
            return new CacheStrategy(this.f23521a.i().a(str, str2).b(), this.f23522b, (DefaultConstructorMarker) null);
        }

        public final long c() {
            CacheResponse cacheResponse = this.f23522b;
            Intrinsics.f(cacheResponse);
            CacheControl a2 = cacheResponse.a();
            if (a2.c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) a2.c());
            }
            Date date = this.f23527g;
            if (date != null) {
                Date date2 = this.f23523c;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f23529i);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f23525e == null || this.f23521a.k().p() != null) {
                return 0;
            } else {
                Date date3 = this.f23523c;
                long time2 = date3 != null ? date3.getTime() : this.f23528h;
                Date date4 = this.f23525e;
                Intrinsics.f(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
                return 0;
            }
        }

        public final boolean d(Request request) {
            return (request.d("If-Modified-Since") == null && request.d("If-None-Match") == null) ? false : true;
        }
    }

    public /* synthetic */ CacheStrategy(Request request, CacheResponse cacheResponse, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, cacheResponse);
    }

    public final CacheResponse a() {
        return this.f23520b;
    }

    public final Request b() {
        return this.f23519a;
    }

    public CacheStrategy(Request request, CacheResponse cacheResponse) {
        this.f23519a = request;
        this.f23520b = cacheResponse;
    }
}
