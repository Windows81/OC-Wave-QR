package androidx.compose.ui.unit;

import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TextUnit {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19177b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final TextUnitType[] f19178c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f19179d = TextUnitKt.k(0, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    public final long f19180a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return TextUnit.f19179d;
        }

        public Companion() {
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.f19181b;
        f19178c = new TextUnitType[]{TextUnitType.d(companion.c()), TextUnitType.d(companion.b()), TextUnitType.d(companion.a())};
    }

    public /* synthetic */ TextUnit(long j2) {
        this.f19180a = j2;
    }

    public static final /* synthetic */ TextUnit b(long j2) {
        return new TextUnit(j2);
    }

    public static long c(long j2) {
        return j2;
    }

    public static boolean d(long j2, Object obj) {
        return (obj instanceof TextUnit) && j2 == ((TextUnit) obj).m();
    }

    public static final boolean e(long j2, long j3) {
        return j2 == j3;
    }

    public static final long f(long j2) {
        return j2 & 1095216660480L;
    }

    public static final long g(long j2) {
        return f19178c[(int) (f(j2) >>> 32)].j();
    }

    public static final float h(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static int i(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean j(long j2) {
        return f(j2) == 8589934592L;
    }

    public static final boolean k(long j2) {
        return f(j2) == 4294967296L;
    }

    public static String l(long j2) {
        long g2 = g(j2);
        TextUnitType.Companion companion = TextUnitType.f19181b;
        if (TextUnitType.g(g2, companion.c())) {
            return "Unspecified";
        }
        if (TextUnitType.g(g2, companion.b())) {
            return h(j2) + ".sp";
        } else if (!TextUnitType.g(g2, companion.a())) {
            return "Invalid";
        } else {
            return h(j2) + ".em";
        }
    }

    public boolean equals(Object obj) {
        return d(this.f19180a, obj);
    }

    public int hashCode() {
        return i(this.f19180a);
    }

    public final /* synthetic */ long m() {
        return this.f19180a;
    }

    public String toString() {
        return l(this.f19180a);
    }
}
