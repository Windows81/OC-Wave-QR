package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.unit.Constraints;
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

@Metadata
public final class NavigationRailKt {

    /* renamed from: a  reason: collision with root package name */
    public static final TweenSpec f8042a = new TweenSpec(300, 0, EasingKt.d(), 2, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final float f8043b = Dp.m((float) 72);

    /* renamed from: c  reason: collision with root package name */
    public static final float f8044c = Dp.m((float) 56);

    /* renamed from: d  reason: collision with root package name */
    public static final float f8045d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f8046e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f8047f = Dp.m((float) 16);

    /* renamed from: g  reason: collision with root package name */
    public static final float f8048g = Dp.m((float) 14);

    /* renamed from: h  reason: collision with root package name */
    public static final WindowInsets f8049h = WindowInsetsKt.d(Dp.m((float) 0), 0.0f, 0.0f, 0.0f, 14, (Object) null);

    static {
        float f2 = (float) 8;
        f8045d = Dp.m(f2);
        f8046e = Dp.m(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.Modifier r22, long r23, long r25, float r27, kotlin.jvm.functions.Function3 r28, kotlin.jvm.functions.Function3 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r9 = r31
            r0 = 1790971523(0x6ac00e83, float:1.1609114E26)
            r1 = r30
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r32 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r9 | 6
            r4 = r3
            r3 = r22
            goto L_0x0029
        L_0x0015:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r22
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r9
            goto L_0x0029
        L_0x0026:
            r3 = r22
            r4 = r9
        L_0x0029:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0042
            r5 = r32 & 2
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
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005d
            r7 = r32 & 4
            if (r7 != 0) goto L_0x0057
            r7 = r25
            boolean r10 = r1.j(r7)
            if (r10 == 0) goto L_0x0059
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r7 = r25
        L_0x0059:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r10
            goto L_0x005f
        L_0x005d:
            r7 = r25
        L_0x005f:
            r10 = r32 & 8
            if (r10 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r11 = r27
            goto L_0x007a
        L_0x0068:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0065
            r11 = r27
            boolean r12 = r1.h(r11)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r12
        L_0x007a:
            r12 = r32 & 16
            if (r12 == 0) goto L_0x0083
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r13 = r28
            goto L_0x0095
        L_0x0083:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0080
            r13 = r28
            boolean r14 = r1.l(r13)
            if (r14 == 0) goto L_0x0092
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r14
        L_0x0095:
            r14 = r32 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009f
            r4 = r4 | r15
        L_0x009c:
            r14 = r29
            goto L_0x00b1
        L_0x009f:
            r14 = r9 & r15
            if (r14 != 0) goto L_0x009c
            r14 = r29
            boolean r15 = r1.l(r14)
            if (r15 == 0) goto L_0x00ae
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r4 = r4 | r15
        L_0x00b1:
            r15 = 74899(0x12493, float:1.04956E-40)
            r15 = r15 & r4
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r15 == r0) goto L_0x00bc
            r0 = 1
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r15 = r4 & 1
            boolean r0 = r1.E(r0, r15)
            if (r0 == 0) goto L_0x0165
            r1.p()
            r0 = r9 & 1
            r15 = 6
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x00d4
            goto L_0x00e7
        L_0x00d4:
            r1.B()
            r0 = r32 & 2
            if (r0 == 0) goto L_0x00dd
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00dd:
            r0 = r32 & 4
            if (r0 == 0) goto L_0x00e3
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00e3:
            r0 = r3
        L_0x00e4:
            r2 = r11
            r3 = r13
            goto L_0x011b
        L_0x00e7:
            if (r2 == 0) goto L_0x00ec
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ed
        L_0x00ec:
            r0 = r3
        L_0x00ed:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x00fe
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r2 = r2.a(r1, r15)
            long r2 = r2.n()
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            r5 = r2
        L_0x00fe:
            r2 = r32 & 4
            if (r2 == 0) goto L_0x010d
            int r2 = r4 >> 3
            r2 = r2 & 14
            long r2 = androidx.compose.material.ColorsKt.b(r5, r1, r2)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r7 = r2
        L_0x010d:
            if (r10 == 0) goto L_0x0116
            androidx.compose.material.NavigationRailDefaults r2 = androidx.compose.material.NavigationRailDefaults.f8040a
            float r2 = r2.a()
            r11 = r2
        L_0x0116:
            if (r12 == 0) goto L_0x00e4
            r2 = 0
            r3 = r2
            r2 = r11
        L_0x011b:
            r1.U()
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x012d
            r10 = -1
            java.lang.String r11 = "androidx.compose.material.NavigationRail (NavigationRail.kt:174)"
            r12 = 1790971523(0x6ac00e83, float:1.1609114E26)
            androidx.compose.runtime.ComposerKt.Y(r12, r4, r10, r11)
        L_0x012d:
            androidx.compose.foundation.layout.WindowInsets r10 = f8049h
            int r4 = r4 << 3
            r11 = r4 & 112(0x70, float:1.57E-43)
            r11 = r11 | r15
            r12 = r4 & 896(0x380, float:1.256E-42)
            r11 = r11 | r12
            r12 = r4 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r4
            r11 = r11 | r12
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r4
            r11 = r11 | r12
            r12 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r12
            r20 = r11 | r4
            r21 = 0
            r11 = r0
            r12 = r5
            r14 = r7
            r16 = r2
            r17 = r3
            r18 = r29
            r19 = r1
            b(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0161
            androidx.compose.runtime.ComposerKt.X()
        L_0x0161:
            r11 = r2
            r13 = r3
            r3 = r0
            goto L_0x0168
        L_0x0165:
            r1.B()
        L_0x0168:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x0182
            androidx.compose.material.NavigationRailKt$NavigationRail$3 r14 = new androidx.compose.material.NavigationRailKt$NavigationRail$3
            r0 = r14
            r1 = r3
            r2 = r5
            r4 = r7
            r6 = r11
            r7 = r13
            r8 = r29
            r9 = r31
            r10 = r32
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            r12.a(r14)
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.a(androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.foundation.layout.WindowInsets r25, androidx.compose.ui.Modifier r26, long r27, long r29, float r31, kotlin.jvm.functions.Function3 r32, kotlin.jvm.functions.Function3 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r1 = r25
            r9 = r33
            r10 = r35
            r0 = -1389243291(0xffffffffad31d465, float:-1.0108446E-11)
            r2 = r34
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r36 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r10 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.W(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r10
            goto L_0x0026
        L_0x0025:
            r3 = r10
        L_0x0026:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r5 = r26
            goto L_0x0041
        L_0x002f:
            r5 = r10 & 48
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
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005a
            r6 = r36 & 4
            if (r6 != 0) goto L_0x0054
            r6 = r27
            boolean r8 = r2.j(r6)
            if (r8 == 0) goto L_0x0056
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0054:
            r6 = r27
        L_0x0056:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r3 = r3 | r8
            goto L_0x005c
        L_0x005a:
            r6 = r27
        L_0x005c:
            r8 = r10 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0073
            r8 = r36 & 8
            r11 = r29
            if (r8 != 0) goto L_0x006f
            boolean r8 = r2.j(r11)
            if (r8 == 0) goto L_0x006f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r3 = r3 | r8
            goto L_0x0075
        L_0x0073:
            r11 = r29
        L_0x0075:
            r8 = r36 & 16
            if (r8 == 0) goto L_0x007e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r13 = r31
            goto L_0x0090
        L_0x007e:
            r13 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007b
            r13 = r31
            boolean r14 = r2.h(r13)
            if (r14 == 0) goto L_0x008d
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r3 = r3 | r14
        L_0x0090:
            r14 = r36 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009a
            r3 = r3 | r15
        L_0x0097:
            r15 = r32
            goto L_0x00ac
        L_0x009a:
            r15 = r15 & r10
            if (r15 != 0) goto L_0x0097
            r15 = r32
            boolean r16 = r2.l(r15)
            if (r16 == 0) goto L_0x00a8
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00a8:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00aa:
            r3 = r3 | r16
        L_0x00ac:
            r16 = r36 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00b5
            r3 = r3 | r17
            goto L_0x00c6
        L_0x00b5:
            r16 = r10 & r17
            if (r16 != 0) goto L_0x00c6
            boolean r16 = r2.l(r9)
            if (r16 == 0) goto L_0x00c2
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00c2:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c4:
            r3 = r3 | r16
        L_0x00c6:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            r6 = 1
            if (r0 == r5) goto L_0x00d3
            r0 = r6
            goto L_0x00d4
        L_0x00d3:
            r0 = 0
        L_0x00d4:
            r5 = r3 & 1
            boolean r0 = r2.E(r0, r5)
            if (r0 == 0) goto L_0x018e
            r2.p()
            r0 = r10 & 1
            if (r0 == 0) goto L_0x0101
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x00ea
            goto L_0x0101
        L_0x00ea:
            r2.B()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x00f3
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f3:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x00f9
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00f9:
            r0 = r26
            r4 = r27
            r7 = r11
            r11 = r3
            r3 = r13
            goto L_0x013e
        L_0x0101:
            if (r4 == 0) goto L_0x0106
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0108
        L_0x0106:
            r0 = r26
        L_0x0108:
            r4 = r36 & 4
            if (r4 == 0) goto L_0x011a
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.f7937a
            r5 = 6
            androidx.compose.material.Colors r4 = r4.a(r2, r5)
            long r4 = r4.n()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x011c
        L_0x011a:
            r4 = r27
        L_0x011c:
            r7 = r36 & 8
            if (r7 == 0) goto L_0x012a
            int r7 = r3 >> 6
            r7 = r7 & 14
            long r11 = androidx.compose.material.ColorsKt.b(r4, r2, r7)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x012a:
            if (r8 == 0) goto L_0x0133
            androidx.compose.material.NavigationRailDefaults r7 = androidx.compose.material.NavigationRailDefaults.f8040a
            float r7 = r7.a()
            goto L_0x0134
        L_0x0133:
            r7 = r13
        L_0x0134:
            if (r14 == 0) goto L_0x0138
            r8 = 0
            r15 = r8
        L_0x0138:
            r23 = r11
            r11 = r3
            r3 = r7
            r7 = r23
        L_0x013e:
            r2.U()
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0150
            r12 = -1
            java.lang.String r13 = "androidx.compose.material.NavigationRail (NavigationRail.kt:109)"
            r14 = -1389243291(0xffffffffad31d465, float:-1.0108446E-11)
            androidx.compose.runtime.ComposerKt.Y(r14, r11, r12, r13)
        L_0x0150:
            androidx.compose.material.NavigationRailKt$NavigationRail$1 r12 = new androidx.compose.material.NavigationRailKt$NavigationRail$1
            r12.<init>(r1, r15, r9)
            r13 = 54
            r14 = -245908831(0xfffffffff157baa1, float:-1.06823836E30)
            androidx.compose.runtime.internal.ComposableLambda r19 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r6, r12, r2, r13)
            int r6 = r11 >> 3
            r6 = r6 & 14
            r6 = r6 | r17
            r12 = r11 & 896(0x380, float:1.256E-42)
            r6 = r6 | r12
            r12 = r11 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r12
            r12 = 458752(0x70000, float:6.42848E-40)
            int r11 = r11 << 3
            r11 = r11 & r12
            r21 = r6 | r11
            r22 = 18
            r12 = 0
            r17 = 0
            r11 = r0
            r13 = r4
            r6 = r15
            r15 = r7
            r18 = r3
            r20 = r2
            androidx.compose.material.SurfaceKt.a(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22)
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x018a
            androidx.compose.runtime.ComposerKt.X()
        L_0x018a:
            r13 = r3
            r15 = r6
            r3 = r0
            goto L_0x0196
        L_0x018e:
            r2.B()
            r3 = r26
            r4 = r27
            r7 = r11
        L_0x0196:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.x()
            if (r12 == 0) goto L_0x01b2
            androidx.compose.material.NavigationRailKt$NavigationRail$2 r14 = new androidx.compose.material.NavigationRailKt$NavigationRail$2
            r0 = r14
            r1 = r25
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r13
            r8 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r12.a(r14)
        L_0x01b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.b(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(boolean r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function2 r29, androidx.compose.ui.Modifier r30, boolean r31, kotlin.jvm.functions.Function2 r32, boolean r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, long r35, long r37, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r3 = r29
            r13 = r40
            r14 = r41
            r0 = 128(0x80, float:1.794E-43)
            r1 = 16
            r2 = 32
            r4 = 2
            r5 = 4
            r6 = 6
            r8 = -1813548445(0xffffffff93e77263, float:-5.8425392E-27)
            r9 = r39
            androidx.compose.runtime.Composer r9 = r9.q(r8)
            r10 = 1
            r11 = r14 & 1
            if (r11 == 0) goto L_0x0023
            r11 = r13 | 6
            r12 = r11
            r11 = r27
            goto L_0x0037
        L_0x0023:
            r11 = r13 & 6
            if (r11 != 0) goto L_0x0034
            r11 = r27
            boolean r12 = r9.d(r11)
            if (r12 == 0) goto L_0x0031
            r12 = r5
            goto L_0x0032
        L_0x0031:
            r12 = r4
        L_0x0032:
            r12 = r12 | r13
            goto L_0x0037
        L_0x0034:
            r11 = r27
            r12 = r13
        L_0x0037:
            r4 = r4 & r14
            if (r4 == 0) goto L_0x003f
            r12 = r12 | 48
        L_0x003c:
            r4 = r28
            goto L_0x004f
        L_0x003f:
            r4 = r13 & 48
            if (r4 != 0) goto L_0x003c
            r4 = r28
            boolean r15 = r9.l(r4)
            if (r15 == 0) goto L_0x004d
            r15 = r2
            goto L_0x004e
        L_0x004d:
            r15 = r1
        L_0x004e:
            r12 = r12 | r15
        L_0x004f:
            r5 = r5 & r14
            if (r5 == 0) goto L_0x0055
            r12 = r12 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0055:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0064
            boolean r5 = r9.l(r3)
            if (r5 == 0) goto L_0x0062
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0062:
            r5 = r0
        L_0x0063:
            r12 = r12 | r5
        L_0x0064:
            r5 = r14 & 8
            if (r5 == 0) goto L_0x006d
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r15 = r30
            goto L_0x0080
        L_0x006d:
            r15 = r13 & 3072(0xc00, float:4.305E-42)
            if (r15 != 0) goto L_0x006a
            r15 = r30
            boolean r16 = r9.W(r15)
            if (r16 == 0) goto L_0x007c
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r12 = r12 | r16
        L_0x0080:
            r1 = r1 & r14
            if (r1 == 0) goto L_0x0088
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r8 = r31
            goto L_0x009b
        L_0x0088:
            r8 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0085
            r8 = r31
            boolean r17 = r9.d(r8)
            if (r17 == 0) goto L_0x0097
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r12 = r12 | r17
        L_0x009b:
            r2 = r2 & r14
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00a5
            r12 = r12 | r17
            r6 = r32
            goto L_0x00b8
        L_0x00a5:
            r17 = r13 & r17
            r6 = r32
            if (r17 != 0) goto L_0x00b8
            boolean r18 = r9.l(r6)
            if (r18 == 0) goto L_0x00b4
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r12 = r12 | r18
        L_0x00b8:
            r18 = r14 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00c3
            r12 = r12 | r19
            r10 = r33
            goto L_0x00d6
        L_0x00c3:
            r19 = r13 & r19
            r10 = r33
            if (r19 != 0) goto L_0x00d6
            boolean r19 = r9.d(r10)
            if (r19 == 0) goto L_0x00d2
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r12 = r12 | r19
        L_0x00d6:
            r0 = r0 & r14
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e0
            r12 = r12 | r19
            r7 = r34
            goto L_0x00f3
        L_0x00e0:
            r19 = r13 & r19
            r7 = r34
            if (r19 != 0) goto L_0x00f3
            boolean r20 = r9.W(r7)
            if (r20 == 0) goto L_0x00ef
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r12 = r12 | r20
        L_0x00f3:
            r20 = 100663296(0x6000000, float:2.4074124E-35)
            r20 = r13 & r20
            if (r20 != 0) goto L_0x0110
            r4 = 256(0x100, float:3.59E-43)
            r6 = r14 & 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x010a
            r6 = r35
            boolean r4 = r9.j(r6)
            if (r4 == 0) goto L_0x010c
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010e
        L_0x010a:
            r6 = r35
        L_0x010c:
            r4 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010e:
            r12 = r12 | r4
            goto L_0x0112
        L_0x0110:
            r6 = r35
        L_0x0112:
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x012a
            r4 = r14 & 512(0x200, float:7.175E-43)
            r6 = r37
            if (r4 != 0) goto L_0x0126
            boolean r4 = r9.j(r6)
            if (r4 == 0) goto L_0x0126
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0128
        L_0x0126:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0128:
            r12 = r12 | r4
            goto L_0x012c
        L_0x012a:
            r6 = r37
        L_0x012c:
            r4 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r4 & r12
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 == r6) goto L_0x0138
            r4 = 1
        L_0x0136:
            r6 = 1
            goto L_0x013a
        L_0x0138:
            r4 = 0
            goto L_0x0136
        L_0x013a:
            r7 = r12 & 1
            boolean r4 = r9.E(r4, r7)
            if (r4 == 0) goto L_0x0303
            r9.p()
            r4 = r13 & 1
            r6 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r7 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r21 = 0
            if (r4 == 0) goto L_0x0171
            boolean r4 = r9.J()
            if (r4 == 0) goto L_0x0158
            goto L_0x0171
        L_0x0158:
            r9.B()
            r0 = 256(0x100, float:3.59E-43)
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0161
            r12 = r12 & r7
        L_0x0161:
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0166
            r12 = r12 & r6
        L_0x0166:
            r1 = r32
            r0 = r34
            r18 = r35
            r22 = r37
            r4 = r15
            goto L_0x01d7
        L_0x0171:
            if (r5 == 0) goto L_0x0176
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0177
        L_0x0176:
            r4 = r15
        L_0x0177:
            if (r1 == 0) goto L_0x017a
            r8 = 1
        L_0x017a:
            if (r2 == 0) goto L_0x017f
            r1 = r21
            goto L_0x0181
        L_0x017f:
            r1 = r32
        L_0x0181:
            if (r18 == 0) goto L_0x0184
            r10 = 1
        L_0x0184:
            if (r0 == 0) goto L_0x018b
            r0 = r21
        L_0x0188:
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x018e
        L_0x018b:
            r0 = r34
            goto L_0x0188
        L_0x018e:
            r2 = r2 & r14
            if (r2 == 0) goto L_0x019e
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            r5 = 6
            androidx.compose.material.Colors r2 = r2.a(r9, r5)
            long r18 = r2.j()
            r12 = r12 & r7
            goto L_0x01a0
        L_0x019e:
            r18 = r35
        L_0x01a0:
            r2 = r14 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x01d5
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r2 = r9.C(r2)
            androidx.compose.ui.graphics.Color r2 = (androidx.compose.ui.graphics.Color) r2
            long r22 = r2.v()
            androidx.compose.material.ContentAlpha r2 = androidx.compose.material.ContentAlpha.f7561a
            r5 = 6
            float r2 = r2.d(r9, r5)
            r5 = 14
            r7 = 0
            r15 = 0
            r24 = 0
            r25 = 0
            r30 = r22
            r32 = r2
            r33 = r15
            r34 = r24
            r35 = r25
            r36 = r5
            r37 = r7
            long r22 = androidx.compose.ui.graphics.Color.l(r30, r32, r33, r34, r35, r36, r37)
            r12 = r12 & r6
            goto L_0x01d7
        L_0x01d5:
            r22 = r37
        L_0x01d7:
            r9.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x01e9
            r2 = -1
            java.lang.String r5 = "androidx.compose.material.NavigationRailItem (NavigationRail.kt:214)"
            r6 = -1813548445(0xffffffff93e77263, float:-5.8425392E-27)
            androidx.compose.runtime.ComposerKt.Y(r6, r12, r2, r5)
        L_0x01e9:
            r2 = 54
            if (r1 != 0) goto L_0x01f9
            r5 = 1653280754(0x628b0ff2, float:1.2826232E21)
            r9.X(r5)
        L_0x01f3:
            r9.M()
            r5 = r21
            goto L_0x020d
        L_0x01f9:
            r5 = 1653280755(0x628b0ff3, float:1.2826233E21)
            r9.X(r5)
            androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1 r5 = new androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
            r5.<init>(r1)
            r6 = -180398615(0xfffffffff53f55e9, float:-2.4254667E32)
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r21 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r7, r5, r9, r2)
            goto L_0x01f3
        L_0x020d:
            if (r1 != 0) goto L_0x0212
            float r6 = f8044c
            goto L_0x0214
        L_0x0212:
            float r6 = f8043b
        L_0x0214:
            r7 = 2
            r15 = 0
            r16 = 0
            r21 = 0
            r30 = r16
            r31 = r21
            r32 = r18
            r34 = r7
            r35 = r15
            androidx.compose.foundation.IndicationNodeFactory r7 = androidx.compose.material.RippleKt.f(r30, r31, r32, r34, r35)
            androidx.compose.ui.semantics.Role$Companion r15 = androidx.compose.ui.semantics.Role.f18040b
            int r15 = r15.h()
            androidx.compose.ui.semantics.Role r15 = androidx.compose.ui.semantics.Role.j(r15)
            r30 = r4
            r31 = r27
            r32 = r0
            r33 = r7
            r34 = r8
            r35 = r15
            r36 = r28
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.selection.SelectableKt.a(r30, r31, r32, r33, r34, r35, r36)
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.t(r7, r6)
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r7 = r7.e()
            r15 = 0
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.BoxKt.g(r7, r15)
            int r15 = androidx.compose.runtime.ComposablesKt.a(r9, r15)
            androidx.compose.runtime.CompositionLocalMap r2 = r9.I()
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.ComposedModifierKt.e(r9, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.f17222h
            r38 = r0
            kotlin.jvm.functions.Function0 r0 = r16.a()
            androidx.compose.runtime.Applier r20 = r9.v()
            if (r20 != 0) goto L_0x0270
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0270:
            r9.s()
            boolean r20 = r9.n()
            if (r20 == 0) goto L_0x027d
            r9.y(r0)
            goto L_0x0280
        L_0x027d:
            r9.K()
        L_0x0280:
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.Updater.b(r9)
            r20 = r1
            kotlin.jvm.functions.Function2 r1 = r16.c()
            androidx.compose.runtime.Updater.g(r0, r7, r1)
            kotlin.jvm.functions.Function2 r1 = r16.e()
            androidx.compose.runtime.Updater.g(r0, r2, r1)
            kotlin.jvm.functions.Function2 r1 = r16.b()
            boolean r2 = r0.n()
            if (r2 != 0) goto L_0x02ac
            java.lang.Object r2 = r0.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r7)
            if (r2 != 0) goto L_0x02ba
        L_0x02ac:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r0.N(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r0.A(r2, r1)
        L_0x02ba:
            kotlin.jvm.functions.Function2 r1 = r16.d()
            androidx.compose.runtime.Updater.g(r0, r6, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.material.NavigationRailKt$NavigationRailItem$1$1 r0 = new androidx.compose.material.NavigationRailKt$NavigationRailItem$1$1
            r0.<init>(r10, r3, r5)
            r1 = 670576792(0x27f83098, float:6.8886513E-15)
            r2 = 1
            r5 = 54
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r2, r0, r9, r5)
            int r1 = r12 >> 24
            r2 = r1 & 14
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = 6
            int r2 = r12 << 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r30 = r18
            r32 = r22
            r34 = r27
            r35 = r0
            r36 = r9
            r37 = r1
            e(r30, r32, r34, r35, r36, r37)
            r9.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02fc
            androidx.compose.runtime.ComposerKt.X()
        L_0x02fc:
            r5 = r8
            r7 = r10
            r6 = r20
            r8 = r38
            goto L_0x0311
        L_0x0303:
            r9.B()
            r6 = r32
            r18 = r35
            r22 = r37
            r5 = r8
            r7 = r10
            r4 = r15
            r8 = r34
        L_0x0311:
            androidx.compose.runtime.ScopeUpdateScope r15 = r9.x()
            if (r15 == 0) goto L_0x0332
            androidx.compose.material.NavigationRailKt$NavigationRailItem$2 r12 = new androidx.compose.material.NavigationRailKt$NavigationRailItem$2
            r0 = r12
            r1 = r27
            r2 = r28
            r3 = r29
            r9 = r18
            r26 = r12
            r11 = r22
            r13 = r40
            r14 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r14)
            r0 = r26
            r15.a(r0)
        L_0x0332:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.c(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(Function2 function2, Function2 function22, float f2, Composer composer, int i2) {
        int i3;
        boolean z2 = true;
        Composer q2 = composer.q(-1903861684);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function22) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.h(f2) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1903861684, i3, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:320)");
            }
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 896) != 256) {
                z2 = false;
            }
            boolean z4 = z2 | z3;
            Object g2 = q2.g();
            if (z4 || g2 == Composer.f14567a.a()) {
                g2 = new NavigationRailKt$NavigationRailItemBaselineLayout$2$1(function22, f2);
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
            function2.m(q2, Integer.valueOf(i3 & 14));
            q2.T();
            if (function22 != null) {
                q2.X(531629965);
                Modifier a6 = AlphaKt.a(LayoutIdKt.b(companion, "label"), f2);
                MeasurePolicy g4 = BoxKt.g(companion3.o(), false);
                int a7 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I3 = q2.I();
                Modifier e4 = ComposedModifierKt.e(q2, a6);
                Function0 a8 = companion2.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a8);
                } else {
                    q2.K();
                }
                Composer b7 = Updater.b(q2);
                Updater.g(b7, g4, companion2.c());
                Updater.g(b7, I3, companion2.e());
                Function2 b8 = companion2.b();
                if (b7.n() || !Intrinsics.d(b7.g(), Integer.valueOf(a7))) {
                    b7.N(Integer.valueOf(a7));
                    b7.A(Integer.valueOf(a7), b8);
                }
                Updater.g(b7, e4, companion2.d());
                function22.m(q2, Integer.valueOf((i3 >> 3) & 14));
                q2.T();
                q2.M();
            } else {
                q2.X(531729909);
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
            x2.a(new NavigationRailKt$NavigationRailItemBaselineLayout$3(function2, function22, f2, i2));
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
        Composer q2 = composer.q(-207161906);
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
                ComposerKt.Y(-207161906, i3, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:288)");
            }
            composer2 = q2;
            State d2 = AnimateAsStateKt.d(z3 ? 1.0f : 0.0f, f8042a, 0.0f, (String) null, (Function1) null, q2, 48, 28);
            long h2 = ColorKt.h(j5, j4, f(d2));
            CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(Color.l(h2, 1.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), ContentAlphaKt.a().d(Float.valueOf(Color.o(h2)))}, ComposableLambdaKt.e(-1688205042, true, new NavigationRailKt$NavigationRailTransition$1(function32, d2), composer2, 54), composer2, ProvidedValue.f14769i | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new NavigationRailKt$NavigationRailTransition$2(j2, j3, z2, function3, i2));
        }
    }

    public static final float f(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final MeasureResult n(MeasureScope measureScope, Placeable placeable, long j2) {
        return MeasureScope.R1(measureScope, Constraints.l(j2), Constraints.k(j2), (Map) null, new NavigationRailKt$placeIcon$1(placeable, Math.max(0, (Constraints.l(j2) - placeable.L0()) / 2), Math.max(0, (Constraints.k(j2) - placeable.C0()) / 2)), 4, (Object) null);
    }

    public static final MeasureResult o(MeasureScope measureScope, Placeable placeable, Placeable placeable2, long j2, float f2) {
        int f0 = placeable.f0(AlignmentLineKt.b());
        int k2 = (Constraints.k(j2) - f0) - measureScope.P1(f8047f);
        int l2 = (Constraints.l(j2) - placeable.L0()) / 2;
        int P1 = measureScope.P1(f8048g);
        int l3 = (Constraints.l(j2) - placeable2.L0()) / 2;
        int d2 = MathKt.d(((float) (((Constraints.k(j2) - placeable2.C0()) / 2) - P1)) * (((float) 1) - f2));
        return MeasureScope.R1(measureScope, Constraints.l(j2), Constraints.k(j2), (Map) null, new NavigationRailKt$placeLabelAndIcon$1(f2, placeable, l2, k2, d2, placeable2, l3, P1), 4, (Object) null);
    }
}
