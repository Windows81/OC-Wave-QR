package androidx.compose.material;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class ProgressIndicatorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f8164a = ProgressIndicatorDefaults.f8161a.a();

    /* renamed from: b  reason: collision with root package name */
    public static final float f8165b = Dp.m((float) 240);

    /* renamed from: c  reason: collision with root package name */
    public static final float f8166c = Dp.m((float) 40);

    /* renamed from: d  reason: collision with root package name */
    public static final CubicBezierEasing f8167d = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);

    /* renamed from: e  reason: collision with root package name */
    public static final CubicBezierEasing f8168e = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final CubicBezierEasing f8169f = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);

    /* renamed from: g  reason: collision with root package name */
    public static final CubicBezierEasing f8170g = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);

    /* renamed from: h  reason: collision with root package name */
    public static final CubicBezierEasing f8171h = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    public static final void I(DrawScope drawScope, float f2, float f3, long j2, Stroke stroke) {
        float f4 = (float) 2;
        float f5 = stroke.f() / f4;
        float i2 = Size.i(drawScope.c()) - (f4 * f5);
        DrawScope.a2(drawScope, j2, f2, f3, false, OffsetKt.a(f5, f5), SizeKt.a(i2, i2), 0.0f, stroke, (ColorFilter) null, 0, 832, (Object) null);
    }

    public static final void J(DrawScope drawScope, long j2, Stroke stroke) {
        I(drawScope, 0.0f, 360.0f, j2, stroke);
    }

    public static final void K(DrawScope drawScope, float f2, float f3, long j2, Stroke stroke) {
        I(drawScope, f2, f3, j2, stroke);
    }

    public static final void L(DrawScope drawScope, float f2, float f3, float f4, long j2, Stroke stroke) {
        I(drawScope, f2 + (StrokeCap.g(stroke.b(), StrokeCap.f16130b.a()) ? 0.0f : ((f3 / Dp.m(f8166c / ((float) 2))) * 57.29578f) / 2.0f), Math.max(f4, 0.1f), j2, stroke);
    }

    public static final void M(DrawScope drawScope, float f2, float f3, long j2, float f4, int i2) {
        float i3 = Size.i(drawScope.c());
        float g2 = Size.g(drawScope.c());
        float f5 = (float) 2;
        float f6 = g2 / f5;
        boolean z2 = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f7 = (z2 ? f2 : 1.0f - f3) * i3;
        float f8 = (z2 ? f3 : 1.0f - f2) * i3;
        if (StrokeCap.g(i2, StrokeCap.f16130b.a()) || g2 > i3) {
            DrawScope.j2(drawScope, j2, OffsetKt.a(f7, f6), OffsetKt.a(f8, f6), f4, 0, (PathEffect) null, 0.0f, (ColorFilter) null, 0, 496, (Object) null);
            return;
        }
        float f9 = f4 / f5;
        ClosedFloatingPointRange b2 = RangesKt.b(f9, i3 - f9);
        float floatValue = ((Number) RangesKt.r(Float.valueOf(f7), b2)).floatValue();
        float floatValue2 = ((Number) RangesKt.r(Float.valueOf(f8), b2)).floatValue();
        if (Math.abs(f3 - f2) > 0.0f) {
            DrawScope.j2(drawScope, j2, OffsetKt.a(floatValue, f6), OffsetKt.a(floatValue2, f6), f4, i2, (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        }
    }

    public static final void N(DrawScope drawScope, long j2, float f2, int i2) {
        M(drawScope, 0.0f, 1.0f, j2, f2, i2);
    }

    public static final Modifier O(Modifier modifier) {
        float m2 = Dp.m((float) 10);
        return PaddingKt.k(SemanticsModifierKt.c(LayoutModifierKt.a(modifier, new ProgressIndicatorKt$increaseSemanticsBounds$1(m2)), true, ProgressIndicatorKt$increaseSemanticsBounds$2.f8217z), 0.0f, m2, 1, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1$1} */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01b4, code lost:
        if (r3 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x01b6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(float r26, androidx.compose.ui.Modifier r27, long r28, float r30, long r31, int r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r1 = r26
            r9 = r35
            r0 = 1746618448(0x681b4850, float:2.933203E24)
            r2 = r34
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r36 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r9 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.h(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r9
            goto L_0x0024
        L_0x0023:
            r3 = r9
        L_0x0024:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r5 = r27
            goto L_0x003f
        L_0x002d:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x002a
            r5 = r27
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x003c
            r6 = 32
            goto L_0x003e
        L_0x003c:
            r6 = 16
        L_0x003e:
            r3 = r3 | r6
        L_0x003f:
            r6 = r9 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0056
            r6 = r36 & 4
            r10 = r28
            if (r6 != 0) goto L_0x0052
            boolean r6 = r2.j(r10)
            if (r6 == 0) goto L_0x0052
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0054
        L_0x0052:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0054:
            r3 = r3 | r6
            goto L_0x0058
        L_0x0056:
            r10 = r28
        L_0x0058:
            r6 = r36 & 8
            if (r6 == 0) goto L_0x0061
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x005e:
            r8 = r30
            goto L_0x0073
        L_0x0061:
            r8 = r9 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x005e
            r8 = r30
            boolean r12 = r2.h(r8)
            if (r12 == 0) goto L_0x0070
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r3 = r3 | r12
        L_0x0073:
            r12 = r36 & 16
            if (r12 == 0) goto L_0x007c
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0079:
            r14 = r31
            goto L_0x008f
        L_0x007c:
            r14 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0079
            r14 = r31
            boolean r16 = r2.j(r14)
            if (r16 == 0) goto L_0x008b
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008d
        L_0x008b:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x008d:
            r3 = r3 | r16
        L_0x008f:
            r16 = 196608(0x30000, float:2.75506E-40)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x00a9
            r16 = r36 & 32
            r7 = r33
            if (r16 != 0) goto L_0x00a4
            boolean r16 = r2.i(r7)
            if (r16 == 0) goto L_0x00a4
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a6
        L_0x00a4:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00a6:
            r3 = r3 | r16
            goto L_0x00ab
        L_0x00a9:
            r7 = r33
        L_0x00ab:
            r16 = 74899(0x12493, float:1.04956E-40)
            r13 = r3 & r16
            r0 = 74898(0x12492, float:1.04954E-40)
            r17 = 1
            if (r13 == r0) goto L_0x00ba
            r0 = r17
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            r13 = r3 & 1
            boolean r0 = r2.E(r0, r13)
            if (r0 == 0) goto L_0x01dc
            r2.p()
            r0 = r9 & 1
            r13 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x00d4
            goto L_0x00e5
        L_0x00d4:
            r2.B()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x00dd
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00dd:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x00e2
            r3 = r3 & r13
        L_0x00e2:
            r0 = r27
            goto L_0x011a
        L_0x00e5:
            if (r4 == 0) goto L_0x00ea
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ec
        L_0x00ea:
            r0 = r27
        L_0x00ec:
            r4 = r36 & 4
            if (r4 == 0) goto L_0x00fd
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.f7937a
            r10 = 6
            androidx.compose.material.Colors r4 = r4.a(r2, r10)
            long r10 = r4.j()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00fd:
            if (r6 == 0) goto L_0x0106
            androidx.compose.material.ProgressIndicatorDefaults r4 = androidx.compose.material.ProgressIndicatorDefaults.f8161a
            float r4 = r4.a()
            r8 = r4
        L_0x0106:
            if (r12 == 0) goto L_0x010e
            androidx.compose.ui.graphics.Color$Companion r4 = androidx.compose.ui.graphics.Color.f15975b
            long r14 = r4.e()
        L_0x010e:
            r4 = r36 & 32
            if (r4 == 0) goto L_0x011a
            androidx.compose.ui.graphics.StrokeCap$Companion r4 = androidx.compose.ui.graphics.StrokeCap.f16130b
            int r4 = r4.a()
            r3 = r3 & r13
            r7 = r4
        L_0x011a:
            r2.U()
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x012c
            r4 = -1
            java.lang.String r6 = "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:338)"
            r12 = 1746618448(0x681b4850, float:2.933203E24)
            androidx.compose.runtime.ComposerKt.Y(r12, r3, r4, r6)
        L_0x012c:
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r4 = r1
        L_0x0133:
            r6 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x013a
            goto L_0x013b
        L_0x013a:
            r6 = r4
        L_0x013b:
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r4 = r2.C(r4)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.ui.unit.Density) r4
            androidx.compose.ui.graphics.drawscope.Stroke r12 = new androidx.compose.ui.graphics.drawscope.Stroke
            float r19 = r4.B1(r8)
            r24 = 26
            r25 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r18 = r12
            r21 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r4 = 6
            r13 = 0
            r16 = 0
            r18 = 0
            r27 = r0
            r28 = r6
            r29 = r16
            r30 = r18
            r31 = r4
            r32 = r13
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.ProgressSemanticsKt.c(r27, r28, r29, r30, r31, r32)
            float r13 = f8166c
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.t(r4, r13)
            boolean r13 = r2.h(r6)
            r16 = 57344(0xe000, float:8.0356E-41)
            r5 = r3 & r16
            r16 = r0
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r5 != r0) goto L_0x018a
            r0 = r17
            goto L_0x018b
        L_0x018a:
            r0 = 0
        L_0x018b:
            r0 = r0 | r13
            boolean r5 = r2.l(r12)
            r0 = r0 | r5
            r5 = r3 & 896(0x380, float:1.256E-42)
            r5 = r5 ^ 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r5 <= r13) goto L_0x019f
            boolean r5 = r2.j(r10)
            if (r5 != 0) goto L_0x01a6
        L_0x019f:
            r3 = r3 & 384(0x180, float:5.38E-43)
            if (r3 != r13) goto L_0x01a4
            goto L_0x01a6
        L_0x01a4:
            r17 = 0
        L_0x01a6:
            r0 = r0 | r17
            java.lang.Object r3 = r2.g()
            if (r0 != 0) goto L_0x01b6
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x01c8
        L_0x01b6:
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1$1 r3 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1$1
            r27 = r3
            r28 = r6
            r29 = r14
            r31 = r12
            r32 = r10
            r27.<init>(r28, r29, r31, r32)
            r2.N(r3)
        L_0x01c8:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r0 = 0
            androidx.compose.foundation.CanvasKt.b(r4, r3, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01d7
            androidx.compose.runtime.ComposerKt.X()
        L_0x01d7:
            r5 = r8
            r3 = r10
            r8 = r7
            r6 = r14
            goto L_0x01e2
        L_0x01dc:
            r2.B()
            r16 = r27
            goto L_0x01d7
        L_0x01e2:
            androidx.compose.runtime.ScopeUpdateScope r11 = r2.x()
            if (r11 == 0) goto L_0x01f9
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2 r12 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
            r0 = r12
            r1 = r26
            r2 = r16
            r9 = r35
            r10 = r36
            r0.<init>(r1, r2, r3, r5, r6, r8, r9, r10)
            r11.a(r12)
        L_0x01f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.a(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1} */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02af, code lost:
        if (r8 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x02b1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x028a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.Modifier r33, long r34, float r36, long r37, int r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r8 = r41
            r0 = -1119119072(0xffffffffbd4b9920, float:-0.04970658)
            r1 = r40
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r42 & 1
            if (r2 == 0) goto L_0x0015
            r4 = r8 | 6
            r5 = r4
            r4 = r33
            goto L_0x0029
        L_0x0015:
            r4 = r8 & 6
            if (r4 != 0) goto L_0x0026
            r4 = r33
            boolean r5 = r1.W(r4)
            if (r5 == 0) goto L_0x0023
            r5 = 4
            goto L_0x0024
        L_0x0023:
            r5 = 2
        L_0x0024:
            r5 = r5 | r8
            goto L_0x0029
        L_0x0026:
            r4 = r33
            r5 = r8
        L_0x0029:
            r6 = r8 & 48
            if (r6 != 0) goto L_0x0040
            r6 = r42 & 2
            r9 = r34
            if (r6 != 0) goto L_0x003c
            boolean r6 = r1.j(r9)
            if (r6 == 0) goto L_0x003c
            r6 = 32
            goto L_0x003e
        L_0x003c:
            r6 = 16
        L_0x003e:
            r5 = r5 | r6
            goto L_0x0042
        L_0x0040:
            r9 = r34
        L_0x0042:
            r6 = r42 & 4
            if (r6 == 0) goto L_0x004b
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0048:
            r11 = r36
            goto L_0x005d
        L_0x004b:
            r11 = r8 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0048
            r11 = r36
            boolean r12 = r1.h(r11)
            if (r12 == 0) goto L_0x005a
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r5 = r5 | r12
        L_0x005d:
            r12 = r42 & 8
            if (r12 == 0) goto L_0x0066
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r14 = r37
            goto L_0x0078
        L_0x0066:
            r13 = r8 & 3072(0xc00, float:4.305E-42)
            r14 = r37
            if (r13 != 0) goto L_0x0078
            boolean r13 = r1.j(r14)
            if (r13 == 0) goto L_0x0075
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r5 = r5 | r13
        L_0x0078:
            r13 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0092
            r13 = r42 & 16
            if (r13 != 0) goto L_0x008b
            r13 = r39
            boolean r17 = r1.i(r13)
            if (r17 == 0) goto L_0x008d
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008b:
            r13 = r39
        L_0x008d:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r5 = r5 | r17
            goto L_0x0094
        L_0x0092:
            r13 = r39
        L_0x0094:
            r7 = r5 & 9363(0x2493, float:1.312E-41)
            r3 = 9362(0x2492, float:1.3119E-41)
            r14 = 0
            r15 = 1
            if (r7 == r3) goto L_0x009e
            r3 = r15
            goto L_0x009f
        L_0x009e:
            r3 = r14
        L_0x009f:
            r7 = r5 & 1
            boolean r3 = r1.E(r3, r7)
            if (r3 == 0) goto L_0x02e2
            r1.p()
            r3 = r8 & 1
            r7 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x00cf
            boolean r3 = r1.J()
            if (r3 == 0) goto L_0x00b8
            goto L_0x00cf
        L_0x00b8:
            r1.B()
            r2 = r42 & 2
            if (r2 == 0) goto L_0x00c1
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c1:
            r2 = r42 & 16
            if (r2 == 0) goto L_0x00c6
            r5 = r5 & r7
        L_0x00c6:
            r6 = r37
            r2 = r4
        L_0x00c9:
            r3 = r9
            r29 = r13
            r13 = r5
            r5 = r11
            goto L_0x010f
        L_0x00cf:
            if (r2 == 0) goto L_0x00d4
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00d5
        L_0x00d4:
            r2 = r4
        L_0x00d5:
            r3 = r42 & 2
            if (r3 == 0) goto L_0x00e7
            androidx.compose.material.MaterialTheme r3 = androidx.compose.material.MaterialTheme.f7937a
            r4 = 6
            androidx.compose.material.Colors r3 = r3.a(r1, r4)
            long r3 = r3.j()
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
            r9 = r3
        L_0x00e7:
            if (r6 == 0) goto L_0x00f0
            androidx.compose.material.ProgressIndicatorDefaults r3 = androidx.compose.material.ProgressIndicatorDefaults.f8161a
            float r3 = r3.a()
            r11 = r3
        L_0x00f0:
            if (r12 == 0) goto L_0x00f9
            androidx.compose.ui.graphics.Color$Companion r3 = androidx.compose.ui.graphics.Color.f15975b
            long r3 = r3.e()
            goto L_0x00fb
        L_0x00f9:
            r3 = r37
        L_0x00fb:
            r6 = r42 & 16
            if (r6 == 0) goto L_0x010d
            androidx.compose.ui.graphics.StrokeCap$Companion r6 = androidx.compose.ui.graphics.StrokeCap.f16130b
            int r6 = r6.c()
            r5 = r5 & r7
            r13 = r5
            r29 = r6
            r5 = r11
            r6 = r3
            r3 = r9
            goto L_0x010f
        L_0x010d:
            r6 = r3
            goto L_0x00c9
        L_0x010f:
            r1.U()
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x011e
            r9 = -1
            java.lang.String r10 = "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:374)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r9, r10)
        L_0x011e:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r1.C(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            androidx.compose.ui.graphics.drawscope.Stroke r12 = new androidx.compose.ui.graphics.drawscope.Stroke
            float r19 = r0.B1(r5)
            r24 = 26
            r25 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r18 = r12
            r21 = r29
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r0 = 0
            androidx.compose.animation.core.InfiniteTransition r18 = androidx.compose.animation.core.InfiniteTransitionKt.c(r0, r1, r14, r15)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            r9 = 5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            kotlin.jvm.internal.IntCompanionObject r9 = kotlin.jvm.internal.IntCompanionObject.f40897a
            androidx.compose.animation.core.TwoWayConverter r17 = androidx.compose.animation.core.VectorConvertersKt.j(r9)
            r9 = 6660(0x1a04, float:9.333E-42)
            androidx.compose.animation.core.Easing r15 = androidx.compose.animation.core.EasingKt.e()
            r8 = 2
            androidx.compose.animation.core.TweenSpec r9 = androidx.compose.animation.core.AnimationSpecKt.n(r9, r14, r15, r8, r0)
            r8 = 6
            r15 = 0
            r20 = 0
            r21 = 0
            r33 = r9
            r34 = r20
            r35 = r21
            r37 = r8
            r38 = r15
            androidx.compose.animation.core.InfiniteRepeatableSpec r8 = androidx.compose.animation.core.AnimationSpecKt.e(r33, r34, r35, r37, r38)
            int r15 = androidx.compose.animation.core.InfiniteTransition.f2584f
            r9 = r15 | 432(0x1b0, float:6.05E-43)
            int r20 = androidx.compose.animation.core.InfiniteRepeatableSpec.f2580d
            int r21 = r20 << 12
            r21 = r9 | r21
            r22 = 16
            r9 = r18
            r30 = r12
            r12 = r17
            r31 = r13
            r13 = r8
            r8 = r14
            r14 = r23
            r32 = r15
            r19 = 1
            r15 = r1
            r16 = r21
            r17 = r22
            androidx.compose.runtime.State r9 = androidx.compose.animation.core.InfiniteTransitionKt.b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r10 = 1332(0x534, float:1.867E-42)
            androidx.compose.animation.core.Easing r11 = androidx.compose.animation.core.EasingKt.e()
            r12 = 2
            androidx.compose.animation.core.TweenSpec r0 = androidx.compose.animation.core.AnimationSpecKt.n(r10, r8, r11, r12, r0)
            r10 = 6
            r11 = 0
            r12 = 0
            r13 = 0
            r33 = r0
            r34 = r12
            r35 = r13
            r37 = r10
            r38 = r11
            androidx.compose.animation.core.InfiniteRepeatableSpec r0 = androidx.compose.animation.core.AnimationSpecKt.e(r33, r34, r35, r37, r38)
            r10 = r32
            r11 = r10 | 432(0x1b0, float:6.05E-43)
            int r12 = r20 << 9
            r11 = r11 | r12
            r12 = 8
            r13 = 0
            r14 = 1133445120(0x438f0000, float:286.0)
            r15 = 0
            r33 = r18
            r34 = r13
            r35 = r14
            r36 = r0
            r37 = r15
            r38 = r1
            r39 = r11
            r40 = r12
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.InfiniteTransitionKt.a(r33, r34, r35, r36, r37, r38, r39, r40)
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2 r11 = androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2.f8190z
            androidx.compose.animation.core.KeyframesSpec r11 = androidx.compose.animation.core.AnimationSpecKt.f(r11)
            r12 = 6
            r13 = 0
            r14 = 0
            r15 = 0
            r33 = r11
            r34 = r14
            r35 = r15
            r37 = r12
            r38 = r13
            androidx.compose.animation.core.InfiniteRepeatableSpec r11 = androidx.compose.animation.core.AnimationSpecKt.e(r33, r34, r35, r37, r38)
            r12 = r10 | 432(0x1b0, float:6.05E-43)
            int r13 = r20 << 9
            r12 = r12 | r13
            r13 = 8
            r14 = 0
            r15 = 1133576192(0x43910000, float:290.0)
            r16 = 0
            r33 = r18
            r34 = r14
            r35 = r15
            r36 = r11
            r37 = r16
            r38 = r1
            r39 = r12
            r40 = r13
            androidx.compose.runtime.State r11 = androidx.compose.animation.core.InfiniteTransitionKt.a(r33, r34, r35, r36, r37, r38, r39, r40)
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2 r12 = androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2.f8191z
            androidx.compose.animation.core.KeyframesSpec r12 = androidx.compose.animation.core.AnimationSpecKt.f(r12)
            r13 = 6
            r14 = 0
            r15 = 0
            r16 = 0
            r33 = r12
            r34 = r15
            r35 = r16
            r37 = r13
            r38 = r14
            androidx.compose.animation.core.InfiniteRepeatableSpec r12 = androidx.compose.animation.core.AnimationSpecKt.e(r33, r34, r35, r37, r38)
            r10 = r10 | 432(0x1b0, float:6.05E-43)
            int r13 = r20 << 9
            r10 = r10 | r13
            r13 = 8
            r14 = 0
            r15 = 1133576192(0x43910000, float:290.0)
            r16 = 0
            r33 = r18
            r34 = r14
            r35 = r15
            r36 = r12
            r37 = r16
            r38 = r1
            r39 = r10
            r40 = r13
            androidx.compose.runtime.State r10 = androidx.compose.animation.core.InfiniteTransitionKt.a(r33, r34, r35, r36, r37, r38, r39, r40)
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.ProgressSemanticsKt.a(r2)
            float r13 = f8166c
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.t(r12, r13)
            r13 = r31
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            r15 = 2048(0x800, float:2.87E-42)
            if (r14 != r15) goto L_0x025f
            r14 = r19
        L_0x025c:
            r15 = r30
            goto L_0x0261
        L_0x025f:
            r14 = r8
            goto L_0x025c
        L_0x0261:
            boolean r16 = r1.l(r15)
            r14 = r14 | r16
            boolean r16 = r1.W(r9)
            r14 = r14 | r16
            boolean r16 = r1.W(r11)
            r14 = r14 | r16
            boolean r16 = r1.W(r10)
            r14 = r14 | r16
            boolean r16 = r1.W(r0)
            r14 = r14 | r16
            r8 = r13 & 896(0x380, float:1.256E-42)
            r33 = r2
            r2 = 256(0x100, float:3.59E-43)
            if (r8 != r2) goto L_0x028a
            r2 = r19
            goto L_0x028b
        L_0x028a:
            r2 = 0
        L_0x028b:
            r2 = r2 | r14
            r8 = r13 & 112(0x70, float:1.57E-43)
            r8 = r8 ^ 48
            r14 = 32
            if (r8 <= r14) goto L_0x029a
            boolean r8 = r1.j(r3)
            if (r8 != 0) goto L_0x029e
        L_0x029a:
            r8 = r13 & 48
            if (r8 != r14) goto L_0x02a1
        L_0x029e:
            r14 = r19
            goto L_0x02a2
        L_0x02a1:
            r14 = 0
        L_0x02a2:
            r2 = r2 | r14
            java.lang.Object r8 = r1.g()
            if (r2 != 0) goto L_0x02b1
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r8 != r2) goto L_0x02cb
        L_0x02b1:
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1 r8 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
            r18 = r8
            r19 = r6
            r21 = r15
            r22 = r5
            r23 = r3
            r25 = r9
            r26 = r11
            r27 = r10
            r28 = r0
            r18.<init>(r19, r21, r22, r23, r25, r26, r27, r28)
            r1.N(r8)
        L_0x02cb:
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r0 = 0
            androidx.compose.foundation.CanvasKt.b(r12, r8, r1, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02da
            androidx.compose.runtime.ComposerKt.X()
        L_0x02da:
            r2 = r3
            r11 = r5
            r5 = r6
            r7 = r29
            r4 = r33
            goto L_0x02e9
        L_0x02e2:
            r1.B()
            r5 = r37
            r2 = r9
            r7 = r13
        L_0x02e9:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x02fe
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4 r12 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
            r0 = r12
            r1 = r4
            r4 = r11
            r8 = r41
            r9 = r42
            r0.<init>(r1, r2, r4, r5, r7, r8, r9)
            r10.a(r12)
        L_0x02fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.b(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void c(float r20, androidx.compose.ui.Modifier r21, long r22, float r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r6 = r26
            r0 = -409649739(0xffffffffe7953db5, float:-1.4095418E24)
            r1 = r25
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r27 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r6 | 6
            r3 = r2
            r2 = r20
            goto L_0x0029
        L_0x0015:
            r2 = r6 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r20
            boolean r3 = r1.h(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r6
            goto L_0x0029
        L_0x0026:
            r2 = r20
            r3 = r6
        L_0x0029:
            r4 = r27 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r21
            goto L_0x0044
        L_0x0032:
            r5 = r6 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r21
            boolean r7 = r1.W(r5)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r3 = r3 | r7
        L_0x0044:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005d
            r7 = r27 & 4
            if (r7 != 0) goto L_0x0057
            r7 = r22
            boolean r9 = r1.j(r7)
            if (r9 == 0) goto L_0x0059
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r7 = r22
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r9
            goto L_0x005f
        L_0x005d:
            r7 = r22
        L_0x005f:
            r9 = r27 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r24
            goto L_0x007a
        L_0x0068:
            r10 = r6 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r24
            boolean r11 = r1.h(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r3 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 == r12) goto L_0x0082
            r11 = 1
            goto L_0x0083
        L_0x0082:
            r11 = 0
        L_0x0083:
            r12 = r3 & 1
            boolean r11 = r1.E(r11, r12)
            if (r11 == 0) goto L_0x0107
            r1.p()
            r11 = r6 & 1
            if (r11 == 0) goto L_0x00a7
            boolean r11 = r1.J()
            if (r11 == 0) goto L_0x0099
            goto L_0x00a7
        L_0x0099:
            r1.B()
            r4 = r27 & 4
            if (r4 == 0) goto L_0x00a2
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a2:
            r4 = r5
        L_0x00a3:
            r18 = r7
            r5 = r10
            goto L_0x00c8
        L_0x00a7:
            if (r4 == 0) goto L_0x00ac
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ad
        L_0x00ac:
            r4 = r5
        L_0x00ad:
            r5 = r27 & 4
            if (r5 == 0) goto L_0x00be
            androidx.compose.material.MaterialTheme r5 = androidx.compose.material.MaterialTheme.f7937a
            r7 = 6
            androidx.compose.material.Colors r5 = r5.a(r1, r7)
            long r7 = r5.j()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00be:
            if (r9 == 0) goto L_0x00a3
            androidx.compose.material.ProgressIndicatorDefaults r5 = androidx.compose.material.ProgressIndicatorDefaults.f8161a
            float r5 = r5.a()
            r18 = r7
        L_0x00c8:
            r1.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00d7
            r7 = -1
            java.lang.String r8 = "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:451)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r7, r8)
        L_0x00d7:
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.f15975b
            long r12 = r0.e()
            androidx.compose.ui.graphics.StrokeCap$Companion r0 = androidx.compose.ui.graphics.StrokeCap.f16130b
            int r14 = r0.a()
            r0 = r3 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r7 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            r7 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r7
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r16 = r0 | r3
            r17 = 0
            r7 = r20
            r8 = r4
            r9 = r18
            r11 = r5
            r15 = r1
            a(r7, r8, r9, r11, r12, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x010e
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x010e
        L_0x0107:
            r1.B()
            r4 = r5
            r18 = r7
            r5 = r10
        L_0x010e:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.x()
            if (r8 == 0) goto L_0x0126
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$5 r9 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$5
            r0 = r9
            r1 = r20
            r2 = r4
            r3 = r18
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8.a(r9)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.c(float, androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void d(androidx.compose.ui.Modifier r19, long r20, float r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r5 = r24
            r0 = -392089979(0xffffffffe8a12e85, float:-6.089273E24)
            r1 = r23
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r25 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r5 | 6
            r4 = r3
            r3 = r19
            goto L_0x0029
        L_0x0015:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r19
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r5
            goto L_0x0029
        L_0x0026:
            r3 = r19
            r4 = r5
        L_0x0029:
            r6 = r5 & 48
            if (r6 != 0) goto L_0x0042
            r6 = r25 & 2
            if (r6 != 0) goto L_0x003c
            r6 = r20
            boolean r8 = r1.j(r6)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003c:
            r6 = r20
        L_0x003e:
            r8 = 16
        L_0x0040:
            r4 = r4 | r8
            goto L_0x0044
        L_0x0042:
            r6 = r20
        L_0x0044:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x004d
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r9 = r22
            goto L_0x005f
        L_0x004d:
            r9 = r5 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004a
            r9 = r22
            boolean r10 = r1.h(r9)
            if (r10 == 0) goto L_0x005c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r4 = r4 | r10
        L_0x005f:
            r10 = r4 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 == r11) goto L_0x0067
            r10 = 1
            goto L_0x0068
        L_0x0067:
            r10 = 0
        L_0x0068:
            r11 = r4 & 1
            boolean r10 = r1.E(r10, r11)
            if (r10 == 0) goto L_0x00ed
            r1.p()
            r10 = r5 & 1
            if (r10 == 0) goto L_0x0090
            boolean r10 = r1.J()
            if (r10 == 0) goto L_0x007e
            goto L_0x0090
        L_0x007e:
            r1.B()
            r2 = r25 & 2
            if (r2 == 0) goto L_0x0087
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0087:
            r2 = r3
        L_0x0088:
            r16 = r9
        L_0x008a:
            r17 = r6
            r6 = r4
            r3 = r17
            goto L_0x00b2
        L_0x0090:
            if (r2 == 0) goto L_0x0095
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0096
        L_0x0095:
            r2 = r3
        L_0x0096:
            r3 = r25 & 2
            if (r3 == 0) goto L_0x00a7
            androidx.compose.material.MaterialTheme r3 = androidx.compose.material.MaterialTheme.f7937a
            r6 = 6
            androidx.compose.material.Colors r3 = r3.a(r1, r6)
            long r6 = r3.j()
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a7:
            if (r8 == 0) goto L_0x0088
            androidx.compose.material.ProgressIndicatorDefaults r3 = androidx.compose.material.ProgressIndicatorDefaults.f8161a
            float r3 = r3.a()
            r16 = r3
            goto L_0x008a
        L_0x00b2:
            r1.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00c1
            r7 = -1
            java.lang.String r8 = "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:467)"
            androidx.compose.runtime.ComposerKt.Y(r0, r6, r7, r8)
        L_0x00c1:
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.f15975b
            long r10 = r0.e()
            androidx.compose.ui.graphics.StrokeCap$Companion r0 = androidx.compose.ui.graphics.StrokeCap.f16130b
            int r12 = r0.c()
            r0 = r6 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r7 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            r6 = r6 & 896(0x380, float:1.256E-42)
            r14 = r0 | r6
            r15 = 0
            r6 = r2
            r7 = r3
            r9 = r16
            r13 = r1
            b(r6, r7, r9, r10, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00ea
            androidx.compose.runtime.ComposerKt.X()
        L_0x00ea:
            r9 = r16
            goto L_0x00f2
        L_0x00ed:
            r1.B()
            r2 = r3
            r3 = r6
        L_0x00f2:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x0108
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$6 r8 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$6
            r0 = r8
            r1 = r2
            r2 = r3
            r4 = r9
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r4, r5, r6)
            r7.a(r8)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.d(androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float e(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float f(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float g(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final int h(State state) {
        return ((Number) state.getValue()).intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1} */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0249, code lost:
        if (r9 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ea, code lost:
        if (r1.j(r10) == false) goto L_0x01ef;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(androidx.compose.ui.Modifier r32, long r33, long r35, int r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r7 = r39
            r0 = 1501635280(0x598122d0, float:4.5435686E15)
            r1 = r38
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r40 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r7 | 6
            r4 = r3
            r3 = r32
            goto L_0x0029
        L_0x0015:
            r3 = r7 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r32
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r7
            goto L_0x0029
        L_0x0026:
            r3 = r32
            r4 = r7
        L_0x0029:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x0040
            r5 = r40 & 2
            r8 = r33
            if (r5 != 0) goto L_0x003c
            boolean r5 = r1.j(r8)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r4 = r4 | r5
            goto L_0x0042
        L_0x0040:
            r8 = r33
        L_0x0042:
            r5 = r7 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0059
            r5 = r40 & 4
            r10 = r35
            if (r5 != 0) goto L_0x0055
            boolean r5 = r1.j(r10)
            if (r5 == 0) goto L_0x0055
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r4 = r4 | r5
            goto L_0x005b
        L_0x0059:
            r10 = r35
        L_0x005b:
            r5 = r7 & 3072(0xc00, float:4.305E-42)
            r14 = 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x0075
            r5 = r40 & 8
            if (r5 != 0) goto L_0x006f
            r5 = r37
            boolean r12 = r1.i(r5)
            if (r12 == 0) goto L_0x0071
            r12 = r14
            goto L_0x0073
        L_0x006f:
            r5 = r37
        L_0x0071:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r4 = r4 | r12
            goto L_0x0077
        L_0x0075:
            r5 = r37
        L_0x0077:
            r12 = r4 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            r6 = 0
            r15 = 1
            if (r12 == r13) goto L_0x0081
            r12 = r15
            goto L_0x0082
        L_0x0081:
            r12 = r6
        L_0x0082:
            r13 = r4 & 1
            boolean r12 = r1.E(r12, r13)
            if (r12 == 0) goto L_0x0276
            r1.p()
            r12 = r7 & 1
            if (r12 == 0) goto L_0x00b2
            boolean r12 = r1.J()
            if (r12 == 0) goto L_0x0098
            goto L_0x00b2
        L_0x0098:
            r1.B()
            r2 = r40 & 2
            if (r2 == 0) goto L_0x00a1
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a1:
            r2 = r40 & 4
            if (r2 == 0) goto L_0x00a7
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a7:
            r2 = r40 & 8
            if (r2 == 0) goto L_0x00ad
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ad:
            r2 = r3
        L_0x00ae:
            r12 = r10
            r11 = r4
            r3 = r8
            goto L_0x00f1
        L_0x00b2:
            if (r2 == 0) goto L_0x00b7
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00b8
        L_0x00b7:
            r2 = r3
        L_0x00b8:
            r3 = r40 & 2
            if (r3 == 0) goto L_0x00c9
            androidx.compose.material.MaterialTheme r3 = androidx.compose.material.MaterialTheme.f7937a
            r8 = 6
            androidx.compose.material.Colors r3 = r3.a(r1, r8)
            long r8 = r3.j()
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c9:
            r3 = r40 & 4
            if (r3 == 0) goto L_0x00e3
            r23 = 14
            r24 = 0
            r19 = 1047904911(0x3e75c28f, float:0.24)
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r8
            long r10 = androidx.compose.ui.graphics.Color.l(r17, r19, r20, r21, r22, r23, r24)
            r3 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r3
        L_0x00e3:
            r3 = r40 & 8
            if (r3 == 0) goto L_0x00ae
            androidx.compose.ui.graphics.StrokeCap$Companion r3 = androidx.compose.ui.graphics.StrokeCap.f16130b
            int r3 = r3.a()
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r3
            goto L_0x00ae
        L_0x00f1:
            r1.U()
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0100
            r8 = -1
            java.lang.String r9 = "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:144)"
            androidx.compose.runtime.ComposerKt.Y(r0, r11, r8, r9)
        L_0x0100:
            r0 = 0
            androidx.compose.animation.core.InfiniteTransition r0 = androidx.compose.animation.core.InfiniteTransitionKt.c(r0, r1, r6, r15)
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2 r8 = androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2.f8210z
            androidx.compose.animation.core.KeyframesSpec r8 = androidx.compose.animation.core.AnimationSpecKt.f(r8)
            r9 = 6
            r10 = 0
            r17 = 0
            r18 = 0
            r32 = r8
            r33 = r17
            r34 = r18
            r36 = r9
            r37 = r10
            androidx.compose.animation.core.InfiniteRepeatableSpec r17 = androidx.compose.animation.core.AnimationSpecKt.e(r32, r33, r34, r36, r37)
            int r10 = androidx.compose.animation.core.InfiniteTransition.f2584f
            r8 = r10 | 432(0x1b0, float:6.05E-43)
            int r18 = androidx.compose.animation.core.InfiniteRepeatableSpec.f2580d
            int r9 = r18 << 9
            r19 = r8 | r9
            r20 = 8
            r9 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r8 = r0
            r6 = r10
            r10 = r21
            r27 = r11
            r11 = r17
            r28 = r12
            r12 = r22
            r13 = r1
            r14 = r19
            r16 = r15
            r7 = 256(0x100, float:3.59E-43)
            r15 = r20
            androidx.compose.runtime.State r23 = androidx.compose.animation.core.InfiniteTransitionKt.a(r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2 r8 = androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2.f8211z
            androidx.compose.animation.core.KeyframesSpec r8 = androidx.compose.animation.core.AnimationSpecKt.f(r8)
            r9 = 6
            r10 = 0
            r11 = 0
            r12 = 0
            r32 = r8
            r33 = r11
            r34 = r12
            r36 = r9
            r37 = r10
            androidx.compose.animation.core.InfiniteRepeatableSpec r11 = androidx.compose.animation.core.AnimationSpecKt.e(r32, r33, r34, r36, r37)
            r8 = r6 | 432(0x1b0, float:6.05E-43)
            int r9 = r18 << 9
            r14 = r8 | r9
            r15 = 8
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r8 = r0
            r13 = r1
            r30 = r23
            androidx.compose.runtime.State r24 = androidx.compose.animation.core.InfiniteTransitionKt.a(r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2 r8 = androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2.f8212z
            androidx.compose.animation.core.KeyframesSpec r8 = androidx.compose.animation.core.AnimationSpecKt.f(r8)
            r9 = 6
            r10 = 0
            r11 = 0
            r12 = 0
            r32 = r8
            r33 = r11
            r34 = r12
            r36 = r9
            r37 = r10
            androidx.compose.animation.core.InfiniteRepeatableSpec r11 = androidx.compose.animation.core.AnimationSpecKt.e(r32, r33, r34, r36, r37)
            r8 = r6 | 432(0x1b0, float:6.05E-43)
            int r9 = r18 << 9
            r14 = r8 | r9
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r8 = r0
            r13 = r1
            r31 = r24
            androidx.compose.runtime.State r25 = androidx.compose.animation.core.InfiniteTransitionKt.a(r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2 r8 = androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2.f8213z
            androidx.compose.animation.core.KeyframesSpec r8 = androidx.compose.animation.core.AnimationSpecKt.f(r8)
            r9 = 6
            r10 = 0
            r11 = 0
            r12 = 0
            r32 = r8
            r33 = r11
            r34 = r12
            r36 = r9
            r37 = r10
            androidx.compose.animation.core.InfiniteRepeatableSpec r11 = androidx.compose.animation.core.AnimationSpecKt.e(r32, r33, r34, r36, r37)
            r6 = r6 | 432(0x1b0, float:6.05E-43)
            int r8 = r18 << 9
            r14 = r6 | r8
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r8 = r0
            r13 = r1
            r0 = r25
            androidx.compose.runtime.State r6 = androidx.compose.animation.core.InfiniteTransitionKt.a(r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.ui.Modifier r8 = O(r2)
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.ProgressSemanticsKt.a(r8)
            float r9 = f8165b
            float r10 = f8164a
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.v(r8, r9, r10)
            r9 = r27
            r10 = r9 & 896(0x380, float:1.256E-42)
            r10 = r10 ^ 384(0x180, float:5.38E-43)
            if (r10 <= r7) goto L_0x01ed
            r10 = r28
            boolean r12 = r1.j(r10)
            if (r12 != 0) goto L_0x01f3
            goto L_0x01ef
        L_0x01ed:
            r10 = r28
        L_0x01ef:
            r12 = r9 & 384(0x180, float:5.38E-43)
            if (r12 != r7) goto L_0x01f6
        L_0x01f3:
            r15 = r16
            goto L_0x01f7
        L_0x01f6:
            r15 = 0
        L_0x01f7:
            r7 = r9 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 ^ 3072(0xc00, float:4.305E-42)
            r12 = 2048(0x800, float:2.87E-42)
            if (r7 <= r12) goto L_0x0205
            boolean r7 = r1.i(r5)
            if (r7 != 0) goto L_0x0209
        L_0x0205:
            r7 = r9 & 3072(0xc00, float:4.305E-42)
            if (r7 != r12) goto L_0x020c
        L_0x0209:
            r7 = r16
            goto L_0x020d
        L_0x020c:
            r7 = 0
        L_0x020d:
            r7 = r7 | r15
            r12 = r30
            boolean r13 = r1.W(r12)
            r7 = r7 | r13
            r13 = r31
            boolean r14 = r1.W(r13)
            r7 = r7 | r14
            r14 = r9 & 112(0x70, float:1.57E-43)
            r14 = r14 ^ 48
            r15 = 32
            if (r14 <= r15) goto L_0x022a
            boolean r14 = r1.j(r3)
            if (r14 != 0) goto L_0x022e
        L_0x022a:
            r9 = r9 & 48
            if (r9 != r15) goto L_0x0231
        L_0x022e:
            r15 = r16
            goto L_0x0232
        L_0x0231:
            r15 = 0
        L_0x0232:
            r7 = r7 | r15
            boolean r9 = r1.W(r0)
            r7 = r7 | r9
            boolean r9 = r1.W(r6)
            r7 = r7 | r9
            java.lang.Object r9 = r1.g()
            if (r7 != 0) goto L_0x024b
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x0263
        L_0x024b:
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1 r9 = new androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
            r17 = r9
            r18 = r10
            r20 = r5
            r21 = r3
            r23 = r12
            r24 = r13
            r25 = r0
            r26 = r6
            r17.<init>(r18, r20, r21, r23, r24, r25, r26)
            r1.N(r9)
        L_0x0263:
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r0 = 0
            androidx.compose.foundation.CanvasKt.b(r8, r9, r1, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0272
            androidx.compose.runtime.ComposerKt.X()
        L_0x0272:
            r8 = r3
        L_0x0273:
            r6 = r5
            r4 = r10
            goto L_0x027b
        L_0x0276:
            r1.B()
            r2 = r3
            goto L_0x0273
        L_0x027b:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x0290
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4 r11 = new androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
            r0 = r11
            r1 = r2
            r2 = r8
            r7 = r39
            r8 = r40
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r10.a(r11)
        L_0x0290:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.i(androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final /* synthetic */ void j(Modifier modifier, long j2, long j3, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        long j4;
        long j5;
        long j6;
        Modifier modifier3;
        int i5 = i2;
        Composer q2 = composer.q(-819397058);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i4 = (q2.W(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i4 = i5;
        }
        if ((i5 & 48) == 0) {
            j4 = j2;
            i4 |= ((i3 & 2) != 0 || !q2.j(j4)) ? 16 : 32;
        } else {
            j4 = j2;
        }
        if ((i5 & 384) == 0) {
            j5 = j3;
            i4 |= ((i3 & 4) != 0 || !q2.j(j5)) ? 128 : 256;
        } else {
            j5 = j3;
        }
        if (q2.E((i4 & 147) != 146, i4 & 1)) {
            q2.p();
            if ((i5 & 1) == 0 || q2.J()) {
                modifier3 = i6 != 0 ? Modifier.f15489d : modifier2;
                if ((i3 & 2) != 0) {
                    j4 = MaterialTheme.f7937a.a(q2, 6).j();
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    j5 = Color.l(j4, 0.24f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                    i4 &= -897;
                }
            } else {
                q2.B();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                modifier3 = modifier2;
            }
            int i7 = i4;
            j6 = j4;
            long j7 = j5;
            q2.U();
            if (ComposerKt.P()) {
                ComposerKt.Y(-819397058, i7, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:253)");
            }
            i(modifier3, j6, j7, StrokeCap.f16130b.a(), q2, i7 & 1022, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            j5 = j7;
        } else {
            q2.B();
            modifier3 = modifier2;
            j6 = j4;
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new ProgressIndicatorKt$LinearProgressIndicator$6(modifier3, j6, j5, i2, i3));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1} */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0199, code lost:
        if (r7 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x019b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(float r25, androidx.compose.ui.Modifier r26, long r27, long r29, int r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r1 = r25
            r8 = r33
            r0 = -531984864(0xffffffffe04a8e20, float:-5.8382555E19)
            r2 = r32
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r34 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r8 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.h(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r8
            goto L_0x0024
        L_0x0023:
            r3 = r8
        L_0x0024:
            r4 = r34 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r5 = r26
            goto L_0x003f
        L_0x002d:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x002a
            r5 = r26
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x003c
            r6 = 32
            goto L_0x003e
        L_0x003c:
            r6 = 16
        L_0x003e:
            r3 = r3 | r6
        L_0x003f:
            r6 = r8 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0056
            r6 = r34 & 4
            r9 = r27
            if (r6 != 0) goto L_0x0052
            boolean r6 = r2.j(r9)
            if (r6 == 0) goto L_0x0052
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0054
        L_0x0052:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0054:
            r3 = r3 | r6
            goto L_0x0058
        L_0x0056:
            r9 = r27
        L_0x0058:
            r6 = r8 & 3072(0xc00, float:4.305E-42)
            r11 = 2048(0x800, float:2.87E-42)
            if (r6 != 0) goto L_0x0070
            r6 = r34 & 8
            r12 = r29
            if (r6 != 0) goto L_0x006c
            boolean r6 = r2.j(r12)
            if (r6 == 0) goto L_0x006c
            r6 = r11
            goto L_0x006e
        L_0x006c:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x006e:
            r3 = r3 | r6
            goto L_0x0072
        L_0x0070:
            r12 = r29
        L_0x0072:
            r6 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x008b
            r6 = r34 & 16
            if (r6 != 0) goto L_0x0085
            r6 = r31
            boolean r15 = r2.i(r6)
            if (r15 == 0) goto L_0x0087
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0085:
            r6 = r31
        L_0x0087:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            r3 = r3 | r15
            goto L_0x008d
        L_0x008b:
            r6 = r31
        L_0x008d:
            r15 = r3 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            r14 = 0
            r16 = 1
            if (r15 == r7) goto L_0x0099
            r7 = r16
            goto L_0x009a
        L_0x0099:
            r7 = r14
        L_0x009a:
            r15 = r3 & 1
            boolean r7 = r2.E(r7, r15)
            if (r7 == 0) goto L_0x01be
            r2.p()
            r7 = r8 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            if (r7 == 0) goto L_0x00c9
            boolean r7 = r2.J()
            if (r7 == 0) goto L_0x00b3
            goto L_0x00c9
        L_0x00b3:
            r2.B()
            r4 = r34 & 4
            if (r4 == 0) goto L_0x00bc
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00bc:
            r4 = r34 & 8
            if (r4 == 0) goto L_0x00c2
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00c2:
            r4 = r34 & 16
            if (r4 == 0) goto L_0x00c7
            r3 = r3 & r15
        L_0x00c7:
            r4 = r5
            goto L_0x0105
        L_0x00c9:
            if (r4 == 0) goto L_0x00ce
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00cf
        L_0x00ce:
            r4 = r5
        L_0x00cf:
            r5 = r34 & 4
            if (r5 == 0) goto L_0x00e0
            androidx.compose.material.MaterialTheme r5 = androidx.compose.material.MaterialTheme.f7937a
            r7 = 6
            androidx.compose.material.Colors r5 = r5.a(r2, r7)
            long r9 = r5.j()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00e0:
            r5 = r34 & 8
            if (r5 == 0) goto L_0x00f9
            r23 = 14
            r24 = 0
            r19 = 1047904911(0x3e75c28f, float:0.24)
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r9
            long r12 = androidx.compose.ui.graphics.Color.l(r17, r19, r20, r21, r22, r23, r24)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00f9:
            r5 = r34 & 16
            if (r5 == 0) goto L_0x0105
            androidx.compose.ui.graphics.StrokeCap$Companion r5 = androidx.compose.ui.graphics.StrokeCap.f16130b
            int r5 = r5.a()
            r3 = r3 & r15
            r6 = r5
        L_0x0105:
            r2.U()
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0114
            r5 = -1
            java.lang.String r7 = "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:108)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r5, r7)
        L_0x0114:
            r0 = 0
            int r5 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r0 = r1
        L_0x011b:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0122
            r0 = r5
        L_0x0122:
            androidx.compose.ui.Modifier r5 = O(r4)
            r7 = 6
            r15 = 0
            r17 = 0
            r18 = 0
            r26 = r5
            r27 = r0
            r28 = r17
            r29 = r18
            r30 = r7
            r31 = r15
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.ProgressSemanticsKt.c(r26, r27, r28, r29, r30, r31)
            float r7 = f8165b
            float r15 = f8164a
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.v(r5, r7, r15)
            r7 = r3 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 ^ 3072(0xc00, float:4.305E-42)
            if (r7 <= r11) goto L_0x0150
            boolean r7 = r2.j(r12)
            if (r7 != 0) goto L_0x0154
        L_0x0150:
            r7 = r3 & 3072(0xc00, float:4.305E-42)
            if (r7 != r11) goto L_0x0157
        L_0x0154:
            r7 = r16
            goto L_0x0158
        L_0x0157:
            r7 = r14
        L_0x0158:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r3
            r11 = r11 ^ 24576(0x6000, float:3.4438E-41)
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r11 <= r15) goto L_0x0168
            boolean r11 = r2.i(r6)
            if (r11 != 0) goto L_0x016c
        L_0x0168:
            r11 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r11 != r15) goto L_0x016f
        L_0x016c:
            r11 = r16
            goto L_0x0170
        L_0x016f:
            r11 = r14
        L_0x0170:
            r7 = r7 | r11
            boolean r11 = r2.h(r0)
            r7 = r7 | r11
            r11 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 ^ 384(0x180, float:5.38E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r11 <= r15) goto L_0x0184
            boolean r11 = r2.j(r9)
            if (r11 != 0) goto L_0x018b
        L_0x0184:
            r3 = r3 & 384(0x180, float:5.38E-43)
            if (r3 != r15) goto L_0x0189
            goto L_0x018b
        L_0x0189:
            r16 = r14
        L_0x018b:
            r3 = r7 | r16
            java.lang.Object r7 = r2.g()
            if (r3 != 0) goto L_0x019b
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r7 != r3) goto L_0x01ad
        L_0x019b:
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1 r7 = new androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
            r17 = r7
            r18 = r12
            r20 = r6
            r21 = r0
            r22 = r9
            r17.<init>(r18, r20, r21, r22)
            r2.N(r7)
        L_0x01ad:
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            androidx.compose.foundation.CanvasKt.b(r5, r7, r2, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01bb
            androidx.compose.runtime.ComposerKt.X()
        L_0x01bb:
            r7 = r6
            r5 = r12
            goto L_0x01c3
        L_0x01be:
            r2.B()
            r4 = r5
            goto L_0x01bb
        L_0x01c3:
            androidx.compose.runtime.ScopeUpdateScope r11 = r2.x()
            if (r11 == 0) goto L_0x01da
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2 r12 = new androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
            r0 = r12
            r1 = r25
            r2 = r4
            r3 = r9
            r8 = r33
            r9 = r34
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            r11.a(r12)
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.k(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void l(float r20, androidx.compose.ui.Modifier r21, long r22, long r24, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r7 = r27
            r0 = -850309746(0xffffffffcd514d8e, float:-2.19470048E8)
            r1 = r26
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r28 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r20
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r20
            boolean r3 = r1.h(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r20
            r3 = r7
        L_0x0029:
            r4 = r28 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r21
            goto L_0x0044
        L_0x0032:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r21
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r7 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005b
            r6 = r28 & 4
            r8 = r22
            if (r6 != 0) goto L_0x0057
            boolean r6 = r1.j(r8)
            if (r6 == 0) goto L_0x0057
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r6
            goto L_0x005d
        L_0x005b:
            r8 = r22
        L_0x005d:
            r6 = r7 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0074
            r6 = r28 & 8
            r10 = r24
            if (r6 != 0) goto L_0x0070
            boolean r6 = r1.j(r10)
            if (r6 == 0) goto L_0x0070
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r3 = r3 | r6
            goto L_0x0076
        L_0x0074:
            r10 = r24
        L_0x0076:
            r6 = r3 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r6 == r12) goto L_0x007e
            r6 = 1
            goto L_0x007f
        L_0x007e:
            r6 = 0
        L_0x007f:
            r12 = r3 & 1
            boolean r6 = r1.E(r6, r12)
            if (r6 == 0) goto L_0x010a
            r1.p()
            r6 = r7 & 1
            if (r6 == 0) goto L_0x00a9
            boolean r6 = r1.J()
            if (r6 == 0) goto L_0x0095
            goto L_0x00a9
        L_0x0095:
            r1.B()
            r4 = r28 & 4
            if (r4 == 0) goto L_0x009e
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x009e:
            r4 = r28 & 8
            if (r4 == 0) goto L_0x00a4
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00a4:
            r4 = r5
            r5 = r8
        L_0x00a6:
            r18 = r10
            goto L_0x00d8
        L_0x00a9:
            if (r4 == 0) goto L_0x00ae
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00af
        L_0x00ae:
            r4 = r5
        L_0x00af:
            r5 = r28 & 4
            if (r5 == 0) goto L_0x00c1
            androidx.compose.material.MaterialTheme r5 = androidx.compose.material.MaterialTheme.f7937a
            r6 = 6
            androidx.compose.material.Colors r5 = r5.a(r1, r6)
            long r5 = r5.j()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00c2
        L_0x00c1:
            r5 = r8
        L_0x00c2:
            r8 = r28 & 8
            if (r8 == 0) goto L_0x00a6
            r14 = 14
            r15 = 0
            r10 = 1047904911(0x3e75c28f, float:0.24)
            r11 = 0
            r12 = 0
            r13 = 0
            r8 = r5
            long r8 = androidx.compose.ui.graphics.Color.l(r8, r10, r11, r12, r13, r14, r15)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r18 = r8
        L_0x00d8:
            r1.U()
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x00e7
            r8 = -1
            java.lang.String r9 = "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:238)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r8, r9)
        L_0x00e7:
            androidx.compose.ui.graphics.StrokeCap$Companion r0 = androidx.compose.ui.graphics.StrokeCap.f16130b
            int r14 = r0.a()
            r0 = r3 & 8190(0x1ffe, float:1.1477E-41)
            r17 = 0
            r8 = r20
            r9 = r4
            r10 = r5
            r12 = r18
            r15 = r1
            r16 = r0
            k(r8, r9, r10, r12, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0106
            androidx.compose.runtime.ComposerKt.X()
        L_0x0106:
            r8 = r5
            r5 = r18
            goto L_0x010f
        L_0x010a:
            r1.B()
            r4 = r5
            r5 = r10
        L_0x010f:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x0126
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$5 r11 = new androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$5
            r0 = r11
            r1 = r20
            r2 = r4
            r3 = r8
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r5, r7, r8)
            r10.a(r11)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.l(float, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float m(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float n(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float o(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float p(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
