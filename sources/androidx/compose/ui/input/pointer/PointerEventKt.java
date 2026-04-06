package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

@Metadata
public final class PointerEventKt {
    public static final boolean a(PointerInputChange pointerInputChange) {
        return !pointerInputChange.p() && !pointerInputChange.l() && pointerInputChange.i();
    }

    public static final boolean b(PointerInputChange pointerInputChange) {
        return !pointerInputChange.l() && pointerInputChange.i();
    }

    public static final boolean c(PointerInputChange pointerInputChange) {
        return !pointerInputChange.p() && pointerInputChange.l() && !pointerInputChange.i();
    }

    public static final boolean d(PointerInputChange pointerInputChange) {
        return pointerInputChange.l() && !pointerInputChange.i();
    }

    public static final boolean e(PointerInputChange pointerInputChange, long j2) {
        long h2 = pointerInputChange.h();
        float intBitsToFloat = Float.intBitsToFloat((int) (h2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (h2 & 4294967295L));
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        boolean z2 = false;
        boolean z3 = (intBitsToFloat > ((float) i2)) | (intBitsToFloat < 0.0f) | (intBitsToFloat2 < 0.0f);
        if (intBitsToFloat2 > ((float) i3)) {
            z2 = true;
        }
        return z3 | z2;
    }

    public static final boolean f(PointerInputChange pointerInputChange, long j2, long j3) {
        boolean h2 = PointerType.h(pointerInputChange.n(), PointerType.f16933b.d());
        long h3 = pointerInputChange.h();
        float intBitsToFloat = Float.intBitsToFloat((int) (h3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (h3 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
        float f2 = h2 ? 1.0f : 0.0f;
        float f3 = intBitsToFloat3 * f2;
        float f4 = ((float) ((int) (j2 >> 32))) + f3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f2;
        float f5 = ((float) ((int) (j2 & 4294967295L))) + intBitsToFloat4;
        boolean z2 = false;
        boolean z3 = (intBitsToFloat > f4) | (intBitsToFloat < (-f3)) | (intBitsToFloat2 < (-intBitsToFloat4));
        if (intBitsToFloat2 > f5) {
            z2 = true;
        }
        return z3 | z2;
    }

    public static final long g(PointerInputChange pointerInputChange) {
        return i(pointerInputChange, false);
    }

    public static final long h(PointerInputChange pointerInputChange) {
        return i(pointerInputChange, true);
    }

    public static final long i(PointerInputChange pointerInputChange, boolean z2) {
        long p2 = Offset.p(pointerInputChange.h(), pointerInputChange.k());
        return (z2 || !pointerInputChange.p()) ? p2 : Offset.f15855b.c();
    }

    public static final boolean j(PointerInputChange pointerInputChange) {
        return !Offset.j(i(pointerInputChange, false), Offset.f15855b.c());
    }

    public static final boolean k(PointerInputChange pointerInputChange) {
        return !Offset.j(i(pointerInputChange, true), Offset.f15855b.c());
    }
}
