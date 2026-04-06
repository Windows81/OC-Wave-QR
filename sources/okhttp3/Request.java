package okhttp3;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

@Metadata
public final class Request {

    /* renamed from: a  reason: collision with root package name */
    public final HttpUrl f42750a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42751b;

    /* renamed from: c  reason: collision with root package name */
    public final Headers f42752c;

    /* renamed from: d  reason: collision with root package name */
    public final RequestBody f42753d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f42754e;

    /* renamed from: f  reason: collision with root package name */
    public CacheControl f42755f;

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map map) {
        Intrinsics.i(httpUrl, "url");
        Intrinsics.i(str, "method");
        Intrinsics.i(headers, "headers");
        Intrinsics.i(map, "tags");
        this.f42750a = httpUrl;
        this.f42751b = str;
        this.f42752c = headers;
        this.f42753d = requestBody;
        this.f42754e = map;
    }

    public final RequestBody a() {
        return this.f42753d;
    }

    public final CacheControl b() {
        CacheControl cacheControl = this.f42755f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl b2 = CacheControl.f42528n.b(this.f42752c);
        this.f42755f = b2;
        return b2;
    }

    public final Map c() {
        return this.f42754e;
    }

    public final String d(String str) {
        Intrinsics.i(str, "name");
        return this.f42752c.e(str);
    }

    public final List e(String str) {
        Intrinsics.i(str, "name");
        return this.f42752c.p(str);
    }

    public final Headers f() {
        return this.f42752c;
    }

    public final boolean g() {
        return this.f42750a.j();
    }

    public final String h() {
        return this.f42751b;
    }

    public final Builder i() {
        return new Builder(this);
    }

    public final Object j(Class cls) {
        Intrinsics.i(cls, "type");
        return cls.cast(this.f42754e.get(cls));
    }

    public final HttpUrl k() {
        return this.f42750a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f42751b);
        sb.append(", url=");
        sb.append(this.f42750a);
        if (this.f42752c.size() != 0) {
            sb.append(", headers=[");
            int i2 = 0;
            for (Object next : this.f42752c) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.w();
                }
                Pair pair = (Pair) next;
                String str = (String) pair.a();
                String str2 = (String) pair.b();
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i2 = i3;
            }
            sb.append(']');
        }
        if (!this.f42754e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f42754e);
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Metadata
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public HttpUrl f42756a;

        /* renamed from: b  reason: collision with root package name */
        public String f42757b;

        /* renamed from: c  reason: collision with root package name */
        public Headers.Builder f42758c;

        /* renamed from: d  reason: collision with root package name */
        public RequestBody f42759d;

        /* renamed from: e  reason: collision with root package name */
        public Map f42760e;

        public Builder() {
            this.f42760e = new LinkedHashMap();
            this.f42757b = "GET";
            this.f42758c = new Headers.Builder();
        }

        public Builder a(String str, String str2) {
            Intrinsics.i(str, "name");
            Intrinsics.i(str2, "value");
            this.f42758c.a(str, str2);
            return this;
        }

        public Request b() {
            HttpUrl httpUrl = this.f42756a;
            if (httpUrl != null) {
                return new Request(httpUrl, this.f42757b, this.f42758c.f(), this.f42759d, Util.W(this.f42760e));
            }
            throw new IllegalStateException("url == null");
        }

        public Builder c(CacheControl cacheControl) {
            Intrinsics.i(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            return cacheControl2.length() == 0 ? g("Cache-Control") : d("Cache-Control", cacheControl2);
        }

        public Builder d(String str, String str2) {
            Intrinsics.i(str, "name");
            Intrinsics.i(str2, "value");
            this.f42758c.j(str, str2);
            return this;
        }

        public Builder e(Headers headers) {
            Intrinsics.i(headers, "headers");
            this.f42758c = headers.i();
            return this;
        }

        public Builder f(String str, RequestBody requestBody) {
            Intrinsics.i(str, "method");
            if (str.length() > 0) {
                if (requestBody == null) {
                    if (HttpMethod.e(str)) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!HttpMethod.b(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.f42757b = str;
                this.f42759d = requestBody;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true");
        }

        public Builder g(String str) {
            Intrinsics.i(str, "name");
            this.f42758c.i(str);
            return this;
        }

        public Builder h(Class cls, Object obj) {
            Intrinsics.i(cls, "type");
            if (obj == null) {
                this.f42760e.remove(cls);
            } else {
                if (this.f42760e.isEmpty()) {
                    this.f42760e = new LinkedHashMap();
                }
                Map map = this.f42760e;
                Object cast = cls.cast(obj);
                Intrinsics.f(cast);
                map.put(cls, cast);
            }
            return this;
        }

        public Builder i(String str) {
            Intrinsics.i(str, "url");
            if (StringsKt.O(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String substring = str.substring(3);
                Intrinsics.h(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            } else if (StringsKt.O(str, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String substring2 = str.substring(4);
                Intrinsics.h(substring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                str = sb2.toString();
            }
            return k(HttpUrl.f42657k.d(str));
        }

        public Builder j(URL url) {
            Intrinsics.i(url, "url");
            HttpUrl.Companion companion = HttpUrl.f42657k;
            String url2 = url.toString();
            Intrinsics.h(url2, "url.toString()");
            return k(companion.d(url2));
        }

        public Builder k(HttpUrl httpUrl) {
            Intrinsics.i(httpUrl, "url");
            this.f42756a = httpUrl;
            return this;
        }

        public Builder(Request request) {
            Map map;
            Intrinsics.i(request, "request");
            this.f42760e = new LinkedHashMap();
            this.f42756a = request.k();
            this.f42757b = request.h();
            this.f42759d = request.a();
            if (request.c().isEmpty()) {
                map = new LinkedHashMap();
            } else {
                map = MapsKt.u(request.c());
            }
            this.f42760e = map;
            this.f42758c = request.f().i();
        }
    }
}
