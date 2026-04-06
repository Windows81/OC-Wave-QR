package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BorderModifierNode extends DelegatingNode {
    public BorderCache P;
    public float Q;
    public Brush R;
    public Shape S;
    public final CacheDrawModifierNode T;

    public /* synthetic */ BorderModifierNode(float f2, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, brush, shape);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0100, code lost:
        if (androidx.compose.ui.graphics.ImageBitmapConfig.h(r14, r4) != false) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.draw.DrawResult h3(androidx.compose.ui.draw.CacheDrawScope r50, androidx.compose.ui.graphics.Brush r51, androidx.compose.ui.graphics.Outline.Generic r52, boolean r53, float r54) {
        /*
            r49 = this;
            r1 = r49
            r0 = r50
            r11 = r51
            if (r53 == 0) goto L_0x0015
            androidx.compose.foundation.BorderModifierNode$drawGenericBorder$1 r2 = new androidx.compose.foundation.BorderModifierNode$drawGenericBorder$1
            r3 = r52
            r2.<init>(r3, r11)
            androidx.compose.ui.draw.DrawResult r0 = r0.t(r2)
            goto L_0x02cd
        L_0x0015:
            r3 = r52
            boolean r2 = r11 instanceof androidx.compose.ui.graphics.SolidColor
            r4 = 0
            if (r2 == 0) goto L_0x0045
            androidx.compose.ui.graphics.ImageBitmapConfig$Companion r2 = androidx.compose.ui.graphics.ImageBitmapConfig.f16021b
            int r2 = r2.a()
            androidx.compose.ui.graphics.ColorFilter$Companion r5 = androidx.compose.ui.graphics.ColorFilter.f15990b
            r6 = r11
            androidx.compose.ui.graphics.SolidColor r6 = (androidx.compose.ui.graphics.SolidColor) r6
            long r12 = r6.c()
            r18 = 14
            r19 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r16 = 0
            r17 = 0
            long r6 = androidx.compose.ui.graphics.Color.l(r12, r14, r15, r16, r17, r18, r19)
            r9 = 2
            r10 = 0
            r8 = 0
            androidx.compose.ui.graphics.ColorFilter r5 = androidx.compose.ui.graphics.ColorFilter.Companion.b(r5, r6, r8, r9, r10)
            r14 = r2
            r19 = r5
            goto L_0x004e
        L_0x0045:
            androidx.compose.ui.graphics.ImageBitmapConfig$Companion r2 = androidx.compose.ui.graphics.ImageBitmapConfig.f16021b
            int r2 = r2.b()
            r14 = r2
            r19 = r4
        L_0x004e:
            androidx.compose.ui.graphics.Path r2 = r52.b()
            androidx.compose.ui.geometry.Rect r10 = r2.getBounds()
            androidx.compose.foundation.BorderCache r2 = r1.P
            if (r2 != 0) goto L_0x006f
            androidx.compose.foundation.BorderCache r2 = new androidx.compose.foundation.BorderCache
            r25 = 15
            r26 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r20 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r1.P = r2
        L_0x006f:
            androidx.compose.foundation.BorderCache r2 = r1.P
            kotlin.jvm.internal.Intrinsics.f(r2)
            androidx.compose.ui.graphics.Path r9 = r2.g()
            r9.b()
            r2 = 2
            androidx.compose.ui.graphics.Path.d(r9, r10, r4, r2, r4)
            androidx.compose.ui.graphics.Path r5 = r52.b()
            androidx.compose.ui.graphics.PathOperation$Companion r6 = androidx.compose.ui.graphics.PathOperation.f16081b
            int r6 = r6.a()
            r9.u(r9, r5, r6)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            float r5 = r10.p()
            float r6 = r10.o()
            float r5 = r5 - r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            float r5 = (float) r5
            int r5 = (int) r5
            float r6 = r10.i()
            float r7 = r10.r()
            float r6 = r6 - r7
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            float r6 = (float) r6
            int r6 = (int) r6
            long r12 = (long) r5
            r20 = 32
            long r12 = r12 << r20
            long r5 = (long) r6
            r21 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r21
            long r5 = r5 | r12
            long r23 = androidx.compose.ui.unit.IntSize.c(r5)
            androidx.compose.foundation.BorderCache r5 = r1.P
            kotlin.jvm.internal.Intrinsics.f(r5)
            androidx.compose.ui.graphics.ImageBitmap r6 = r5.f2967a
            androidx.compose.ui.graphics.Canvas r7 = r5.f2968b
            if (r6 == 0) goto L_0x00db
            int r12 = r6.d()
            androidx.compose.ui.graphics.ImageBitmapConfig r12 = androidx.compose.ui.graphics.ImageBitmapConfig.f(r12)
            goto L_0x00dc
        L_0x00db:
            r12 = r4
        L_0x00dc:
            androidx.compose.ui.graphics.ImageBitmapConfig$Companion r13 = androidx.compose.ui.graphics.ImageBitmapConfig.f16021b
            int r13 = r13.b()
            r15 = 0
            if (r12 != 0) goto L_0x00e7
            r12 = r15
            goto L_0x00ef
        L_0x00e7:
            int r12 = r12.l()
            boolean r12 = androidx.compose.ui.graphics.ImageBitmapConfig.i(r12, r13)
        L_0x00ef:
            r13 = 1
            if (r12 != 0) goto L_0x0102
            if (r6 == 0) goto L_0x00fc
            int r4 = r6.d()
            androidx.compose.ui.graphics.ImageBitmapConfig r4 = androidx.compose.ui.graphics.ImageBitmapConfig.f(r4)
        L_0x00fc:
            boolean r4 = androidx.compose.ui.graphics.ImageBitmapConfig.h(r14, r4)
            if (r4 == 0) goto L_0x0103
        L_0x0102:
            r15 = r13
        L_0x0103:
            if (r6 == 0) goto L_0x0139
            if (r7 == 0) goto L_0x0139
            long r16 = r50.c()
            long r2 = r16 >> r20
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r3 = r6.b()
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0139
            long r2 = r50.c()
            long r2 = r2 & r21
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r3 = r6.a()
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0139
            if (r15 != 0) goto L_0x0132
            goto L_0x0139
        L_0x0132:
            r12 = r6
            r48 = r13
            r13 = r7
            r7 = r48
            goto L_0x0158
        L_0x0139:
            long r2 = r23 >> r20
            int r12 = (int) r2
            long r2 = r23 & r21
            int r2 = (int) r2
            r17 = 24
            r18 = 0
            r15 = 0
            r16 = 0
            r7 = r13
            r13 = r2
            androidx.compose.ui.graphics.ImageBitmap r6 = androidx.compose.ui.graphics.ImageBitmapKt.b(r12, r13, r14, r15, r16, r17, r18)
            r5.f2967a = r6
            androidx.compose.ui.graphics.Canvas r2 = androidx.compose.ui.graphics.CanvasKt.a(r6)
            r5.f2968b = r2
            r13 = r2
            r12 = r6
        L_0x0158:
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope r2 = r5.f2969c
            if (r2 != 0) goto L_0x0166
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope r2 = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope
            r2.<init>()
            r5.f2969c = r2
        L_0x0166:
            r14 = r2
            long r2 = androidx.compose.ui.unit.IntSizeKt.e(r23)
            androidx.compose.ui.unit.LayoutDirection r4 = r50.getLayoutDirection()
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams r5 = r14.G()
            androidx.compose.ui.unit.Density r15 = r5.a()
            androidx.compose.ui.unit.LayoutDirection r6 = r5.b()
            r16 = r9
            androidx.compose.ui.graphics.Canvas r9 = r5.c()
            r17 = r8
            r18 = r9
            long r8 = r5.d()
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams r5 = r14.G()
            r5.j(r0)
            r5.k(r4)
            r5.i(r13)
            r5.l(r2)
            r13.o()
            androidx.compose.ui.graphics.Color$Companion r4 = androidx.compose.ui.graphics.Color.f15975b
            long r26 = r4.a()
            androidx.compose.ui.graphics.BlendMode$Companion r38 = androidx.compose.ui.graphics.BlendMode.f15926b
            int r35 = r38.a()
            r36 = 58
            r37 = 0
            r28 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r25 = r14
            r30 = r2
            androidx.compose.ui.graphics.drawscope.DrawScope.A1(r25, r26, r28, r30, r32, r33, r34, r35, r36, r37)
            float r2 = r10.o()
            float r5 = -r2
            float r2 = r10.r()
            float r4 = -r2
            androidx.compose.ui.graphics.drawscope.DrawContext r2 = r14.G1()
            androidx.compose.ui.graphics.drawscope.DrawTransform r2 = r2.e()
            r2.d(r5, r4)
            androidx.compose.ui.graphics.Path r3 = r52.b()     // Catch:{ all -> 0x02f0 }
            androidx.compose.ui.graphics.drawscope.Stroke r33 = new androidx.compose.ui.graphics.drawscope.Stroke     // Catch:{ all -> 0x02f0 }
            r2 = 2
            float r2 = (float) r2     // Catch:{ all -> 0x02f0 }
            float r26 = r54 * r2
            r31 = 30
            r32 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r25 = r33
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x02f0 }
            r25 = 52
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r2 = r14
            r39 = r4
            r4 = r51
            r40 = r5
            r5 = r27
            r41 = r6
            r6 = r33
            r7 = r28
            r42 = r8
            r9 = r17
            r8 = r29
            r44 = r9
            r45 = r18
            r9 = r25
            r17 = r10
            r10 = r26
            androidx.compose.ui.graphics.drawscope.DrawScope.n1(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x02ce }
            long r2 = r14.c()     // Catch:{ all -> 0x02ce }
            long r2 = r2 >> r20
            int r2 = (int) r2     // Catch:{ all -> 0x02ce }
            float r2 = java.lang.Float.intBitsToFloat(r2)     // Catch:{ all -> 0x02ce }
            r3 = 1
            float r3 = (float) r3     // Catch:{ all -> 0x02ce }
            float r2 = r2 + r3
            long r4 = r14.c()     // Catch:{ all -> 0x02ce }
            long r4 = r4 >> r20
            int r4 = (int) r4     // Catch:{ all -> 0x02ce }
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch:{ all -> 0x02ce }
            float r2 = r2 / r4
            long r4 = r14.c()     // Catch:{ all -> 0x02ce }
            long r4 = r4 & r21
            int r4 = (int) r4     // Catch:{ all -> 0x02ce }
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch:{ all -> 0x02ce }
            float r4 = r4 + r3
            long r5 = r14.c()     // Catch:{ all -> 0x02ce }
            long r5 = r5 & r21
            int r3 = (int) r5     // Catch:{ all -> 0x02ce }
            float r3 = java.lang.Float.intBitsToFloat(r3)     // Catch:{ all -> 0x02ce }
            float r4 = r4 / r3
            long r5 = r14.T1()     // Catch:{ all -> 0x02ce }
            androidx.compose.ui.graphics.drawscope.DrawContext r10 = r14.G1()     // Catch:{ all -> 0x02ce }
            long r8 = r10.c()     // Catch:{ all -> 0x02ce }
            androidx.compose.ui.graphics.Canvas r3 = r10.j()     // Catch:{ all -> 0x02ce }
            r3.o()     // Catch:{ all -> 0x02ce }
            androidx.compose.ui.graphics.drawscope.DrawTransform r3 = r10.e()     // Catch:{ all -> 0x02dc }
            r3.g(r2, r4, r5)     // Catch:{ all -> 0x02dc }
            int r18 = r38.a()     // Catch:{ all -> 0x02dc }
            r20 = 28
            r21 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r14
            r3 = r16
            r4 = r51
            r46 = r8
            r8 = r18
            r9 = r20
            r11 = r10
            r10 = r21
            androidx.compose.ui.graphics.drawscope.DrawScope.n1(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x02d4 }
            androidx.compose.ui.graphics.Canvas r2 = r11.j()     // Catch:{ all -> 0x02ce }
            r2.t()     // Catch:{ all -> 0x02ce }
            r2 = r46
            r11.f(r2)     // Catch:{ all -> 0x02ce }
            androidx.compose.ui.graphics.drawscope.DrawContext r2 = r14.G1()
            androidx.compose.ui.graphics.drawscope.DrawTransform r2 = r2.e()
            r4 = r40
            float r3 = -r4
            r5 = r39
            float r4 = -r5
            r2.d(r3, r4)
            r13.t()
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams r2 = r14.G()
            r2.j(r15)
            r3 = r41
            r2.k(r3)
            r3 = r45
            r2.i(r3)
            r3 = r42
            r2.l(r3)
            r12.c()
            r2 = r44
            r2.f40908z = r12
            androidx.compose.foundation.BorderModifierNode$drawGenericBorder$3 r3 = new androidx.compose.foundation.BorderModifierNode$drawGenericBorder$3
            r5 = r3
            r6 = r17
            r7 = r2
            r8 = r23
            r10 = r19
            r5.<init>(r6, r7, r8, r10)
            androidx.compose.ui.draw.DrawResult r0 = r0.t(r3)
        L_0x02cd:
            return r0
        L_0x02ce:
            r0 = move-exception
            r5 = r39
            r4 = r40
            goto L_0x02f6
        L_0x02d4:
            r0 = move-exception
            r5 = r39
            r4 = r40
            r2 = r46
            goto L_0x02e3
        L_0x02dc:
            r0 = move-exception
            r2 = r8
            r11 = r10
            r5 = r39
            r4 = r40
        L_0x02e3:
            androidx.compose.ui.graphics.Canvas r6 = r11.j()     // Catch:{ all -> 0x02ee }
            r6.t()     // Catch:{ all -> 0x02ee }
            r11.f(r2)     // Catch:{ all -> 0x02ee }
            throw r0     // Catch:{ all -> 0x02ee }
        L_0x02ee:
            r0 = move-exception
            goto L_0x02f6
        L_0x02f0:
            r0 = move-exception
            r48 = r5
            r5 = r4
            r4 = r48
        L_0x02f6:
            androidx.compose.ui.graphics.drawscope.DrawContext r2 = r14.G1()
            androidx.compose.ui.graphics.drawscope.DrawTransform r2 = r2.e()
            float r3 = -r4
            float r4 = -r5
            r2.d(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.h3(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    public final DrawResult i3(CacheDrawScope cacheDrawScope, Brush brush, Outline.Rounded rounded, long j2, long j3, boolean z2, float f2) {
        CacheDrawScope cacheDrawScope2 = cacheDrawScope;
        float f3 = f2;
        if (RoundRectKt.g(rounded.b())) {
            return cacheDrawScope2.t(new BorderModifierNode$drawRoundRectBorder$1(z2, brush, rounded.b().h(), f3 / ((float) 2), f2, j2, j3, new Stroke(f2, 0.0f, 0, 0, (PathEffect) null, 30, (DefaultConstructorMarker) null)));
        }
        if (this.P == null) {
            this.P = new BorderCache((ImageBitmap) null, (Canvas) null, (CanvasDrawScope) null, (Path) null, 15, (DefaultConstructorMarker) null);
        }
        BorderCache borderCache = this.P;
        Intrinsics.f(borderCache);
        return cacheDrawScope2.t(new BorderModifierNode$drawRoundRectBorder$2(BorderKt.i(borderCache.g(), rounded.b(), f3, z2), brush));
    }

    public final Brush j3() {
        return this.R;
    }

    public final Shape k3() {
        return this.S;
    }

    public final float l3() {
        return this.Q;
    }

    public final void m3(Brush brush) {
        if (!Intrinsics.d(this.R, brush)) {
            this.R = brush;
            this.T.s0();
        }
    }

    public final void n3(float f2) {
        if (!Dp.o(this.Q, f2)) {
            this.Q = f2;
            this.T.s0();
        }
    }

    public final void s1(Shape shape) {
        if (!Intrinsics.d(this.S, shape)) {
            this.S = shape;
            this.T.s0();
        }
    }

    public BorderModifierNode(float f2, Brush brush, Shape shape) {
        this.Q = f2;
        this.R = brush;
        this.S = shape;
        this.T = (CacheDrawModifierNode) Z2(DrawModifierKt.a(new BorderModifierNode$drawWithCacheModifierNode$1(this)));
    }
}
