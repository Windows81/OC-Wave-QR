package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

@Metadata
public final class IntRectKt {
    public static final IntRect a(long j2, long j3) {
        return new IntRect(IntOffset.k(j2), IntOffset.l(j2), IntOffset.k(j2) + ((int) (j3 >> 32)), IntOffset.l(j2) + ((int) (j3 & 4294967295L)));
    }

    public static final IntRect b(Rect rect) {
        return new IntRect(Math.round(rect.o()), Math.round(rect.r()), Math.round(rect.p()), Math.round(rect.i()));
    }
}
