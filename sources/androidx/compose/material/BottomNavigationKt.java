package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class BottomNavigationKt {

    /* renamed from: a  reason: collision with root package name */
    public static final TweenSpec f7318a = new TweenSpec(300, 0, EasingKt.d(), 2, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final float f7319b = Dp.m((float) 56);

    /* renamed from: c  reason: collision with root package name */
    public static final float f7320c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f7321d;

    /* renamed from: e  reason: collision with root package name */
    public static final WindowInsets f7322e;

    static {
        float f2 = (float) 12;
        f7320c = Dp.m(f2);
        f7321d = Dp.m(f2);
        float f3 = (float) 0;
        f7322e = WindowInsetsKt.c(Dp.m(f3), Dp.m(f3), Dp.m(f3), Dp.m(f3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.Modifier r22, long r23, long r25, float r27, kotlin.jvm.functions.Function3 r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r8 = r30
            r0 = 456489494(0x1b357a16, float:1.5011417E-22)
            r1 = r29
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r8 | 6
            r4 = r3
            r3 = r22
            goto L_0x0029
        L_0x0015:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r22
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r8
            goto L_0x0029
        L_0x0026:
            r3 = r22
            r4 = r8
        L_0x0029:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x0042
            r5 = r31 & 2
            if (r5 != 0) goto L_0x003c
            r5 = r23
            boolean r7 = r1.j(r5)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003c:
            r5 = r23
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
            goto L_0x0044
        L_0x0042:
            r5 = r23
        L_0x0044:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005b
            r7 = r31 & 4
            r9 = r25
            if (r7 != 0) goto L_0x0057
            boolean r7 = r1.j(r9)
            if (r7 == 0) goto L_0x0057
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r4 = r4 | r7
            goto L_0x005d
        L_0x005b:
            r9 = r25
        L_0x005d:
            r7 = r31 & 8
            if (r7 == 0) goto L_0x0066
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0063:
            r11 = r27
            goto L_0x0078
        L_0x0066:
            r11 = r8 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0063
            r11 = r27
            boolean r12 = r1.h(r11)
            if (r12 == 0) goto L_0x0075
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r4 = r4 | r12
        L_0x0078:
            r12 = r31 & 16
            if (r12 == 0) goto L_0x0081
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r15 = r28
            goto L_0x0093
        L_0x0081:
            r12 = r8 & 24576(0x6000, float:3.4438E-41)
            r15 = r28
            if (r12 != 0) goto L_0x0093
            boolean r12 = r1.l(r15)
            if (r12 == 0) goto L_0x0090
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r4 = r4 | r12
        L_0x0093:
            r12 = r4 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 == r13) goto L_0x009b
            r12 = 1
            goto L_0x009c
        L_0x009b:
            r12 = 0
        L_0x009c:
            r13 = r4 & 1
            boolean r12 = r1.E(r12, r13)
            if (r12 == 0) goto L_0x0138
            r1.p()
            r12 = r8 & 1
            r13 = 6
            if (r12 == 0) goto L_0x00ca
            boolean r12 = r1.J()
            if (r12 == 0) goto L_0x00b3
            goto L_0x00ca
        L_0x00b3:
            r1.B()
            r2 = r31 & 2
            if (r2 == 0) goto L_0x00bc
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00bc:
            r2 = r31 & 4
            if (r2 == 0) goto L_0x00c2
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c2:
            r2 = r3
        L_0x00c3:
            r7 = r11
        L_0x00c4:
            r20 = r9
            r9 = r4
            r3 = r20
            goto L_0x00f9
        L_0x00ca:
            if (r2 == 0) goto L_0x00cf
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00d0
        L_0x00cf:
            r2 = r3
        L_0x00d0:
            r3 = r31 & 2
            if (r3 == 0) goto L_0x00e0
            androidx.compose.material.MaterialTheme r3 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r3 = r3.a(r1, r13)
            long r5 = androidx.compose.material.ColorsKt.d(r3)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e0:
            r3 = r31 & 4
            if (r3 == 0) goto L_0x00ef
            int r3 = r4 >> 3
            r3 = r3 & 14
            long r9 = androidx.compose.material.ColorsKt.b(r5, r1, r3)
            r3 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r3
        L_0x00ef:
            if (r7 == 0) goto L_0x00c3
            androidx.compose.material.BottomNavigationDefaults r3 = androidx.compose.material.BottomNavigationDefaults.f7316a
            float r3 = r3.a()
            r7 = r3
            goto L_0x00c4
        L_0x00f9:
            r1.U()
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0108
            r10 = -1
            java.lang.String r11 = "androidx.compose.material.BottomNavigation (BottomNavigation.kt:163)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r10, r11)
        L_0x0108:
            androidx.compose.foundation.layout.WindowInsets r0 = f7322e
            int r9 = r9 << 3
            r10 = r9 & 112(0x70, float:1.57E-43)
            r10 = r10 | r13
            r11 = r9 & 896(0x380, float:1.256E-42)
            r10 = r10 | r11
            r11 = r9 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r9
            r10 = r10 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r11
            r18 = r10 | r9
            r19 = 0
            r9 = r0
            r10 = r2
            r11 = r5
            r13 = r3
            r15 = r7
            r16 = r28
            r17 = r1
            b(r9, r10, r11, r13, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0136
            androidx.compose.runtime.ComposerKt.X()
        L_0x0136:
            r9 = r3
            goto L_0x013d
        L_0x0138:
            r1.B()
            r2 = r3
            r7 = r11
        L_0x013d:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x0156
            androidx.compose.material.BottomNavigationKt$BottomNavigation$3 r12 = new androidx.compose.material.BottomNavigationKt$BottomNavigation$3
            r0 = r12
            r1 = r2
            r2 = r5
            r4 = r9
            r6 = r7
            r7 = r28
            r8 = r30
            r9 = r31
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            r11.a(r12)
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.a(androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.foundation.layout.WindowInsets r25, androidx.compose.ui.Modifier r26, long r27, long r29, float r31, kotlin.jvm.functions.Function3 r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r1 = r25
            r8 = r32
            r9 = r34
            r0 = -1278406810(0xffffffffb3cd0f66, float:-9.548857E-8)
            r2 = r33
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r35 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r9 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.W(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r9
            goto L_0x0026
        L_0x0025:
            r3 = r9
        L_0x0026:
            r4 = r35 & 2
            if (r4 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r5 = r26
            goto L_0x0041
        L_0x002f:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x002c
            r5 = r26
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r3 = r3 | r6
        L_0x0041:
            r6 = r9 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005a
            r6 = r35 & 4
            if (r6 != 0) goto L_0x0054
            r6 = r27
            boolean r10 = r2.j(r6)
            if (r10 == 0) goto L_0x0056
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0054:
            r6 = r27
        L_0x0056:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r3 = r3 | r10
            goto L_0x005c
        L_0x005a:
            r6 = r27
        L_0x005c:
            r10 = r9 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0075
            r10 = r35 & 8
            if (r10 != 0) goto L_0x006f
            r10 = r29
            boolean r12 = r2.j(r10)
            if (r12 == 0) goto L_0x0071
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x006f:
            r10 = r29
        L_0x0071:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r12
            goto L_0x0077
        L_0x0075:
            r10 = r29
        L_0x0077:
            r12 = r35 & 16
            if (r12 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r13 = r31
            goto L_0x0092
        L_0x0080:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007d
            r13 = r31
            boolean r14 = r2.h(r13)
            if (r14 == 0) goto L_0x008f
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r14
        L_0x0092:
            r14 = r35 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009a
            r3 = r3 | r15
            goto L_0x00aa
        L_0x009a:
            r14 = r9 & r15
            if (r14 != 0) goto L_0x00aa
            boolean r14 = r2.l(r8)
            if (r14 == 0) goto L_0x00a7
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a9
        L_0x00a7:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00a9:
            r3 = r3 | r14
        L_0x00aa:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r3
            r15 = 74898(0x12492, float:1.04954E-40)
            r0 = 1
            if (r14 == r15) goto L_0x00b6
            r14 = r0
            goto L_0x00b7
        L_0x00b6:
            r14 = 0
        L_0x00b7:
            r15 = r3 & 1
            boolean r14 = r2.E(r14, r15)
            if (r14 == 0) goto L_0x0164
            r2.p()
            r14 = r9 & 1
            if (r14 == 0) goto L_0x00e4
            boolean r14 = r2.J()
            if (r14 == 0) goto L_0x00cd
            goto L_0x00e4
        L_0x00cd:
            r2.B()
            r4 = r35 & 4
            if (r4 == 0) goto L_0x00d6
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00d6:
            r4 = r35 & 8
            if (r4 == 0) goto L_0x00dc
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00dc:
            r22 = r13
        L_0x00de:
            r23 = r10
            r10 = r3
            r3 = r23
            goto L_0x0113
        L_0x00e4:
            if (r4 == 0) goto L_0x00e9
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r5 = r4
        L_0x00e9:
            r4 = r35 & 4
            if (r4 == 0) goto L_0x00fa
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.f7937a
            r6 = 6
            androidx.compose.material.Colors r4 = r4.a(r2, r6)
            long r6 = androidx.compose.material.ColorsKt.d(r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00fa:
            r4 = r35 & 8
            if (r4 == 0) goto L_0x0108
            int r4 = r3 >> 6
            r4 = r4 & 14
            long r10 = androidx.compose.material.ColorsKt.b(r6, r2, r4)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0108:
            if (r12 == 0) goto L_0x00dc
            androidx.compose.material.BottomNavigationDefaults r4 = androidx.compose.material.BottomNavigationDefaults.f7316a
            float r4 = r4.a()
            r22 = r4
            goto L_0x00de
        L_0x0113:
            r2.U()
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0125
            r11 = -1
            java.lang.String r12 = "androidx.compose.material.BottomNavigation (BottomNavigation.kt:107)"
            r13 = -1278406810(0xffffffffb3cd0f66, float:-9.548857E-8)
            androidx.compose.runtime.ComposerKt.Y(r13, r10, r11, r12)
        L_0x0125:
            androidx.compose.material.BottomNavigationKt$BottomNavigation$1 r11 = new androidx.compose.material.BottomNavigationKt$BottomNavigation$1
            r11.<init>(r1, r8)
            r12 = 54
            r13 = -352628062(0xffffffffeafb52a2, float:-1.519153E26)
            androidx.compose.runtime.internal.ComposableLambda r18 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r0, r11, r2, r12)
            int r0 = r10 >> 3
            r0 = r0 & 14
            r11 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r11
            r11 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 | r11
            r11 = r10 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            int r10 = r10 << 3
            r10 = r10 & r11
            r20 = r0 | r10
            r21 = 18
            r11 = 0
            r16 = 0
            r10 = r5
            r12 = r6
            r14 = r3
            r17 = r22
            r19 = r2
            androidx.compose.material.SurfaceKt.a(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x015f
            androidx.compose.runtime.ComposerKt.X()
        L_0x015f:
            r10 = r3
            r3 = r6
            r7 = r22
            goto L_0x0169
        L_0x0164:
            r2.B()
            r3 = r6
            r7 = r13
        L_0x0169:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.x()
            if (r12 == 0) goto L_0x0182
            androidx.compose.material.BottomNavigationKt$BottomNavigation$2 r13 = new androidx.compose.material.BottomNavigationKt$BottomNavigation$2
            r0 = r13
            r1 = r25
            r2 = r5
            r5 = r10
            r8 = r32
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            r12.a(r13)
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.b(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.foundation.layout.RowScope r27, boolean r28, kotlin.jvm.functions.Function0 r29, kotlin.jvm.functions.Function2 r30, androidx.compose.ui.Modifier r31, boolean r32, kotlin.jvm.functions.Function2 r33, boolean r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, long r36, long r38, androidx.compose.runtime.Composer r40, int r41, int r42, int r43) {
        /*
            r4 = r30
            r14 = r41
            r15 = r43
            r1 = 128(0x80, float:1.794E-43)
            r2 = 16
            r3 = 32
            r6 = 1
            r7 = 6
            r8 = -1473735525(0xffffffffa828949b, float:-9.358097E-15)
            r9 = r40
            androidx.compose.runtime.Composer r9 = r9.q(r8)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 & r15
            r11 = 4
            r12 = 2
            if (r10 == 0) goto L_0x0024
            r10 = r14 | 6
            r13 = r10
            r10 = r27
            goto L_0x0038
        L_0x0024:
            r10 = r14 & 6
            if (r10 != 0) goto L_0x0035
            r10 = r27
            boolean r13 = r9.W(r10)
            if (r13 == 0) goto L_0x0032
            r13 = r11
            goto L_0x0033
        L_0x0032:
            r13 = r12
        L_0x0033:
            r13 = r13 | r14
            goto L_0x0038
        L_0x0035:
            r10 = r27
            r13 = r14
        L_0x0038:
            r16 = r15 & 1
            if (r16 == 0) goto L_0x0041
            r13 = r13 | 48
            r0 = r28
            goto L_0x0054
        L_0x0041:
            r16 = r14 & 48
            r0 = r28
            if (r16 != 0) goto L_0x0054
            boolean r17 = r9.d(r0)
            if (r17 == 0) goto L_0x0050
            r17 = r3
            goto L_0x0052
        L_0x0050:
            r17 = r2
        L_0x0052:
            r13 = r13 | r17
        L_0x0054:
            r17 = r15 & 2
            if (r17 == 0) goto L_0x005d
            r13 = r13 | 384(0x180, float:5.38E-43)
        L_0x005a:
            r8 = r29
            goto L_0x0070
        L_0x005d:
            r8 = r14 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x005a
            r8 = r29
            boolean r18 = r9.l(r8)
            if (r18 == 0) goto L_0x006c
            r18 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r18 = r1
        L_0x006e:
            r13 = r13 | r18
        L_0x0070:
            r18 = r15 & 4
            if (r18 == 0) goto L_0x0077
            r13 = r13 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0077:
            r11 = r14 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0087
            boolean r11 = r9.l(r4)
            if (r11 == 0) goto L_0x0084
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r13 = r13 | r11
        L_0x0087:
            r11 = r15 & 8
            if (r11 == 0) goto L_0x0090
            r13 = r13 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r6 = r31
            goto L_0x00a3
        L_0x0090:
            r6 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x008d
            r6 = r31
            boolean r19 = r9.W(r6)
            if (r19 == 0) goto L_0x009f
            r19 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r13 = r13 | r19
        L_0x00a3:
            r2 = r2 & r15
            r19 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00ad
            r13 = r13 | r19
            r12 = r32
            goto L_0x00c0
        L_0x00ad:
            r19 = r14 & r19
            r12 = r32
            if (r19 != 0) goto L_0x00c0
            boolean r20 = r9.d(r12)
            if (r20 == 0) goto L_0x00bc
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r13 = r13 | r20
        L_0x00c0:
            r3 = r3 & r15
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r3 == 0) goto L_0x00ca
            r13 = r13 | r20
            r7 = r33
            goto L_0x00dd
        L_0x00ca:
            r20 = r14 & r20
            r7 = r33
            if (r20 != 0) goto L_0x00dd
            boolean r21 = r9.l(r7)
            if (r21 == 0) goto L_0x00d9
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r13 = r13 | r21
        L_0x00dd:
            r21 = r15 & 64
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            if (r21 == 0) goto L_0x00e8
            r13 = r13 | r22
            r5 = r34
            goto L_0x00fb
        L_0x00e8:
            r22 = r14 & r22
            r5 = r34
            if (r22 != 0) goto L_0x00fb
            boolean r23 = r9.d(r5)
            if (r23 == 0) goto L_0x00f7
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f7:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r13 = r13 | r23
        L_0x00fb:
            r1 = r1 & r15
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x0105
            r13 = r13 | r23
            r0 = r35
            goto L_0x0118
        L_0x0105:
            r23 = r14 & r23
            r0 = r35
            if (r23 != 0) goto L_0x0118
            boolean r23 = r9.W(r0)
            if (r23 == 0) goto L_0x0114
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r13 = r13 | r23
        L_0x0118:
            r23 = 805306368(0x30000000, float:4.656613E-10)
            r23 = r14 & r23
            if (r23 != 0) goto L_0x0136
            r0 = 256(0x100, float:3.59E-43)
            r5 = r15 & 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L_0x012f
            r5 = r36
            boolean r0 = r9.j(r5)
            if (r0 == 0) goto L_0x0131
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x012f:
            r5 = r36
        L_0x0131:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0133:
            r13 = r13 | r0
        L_0x0134:
            r0 = 6
            goto L_0x0139
        L_0x0136:
            r5 = r36
            goto L_0x0134
        L_0x0139:
            r23 = r42 & 6
            if (r23 != 0) goto L_0x014f
            r0 = r15 & 512(0x200, float:7.175E-43)
            r5 = r38
            if (r0 != 0) goto L_0x014b
            boolean r0 = r9.j(r5)
            if (r0 == 0) goto L_0x014b
            r0 = 4
            goto L_0x014c
        L_0x014b:
            r0 = 2
        L_0x014c:
            r0 = r42 | r0
            goto L_0x0153
        L_0x014f:
            r5 = r38
            r0 = r42
        L_0x0153:
            r23 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r13 & r23
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r6) goto L_0x0166
            r5 = r0 & 3
            r6 = 2
            if (r5 == r6) goto L_0x0163
            goto L_0x0166
        L_0x0163:
            r5 = 0
        L_0x0164:
            r6 = 1
            goto L_0x0168
        L_0x0166:
            r5 = 1
            goto L_0x0164
        L_0x0168:
            r7 = r13 & 1
            boolean r5 = r9.E(r5, r7)
            if (r5 == 0) goto L_0x033a
            r9.p()
            r5 = r14 & 1
            r6 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r7 = 0
            if (r5 == 0) goto L_0x019f
            boolean r5 = r9.J()
            if (r5 == 0) goto L_0x0182
            goto L_0x019f
        L_0x0182:
            r9.B()
            r1 = 256(0x100, float:3.59E-43)
            r1 = r1 & r15
            if (r1 == 0) goto L_0x018b
            r13 = r13 & r6
        L_0x018b:
            r1 = r15 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0191
            r0 = r0 & -15
        L_0x0191:
            r5 = r31
            r2 = r33
            r3 = r34
            r1 = r35
            r21 = r36
        L_0x019b:
            r19 = r38
            goto L_0x01fc
        L_0x019f:
            if (r11 == 0) goto L_0x01a4
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01a6
        L_0x01a4:
            r5 = r31
        L_0x01a6:
            if (r2 == 0) goto L_0x01a9
            r12 = 1
        L_0x01a9:
            if (r3 == 0) goto L_0x01ad
            r2 = r7
            goto L_0x01af
        L_0x01ad:
            r2 = r33
        L_0x01af:
            if (r21 == 0) goto L_0x01b3
            r3 = 1
            goto L_0x01b5
        L_0x01b3:
            r3 = r34
        L_0x01b5:
            if (r1 == 0) goto L_0x01bb
            r1 = r7
        L_0x01b8:
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x01be
        L_0x01bb:
            r1 = r35
            goto L_0x01b8
        L_0x01be:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x01d1
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r11 = r9.C(r11)
            androidx.compose.ui.graphics.Color r11 = (androidx.compose.ui.graphics.Color) r11
            long r21 = r11.v()
            r13 = r13 & r6
            goto L_0x01d3
        L_0x01d1:
            r21 = r36
        L_0x01d3:
            r6 = r15 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x019b
            androidx.compose.material.ContentAlpha r6 = androidx.compose.material.ContentAlpha.f7561a
            r11 = 6
            float r6 = r6.d(r9, r11)
            r11 = 14
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r31 = r21
            r33 = r6
            r34 = r20
            r35 = r23
            r36 = r24
            r37 = r11
            r38 = r19
            long r19 = androidx.compose.ui.graphics.Color.l(r31, r33, r34, r35, r36, r37, r38)
            r0 = r0 & -15
        L_0x01fc:
            r9.U()
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x020d
            java.lang.String r6 = "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:211)"
            r11 = -1473735525(0xffffffffa828949b, float:-9.358097E-15)
            androidx.compose.runtime.ComposerKt.Y(r11, r13, r0, r6)
        L_0x020d:
            if (r2 != 0) goto L_0x021b
            r6 = 399132217(0x17ca4639, float:1.3071671E-24)
            r9.X(r6)
            r9.M()
            r39 = r2
            goto L_0x0235
        L_0x021b:
            r6 = 399132218(0x17ca463a, float:1.3071672E-24)
            r9.X(r6)
            androidx.compose.material.BottomNavigationKt$BottomNavigationItem$styledLabel$1$1 r6 = new androidx.compose.material.BottomNavigationKt$BottomNavigationItem$styledLabel$1$1
            r6.<init>(r2)
            r7 = 1343298261(0x50111ad5, float:9.7378191E9)
            r39 = r2
            r2 = 54
            r11 = 1
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r11, r6, r9, r2)
            r9.M()
        L_0x0235:
            r2 = 2
            r6 = 0
            r11 = 0
            r17 = 0
            r31 = r11
            r32 = r17
            r33 = r21
            r35 = r2
            r36 = r6
            androidx.compose.foundation.IndicationNodeFactory r2 = androidx.compose.material.RippleKt.f(r31, r32, r33, r35, r36)
            androidx.compose.ui.semantics.Role$Companion r6 = androidx.compose.ui.semantics.Role.f18040b
            int r6 = r6.h()
            androidx.compose.ui.semantics.Role r6 = androidx.compose.ui.semantics.Role.j(r6)
            r31 = r5
            r32 = r28
            r33 = r1
            r34 = r2
            r35 = r12
            r36 = r6
            r37 = r29
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.selection.SelectableKt.a(r31, r32, r33, r34, r35, r36, r37)
            r6 = 2
            r11 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r31 = r27
            r32 = r2
            r33 = r17
            r34 = r23
            r35 = r6
            r36 = r11
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.RowScope.c(r31, r32, r33, r34, r35, r36)
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r6 = r6.e()
            r11 = 0
            androidx.compose.ui.layout.MeasurePolicy r6 = androidx.compose.foundation.layout.BoxKt.g(r6, r11)
            int r11 = androidx.compose.runtime.ComposablesKt.a(r9, r11)
            r40 = r1
            androidx.compose.runtime.CompositionLocalMap r1 = r9.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r9, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.ui.node.ComposeUiNode.f17222h
            r23 = r5
            kotlin.jvm.functions.Function0 r5 = r17.a()
            androidx.compose.runtime.Applier r24 = r9.v()
            if (r24 != 0) goto L_0x02a4
            androidx.compose.runtime.ComposablesKt.d()
        L_0x02a4:
            r9.s()
            boolean r24 = r9.n()
            if (r24 == 0) goto L_0x02b1
            r9.y(r5)
            goto L_0x02b4
        L_0x02b1:
            r9.K()
        L_0x02b4:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r8 = r17.c()
            androidx.compose.runtime.Updater.g(r5, r6, r8)
            kotlin.jvm.functions.Function2 r6 = r17.e()
            androidx.compose.runtime.Updater.g(r5, r1, r6)
            kotlin.jvm.functions.Function2 r1 = r17.b()
            boolean r6 = r5.n()
            if (r6 != 0) goto L_0x02de
            java.lang.Object r6 = r5.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r8)
            if (r6 != 0) goto L_0x02ec
        L_0x02de:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5.N(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5.A(r6, r1)
        L_0x02ec:
            kotlin.jvm.functions.Function2 r1 = r17.d()
            androidx.compose.runtime.Updater.g(r5, r2, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.material.BottomNavigationKt$BottomNavigationItem$1$1 r1 = new androidx.compose.material.BottomNavigationKt$BottomNavigationItem$1$1
            r1.<init>(r3, r4, r7)
            r2 = -1411872801(0xffffffffabd887df, float:-1.5385435E-12)
            r5 = 1
            r6 = 54
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r2, r5, r1, r9, r6)
            int r2 = r13 >> 27
            r2 = r2 & 14
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            int r2 = r13 << 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r31 = r21
            r33 = r19
            r35 = r28
            r36 = r1
            r37 = r9
            r38 = r0
            e(r31, r33, r35, r36, r37, r38)
            r9.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x032f
            androidx.compose.runtime.ComposerKt.X()
        L_0x032f:
            r7 = r39
            r11 = r40
            r8 = r3
            r6 = r12
            r12 = r19
            r5 = r23
            goto L_0x034a
        L_0x033a:
            r9.B()
            r5 = r31
            r7 = r33
            r8 = r34
            r11 = r35
            r21 = r36
            r6 = r12
            r12 = r38
        L_0x034a:
            androidx.compose.runtime.ScopeUpdateScope r9 = r9.x()
            if (r9 == 0) goto L_0x0373
            androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2 r3 = new androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2
            r0 = r3
            r1 = r27
            r2 = r28
            r10 = r3
            r3 = r29
            r4 = r30
            r25 = r9
            r9 = r11
            r26 = r10
            r10 = r21
            r14 = r41
            r15 = r42
            r16 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r16)
            r0 = r25
            r1 = r26
            r0.a(r1)
        L_0x0373:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.c(androidx.compose.foundation.layout.RowScope, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void d(Function2 function2, Function2 function22, float f2, Composer composer, int i2) {
        int i3;
        Function2 function23 = function2;
        Function2 function24 = function22;
        float f3 = f2;
        int i4 = i2;
        boolean z2 = true;
        Composer q2 = composer.q(-1162995092);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function23) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function24) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.h(f3) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1162995092, i3, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:314)");
            }
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 896) != 256) {
                z2 = false;
            }
            boolean z4 = z2 | z3;
            Object g2 = q2.g();
            if (z4 || g2 == Composer.f14567a.a()) {
                g2 = new BottomNavigationKt$BottomNavigationItemBaselineLayout$2$1(function24, f3);
                q2.N(g2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g2;
            Modifier.Companion companion = Modifier.f15489d;
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, measurePolicy, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion2.d());
            Modifier b4 = LayoutIdKt.b(companion, "icon");
            Alignment.Companion companion3 = Alignment.f15444a;
            MeasurePolicy g3 = BoxKt.g(companion3.o(), false);
            int a4 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I2 = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, b4);
            Function0 a5 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a5);
            } else {
                q2.K();
            }
            Composer b5 = Updater.b(q2);
            Updater.g(b5, g3, companion2.c());
            Updater.g(b5, I2, companion2.e());
            Function2 b6 = companion2.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a4))) {
                b5.N(Integer.valueOf(a4));
                b5.A(Integer.valueOf(a4), b6);
            }
            Updater.g(b5, e3, companion2.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            function23.m(q2, Integer.valueOf(i3 & 14));
            q2.T();
            if (function24 != null) {
                q2.X(-1180018220);
                Modifier k2 = PaddingKt.k(AlphaKt.a(LayoutIdKt.b(companion, "label"), f3), f7320c, 0.0f, 2, (Object) null);
                MeasurePolicy g4 = BoxKt.g(companion3.o(), false);
                int a6 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I3 = q2.I();
                Modifier e4 = ComposedModifierKt.e(q2, k2);
                Function0 a7 = companion2.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a7);
                } else {
                    q2.K();
                }
                Composer b7 = Updater.b(q2);
                Updater.g(b7, g4, companion2.c());
                Updater.g(b7, I3, companion2.e());
                Function2 b8 = companion2.b();
                if (b7.n() || !Intrinsics.d(b7.g(), Integer.valueOf(a6))) {
                    b7.N(Integer.valueOf(a6));
                    b7.A(Integer.valueOf(a6), b8);
                }
                Updater.g(b7, e4, companion2.d());
                function24.m(q2, Integer.valueOf((i3 >> 3) & 14));
                q2.T();
                q2.M();
            } else {
                q2.X(-1179764516);
                q2.M();
            }
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new BottomNavigationKt$BottomNavigationItemBaselineLayout$3(function23, function24, f3, i4));
        }
    }

    public static final void e(long j2, long j3, boolean z2, Function3 function3, Composer composer, int i2) {
        int i3;
        Composer composer2;
        long j4 = j2;
        long j5 = j3;
        boolean z3 = z2;
        Function3 function32 = function3;
        int i4 = i2;
        Composer q2 = composer.q(-985175058);
        if ((i4 & 6) == 0) {
            i3 = (q2.j(j4) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.j(j5) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function32) ? 2048 : 1024;
        }
        if (q2.E((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-985175058, i3, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:282)");
            }
            composer2 = q2;
            State d2 = AnimateAsStateKt.d(z3 ? 1.0f : 0.0f, f7318a, 0.0f, (String) null, (Function1) null, q2, 48, 28);
            long h2 = ColorKt.h(j5, j4, f(d2));
            CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(Color.l(h2, 1.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), ContentAlphaKt.a().d(Float.valueOf(Color.o(h2)))}, ComposableLambdaKt.e(-138092754, true, new BottomNavigationKt$BottomNavigationTransition$1(function32, d2), composer2, 54), composer2, ProvidedValue.f14769i | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new BottomNavigationKt$BottomNavigationTransition$2(j2, j3, z2, function3, i2));
        }
    }

    public static final float f(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final MeasureResult m(MeasureScope measureScope, Placeable placeable, long j2) {
        int f2 = ConstraintsKt.f(j2, measureScope.P1(f7319b));
        return MeasureScope.R1(measureScope, placeable.L0(), f2, (Map) null, new BottomNavigationKt$placeIcon$1(placeable, (f2 - placeable.C0()) / 2), 4, (Object) null);
    }

    public static final MeasureResult n(MeasureScope measureScope, Placeable placeable, Placeable placeable2, long j2, float f2) {
        int P1 = measureScope.P1(f7321d) - placeable.f0(AlignmentLineKt.a());
        int C0 = placeable2.C0() + placeable.C0() + P1;
        int f3 = ConstraintsKt.f(j2, Math.max(C0, measureScope.P1(f7319b)));
        int e2 = RangesKt.e((f3 - C0) / 2, 0);
        int C02 = placeable2.C0() + e2 + P1;
        int max = Math.max(placeable.L0(), placeable2.L0());
        return MeasureScope.R1(measureScope, max, f3, (Map) null, new BottomNavigationKt$placeLabelAndIcon$1(f2, placeable, (max - placeable.L0()) / 2, C02, MathKt.d(((float) (((f3 - placeable2.C0()) / 2) - e2)) * (((float) 1) - f2)), placeable2, (max - placeable2.L0()) / 2, e2), 4, (Object) null);
    }
}
