package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.ByteString;

@Metadata
public final class HttpHeaders {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteString f42986a;

    /* renamed from: b  reason: collision with root package name */
    public static final ByteString f42987b;

    static {
        ByteString.Companion companion = ByteString.C;
        f42986a = companion.d("\"\\");
        f42987b = companion.d("\t ,=");
    }

    public static final List a(Headers headers, String str) {
        Intrinsics.i(headers, "<this>");
        Intrinsics.i(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (StringsKt.B(str, headers.h(i2), true)) {
                try {
                    c(new Buffer().K0(headers.o(i2)), arrayList);
                } catch (EOFException e2) {
                    Platform.f43200a.g().k("Unable to parse challenge", 5, e2);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(Response response) {
        Intrinsics.i(response, "<this>");
        if (Intrinsics.d(response.E().h(), "HEAD")) {
            return false;
        }
        int f2 = response.f();
        return (((f2 >= 100 && f2 < 200) || f2 == 204 || f2 == 304) && Util.v(response) == -1 && !StringsKt.B("chunked", Response.l(response, "Transfer-Encoding", (String) null, 2, (Object) null), true)) ? false : true;
    }

    public static final void c(Buffer buffer, List list) {
        String e2;
        int L;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    g(buffer);
                    str = e(buffer);
                    if (str == null) {
                        return;
                    }
                }
                boolean g2 = g(buffer);
                e2 = e(buffer);
                if (e2 != null) {
                    L = Util.L(buffer, (byte) 61);
                    boolean g3 = g(buffer);
                    if (g2 || (!g3 && !buffer.l0())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int L2 = L + Util.L(buffer, (byte) 61);
                        while (true) {
                            if (e2 == null) {
                                e2 = e(buffer);
                                if (g(buffer)) {
                                    continue;
                                    break;
                                }
                                L2 = Util.L(buffer, (byte) 61);
                            }
                            if (L2 == 0) {
                                continue;
                                break;
                            } else if (L2 <= 1 && !g(buffer)) {
                                String d2 = h(buffer, (byte) 34) ? d(buffer) : e(buffer);
                                if (d2 == null || ((String) linkedHashMap.put(e2, d2)) != null) {
                                    return;
                                }
                                if (g(buffer) || buffer.l0()) {
                                    e2 = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new Challenge(str, linkedHashMap));
                        str = e2;
                    }
                } else if (buffer.l0()) {
                    list.add(new Challenge(str, MapsKt.h()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, e2 + StringsKt.G("=", L));
            Intrinsics.h(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str, singletonMap));
        }
    }

    public static final String d(Buffer buffer) {
        if (buffer.readByte() == 34) {
            Buffer buffer2 = new Buffer();
            while (true) {
                long G = buffer.G(f42986a);
                if (G == -1) {
                    return null;
                }
                if (buffer.r(G) == 34) {
                    buffer2.N0(buffer, G);
                    buffer.readByte();
                    return buffer2.e0();
                } else if (buffer.n0() == G + 1) {
                    return null;
                } else {
                    buffer2.N0(buffer, G);
                    buffer.readByte();
                    buffer2.N0(buffer, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static final String e(Buffer buffer) {
        long G = buffer.G(f42987b);
        if (G == -1) {
            G = buffer.n0();
        }
        if (G != 0) {
            return buffer.M(G);
        }
        return null;
    }

    public static final void f(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        Intrinsics.i(cookieJar, "<this>");
        Intrinsics.i(httpUrl, "url");
        Intrinsics.i(headers, "headers");
        if (cookieJar != CookieJar.f42624b) {
            List e2 = Cookie.f42609j.e(httpUrl, headers);
            if (!e2.isEmpty()) {
                cookieJar.a(httpUrl, e2);
            }
        }
    }

    public static final boolean g(Buffer buffer) {
        boolean z2 = false;
        while (!buffer.l0()) {
            byte r2 = buffer.r(0);
            if (r2 == 44) {
                buffer.readByte();
                z2 = true;
            } else if (r2 != 32 && r2 != 9) {
                break;
            } else {
                buffer.readByte();
            }
        }
        return z2;
    }

    public static final boolean h(Buffer buffer, byte b2) {
        return !buffer.l0() && buffer.r(0) == b2;
    }
}
