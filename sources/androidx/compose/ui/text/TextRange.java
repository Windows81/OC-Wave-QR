package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TextRange {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18496b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f18497c = TextRangeKt.a(0);

    /* renamed from: a  reason: collision with root package name */
    public final long f18498a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return TextRange.f18497c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextRange(long j2) {
        this.f18498a = j2;
    }

    public static final /* synthetic */ TextRange b(long j2) {
        return new TextRange(j2);
    }

    public static long c(long j2) {
        return j2;
    }

    public static final boolean d(long j2, long j3) {
        boolean z2 = false;
        boolean z3 = l(j2) <= l(j3);
        if (k(j3) <= k(j2)) {
            z2 = true;
        }
        return z3 & z2;
    }

    public static final boolean e(long j2, int i2) {
        return i2 < k(j2) && l(j2) <= i2;
    }

    public static boolean f(long j2, Object obj) {
        return (obj instanceof TextRange) && j2 == ((TextRange) obj).r();
    }

    public static final boolean g(long j2, long j3) {
        return j2 == j3;
    }

    public static final boolean h(long j2) {
        return n(j2) == i(j2);
    }

    public static final int i(long j2) {
        return (int) (j2 & 4294967295L);
    }

    public static final int j(long j2) {
        return k(j2) - l(j2);
    }

    public static final int k(long j2) {
        return Math.max(n(j2), i(j2));
    }

    public static final int l(long j2) {
        return Math.min(n(j2), i(j2));
    }

    public static final boolean m(long j2) {
        return n(j2) > i(j2);
    }

    public static final int n(long j2) {
        return (int) (j2 >> 32);
    }

    public static int o(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean p(long j2, long j3) {
        boolean z2 = false;
        boolean z3 = l(j2) < k(j3);
        if (l(j3) < k(j2)) {
            z2 = true;
        }
        return z3 & z2;
    }

    public static String q(long j2) {
        return "TextRange(" + n(j2) + ", " + i(j2) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f18498a, obj);
    }

    public int hashCode() {
        return o(this.f18498a);
    }

    public final /* synthetic */ long r() {
        return this.f18498a;
    }

    public String toString() {
        return q(this.f18498a);
    }
}
