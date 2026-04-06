package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class ColorModel {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16164b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f16165c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f16166d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f16167e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f16168f;

    /* renamed from: a  reason: collision with root package name */
    public final long f16169a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return ColorModel.f16167e;
        }

        public final long b() {
            return ColorModel.f16165c;
        }

        public final long c() {
            return ColorModel.f16166d;
        }

        public Companion() {
        }
    }

    static {
        long j2 = (long) 3;
        long j3 = j2 << 32;
        f16165c = d((((long) 0) & 4294967295L) | j3);
        f16166d = d((((long) 1) & 4294967295L) | j3);
        f16167e = d(j3 | (((long) 2) & 4294967295L));
        f16168f = d((j2 & 4294967295L) | (((long) 4) << 32));
    }

    public static long d(long j2) {
        return j2;
    }

    public static boolean e(long j2, Object obj) {
        return (obj instanceof ColorModel) && j2 == ((ColorModel) obj).j();
    }

    public static final boolean f(long j2, long j3) {
        return j2 == j3;
    }

    public static final int g(long j2) {
        return (int) (j2 >> 32);
    }

    public static int h(long j2) {
        return Long.hashCode(j2);
    }

    public static String i(long j2) {
        return f(j2, f16165c) ? "Rgb" : f(j2, f16166d) ? "Xyz" : f(j2, f16167e) ? "Lab" : f(j2, f16168f) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f16169a, obj);
    }

    public int hashCode() {
        return h(this.f16169a);
    }

    public final /* synthetic */ long j() {
        return this.f16169a;
    }

    public String toString() {
        return i(this.f16169a);
    }
}
