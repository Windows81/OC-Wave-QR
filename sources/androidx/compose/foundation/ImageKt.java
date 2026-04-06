package androidx.compose.foundation;

import kotlin.Metadata;

@Metadata
public final class ImageKt {
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.graphics.painter.Painter r19, java.lang.String r20, androidx.compose.ui.Modifier r21, androidx.compose.ui.Alignment r22, androidx.compose.ui.layout.ContentScale r23, float r24, androidx.compose.ui.graphics.ColorFilter r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r2 = r20
            r8 = r27
            r0 = 1142754848(0x441d0e20, float:628.2207)
            r1 = r26
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0017
            r3 = r8 | 6
            r4 = r3
            r3 = r19
            goto L_0x002b
        L_0x0017:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r19
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r8
            goto L_0x002b
        L_0x0028:
            r3 = r19
            r4 = r8
        L_0x002b:
            r5 = r28 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
            goto L_0x0042
        L_0x0032:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x0042
            boolean r5 = r1.W(r2)
            if (r5 == 0) goto L_0x003f
            r5 = 32
            goto L_0x0041
        L_0x003f:
            r5 = 16
        L_0x0041:
            r4 = r4 | r5
        L_0x0042:
            r5 = r28 & 4
            if (r5 == 0) goto L_0x004b
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0048:
            r7 = r21
            goto L_0x005d
        L_0x004b:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0048
            r7 = r21
            boolean r9 = r1.W(r7)
            if (r9 == 0) goto L_0x005a
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r4 = r4 | r9
        L_0x005d:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0066
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0063:
            r10 = r22
            goto L_0x0078
        L_0x0066:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0063
            r10 = r22
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x0075
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r4 = r4 | r11
        L_0x0078:
            r11 = r28 & 16
            if (r11 == 0) goto L_0x0081
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x007e:
            r12 = r23
            goto L_0x0093
        L_0x0081:
            r12 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x007e
            r12 = r23
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0090
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r4 = r4 | r13
        L_0x0093:
            r13 = r28 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009d
            r4 = r4 | r14
        L_0x009a:
            r14 = r24
            goto L_0x00ae
        L_0x009d:
            r14 = r14 & r8
            if (r14 != 0) goto L_0x009a
            r14 = r24
            boolean r15 = r1.h(r14)
            if (r15 == 0) goto L_0x00ab
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r4 = r4 | r15
        L_0x00ae:
            r15 = r28 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00b9
            r4 = r4 | r16
            r6 = r25
            goto L_0x00cc
        L_0x00b9:
            r16 = r8 & r16
            r6 = r25
            if (r16 != 0) goto L_0x00cc
            boolean r16 = r1.W(r6)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r4 = r4 | r16
        L_0x00cc:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r4 & r16
            r3 = 599186(0x92492, float:8.39638E-40)
            r6 = 1
            if (r0 == r3) goto L_0x00d9
            r0 = r6
            goto L_0x00da
        L_0x00d9:
            r0 = 0
        L_0x00da:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x01ef
            if (r5 == 0) goto L_0x00e7
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r7 = r0
        L_0x00e7:
            if (r9 == 0) goto L_0x00f0
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r0 = r0.e()
            goto L_0x00f1
        L_0x00f0:
            r0 = r10
        L_0x00f1:
            if (r11 == 0) goto L_0x00fa
            androidx.compose.ui.layout.ContentScale$Companion r3 = androidx.compose.ui.layout.ContentScale.f17026a
            androidx.compose.ui.layout.ContentScale r3 = r3.d()
            goto L_0x00fb
        L_0x00fa:
            r3 = r12
        L_0x00fb:
            if (r13 == 0) goto L_0x0100
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0101
        L_0x0100:
            r5 = r14
        L_0x0101:
            r9 = 0
            if (r15 == 0) goto L_0x0107
            r18 = r9
            goto L_0x0109
        L_0x0107:
            r18 = r25
        L_0x0109:
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0118
            r10 = -1
            java.lang.String r11 = "androidx.compose.foundation.Image (Image.kt:247)"
            r12 = 1142754848(0x441d0e20, float:628.2207)
            androidx.compose.runtime.ComposerKt.Y(r12, r4, r10, r11)
        L_0x0118:
            if (r2 == 0) goto L_0x014c
            r10 = 1040425059(0x3e03a063, float:0.12854151)
            r1.X(r10)
            androidx.compose.ui.Modifier$Companion r10 = androidx.compose.ui.Modifier.f15489d
            r4 = r4 & 112(0x70, float:1.57E-43)
            r11 = 32
            if (r4 != r11) goto L_0x012a
            r4 = r6
            goto L_0x012b
        L_0x012a:
            r4 = 0
        L_0x012b:
            java.lang.Object r11 = r1.g()
            if (r4 != 0) goto L_0x0139
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r11 != r4) goto L_0x0141
        L_0x0139:
            androidx.compose.foundation.ImageKt$Image$semantics$1$1 r11 = new androidx.compose.foundation.ImageKt$Image$semantics$1$1
            r11.<init>(r2)
            r1.N(r11)
        L_0x0141:
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r4 = 0
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r10, r4, r11, r6, r9)
            r1.M()
            goto L_0x0157
        L_0x014c:
            r4 = 1040583841(0x3e060ca1, float:0.13090755)
            r1.X(r4)
            r1.M()
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
        L_0x0157:
            androidx.compose.ui.Modifier r4 = r7.o0(r6)
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.draw.ClipKt.b(r4)
            r16 = 2
            r17 = 0
            r11 = 0
            r10 = r19
            r12 = r0
            r13 = r3
            r14 = r5
            r15 = r18
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.draw.PainterModifierKt.b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            androidx.compose.foundation.ImageKt$Image$1 r6 = androidx.compose.foundation.ImageKt$Image$1.f3081a
            r9 = 0
            int r9 = androidx.compose.runtime.ComposablesKt.a(r1, r9)
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.e(r1, r4)
            androidx.compose.runtime.CompositionLocalMap r10 = r1.I()
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r12 = r11.a()
            androidx.compose.runtime.Applier r13 = r1.v()
            if (r13 != 0) goto L_0x018d
            androidx.compose.runtime.ComposablesKt.d()
        L_0x018d:
            r1.s()
            boolean r13 = r1.n()
            if (r13 == 0) goto L_0x019a
            r1.y(r12)
            goto L_0x019d
        L_0x019a:
            r1.K()
        L_0x019d:
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.b(r1)
            kotlin.jvm.functions.Function2 r13 = r11.c()
            androidx.compose.runtime.Updater.g(r12, r6, r13)
            kotlin.jvm.functions.Function2 r6 = r11.e()
            androidx.compose.runtime.Updater.g(r12, r10, r6)
            kotlin.jvm.functions.Function2 r6 = r11.d()
            androidx.compose.runtime.Updater.g(r12, r4, r6)
            kotlin.jvm.functions.Function2 r4 = r11.b()
            boolean r6 = r12.n()
            if (r6 != 0) goto L_0x01ce
            java.lang.Object r6 = r12.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r10)
            if (r6 != 0) goto L_0x01dc
        L_0x01ce:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r12.N(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r12.A(r6, r4)
        L_0x01dc:
            r1.T()
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x01e8
            androidx.compose.runtime.ComposerKt.X()
        L_0x01e8:
            r4 = r0
            r6 = r5
            r5 = r3
            r3 = r7
            r7 = r18
            goto L_0x01f8
        L_0x01ef:
            r1.B()
            r3 = r7
            r4 = r10
            r5 = r12
            r6 = r14
            r7 = r25
        L_0x01f8:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x020f
            androidx.compose.foundation.ImageKt$Image$2 r11 = new androidx.compose.foundation.ImageKt$Image$2
            r0 = r11
            r1 = r19
            r2 = r20
            r8 = r27
            r9 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x020f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ImageKt.a(androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.compose.ui.graphics.painter.BitmapPainter} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.graphics.ImageBitmap r16, java.lang.String r17, androidx.compose.ui.Modifier r18, androidx.compose.ui.Alignment r19, androidx.compose.ui.layout.ContentScale r20, float r21, androidx.compose.ui.graphics.ColorFilter r22, int r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r7 = r24
            r0 = r25
            r1 = r26
            r2 = r1 & 4
            if (r2 == 0) goto L_0x000d
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x000f
        L_0x000d:
            r2 = r18
        L_0x000f:
            r3 = r1 & 8
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r3 = r3.e()
            goto L_0x001c
        L_0x001a:
            r3 = r19
        L_0x001c:
            r4 = r1 & 16
            if (r4 == 0) goto L_0x0027
            androidx.compose.ui.layout.ContentScale$Companion r4 = androidx.compose.ui.layout.ContentScale.f17026a
            androidx.compose.ui.layout.ContentScale r4 = r4.d()
            goto L_0x0029
        L_0x0027:
            r4 = r20
        L_0x0029:
            r5 = r1 & 32
            if (r5 == 0) goto L_0x0030
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0032
        L_0x0030:
            r5 = r21
        L_0x0032:
            r6 = r1 & 64
            if (r6 == 0) goto L_0x0038
            r6 = 0
            goto L_0x003a
        L_0x0038:
            r6 = r22
        L_0x003a:
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0046
            androidx.compose.ui.graphics.drawscope.DrawScope$Companion r1 = androidx.compose.ui.graphics.drawscope.DrawScope.f16288g
            int r1 = r1.b()
            r13 = r1
            goto L_0x0048
        L_0x0046:
            r13 = r23
        L_0x0048:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0057
            r1 = -1
            java.lang.String r8 = "androidx.compose.foundation.Image (Image.kt:156)"
            r9 = -1396260732(0xffffffffacc6c084, float:-5.648872E-12)
            androidx.compose.runtime.ComposerKt.Y(r9, r0, r1, r8)
        L_0x0057:
            r1 = r16
            boolean r8 = r7.W(r1)
            java.lang.Object r9 = r24.g()
            if (r8 != 0) goto L_0x006b
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x007a
        L_0x006b:
            r14 = 6
            r15 = 0
            r9 = 0
            r11 = 0
            r8 = r16
            androidx.compose.ui.graphics.painter.BitmapPainter r9 = androidx.compose.ui.graphics.painter.BitmapPainterKt.b(r8, r9, r11, r13, r14, r15)
            r7.N(r9)
        L_0x007a:
            r1 = r9
            androidx.compose.ui.graphics.painter.BitmapPainter r1 = (androidx.compose.ui.graphics.painter.BitmapPainter) r1
            r8 = 4194288(0x3ffff0, float:5.87745E-39)
            r8 = r8 & r0
            r9 = 0
            r0 = r1
            r1 = r17
            r7 = r24
            a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0093
            androidx.compose.runtime.ComposerKt.X()
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ImageKt.b(androidx.compose.ui.graphics.ImageBitmap, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter, int, androidx.compose.runtime.Composer, int, int):void");
    }
}
