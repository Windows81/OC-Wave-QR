package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class TransformGestureDetectorKt {
    public static final float a(long j2) {
        int i2 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i2) == 0.0f && Float.intBitsToFloat((int) (j2 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2((double) Float.intBitsToFloat(i2), (double) Float.intBitsToFloat((int) (j2 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long b(PointerEvent pointerEvent, boolean z2) {
        long c2 = Offset.f15855b.c();
        List c3 = pointerEvent.c();
        int size = c3.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = (PointerInputChange) c3.get(i3);
            if (pointerInputChange.i() && pointerInputChange.l()) {
                c2 = Offset.q(c2, z2 ? pointerInputChange.h() : pointerInputChange.k());
                i2++;
            }
        }
        return i2 == 0 ? Offset.f15855b.b() : Offset.h(c2, (float) i2);
    }

    public static final float c(PointerEvent pointerEvent, boolean z2) {
        long b2 = b(pointerEvent, z2);
        float f2 = 0.0f;
        if (Offset.j(b2, Offset.f15855b.b())) {
            return 0.0f;
        }
        List c2 = pointerEvent.c();
        int size = c2.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = (PointerInputChange) c2.get(i3);
            if (pointerInputChange.i() && pointerInputChange.l()) {
                f2 += Offset.k(Offset.p(z2 ? pointerInputChange.h() : pointerInputChange.k(), b2));
                i2++;
            }
        }
        return f2 / ((float) i2);
    }

    public static final long d(PointerEvent pointerEvent) {
        long b2 = b(pointerEvent, true);
        Offset.Companion companion = Offset.f15855b;
        return Offset.j(b2, companion.b()) ? companion.c() : Offset.p(b2, b(pointerEvent, false));
    }

    public static final float e(PointerEvent pointerEvent) {
        List c2 = pointerEvent.c();
        int size = c2.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) c2.get(i2);
            if (!pointerInputChange.l() || !pointerInputChange.i()) {
                i4 = 0;
            }
            i3 += i4;
            i2++;
        }
        if (i3 < 2) {
            return 0.0f;
        }
        long b2 = b(pointerEvent, true);
        long b3 = b(pointerEvent, false);
        List c3 = pointerEvent.c();
        int size2 = c3.size();
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i5 = 0; i5 < size2; i5++) {
            PointerInputChange pointerInputChange2 = (PointerInputChange) c3.get(i5);
            if (pointerInputChange2.i() && pointerInputChange2.l()) {
                long h2 = pointerInputChange2.h();
                long p2 = Offset.p(pointerInputChange2.k(), b3);
                long p3 = Offset.p(h2, b2);
                float a2 = a(p3) - a(p2);
                float k2 = Offset.k(Offset.q(p3, p2)) / 2.0f;
                if (a2 > 180.0f) {
                    a2 -= 360.0f;
                } else if (a2 < -180.0f) {
                    a2 += 360.0f;
                }
                f3 += a2 * k2;
                f2 += k2;
            }
        }
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f3 / f2;
    }

    public static final float f(PointerEvent pointerEvent) {
        float c2 = c(pointerEvent, true);
        float c3 = c(pointerEvent, false);
        if (c2 == 0.0f || c3 == 0.0f) {
            return 1.0f;
        }
        return c2 / c3;
    }
}
