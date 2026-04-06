package androidx.compose.foundation.layout;

import kotlin.Metadata;

@Metadata
public final class BoxWithConstraintsKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.Modifier r16, androidx.compose.ui.Alignment r17, boolean r18, kotlin.jvm.functions.Function3 r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r4 = r19
            r5 = r21
            r0 = 1781813501(0x6a3450fd, float:5.4497275E25)
            r1 = r20
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r22 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r5 | 6
            r6 = r3
            r3 = r16
            goto L_0x002b
        L_0x0017:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r16
            boolean r6 = r1.W(r3)
            if (r6 == 0) goto L_0x0025
            r6 = 4
            goto L_0x0026
        L_0x0025:
            r6 = 2
        L_0x0026:
            r6 = r6 | r5
            goto L_0x002b
        L_0x0028:
            r3 = r16
            r6 = r5
        L_0x002b:
            r7 = r22 & 2
            if (r7 == 0) goto L_0x0034
            r6 = r6 | 48
        L_0x0031:
            r8 = r17
            goto L_0x0046
        L_0x0034:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x0031
            r8 = r17
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0045
        L_0x0043:
            r9 = 16
        L_0x0045:
            r6 = r6 | r9
        L_0x0046:
            r9 = r22 & 4
            if (r9 == 0) goto L_0x004f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r10 = r18
            goto L_0x0061
        L_0x004f:
            r10 = r5 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004c
            r10 = r18
            boolean r11 = r1.d(r10)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r11
        L_0x0061:
            r11 = r22 & 8
            r12 = 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x006a:
            r11 = r5 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0079
            boolean r11 = r1.l(r4)
            if (r11 == 0) goto L_0x0076
            r11 = r12
            goto L_0x0078
        L_0x0076:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r6 = r6 | r11
        L_0x0079:
            r11 = r6 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            r14 = 0
            r15 = 1
            if (r11 == r13) goto L_0x0083
            r11 = r15
            goto L_0x0084
        L_0x0083:
            r11 = r14
        L_0x0084:
            r13 = r6 & 1
            boolean r11 = r1.E(r11, r13)
            if (r11 == 0) goto L_0x00e1
            if (r2 == 0) goto L_0x0091
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0092
        L_0x0091:
            r2 = r3
        L_0x0092:
            if (r7 == 0) goto L_0x009b
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r3 = r3.o()
            goto L_0x009c
        L_0x009b:
            r3 = r8
        L_0x009c:
            if (r9 == 0) goto L_0x009f
            r10 = r14
        L_0x009f:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00ab
            r7 = -1
            java.lang.String r8 = "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)"
            androidx.compose.runtime.ComposerKt.Y(r0, r6, r7, r8)
        L_0x00ab:
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.g(r3, r10)
            r7 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != r12) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r15 = r14
        L_0x00b5:
            boolean r7 = r1.W(r0)
            r7 = r7 | r15
            java.lang.Object r8 = r1.g()
            if (r7 != 0) goto L_0x00c8
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00d0
        L_0x00c8:
            androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1 r8 = new androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
            r8.<init>(r0, r4)
            r1.N(r8)
        L_0x00d0:
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r0 = r6 & 14
            androidx.compose.ui.layout.SubcomposeLayoutKt.a(r2, r8, r1, r0, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00e6
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00e6
        L_0x00e1:
            r1.B()
            r2 = r3
            r3 = r8
        L_0x00e6:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x00fe
            androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2 r8 = new androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2
            r0 = r8
            r1 = r2
            r2 = r3
            r3 = r10
            r4 = r19
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.BoxWithConstraintsKt.a(androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
