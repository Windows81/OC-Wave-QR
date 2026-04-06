package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class SliderRange {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f11132b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f11133c = SliderKt.b(Float.NaN, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    public final long f11134a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return SliderRange.f11133c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ SliderRange(long j2) {
        this.f11134a = j2;
    }

    public static final /* synthetic */ SliderRange b(long j2) {
        return new SliderRange(j2);
    }

    public static long c(long j2) {
        return j2;
    }

    public static boolean d(long j2, Object obj) {
        return (obj instanceof SliderRange) && j2 == ((SliderRange) obj).j();
    }

    public static final boolean e(long j2, long j3) {
        return j2 == j3;
    }

    public static final float f(long j2) {
        if (j2 != f11133c) {
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    public static final float g(long j2) {
        if (j2 != f11133c) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    public static int h(long j2) {
        return Long.hashCode(j2);
    }

    public static String i(long j2) {
        if (!SliderKt.q(j2)) {
            return "FloatRange.Unspecified";
        }
        return g(j2) + ".." + f(j2);
    }

    public boolean equals(Object obj) {
        return d(this.f11134a, obj);
    }

    public int hashCode() {
        return h(this.f11134a);
    }

    public final /* synthetic */ long j() {
        return this.f11134a;
    }

    public String toString() {
        return i(this.f11134a);
    }
}
