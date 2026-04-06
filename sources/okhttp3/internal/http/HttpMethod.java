package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HttpMethod {

    /* renamed from: a  reason: collision with root package name */
    public static final HttpMethod f42988a = new HttpMethod();

    public static final boolean b(String str) {
        Intrinsics.i(str, "method");
        return !Intrinsics.d(str, "GET") && !Intrinsics.d(str, "HEAD");
    }

    public static final boolean e(String str) {
        Intrinsics.i(str, "method");
        return Intrinsics.d(str, "POST") || Intrinsics.d(str, "PUT") || Intrinsics.d(str, "PATCH") || Intrinsics.d(str, "PROPPATCH") || Intrinsics.d(str, "REPORT");
    }

    public final boolean a(String str) {
        Intrinsics.i(str, "method");
        return Intrinsics.d(str, "POST") || Intrinsics.d(str, "PATCH") || Intrinsics.d(str, "PUT") || Intrinsics.d(str, "DELETE") || Intrinsics.d(str, "MOVE");
    }

    public final boolean c(String str) {
        Intrinsics.i(str, "method");
        return !Intrinsics.d(str, "PROPFIND");
    }

    public final boolean d(String str) {
        Intrinsics.i(str, "method");
        return Intrinsics.d(str, "PROPFIND");
    }
}
