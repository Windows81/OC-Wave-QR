package androidx.compose.foundation.shape;

import kotlin.Metadata;

@Metadata
public final class RoundedCornerShapeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final RoundedCornerShape f5459a = b(50);

    public static final RoundedCornerShape a(float f2, float f3, float f4, float f5) {
        return new RoundedCornerShape(CornerSizeKt.a(f2), CornerSizeKt.a(f3), CornerSizeKt.a(f4), CornerSizeKt.a(f5));
    }

    public static final RoundedCornerShape b(int i2) {
        return c(CornerSizeKt.b(i2));
    }

    public static final RoundedCornerShape c(CornerSize cornerSize) {
        return new RoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static final RoundedCornerShape d(float f2) {
        return c(CornerSizeKt.c(f2));
    }

    public static final RoundedCornerShape e(float f2, float f3, float f4, float f5) {
        return new RoundedCornerShape(CornerSizeKt.c(f2), CornerSizeKt.c(f3), CornerSizeKt.c(f4), CornerSizeKt.c(f5));
    }

    public static final RoundedCornerShape f() {
        return f5459a;
    }
}
