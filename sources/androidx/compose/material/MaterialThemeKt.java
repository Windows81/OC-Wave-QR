package androidx.compose.material;

import kotlin.Metadata;

@Metadata
public final class MaterialThemeKt {
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a7, code lost:
        if ((r46 & 4) != 0) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.material.Colors r40, androidx.compose.material.Typography r41, androidx.compose.material.Shapes r42, kotlin.jvm.functions.Function2 r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            r4 = r43
            r5 = r45
            r0 = -891417079(0xffffffffcade0e09, float:-7276292.5)
            r1 = r44
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0024
            r2 = r46 & 1
            if (r2 != 0) goto L_0x001f
            r2 = r40
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0021
            r3 = 4
            goto L_0x0022
        L_0x001f:
            r2 = r40
        L_0x0021:
            r3 = 2
        L_0x0022:
            r3 = r3 | r5
            goto L_0x0027
        L_0x0024:
            r2 = r40
            r3 = r5
        L_0x0027:
            r6 = r5 & 48
            if (r6 != 0) goto L_0x0040
            r6 = r46 & 2
            if (r6 != 0) goto L_0x003a
            r6 = r41
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003a:
            r6 = r41
        L_0x003c:
            r7 = 16
        L_0x003e:
            r3 = r3 | r7
            goto L_0x0042
        L_0x0040:
            r6 = r41
        L_0x0042:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005b
            r7 = r46 & 4
            if (r7 != 0) goto L_0x0055
            r7 = r42
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x0057
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0055:
            r7 = r42
        L_0x0057:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r8
            goto L_0x005d
        L_0x005b:
            r7 = r42
        L_0x005d:
            r8 = r46 & 8
            if (r8 == 0) goto L_0x0064
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0074
        L_0x0064:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0074
            boolean r8 = r1.l(r4)
            if (r8 == 0) goto L_0x0071
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r8
        L_0x0074:
            r8 = r3 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            r10 = 0
            r11 = 1
            if (r8 == r9) goto L_0x007e
            r8 = r11
            goto L_0x007f
        L_0x007e:
            r8 = r10
        L_0x007f:
            r9 = r3 & 1
            boolean r8 = r1.E(r8, r9)
            if (r8 == 0) goto L_0x0183
            r1.p()
            r8 = r5 & 1
            r9 = 6
            if (r8 == 0) goto L_0x00ac
            boolean r8 = r1.J()
            if (r8 == 0) goto L_0x0096
            goto L_0x00ac
        L_0x0096:
            r1.B()
            r8 = r46 & 1
            if (r8 == 0) goto L_0x009f
            r3 = r3 & -15
        L_0x009f:
            r8 = r46 & 2
            if (r8 == 0) goto L_0x00a5
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a5:
            r8 = r46 & 4
            if (r8 == 0) goto L_0x00cf
        L_0x00a9:
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00cf
        L_0x00ac:
            r8 = r46 & 1
            if (r8 == 0) goto L_0x00b8
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r2 = r2.a(r1, r9)
            r3 = r3 & -15
        L_0x00b8:
            r8 = r46 & 2
            if (r8 == 0) goto L_0x00c4
            androidx.compose.material.MaterialTheme r6 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Typography r6 = r6.c(r1, r9)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c4:
            r8 = r46 & 4
            if (r8 == 0) goto L_0x00cf
            androidx.compose.material.MaterialTheme r7 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Shapes r7 = r7.b(r1, r9)
            goto L_0x00a9
        L_0x00cf:
            r1.U()
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x00de
            r8 = -1
            java.lang.String r12 = "androidx.compose.material.MaterialTheme (MaterialTheme.kt:63)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r8, r12)
        L_0x00de:
            java.lang.Object r0 = r1.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r0 != r3) goto L_0x0110
            r38 = 8191(0x1fff, float:1.1478E-41)
            r39 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r12 = r2
            androidx.compose.material.Colors r0 = androidx.compose.material.Colors.b(r12, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r39)
            r1.N(r0)
        L_0x0110:
            androidx.compose.material.Colors r0 = (androidx.compose.material.Colors) r0
            androidx.compose.material.ColorsKt.g(r0, r2)
            r16 = 7
            r17 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            androidx.compose.foundation.IndicationNodeFactory r3 = androidx.compose.material.RippleKt.f(r12, r13, r14, r16, r17)
            androidx.compose.foundation.text.selection.TextSelectionColors r8 = androidx.compose.material.MaterialTextSelectionColorsKt.e(r0, r1, r10)
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.material.ColorsKt.c()
            androidx.compose.runtime.ProvidedValue r12 = r10.d(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ContentAlphaKt.a()
            androidx.compose.material.ContentAlpha r10 = androidx.compose.material.ContentAlpha.f7561a
            float r9 = r10.c(r1, r9)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            androidx.compose.runtime.ProvidedValue r13 = r0.d(r9)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.IndicationKt.a()
            androidx.compose.runtime.ProvidedValue r14 = r0.d(r3)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ShapesKt.a()
            androidx.compose.runtime.ProvidedValue r15 = r0.d(r7)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.b()
            androidx.compose.runtime.ProvidedValue r16 = r0.d(r8)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.TypographyKt.c()
            androidx.compose.runtime.ProvidedValue r17 = r0.d(r6)
            androidx.compose.runtime.ProvidedValue[] r0 = new androidx.compose.runtime.ProvidedValue[]{r12, r13, r14, r15, r16, r17}
            androidx.compose.material.MaterialThemeKt$MaterialTheme$1 r3 = new androidx.compose.material.MaterialThemeKt$MaterialTheme$1
            r3.<init>(r6, r4)
            r8 = 54
            r9 = -1740102967(0xffffffff984822c9, float:-2.5866956E-24)
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r11, r3, r1, r8)
            int r8 = androidx.compose.runtime.ProvidedValue.f14769i
            r8 = r8 | 48
            androidx.compose.runtime.CompositionLocalKt.d(r0, r3, r1, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0181
            androidx.compose.runtime.ComposerKt.X()
        L_0x0181:
            r3 = r7
            goto L_0x0187
        L_0x0183:
            r1.B()
            goto L_0x0181
        L_0x0187:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x019e
            androidx.compose.material.MaterialThemeKt$MaterialTheme$2 r8 = new androidx.compose.material.MaterialThemeKt$MaterialTheme$2
            r0 = r8
            r1 = r2
            r2 = r6
            r4 = r43
            r5 = r45
            r6 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MaterialThemeKt.a(androidx.compose.material.Colors, androidx.compose.material.Typography, androidx.compose.material.Shapes, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
