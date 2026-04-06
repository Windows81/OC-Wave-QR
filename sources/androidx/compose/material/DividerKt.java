package androidx.compose.material;

import kotlin.Metadata;

@Metadata
public final class DividerKt {
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.Modifier r24, long r25, float r27, float r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r6 = r30
            r0 = -1249392198(0xffffffffb587c9ba, float:-1.0116994E-6)
            r1 = r29
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r6 | 6
            r4 = r3
            r3 = r24
            goto L_0x0029
        L_0x0015:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r24
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r6
            goto L_0x0029
        L_0x0026:
            r3 = r24
            r4 = r6
        L_0x0029:
            r5 = r6 & 48
            if (r5 != 0) goto L_0x0040
            r5 = r31 & 2
            r7 = r25
            if (r5 != 0) goto L_0x003c
            boolean r5 = r1.j(r7)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r4 = r4 | r5
            goto L_0x0042
        L_0x0040:
            r7 = r25
        L_0x0042:
            r5 = r31 & 4
            if (r5 == 0) goto L_0x004b
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0048:
            r9 = r27
            goto L_0x005d
        L_0x004b:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0048
            r9 = r27
            boolean r10 = r1.h(r9)
            if (r10 == 0) goto L_0x005a
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r4 = r4 | r10
        L_0x005d:
            r10 = r31 & 8
            if (r10 == 0) goto L_0x0066
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0063:
            r11 = r28
            goto L_0x0078
        L_0x0066:
            r11 = r6 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0063
            r11 = r28
            boolean r12 = r1.h(r11)
            if (r12 == 0) goto L_0x0075
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r4 = r4 | r12
        L_0x0078:
            r12 = r4 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            r14 = 0
            r15 = 1
            if (r12 == r13) goto L_0x0082
            r12 = r15
            goto L_0x0083
        L_0x0082:
            r12 = r14
        L_0x0083:
            r13 = r4 & 1
            boolean r12 = r1.E(r12, r13)
            if (r12 == 0) goto L_0x0166
            r1.p()
            r12 = r6 & 1
            if (r12 == 0) goto L_0x00a4
            boolean r12 = r1.J()
            if (r12 == 0) goto L_0x0099
            goto L_0x00a4
        L_0x0099:
            r1.B()
            r2 = r31 & 2
            if (r2 == 0) goto L_0x00a2
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a2:
            r2 = r3
            goto L_0x00dc
        L_0x00a4:
            if (r2 == 0) goto L_0x00a9
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00aa
        L_0x00a9:
            r2 = r3
        L_0x00aa:
            r3 = r31 & 2
            if (r3 == 0) goto L_0x00cc
            androidx.compose.material.MaterialTheme r3 = androidx.compose.material.MaterialTheme.f7937a
            r7 = 6
            androidx.compose.material.Colors r3 = r3.a(r1, r7)
            long r16 = r3.i()
            r22 = 14
            r23 = 0
            r18 = 1039516303(0x3df5c28f, float:0.12)
            r19 = 0
            r20 = 0
            r21 = 0
            long r7 = androidx.compose.ui.graphics.Color.l(r16, r18, r19, r20, r21, r22, r23)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00cc:
            if (r5 == 0) goto L_0x00d4
            float r3 = (float) r15
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            r9 = r3
        L_0x00d4:
            if (r10 == 0) goto L_0x00dc
            float r3 = (float) r14
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            r11 = r3
        L_0x00dc:
            r1.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x00eb
            r3 = -1
            java.lang.String r5 = "androidx.compose.material.Divider (Divider.kt:51)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r3, r5)
        L_0x00eb:
            r0 = 0
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x00f3
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0105
        L_0x00f3:
            androidx.compose.ui.Modifier$Companion r16 = androidx.compose.ui.Modifier.f15489d
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r11
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
        L_0x0105:
            androidx.compose.ui.unit.Dp$Companion r4 = androidx.compose.ui.unit.Dp.f19144A
            float r4 = r4.a()
            boolean r4 = androidx.compose.ui.unit.Dp.o(r9, r4)
            if (r4 == 0) goto L_0x0130
            r4 = -129273423(0xfffffffff84b71b1, float:-1.6505347E34)
            r1.X(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r4 = r1.C(r4)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.ui.unit.Density) r4
            float r4 = r4.getDensity()
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 / r4
            float r4 = androidx.compose.ui.unit.Dp.m(r5)
            r1.M()
            goto L_0x013a
        L_0x0130:
            r4 = -129206866(0xfffffffff84c75ae, float:-1.658774E34)
            r1.X(r4)
            r1.M()
            r4 = r9
        L_0x013a:
            androidx.compose.ui.Modifier r3 = r2.o0(r3)
            r5 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r3, r0, r15, r5)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.i(r0, r4)
            r3 = 2
            r4 = 0
            r24 = r0
            r25 = r7
            r27 = r5
            r28 = r3
            r29 = r4
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.b(r24, r25, r27, r28, r29)
            androidx.compose.foundation.layout.BoxKt.a(r0, r1, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0163
            androidx.compose.runtime.ComposerKt.X()
        L_0x0163:
            r4 = r9
            r5 = r11
            goto L_0x016b
        L_0x0166:
            r1.B()
            r2 = r3
            goto L_0x0163
        L_0x016b:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x0180
            androidx.compose.material.DividerKt$Divider$1 r10 = new androidx.compose.material.DividerKt$Divider$1
            r0 = r10
            r1 = r2
            r2 = r7
            r6 = r30
            r7 = r31
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r9.a(r10)
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DividerKt.a(androidx.compose.ui.Modifier, long, float, float, androidx.compose.runtime.Composer, int, int):void");
    }
}
