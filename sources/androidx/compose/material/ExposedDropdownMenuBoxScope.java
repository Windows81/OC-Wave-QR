package androidx.compose.material;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public abstract class ExposedDropdownMenuBoxScope {
    public static /* synthetic */ Modifier c(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z2 = true;
            }
            return exposedDropdownMenuBoxScope.b(modifier, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r27, kotlin.jvm.functions.Function0 r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.ScrollState r30, kotlin.jvm.functions.Function3 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r26 = this;
            r7 = r33
            r0 = 1081438217(0x40757009, float:3.834963)
            r1 = r32
            androidx.compose.runtime.Composer r8 = r1.q(r0)
            r1 = r34 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0015
            r1 = r7 | 6
            r9 = r27
            goto L_0x0027
        L_0x0015:
            r1 = r7 & 6
            r9 = r27
            if (r1 != 0) goto L_0x0026
            boolean r1 = r8.d(r9)
            if (r1 == 0) goto L_0x0023
            r1 = 4
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            r1 = r1 | r7
            goto L_0x0027
        L_0x0026:
            r1 = r7
        L_0x0027:
            r3 = r34 & 2
            if (r3 == 0) goto L_0x0030
            r1 = r1 | 48
            r10 = r28
            goto L_0x0042
        L_0x0030:
            r3 = r7 & 48
            r10 = r28
            if (r3 != 0) goto L_0x0042
            boolean r3 = r8.l(r10)
            if (r3 == 0) goto L_0x003f
            r3 = 32
            goto L_0x0041
        L_0x003f:
            r3 = 16
        L_0x0041:
            r1 = r1 | r3
        L_0x0042:
            r3 = r34 & 4
            if (r3 == 0) goto L_0x004b
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0048:
            r4 = r29
            goto L_0x005d
        L_0x004b:
            r4 = r7 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0048
            r4 = r29
            boolean r5 = r8.W(r4)
            if (r5 == 0) goto L_0x005a
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r1 = r1 | r5
        L_0x005d:
            r5 = r7 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0076
            r5 = r34 & 8
            if (r5 != 0) goto L_0x0070
            r5 = r30
            boolean r6 = r8.W(r5)
            if (r6 == 0) goto L_0x0072
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0070:
            r5 = r30
        L_0x0072:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r1 = r1 | r6
            goto L_0x0078
        L_0x0076:
            r5 = r30
        L_0x0078:
            r6 = r34 & 16
            if (r6 == 0) goto L_0x0081
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007e:
            r6 = r31
            goto L_0x0093
        L_0x0081:
            r6 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x007e
            r6 = r31
            boolean r11 = r8.l(r6)
            if (r11 == 0) goto L_0x0090
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r11
        L_0x0093:
            r11 = r34 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x009d
            r1 = r1 | r12
            r15 = r26
            goto L_0x00af
        L_0x009d:
            r11 = r7 & r12
            r15 = r26
            if (r11 != 0) goto L_0x00af
            boolean r11 = r8.W(r15)
            if (r11 == 0) goto L_0x00ac
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r1 = r1 | r11
        L_0x00af:
            r11 = 74899(0x12493, float:1.04956E-40)
            r11 = r11 & r1
            r12 = 74898(0x12492, float:1.04954E-40)
            r13 = 0
            r14 = 1
            if (r11 == r12) goto L_0x00bc
            r11 = r14
            goto L_0x00bd
        L_0x00bc:
            r11 = r13
        L_0x00bd:
            r12 = r1 & 1
            boolean r11 = r8.E(r11, r12)
            if (r11 == 0) goto L_0x01d9
            r8.p()
            r11 = r7 & 1
            if (r11 == 0) goto L_0x00e1
            boolean r11 = r8.J()
            if (r11 == 0) goto L_0x00d3
            goto L_0x00e1
        L_0x00d3:
            r8.B()
            r3 = r34 & 8
            if (r3 == 0) goto L_0x00dc
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00dc:
            r18 = r4
        L_0x00de:
            r19 = r5
            goto L_0x00f9
        L_0x00e1:
            if (r3 == 0) goto L_0x00e6
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00e7
        L_0x00e6:
            r3 = r4
        L_0x00e7:
            r4 = r34 & 8
            if (r4 == 0) goto L_0x00f6
            androidx.compose.foundation.ScrollState r4 = androidx.compose.foundation.ScrollKt.c(r13, r8, r13, r14)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r18 = r3
            r19 = r4
            goto L_0x00f9
        L_0x00f6:
            r18 = r3
            goto L_0x00de
        L_0x00f9:
            r8.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0108
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r3, r4)
        L_0x0108:
            java.lang.Object r0 = r8.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r3.a()
            if (r0 != r4) goto L_0x011e
            androidx.compose.animation.core.MutableTransitionState r0 = new androidx.compose.animation.core.MutableTransitionState
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r0.<init>(r4)
            r8.N(r0)
        L_0x011e:
            r12 = r0
            androidx.compose.animation.core.MutableTransitionState r12 = (androidx.compose.animation.core.MutableTransitionState) r12
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r27)
            r12.h(r0)
            java.lang.Object r0 = r12.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x014c
            java.lang.Object r0 = r12.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0141
            goto L_0x014c
        L_0x0141:
            r0 = -668146035(0xffffffffd82ce68d, float:-7.6042483E14)
            r8.X(r0)
            r8.M()
            goto L_0x01cb
        L_0x014c:
            r0 = -669021506(0xffffffffd81f8abe, float:-7.0167297E14)
            r8.X(r0)
            java.lang.Object r0 = r8.g()
            java.lang.Object r4 = r3.a()
            if (r0 != r4) goto L_0x016e
            androidx.compose.ui.graphics.TransformOrigin$Companion r0 = androidx.compose.ui.graphics.TransformOrigin.f16150b
            long r4 = r0.a()
            androidx.compose.ui.graphics.TransformOrigin r0 = androidx.compose.ui.graphics.TransformOrigin.b(r4)
            r4 = 0
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r0, r4, r2, r4)
            r8.N(r0)
        L_0x016e:
            r13 = r0
            androidx.compose.runtime.MutableState r13 = (androidx.compose.runtime.MutableState) r13
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r8.C(r0)
            r23 = r0
            androidx.compose.ui.unit.Density r23 = (androidx.compose.ui.unit.Density) r23
            androidx.compose.ui.unit.DpOffset$Companion r0 = androidx.compose.ui.unit.DpOffset.f19147b
            long r21 = r0.a()
            java.lang.Object r0 = r8.g()
            java.lang.Object r2 = r3.a()
            if (r0 != r2) goto L_0x0195
            androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1 r0 = new androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
            r0.<init>(r13)
            r8.N(r0)
        L_0x0195:
            r24 = r0
            kotlin.jvm.functions.Function2 r24 = (kotlin.jvm.functions.Function2) r24
            androidx.compose.material.DropdownMenuPositionProvider r2 = new androidx.compose.material.DropdownMenuPositionProvider
            r25 = 0
            r20 = r2
            r20.<init>(r21, r23, r24, r25)
            androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1 r0 = new androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
            r11 = r0
            r3 = r14
            r14 = r19
            r15 = r26
            r16 = r18
            r17 = r31
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r4 = 54
            r5 = -1167205969(0xffffffffba6dd9af, float:-9.07327E-4)
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r3, r0, r8, r4)
            int r0 = r1 >> 3
            r0 = r0 & 14
            r5 = r0 | 384(0x180, float:5.38E-43)
            r0 = 0
            r1 = r28
            r4 = r8
            r6 = r0
            androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.a(r1, r2, r3, r4, r5, r6)
            r8.M()
        L_0x01cb:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01d4
            androidx.compose.runtime.ComposerKt.X()
        L_0x01d4:
            r4 = r18
            r5 = r19
            goto L_0x01dc
        L_0x01d9:
            r8.B()
        L_0x01dc:
            androidx.compose.runtime.ScopeUpdateScope r11 = r8.x()
            if (r11 == 0) goto L_0x01f7
            androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 r12 = new androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
            r0 = r12
            r1 = r26
            r2 = r27
            r3 = r28
            r6 = r31
            r7 = r33
            r8 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.a(r12)
        L_0x01f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuBoxScope.a(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public abstract Modifier b(Modifier modifier, boolean z2);
}
