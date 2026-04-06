package okhttp3;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.Buffer;

@Metadata
public final class HttpUrl {

    /* renamed from: k  reason: collision with root package name */
    public static final Companion f42657k = new Companion((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f42658l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f42659a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42660b;

    /* renamed from: c  reason: collision with root package name */
    public final String f42661c;

    /* renamed from: d  reason: collision with root package name */
    public final String f42662d;

    /* renamed from: e  reason: collision with root package name */
    public final int f42663e;

    /* renamed from: f  reason: collision with root package name */
    public final List f42664f;

    /* renamed from: g  reason: collision with root package name */
    public final List f42665g;

    /* renamed from: h  reason: collision with root package name */
    public final String f42666h;

    /* renamed from: i  reason: collision with root package name */
    public final String f42667i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f42668j;

    @Metadata
    public static final class Builder {

        /* renamed from: i  reason: collision with root package name */
        public static final Companion f42669i = new Companion((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public String f42670a;

        /* renamed from: b  reason: collision with root package name */
        public String f42671b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f42672c = "";

        /* renamed from: d  reason: collision with root package name */
        public String f42673d;

        /* renamed from: e  reason: collision with root package name */
        public int f42674e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final List f42675f;

        /* renamed from: g  reason: collision with root package name */
        public List f42676g;

        /* renamed from: h  reason: collision with root package name */
        public String f42677h;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int e(String str, int i2, int i3) {
                try {
                    int parseInt = Integer.parseInt(Companion.b(HttpUrl.f42657k, str, i2, i3, "", false, false, false, false, (Charset) null, 248, (Object) null));
                    if (1 > parseInt || parseInt >= 65536) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int f(String str, int i2, int i3) {
                while (i2 < i3) {
                    char charAt = str.charAt(i2);
                    if (charAt == '[') {
                        do {
                            i2++;
                            if (i2 >= i3) {
                                break;
                            }
                        } while (str.charAt(i2) == ']');
                    } else if (charAt == ':') {
                        return i2;
                    }
                    i2++;
                }
                return i3;
            }

            public final int g(String str, int i2, int i3) {
                if (i3 - i2 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i2);
                if ((Intrinsics.k(charAt, 97) < 0 || Intrinsics.k(charAt, ModuleDescriptor.MODULE_VERSION) > 0) && (Intrinsics.k(charAt, 65) < 0 || Intrinsics.k(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i2);
                    if (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && !(('0' <= charAt2 && charAt2 < ':') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i2;
                        }
                        return -1;
                    }
                }
            }

            public final int h(String str, int i2, int i3) {
                int i4 = 0;
                while (i2 < i3) {
                    char charAt = str.charAt(i2);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i4++;
                    i2++;
                }
                return i4;
            }

            public Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f42675f = arrayList;
            arrayList.add("");
        }

        public final Builder a(String str, String str2) {
            Intrinsics.i(str, "encodedName");
            if (this.f42676g == null) {
                this.f42676g = new ArrayList();
            }
            List list = this.f42676g;
            Intrinsics.f(list);
            Companion companion = HttpUrl.f42657k;
            list.add(Companion.b(companion, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null));
            List list2 = this.f42676g;
            Intrinsics.f(list2);
            list2.add(str2 != null ? Companion.b(companion, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null) : null);
            return this;
        }

        public final Builder b(String str, String str2) {
            Intrinsics.i(str, "name");
            if (this.f42676g == null) {
                this.f42676g = new ArrayList();
            }
            List list = this.f42676g;
            Intrinsics.f(list);
            Companion companion = HttpUrl.f42657k;
            list.add(Companion.b(companion, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null));
            List list2 = this.f42676g;
            Intrinsics.f(list2);
            list2.add(str2 != null ? Companion.b(companion, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null) : null);
            return this;
        }

        public final HttpUrl c() {
            ArrayList arrayList;
            String str = this.f42670a;
            if (str != null) {
                Companion companion = HttpUrl.f42657k;
                String h2 = Companion.h(companion, this.f42671b, 0, 0, false, 7, (Object) null);
                String h3 = Companion.h(companion, this.f42672c, 0, 0, false, 7, (Object) null);
                String str2 = this.f42673d;
                if (str2 != null) {
                    int d2 = d();
                    Iterable<String> iterable = this.f42675f;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.x(iterable, 10));
                    for (String h4 : iterable) {
                        arrayList2.add(Companion.h(HttpUrl.f42657k, h4, 0, 0, false, 7, (Object) null));
                    }
                    List list = this.f42676g;
                    if (list != null) {
                        Iterable<String> iterable2 = list;
                        arrayList = new ArrayList(CollectionsKt.x(iterable2, 10));
                        for (String str3 : iterable2) {
                            arrayList.add(str3 != null ? Companion.h(HttpUrl.f42657k, str3, 0, 0, true, 3, (Object) null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.f42677h;
                    return new HttpUrl(str, h2, h3, str2, d2, arrayList2, arrayList, str4 != null ? Companion.h(HttpUrl.f42657k, str4, 0, 0, false, 7, (Object) null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final int d() {
            int i2 = this.f42674e;
            if (i2 != -1) {
                return i2;
            }
            Companion companion = HttpUrl.f42657k;
            String str = this.f42670a;
            Intrinsics.f(str);
            return companion.c(str);
        }

        public final Builder e(String str) {
            List list;
            if (str != null) {
                Companion companion = HttpUrl.f42657k;
                String b2 = Companion.b(companion, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211, (Object) null);
                if (b2 != null) {
                    list = companion.j(b2);
                    this.f42676g = list;
                    return this;
                }
            }
            list = null;
            this.f42676g = list;
            return this;
        }

        public final Builder f(String str) {
            this.f42677h = str != null ? Companion.b(HttpUrl.f42657k, str, 0, 0, "", false, false, false, true, (Charset) null, 187, (Object) null) : null;
            return this;
        }

        public final List g() {
            return this.f42675f;
        }

        public final Builder h(String str) {
            Intrinsics.i(str, "host");
            String e2 = HostnamesKt.e(Companion.h(HttpUrl.f42657k, str, 0, 0, false, 7, (Object) null));
            if (e2 != null) {
                this.f42673d = e2;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final boolean i(String str) {
            return Intrinsics.d(str, ".") || StringsKt.B(str, "%2e", true);
        }

        public final boolean j(String str) {
            return Intrinsics.d(str, "..") || StringsKt.B(str, "%2e.", true) || StringsKt.B(str, ".%2e", true) || StringsKt.B(str, "%2e%2e", true);
        }

        public final Builder k(HttpUrl httpUrl, String str) {
            int i2;
            int q2;
            int i3;
            int i4;
            boolean z2;
            boolean z3;
            String str2 = str;
            Intrinsics.i(str2, "input");
            int A2 = Util.A(str2, 0, 0, 3, (Object) null);
            int C = Util.C(str2, A2, 0, 2, (Object) null);
            Companion companion = f42669i;
            int c2 = companion.g(str2, A2, C);
            boolean z4 = true;
            char c3 = 65535;
            if (c2 != -1) {
                if (StringsKt.N(str2, "https:", A2, true)) {
                    this.f42670a = "https";
                    A2 += 6;
                } else if (StringsKt.N(str2, "http:", A2, true)) {
                    this.f42670a = "http";
                    A2 += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str2.substring(0, c2);
                    Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (httpUrl != null) {
                this.f42670a = httpUrl.s();
            } else {
                if (str.length() > 6) {
                    str2 = StringsKt.n1(str2, 6) + "...";
                }
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
            }
            int d2 = companion.h(str2, A2, C);
            char c4 = '?';
            char c5 = '#';
            if (d2 >= 2 || httpUrl == null || !Intrinsics.d(httpUrl.s(), this.f42670a)) {
                boolean z5 = false;
                boolean z6 = false;
                int i5 = A2 + d2;
                while (true) {
                    q2 = Util.q(str2, "@/\\?#", i5, C);
                    char charAt = q2 != C ? str2.charAt(q2) : c3;
                    if (charAt == c3 || charAt == c5 || charAt == '/' || charAt == '\\' || charAt == c4) {
                        boolean z7 = z4;
                        i2 = C;
                        Companion companion2 = f42669i;
                        int i6 = q2;
                        int b2 = companion2.f(str2, i5, i6);
                        int i7 = b2 + 1;
                    } else if (charAt == '@') {
                        if (!z5) {
                            int p2 = Util.p(str2, ':', i5, q2);
                            Companion companion3 = HttpUrl.f42657k;
                            String str3 = "%40";
                            int i8 = q2;
                            int i9 = p2;
                            z2 = z4;
                            String b3 = Companion.b(companion3, str, i5, p2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                            if (z6) {
                                b3 = this.f42671b + str3 + b3;
                            }
                            this.f42671b = b3;
                            int i10 = i8;
                            int i11 = i9;
                            if (i11 != i10) {
                                i3 = i10;
                                this.f42672c = Companion.b(companion3, str, i11 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                z3 = z2;
                            } else {
                                i3 = i10;
                                z3 = z5;
                            }
                            z5 = z3;
                            i4 = C;
                            z6 = z2;
                        } else {
                            i3 = q2;
                            z2 = z4;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f42672c);
                            sb2.append("%40");
                            i4 = C;
                            StringBuilder sb3 = sb2;
                            sb3.append(Companion.b(HttpUrl.f42657k, str, i5, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null));
                            this.f42672c = sb3.toString();
                        }
                        i5 = i3 + 1;
                        z4 = z2;
                        C = i4;
                        c5 = '#';
                        c4 = '?';
                        c3 = 65535;
                    }
                }
                boolean z72 = z4;
                i2 = C;
                Companion companion22 = f42669i;
                int i62 = q2;
                int b22 = companion22.f(str2, i5, i62);
                int i72 = b22 + 1;
                if (i72 < i62) {
                    this.f42673d = HostnamesKt.e(Companion.h(HttpUrl.f42657k, str, i5, b22, false, 4, (Object) null));
                    int a2 = companion22.e(str2, i72, i62);
                    this.f42674e = a2;
                    if (a2 == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str2.substring(i72, i62);
                        Intrinsics.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.f42657k;
                    this.f42673d = HostnamesKt.e(Companion.h(companion4, str, i5, b22, false, 4, (Object) null));
                    String str4 = this.f42670a;
                    Intrinsics.f(str4);
                    this.f42674e = companion4.c(str4);
                }
                if (this.f42673d != null) {
                    A2 = i62;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str2.substring(i5, b22);
                    Intrinsics.h(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.f42671b = httpUrl.g();
                this.f42672c = httpUrl.c();
                this.f42673d = httpUrl.i();
                this.f42674e = httpUrl.o();
                this.f42675f.clear();
                this.f42675f.addAll(httpUrl.e());
                if (A2 == C || str2.charAt(A2) == '#') {
                    e(httpUrl.f());
                }
                i2 = C;
            }
            int i12 = i2;
            int q3 = Util.q(str2, "?#", A2, i12);
            r(str2, A2, q3);
            if (q3 < i12 && str2.charAt(q3) == '?') {
                int p3 = Util.p(str2, '#', q3, i12);
                Companion companion5 = HttpUrl.f42657k;
                this.f42676g = companion5.j(Companion.b(companion5, str, q3 + 1, p3, " \"'<>#", true, false, true, false, (Charset) null, 208, (Object) null));
                q3 = p3;
            }
            if (q3 < i12 && str2.charAt(q3) == '#') {
                this.f42677h = Companion.b(HttpUrl.f42657k, str, q3 + 1, i12, "", true, false, false, true, (Charset) null, 176, (Object) null);
            }
            return this;
        }

        public final Builder l(String str) {
            Intrinsics.i(str, "password");
            this.f42672c = Companion.b(HttpUrl.f42657k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }

        public final void m() {
            List list = this.f42675f;
            if (((String) list.remove(list.size() - 1)).length() != 0 || this.f42675f.isEmpty()) {
                this.f42675f.add("");
                return;
            }
            List list2 = this.f42675f;
            list2.set(list2.size() - 1, "");
        }

        public final Builder n(int i2) {
            if (1 > i2 || i2 >= 65536) {
                throw new IllegalArgumentException(("unexpected port: " + i2).toString());
            }
            this.f42674e = i2;
            return this;
        }

        public final void o(String str, int i2, int i3, boolean z2, boolean z3) {
            String b2 = Companion.b(HttpUrl.f42657k, str, i2, i3, " \"<>^`{}|/\\?#", z3, false, false, false, (Charset) null, 240, (Object) null);
            if (!i(b2)) {
                if (j(b2)) {
                    m();
                    return;
                }
                List list = this.f42675f;
                if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                    List list2 = this.f42675f;
                    list2.set(list2.size() - 1, b2);
                } else {
                    this.f42675f.add(b2);
                }
                if (z2) {
                    this.f42675f.add("");
                }
            }
        }

        public final Builder p(String str) {
            List list;
            if (str != null) {
                Companion companion = HttpUrl.f42657k;
                String b2 = Companion.b(companion, str, 0, 0, " \"'<>#", false, false, true, false, (Charset) null, 219, (Object) null);
                if (b2 != null) {
                    list = companion.j(b2);
                    this.f42676g = list;
                    return this;
                }
            }
            list = null;
            this.f42676g = list;
            return this;
        }

        public final Builder q() {
            String str = this.f42673d;
            String str2 = null;
            this.f42673d = str != null ? new Regex("[\"<>^`{|}]").e(str, "") : null;
            int size = this.f42675f.size();
            for (int i2 = 0; i2 < size; i2++) {
                List list = this.f42675f;
                list.set(i2, Companion.b(HttpUrl.f42657k, (String) list.get(i2), 0, 0, "[]", true, true, false, false, (Charset) null, 227, (Object) null));
            }
            List list2 = this.f42676g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str3 = (String) list2.get(i3);
                    list2.set(i3, str3 != null ? Companion.b(HttpUrl.f42657k, str3, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195, (Object) null) : null);
                }
            }
            String str4 = this.f42677h;
            if (str4 != null) {
                str2 = Companion.b(HttpUrl.f42657k, str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163, (Object) null);
            }
            this.f42677h = str2;
            return this;
        }

        public final void r(String str, int i2, int i3) {
            if (i2 != i3) {
                char charAt = str.charAt(i2);
                if (charAt == '/' || charAt == '\\') {
                    this.f42675f.clear();
                    this.f42675f.add("");
                    i2++;
                } else {
                    List list = this.f42675f;
                    list.set(list.size() - 1, "");
                }
                while (true) {
                    int i4 = i2;
                    while (true) {
                        if (i4 < i3) {
                            i2 = Util.q(str, "/\\", i4, i3);
                            boolean z2 = i2 < i3;
                            o(str, i4, i2, z2, true);
                            if (z2) {
                                i4 = i2 + 1;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public final Builder s(String str) {
            Intrinsics.i(str, "scheme");
            if (StringsKt.B(str, "http", true)) {
                this.f42670a = "http";
            } else if (StringsKt.B(str, "https", true)) {
                this.f42670a = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public final void t(String str) {
            this.f42677h = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
            if (r1 != r4.c(r3)) goto L_0x0085;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f42670a
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r6.f42671b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L_0x0022
                goto L_0x002a
            L_0x0022:
                java.lang.String r1 = r6.f42672c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0044
            L_0x002a:
                java.lang.String r1 = r6.f42671b
                r0.append(r1)
                java.lang.String r1 = r6.f42672c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x003f
                r0.append(r2)
                java.lang.String r1 = r6.f42672c
                r0.append(r1)
            L_0x003f:
                r1 = 64
                r0.append(r1)
            L_0x0044:
                java.lang.String r1 = r6.f42673d
                if (r1 == 0) goto L_0x0069
                kotlin.jvm.internal.Intrinsics.f(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = kotlin.text.StringsKt.V(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L_0x0064
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f42673d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0069
            L_0x0064:
                java.lang.String r1 = r6.f42673d
                r0.append(r1)
            L_0x0069:
                int r1 = r6.f42674e
                r3 = -1
                if (r1 != r3) goto L_0x0072
                java.lang.String r1 = r6.f42670a
                if (r1 == 0) goto L_0x008b
            L_0x0072:
                int r1 = r6.d()
                java.lang.String r3 = r6.f42670a
                if (r3 == 0) goto L_0x0085
                okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.f42657k
                kotlin.jvm.internal.Intrinsics.f(r3)
                int r3 = r4.c(r3)
                if (r1 == r3) goto L_0x008b
            L_0x0085:
                r0.append(r2)
                r0.append(r1)
            L_0x008b:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.f42657k
                java.util.List r2 = r6.f42675f
                r1.i(r2, r0)
                java.util.List r2 = r6.f42676g
                if (r2 == 0) goto L_0x00a3
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.f42676g
                kotlin.jvm.internal.Intrinsics.f(r2)
                r1.k(r2, r0)
            L_0x00a3:
                java.lang.String r1 = r6.f42677h
                if (r1 == 0) goto L_0x00b1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f42677h
                r0.append(r1)
            L_0x00b1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.h(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final void u(String str) {
            Intrinsics.i(str, "<set-?>");
            this.f42672c = str;
        }

        public final void v(String str) {
            Intrinsics.i(str, "<set-?>");
            this.f42671b = str;
        }

        public final void w(String str) {
            this.f42673d = str;
        }

        public final void x(int i2) {
            this.f42674e = i2;
        }

        public final void y(String str) {
            this.f42670a = str;
        }

        public final Builder z(String str) {
            Intrinsics.i(str, "username");
            this.f42671b = Companion.b(HttpUrl.f42657k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(Companion companion, String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, Charset charset, int i4, Object obj) {
            int i5 = i4;
            return companion.a(str, (i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? str.length() : i3, str2, (i5 & 8) != 0 ? false : z2, (i5 & 16) != 0 ? false : z3, (i5 & 32) != 0 ? false : z4, (i5 & 64) != 0 ? false : z5, (i5 & 128) != 0 ? null : charset);
        }

        public static /* synthetic */ String h(Companion companion, String str, int i2, int i3, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = str.length();
            }
            if ((i4 & 4) != 0) {
                z2 = false;
            }
            return companion.g(str, i2, i3, z2);
        }

        public final String a(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, Charset charset) {
            String str3 = str;
            int i4 = i3;
            String str4 = str2;
            Intrinsics.i(str, "<this>");
            Intrinsics.i(str4, "encodeSet");
            int i5 = i2;
            while (i5 < i4) {
                int codePointAt = str.codePointAt(i5);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z5) && !StringsKt.V(str4, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z2) {
                            if (z3) {
                                if (!e(str, i5, i4)) {
                                    Buffer buffer = new Buffer();
                                    int i6 = i2;
                                    buffer.H1(str, i2, i5);
                                    l(buffer, str, i5, i3, str2, z2, z3, z4, z5, charset);
                                    return buffer.e0();
                                }
                                if (codePointAt == 43 || !z4) {
                                    i5 += Character.charCount(codePointAt);
                                } else {
                                    Buffer buffer2 = new Buffer();
                                    int i62 = i2;
                                    buffer2.H1(str, i2, i5);
                                    l(buffer2, str, i5, i3, str2, z2, z3, z4, z5, charset);
                                    return buffer2.e0();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i5 += Character.charCount(codePointAt);
                }
                Buffer buffer22 = new Buffer();
                int i622 = i2;
                buffer22.H1(str, i2, i5);
                l(buffer22, str, i5, i3, str2, z2, z3, z4, z5, charset);
                return buffer22.e0();
            }
            int i7 = i2;
            String substring = str.substring(i2, i3);
            Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final int c(String str) {
            Intrinsics.i(str, "scheme");
            if (Intrinsics.d(str, "http")) {
                return 80;
            }
            return Intrinsics.d(str, "https") ? 443 : -1;
        }

        public final HttpUrl d(String str) {
            Intrinsics.i(str, "<this>");
            return new Builder().k((HttpUrl) null, str).c();
        }

        public final boolean e(String str, int i2, int i3) {
            int i4 = i2 + 2;
            return i4 < i3 && str.charAt(i2) == '%' && Util.I(str.charAt(i2 + 1)) != -1 && Util.I(str.charAt(i4)) != -1;
        }

        public final HttpUrl f(String str) {
            Intrinsics.i(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i2, int i3, boolean z2) {
            Intrinsics.i(str, "<this>");
            for (int i4 = i2; i4 < i3; i4++) {
                char charAt = str.charAt(i4);
                if (charAt == '%' || (charAt == '+' && z2)) {
                    Buffer buffer = new Buffer();
                    buffer.H1(str, i2, i4);
                    m(buffer, str, i4, i3, z2);
                    return buffer.e0();
                }
            }
            String substring = str.substring(i2, i3);
            Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void i(List list, StringBuilder sb) {
            Intrinsics.i(list, "<this>");
            Intrinsics.i(sb, "out");
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append((String) list.get(i2));
            }
        }

        public final List j(String str) {
            Intrinsics.i(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 <= str.length()) {
                int i0 = StringsKt.i0(str, '&', i2, false, 4, (Object) null);
                if (i0 == -1) {
                    i0 = str.length();
                }
                int i3 = i0;
                int i02 = StringsKt.i0(str, '=', i2, false, 4, (Object) null);
                if (i02 == -1 || i02 > i3) {
                    String substring = str.substring(i2, i3);
                    Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i2, i02);
                    Intrinsics.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(i02 + 1, i3);
                    Intrinsics.h(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i2 = i3 + 1;
            }
            return arrayList;
        }

        public final void k(List list, StringBuilder sb) {
            Intrinsics.i(list, "<this>");
            Intrinsics.i(sb, "out");
            IntProgression u2 = RangesKt.u(RangesKt.v(0, list.size()), 2);
            int n2 = u2.n();
            int o2 = u2.o();
            int p2 = u2.p();
            if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
                while (true) {
                    String str = (String) list.get(n2);
                    String str2 = (String) list.get(n2 + 1);
                    if (n2 > 0) {
                        sb.append('&');
                    }
                    sb.append(str);
                    if (str2 != null) {
                        sb.append('=');
                        sb.append(str2);
                    }
                    if (n2 != o2) {
                        n2 += p2;
                    } else {
                        return;
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
            if (e(r1, r5, r2) == false) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void l(okio.Buffer r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00bc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x0028
                r8 = 9
                if (r7 == r8) goto L_0x0023
                r8 = 10
                if (r7 == r8) goto L_0x0023
                r8 = 12
                if (r7 == r8) goto L_0x0023
                r8 = 13
                if (r7 != r8) goto L_0x0028
            L_0x0023:
                r8 = r14
                r12 = r19
                goto L_0x00b5
            L_0x0028:
                r8 = 43
                if (r7 != r8) goto L_0x0039
                if (r22 == 0) goto L_0x0039
                if (r20 == 0) goto L_0x0033
                java.lang.String r8 = "+"
                goto L_0x0035
            L_0x0033:
                java.lang.String r8 = "%2B"
            L_0x0035:
                r15.K0(r8)
                goto L_0x0023
            L_0x0039:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x004a
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x004a
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x004e
                if (r23 == 0) goto L_0x004a
                goto L_0x004e
            L_0x004a:
                r8 = r14
                r12 = r19
                goto L_0x006f
            L_0x004e:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.StringsKt.V(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x0069
                if (r7 != r9) goto L_0x0067
                if (r20 == 0) goto L_0x0069
                if (r21 == 0) goto L_0x0067
                r8 = r14
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L_0x006b
                goto L_0x006f
            L_0x0067:
                r8 = r14
                goto L_0x006b
            L_0x0069:
                r8 = r14
                goto L_0x006f
            L_0x006b:
                r15.I1(r7)
                goto L_0x00b5
            L_0x006f:
                if (r6 != 0) goto L_0x0076
                okio.Buffer r6 = new okio.Buffer
                r6.<init>()
            L_0x0076:
                if (r3 == 0) goto L_0x008a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.Intrinsics.d(r3, r10)
                if (r10 == 0) goto L_0x0081
                goto L_0x008a
            L_0x0081:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.F1(r1, r5, r10, r3)
                goto L_0x008d
            L_0x008a:
                r6.I1(r7)
            L_0x008d:
                boolean r10 = r6.l0()
                if (r10 != 0) goto L_0x00b5
                byte r10 = r6.readByte()
                r11 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r13 = okhttp3.HttpUrl.f42658l
                int r11 = r11 >> 4
                r11 = r11 & 15
                char r11 = r13[r11]
                r15.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.f42658l
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L_0x008d
            L_0x00b5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00bc:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.l(okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        public final void m(Buffer buffer, String str, int i2, int i3, boolean z2) {
            int i4;
            while (i2 < i3) {
                int codePointAt = str.codePointAt(i2);
                if (codePointAt == 37 && (i4 = i2 + 2) < i3) {
                    int I = Util.I(str.charAt(i2 + 1));
                    int I2 = Util.I(str.charAt(i4));
                    if (!(I == -1 || I2 == -1)) {
                        buffer.writeByte((I << 4) + I2);
                        i2 = Character.charCount(codePointAt) + i4;
                    }
                } else if (codePointAt == 43 && z2) {
                    buffer.writeByte(32);
                    i2++;
                }
                buffer.I1(codePointAt);
                i2 += Character.charCount(codePointAt);
            }
        }

        public Companion() {
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i2, List list, List list2, String str5, String str6) {
        Intrinsics.i(str, "scheme");
        Intrinsics.i(str2, "username");
        Intrinsics.i(str3, "password");
        Intrinsics.i(str4, "host");
        Intrinsics.i(list, "pathSegments");
        Intrinsics.i(str6, "url");
        this.f42659a = str;
        this.f42660b = str2;
        this.f42661c = str3;
        this.f42662d = str4;
        this.f42663e = i2;
        this.f42664f = list;
        this.f42665g = list2;
        this.f42666h = str5;
        this.f42667i = str6;
        this.f42668j = Intrinsics.d(str, "https");
    }

    public static final HttpUrl h(String str) {
        return f42657k.d(str);
    }

    public static final HttpUrl m(String str) {
        return f42657k.f(str);
    }

    public final String b() {
        if (this.f42666h == null) {
            return null;
        }
        String substring = this.f42667i.substring(StringsKt.i0(this.f42667i, '#', 0, false, 6, (Object) null) + 1);
        Intrinsics.h(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String c() {
        if (this.f42661c.length() == 0) {
            return "";
        }
        int i0 = StringsKt.i0(this.f42667i, '@', 0, false, 6, (Object) null);
        String substring = this.f42667i.substring(StringsKt.i0(this.f42667i, ':', this.f42659a.length() + 3, false, 4, (Object) null) + 1, i0);
        Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String d() {
        int i0 = StringsKt.i0(this.f42667i, '/', this.f42659a.length() + 3, false, 4, (Object) null);
        String str = this.f42667i;
        String substring = this.f42667i.substring(i0, Util.q(str, "?#", i0, str.length()));
        Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List e() {
        int i0 = StringsKt.i0(this.f42667i, '/', this.f42659a.length() + 3, false, 4, (Object) null);
        String str = this.f42667i;
        int q2 = Util.q(str, "?#", i0, str.length());
        ArrayList arrayList = new ArrayList();
        while (i0 < q2) {
            int i2 = i0 + 1;
            int p2 = Util.p(this.f42667i, '/', i2, q2);
            String substring = this.f42667i.substring(i2, p2);
            Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            i0 = p2;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && Intrinsics.d(((HttpUrl) obj).f42667i, this.f42667i);
    }

    public final String f() {
        if (this.f42665g == null) {
            return null;
        }
        int i0 = StringsKt.i0(this.f42667i, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f42667i;
        String substring = this.f42667i.substring(i0, Util.p(str, '#', i0, str.length()));
        Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String g() {
        if (this.f42660b.length() == 0) {
            return "";
        }
        int length = this.f42659a.length() + 3;
        String str = this.f42667i;
        String substring = this.f42667i.substring(length, Util.q(str, ":@", length, str.length()));
        Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public int hashCode() {
        return this.f42667i.hashCode();
    }

    public final String i() {
        return this.f42662d;
    }

    public final boolean j() {
        return this.f42668j;
    }

    public final Builder k() {
        Builder builder = new Builder();
        builder.y(this.f42659a);
        builder.v(g());
        builder.u(c());
        builder.w(this.f42662d);
        builder.x(this.f42663e != f42657k.c(this.f42659a) ? this.f42663e : -1);
        builder.g().clear();
        builder.g().addAll(e());
        builder.e(f());
        builder.t(b());
        return builder;
    }

    public final Builder l(String str) {
        Intrinsics.i(str, "link");
        try {
            return new Builder().k(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List n() {
        return this.f42664f;
    }

    public final int o() {
        return this.f42663e;
    }

    public final String p() {
        if (this.f42665g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f42657k.k(this.f42665g, sb);
        return sb.toString();
    }

    public final String q() {
        Builder l2 = l("/...");
        Intrinsics.f(l2);
        return l2.z("").l("").c().toString();
    }

    public final HttpUrl r(String str) {
        Intrinsics.i(str, "link");
        Builder l2 = l(str);
        if (l2 != null) {
            return l2.c();
        }
        return null;
    }

    public final String s() {
        return this.f42659a;
    }

    public final URI t() {
        String builder = k().q().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e2) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").e(builder, ""));
                Intrinsics.h(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public String toString() {
        return this.f42667i;
    }

    public final URL u() {
        try {
            return new URL(this.f42667i);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }
}
