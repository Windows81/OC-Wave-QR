package androidx.compose.material;

import kotlin.Metadata;

@Metadata
public final class CheckboxDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final CheckboxDefaults f7447a = new CheckboxDefaults();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: androidx.compose.material.DefaultCheckboxColors} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: androidx.compose.material.DefaultCheckboxColors} */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0128, code lost:
        if (r2 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x012a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.CheckboxColors a(long r31, long r33, long r35, long r37, long r39, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            r30 = this;
            r0 = r41
            r1 = r42
            r2 = r43 & 1
            r3 = 6
            if (r2 == 0) goto L_0x0014
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r2 = r2.a(r0, r3)
            long r4 = r2.l()
            goto L_0x0016
        L_0x0014:
            r4 = r31
        L_0x0016:
            r2 = r43 & 2
            if (r2 == 0) goto L_0x0033
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r2 = r2.a(r0, r3)
            long r6 = r2.i()
            r12 = 14
            r13 = 0
            r8 = 1058642330(0x3f19999a, float:0.6)
            r9 = 0
            r10 = 0
            r11 = 0
            long r6 = androidx.compose.ui.graphics.Color.l(r6, r8, r9, r10, r11, r12, r13)
            r11 = r6
            goto L_0x0035
        L_0x0033:
            r11 = r33
        L_0x0035:
            r2 = r43 & 4
            if (r2 == 0) goto L_0x0045
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r2 = r2.a(r0, r3)
            long r6 = r2.n()
            r7 = r6
            goto L_0x0047
        L_0x0045:
            r7 = r35
        L_0x0047:
            r2 = r43 & 8
            if (r2 == 0) goto L_0x0076
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r2 = r2.a(r0, r3)
            long r9 = r2.i()
            androidx.compose.material.ContentAlpha r2 = androidx.compose.material.ContentAlpha.f7561a
            float r2 = r2.b(r0, r3)
            r6 = 14
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r31 = r9
            r33 = r2
            r34 = r14
            r35 = r15
            r36 = r16
            r37 = r6
            r38 = r13
            long r9 = androidx.compose.ui.graphics.Color.l(r31, r33, r34, r35, r36, r37, r38)
            r13 = r9
            goto L_0x0078
        L_0x0076:
            r13 = r37
        L_0x0078:
            r2 = r43 & 16
            if (r2 == 0) goto L_0x009c
            androidx.compose.material.ContentAlpha r2 = androidx.compose.material.ContentAlpha.f7561a
            float r2 = r2.b(r0, r3)
            r6 = 14
            r9 = 0
            r10 = 0
            r15 = 0
            r16 = 0
            r31 = r4
            r33 = r2
            r34 = r10
            r35 = r15
            r36 = r16
            r37 = r6
            r38 = r9
            long r9 = androidx.compose.ui.graphics.Color.l(r31, r33, r34, r35, r36, r37, r38)
            goto L_0x009e
        L_0x009c:
            r9 = r39
        L_0x009e:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x00ad
            r2 = -1
            java.lang.String r6 = "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:227)"
            r15 = 469524104(0x1bfc5e88, float:4.1750992E-22)
            androidx.compose.runtime.ComposerKt.Y(r15, r1, r2, r6)
        L_0x00ad:
            r2 = r1 & 14
            r2 = r2 ^ r3
            r3 = 4
            r15 = 1
            if (r2 <= r3) goto L_0x00ba
            boolean r2 = r0.j(r4)
            if (r2 != 0) goto L_0x00be
        L_0x00ba:
            r2 = r1 & 6
            if (r2 != r3) goto L_0x00c0
        L_0x00be:
            r2 = r15
            goto L_0x00c1
        L_0x00c0:
            r2 = 0
        L_0x00c1:
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r6 = 32
            if (r3 <= r6) goto L_0x00cf
            boolean r3 = r0.j(r11)
            if (r3 != 0) goto L_0x00d3
        L_0x00cf:
            r3 = r1 & 48
            if (r3 != r6) goto L_0x00d5
        L_0x00d3:
            r3 = r15
            goto L_0x00d6
        L_0x00d5:
            r3 = 0
        L_0x00d6:
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r3 = r3 ^ 384(0x180, float:5.38E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r3 <= r6) goto L_0x00e5
            boolean r3 = r0.j(r7)
            if (r3 != 0) goto L_0x00e9
        L_0x00e5:
            r3 = r1 & 384(0x180, float:5.38E-43)
            if (r3 != r6) goto L_0x00eb
        L_0x00e9:
            r3 = r15
            goto L_0x00ec
        L_0x00eb:
            r3 = 0
        L_0x00ec:
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 ^ 3072(0xc00, float:4.305E-42)
            r6 = 2048(0x800, float:2.87E-42)
            if (r3 <= r6) goto L_0x00fb
            boolean r3 = r0.j(r13)
            if (r3 != 0) goto L_0x00ff
        L_0x00fb:
            r3 = r1 & 3072(0xc00, float:4.305E-42)
            if (r3 != r6) goto L_0x0101
        L_0x00ff:
            r3 = r15
            goto L_0x0102
        L_0x0101:
            r3 = 0
        L_0x0102:
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r3 = r3 ^ 24576(0x6000, float:3.4438E-41)
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r3 <= r6) goto L_0x0113
            boolean r3 = r0.j(r9)
            if (r3 != 0) goto L_0x0117
        L_0x0113:
            r1 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r1 != r6) goto L_0x0119
        L_0x0117:
            r6 = r15
            goto L_0x011a
        L_0x0119:
            r6 = 0
        L_0x011a:
            r1 = r2 | r6
            java.lang.Object r2 = r41.g()
            if (r1 != 0) goto L_0x012a
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0178
        L_0x012a:
            r1 = 14
            r2 = 0
            r3 = 0
            r6 = 0
            r15 = 0
            r16 = 0
            r31 = r7
            r33 = r3
            r34 = r6
            r35 = r15
            r36 = r16
            r37 = r1
            r38 = r2
            long r1 = androidx.compose.ui.graphics.Color.l(r31, r33, r34, r35, r36, r37, r38)
            r27 = r9
            r9 = r1
            r1 = 14
            r2 = 0
            r31 = r4
            r37 = r1
            r38 = r2
            long r1 = androidx.compose.ui.graphics.Color.l(r31, r33, r34, r35, r36, r37, r38)
            r25 = r13
            r13 = r1
            r1 = 14
            r2 = 0
            r31 = r25
            r37 = r1
            r38 = r2
            long r17 = androidx.compose.ui.graphics.Color.l(r31, r33, r34, r35, r36, r37, r38)
            androidx.compose.material.DefaultCheckboxColors r2 = new androidx.compose.material.DefaultCheckboxColors
            r6 = r2
            r29 = 0
            r23 = r11
            r11 = r4
            r15 = r25
            r19 = r27
            r21 = r4
            r6.<init>(r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29)
            r0.N(r2)
        L_0x0178:
            androidx.compose.material.DefaultCheckboxColors r2 = (androidx.compose.material.DefaultCheckboxColors) r2
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0183
            androidx.compose.runtime.ComposerKt.X()
        L_0x0183:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxDefaults.a(long, long, long, long, long, androidx.compose.runtime.Composer, int, int):androidx.compose.material.CheckboxColors");
    }
}
