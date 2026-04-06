package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class ScaleFactor {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f17151b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f17152c = a((((long) Float.floatToRawIntBits(Float.NaN)) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L));

    /* renamed from: a  reason: collision with root package name */
    public final long f17153a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static long a(long j2) {
        return j2;
    }

    public static boolean b(long j2, Object obj) {
        return (obj instanceof ScaleFactor) && j2 == ((ScaleFactor) obj).g();
    }

    public static final float c(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float d(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static int e(long j2) {
        return Long.hashCode(j2);
    }

    public static String f(long j2) {
        return "ScaleFactor(" + Float.intBitsToFloat((int) (j2 >> 32)) + ", " + Float.intBitsToFloat((int) (j2 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return b(this.f17153a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f17153a;
    }

    public int hashCode() {
        return e(this.f17153a);
    }

    public String toString() {
        return f(this.f17153a);
    }
}
