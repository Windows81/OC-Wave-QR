package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;

@Metadata
public final class LayoutCoordinatesKt {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.compose.ui.layout.LayoutCoordinates.J(r0, r6, false, 2, (java.lang.Object) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.geometry.Rect a(androidx.compose.ui.layout.LayoutCoordinates r6) {
        /*
            androidx.compose.ui.layout.LayoutCoordinates r0 = r6.g0()
            if (r0 == 0) goto L_0x000f
            r1 = 2
            r2 = 0
            r3 = 0
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.ui.layout.LayoutCoordinates.J(r0, r6, r3, r1, r2)
            if (r0 != 0) goto L_0x002a
        L_0x000f:
            androidx.compose.ui.geometry.Rect r0 = new androidx.compose.ui.geometry.Rect
            long r1 = r6.a()
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            float r1 = (float) r1
            long r2 = r6.a()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r6 = (int) r2
            float r6 = (float) r6
            r2 = 0
            r0.<init>(r2, r2, r1, r6)
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LayoutCoordinatesKt.a(androidx.compose.ui.layout.LayoutCoordinates):androidx.compose.ui.geometry.Rect");
    }

    public static final Rect b(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.J(d(layoutCoordinates), layoutCoordinates, false, 2, (Object) null);
    }

    public static final Rect c(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates d2 = d(layoutCoordinates);
        float a2 = (float) ((int) (d2.a() >> 32));
        float a3 = (float) ((int) (d2.a() & 4294967295L));
        Rect J = LayoutCoordinates.J(d2, layoutCoordinates, false, 2, (Object) null);
        float o2 = J.o();
        float f2 = 0.0f;
        if (o2 < 0.0f) {
            o2 = 0.0f;
        }
        if (o2 > a2) {
            o2 = a2;
        }
        float r2 = J.r();
        if (r2 < 0.0f) {
            r2 = 0.0f;
        }
        if (r2 > a3) {
            r2 = a3;
        }
        float p2 = J.p();
        if (p2 < 0.0f) {
            p2 = 0.0f;
        }
        if (p2 <= a2) {
            a2 = p2;
        }
        float i2 = J.i();
        if (i2 >= 0.0f) {
            f2 = i2;
        }
        if (f2 <= a3) {
            a3 = f2;
        }
        if (o2 == a2 || r2 == a3) {
            return Rect.f15860e.a();
        }
        long G = d2.G(Offset.e((((long) Float.floatToRawIntBits(o2)) << 32) | (((long) Float.floatToRawIntBits(r2)) & 4294967295L)));
        long G2 = d2.G(Offset.e((((long) Float.floatToRawIntBits(r2)) & 4294967295L) | (((long) Float.floatToRawIntBits(a2)) << 32)));
        long G3 = d2.G(Offset.e((((long) Float.floatToRawIntBits(a2)) << 32) | (((long) Float.floatToRawIntBits(a3)) & 4294967295L)));
        long G4 = d2.G(Offset.e((((long) Float.floatToRawIntBits(a3)) & 4294967295L) | (((long) Float.floatToRawIntBits(o2)) << 32)));
        float intBitsToFloat = Float.intBitsToFloat((int) (G >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (G2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (G4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (G3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (G & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (G2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (G4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (G3 & 4294967295L));
        return new Rect(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final LayoutCoordinates d(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates g0 = layoutCoordinates.g0();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = g0;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            g0 = layoutCoordinates.g0();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator W2 = nodeCoordinator.W2();
        while (true) {
            NodeCoordinator nodeCoordinator2 = W2;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            W2 = nodeCoordinator.W2();
        }
    }

    public static final long e(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates g0 = layoutCoordinates.g0();
        return g0 != null ? g0.N(layoutCoordinates, Offset.f15855b.c()) : Offset.f15855b.c();
    }

    public static final long f(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.o0(Offset.f15855b.c());
    }

    public static final long g(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.G(Offset.f15855b.c());
    }

    public static final long h(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.f(Offset.f15855b.c());
    }
}
