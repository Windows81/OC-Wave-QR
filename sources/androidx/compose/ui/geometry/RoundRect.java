package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class RoundRect {

    /* renamed from: i  reason: collision with root package name */
    public static final Companion f15866i = new Companion((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final RoundRect f15867j = RoundRectKt.d(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.f15848b.a());

    /* renamed from: a  reason: collision with root package name */
    public final float f15868a;

    /* renamed from: b  reason: collision with root package name */
    public final float f15869b;

    /* renamed from: c  reason: collision with root package name */
    public final float f15870c;

    /* renamed from: d  reason: collision with root package name */
    public final float f15871d;

    /* renamed from: e  reason: collision with root package name */
    public final long f15872e;

    /* renamed from: f  reason: collision with root package name */
    public final long f15873f;

    /* renamed from: g  reason: collision with root package name */
    public final long f15874g;

    /* renamed from: h  reason: collision with root package name */
    public final long f15875h;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, j2, j3, j4, j5);
    }

    public final float a() {
        return this.f15871d;
    }

    public final long b() {
        return this.f15875h;
    }

    public final long c() {
        return this.f15874g;
    }

    public final float d() {
        return this.f15871d - this.f15869b;
    }

    public final float e() {
        return this.f15868a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.f15868a, roundRect.f15868a) == 0 && Float.compare(this.f15869b, roundRect.f15869b) == 0 && Float.compare(this.f15870c, roundRect.f15870c) == 0 && Float.compare(this.f15871d, roundRect.f15871d) == 0 && CornerRadius.d(this.f15872e, roundRect.f15872e) && CornerRadius.d(this.f15873f, roundRect.f15873f) && CornerRadius.d(this.f15874g, roundRect.f15874g) && CornerRadius.d(this.f15875h, roundRect.f15875h);
    }

    public final float f() {
        return this.f15870c;
    }

    public final float g() {
        return this.f15869b;
    }

    public final long h() {
        return this.f15872e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f15868a) * 31) + Float.hashCode(this.f15869b)) * 31) + Float.hashCode(this.f15870c)) * 31) + Float.hashCode(this.f15871d)) * 31) + CornerRadius.e(this.f15872e)) * 31) + CornerRadius.e(this.f15873f)) * 31) + CornerRadius.e(this.f15874g)) * 31) + CornerRadius.e(this.f15875h);
    }

    public final long i() {
        return this.f15873f;
    }

    public final float j() {
        return this.f15870c - this.f15868a;
    }

    public String toString() {
        long j2 = this.f15872e;
        long j3 = this.f15873f;
        long j4 = this.f15874g;
        long j5 = this.f15875h;
        String str = GeometryUtilsKt.a(this.f15868a, 1) + ", " + GeometryUtilsKt.a(this.f15869b, 1) + ", " + GeometryUtilsKt.a(this.f15870c, 1) + ", " + GeometryUtilsKt.a(this.f15871d, 1);
        if (!CornerRadius.d(j2, j3) || !CornerRadius.d(j3, j4) || !CornerRadius.d(j4, j5)) {
            return "RoundRect(rect=" + str + ", topLeft=" + CornerRadius.f(j2) + ", topRight=" + CornerRadius.f(j3) + ", bottomRight=" + CornerRadius.f(j4) + ", bottomLeft=" + CornerRadius.f(j5) + ')';
        }
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.a(Float.intBitsToFloat(i2), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.a(Float.intBitsToFloat(i2), 1) + ", y=" + GeometryUtilsKt.a(Float.intBitsToFloat(i3), 1) + ')';
    }

    public RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5) {
        this.f15868a = f2;
        this.f15869b = f3;
        this.f15870c = f4;
        this.f15871d = f5;
        this.f15872e = j2;
        this.f15873f = j3;
        this.f15874g = j4;
        this.f15875h = j5;
    }
}
