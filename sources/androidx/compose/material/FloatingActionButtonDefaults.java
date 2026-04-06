package androidx.compose.material;

import kotlin.Metadata;

@Metadata
public final class FloatingActionButtonDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final FloatingActionButtonDefaults f7863a = new FloatingActionButtonDefaults();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: androidx.compose.material.DefaultFloatingActionButtonElevation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: androidx.compose.material.DefaultFloatingActionButtonElevation} */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009d, code lost:
        if (r10 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x009f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.FloatingActionButtonElevation a(float r9, float r10, float r11, float r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            r8 = this;
            r0 = r15 & 1
            r1 = 6
            if (r0 == 0) goto L_0x000a
            float r9 = (float) r1
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
        L_0x000a:
            r3 = r9
            r9 = r15 & 2
            if (r9 == 0) goto L_0x0016
            r9 = 12
            float r9 = (float) r9
            float r10 = androidx.compose.ui.unit.Dp.m(r9)
        L_0x0016:
            r4 = r10
            r9 = r15 & 4
            r10 = 8
            if (r9 == 0) goto L_0x0022
            float r9 = (float) r10
            float r11 = androidx.compose.ui.unit.Dp.m(r9)
        L_0x0022:
            r5 = r11
            r9 = r15 & 8
            if (r9 == 0) goto L_0x002c
            float r9 = (float) r10
            float r12 = androidx.compose.ui.unit.Dp.m(r9)
        L_0x002c:
            r6 = r12
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x003c
            r9 = -1
            java.lang.String r10 = "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:238)"
            r11 = 380403812(0x16ac8064, float:2.7869125E-25)
            androidx.compose.runtime.ComposerKt.Y(r11, r14, r9, r10)
        L_0x003c:
            r9 = r14 & 14
            r9 = r9 ^ r1
            r10 = 4
            r11 = 0
            r12 = 1
            if (r9 <= r10) goto L_0x004a
            boolean r9 = r13.h(r3)
            if (r9 != 0) goto L_0x004e
        L_0x004a:
            r9 = r14 & 6
            if (r9 != r10) goto L_0x0050
        L_0x004e:
            r9 = r12
            goto L_0x0051
        L_0x0050:
            r9 = r11
        L_0x0051:
            r10 = r14 & 112(0x70, float:1.57E-43)
            r10 = r10 ^ 48
            r15 = 32
            if (r10 <= r15) goto L_0x005f
            boolean r10 = r13.h(r4)
            if (r10 != 0) goto L_0x0063
        L_0x005f:
            r10 = r14 & 48
            if (r10 != r15) goto L_0x0065
        L_0x0063:
            r10 = r12
            goto L_0x0066
        L_0x0065:
            r10 = r11
        L_0x0066:
            r9 = r9 | r10
            r10 = r14 & 896(0x380, float:1.256E-42)
            r10 = r10 ^ 384(0x180, float:5.38E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r10 <= r15) goto L_0x0075
            boolean r10 = r13.h(r5)
            if (r10 != 0) goto L_0x0079
        L_0x0075:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != r15) goto L_0x007b
        L_0x0079:
            r10 = r12
            goto L_0x007c
        L_0x007b:
            r10 = r11
        L_0x007c:
            r9 = r9 | r10
            r10 = r14 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 ^ 3072(0xc00, float:4.305E-42)
            r15 = 2048(0x800, float:2.87E-42)
            if (r10 <= r15) goto L_0x008b
            boolean r10 = r13.h(r6)
            if (r10 != 0) goto L_0x008f
        L_0x008b:
            r10 = r14 & 3072(0xc00, float:4.305E-42)
            if (r10 != r15) goto L_0x0090
        L_0x008f:
            r11 = r12
        L_0x0090:
            r9 = r9 | r11
            java.lang.Object r10 = r13.g()
            if (r9 != 0) goto L_0x009f
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x00a9
        L_0x009f:
            androidx.compose.material.DefaultFloatingActionButtonElevation r10 = new androidx.compose.material.DefaultFloatingActionButtonElevation
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r13.N(r10)
        L_0x00a9:
            androidx.compose.material.DefaultFloatingActionButtonElevation r10 = (androidx.compose.material.DefaultFloatingActionButtonElevation) r10
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x00b4
            androidx.compose.runtime.ComposerKt.X()
        L_0x00b4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonDefaults.a(float, float, float, float, androidx.compose.runtime.Composer, int, int):androidx.compose.material.FloatingActionButtonElevation");
    }
}
