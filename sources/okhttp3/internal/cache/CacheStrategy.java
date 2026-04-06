package okhttp3.internal.cache;

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
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

@Metadata
public final class CacheStrategy {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f42814c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Request f42815a;

    /* renamed from: b  reason: collision with root package name */
    public final Response f42816b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Response response, Request request) {
            Intrinsics.i(response, "response");
            Intrinsics.i(request, "request");
            int f2 = response.f();
            if (!(f2 == 200 || f2 == 410 || f2 == 414 || f2 == 501 || f2 == 203 || f2 == 204)) {
                if (f2 != 307) {
                    if (!(f2 == 308 || f2 == 404 || f2 == 405)) {
                        switch (f2) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (Response.l(response, "Expires", (String) null, 2, (Object) null) == null && response.b().c() == -1 && !response.b().b() && !response.b().a()) {
                    return false;
                }
            }
            return !response.b().h() && !request.b().h();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Factory {

        /* renamed from: a  reason: collision with root package name */
        public final long f42817a;

        /* renamed from: b  reason: collision with root package name */
        public final Request f42818b;

        /* renamed from: c  reason: collision with root package name */
        public final Response f42819c;

        /* renamed from: d  reason: collision with root package name */
        public Date f42820d;

        /* renamed from: e  reason: collision with root package name */
        public String f42821e;

        /* renamed from: f  reason: collision with root package name */
        public Date f42822f;

        /* renamed from: g  reason: collision with root package name */
        public String f42823g;

        /* renamed from: h  reason: collision with root package name */
        public Date f42824h;

        /* renamed from: i  reason: collision with root package name */
        public long f42825i;

        /* renamed from: j  reason: collision with root package name */
        public long f42826j;

        /* renamed from: k  reason: collision with root package name */
        public String f42827k;

        /* renamed from: l  reason: collision with root package name */
        public int f42828l = -1;

        public Factory(long j2, Request request, Response response) {
            Intrinsics.i(request, "request");
            this.f42817a = j2;
            this.f42818b = request;
            this.f42819c = response;
            if (response != null) {
                this.f42825i = response.F();
                this.f42826j = response.D();
                Headers m2 = response.m();
                int size = m2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String h2 = m2.h(i2);
                    String o2 = m2.o(i2);
                    if (StringsKt.B(h2, "Date", true)) {
                        this.f42820d = DatesKt.a(o2);
                        this.f42821e = o2;
                    } else if (StringsKt.B(h2, "Expires", true)) {
                        this.f42824h = DatesKt.a(o2);
                    } else if (StringsKt.B(h2, "Last-Modified", true)) {
                        this.f42822f = DatesKt.a(o2);
                        this.f42823g = o2;
                    } else if (StringsKt.B(h2, "ETag", true)) {
                        this.f42827k = o2;
                    } else if (StringsKt.B(h2, "Age", true)) {
                        this.f42828l = Util.Y(o2, -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.f42820d;
            long j2 = 0;
            if (date != null) {
                j2 = Math.max(0, this.f42826j - date.getTime());
            }
            int i2 = this.f42828l;
            if (i2 != -1) {
                j2 = Math.max(j2, TimeUnit.SECONDS.toMillis((long) i2));
            }
            long j3 = this.f42826j;
            return j2 + (j3 - this.f42825i) + (this.f42817a - j3);
        }

        public final CacheStrategy b() {
            CacheStrategy c2 = c();
            return (c2.b() == null || !this.f42818b.b().i()) ? c2 : new CacheStrategy((Request) null, (Response) null);
        }

        public final CacheStrategy c() {
            String str;
            if (this.f42819c == null) {
                return new CacheStrategy(this.f42818b, (Response) null);
            }
            if (this.f42818b.g() && this.f42819c.j() == null) {
                return new CacheStrategy(this.f42818b, (Response) null);
            }
            if (!CacheStrategy.f42814c.a(this.f42819c, this.f42818b)) {
                return new CacheStrategy(this.f42818b, (Response) null);
            }
            CacheControl b2 = this.f42818b.b();
            if (b2.g() || e(this.f42818b)) {
                return new CacheStrategy(this.f42818b, (Response) null);
            }
            CacheControl b3 = this.f42819c.b();
            long a2 = a();
            long d2 = d();
            if (b2.c() != -1) {
                d2 = Math.min(d2, TimeUnit.SECONDS.toMillis((long) b2.c()));
            }
            long j2 = 0;
            long millis = b2.e() != -1 ? TimeUnit.SECONDS.toMillis((long) b2.e()) : 0;
            if (!b3.f() && b2.d() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) b2.d());
            }
            if (!b3.g()) {
                long j3 = millis + a2;
                if (j3 < j2 + d2) {
                    Response.Builder y2 = this.f42819c.y();
                    if (j3 >= d2) {
                        y2.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a2 > 86400000 && f()) {
                        y2.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new CacheStrategy((Request) null, y2.c());
                }
            }
            String str2 = this.f42827k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f42822f != null) {
                    str2 = this.f42823g;
                } else if (this.f42820d == null) {
                    return new CacheStrategy(this.f42818b, (Response) null);
                } else {
                    str2 = this.f42821e;
                }
                str = "If-Modified-Since";
            }
            Headers.Builder i2 = this.f42818b.f().i();
            Intrinsics.f(str2);
            i2.d(str, str2);
            return new CacheStrategy(this.f42818b.i().e(i2.f()).b(), this.f42819c);
        }

        public final long d() {
            Response response = this.f42819c;
            Intrinsics.f(response);
            CacheControl b2 = response.b();
            if (b2.c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) b2.c());
            }
            Date date = this.f42824h;
            if (date != null) {
                Date date2 = this.f42820d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f42826j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f42822f == null || this.f42819c.E().k().p() != null) {
                return 0;
            } else {
                Date date3 = this.f42820d;
                long time2 = date3 != null ? date3.getTime() : this.f42825i;
                Date date4 = this.f42822f;
                Intrinsics.f(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
                return 0;
            }
        }

        public final boolean e(Request request) {
            return (request.d("If-Modified-Since") == null && request.d("If-None-Match") == null) ? false : true;
        }

        public final boolean f() {
            Response response = this.f42819c;
            Intrinsics.f(response);
            return response.b().c() == -1 && this.f42824h == null;
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.f42815a = request;
        this.f42816b = response;
    }

    public final Response a() {
        return this.f42816b;
    }

    public final Request b() {
        return this.f42815a;
    }
}
