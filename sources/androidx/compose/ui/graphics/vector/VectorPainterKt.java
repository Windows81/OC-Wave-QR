package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class VectorPainterKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.graphics.vector.VectorGroup r23, java.util.Map r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r0 = r23
            r1 = r26
            r2 = r27
            r3 = -446179233(0xffffffffe567d85f, float:-6.8428625E22)
            r4 = r25
            androidx.compose.runtime.Composer r15 = r4.q(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r1 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0025
            boolean r4 = r15.W(r0)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r1
            goto L_0x0026
        L_0x0025:
            r4 = r1
        L_0x0026:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x002f
            r4 = r4 | 48
        L_0x002c:
            r6 = r24
            goto L_0x0041
        L_0x002f:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x002c
            r6 = r24
            boolean r7 = r15.l(r6)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
        L_0x0041:
            r7 = r4 & 19
            r8 = 18
            if (r7 == r8) goto L_0x0049
            r7 = 1
            goto L_0x004a
        L_0x0049:
            r7 = 0
        L_0x004a:
            r8 = r4 & 1
            boolean r7 = r15.E(r7, r8)
            if (r7 == 0) goto L_0x0272
            if (r5 == 0) goto L_0x005a
            java.util.Map r5 = kotlin.collections.MapsKt.h()
            r13 = r5
            goto L_0x005b
        L_0x005a:
            r13 = r6
        L_0x005b:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0067
            r5 = -1
            java.lang.String r6 = "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:428)"
            androidx.compose.runtime.ComposerKt.Y(r3, r4, r5, r6)
        L_0x0067:
            java.util.Iterator r3 = r23.iterator()
        L_0x006b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0266
            java.lang.Object r4 = r3.next()
            androidx.compose.ui.graphics.vector.VectorNode r4 = (androidx.compose.ui.graphics.vector.VectorNode) r4
            boolean r5 = r4 instanceof androidx.compose.ui.graphics.vector.VectorPath
            if (r5 == 0) goto L_0x016d
            r5 = -23302778(0xfffffffffe9c6d86, float:-1.0396412E38)
            r15.X(r5)
            r17 = r4
            androidx.compose.ui.graphics.vector.VectorPath r17 = (androidx.compose.ui.graphics.vector.VectorPath) r17
            java.lang.String r4 = r17.h()
            java.lang.Object r4 = r13.get(r4)
            androidx.compose.ui.graphics.vector.VectorConfig r4 = (androidx.compose.ui.graphics.vector.VectorConfig) r4
            if (r4 != 0) goto L_0x0096
            androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1 r4 = new androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
            r4.<init>()
        L_0x0096:
            r12 = r4
            androidx.compose.ui.graphics.vector.VectorProperty$PathData r4 = androidx.compose.ui.graphics.vector.VectorProperty.PathData.f16680a
            java.util.List r5 = r17.i()
            java.lang.Object r4 = r12.a(r4, r5)
            java.util.List r4 = (java.util.List) r4
            int r5 = r17.m()
            java.lang.String r6 = r17.h()
            androidx.compose.ui.graphics.vector.VectorProperty$Fill r7 = androidx.compose.ui.graphics.vector.VectorProperty.Fill.f16678a
            androidx.compose.ui.graphics.Brush r8 = r17.e()
            java.lang.Object r7 = r12.a(r7, r8)
            androidx.compose.ui.graphics.Brush r7 = (androidx.compose.ui.graphics.Brush) r7
            androidx.compose.ui.graphics.vector.VectorProperty$FillAlpha r8 = androidx.compose.ui.graphics.vector.VectorProperty.FillAlpha.f16679a
            float r9 = r17.g()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object r8 = r12.a(r8, r9)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            androidx.compose.ui.graphics.vector.VectorProperty$Stroke r9 = androidx.compose.ui.graphics.vector.VectorProperty.Stroke.f16686a
            androidx.compose.ui.graphics.Brush r10 = r17.n()
            java.lang.Object r9 = r12.a(r9, r10)
            androidx.compose.ui.graphics.Brush r9 = (androidx.compose.ui.graphics.Brush) r9
            androidx.compose.ui.graphics.vector.VectorProperty$StrokeAlpha r10 = androidx.compose.ui.graphics.vector.VectorProperty.StrokeAlpha.f16687a
            float r11 = r17.o()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.Object r10 = r12.a(r10, r11)
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            androidx.compose.ui.graphics.vector.VectorProperty$StrokeLineWidth r11 = androidx.compose.ui.graphics.vector.VectorProperty.StrokeLineWidth.f16688a
            float r16 = r17.u()
            java.lang.Float r14 = java.lang.Float.valueOf(r16)
            java.lang.Object r11 = r12.a(r11, r14)
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            int r14 = r17.p()
            r24 = r3
            r3 = r12
            r12 = r14
            int r14 = r17.q()
            r0 = r13
            r13 = r14
            float r14 = r17.s()
            r1 = 1
            androidx.compose.ui.graphics.vector.VectorProperty$TrimPathStart r1 = androidx.compose.ui.graphics.vector.VectorProperty.TrimPathStart.f16693a
            float r16 = r17.z()
            r18 = r15
            java.lang.Float r15 = java.lang.Float.valueOf(r16)
            java.lang.Object r1 = r3.a(r1, r15)
            java.lang.Number r1 = (java.lang.Number) r1
            float r15 = r1.floatValue()
            r1 = r18
            androidx.compose.ui.graphics.vector.VectorProperty$TrimPathEnd r2 = androidx.compose.ui.graphics.vector.VectorProperty.TrimPathEnd.f16691a
            float r16 = r17.v()
            r22 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r3.a(r2, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r16 = r0.floatValue()
            androidx.compose.ui.graphics.vector.VectorProperty$TrimPathOffset r0 = androidx.compose.ui.graphics.vector.VectorProperty.TrimPathOffset.f16692a
            float r2 = r17.w()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r0 = r3.a(r0, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            float r17 = r0.floatValue()
            r20 = 0
            r21 = 0
            r19 = 0
            androidx.compose.ui.graphics.vector.VectorComposeKt.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.M()
            r0 = r23
            r3 = r24
            r2 = r27
            r15 = r1
            r13 = r22
        L_0x0169:
            r1 = r26
            goto L_0x006b
        L_0x016d:
            r24 = r3
            r22 = r13
            r1 = r15
            boolean r0 = r4 instanceof androidx.compose.ui.graphics.vector.VectorGroup
            if (r0 == 0) goto L_0x0259
            r0 = -21889209(0xfffffffffeb1ff47, float:-1.1829942E38)
            r1.X(r0)
            r0 = r4
            androidx.compose.ui.graphics.vector.VectorGroup r0 = (androidx.compose.ui.graphics.vector.VectorGroup) r0
            java.lang.String r2 = r0.i()
            r3 = r22
            java.lang.Object r2 = r3.get(r2)
            androidx.compose.ui.graphics.vector.VectorConfig r2 = (androidx.compose.ui.graphics.vector.VectorConfig) r2
            if (r2 != 0) goto L_0x0192
            androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2 r2 = new androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
            r2.<init>()
        L_0x0192:
            java.lang.String r5 = r0.i()
            androidx.compose.ui.graphics.vector.VectorProperty$Rotation r6 = androidx.compose.ui.graphics.vector.VectorProperty.Rotation.f16683a
            float r7 = r0.o()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r6 = r2.a(r6, r7)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            androidx.compose.ui.graphics.vector.VectorProperty$ScaleX r7 = androidx.compose.ui.graphics.vector.VectorProperty.ScaleX.f16684a
            float r8 = r0.p()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Object r7 = r2.a(r7, r8)
            java.lang.Number r7 = (java.lang.Number) r7
            float r8 = r7.floatValue()
            androidx.compose.ui.graphics.vector.VectorProperty$ScaleY r7 = androidx.compose.ui.graphics.vector.VectorProperty.ScaleY.f16685a
            float r9 = r0.q()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object r7 = r2.a(r7, r9)
            java.lang.Number r7 = (java.lang.Number) r7
            float r9 = r7.floatValue()
            androidx.compose.ui.graphics.vector.VectorProperty$TranslateX r7 = androidx.compose.ui.graphics.vector.VectorProperty.TranslateX.f16689a
            float r10 = r0.u()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.Object r7 = r2.a(r7, r10)
            java.lang.Number r7 = (java.lang.Number) r7
            float r10 = r7.floatValue()
            androidx.compose.ui.graphics.vector.VectorProperty$TranslateY r7 = androidx.compose.ui.graphics.vector.VectorProperty.TranslateY.f16690a
            float r11 = r0.v()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.Object r7 = r2.a(r7, r11)
            java.lang.Number r7 = (java.lang.Number) r7
            float r11 = r7.floatValue()
            androidx.compose.ui.graphics.vector.VectorProperty$PivotX r7 = androidx.compose.ui.graphics.vector.VectorProperty.PivotX.f16681a
            float r12 = r0.m()
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            java.lang.Object r7 = r2.a(r7, r12)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            androidx.compose.ui.graphics.vector.VectorProperty$PivotY r12 = androidx.compose.ui.graphics.vector.VectorProperty.PivotY.f16682a
            float r13 = r0.n()
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r12 = r2.a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            androidx.compose.ui.graphics.vector.VectorProperty$PathData r13 = androidx.compose.ui.graphics.vector.VectorProperty.PathData.f16680a
            java.util.List r0 = r0.h()
            java.lang.Object r0 = r2.a(r13, r0)
            java.util.List r0 = (java.util.List) r0
            androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1 r2 = new androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1
            r2.<init>(r4, r3)
            r4 = 54
            r13 = 1450046638(0x566df4ae, float:6.5408787E13)
            r15 = 1
            androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r15, r2, r1, r4)
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r16 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r12
            r12 = r0
            r14 = r1
            r0 = r15
            r15 = r2
            androidx.compose.ui.graphics.vector.VectorComposeKt.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.M()
        L_0x024f:
            r0 = r23
            r2 = r27
            r15 = r1
            r13 = r3
            r3 = r24
            goto L_0x0169
        L_0x0259:
            r3 = r22
            r0 = 1
            r2 = -20884003(0xfffffffffec155dd, float:-1.2849342E38)
            r1.X(r2)
            r1.M()
            goto L_0x024f
        L_0x0266:
            r3 = r13
            r1 = r15
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0277
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0277
        L_0x0272:
            r1 = r15
            r1.B()
            r3 = r6
        L_0x0277:
            androidx.compose.runtime.ScopeUpdateScope r0 = r1.x()
            if (r0 == 0) goto L_0x028b
            androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2 r1 = new androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2
            r2 = r23
            r4 = r26
            r5 = r27
            r1.<init>(r2, r3, r4, r5)
            r0.a(r1)
        L_0x028b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorPainterKt.a(androidx.compose.ui.graphics.vector.VectorGroup, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final VectorPainter b(VectorPainter vectorPainter, long j2, long j3, String str, ColorFilter colorFilter, boolean z2) {
        vectorPainter.x(j2);
        vectorPainter.t(z2);
        vectorPainter.u(colorFilter);
        vectorPainter.y(j3);
        vectorPainter.w(str);
        return vectorPainter;
    }

    public static final ColorFilter c(long j2, int i2) {
        if (j2 != 16) {
            return ColorFilter.f15990b.a(j2, i2);
        }
        return null;
    }

    public static final GroupComponent d(GroupComponent groupComponent, VectorGroup vectorGroup) {
        int s2 = vectorGroup.s();
        for (int i2 = 0; i2 < s2; i2++) {
            VectorNode g2 = vectorGroup.g(i2);
            if (g2 instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) g2;
                pathComponent.k(vectorPath.i());
                pathComponent.l(vectorPath.m());
                pathComponent.j(vectorPath.h());
                pathComponent.h(vectorPath.e());
                pathComponent.i(vectorPath.g());
                pathComponent.m(vectorPath.n());
                pathComponent.n(vectorPath.o());
                pathComponent.r(vectorPath.u());
                pathComponent.o(vectorPath.p());
                pathComponent.p(vectorPath.q());
                pathComponent.q(vectorPath.s());
                pathComponent.u(vectorPath.z());
                pathComponent.s(vectorPath.v());
                pathComponent.t(vectorPath.w());
                groupComponent.i(i2, pathComponent);
            } else if (g2 instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) g2;
                groupComponent2.r(vectorGroup2.i());
                groupComponent2.u(vectorGroup2.o());
                groupComponent2.v(vectorGroup2.p());
                groupComponent2.w(vectorGroup2.q());
                groupComponent2.x(vectorGroup2.u());
                groupComponent2.y(vectorGroup2.v());
                groupComponent2.s(vectorGroup2.m());
                groupComponent2.t(vectorGroup2.n());
                groupComponent2.q(vectorGroup2.h());
                d(groupComponent2, vectorGroup2);
                groupComponent.i(i2, groupComponent2);
            }
        }
        return groupComponent;
    }

    public static final VectorPainter e(Density density, ImageVector imageVector, GroupComponent groupComponent) {
        long f2 = f(density, imageVector.f(), imageVector.e());
        return b(new VectorPainter(groupComponent), f2, g(f2, imageVector.m(), imageVector.l()), imageVector.h(), c(imageVector.k(), imageVector.j()), imageVector.d());
    }

    public static final long f(Density density, float f2, float f3) {
        return Size.d((((long) Float.floatToRawIntBits(density.B1(f2))) << 32) | (((long) Float.floatToRawIntBits(density.B1(f3))) & 4294967295L));
    }

    public static final long g(long j2, float f2, float f3) {
        if (Float.isNaN(f2)) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if (Float.isNaN(f3)) {
            f3 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        return Size.d((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }

    public static final VectorPainter h(ImageVector imageVector, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1413834416, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        Density density = (Density) composer.C(CompositionLocalsKt.g());
        float density2 = density.getDensity();
        long floatToRawIntBits = (long) Float.floatToRawIntBits((float) imageVector.g());
        boolean j2 = composer.j((((long) Float.floatToRawIntBits(density2)) & 4294967295L) | (floatToRawIntBits << 32));
        Object g2 = composer.g();
        if (j2 || g2 == Composer.f14567a.a()) {
            GroupComponent groupComponent = new GroupComponent();
            d(groupComponent, imageVector.i());
            Unit unit = Unit.f40552a;
            g2 = e(density, imageVector, groupComponent);
            composer.N(g2);
        }
        VectorPainter vectorPainter = (VectorPainter) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return vectorPainter;
    }
}
