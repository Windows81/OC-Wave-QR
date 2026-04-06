package okhttp3.internal.http;

import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;

@Metadata
public final class RequestLine {

    /* renamed from: a  reason: collision with root package name */
    public static final RequestLine f42999a = new RequestLine();

    public final String a(Request request, Proxy.Type type) {
        Intrinsics.i(request, "request");
        Intrinsics.i(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.h());
        sb.append(' ');
        RequestLine requestLine = f42999a;
        if (requestLine.b(request, type)) {
            sb.append(request.k());
        } else {
            sb.append(requestLine.c(request.k()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final boolean b(Request request, Proxy.Type type) {
        return !request.g() && type == Proxy.Type.HTTP;
    }

    public final String c(HttpUrl httpUrl) {
        Intrinsics.i(httpUrl, "url");
        String d2 = httpUrl.d();
        String f2 = httpUrl.f();
        if (f2 == null) {
            return d2;
        }
        return d2 + '?' + f2;
    }
}
