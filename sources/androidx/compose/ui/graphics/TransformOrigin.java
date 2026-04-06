package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TransformOrigin {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16150b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f16151c = TransformOriginKt.a(0.5f, 0.5f);

    /* renamed from: a  reason: collision with root package name */
    public final long f16152a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return TransformOrigin.f16151c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TransformOrigin(long j2) {
        this.f16152a = j2;
    }

    public static final /* synthetic */ TransformOrigin b(long j2) {
        return new TransformOrigin(j2);
    }

    public static long c(long j2) {
        return j2;
    }

    public static boolean d(long j2, Object obj) {
        return (obj instanceof TransformOrigin) && j2 == ((TransformOrigin) obj).j();
    }

    public static final boolean e(long j2, long j3) {
        return j2 == j3;
    }

    public static final float f(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float g(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static int h(long j2) {
        return Long.hashCode(j2);
    }

    public static String i(long j2) {
        return "TransformOrigin(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f16152a, obj);
    }

    public int hashCode() {
        return h(this.f16152a);
    }

    public final /* synthetic */ long j() {
        return this.f16152a;
    }

    public String toString() {
        return i(this.f16152a);
    }
}
