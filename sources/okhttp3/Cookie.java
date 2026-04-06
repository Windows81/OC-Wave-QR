package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

@Metadata
public final class Cookie {

    /* renamed from: j  reason: collision with root package name */
    public static final Companion f42609j = new Companion((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f42610k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f42611l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f42612m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f42613n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f42614a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42615b;

    /* renamed from: c  reason: collision with root package name */
    public final long f42616c;

    /* renamed from: d  reason: collision with root package name */
    public final String f42617d;

    /* renamed from: e  reason: collision with root package name */
    public final String f42618e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f42619f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f42620g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f42621h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f42622i;

    @Metadata
    public static final class Builder {
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(String str, int i2, int i3, boolean z2) {
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z2)) {
                    return i2;
                }
                i2++;
            }
            return i3;
        }

        public final boolean b(String str, String str2) {
            if (Intrinsics.d(str, str2)) {
                return true;
            }
            return StringsKt.A(str, str2, false, 2, (Object) null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.i(str);
        }

        public final Cookie c(HttpUrl httpUrl, String str) {
            Intrinsics.i(httpUrl, "url");
            Intrinsics.i(str, "setCookie");
            return d(System.currentTimeMillis(), httpUrl, str);
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0110  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0113  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0133 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0134  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.Cookie d(long r26, okhttp3.HttpUrl r28, java.lang.String r29) {
            /*
                r25 = this;
                r0 = r25
                r7 = r29
                java.lang.String r1 = "url"
                r8 = r28
                kotlin.jvm.internal.Intrinsics.i(r8, r1)
                java.lang.String r1 = "setCookie"
                kotlin.jvm.internal.Intrinsics.i(r7, r1)
                r5 = 6
                r6 = 0
                r2 = 59
                r3 = 0
                r4 = 0
                r1 = r29
                int r9 = okhttp3.internal.Util.r(r1, r2, r3, r4, r5, r6)
                r5 = 2
                r2 = 61
                r4 = r9
                int r1 = okhttp3.internal.Util.r(r1, r2, r3, r4, r5, r6)
                r2 = 0
                if (r1 != r9) goto L_0x0028
                return r2
            L_0x0028:
                r3 = 0
                r4 = 1
                java.lang.String r11 = okhttp3.internal.Util.a0(r7, r3, r1, r4, r2)
                int r5 = r11.length()
                if (r5 != 0) goto L_0x0035
                goto L_0x003c
            L_0x0035:
                int r5 = okhttp3.internal.Util.y(r11)
                r6 = -1
                if (r5 == r6) goto L_0x003d
            L_0x003c:
                return r2
            L_0x003d:
                int r1 = r1 + r4
                java.lang.String r12 = okhttp3.internal.Util.Z(r7, r1, r9)
                int r1 = okhttp3.internal.Util.y(r12)
                if (r1 == r6) goto L_0x0049
                return r2
            L_0x0049:
                int r9 = r9 + r4
                int r1 = r29.length()
                r5 = -1
                r10 = r2
                r22 = r10
                r17 = r3
                r18 = r17
                r19 = r18
                r20 = r4
                r15 = r5
                r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0061:
                if (r9 >= r1) goto L_0x00d1
                r2 = 59
                int r2 = okhttp3.internal.Util.p(r7, r2, r9, r1)
                r13 = 61
                int r13 = okhttp3.internal.Util.p(r7, r13, r9, r2)
                java.lang.String r9 = okhttp3.internal.Util.Z(r7, r9, r13)
                if (r13 >= r2) goto L_0x007c
                int r13 = r13 + 1
                java.lang.String r13 = okhttp3.internal.Util.Z(r7, r13, r2)
                goto L_0x007e
            L_0x007c:
                java.lang.String r13 = ""
            L_0x007e:
                java.lang.String r14 = "expires"
                boolean r14 = kotlin.text.StringsKt.B(r9, r14, r4)
                if (r14 == 0) goto L_0x0091
                int r9 = r13.length()     // Catch:{ IllegalArgumentException -> 0x00cd }
                long r23 = r0.g(r13, r3, r9)     // Catch:{ IllegalArgumentException -> 0x00cd }
            L_0x008e:
                r19 = r4
                goto L_0x00cd
            L_0x0091:
                java.lang.String r14 = "max-age"
                boolean r14 = kotlin.text.StringsKt.B(r9, r14, r4)
                if (r14 == 0) goto L_0x009e
                long r15 = r0.h(r13)     // Catch:{  }
                goto L_0x008e
            L_0x009e:
                java.lang.String r14 = "domain"
                boolean r14 = kotlin.text.StringsKt.B(r9, r14, r4)
                if (r14 == 0) goto L_0x00ad
                java.lang.String r10 = r0.f(r13)     // Catch:{ IllegalArgumentException -> 0x00cd }
                r20 = r3
                goto L_0x00cd
            L_0x00ad:
                java.lang.String r14 = "path"
                boolean r14 = kotlin.text.StringsKt.B(r9, r14, r4)
                if (r14 == 0) goto L_0x00b8
                r22 = r13
                goto L_0x00cd
            L_0x00b8:
                java.lang.String r13 = "secure"
                boolean r13 = kotlin.text.StringsKt.B(r9, r13, r4)
                if (r13 == 0) goto L_0x00c3
                r17 = r4
                goto L_0x00cd
            L_0x00c3:
                java.lang.String r13 = "httponly"
                boolean r9 = kotlin.text.StringsKt.B(r9, r13, r4)
                if (r9 == 0) goto L_0x00cd
                r18 = r4
            L_0x00cd:
                int r9 = r2 + 1
                r2 = 0
                goto L_0x0061
            L_0x00d1:
                r1 = -9223372036854775808
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x00d9
            L_0x00d7:
                r13 = r1
                goto L_0x010a
            L_0x00d9:
                int r1 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x0108
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x00eb
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r15 = r15 * r1
                goto L_0x00f0
            L_0x00eb:
                r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x00f0:
                long r15 = r26 + r15
                int r1 = (r15 > r26 ? 1 : (r15 == r26 ? 0 : -1))
                if (r1 < 0) goto L_0x0102
                r1 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 <= 0) goto L_0x0100
                goto L_0x00d7
            L_0x0100:
                r13 = r15
                goto L_0x010a
            L_0x0102:
                r1 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                goto L_0x00d7
            L_0x0108:
                r13 = r23
            L_0x010a:
                java.lang.String r1 = r28.i()
                if (r10 != 0) goto L_0x0113
                r15 = r1
                r2 = 0
                goto L_0x011d
            L_0x0113:
                boolean r2 = r0.b(r1, r10)
                if (r2 != 0) goto L_0x011b
                r2 = 0
                return r2
            L_0x011b:
                r2 = 0
                r15 = r10
            L_0x011d:
                int r1 = r1.length()
                int r4 = r15.length()
                if (r1 == r4) goto L_0x0134
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f43233e
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.c()
                java.lang.String r1 = r1.c(r15)
                if (r1 != 0) goto L_0x0134
                return r2
            L_0x0134:
                java.lang.String r1 = "/"
                r4 = r22
                if (r4 == 0) goto L_0x0145
                r5 = 2
                boolean r2 = kotlin.text.StringsKt.Q(r4, r1, r3, r5, r2)
                if (r2 != 0) goto L_0x0142
                goto L_0x0145
            L_0x0142:
                r16 = r4
                goto L_0x0161
            L_0x0145:
                java.lang.String r2 = r28.d()
                r9 = 6
                r10 = 0
                r6 = 47
                r7 = 0
                r8 = 0
                r5 = r2
                int r4 = kotlin.text.StringsKt.p0(r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x015f
                java.lang.String r1 = r2.substring(r3, r4)
                java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.h(r1, r2)
            L_0x015f:
                r16 = r1
            L_0x0161:
                okhttp3.Cookie r1 = new okhttp3.Cookie
                r21 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.d(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        public final List e(HttpUrl httpUrl, Headers headers) {
            Intrinsics.i(httpUrl, "url");
            Intrinsics.i(headers, "headers");
            List p2 = headers.p("Set-Cookie");
            int size = p2.size();
            ArrayList arrayList = null;
            for (int i2 = 0; i2 < size; i2++) {
                Cookie c2 = c(httpUrl, (String) p2.get(i2));
                if (c2 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c2);
                }
            }
            if (arrayList == null) {
                return CollectionsKt.m();
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.h(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }

        public final String f(String str) {
            if (!StringsKt.A(str, ".", false, 2, (Object) null)) {
                String e2 = HostnamesKt.e(StringsKt.D0(str, "."));
                if (e2 != null) {
                    return e2;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        public final long g(String str, int i2, int i3) {
            String str2 = str;
            int i4 = i3;
            int a2 = a(str2, i2, i4, false);
            Matcher matcher = Cookie.f42613n.matcher(str2);
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            while (a2 < i4) {
                int a3 = a(str2, a2 + 1, i4, true);
                matcher.region(a2, a3);
                if (i6 == -1 && matcher.usePattern(Cookie.f42613n).matches()) {
                    String group = matcher.group(1);
                    Intrinsics.h(group, "matcher.group(1)");
                    i6 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    Intrinsics.h(group2, "matcher.group(2)");
                    i9 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    Intrinsics.h(group3, "matcher.group(3)");
                    i10 = Integer.parseInt(group3);
                } else if (i7 == -1 && matcher.usePattern(Cookie.f42612m).matches()) {
                    String group4 = matcher.group(1);
                    Intrinsics.h(group4, "matcher.group(1)");
                    i7 = Integer.parseInt(group4);
                } else if (i8 == -1 && matcher.usePattern(Cookie.f42611l).matches()) {
                    String group5 = matcher.group(1);
                    Intrinsics.h(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    Intrinsics.h(locale, "US");
                    String lowerCase = group5.toLowerCase(locale);
                    Intrinsics.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = Cookie.f42611l.pattern();
                    Intrinsics.h(pattern, "MONTH_PATTERN.pattern()");
                    i8 = StringsKt.j0(pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i5 == -1 && matcher.usePattern(Cookie.f42610k).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.h(group6, "matcher.group(1)");
                    i5 = Integer.parseInt(group6);
                }
                a2 = a(str2, a3 + 1, i4, false);
            }
            if (70 <= i5 && i5 < 100) {
                i5 += 1900;
            }
            if (i5 >= 0 && i5 < 70) {
                i5 += 2000;
            }
            if (i5 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i8 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (1 > i7 || i7 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i6 < 0 || i6 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i9 < 0 || i9 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i10 < 0 || i10 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            } else {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.f42803f);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i5);
                gregorianCalendar.set(2, i8 - 1);
                gregorianCalendar.set(5, i7);
                gregorianCalendar.set(11, i6);
                gregorianCalendar.set(12, i9);
                gregorianCalendar.set(13, i10);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
        }

        public final long h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e2) {
                if (new Regex("-?\\d+").d(str)) {
                    return StringsKt.Q(str, "-", false, 2, (Object) null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e2;
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j2, str3, str4, z2, z3, z4, z5);
    }

    public final String e() {
        return this.f42614a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            return Intrinsics.d(cookie.f42614a, this.f42614a) && Intrinsics.d(cookie.f42615b, this.f42615b) && cookie.f42616c == this.f42616c && Intrinsics.d(cookie.f42617d, this.f42617d) && Intrinsics.d(cookie.f42618e, this.f42618e) && cookie.f42619f == this.f42619f && cookie.f42620g == this.f42620g && cookie.f42621h == this.f42621h && cookie.f42622i == this.f42622i;
        }
    }

    public final String f(boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f42614a);
        sb.append('=');
        sb.append(this.f42615b);
        if (this.f42621h) {
            if (this.f42616c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.b(new Date(this.f42616c)));
            }
        }
        if (!this.f42622i) {
            sb.append("; domain=");
            if (z2) {
                sb.append(".");
            }
            sb.append(this.f42617d);
        }
        sb.append("; path=");
        sb.append(this.f42618e);
        if (this.f42619f) {
            sb.append("; secure");
        }
        if (this.f42620g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString()");
        return sb2;
    }

    public final String g() {
        return this.f42615b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f42614a.hashCode()) * 31) + this.f42615b.hashCode()) * 31) + Long.hashCode(this.f42616c)) * 31) + this.f42617d.hashCode()) * 31) + this.f42618e.hashCode()) * 31) + Boolean.hashCode(this.f42619f)) * 31) + Boolean.hashCode(this.f42620g)) * 31) + Boolean.hashCode(this.f42621h)) * 31) + Boolean.hashCode(this.f42622i);
    }

    public String toString() {
        return f(false);
    }

    public Cookie(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f42614a = str;
        this.f42615b = str2;
        this.f42616c = j2;
        this.f42617d = str3;
        this.f42618e = str4;
        this.f42619f = z2;
        this.f42620g = z3;
        this.f42621h = z4;
        this.f42622i = z5;
    }
}
