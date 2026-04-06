package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class SwipeToDismissKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f8545a = Dp.m((float) 56);

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.material.DismissState r16, androidx.compose.ui.Modifier r17, java.util.Set r18, kotlin.jvm.functions.Function1 r19, kotlin.jvm.functions.Function3 r20, kotlin.jvm.functions.Function3 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r7 = r23
            r0 = 634380143(0x25cfdf6f, float:3.606018E-16)
            r1 = r22
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r24 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r16
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r16
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r16
            r3 = r7
        L_0x0029:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r17
            goto L_0x0044
        L_0x0032:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r17
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r24 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r18
            goto L_0x005f
        L_0x004d:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r18
            boolean r9 = r1.l(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r24 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r19
            goto L_0x007a
        L_0x0068:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r19
            boolean r11 = r1.l(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r24 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r15 = r20
            goto L_0x0095
        L_0x0083:
            r11 = r7 & 24576(0x6000, float:3.4438E-41)
            r15 = r20
            if (r11 != 0) goto L_0x0095
            boolean r11 = r1.l(r15)
            if (r11 == 0) goto L_0x0092
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r11
        L_0x0095:
            r11 = r24 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x009f
            r3 = r3 | r12
            r14 = r21
            goto L_0x00b1
        L_0x009f:
            r11 = r7 & r12
            r14 = r21
            if (r11 != 0) goto L_0x00b1
            boolean r11 = r1.l(r14)
            if (r11 == 0) goto L_0x00ae
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r3 = r3 | r11
        L_0x00b1:
            r11 = 74899(0x12493, float:1.04956E-40)
            r11 = r11 & r3
            r12 = 74898(0x12492, float:1.04954E-40)
            r13 = 1
            if (r11 == r12) goto L_0x00bd
            r11 = r13
            goto L_0x00be
        L_0x00bd:
            r11 = 0
        L_0x00be:
            r12 = r3 & 1
            boolean r11 = r1.E(r11, r12)
            if (r11 == 0) goto L_0x0122
            if (r4 == 0) goto L_0x00cb
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00cc
        L_0x00cb:
            r4 = r5
        L_0x00cc:
            if (r6 == 0) goto L_0x00db
            androidx.compose.material.DismissDirection r5 = androidx.compose.material.DismissDirection.EndToStart
            androidx.compose.material.DismissDirection r6 = androidx.compose.material.DismissDirection.StartToEnd
            androidx.compose.material.DismissDirection[] r5 = new androidx.compose.material.DismissDirection[]{r5, r6}
            java.util.Set r5 = kotlin.collections.SetsKt.f(r5)
            goto L_0x00dc
        L_0x00db:
            r5 = r8
        L_0x00dc:
            if (r9 == 0) goto L_0x00e1
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$1 r6 = androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$1.f8546z
            goto L_0x00e2
        L_0x00e1:
            r6 = r10
        L_0x00e2:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x00ee
            r8 = -1
            java.lang.String r9 = "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r8, r9)
        L_0x00ee:
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2 r0 = new androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2
            r8 = r0
            r9 = r5
            r10 = r6
            r11 = r16
            r12 = r20
            r2 = r13
            r13 = r21
            r8.<init>(r9, r10, r11, r12, r13)
            r8 = 54
            r9 = 338007641(0x14259659, float:8.360022E-27)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r2, r0, r1, r8)
            int r0 = r3 >> 3
            r0 = r0 & 14
            r13 = r0 | 3072(0xc00, float:4.305E-42)
            r0 = 6
            r9 = 0
            r10 = 0
            r8 = r4
            r12 = r1
            r14 = r0
            androidx.compose.foundation.layout.BoxWithConstraintsKt.a(r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x011e
            androidx.compose.runtime.ComposerKt.X()
        L_0x011e:
            r2 = r4
            r3 = r5
            r4 = r6
            goto L_0x0128
        L_0x0122:
            r1.B()
            r2 = r5
            r3 = r8
            r4 = r10
        L_0x0128:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x0141
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$3 r10 = new androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$3
            r0 = r10
            r1 = r16
            r5 = r20
            r6 = r21
            r7 = r23
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt.a(androidx.compose.material.DismissState, androidx.compose.ui.Modifier, java.util.Set, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final DismissDirection d(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        DismissValue dismissValue3 = DismissValue.Default;
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == dismissValue3) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == dismissValue3) {
            return DismissDirection.EndToStart;
        }
        return null;
    }
}
