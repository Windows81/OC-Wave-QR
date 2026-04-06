package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JvmInline
@Metadata
public final class Dp implements Comparable<Dp> {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f19144A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final float f19145B = m(0.0f);
    public static final float C = m(Float.POSITIVE_INFINITY);
    public static final float D = m(Float.NaN);

    /* renamed from: z  reason: collision with root package name */
    public final float f19146z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return Dp.f19145B;
        }

        public final float b() {
            return Dp.C;
        }

        public final float c() {
            return Dp.D;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Dp(float f2) {
        this.f19146z = f2;
    }

    public static final /* synthetic */ Dp j(float f2) {
        return new Dp(f2);
    }

    public static int l(float f2, float f3) {
        return Float.compare(f2, f3);
    }

    public static float m(float f2) {
        return f2;
    }

    public static boolean n(float f2, Object obj) {
        return (obj instanceof Dp) && Float.compare(f2, ((Dp) obj).t()) == 0;
    }

    public static final boolean o(float f2, float f3) {
        return Float.compare(f2, f3) == 0;
    }

    public static int p(float f2) {
        return Float.hashCode(f2);
    }

    public static String r(float f2) {
        if (Float.isNaN(f2)) {
            return "Dp.Unspecified";
        }
        return f2 + ".dp";
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return k(((Dp) obj).t());
    }

    public boolean equals(Object obj) {
        return n(this.f19146z, obj);
    }

    public int hashCode() {
        return p(this.f19146z);
    }

    public int k(float f2) {
        return l(this.f19146z, f2);
    }

    public final /* synthetic */ float t() {
        return this.f19146z;
    }

    public String toString() {
        return r(this.f19146z);
    }
}
