package androidx.compose.material;

import androidx.compose.ui.window.PopupProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AndroidMenu_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final PopupProperties f7124a = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* JADX WARNING: Removed duplicated region for block: B:126:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r24, kotlin.jvm.functions.Function0 r25, androidx.compose.ui.Modifier r26, long r27, androidx.compose.foundation.ScrollState r29, androidx.compose.ui.window.PopupProperties r30, kotlin.jvm.functions.Function3 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r9 = r33
            r0 = -2135362555(0xffffffff80b8f405, float:-1.6985269E-38)
            r1 = r32
            androidx.compose.runtime.Composer r8 = r1.q(r0)
            r1 = r34 & 1
            if (r1 == 0) goto L_0x0014
            r1 = r9 | 6
            r10 = r24
            goto L_0x0026
        L_0x0014:
            r1 = r9 & 6
            r10 = r24
            if (r1 != 0) goto L_0x0025
            boolean r1 = r8.d(r10)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r9
            goto L_0x0026
        L_0x0025:
            r1 = r9
        L_0x0026:
            r3 = r34 & 2
            if (r3 == 0) goto L_0x002f
            r1 = r1 | 48
            r11 = r25
            goto L_0x0041
        L_0x002f:
            r3 = r9 & 48
            r11 = r25
            if (r3 != 0) goto L_0x0041
            boolean r3 = r8.l(r11)
            if (r3 == 0) goto L_0x003e
            r3 = 32
            goto L_0x0040
        L_0x003e:
            r3 = 16
        L_0x0040:
            r1 = r1 | r3
        L_0x0041:
            r3 = r34 & 4
            if (r3 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r4 = r26
            goto L_0x005c
        L_0x004a:
            r4 = r9 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0047
            r4 = r26
            boolean r5 = r8.W(r4)
            if (r5 == 0) goto L_0x0059
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r5
        L_0x005c:
            r5 = r34 & 8
            if (r5 == 0) goto L_0x0065
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r6 = r27
            goto L_0x0077
        L_0x0065:
            r6 = r9 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0062
            r6 = r27
            boolean r12 = r8.j(r6)
            if (r12 == 0) goto L_0x0074
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r1 = r1 | r12
        L_0x0077:
            r12 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0090
            r12 = r34 & 16
            if (r12 != 0) goto L_0x008a
            r12 = r29
            boolean r13 = r8.W(r12)
            if (r13 == 0) goto L_0x008c
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008e
        L_0x008a:
            r12 = r29
        L_0x008c:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008e:
            r1 = r1 | r13
            goto L_0x0092
        L_0x0090:
            r12 = r29
        L_0x0092:
            r13 = r34 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009c
            r1 = r1 | r14
        L_0x0099:
            r14 = r30
            goto L_0x00ad
        L_0x009c:
            r14 = r14 & r9
            if (r14 != 0) goto L_0x0099
            r14 = r30
            boolean r15 = r8.W(r14)
            if (r15 == 0) goto L_0x00aa
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r1 = r1 | r15
        L_0x00ad:
            r15 = r34 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00b8
            r1 = r1 | r16
        L_0x00b5:
            r15 = r31
            goto L_0x00cb
        L_0x00b8:
            r15 = r9 & r16
            if (r15 != 0) goto L_0x00b5
            r15 = r31
            boolean r16 = r8.l(r15)
            if (r16 == 0) goto L_0x00c7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c9
        L_0x00c7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c9:
            r1 = r1 | r16
        L_0x00cb:
            r16 = 599187(0x92493, float:8.3964E-40)
            r2 = r1 & r16
            r0 = 599186(0x92492, float:8.39638E-40)
            r4 = 1
            if (r2 == r0) goto L_0x00d8
            r0 = r4
            goto L_0x00d9
        L_0x00d8:
            r0 = 0
        L_0x00d9:
            r2 = r1 & 1
            boolean r0 = r8.E(r0, r2)
            if (r0 == 0) goto L_0x0217
            r8.p()
            r0 = r9 & 1
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0101
            boolean r0 = r8.J()
            if (r0 == 0) goto L_0x00f2
            goto L_0x0101
        L_0x00f2:
            r8.B()
            r0 = r34 & 16
            if (r0 == 0) goto L_0x00fa
            r1 = r1 & r2
        L_0x00fa:
            r0 = r26
            r23 = r14
            r14 = r12
            r12 = r6
            goto L_0x0130
        L_0x0101:
            if (r3 == 0) goto L_0x0106
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0108
        L_0x0106:
            r0 = r26
        L_0x0108:
            r3 = 0
            if (r5 == 0) goto L_0x0119
            float r5 = (float) r3
            float r6 = androidx.compose.ui.unit.Dp.m(r5)
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            long r5 = androidx.compose.ui.unit.DpKt.a(r6, r5)
            goto L_0x011a
        L_0x0119:
            r5 = r6
        L_0x011a:
            r7 = r34 & 16
            if (r7 == 0) goto L_0x0124
            androidx.compose.foundation.ScrollState r3 = androidx.compose.foundation.ScrollKt.c(r3, r8, r3, r4)
            r1 = r1 & r2
            r12 = r3
        L_0x0124:
            if (r13 == 0) goto L_0x012d
            androidx.compose.ui.window.PopupProperties r2 = f7124a
            r23 = r2
        L_0x012a:
            r14 = r12
            r12 = r5
            goto L_0x0130
        L_0x012d:
            r23 = r14
            goto L_0x012a
        L_0x0130:
            r8.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0142
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)"
            r5 = -2135362555(0xffffffff80b8f405, float:-1.6985269E-38)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r3)
        L_0x0142:
            java.lang.Object r2 = r8.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r3.a()
            if (r2 != r5) goto L_0x0158
            androidx.compose.animation.core.MutableTransitionState r2 = new androidx.compose.animation.core.MutableTransitionState
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r2.<init>(r5)
            r8.N(r2)
        L_0x0158:
            androidx.compose.animation.core.MutableTransitionState r2 = (androidx.compose.animation.core.MutableTransitionState) r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r24)
            r2.h(r5)
            java.lang.Object r5 = r2.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0185
            java.lang.Object r5 = r2.b()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x017a
            goto L_0x0185
        L_0x017a:
            r1 = 1378753932(0x522e1d8c, float:1.86955006E11)
            r8.X(r1)
            r8.M()
            goto L_0x0208
        L_0x0185:
            r5 = 1377962068(0x52220854, float:1.73981106E11)
            r8.X(r5)
            java.lang.Object r5 = r8.g()
            java.lang.Object r6 = r3.a()
            if (r5 != r6) goto L_0x01a8
            androidx.compose.ui.graphics.TransformOrigin$Companion r5 = androidx.compose.ui.graphics.TransformOrigin.f16150b
            long r5 = r5.a()
            androidx.compose.ui.graphics.TransformOrigin r5 = androidx.compose.ui.graphics.TransformOrigin.b(r5)
            r6 = 0
            r7 = 2
            androidx.compose.runtime.MutableState r5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r5, r6, r7, r6)
            r8.N(r5)
        L_0x01a8:
            androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r6 = r8.C(r6)
            r20 = r6
            androidx.compose.ui.unit.Density r20 = (androidx.compose.ui.unit.Density) r20
            java.lang.Object r6 = r8.g()
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x01c8
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1 r6 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
            r6.<init>(r5)
            r8.N(r6)
        L_0x01c8:
            r21 = r6
            kotlin.jvm.functions.Function2 r21 = (kotlin.jvm.functions.Function2) r21
            androidx.compose.material.DropdownMenuPositionProvider r3 = new androidx.compose.material.DropdownMenuPositionProvider
            r22 = 0
            r17 = r3
            r18 = r12
            r17.<init>(r18, r20, r21, r22)
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2 r6 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
            r16 = r6
            r17 = r2
            r18 = r5
            r19 = r14
            r20 = r0
            r21 = r31
            r16.<init>(r17, r18, r19, r20, r21)
            r2 = 54
            r5 = -47803778(0xfffffffffd26927e, float:-1.383828E37)
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r4, r6, r8, r2)
            r2 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            int r1 = r1 >> 9
            r1 = r1 & 896(0x380, float:1.256E-42)
            r6 = r2 | r1
            r7 = 0
            r1 = r3
            r2 = r25
            r3 = r23
            r5 = r8
            androidx.compose.ui.window.AndroidPopup_androidKt.a(r1, r2, r3, r4, r5, r6, r7)
            r8.M()
        L_0x0208:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0211
            androidx.compose.runtime.ComposerKt.X()
        L_0x0211:
            r3 = r0
            r4 = r12
            r6 = r14
            r7 = r23
            goto L_0x021f
        L_0x0217:
            r8.B()
            r3 = r26
            r4 = r6
            r6 = r12
            r7 = r14
        L_0x021f:
            androidx.compose.runtime.ScopeUpdateScope r12 = r8.x()
            if (r12 == 0) goto L_0x0238
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$3 r13 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$3
            r0 = r13
            r1 = r24
            r2 = r25
            r8 = r31
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            r12.a(r13)
        L_0x0238:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AndroidMenu_androidKt.a(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, long, androidx.compose.foundation.ScrollState, androidx.compose.ui.window.PopupProperties, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void b(boolean r29, kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, long r32, androidx.compose.ui.window.PopupProperties r34, kotlin.jvm.functions.Function3 r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r8 = r37
            r0 = -840283139(0xffffffffcdea4bfd, float:-4.91356064E8)
            r1 = r36
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r38 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r8 | 6
            r3 = r2
            r2 = r29
            goto L_0x0029
        L_0x0015:
            r2 = r8 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r29
            boolean r3 = r1.d(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r8
            goto L_0x0029
        L_0x0026:
            r2 = r29
            r3 = r8
        L_0x0029:
            r4 = r38 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r4 = r30
            goto L_0x0044
        L_0x0032:
            r4 = r8 & 48
            if (r4 != 0) goto L_0x002f
            r4 = r30
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r3 = r3 | r5
        L_0x0044:
            r5 = r38 & 4
            if (r5 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r6 = r31
            goto L_0x005f
        L_0x004d:
            r6 = r8 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004a
            r6 = r31
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r7
        L_0x005f:
            r7 = r38 & 8
            if (r7 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r9 = r32
            goto L_0x007a
        L_0x0068:
            r9 = r8 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0065
            r9 = r32
            boolean r11 = r1.j(r9)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r38 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r34
            goto L_0x0095
        L_0x0083:
            r12 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r34
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
        L_0x0095:
            r13 = r38 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009f
            r3 = r3 | r14
            r15 = r35
            goto L_0x00b1
        L_0x009f:
            r13 = r8 & r14
            r15 = r35
            if (r13 != 0) goto L_0x00b1
            boolean r13 = r1.l(r15)
            if (r13 == 0) goto L_0x00ae
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r3 = r3 | r13
        L_0x00b1:
            r13 = 74899(0x12493, float:1.04956E-40)
            r13 = r13 & r3
            r14 = 74898(0x12492, float:1.04954E-40)
            r0 = 1
            if (r13 == r14) goto L_0x00bd
            r13 = r0
            goto L_0x00be
        L_0x00bd:
            r13 = 0
        L_0x00be:
            r14 = r3 & 1
            boolean r13 = r1.E(r13, r14)
            if (r13 == 0) goto L_0x0134
            if (r5 == 0) goto L_0x00cb
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            r6 = r5
        L_0x00cb:
            if (r7 == 0) goto L_0x00db
            r5 = 0
            float r7 = (float) r5
            float r5 = androidx.compose.ui.unit.Dp.m(r7)
            float r7 = androidx.compose.ui.unit.Dp.m(r7)
            long r9 = androidx.compose.ui.unit.DpKt.a(r5, r7)
        L_0x00db:
            r20 = r9
            if (r11 == 0) goto L_0x00f3
            androidx.compose.ui.window.PopupProperties r5 = new androidx.compose.ui.window.PopupProperties
            r27 = 14
            r28 = 0
            r23 = 1
            r24 = 0
            r25 = 0
            r26 = 0
            r22 = r5
            r22.<init>((boolean) r23, (boolean) r24, (boolean) r25, (boolean) r26, (int) r27, (kotlin.jvm.internal.DefaultConstructorMarker) r28)
            goto L_0x00f4
        L_0x00f3:
            r5 = r12
        L_0x00f4:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0103
            r7 = -1
            java.lang.String r9 = "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:56)"
            r10 = -840283139(0xffffffffcdea4bfd, float:-4.91356064E8)
            androidx.compose.runtime.ComposerKt.Y(r10, r3, r7, r9)
        L_0x0103:
            r7 = 0
            androidx.compose.foundation.ScrollState r14 = androidx.compose.foundation.ScrollKt.c(r7, r1, r7, r0)
            r0 = r3 & 8190(0x1ffe, float:1.1477E-41)
            int r3 = r3 << 3
            r7 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r3
            r0 = r0 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r7
            r18 = r0 | r3
            r19 = 0
            r9 = r29
            r10 = r30
            r11 = r6
            r12 = r20
            r15 = r5
            r16 = r35
            r17 = r1
            a(r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x012f
            androidx.compose.runtime.ComposerKt.X()
        L_0x012f:
            r3 = r6
            r9 = r20
            r6 = r5
            goto L_0x0139
        L_0x0134:
            r1.B()
            r3 = r6
            r6 = r12
        L_0x0139:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x0153
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1 r12 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
            r0 = r12
            r1 = r29
            r2 = r30
            r4 = r9
            r7 = r35
            r8 = r37
            r9 = r38
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            r11.a(r12)
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AndroidMenu_androidKt.b(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, long, androidx.compose.ui.window.PopupProperties, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(kotlin.jvm.functions.Function0 r18, androidx.compose.ui.Modifier r19, boolean r20, androidx.compose.foundation.layout.PaddingValues r21, androidx.compose.foundation.interaction.MutableInteractionSource r22, kotlin.jvm.functions.Function3 r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r7 = r25
            r0 = -1988562892(0xffffffff8978f034, float:-2.9964857E-33)
            r1 = r24
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r26 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r18
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r18
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r18
            r3 = r7
        L_0x0029:
            r4 = r26 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r19
            goto L_0x0044
        L_0x0032:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r19
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r26 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r20
            goto L_0x005f
        L_0x004d:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r20
            boolean r9 = r1.d(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r26 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r21
            goto L_0x007a
        L_0x0068:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r21
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r26 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r22
            goto L_0x0095
        L_0x0083:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r22
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
        L_0x0095:
            r13 = r26 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009f
            r3 = r3 | r14
            r15 = r23
            goto L_0x00b1
        L_0x009f:
            r13 = r7 & r14
            r15 = r23
            if (r13 != 0) goto L_0x00b1
            boolean r13 = r1.l(r15)
            if (r13 == 0) goto L_0x00ae
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r3 = r3 | r13
        L_0x00b1:
            r13 = 74899(0x12493, float:1.04956E-40)
            r13 = r13 & r3
            r14 = 74898(0x12492, float:1.04954E-40)
            r16 = 1
            if (r13 == r14) goto L_0x00bf
            r13 = r16
            goto L_0x00c0
        L_0x00bf:
            r13 = 0
        L_0x00c0:
            r14 = r3 & 1
            boolean r13 = r1.E(r13, r14)
            if (r13 == 0) goto L_0x0114
            if (r4 == 0) goto L_0x00cd
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ce
        L_0x00cd:
            r4 = r5
        L_0x00ce:
            if (r6 == 0) goto L_0x00d3
            r5 = r16
            goto L_0x00d4
        L_0x00d3:
            r5 = r8
        L_0x00d4:
            if (r9 == 0) goto L_0x00dd
            androidx.compose.material.MenuDefaults r6 = androidx.compose.material.MenuDefaults.f7946a
            androidx.compose.foundation.layout.PaddingValues r6 = r6.a()
            goto L_0x00de
        L_0x00dd:
            r6 = r10
        L_0x00de:
            if (r11 == 0) goto L_0x00e4
            r8 = 0
            r17 = r8
            goto L_0x00e6
        L_0x00e4:
            r17 = r12
        L_0x00e6:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x00f2
            r8 = -1
            java.lang.String r9 = "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r8, r9)
        L_0x00f2:
            r0 = 524286(0x7fffe, float:7.34681E-40)
            r0 = r0 & r3
            r16 = 0
            r8 = r18
            r9 = r4
            r10 = r5
            r11 = r6
            r12 = r17
            r13 = r23
            r14 = r1
            r15 = r0
            androidx.compose.material.MenuKt.d(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x010f
            androidx.compose.runtime.ComposerKt.X()
        L_0x010f:
            r3 = r5
            r10 = r6
            r5 = r17
            goto L_0x011a
        L_0x0114:
            r1.B()
            r4 = r5
            r3 = r8
            r5 = r12
        L_0x011a:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x0133
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenuItem$1 r11 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenuItem$1
            r0 = r11
            r1 = r18
            r2 = r4
            r4 = r10
            r6 = r23
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AndroidMenu_androidKt.c(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
