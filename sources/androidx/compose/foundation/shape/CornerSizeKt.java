package androidx.compose.foundation.shape;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class CornerSizeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final CornerSize f5454a = new CornerSizeKt$ZeroCornerSize$1();

    public static final CornerSize a(float f2) {
        return new PxCornerSize(f2);
    }

    public static final CornerSize b(int i2) {
        return new PercentCornerSize((float) i2);
    }

    public static final CornerSize c(float f2) {
        return new DpCornerSize(f2, (DefaultConstructorMarker) null);
    }

    public static final CornerSize d() {
        return f5454a;
    }
}
