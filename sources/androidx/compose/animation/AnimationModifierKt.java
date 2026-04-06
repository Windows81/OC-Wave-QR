package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

@Metadata
public final class AnimationModifierKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long f2150a;

    static {
        long j2 = (long) Integer.MIN_VALUE;
        f2150a = IntSize.c((j2 & 4294967295L) | (j2 << 32));
    }

    public static final long a() {
        return f2150a;
    }

    public static final boolean b(long j2) {
        return !IntSize.e(j2, f2150a);
    }
}
