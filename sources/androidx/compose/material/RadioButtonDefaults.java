package androidx.compose.material;

import kotlin.Metadata;

@Metadata
public final class RadioButtonDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final RadioButtonDefaults f8219a = new RadioButtonDefaults();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: androidx.compose.material.DefaultRadioButtonColors} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: androidx.compose.material.DefaultRadioButtonColors} */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b6, code lost:
        if (r2 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x00b8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.RadioButtonColors a(long r20, long r22, long r24, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r19 = this;
            r0 = r26
            r1 = r27
            r2 = r28 & 1
            r3 = 6
            if (r2 == 0) goto L_0x0015
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r2 = r2.a(r0, r3)
            long r4 = r2.l()
            r7 = r4
            goto L_0x0017
        L_0x0015:
            r7 = r20
        L_0x0017:
            r2 = r28 & 2
            if (r2 == 0) goto L_0x0035
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r2 = r2.a(r0, r3)
            long r9 = r2.i()
            r15 = 14
            r16 = 0
            r11 = 1058642330(0x3f19999a, float:0.6)
            r12 = 0
            r13 = 0
            r14 = 0
            long r4 = androidx.compose.ui.graphics.Color.l(r9, r11, r12, r13, r14, r15, r16)
            r9 = r4
            goto L_0x0037
        L_0x0035:
            r9 = r22
        L_0x0037:
            r2 = 4
            r4 = r28 & 4
            if (r4 == 0) goto L_0x005a
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r4 = r4.a(r0, r3)
            long r11 = r4.i()
            androidx.compose.material.ContentAlpha r4 = androidx.compose.material.ContentAlpha.f7561a
            float r13 = r4.b(r0, r3)
            r17 = 14
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            long r4 = androidx.compose.ui.graphics.Color.l(r11, r13, r14, r15, r16, r17, r18)
            r11 = r4
            goto L_0x005c
        L_0x005a:
            r11 = r24
        L_0x005c:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x006b
            r4 = -1
            java.lang.String r5 = "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:162)"
            r6 = 1370708026(0x51b3583a, float:9.6284918E10)
            androidx.compose.runtime.ComposerKt.Y(r6, r1, r4, r5)
        L_0x006b:
            r4 = r1 & 14
            r3 = r3 ^ r4
            r4 = 0
            r5 = 1
            if (r3 <= r2) goto L_0x0078
            boolean r3 = r0.j(r7)
            if (r3 != 0) goto L_0x007c
        L_0x0078:
            r3 = r1 & 6
            if (r3 != r2) goto L_0x007e
        L_0x007c:
            r2 = r5
            goto L_0x007f
        L_0x007e:
            r2 = r4
        L_0x007f:
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r6 = 32
            if (r3 <= r6) goto L_0x008d
            boolean r3 = r0.j(r9)
            if (r3 != 0) goto L_0x0091
        L_0x008d:
            r3 = r1 & 48
            if (r3 != r6) goto L_0x0093
        L_0x0091:
            r3 = r5
            goto L_0x0094
        L_0x0093:
            r3 = r4
        L_0x0094:
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r3 = r3 ^ 384(0x180, float:5.38E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r3 <= r6) goto L_0x00a3
            boolean r3 = r0.j(r11)
            if (r3 != 0) goto L_0x00a7
        L_0x00a3:
            r1 = r1 & 384(0x180, float:5.38E-43)
            if (r1 != r6) goto L_0x00a8
        L_0x00a7:
            r4 = r5
        L_0x00a8:
            r1 = r2 | r4
            java.lang.Object r2 = r26.g()
            if (r1 != 0) goto L_0x00b8
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x00c2
        L_0x00b8:
            androidx.compose.material.DefaultRadioButtonColors r2 = new androidx.compose.material.DefaultRadioButtonColors
            r13 = 0
            r6 = r2
            r6.<init>(r7, r9, r11, r13)
            r0.N(r2)
        L_0x00c2:
            androidx.compose.material.DefaultRadioButtonColors r2 = (androidx.compose.material.DefaultRadioButtonColors) r2
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00cd
            androidx.compose.runtime.ComposerKt.X()
        L_0x00cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.RadioButtonDefaults.a(long, long, long, androidx.compose.runtime.Composer, int, int):androidx.compose.material.RadioButtonColors");
    }
}
