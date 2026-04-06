package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

@Metadata
public final class PathParserKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f16607a = new float[0];

    public static final void a(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        double d11 = d4;
        double d12 = (double) 4;
        int ceil = (int) Math.ceil(Math.abs((d10 * d12) / 3.141592653589793d));
        double cos = Math.cos(d8);
        double sin = Math.sin(d8);
        double cos2 = Math.cos(d9);
        double sin2 = Math.sin(d9);
        double d13 = -d11;
        double d14 = d13 * cos;
        double d15 = d5 * sin;
        double d16 = (d14 * sin2) - (d15 * cos2);
        double d17 = d13 * sin;
        double d18 = d5 * cos;
        double d19 = (sin2 * d17) + (cos2 * d18);
        double d20 = d10 / ((double) ceil);
        double d21 = d6;
        double d22 = d19;
        double d23 = d16;
        int i2 = 0;
        double d24 = d7;
        double d25 = d9;
        while (i2 < ceil) {
            double d26 = d25 + d20;
            double sin3 = Math.sin(d26);
            double cos3 = Math.cos(d26);
            int i3 = ceil;
            double d27 = (d2 + ((d11 * cos) * cos3)) - (d15 * sin3);
            double d28 = d3 + (d11 * sin * cos3) + (d18 * sin3);
            double d29 = (d14 * sin3) - (d15 * cos3);
            double d30 = (sin3 * d17) + (cos3 * d18);
            double d31 = d26 - d25;
            double tan = Math.tan(d31 / ((double) 2));
            double d32 = d12;
            double sin4 = (Math.sin(d31) * (Math.sqrt(d12 + ((3.0d * tan) * tan)) - ((double) 1))) / ((double) 3);
            path.s((float) (d21 + (d23 * sin4)), (float) (d24 + (d22 * sin4)), (float) (d27 - (sin4 * d29)), (float) (d28 - (sin4 * d30)), (float) d27, (float) d28);
            i2++;
            d20 = d20;
            sin = sin;
            d21 = d27;
            d17 = d17;
            d25 = d26;
            d22 = d30;
            d12 = d32;
            d23 = d29;
            cos = cos;
            ceil = i3;
            d24 = d28;
            d11 = d4;
        }
    }

    public static final void b(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z2, boolean z3) {
        double d9;
        double d10;
        double d11 = d2;
        double d12 = d4;
        double d13 = (d8 / ((double) 180)) * 3.141592653589793d;
        double cos = Math.cos(d13);
        double sin = Math.sin(d13);
        double d14 = ((d11 * cos) + (d3 * sin)) / d6;
        double d15 = (((-d11) * sin) + (d3 * cos)) / d7;
        double d16 = ((d12 * cos) + (d5 * sin)) / d6;
        double d17 = (((-d12) * sin) + (d5 * cos)) / d7;
        double d18 = d14 - d16;
        double d19 = d15 - d17;
        double d20 = (double) 2;
        double d21 = (d14 + d16) / d20;
        double d22 = (d15 + d17) / d20;
        double d23 = (d18 * d18) + (d19 * d19);
        if (d23 != 0.0d) {
            double d24 = (1.0d / d23) - 0.25d;
            if (d24 < 0.0d) {
                double sqrt = (double) ((float) (Math.sqrt(d23) / 1.99999d));
                b(path, d2, d3, d4, d5, d6 * sqrt, d7 * sqrt, d8, z2, z3);
                return;
            }
            double sqrt2 = Math.sqrt(d24);
            double d25 = d18 * sqrt2;
            double d26 = sqrt2 * d19;
            double d27 = d13;
            boolean z4 = z3;
            if (z2 == z4) {
                d10 = d21 - d26;
                d9 = d22 + d25;
            } else {
                d10 = d21 + d26;
                d9 = d22 - d25;
            }
            double atan2 = Math.atan2(d15 - d9, d14 - d10);
            double atan22 = Math.atan2(d17 - d9, d16 - d10) - atan2;
            int i2 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z4 != (i2 >= 0)) {
                atan22 = i2 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d28 = d10 * d6;
            double d29 = d9 * d7;
            a(path, (d28 * cos) - (d29 * sin), (d28 * sin) + (d29 * cos), d6, d7, d2, d3, d27, atan2, atan22);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.compose.ui.graphics.vector.PathNode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v72, resolved type: float} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.graphics.Path c(java.util.List r26, androidx.compose.ui.graphics.Path r27) {
        /*
            r0 = r26
            r14 = r27
            int r1 = r27.o()
            r27.t()
            r14.m(r1)
            boolean r1 = r26.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x0018
            androidx.compose.ui.graphics.vector.PathNode$Close r1 = androidx.compose.ui.graphics.vector.PathNode.Close.f16554c
            goto L_0x001e
        L_0x0018:
            java.lang.Object r1 = r0.get(r2)
            androidx.compose.ui.graphics.vector.PathNode r1 = (androidx.compose.ui.graphics.vector.PathNode) r1
        L_0x001e:
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            int r15 = r3.size()
            r12 = 0
            r13 = r2
            r2 = r12
            r3 = r2
            r8 = r3
            r9 = r8
            r18 = r9
            r19 = r18
        L_0x002f:
            if (r13 >= r15) goto L_0x037c
            java.lang.Object r4 = r0.get(r13)
            r10 = r4
            androidx.compose.ui.graphics.vector.PathNode r10 = (androidx.compose.ui.graphics.vector.PathNode) r10
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.Close
            if (r4 == 0) goto L_0x004e
            r27.close()
            r0 = r10
            r22 = r12
            r23 = r13
            r24 = r15
            r2 = r18
            r8 = r2
            r3 = r19
            r9 = r3
            goto L_0x036f
        L_0x004e:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo
            if (r4 == 0) goto L_0x0077
            r1 = r10
            androidx.compose.ui.graphics.vector.PathNode$RelativeMoveTo r1 = (androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo) r1
            float r4 = r1.c()
            float r8 = r8 + r4
            float r4 = r1.d()
            float r9 = r9 + r4
            float r4 = r1.c()
            float r1 = r1.d()
            r14.g(r4, r1)
            r18 = r8
        L_0x006c:
            r19 = r9
        L_0x006e:
            r0 = r10
            r22 = r12
            r23 = r13
            r24 = r15
            goto L_0x036f
        L_0x0077:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.MoveTo
            if (r4 == 0) goto L_0x0096
            r1 = r10
            androidx.compose.ui.graphics.vector.PathNode$MoveTo r1 = (androidx.compose.ui.graphics.vector.PathNode.MoveTo) r1
            float r4 = r1.c()
            float r5 = r1.d()
            float r6 = r1.c()
            float r1 = r1.d()
            r14.q(r6, r1)
            r8 = r4
            r18 = r8
            r9 = r5
            goto L_0x006c
        L_0x0096:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo
            if (r4 == 0) goto L_0x00b3
            r1 = r10
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r1 = (androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo) r1
            float r4 = r1.c()
            float r5 = r1.d()
            r14.x(r4, r5)
            float r4 = r1.c()
            float r8 = r8 + r4
            float r1 = r1.d()
        L_0x00b1:
            float r9 = r9 + r1
            goto L_0x006e
        L_0x00b3:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.LineTo
            if (r4 == 0) goto L_0x00d0
            r1 = r10
            androidx.compose.ui.graphics.vector.PathNode$LineTo r1 = (androidx.compose.ui.graphics.vector.PathNode.LineTo) r1
            float r4 = r1.c()
            float r5 = r1.d()
            r14.z(r4, r5)
            float r4 = r1.c()
            float r1 = r1.d()
        L_0x00cd:
            r9 = r1
            r8 = r4
            goto L_0x006e
        L_0x00d0:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo
            if (r4 == 0) goto L_0x00e4
            r1 = r10
            androidx.compose.ui.graphics.vector.PathNode$RelativeHorizontalTo r1 = (androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo) r1
            float r4 = r1.c()
            r14.x(r4, r12)
            float r1 = r1.c()
            float r8 = r8 + r1
            goto L_0x006e
        L_0x00e4:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.HorizontalTo
            if (r4 == 0) goto L_0x00f9
            r1 = r10
            androidx.compose.ui.graphics.vector.PathNode$HorizontalTo r1 = (androidx.compose.ui.graphics.vector.PathNode.HorizontalTo) r1
            float r4 = r1.c()
            r14.z(r4, r9)
            float r1 = r1.c()
            r8 = r1
            goto L_0x006e
        L_0x00f9:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo
            if (r4 == 0) goto L_0x010c
            r1 = r10
            androidx.compose.ui.graphics.vector.PathNode$RelativeVerticalTo r1 = (androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo) r1
            float r4 = r1.c()
            r14.x(r12, r4)
            float r1 = r1.c()
            goto L_0x00b1
        L_0x010c:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.VerticalTo
            if (r4 == 0) goto L_0x0121
            r1 = r10
            androidx.compose.ui.graphics.vector.PathNode$VerticalTo r1 = (androidx.compose.ui.graphics.vector.PathNode.VerticalTo) r1
            float r4 = r1.c()
            r14.z(r8, r4)
            float r1 = r1.c()
            r9 = r1
            goto L_0x006e
        L_0x0121:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo
            if (r4 == 0) goto L_0x0164
            r11 = r10
            androidx.compose.ui.graphics.vector.PathNode$RelativeCurveTo r11 = (androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo) r11
            float r2 = r11.c()
            float r3 = r11.f()
            float r4 = r11.d()
            float r5 = r11.g()
            float r6 = r11.e()
            float r7 = r11.h()
            r1 = r27
            r1.h(r2, r3, r4, r5, r6, r7)
            float r1 = r11.d()
            float r1 = r1 + r8
            float r2 = r11.g()
            float r2 = r2 + r9
            float r3 = r11.e()
            float r8 = r8 + r3
            float r3 = r11.h()
        L_0x0158:
            float r9 = r9 + r3
            r3 = r2
            r0 = r10
            r22 = r12
            r23 = r13
            r24 = r15
        L_0x0161:
            r2 = r1
            goto L_0x036f
        L_0x0164:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.CurveTo
            if (r4 == 0) goto L_0x01a3
            r8 = r10
            androidx.compose.ui.graphics.vector.PathNode$CurveTo r8 = (androidx.compose.ui.graphics.vector.PathNode.CurveTo) r8
            float r2 = r8.c()
            float r3 = r8.f()
            float r4 = r8.d()
            float r5 = r8.g()
            float r6 = r8.e()
            float r7 = r8.h()
            r1 = r27
            r1.s(r2, r3, r4, r5, r6, r7)
            float r1 = r8.d()
            float r2 = r8.g()
            float r3 = r8.e()
            float r4 = r8.h()
        L_0x0198:
            r8 = r3
            r9 = r4
            r0 = r10
            r22 = r12
            r23 = r13
            r24 = r15
            r3 = r2
            goto L_0x0161
        L_0x01a3:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo
            if (r4 == 0) goto L_0x01e3
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x01b4
            float r1 = r8 - r2
            float r2 = r9 - r3
            r3 = r2
            r2 = r1
            goto L_0x01b6
        L_0x01b4:
            r2 = r12
            r3 = r2
        L_0x01b6:
            r11 = r10
            androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveCurveTo r11 = (androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo) r11
            float r4 = r11.c()
            float r5 = r11.e()
            float r6 = r11.d()
            float r7 = r11.f()
            r1 = r27
            r1.h(r2, r3, r4, r5, r6, r7)
            float r1 = r11.c()
            float r1 = r1 + r8
            float r2 = r11.e()
            float r2 = r2 + r9
            float r3 = r11.d()
            float r8 = r8 + r3
            float r3 = r11.f()
            goto L_0x0158
        L_0x01e3:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo
            r5 = 2
            if (r4 == 0) goto L_0x0222
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x01f6
            float r1 = (float) r5
            float r8 = r8 * r1
            float r8 = r8 - r2
            float r1 = r1 * r9
            float r1 = r1 - r3
            r3 = r1
            r2 = r8
            goto L_0x01f8
        L_0x01f6:
            r2 = r8
            r3 = r9
        L_0x01f8:
            r8 = r10
            androidx.compose.ui.graphics.vector.PathNode$ReflectiveCurveTo r8 = (androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo) r8
            float r4 = r8.c()
            float r5 = r8.e()
            float r6 = r8.d()
            float r7 = r8.f()
            r1 = r27
            r1.s(r2, r3, r4, r5, r6, r7)
            float r1 = r8.c()
            float r2 = r8.e()
            float r3 = r8.d()
            float r4 = r8.f()
            goto L_0x0198
        L_0x0222:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo
            if (r4 == 0) goto L_0x0251
            r1 = r10
            androidx.compose.ui.graphics.vector.PathNode$RelativeQuadTo r1 = (androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo) r1
            float r2 = r1.c()
            float r3 = r1.e()
            float r4 = r1.d()
            float r5 = r1.f()
            r14.c(r2, r3, r4, r5)
            float r2 = r1.c()
            float r2 = r2 + r8
            float r3 = r1.e()
            float r3 = r3 + r9
            float r4 = r1.d()
            float r8 = r8 + r4
            float r1 = r1.f()
            goto L_0x00b1
        L_0x0251:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.QuadTo
            if (r4 == 0) goto L_0x027d
            r1 = r10
            androidx.compose.ui.graphics.vector.PathNode$QuadTo r1 = (androidx.compose.ui.graphics.vector.PathNode.QuadTo) r1
            float r2 = r1.c()
            float r3 = r1.e()
            float r4 = r1.d()
            float r5 = r1.f()
            r14.n(r2, r3, r4, r5)
            float r2 = r1.c()
            float r3 = r1.e()
            float r4 = r1.d()
            float r1 = r1.f()
            goto L_0x00cd
        L_0x027d:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo
            if (r4 == 0) goto L_0x02a9
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x028c
            float r1 = r8 - r2
            float r2 = r9 - r3
            goto L_0x028e
        L_0x028c:
            r1 = r12
            r2 = r1
        L_0x028e:
            r3 = r10
            androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveQuadTo r3 = (androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo) r3
            float r4 = r3.c()
            float r5 = r3.d()
            r14.c(r1, r2, r4, r5)
            float r1 = r1 + r8
            float r2 = r2 + r9
            float r4 = r3.c()
            float r8 = r8 + r4
            float r3 = r3.d()
            goto L_0x0158
        L_0x02a9:
            boolean r4 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo
            if (r4 == 0) goto L_0x02df
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x02b9
            float r1 = (float) r5
            float r8 = r8 * r1
            float r8 = r8 - r2
            float r1 = r1 * r9
            float r9 = r1 - r3
        L_0x02b9:
            r1 = r10
            androidx.compose.ui.graphics.vector.PathNode$ReflectiveQuadTo r1 = (androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo) r1
            float r2 = r1.c()
            float r3 = r1.d()
            r14.n(r8, r9, r2, r3)
            float r2 = r1.c()
            float r1 = r1.d()
            r3 = r9
            r0 = r10
            r22 = r12
            r23 = r13
            r24 = r15
            r9 = r1
            r25 = r8
            r8 = r2
            r2 = r25
            goto L_0x036f
        L_0x02df:
            boolean r1 = r10 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo
            if (r1 == 0) goto L_0x032c
            r1 = r10
            androidx.compose.ui.graphics.vector.PathNode$RelativeArcTo r1 = (androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo) r1
            float r2 = r1.c()
            float r11 = r2 + r8
            float r2 = r1.d()
            float r6 = r2 + r9
            double r2 = (double) r8
            double r4 = (double) r9
            double r7 = (double) r11
            r9 = r6
            r6 = r7
            r17 = r13
            double r12 = (double) r9
            r20 = r9
            r8 = r12
            float r12 = r1.e()
            double r12 = (double) r12
            r0 = r10
            r21 = r11
            r10 = r12
            float r12 = r1.g()
            double r12 = (double) r12
            r23 = r17
            r22 = 0
            float r14 = r1.f()
            r16 = r15
            double r14 = (double) r14
            r24 = r16
            boolean r16 = r1.h()
            boolean r17 = r1.i()
            r1 = r27
            b(r1, r2, r4, r6, r8, r10, r12, r14, r16, r17)
            r3 = r20
            r9 = r3
            r2 = r21
            r8 = r2
            goto L_0x036f
        L_0x032c:
            r0 = r10
            r22 = r12
            r23 = r13
            r24 = r15
            boolean r1 = r0 instanceof androidx.compose.ui.graphics.vector.PathNode.ArcTo
            if (r1 == 0) goto L_0x036f
            double r2 = (double) r8
            double r4 = (double) r9
            r20 = r0
            androidx.compose.ui.graphics.vector.PathNode$ArcTo r20 = (androidx.compose.ui.graphics.vector.PathNode.ArcTo) r20
            float r1 = r20.c()
            double r6 = (double) r1
            float r1 = r20.d()
            double r8 = (double) r1
            float r1 = r20.e()
            double r10 = (double) r1
            float r1 = r20.g()
            double r12 = (double) r1
            float r1 = r20.f()
            double r14 = (double) r1
            boolean r16 = r20.h()
            boolean r17 = r20.i()
            r1 = r27
            b(r1, r2, r4, r6, r8, r10, r12, r14, r16, r17)
            float r1 = r20.c()
            float r2 = r20.d()
            r8 = r1
            r3 = r2
            r9 = r3
            r2 = r8
        L_0x036f:
            int r13 = r23 + 1
            r14 = r27
            r1 = r0
            r12 = r22
            r15 = r24
            r0 = r26
            goto L_0x002f
        L_0x037c:
            return r27
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathParserKt.c(java.util.List, androidx.compose.ui.graphics.Path):androidx.compose.ui.graphics.Path");
    }
}
