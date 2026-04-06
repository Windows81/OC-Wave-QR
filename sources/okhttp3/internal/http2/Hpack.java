package okhttp3.internal.http2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;

@Metadata
public final class Hpack {

    /* renamed from: a  reason: collision with root package name */
    public static final Hpack f43039a;

    /* renamed from: b  reason: collision with root package name */
    public static final Header[] f43040b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map f43041c;

    static {
        Hpack hpack = new Hpack();
        f43039a = hpack;
        Header header = r2;
        Header header2 = new Header(Header.f43035j, "");
        Header header3 = r3;
        ByteString byteString = Header.f43032g;
        Header header4 = new Header(byteString, "GET");
        Header header5 = r5;
        Header header6 = new Header(byteString, "POST");
        Header header7 = r5;
        ByteString byteString2 = Header.f43033h;
        Header header8 = new Header(byteString2, "/");
        Header header9 = r7;
        Header header10 = new Header(byteString2, "/index.html");
        Header header11 = r7;
        ByteString byteString3 = Header.f43034i;
        Header header12 = new Header(byteString3, "http");
        Header header13 = r9;
        Header header14 = new Header(byteString3, "https");
        Header header15 = r9;
        ByteString byteString4 = Header.f43031f;
        Header header16 = new Header(byteString4, "200");
        Header header17 = r10;
        Header header18 = new Header(byteString4, "204");
        Header header19 = r11;
        Header header20 = new Header(byteString4, "206");
        Header header21 = r12;
        Header header22 = new Header(byteString4, "304");
        Header header23 = r13;
        Header header24 = new Header(byteString4, "400");
        Header header25 = r15;
        Hpack hpack2 = hpack;
        Header header26 = new Header(byteString4, "404");
        ByteString byteString5 = byteString4;
        Header header27 = r0;
        Header header28 = header;
        Header header29 = new Header(byteString5, "500");
        String str = "";
        Header header30 = r0;
        Header header31 = new Header("accept-charset", str);
        Header header32 = r0;
        Header header33 = new Header("accept-encoding", "gzip, deflate");
        Header header34 = r0;
        Header header35 = new Header("accept-language", str);
        Header header36 = r0;
        Header header37 = new Header("accept-ranges", str);
        Header header38 = r0;
        Header header39 = new Header("accept", str);
        Header header40 = r0;
        Header header41 = new Header("access-control-allow-origin", str);
        Header header42 = r0;
        Header header43 = new Header("age", str);
        Header header44 = r0;
        Header header45 = new Header("allow", str);
        Header header46 = r0;
        Header header47 = new Header("authorization", str);
        Header header48 = r0;
        Header header49 = new Header("cache-control", str);
        Header header50 = r0;
        Header header51 = new Header("content-disposition", str);
        Header header52 = r0;
        Header header53 = new Header("content-encoding", str);
        Header header54 = r0;
        Header header55 = new Header("content-language", str);
        Header header56 = r0;
        Header header57 = new Header("content-length", str);
        Header header58 = r0;
        Header header59 = new Header("content-location", str);
        Header header60 = r0;
        Header header61 = new Header("content-range", str);
        Header header62 = r0;
        Header header63 = new Header("content-type", str);
        Header header64 = r0;
        Header header65 = new Header("cookie", str);
        Header header66 = r0;
        Header header67 = new Header("date", str);
        Header header68 = r0;
        Header header69 = new Header("etag", str);
        Header header70 = r0;
        Header header71 = new Header("expect", str);
        Header header72 = r0;
        Header header73 = new Header("expires", str);
        Header header74 = r0;
        Header header75 = new Header("from", str);
        Header header76 = r0;
        Header header77 = new Header("host", str);
        Header header78 = r0;
        Header header79 = new Header("if-match", str);
        Header header80 = r0;
        Header header81 = new Header("if-modified-since", str);
        Header header82 = r0;
        Header header83 = new Header("if-none-match", str);
        Header header84 = r0;
        Header header85 = new Header("if-range", str);
        Header header86 = r0;
        Header header87 = new Header("if-unmodified-since", str);
        Header header88 = r0;
        Header header89 = new Header("last-modified", str);
        Header header90 = r0;
        Header header91 = new Header("link", str);
        Header header92 = r0;
        Header header93 = new Header("location", str);
        Header header94 = r0;
        Header header95 = new Header("max-forwards", str);
        Header header96 = r0;
        Header header97 = new Header("proxy-authenticate", str);
        Header header98 = r0;
        Header header99 = new Header("proxy-authorization", str);
        Header header100 = r0;
        Header header101 = new Header("range", str);
        Header header102 = r0;
        Header header103 = new Header("referer", str);
        Header header104 = r0;
        Header header105 = new Header("refresh", str);
        Header header106 = r0;
        Header header107 = new Header("retry-after", str);
        Header header108 = r0;
        Header header109 = new Header("server", str);
        Header header110 = r0;
        Header header111 = new Header("set-cookie", str);
        Header header112 = r0;
        Header header113 = new Header("strict-transport-security", str);
        Header header114 = r0;
        Header header115 = new Header("transfer-encoding", str);
        Header header116 = r0;
        Header header117 = new Header("user-agent", str);
        Header header118 = r0;
        Header header119 = new Header("vary", str);
        Header header120 = r0;
        Header header121 = new Header("via", str);
        Header header122 = r0;
        Header header123 = new Header("www-authenticate", str);
        f43040b = new Header[]{header28, header3, header5, header7, header9, header11, header13, header15, header17, header19, header21, header23, header25, header27, header30, header32, header34, header36, header38, header40, header42, header44, header46, header48, header50, header52, header54, header56, header58, header60, header62, header64, header66, header68, header70, header72, header74, header76, header78, header80, header82, header84, header86, header88, header90, header92, header94, header96, header98, header100, header102, header104, header106, header108, header110, header112, header114, header116, header118, header120, header122};
        f43041c = hpack2.d();
    }

