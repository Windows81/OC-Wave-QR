package okhttp3.internal;

import A.C0395a;
import A.C0396b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;

@Metadata
public final class Util {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f42798a;

    /* renamed from: b  reason: collision with root package name */
    public static final Headers f42799b = Headers.f42654A.g(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final ResponseBody f42800c;

    /* renamed from: d  reason: collision with root package name */
    public static final RequestBody f42801d;

    /* renamed from: e  reason: collision with root package name */
    public static final Options f42802e;

    /* renamed from: f  reason: collision with root package name */
    public static final TimeZone f42803f;

    /* renamed from: g  reason: collision with root package name */
    public static final Regex f42804g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f42805h = false;

    /* renamed from: i  reason: collision with root package name */
    public static final String f42806i;

    static {
        byte[] bArr = new byte[0];
        f42798a = bArr;
        f42800c = ResponseBody.Companion.d(ResponseBody.f42786A, bArr, (MediaType) null, 1, (Object) null);
        f42801d = RequestBody.Companion.i(RequestBody.f42761a, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        Options.Companion companion = Options.C;
        ByteString.Companion companion2 = ByteString.C;
        f42802e = companion.d(companion2.b("efbbbf"), companion2.b("feff"), companion2.b("fffe"), companion2.b("0000ffff"), companion2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.f(timeZone);
        f42803f = timeZone;
        String name = OkHttpClient.class.getName();
        Intrinsics.h(name, "OkHttpClient::class.java.name");
        f42806i = StringsKt.E0(StringsKt.D0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return z(str, i2, i3);
    }

    public static final int B(String str, int i2, int i3) {
        Intrinsics.i(str, "<this>");
        int i4 = i3 - 1;
        if (i2 <= i4) {
            while (true) {
                char charAt = str.charAt(i4);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i4 == i2) {
                        break;
                    }
                    i4--;
                } else {
                    return i4 + 1;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int C(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return B(str, i2, i3);
    }

    public static final int D(String str, int i2) {
        Intrinsics.i(str, "<this>");
        int length = str.length();
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != 9) {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.i(strArr, "<this>");
        Intrinsics.i(strArr2, "other");
        Intrinsics.i(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        kotlin.io.CloseableKt.a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        kotlin.io.CloseableKt.a(r0, (java.lang.Throwable) null);
        r3.f(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean F(okhttp3.internal.io.FileSystem r3, java.io.File r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r3, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.i(r4, r0)
            okio.Sink r0 = r3.b(r4)
            r1 = 0
            r3.f(r4)     // Catch:{ IOException -> 0x0019 }
            kotlin.io.CloseableKt.a(r0, r1)
            r3 = 1
            return r3
        L_0x0017:
            r3 = move-exception
            goto L_0x0023
        L_0x0019:
            kotlin.Unit r2 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0017 }
            kotlin.io.CloseableKt.a(r0, r1)
            r3.f(r4)
            r3 = 0
            return r3
        L_0x0023:
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            kotlin.io.CloseableKt.a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.F(okhttp3.internal.io.FileSystem, java.io.File):boolean");
    }

    public static final boolean G(Socket socket, BufferedSource bufferedSource) {
        int soTimeout;
        Intrinsics.i(socket, "<this>");
        Intrinsics.i(bufferedSource, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z2 = !bufferedSource.l0();
            socket.setSoTimeout(soTimeout);
            return z2;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    public static final boolean H(String str) {
        Intrinsics.i(str, "name");
        return StringsKt.B(str, "Authorization", true) || StringsKt.B(str, "Cookie", true) || StringsKt.B(str, "Proxy-Authorization", true) || StringsKt.B(str, "Set-Cookie", true);
    }

    public static final int I(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset J(BufferedSource bufferedSource, Charset charset) {
        Intrinsics.i(bufferedSource, "<this>");
        Intrinsics.i(charset, "default");
        int D1 = bufferedSource.D1(f42802e);
        if (D1 == -1) {
            return charset;
        }
        if (D1 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            Intrinsics.h(charset2, "UTF_8");
            return charset2;
        } else if (D1 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            Intrinsics.h(charset3, "UTF_16BE");
            return charset3;
        } else if (D1 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            Intrinsics.h(charset4, "UTF_16LE");
            return charset4;
        } else if (D1 == 3) {
            return Charsets.f41117a.a();
        } else {
            if (D1 == 4) {
                return Charsets.f41117a.b();
            }
            throw new AssertionError();
        }
    }

    public static final int K(BufferedSource bufferedSource) {
        Intrinsics.i(bufferedSource, "<this>");
        return d(bufferedSource.readByte(), 255) | (d(bufferedSource.readByte(), 255) << 16) | (d(bufferedSource.readByte(), 255) << 8);
    }

    public static final int L(Buffer buffer, byte b2) {
        Intrinsics.i(buffer, "<this>");
        int i2 = 0;
        while (!buffer.l0() && buffer.r(0) == b2) {
            i2++;
            buffer.readByte();
        }
        return i2;
    }

    public static final boolean M(Source source, int i2, TimeUnit timeUnit) {
        Intrinsics.i(source, "<this>");
        Intrinsics.i(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long d2 = source.u().f() ? source.u().d() - nanoTime : Long.MAX_VALUE;
        source.u().e(Math.min(d2, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.o1(buffer, 8192) != -1) {
                buffer.b();
            }
            if (d2 == Long.MAX_VALUE) {
                source.u().b();
            } else {
                source.u().e(nanoTime + d2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (d2 == Long.MAX_VALUE) {
                source.u().b();
            } else {
                source.u().e(nanoTime + d2);
            }
            return false;
        } catch (Throwable th) {
            if (d2 == Long.MAX_VALUE) {
                source.u().b();
            } else {
                source.u().e(nanoTime + d2);
            }
            throw th;
        }
    }

    public static final ThreadFactory N(String str, boolean z2) {
        Intrinsics.i(str, "name");
        return new C0396b(str, z2);
    }

    public static final Thread O(String str, boolean z2, Runnable runnable) {
        Intrinsics.i(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z2);
        return thread;
    }

    public static final List P(Headers headers) {
        Intrinsics.i(headers, "<this>");
        IntRange v2 = RangesKt.v(0, headers.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(v2, 10));
        Iterator it = v2.iterator();
        while (it.hasNext()) {
            int b2 = ((IntIterator) it).b();
            arrayList.add(new Header(headers.h(b2), headers.o(b2)));
        }
        return arrayList;
    }

    public static final Headers Q(List list) {
        Intrinsics.i(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            builder.d(header.a().U(), header.b().U());
        }
        return builder.f();
    }

    public static final String R(int i2) {
        String hexString = Integer.toHexString(i2);
        Intrinsics.h(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String S(long j2) {
        String hexString = Long.toHexString(j2);
        Intrinsics.h(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String T(HttpUrl httpUrl, boolean z2) {
        String str;
        Intrinsics.i(httpUrl, "<this>");
        if (StringsKt.W(httpUrl.i(), ":", false, 2, (Object) null)) {
            str = '[' + httpUrl.i() + ']';
        } else {
            str = httpUrl.i();
        }
        if (!z2 && httpUrl.o() == HttpUrl.f42657k.c(httpUrl.s())) {
            return str;
        }
        return str + ':' + httpUrl.o();
    }

    public static /* synthetic */ String U(HttpUrl httpUrl, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return T(httpUrl, z2);
    }

    public static final List V(List list) {
        Intrinsics.i(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.P0(list));
        Intrinsics.h(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final Map W(Map map) {
        Intrinsics.i(map, "<this>");
        if (map.isEmpty()) {
            return MapsKt.h();
        }
        Map unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.h(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long X(String str, long j2) {
        Intrinsics.i(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    public static final int Y(String str, int i2) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    public static final String Z(String str, int i2, int i3) {
        Intrinsics.i(str, "<this>");
        int z2 = z(str, i2, i3);
        String substring = str.substring(z2, B(str, z2, i3));
        Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String a0(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return Z(str, i2, i3);
    }

    public static final Throwable b0(Exception exc, List list) {
        Intrinsics.i(exc, "<this>");
        Intrinsics.i(list, "suppressed");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExceptionsKt.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void c(List list, Object obj) {
        Intrinsics.i(list, "<this>");
        if (!list.contains(obj)) {
            list.add(obj);
        }
    }

    public static final void c0(BufferedSink bufferedSink, int i2) {
        Intrinsics.i(bufferedSink, "<this>");
        bufferedSink.writeByte((i2 >>> 16) & 255);
        bufferedSink.writeByte((i2 >>> 8) & 255);
        bufferedSink.writeByte(i2 & 255);
    }

    public static final int d(byte b2, int i2) {
        return b2 & i2;
    }

    public static final int e(short s2, int i2) {
        return s2 & i2;
    }

    public static final long f(int i2, long j2) {
        return ((long) i2) & j2;
    }

    public static final EventListener.Factory g(EventListener eventListener) {
        Intrinsics.i(eventListener, "<this>");
        return new C0395a(eventListener);
    }

    public static final EventListener h(EventListener eventListener, Call call) {
        Intrinsics.i(eventListener, "$this_asFactory");
        Intrinsics.i(call, "it");
        return eventListener;
    }

    public static final boolean i(String str) {
        Intrinsics.i(str, "<this>");
        return f42804g.d(str);
    }

    public static final boolean j(HttpUrl httpUrl, HttpUrl httpUrl2) {
        Intrinsics.i(httpUrl, "<this>");
        Intrinsics.i(httpUrl2, "other");
        return Intrinsics.d(httpUrl.i(), httpUrl2.i()) && httpUrl.o() == httpUrl2.o() && Intrinsics.d(httpUrl.s(), httpUrl2.s());
    }

    public static final int k(String str, long j2, TimeUnit timeUnit) {
        Intrinsics.i(str, "name");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j2);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException((str + " too large.").toString());
            } else if (millis != 0 || i2 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException((str + " too small.").toString());
            }
        } else {
            throw new IllegalStateException("unit == null");
        }
    }

    public static final void l(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        Intrinsics.i(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        Intrinsics.i(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!Intrinsics.d(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String str) {
        Intrinsics.i(strArr, "<this>");
        Intrinsics.i(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.h(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[ArraysKt.m0(strArr2)] = str;
        return strArr2;
    }

    public static final int p(String str, char c2, int i2, int i3) {
        Intrinsics.i(str, "<this>");
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int q(String str, String str2, int i2, int i3) {
        Intrinsics.i(str, "<this>");
        Intrinsics.i(str2, "delimiters");
        while (i2 < i3) {
            if (StringsKt.V(str2, str.charAt(i2), false, 2, (Object) null)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int r(String str, char c2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return p(str, c2, i2, i3);
    }

    public static final boolean s(Source source, int i2, TimeUnit timeUnit) {
        Intrinsics.i(source, "<this>");
        Intrinsics.i(timeUnit, "timeUnit");
        try {
            return M(source, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String str, Object... objArr) {
        Intrinsics.i(str, "format");
        Intrinsics.i(objArr, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f40914a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.h(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.i(strArr, "<this>");
        Intrinsics.i(comparator, "comparator");
        if (!(strArr.length == 0 || strArr2 == null || strArr2.length == 0)) {
            for (String str : strArr) {
                Iterator a2 = ArrayIteratorKt.a(strArr2);
                while (a2.hasNext()) {
                    if (comparator.compare(str, (String) a2.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(Response response) {
        Intrinsics.i(response, "<this>");
        String e2 = response.m().e("Content-Length");
        if (e2 != null) {
            return X(e2, -1);
        }
        return -1;
    }

    public static final List w(Object... objArr) {
        Intrinsics.i(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.p(Arrays.copyOf(objArr2, objArr2.length)));
        Intrinsics.h(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int x(String[] strArr, String str, Comparator comparator) {
        Intrinsics.i(strArr, "<this>");
        Intrinsics.i(str, "value");
        Intrinsics.i(comparator, "comparator");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        Intrinsics.i(str, "<this>");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Intrinsics.k(charAt, 31) <= 0 || Intrinsics.k(charAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int z(String str, int i2, int i3) {
        Intrinsics.i(str, "<this>");
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }
}
