package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class CacheControl {

    /* renamed from: n  reason: collision with root package name */
    public static final Companion f42528n = new Companion((DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    public static final CacheControl f42529o = new Builder().d().a();

    /* renamed from: p  reason: collision with root package name */
    public static final CacheControl f42530p = new Builder().f().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f42531a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f42532b;

    /* renamed from: c  reason: collision with root package name */
    public final int f42533c;

    /* renamed from: d  reason: collision with root package name */
    public final int f42534d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f42535e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f42536f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f42537g;

    /* renamed from: h  reason: collision with root package name */
    public final int f42538h;

    /* renamed from: i  reason: collision with root package name */
    public final int f42539i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f42540j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f42541k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f42542l;

    /* renamed from: m  reason: collision with root package name */
    public String f42543m;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f42544a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f42545b;

        /* renamed from: c  reason: collision with root package name */
        public int f42546c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f42547d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f42548e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f42549f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f42550g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f42551h;

        public final CacheControl a() {
            return new CacheControl(this.f42544a, this.f42545b, this.f42546c, -1, false, false, false, this.f42547d, this.f42548e, this.f42549f, this.f42550g, this.f42551h, (String) null, (DefaultConstructorMarker) null);
        }

        public final int b(long j2) {
            if (j2 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j2;
        }

        public final Builder c(int i2, TimeUnit timeUnit) {
            Intrinsics.i(timeUnit, "timeUnit");
            if (i2 >= 0) {
                this.f42547d = b(timeUnit.toSeconds((long) i2));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i2).toString());
        }

        public final Builder d() {
            this.f42544a = true;
            return this;
        }

        public final Builder e() {
            this.f42545b = true;
            return this;
        }

        public final Builder f() {
            this.f42549f = true;
            return this;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(String str, String str2, int i2) {
            int length = str.length();
            while (i2 < length) {
                if (StringsKt.V(str2, str.charAt(i2), false, 2, (Object) null)) {
                    return i2;
                }
                i2++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.CacheControl b(okhttp3.Headers r31) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.Intrinsics.i(r1, r2)
                int r2 = r31.size()
                r5 = 1
                r8 = r5
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0183
                java.lang.String r3 = r1.h(r7)
                java.lang.String r6 = r1.o(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = kotlin.text.StringsKt.B(r3, r4, r5)
                if (r4 == 0) goto L_0x003b
                if (r9 == 0) goto L_0x0039
            L_0x0037:
                r8 = 0
                goto L_0x0044
            L_0x0039:
                r9 = r6
                goto L_0x0044
            L_0x003b:
                java.lang.String r4 = "Pragma"
                boolean r3 = kotlin.text.StringsKt.B(r3, r4, r5)
                if (r3 == 0) goto L_0x0178
                goto L_0x0037
            L_0x0044:
                r3 = 0
            L_0x0045:
                int r4 = r6.length()
                if (r3 >= r4) goto L_0x0178
                java.lang.String r4 = "=,;"
                int r4 = r0.a(r6, r4, r3)
                java.lang.String r3 = r6.substring(r3, r4)
                java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.h(r3, r5)
                java.lang.CharSequence r3 = kotlin.text.StringsKt.f1(r3)
                java.lang.String r3 = r3.toString()
                int r1 = r6.length()
                if (r4 == r1) goto L_0x00c1
                char r1 = r6.charAt(r4)
                r29 = r2
                r2 = 44
                if (r1 == r2) goto L_0x00c3
                char r1 = r6.charAt(r4)
                r2 = 59
                if (r1 != r2) goto L_0x007b
                goto L_0x00c3
            L_0x007b:
                int r4 = r4 + 1
                int r1 = okhttp3.internal.Util.D(r6, r4)
                int r2 = r6.length()
                if (r1 >= r2) goto L_0x00ab
                char r2 = r6.charAt(r1)
                r4 = 34
                if (r2 != r4) goto L_0x00ab
                int r1 = r1 + 1
                r27 = 4
                r28 = 0
                r24 = 34
                r26 = 0
                r23 = r6
                r25 = r1
                int r2 = kotlin.text.StringsKt.i0(r23, r24, r25, r26, r27, r28)
                java.lang.String r1 = r6.substring(r1, r2)
                kotlin.jvm.internal.Intrinsics.h(r1, r5)
                r4 = 1
                int r2 = r2 + r4
                goto L_0x00c7
            L_0x00ab:
                java.lang.String r2 = ",;"
                int r2 = r0.a(r6, r2, r1)
                java.lang.String r1 = r6.substring(r1, r2)
                kotlin.jvm.internal.Intrinsics.h(r1, r5)
                java.lang.CharSequence r1 = kotlin.text.StringsKt.f1(r1)
                java.lang.String r1 = r1.toString()
                goto L_0x00c7
            L_0x00c1:
                r29 = r2
            L_0x00c3:
                int r4 = r4 + 1
                r2 = r4
                r1 = 0
            L_0x00c7:
                java.lang.String r4 = "no-cache"
                r5 = 1
                boolean r4 = kotlin.text.StringsKt.B(r4, r3, r5)
                if (r4 == 0) goto L_0x00d8
                r1 = r31
                r3 = r2
                r10 = r5
            L_0x00d4:
                r2 = r29
                goto L_0x0045
            L_0x00d8:
                java.lang.String r4 = "no-store"
                boolean r4 = kotlin.text.StringsKt.B(r4, r3, r5)
                if (r4 == 0) goto L_0x00e5
                r1 = r31
                r3 = r2
                r11 = r5
                goto L_0x00d4
            L_0x00e5:
                java.lang.String r4 = "max-age"
                boolean r4 = kotlin.text.StringsKt.B(r4, r3, r5)
                if (r4 == 0) goto L_0x00f6
                r4 = -1
                int r12 = okhttp3.internal.Util.Y(r1, r4)
            L_0x00f2:
                r1 = r31
                r3 = r2
                goto L_0x00d4
            L_0x00f6:
                java.lang.String r4 = "s-maxage"
                boolean r4 = kotlin.text.StringsKt.B(r4, r3, r5)
                if (r4 == 0) goto L_0x0104
                r4 = -1
                int r13 = okhttp3.internal.Util.Y(r1, r4)
                goto L_0x00f2
            L_0x0104:
                java.lang.String r4 = "private"
                boolean r4 = kotlin.text.StringsKt.B(r4, r3, r5)
                if (r4 == 0) goto L_0x0111
                r1 = r31
                r3 = r2
                r14 = r5
                goto L_0x00d4
            L_0x0111:
                java.lang.String r4 = "public"
                boolean r4 = kotlin.text.StringsKt.B(r4, r3, r5)
                if (r4 == 0) goto L_0x011e
                r1 = r31
                r3 = r2
                r15 = r5
                goto L_0x00d4
            L_0x011e:
                java.lang.String r4 = "must-revalidate"
                boolean r4 = kotlin.text.StringsKt.B(r4, r3, r5)
                if (r4 == 0) goto L_0x012c
                r1 = r31
                r3 = r2
                r16 = r5
                goto L_0x00d4
            L_0x012c:
                java.lang.String r4 = "max-stale"
                boolean r4 = kotlin.text.StringsKt.B(r4, r3, r5)
                if (r4 == 0) goto L_0x013c
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r17 = okhttp3.internal.Util.Y(r1, r3)
                goto L_0x00f2
            L_0x013c:
                java.lang.String r4 = "min-fresh"
                boolean r4 = kotlin.text.StringsKt.B(r4, r3, r5)
                if (r4 == 0) goto L_0x014a
                r4 = -1
                int r18 = okhttp3.internal.Util.Y(r1, r4)
                goto L_0x00f2
            L_0x014a:
                r4 = -1
                java.lang.String r1 = "only-if-cached"
                boolean r1 = kotlin.text.StringsKt.B(r1, r3, r5)
                if (r1 == 0) goto L_0x015a
                r1 = r31
                r3 = r2
                r19 = r5
                goto L_0x00d4
            L_0x015a:
                java.lang.String r1 = "no-transform"
                boolean r1 = kotlin.text.StringsKt.B(r1, r3, r5)
                if (r1 == 0) goto L_0x0169
                r1 = r31
                r3 = r2
                r20 = r5
                goto L_0x00d4
            L_0x0169:
                java.lang.String r1 = "immutable"
                boolean r1 = kotlin.text.StringsKt.B(r1, r3, r5)
                if (r1 == 0) goto L_0x00f2
                r1 = r31
                r3 = r2
                r21 = r5
                goto L_0x00d4
            L_0x0178:
                r29 = r2
                r4 = -1
                int r7 = r7 + 1
                r1 = r31
                r2 = r29
                goto L_0x0023
            L_0x0183:
                if (r8 != 0) goto L_0x0188
                r22 = 0
                goto L_0x018a
            L_0x0188:
                r22 = r9
            L_0x018a:
                okhttp3.CacheControl r1 = new okhttp3.CacheControl
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.b(okhttp3.Headers):okhttp3.CacheControl");
        }

        public Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z3, i2, i3, z4, z5, z6, i4, i5, z7, z8, z9, str);
    }

    public final boolean a() {
        return this.f42535e;
    }

    public final boolean b() {
        return this.f42536f;
    }

    public final int c() {
        return this.f42533c;
    }

    public final int d() {
        return this.f42538h;
    }

    public final int e() {
        return this.f42539i;
    }

    public final boolean f() {
        return this.f42537g;
    }

    public final boolean g() {
        return this.f42531a;
    }

    public final boolean h() {
        return this.f42532b;
    }

    public final boolean i() {
        return this.f42540j;
    }

    public String toString() {
        String str = this.f42543m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f42531a) {
            sb.append("no-cache, ");
        }
        if (this.f42532b) {
            sb.append("no-store, ");
        }
        if (this.f42533c != -1) {
            sb.append("max-age=");
            sb.append(this.f42533c);
            sb.append(", ");
        }
        if (this.f42534d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f42534d);
            sb.append(", ");
        }
        if (this.f42535e) {
            sb.append("private, ");
        }
        if (this.f42536f) {
            sb.append("public, ");
        }
        if (this.f42537g) {
            sb.append("must-revalidate, ");
        }
        if (this.f42538h != -1) {
            sb.append("max-stale=");
            sb.append(this.f42538h);
            sb.append(", ");
        }
        if (this.f42539i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f42539i);
            sb.append(", ");
        }
        if (this.f42540j) {
            sb.append("only-if-cached, ");
        }
        if (this.f42541k) {
            sb.append("no-transform, ");
        }
        if (this.f42542l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f42543m = sb2;
        return sb2;
    }

    public CacheControl(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str) {
        this.f42531a = z2;
        this.f42532b = z3;
        this.f42533c = i2;
        this.f42534d = i3;
        this.f42535e = z4;
        this.f42536f = z5;
        this.f42537g = z6;
        this.f42538h = i4;
        this.f42539i = i5;
        this.f42540j = z7;
        this.f42541k = z8;
        this.f42542l = z9;
        this.f42543m = str;
    }
}