    public final ByteString a(ByteString byteString) {
        Intrinsics.i(byteString, "name");
        int N = byteString.N();
        int i2 = 0;
        while (i2 < N) {
            byte k2 = byteString.k(i2);
            if (65 > k2 || k2 >= 91) {
                i2++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.U());
            }
        }
        return byteString;
    }

    public final Map b() {
        return f43041c;
    }

    public final Header[] c() {
        return f43040b;
    }

    public final Map d() {
        Header[] headerArr = f43040b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Header[] headerArr2 = f43040b;
            if (!linkedHashMap.containsKey(headerArr2[i2].f43036a)) {
                linkedHashMap.put(headerArr2[i2].f43036a, Integer.valueOf(i2));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.h(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    @Metadata
    public static final class Reader {

        /* renamed from: a  reason: collision with root package name */
        public final int f43042a;

        /* renamed from: b  reason: collision with root package name */
        public int f43043b;

        /* renamed from: c  reason: collision with root package name */
        public final List f43044c;

        /* renamed from: d  reason: collision with root package name */
        public final BufferedSource f43045d;

        /* renamed from: e  reason: collision with root package name */
        public Header[] f43046e;

        /* renamed from: f  reason: collision with root package name */
        public int f43047f;

        /* renamed from: g  reason: collision with root package name */
        public int f43048g;

        /* renamed from: h  reason: collision with root package name */
        public int f43049h;

        public Reader(Source source, int i2, int i3) {
            Intrinsics.i(source, "source");
            this.f43042a = i2;
            this.f43043b = i3;
            this.f43044c = new ArrayList();
            this.f43045d = Okio.d(source);
            Header[] headerArr = new Header[8];
            this.f43046e = headerArr;
            this.f43047f = headerArr.length - 1;
        }

        public final void a() {
            int i2 = this.f43043b;
            int i3 = this.f43049h;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                b();
            } else {
                d(i3 - i2);
            }
        }

        public final void b() {
            ArraysKt.z(this.f43046e, (Object) null, 0, 0, 6, (Object) null);
            this.f43047f = this.f43046e.length - 1;
            this.f43048g = 0;
            this.f43049h = 0;
        }

        public final int c(int i2) {
            return this.f43047f + 1 + i2;
        }

        public final int d(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f43046e.length;
                while (true) {
                    length--;
                    i3 = this.f43047f;
                    if (length < i3 || i2 <= 0) {
                        Header[] headerArr = this.f43046e;
                        System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i4, this.f43048g);
                        this.f43047f += i4;
                    } else {
                        Header header = this.f43046e[length];
                        Intrinsics.f(header);
                        int i5 = header.f43038c;
                        i2 -= i5;
                        this.f43049h -= i5;
                        this.f43048g--;
                        i4++;
                    }
                }
                Header[] headerArr2 = this.f43046e;
                System.arraycopy(headerArr2, i3 + 1, headerArr2, i3 + 1 + i4, this.f43048g);
                this.f43047f += i4;
            }
            return i4;
        }

        public final List e() {
            List M0 = CollectionsKt.M0(this.f43044c);
            this.f43044c.clear();
            return M0;
        }

        public final ByteString f(int i2) {
            if (h(i2)) {
                return Hpack.f43039a.c()[i2].f43036a;
            }
            int c2 = c(i2 - Hpack.f43039a.c().length);
            if (c2 >= 0) {
                Header[] headerArr = this.f43046e;
                if (c2 < headerArr.length) {
                    Header header = headerArr[c2];
                    Intrinsics.f(header);
                    return header.f43036a;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        public final void g(int i2, Header header) {
            this.f43044c.add(header);
            int i3 = header.f43038c;
            if (i2 != -1) {
                Header header2 = this.f43046e[c(i2)];
                Intrinsics.f(header2);
                i3 -= header2.f43038c;
            }
            int i4 = this.f43043b;
            if (i3 > i4) {
                b();
                return;
            }
            int d2 = d((this.f43049h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f43048g + 1;
                Header[] headerArr = this.f43046e;
                if (i5 > headerArr.length) {
                    Header[] headerArr2 = new Header[(headerArr.length * 2)];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.f43047f = this.f43046e.length - 1;
                    this.f43046e = headerArr2;
                }
                int i6 = this.f43047f;
                this.f43047f = i6 - 1;
                this.f43046e[i6] = header;
                this.f43048g++;
            } else {
                this.f43046e[i2 + c(i2) + d2] = header;
            }
            this.f43049h += i3;
        }

        public final boolean h(int i2) {
            return i2 >= 0 && i2 <= Hpack.f43039a.c().length - 1;
        }

        public final int i() {
            return Util.d(this.f43045d.readByte(), 255);
        }

        public final ByteString j() {
            int i2 = i();
            boolean z2 = (i2 & 128) == 128;
            long m2 = (long) m(i2, 127);
            if (!z2) {
                return this.f43045d.R(m2);
            }
            Buffer buffer = new Buffer();
            Huffman.f43155a.b(this.f43045d, m2, buffer);
            return buffer.X();
        }

        public final void k() {
            while (!this.f43045d.l0()) {
                int d2 = Util.d(this.f43045d.readByte(), 255);
                if (d2 == 128) {
                    throw new IOException("index == 0");
                } else if ((d2 & 128) == 128) {
                    l(m(d2, 127) - 1);
                } else if (d2 == 64) {
                    o();
                } else if ((d2 & 64) == 64) {
                    n(m(d2, 63) - 1);
                } else if ((d2 & 32) == 32) {
                    int m2 = m(d2, 31);
                    this.f43043b = m2;
                    if (m2 < 0 || m2 > this.f43042a) {
                        throw new IOException("Invalid dynamic table size update " + this.f43043b);
                    }
                    a();
                } else if (d2 == 16 || d2 == 0) {
                    q();
                } else {
                    p(m(d2, 15) - 1);
                }
            }
        }

        public final void l(int i2) {
            if (h(i2)) {
                this.f43044c.add(Hpack.f43039a.c()[i2]);
                return;
            }
            int c2 = c(i2 - Hpack.f43039a.c().length);
            if (c2 >= 0) {
                Header[] headerArr = this.f43046e;
                if (c2 < headerArr.length) {
                    Header header = headerArr[c2];
                    Intrinsics.f(header);
                    this.f43044c.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        public final int m(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int i6 = i();
                if ((i6 & 128) == 0) {
                    return i3 + (i6 << i5);
                }
                i3 += (i6 & 127) << i5;
                i5 += 7;
            }
        }

        public final void n(int i2) {
            g(-1, new Header(f(i2), j()));
        }

        public final void o() {
            g(-1, new Header(Hpack.f43039a.a(j()), j()));
        }

        public final void p(int i2) {
            this.f43044c.add(new Header(f(i2), j()));
        }

        public final void q() {
            this.f43044c.add(new Header(Hpack.f43039a.a(j()), j()));
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Reader(Source source, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i2, (i4 & 4) != 0 ? i2 : i3);
        }
    }

    @Metadata
    public static final class Writer {

        /* renamed from: a  reason: collision with root package name */
        public int f43050a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f43051b;

        /* renamed from: c  reason: collision with root package name */
        public final Buffer f43052c;

        /* renamed from: d  reason: collision with root package name */
        public int f43053d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f43054e;

        /* renamed from: f  reason: collision with root package name */
        public int f43055f;

        /* renamed from: g  reason: collision with root package name */
        public Header[] f43056g;

        /* renamed from: h  reason: collision with root package name */
        public int f43057h;

        /* renamed from: i  reason: collision with root package name */
        public int f43058i;

        /* renamed from: j  reason: collision with root package name */
        public int f43059j;

        public Writer(int i2, boolean z2, Buffer buffer) {
            Intrinsics.i(buffer, "out");
            this.f43050a = i2;
            this.f43051b = z2;
            this.f43052c = buffer;
            this.f43053d = Integer.MAX_VALUE;
            this.f43055f = i2;
            Header[] headerArr = new Header[8];
            this.f43056g = headerArr;
            this.f43057h = headerArr.length - 1;
        }

        public final void a() {
            int i2 = this.f43055f;
            int i3 = this.f43059j;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                b();
            } else {
                c(i3 - i2);
            }
        }

        public final void b() {
            ArraysKt.z(this.f43056g, (Object) null, 0, 0, 6, (Object) null);
            this.f43057h = this.f43056g.length - 1;
            this.f43058i = 0;
            this.f43059j = 0;
        }

        public final int c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f43056g.length;
                while (true) {
                    length--;
                    i3 = this.f43057h;
                    if (length < i3 || i2 <= 0) {
                        Header[] headerArr = this.f43056g;
                        System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i4, this.f43058i);
                        Header[] headerArr2 = this.f43056g;
                        int i5 = this.f43057h;
                        Arrays.fill(headerArr2, i5 + 1, i5 + 1 + i4, (Object) null);
                        this.f43057h += i4;
                    } else {
                        Header header = this.f43056g[length];
                        Intrinsics.f(header);
                        i2 -= header.f43038c;
                        int i6 = this.f43059j;
                        Header header2 = this.f43056g[length];
                        Intrinsics.f(header2);
                        this.f43059j = i6 - header2.f43038c;
                        this.f43058i--;
                        i4++;
                    }
                }
                Header[] headerArr3 = this.f43056g;
                System.arraycopy(headerArr3, i3 + 1, headerArr3, i3 + 1 + i4, this.f43058i);
                Header[] headerArr22 = this.f43056g;
                int i52 = this.f43057h;
                Arrays.fill(headerArr22, i52 + 1, i52 + 1 + i4, (Object) null);
                this.f43057h += i4;
            }
            return i4;
        }

        public final void d(Header header) {
            int i2 = header.f43038c;
            int i3 = this.f43055f;
            if (i2 > i3) {
                b();
                return;
            }
            c((this.f43059j + i2) - i3);
            int i4 = this.f43058i + 1;
            Header[] headerArr = this.f43056g;
            if (i4 > headerArr.length) {
                Header[] headerArr2 = new Header[(headerArr.length * 2)];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f43057h = this.f43056g.length - 1;
                this.f43056g = headerArr2;
            }
            int i5 = this.f43057h;
            this.f43057h = i5 - 1;
            this.f43056g[i5] = header;
            this.f43058i++;
            this.f43059j += i2;
        }

        public final void e(int i2) {
            this.f43050a = i2;
            int min = Math.min(i2, 16384);
            int i3 = this.f43055f;
            if (i3 != min) {
                if (min < i3) {
                    this.f43053d = Math.min(this.f43053d, min);
                }
                this.f43054e = true;
                this.f43055f = min;
                a();
            }
        }

        public final void f(ByteString byteString) {
            Intrinsics.i(byteString, "data");
            if (this.f43051b) {
                Huffman huffman = Huffman.f43155a;
                if (huffman.d(byteString) < byteString.N()) {
                    Buffer buffer = new Buffer();
                    huffman.c(byteString, buffer);
                    ByteString X = buffer.X();
                    h(X.N(), 127, 128);
                    this.f43052c.k1(X);
                    return;
                }
            }
            h(byteString.N(), 127, 0);
            this.f43052c.k1(byteString);
        }

        public final void g(List list) {
            int i2;
            int i3;
            Intrinsics.i(list, "headerBlock");
            if (this.f43054e) {
                int i4 = this.f43053d;
                if (i4 < this.f43055f) {
                    h(i4, 31, 32);
                }
                this.f43054e = false;
                this.f43053d = Integer.MAX_VALUE;
                h(this.f43055f, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                Header header = (Header) list.get(i5);
                ByteString T = header.f43036a.T();
                ByteString byteString = header.f43037b;
                Hpack hpack = Hpack.f43039a;
                Integer num = (Integer) hpack.b().get(T);
                if (num != null) {
                    int intValue = num.intValue();
                    i2 = intValue + 1;
                    if (2 <= i2 && i2 < 8) {
                        if (Intrinsics.d(hpack.c()[intValue].f43037b, byteString)) {
                            i3 = i2;
                        } else if (Intrinsics.d(hpack.c()[i2].f43037b, byteString)) {
                            i3 = i2;
                            i2 = intValue + 2;
                        }
                    }
                    i3 = i2;
                    i2 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i2 == -1) {
                    int i6 = this.f43057h + 1;
                    int length = this.f43056g.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        Header header2 = this.f43056g[i6];
                        Intrinsics.f(header2);
                        if (Intrinsics.d(header2.f43036a, T)) {
                            Header header3 = this.f43056g[i6];
                            Intrinsics.f(header3);
                            if (Intrinsics.d(header3.f43037b, byteString)) {
                                i2 = Hpack.f43039a.c().length + (i6 - this.f43057h);
                                break;
                            } else if (i3 == -1) {
                                i3 = (i6 - this.f43057h) + Hpack.f43039a.c().length;
                            }
                        }
                        i6++;
                    }
                }
                if (i2 != -1) {
                    h(i2, 127, 128);
                } else if (i3 == -1) {
                    this.f43052c.writeByte(64);
                    f(T);
                    f(byteString);
                    d(header);
                } else if (!T.Q(Header.f43030e) || Intrinsics.d(Header.f43035j, T)) {
                    h(i3, 63, 64);
                    f(byteString);
                    d(header);
                } else {
                    h(i3, 15, 0);
                    f(byteString);
                }
            }
        }

        public final void h(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.f43052c.writeByte(i2 | i4);
                return;
            }
            this.f43052c.writeByte(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.f43052c.writeByte(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.f43052c.writeByte(i5);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Writer(int i2, boolean z2, Buffer buffer, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 4096 : i2, (i3 & 2) != 0 ? true : z2, buffer);
        }
    }
}
