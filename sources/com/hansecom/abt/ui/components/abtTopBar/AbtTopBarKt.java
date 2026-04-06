package com.hansecom.abt.ui.components.abtTopBar;

import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

@Metadata
public final class AbtTopBarKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f37935a = TopAppBarDefaults.f11631a.b();

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r33, androidx.compose.ui.Modifier r34, kotlin.jvm.functions.Function0 r35, kotlin.jvm.functions.Function3 r36, boolean r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r1 = r33
            r3 = r35
            r6 = r39
            r0 = -1995293327(0xffffffff89123d71, float:-1.7603E-33)
            r2 = r38
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r4 = r40 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r6 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r6 & 6
            if (r4 != 0) goto L_0x0025
            boolean r4 = r2.W(r1)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r6
            goto L_0x0026
        L_0x0025:
            r4 = r6
        L_0x0026:
            r5 = r40 & 2
            if (r5 == 0) goto L_0x002f
            r4 = r4 | 48
        L_0x002c:
            r7 = r34
            goto L_0x0041
        L_0x002f:
            r7 = r6 & 48
            if (r7 != 0) goto L_0x002c
            r7 = r34
            boolean r8 = r2.W(r7)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r4 = r4 | r8
        L_0x0041:
            r8 = r40 & 4
            if (r8 == 0) goto L_0x0048
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0058
        L_0x0048:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0058
            boolean r8 = r2.l(r3)
            if (r8 == 0) goto L_0x0055
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r4 = r4 | r8
        L_0x0058:
            r8 = r40 & 8
            if (r8 == 0) goto L_0x0061
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x005e:
            r9 = r36
            goto L_0x0073
        L_0x0061:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x005e
            r9 = r36
            boolean r10 = r2.l(r9)
            if (r10 == 0) goto L_0x0070
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r4 = r4 | r10
        L_0x0073:
            r10 = r40 & 16
            if (r10 == 0) goto L_0x007c
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0079:
            r11 = r37
            goto L_0x008e
        L_0x007c:
            r11 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0079
            r11 = r37
            boolean r12 = r2.d(r11)
            if (r12 == 0) goto L_0x008b
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008d
        L_0x008b:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x008d:
            r4 = r4 | r12
        L_0x008e:
            r12 = r4 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00a2
            boolean r12 = r2.t()
            if (r12 != 0) goto L_0x009b
            goto L_0x00a2
        L_0x009b:
            r2.B()
            r5 = r7
            r4 = r9
            goto L_0x0174
        L_0x00a2:
            if (r5 == 0) goto L_0x00a7
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00a8
        L_0x00a7:
            r5 = r7
        L_0x00a8:
            if (r8 == 0) goto L_0x00b2
            com.hansecom.abt.ui.components.abtTopBar.ComposableSingletons$AbtTopBarKt r7 = com.hansecom.abt.ui.components.abtTopBar.ComposableSingletons$AbtTopBarKt.f37939a
            kotlin.jvm.functions.Function3 r7 = r7.a()
            r15 = r7
            goto L_0x00b3
        L_0x00b2:
            r15 = r9
        L_0x00b3:
            if (r10 == 0) goto L_0x00b9
            r7 = 0
            r18 = r7
            goto L_0x00bb
        L_0x00b9:
            r18 = r11
        L_0x00bb:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00c7
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.ui.components.abtTopBar.AbtTopBar (AbtTopBar.kt:33)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r7, r8)
        L_0x00c7:
            com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt$AbtTopBar$barTitle$1 r0 = new com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt$AbtTopBar$barTitle$1
            r0.<init>(r1)
            r7 = 576732400(0x22603cf0, float:3.038992E-18)
            r8 = 1
            r9 = 54
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r8, r0, r2, r9)
            com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt$AbtTopBar$barNavigationIcon$1 r0 = new com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt$AbtTopBar$barNavigationIcon$1
            r0.<init>(r3)
            r10 = 2055799449(0x7a890299, float:3.5569868E35)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r10, r8, r0, r2, r9)
            com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt$AbtTopBar$barActions$1 r10 = new com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt$AbtTopBar$barActions$1
            r10.<init>(r15)
            r11 = -1995607443(0xffffffff890d726d, float:-1.702606E-33)
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r8, r10, r2, r9)
            androidx.compose.material3.TopAppBarColors r13 = new androidx.compose.material3.TopAppBarColors
            com.hansecom.abt.ui.theme.AbtTheme r8 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r9 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r11 = r8.b(r2, r9)
            long r20 = r11.x()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r11 = r8.b(r2, r9)
            long r22 = r11.x()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r11 = r8.b(r2, r9)
            long r24 = r11.o()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r11 = r8.b(r2, r9)
            long r26 = r11.o()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r11 = r8.b(r2, r9)
            long r28 = r11.o()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r8.b(r2, r9)
            long r30 = r8.o()
            r32 = 0
            r19 = r13
            r19.<init>(r20, r22, r24, r26, r28, r30, r32)
            if (r18 == 0) goto L_0x014a
            r8 = -1047568703(0xffffffffc18f5ec1, float:-17.921267)
            r2.X(r8)
            float r11 = f37935a
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | 28038(0x6d86, float:3.929E-41)
            r17 = 160(0xa0, float:2.24E-43)
            r12 = 0
            r14 = 0
            r8 = r5
            r9 = r0
            r19 = r15
            r15 = r2
            r16 = r4
            androidx.compose.material3.AppBarKt.q(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.M()
            goto L_0x0167
        L_0x014a:
            r19 = r15
            r8 = -1047296306(0xffffffffc19386ce, float:-18.440823)
            r2.X(r8)
            float r11 = f37935a
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | 28038(0x6d86, float:3.929E-41)
            r17 = 160(0xa0, float:2.24E-43)
            r12 = 0
            r14 = 0
            r8 = r5
            r9 = r0
            r15 = r2
            r16 = r4
            androidx.compose.material3.AppBarKt.w(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.M()
        L_0x0167:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0170
            androidx.compose.runtime.ComposerKt.X()
        L_0x0170:
            r11 = r18
            r4 = r19
        L_0x0174:
            androidx.compose.runtime.ScopeUpdateScope r8 = r2.x()
            if (r8 == 0) goto L_0x018d
            com.hansecom.abt.ui.components.abtTopBar.a r9 = new com.hansecom.abt.ui.components.abtTopBar.a
            r0 = r9
            r1 = r33
            r2 = r5
            r3 = r35
            r5 = r11
            r6 = r39
            r7 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt.b(java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(String str, Modifier modifier, Function0 function0, Function3 function3, boolean z2, int i2, int i3, Composer composer, int i4) {
        b(str, modifier, function0, function3, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final float d() {
        return f37935a;
    }
}
