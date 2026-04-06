package okhttp3;

import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;

@Metadata
public final class Response implements Closeable {

    /* renamed from: A  reason: collision with root package name */
    public final Protocol f42770A;

    /* renamed from: B  reason: collision with root package name */
    public final String f42771B;
    public final int C;
    public final Handshake D;
    public final Headers E;
    public final ResponseBody F;
    public final Response G;
    public final Response H;
    public final Response I;
    public final long J;
    public final long K;
    public final Exchange L;
    public CacheControl M;

    /* renamed from: z  reason: collision with root package name */
    public final Request f42772z;

    public Response(Request request, Protocol protocol, String str, int i2, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j2, long j3, Exchange exchange) {
        Intrinsics.i(request, "request");
        Intrinsics.i(protocol, "protocol");
        Intrinsics.i(str, "message");
        Intrinsics.i(headers, "headers");
        this.f42772z = request;
        this.f42770A = protocol;
        this.f42771B = str;
        this.C = i2;
        this.D = handshake;
        this.E = headers;
        this.F = responseBody;
        this.G = response;
        this.H = response2;
        this.I = response3;
        this.J = j2;
        this.K = j3;
        this.L = exchange;
    }

    public static /* synthetic */ String l(Response response, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return response.k(str, str2);
    }

    public final Response A() {
        return this.I;
    }

    public final Protocol C() {
        return this.f42770A;
    }

    public final long D() {
        return this.K;
    }

    public final Request E() {
        return this.f42772z;
    }

    public final long F() {
        return this.J;
    }

    public final ResponseBody a() {
        return this.F;
    }

    public final CacheControl b() {
        CacheControl cacheControl = this.M;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl b2 = CacheControl.f42528n.b(this.E);
        this.M = b2;
        return b2;
    }

    public final Response c() {
        return this.H;
    }

    public void close() {
        ResponseBody responseBody = this.F;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final List d() {
        String str;
        Headers headers = this.E;
        int i2 = this.C;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else if (i2 != 407) {
            return CollectionsKt.m();
        } else {
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.a(headers, str);
    }

    public final int f() {
        return this.C;
    }

    public final Exchange g() {
        return this.L;
    }

    public final Handshake j() {
        return this.D;
    }

    public final String k(String str, String str2) {
        Intrinsics.i(str, "name");
        String e2 = this.E.e(str);
        return e2 == null ? str2 : e2;
    }

    public final Headers m() {
        return this.E;
    }

    public final boolean r() {
        int i2 = this.C;
        return 200 <= i2 && i2 < 300;
    }

    public final String t() {
        return this.f42771B;
    }

    public String toString() {
        return "Response{protocol=" + this.f42770A + ", code=" + this.C + ", message=" + this.f42771B + ", url=" + this.f42772z.k() + '}';
    }

    public final Response x() {
        return this.G;
    }

    public final Builder y() {
        return new Builder(this);
    }

    @Metadata
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Request f42773a;

        /* renamed from: b  reason: collision with root package name */
        public Protocol f42774b;

        /* renamed from: c  reason: collision with root package name */
        public int f42775c;

        /* renamed from: d  reason: collision with root package name */
        public String f42776d;

        /* renamed from: e  reason: collision with root package name */
        public Handshake f42777e;

        /* renamed from: f  reason: collision with root package name */
        public Headers.Builder f42778f;

        /* renamed from: g  reason: collision with root package name */
        public ResponseBody f42779g;

        /* renamed from: h  reason: collision with root package name */
        public Response f42780h;

        /* renamed from: i  reason: collision with root package name */
        public Response f42781i;

        /* renamed from: j  reason: collision with root package name */
        public Response f42782j;

        /* renamed from: k  reason: collision with root package name */
        public long f42783k;

        /* renamed from: l  reason: collision with root package name */
        public long f42784l;

        /* renamed from: m  reason: collision with root package name */
        public Exchange f42785m;

        public Builder() {
            this.f42775c = -1;
            this.f42778f = new Headers.Builder();
        }

        public Builder a(String str, String str2) {
            Intrinsics.i(str, "name");
            Intrinsics.i(str2, "value");
            this.f42778f.a(str, str2);
            return this;
        }

        public Builder b(ResponseBody responseBody) {
            this.f42779g = responseBody;
            return this;
        }

        public Response c() {
            int i2 = this.f42775c;
            if (i2 >= 0) {
                Request request = this.f42773a;
                if (request != null) {
                    Protocol protocol = this.f42774b;
                    if (protocol != null) {
                        String str = this.f42776d;
                        if (str != null) {
                            return new Response(request, protocol, str, i2, this.f42777e, this.f42778f.f(), this.f42779g, this.f42780h, this.f42781i, this.f42782j, this.f42783k, this.f42784l, this.f42785m);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("protocol == null");
                }
                throw new IllegalStateException("request == null");
            }
            throw new IllegalStateException(("code < 0: " + this.f42775c).toString());
        }

        public Builder d(Response response) {
            f("cacheResponse", response);
            this.f42781i = response;
            return this;
        }

        public final void e(Response response) {
            if (response != null && response.a() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public final void f(String str, Response response) {
            if (response == null) {
                return;
            }
            if (response.a() != null) {
                throw new IllegalArgumentException((str + ".body != null").toString());
            } else if (response.x() != null) {
                throw new IllegalArgumentException((str + ".networkResponse != null").toString());
            } else if (response.c() != null) {
                throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
            } else if (response.A() != null) {
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public Builder g(int i2) {
            this.f42775c = i2;
            return this;
        }

        public final int h() {
            return this.f42775c;
        }

        public Builder i(Handshake handshake) {
            this.f42777e = handshake;
            return this;
        }

        public Builder j(String str, String str2) {
            Intrinsics.i(str, "name");
            Intrinsics.i(str2, "value");
            this.f42778f.j(str, str2);
            return this;
        }

        public Builder k(Headers headers) {
            Intrinsics.i(headers, "headers");
            this.f42778f = headers.i();
            return this;
        }

        public final void l(Exchange exchange) {
            Intrinsics.i(exchange, "deferredTrailers");
            this.f42785m = exchange;
        }

        public Builder m(String str) {
            Intrinsics.i(str, "message");
            this.f42776d = str;
            return this;
        }

        public Builder n(Response response) {
            f("networkResponse", response);
            this.f42780h = response;
            return this;
        }

        public Builder o(Response response) {
            e(response);
            this.f42782j = response;
            return this;
        }

        public Builder p(Protocol protocol) {
            Intrinsics.i(protocol, "protocol");
            this.f42774b = protocol;
            return this;
        }

        public Builder q(long j2) {
            this.f42784l = j2;
            return this;
        }

        public Builder r(Request request) {
            Intrinsics.i(request, "request");
            this.f42773a = request;
            return this;
        }

        public Builder s(long j2) {
            this.f42783k = j2;
            return this;
        }

        public Builder(Response response) {
            Intrinsics.i(response, "response");
            this.f42775c = -1;
            this.f42773a = response.E();
            this.f42774b = response.C();
            this.f42775c = response.f();
            this.f42776d = response.t();
            this.f42777e = response.j();
            this.f42778f = response.m().i();
            this.f42779g = response.a();
            this.f42780h = response.x();
            this.f42781i = response.c();
            this.f42782j = response.A();
            this.f42783k = response.F();
            this.f42784l = response.D();
            this.f42785m = response.g();
        }
    }
}
