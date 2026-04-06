package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class RoundRectKt {
    public static final RoundRect a(float f2, float f3, float f4, float f5, float f6, float f7) {
        long b2 = CornerRadius.b((((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L));
        return new RoundRect(f2, f3, f4, f5, b2, b2, b2, b2, (DefaultConstructorMarker) null);
    }

    public static final RoundRect b(Rect rect, float f2, float f3) {
        return a(rect.o(), rect.r(), rect.p(), rect.i(), f2, f3);
    }

    public static final RoundRect c(Rect rect, long j2, long j3, long j4, long j5) {
        return new RoundRect(rect.o(), rect.r(), rect.p(), rect.i(), j2, j3, j4, j5, (DefaultConstructorMarker) null);
    }

    public static final RoundRect d(float f2, float f3, float f4, float f5, long j2) {
        return a(f2, f3, f4, f5, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final RoundRect e(Rect rect, long j2) {
        return b(rect, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final Rect f(RoundRect roundRect) {
        return new Rect(roundRect.e(), roundRect.g(), roundRect.f(), roundRect.a());
    }

    public static final boolean g(RoundRect roundRect) {
        long h2 = roundRect.h();
        return (h2 >>> 32) == (h2 & 4294967295L) && roundRect.h() == roundRect.i() && roundRect.h() == roundRect.c() && roundRect.h() == roundRect.b();
    }
}
