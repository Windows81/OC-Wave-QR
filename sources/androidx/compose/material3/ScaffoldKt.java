package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.FabPosition;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ScaffoldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10765a = Dp.m((float) 16);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: androidx.compose.material3.internal.MutableWindowInsets} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(androidx.compose.ui.Modifier r31, kotlin.jvm.functions.Function2 r32, kotlin.jvm.functions.Function2 r33, kotlin.jvm.functions.Function2 r34, kotlin.jvm.functions.Function2 r35, int r36, long r37, long r39, androidx.compose.foundation.layout.WindowInsets r41, kotlin.jvm.functions.Function3 r42, androidx.compose.runtime.Composer r43, int r44, int r45) {
        /*
            r13 = r44
            r14 = r45
            r0 = -1211482744(0xffffffffb7ca3d88, float:-2.410893E-5)
            r1 = r43
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r13 | 6
            r4 = r3
            r3 = r31
            goto L_0x002b
        L_0x0017:
            r3 = r13 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r31
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r13
            goto L_0x002b
        L_0x0028:
            r3 = r31
            r4 = r13
        L_0x002b:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r32
            goto L_0x0046
        L_0x0034:
            r6 = r13 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r32
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r4 = r4 | r7
        L_0x0046:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r8 = r33
            goto L_0x0061
        L_0x004f:
            r8 = r13 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004c
            r8 = r33
            boolean r9 = r1.l(r8)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r9
        L_0x0061:
            r9 = r14 & 8
            if (r9 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r10 = r34
            goto L_0x007c
        L_0x006a:
            r10 = r13 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0067
            r10 = r34
            boolean r11 = r1.l(r10)
            if (r11 == 0) goto L_0x0079
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r11
        L_0x007c:
            r11 = r14 & 16
            if (r11 == 0) goto L_0x0085
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r12 = r35
            goto L_0x0097
        L_0x0085:
            r12 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r35
            boolean r15 = r1.l(r12)
            if (r15 == 0) goto L_0x0094
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r4 = r4 | r15
        L_0x0097:
            r15 = r14 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x00a2
            r4 = r4 | r16
            r0 = r36
            goto L_0x00b5
        L_0x00a2:
            r16 = r13 & r16
            r0 = r36
            if (r16 != 0) goto L_0x00b5
            boolean r17 = r1.i(r0)
            if (r17 == 0) goto L_0x00b1
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r4 = r4 | r17
        L_0x00b5:
            r17 = 1572864(0x180000, float:2.204052E-39)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00d1
            r17 = r14 & 64
            r43 = r11
            r10 = r37
            if (r17 != 0) goto L_0x00cc
            boolean r17 = r1.j(r10)
            if (r17 == 0) goto L_0x00cc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r4 = r4 | r17
            goto L_0x00d5
        L_0x00d1:
            r43 = r11
            r10 = r37
        L_0x00d5:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = r13 & r17
            if (r18 != 0) goto L_0x00ee
            r0 = r14 & 128(0x80, float:1.794E-43)
            r10 = r39
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r1.j(r10)
            if (r0 == 0) goto L_0x00ea
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r4 = r4 | r0
            goto L_0x00f0
        L_0x00ee:
            r10 = r39
        L_0x00f0:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r18 = r13 & r0
            if (r18 != 0) goto L_0x010c
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0105
            r0 = r41
            boolean r20 = r1.W(r0)
            if (r20 == 0) goto L_0x0107
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0105:
            r0 = r41
        L_0x0107:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r4 = r4 | r20
            goto L_0x010e
        L_0x010c:
            r0 = r41
        L_0x010e:
            r0 = r14 & 512(0x200, float:7.175E-43)
            r20 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0119
            r4 = r4 | r20
        L_0x0116:
            r0 = r42
            goto L_0x012c
        L_0x0119:
            r0 = r13 & r20
            if (r0 != 0) goto L_0x0116
            r0 = r42
            boolean r20 = r1.l(r0)
            if (r20 == 0) goto L_0x0128
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012a
        L_0x0128:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012a:
            r4 = r4 | r20
        L_0x012c:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r4 & r20
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            r20 = 0
            if (r0 == r3) goto L_0x013a
            r0 = 1
            goto L_0x013c
        L_0x013a:
            r0 = r20
        L_0x013c:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x02c6
            r1.p()
            r0 = r13 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r21 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r0 == 0) goto L_0x017f
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0158
            goto L_0x017f
        L_0x0158:
            r1.B()
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0161
            r4 = r4 & r21
        L_0x0161:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0166
            r4 = r4 & r3
        L_0x0166:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x016e
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r4 = r4 & r0
        L_0x016e:
            r0 = r31
            r2 = r32
            r3 = r34
            r9 = r36
            r6 = r37
            r5 = r8
            r8 = r12
        L_0x017a:
            r12 = r4
            r4 = r41
            goto L_0x01f9
        L_0x017f:
            if (r2 == 0) goto L_0x0184
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0186
        L_0x0184:
            r0 = r31
        L_0x0186:
            if (r5 == 0) goto L_0x018f
            androidx.compose.material3.ComposableSingletons$ScaffoldKt r2 = androidx.compose.material3.ComposableSingletons$ScaffoldKt.f9568a
            kotlin.jvm.functions.Function2 r2 = r2.b()
            goto L_0x0191
        L_0x018f:
            r2 = r32
        L_0x0191:
            if (r7 == 0) goto L_0x019a
            androidx.compose.material3.ComposableSingletons$ScaffoldKt r5 = androidx.compose.material3.ComposableSingletons$ScaffoldKt.f9568a
            kotlin.jvm.functions.Function2 r5 = r5.c()
            goto L_0x019b
        L_0x019a:
            r5 = r8
        L_0x019b:
            if (r9 == 0) goto L_0x01a4
            androidx.compose.material3.ComposableSingletons$ScaffoldKt r7 = androidx.compose.material3.ComposableSingletons$ScaffoldKt.f9568a
            kotlin.jvm.functions.Function2 r7 = r7.d()
            goto L_0x01a6
        L_0x01a4:
            r7 = r34
        L_0x01a6:
            if (r43 == 0) goto L_0x01af
            androidx.compose.material3.ComposableSingletons$ScaffoldKt r8 = androidx.compose.material3.ComposableSingletons$ScaffoldKt.f9568a
            kotlin.jvm.functions.Function2 r8 = r8.a()
            goto L_0x01b0
        L_0x01af:
            r8 = r12
        L_0x01b0:
            if (r15 == 0) goto L_0x01b9
            androidx.compose.material3.FabPosition$Companion r9 = androidx.compose.material3.FabPosition.f10002b
            int r9 = r9.a()
            goto L_0x01bb
        L_0x01b9:
            r9 = r36
        L_0x01bb:
            r12 = r14 & 64
            r15 = 6
            if (r12 == 0) goto L_0x01d1
            androidx.compose.material3.MaterialTheme r12 = androidx.compose.material3.MaterialTheme.f10273a
            androidx.compose.material3.ColorScheme r12 = r12.a(r1, r15)
            long r22 = r12.a()
            r4 = r4 & r21
            r31 = r7
            r6 = r22
            goto L_0x01d5
        L_0x01d1:
            r31 = r7
            r6 = r37
        L_0x01d5:
            r12 = r14 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x01e3
            int r10 = r4 >> 18
            r10 = r10 & 14
            long r10 = androidx.compose.material3.ColorSchemeKt.g(r6, r1, r10)
            r3 = r3 & r4
            r4 = r3
        L_0x01e3:
            r3 = r14 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x01f6
            androidx.compose.material3.ScaffoldDefaults r3 = androidx.compose.material3.ScaffoldDefaults.f10764a
            androidx.compose.foundation.layout.WindowInsets r3 = r3.a(r1, r15)
            r12 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r4 = r4 & r12
            r12 = r4
            r4 = r3
            r3 = r31
            goto L_0x01f9
        L_0x01f6:
            r3 = r31
            goto L_0x017a
        L_0x01f9:
            r1.U()
            boolean r15 = androidx.compose.runtime.ComposerKt.P()
            if (r15 == 0) goto L_0x020b
            r15 = -1
            java.lang.String r13 = "androidx.compose.material3.Scaffold (Scaffold.kt:93)"
            r14 = -1211482744(0xffffffffb7ca3d88, float:-2.410893E-5)
            androidx.compose.runtime.ComposerKt.Y(r14, r12, r15, r13)
        L_0x020b:
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r12
            r14 = 100663296(0x6000000, float:2.4074124E-35)
            r13 = r13 ^ r14
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            if (r13 <= r15) goto L_0x021b
            boolean r16 = r1.W(r4)
            if (r16 != 0) goto L_0x021e
        L_0x021b:
            r39 = r10
            goto L_0x0221
        L_0x021e:
            r39 = r10
            goto L_0x0225
        L_0x0221:
            r10 = r12 & r14
            if (r10 != r15) goto L_0x0227
        L_0x0225:
            r10 = 1
            goto L_0x0229
        L_0x0227:
            r10 = r20
        L_0x0229:
            java.lang.Object r11 = r1.g()
            if (r10 != 0) goto L_0x0237
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x023f
        L_0x0237:
            androidx.compose.material3.internal.MutableWindowInsets r11 = new androidx.compose.material3.internal.MutableWindowInsets
            r11.<init>(r4)
            r1.N(r11)
        L_0x023f:
            r10 = r11
            androidx.compose.material3.internal.MutableWindowInsets r10 = (androidx.compose.material3.internal.MutableWindowInsets) r10
            boolean r11 = r1.W(r10)
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            if (r13 <= r14) goto L_0x0250
            boolean r13 = r1.W(r4)
            if (r13 != 0) goto L_0x0255
        L_0x0250:
            r13 = 100663296(0x6000000, float:2.4074124E-35)
            r13 = r13 & r12
            if (r13 != r14) goto L_0x0257
        L_0x0255:
            r20 = 1
        L_0x0257:
            r11 = r11 | r20
            java.lang.Object r13 = r1.g()
            if (r11 != 0) goto L_0x0267
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x026f
        L_0x0267:
            androidx.compose.material3.n5 r13 = new androidx.compose.material3.n5
            r13.<init>(r10, r4)
            r1.N(r13)
        L_0x026f:
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            androidx.compose.ui.Modifier r15 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.d(r0, r13)
            androidx.compose.material3.ScaffoldKt$Scaffold$2 r11 = new androidx.compose.material3.ScaffoldKt$Scaffold$2
            r31 = r11
            r32 = r9
            r33 = r2
            r34 = r42
            r35 = r3
            r36 = r8
            r37 = r10
            r38 = r5
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            r10 = 54
            r13 = 848889571(0x329906e3, float:1.7814676E-8)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r24 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r14, r11, r1, r10)
            int r10 = r12 >> 12
            r11 = r10 & 896(0x380, float:1.256E-42)
            r11 = r11 | r17
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r26 = r11 | r10
            r27 = 114(0x72, float:1.6E-43)
            r16 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r17 = r6
            r19 = r39
            r25 = r1
            androidx.compose.material3.SurfaceKt.c(r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27)
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x02ba
            androidx.compose.runtime.ComposerKt.X()
        L_0x02ba:
            r11 = r39
            r13 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r29 = r6
            r6 = r9
            r9 = r29
            goto L_0x02d8
        L_0x02c6:
            r1.B()
            r2 = r31
            r3 = r32
            r4 = r34
            r6 = r36
            r13 = r41
            r5 = r8
            r8 = r12
            r11 = r10
            r9 = r37
        L_0x02d8:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.x()
            if (r15 == 0) goto L_0x02f8
            androidx.compose.material3.o5 r14 = new androidx.compose.material3.o5
            r0 = r14
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r8
            r7 = r9
            r9 = r11
            r11 = r13
            r12 = r42
            r13 = r44
            r28 = r14
            r14 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
            r0 = r28
            r15.a(r0)
        L_0x02f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScaffoldKt.f(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, int, long, long, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: androidx.compose.material3.p5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(int r19, kotlin.jvm.functions.Function2 r20, kotlin.jvm.functions.Function3 r21, kotlin.jvm.functions.Function2 r22, kotlin.jvm.functions.Function2 r23, androidx.compose.foundation.layout.WindowInsets r24, kotlin.jvm.functions.Function2 r25, androidx.compose.runtime.Composer r26, int r27) {
        /*
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r7 = r25
            r8 = r27
            r0 = -280287501(0xffffffffef4b26f3, float:-6.2872544E28)
            r1 = r26
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r6 = r8 & 6
            if (r6 != 0) goto L_0x0026
            r6 = r19
            boolean r10 = r1.i(r6)
            if (r10 == 0) goto L_0x0023
            r10 = 4
            goto L_0x0024
        L_0x0023:
            r10 = 2
        L_0x0024:
            r10 = r10 | r8
            goto L_0x0029
        L_0x0026:
            r6 = r19
            r10 = r8
        L_0x0029:
            r11 = r8 & 48
            r12 = 32
            if (r11 != 0) goto L_0x003a
            boolean r11 = r1.l(r2)
            if (r11 == 0) goto L_0x0037
            r11 = r12
            goto L_0x0039
        L_0x0037:
            r11 = 16
        L_0x0039:
            r10 = r10 | r11
        L_0x003a:
            r11 = r8 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004a
            boolean r11 = r1.l(r3)
            if (r11 == 0) goto L_0x0047
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0049
        L_0x0047:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0049:
            r10 = r10 | r11
        L_0x004a:
            r11 = r8 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x005a
            boolean r11 = r1.l(r4)
            if (r11 == 0) goto L_0x0057
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0059
        L_0x0057:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0059:
            r10 = r10 | r11
        L_0x005a:
            r11 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x006a
            boolean r11 = r1.l(r5)
            if (r11 == 0) goto L_0x0067
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0069
        L_0x0067:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0069:
            r10 = r10 | r11
        L_0x006a:
            r11 = 196608(0x30000, float:2.75506E-40)
            r11 = r11 & r8
            if (r11 != 0) goto L_0x007f
            r11 = r24
            boolean r16 = r1.W(r11)
            if (r16 == 0) goto L_0x007a
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007c
        L_0x007a:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x007c:
            r10 = r10 | r16
            goto L_0x0081
        L_0x007f:
            r11 = r24
        L_0x0081:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r8 & r16
            if (r16 != 0) goto L_0x0094
            boolean r16 = r1.l(r7)
            if (r16 == 0) goto L_0x0090
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0092
        L_0x0090:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x0092:
            r10 = r10 | r16
        L_0x0094:
            r16 = 599187(0x92493, float:8.3964E-40)
            r9 = r10 & r16
            r13 = 599186(0x92492, float:8.39638E-40)
            r14 = 1
            if (r9 == r13) goto L_0x00a1
            r9 = r14
            goto L_0x00a2
        L_0x00a1:
            r9 = 0
        L_0x00a2:
            r13 = r10 & 1
            boolean r9 = r1.E(r9, r13)
            if (r9 == 0) goto L_0x01f7
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x00b6
            r9 = -1
            java.lang.String r13 = "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:137)"
            androidx.compose.runtime.ComposerKt.Y(r0, r10, r9, r13)
        L_0x00b6:
            java.lang.Object r0 = r1.g()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r9.a()
            if (r0 != r13) goto L_0x00ca
            androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1 r0 = new androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1
            r0.<init>()
            r1.N(r0)
        L_0x00ca:
            androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1 r0 = (androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1) r0
            r13 = r10 & 112(0x70, float:1.57E-43)
            if (r13 != r12) goto L_0x00d2
            r12 = r14
            goto L_0x00d3
        L_0x00d2:
            r12 = 0
        L_0x00d3:
            java.lang.Object r13 = r1.g()
            if (r12 != 0) goto L_0x00df
            java.lang.Object r12 = r9.a()
            if (r13 != r12) goto L_0x00ee
        L_0x00df:
            androidx.compose.material3.ScaffoldKt$ScaffoldLayout$topBarContent$1$1 r12 = new androidx.compose.material3.ScaffoldKt$ScaffoldLayout$topBarContent$1$1
            r12.<init>(r2)
            r13 = 605195056(0x24128b30, float:3.17766E-17)
            androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r13, r14, r12)
            r1.N(r13)
        L_0x00ee:
            r12 = r13
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r13 = r10 & 7168(0x1c00, float:1.0045E-41)
            r15 = 2048(0x800, float:2.87E-42)
            if (r13 != r15) goto L_0x00f9
            r13 = r14
            goto L_0x00fa
        L_0x00f9:
            r13 = 0
        L_0x00fa:
            java.lang.Object r15 = r1.g()
            if (r13 != 0) goto L_0x0106
            java.lang.Object r13 = r9.a()
            if (r15 != r13) goto L_0x0115
        L_0x0106:
            androidx.compose.material3.ScaffoldKt$ScaffoldLayout$snackbarContent$1$1 r13 = new androidx.compose.material3.ScaffoldKt$ScaffoldLayout$snackbarContent$1$1
            r13.<init>(r4)
            r15 = 418899191(0x18f7e4f7, float:6.40792E-24)
            androidx.compose.runtime.internal.ComposableLambda r15 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r15, r14, r13)
            r1.N(r15)
        L_0x0115:
            r13 = r15
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r10
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r15 != r14) goto L_0x0122
            r14 = 1
            goto L_0x0123
        L_0x0122:
            r14 = 0
        L_0x0123:
            java.lang.Object r15 = r1.g()
            if (r14 != 0) goto L_0x012f
            java.lang.Object r14 = r9.a()
            if (r15 != r14) goto L_0x013f
        L_0x012f:
            androidx.compose.material3.ScaffoldKt$ScaffoldLayout$fabContent$1$1 r14 = new androidx.compose.material3.ScaffoldKt$ScaffoldLayout$fabContent$1$1
            r14.<init>(r5)
            r15 = 338600263(0x142ea147, float:8.8165614E-27)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r15 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r15, r2, r14)
            r1.N(r15)
        L_0x013f:
            r14 = r15
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r2 = r10 & 896(0x380, float:1.256E-42)
            r15 = 256(0x100, float:3.59E-43)
            if (r2 != r15) goto L_0x014a
            r2 = 1
            goto L_0x014b
        L_0x014a:
            r2 = 0
        L_0x014b:
            java.lang.Object r15 = r1.g()
            if (r2 != 0) goto L_0x0157
            java.lang.Object r2 = r9.a()
            if (r15 != r2) goto L_0x0167
        L_0x0157:
            androidx.compose.material3.ScaffoldKt$ScaffoldLayout$bodyContent$1$1 r2 = new androidx.compose.material3.ScaffoldKt$ScaffoldLayout$bodyContent$1$1
            r2.<init>(r3, r0)
            r15 = -1776388365(0xffffffff961e76f3, float:-1.2800672E-25)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r15 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r15, r3, r2)
            r1.N(r15)
        L_0x0167:
            r2 = r15
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r10
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r3 != r15) goto L_0x0173
            r3 = 1
            goto L_0x0174
        L_0x0173:
            r3 = 0
        L_0x0174:
            java.lang.Object r15 = r1.g()
            if (r3 != 0) goto L_0x0183
            java.lang.Object r3 = r9.a()
            if (r15 != r3) goto L_0x0181
            goto L_0x0183
        L_0x0181:
            r4 = 1
            goto L_0x0193
        L_0x0183:
            androidx.compose.material3.ScaffoldKt$ScaffoldLayout$bottomBarContent$1$1 r3 = new androidx.compose.material3.ScaffoldKt$ScaffoldLayout$bottomBarContent$1$1
            r3.<init>(r7)
            r15 = -1731662488(0xffffffff98c8ed68, float:-5.1938507E-24)
            r4 = 1
            androidx.compose.runtime.internal.ComposableLambda r15 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r15, r4, r3)
            r1.N(r15)
        L_0x0193:
            r3 = r15
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r10
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r15 != r4) goto L_0x019f
            r4 = 1
            goto L_0x01a0
        L_0x019f:
            r4 = 0
        L_0x01a0:
            boolean r15 = r1.W(r12)
            r4 = r4 | r15
            boolean r15 = r1.W(r13)
            r4 = r4 | r15
            boolean r15 = r1.W(r14)
            r4 = r4 | r15
            r10 = r10 & 14
            r15 = 4
            if (r10 != r15) goto L_0x01b6
            r10 = 1
            goto L_0x01b7
        L_0x01b6:
            r10 = 0
        L_0x01b7:
            r4 = r4 | r10
            boolean r10 = r1.W(r3)
            r4 = r4 | r10
            boolean r10 = r1.W(r2)
            r4 = r4 | r10
            java.lang.Object r10 = r1.g()
            if (r4 != 0) goto L_0x01d2
            java.lang.Object r4 = r9.a()
            if (r10 != r4) goto L_0x01cf
            goto L_0x01d2
        L_0x01cf:
            r5 = 0
            r9 = 1
            goto L_0x01e7
        L_0x01d2:
            androidx.compose.material3.p5 r4 = new androidx.compose.material3.p5
            r10 = r4
            r11 = r24
            r9 = 1
            r5 = 0
            r15 = r19
            r16 = r3
            r17 = r0
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r1.N(r4)
        L_0x01e7:
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r0 = 0
            androidx.compose.ui.layout.SubcomposeLayoutKt.a(r0, r10, r1, r5, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01fa
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x01fa
        L_0x01f7:
            r1.B()
        L_0x01fa:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x0219
            androidx.compose.material3.q5 r10 = new androidx.compose.material3.q5
            r0 = r10
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0219:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScaffoldKt.g(int, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    public static final MeasureResult h(WindowInsets windowInsets, Function2 function2, Function2 function22, Function2 function23, int i2, Function2 function24, ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, Function2 function25, SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        FabPlacement fabPlacement;
        Integer num;
        int i3;
        int i4;
        int a2;
        int c2;
        int i5;
        int P1;
        int P12;
        WindowInsets windowInsets2 = windowInsets;
        int i6 = i2;
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        int l2 = Constraints.l(constraints.r());
        int k2 = Constraints.k(constraints.r());
        long d2 = Constraints.d(constraints.r(), 0, 0, 0, 0, 10, (Object) null);
        int d3 = windowInsets2.d(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection());
        int b2 = windowInsets2.b(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection());
        int c3 = windowInsets2.c(subcomposeMeasureScope2);
        Placeable c0 = ((Measurable) CollectionsKt.e0(subcomposeMeasureScope2.j0(ScaffoldLayoutContent.TopBar, function2))).c0(d2);
        int i7 = (-d3) - b2;
        int i8 = -c3;
        Placeable c02 = ((Measurable) CollectionsKt.e0(subcomposeMeasureScope2.j0(ScaffoldLayoutContent.Snackbar, function22))).c0(ConstraintsKt.i(d2, i7, i8));
        Placeable c03 = ((Measurable) CollectionsKt.e0(subcomposeMeasureScope2.j0(ScaffoldLayoutContent.Fab, function23))).c0(ConstraintsKt.i(d2, i7, i8));
        if (c03.L0() == 0 && c03.C0() == 0) {
            fabPlacement = null;
        } else {
            int L0 = c03.L0();
            int C0 = c03.C0();
            FabPosition.Companion companion = FabPosition.f10002b;
            if (FabPosition.f(i6, companion.c())) {
                if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                    P1 = subcomposeMeasureScope2.P1(f10765a);
                } else {
                    P12 = subcomposeMeasureScope2.P1(f10765a);
                    i5 = ((l2 - P12) - L0) - b2;
                    fabPlacement = new FabPlacement(i5, L0, C0);
                }
            } else if (!FabPosition.f(i6, companion.a()) && !FabPosition.f(i6, companion.b())) {
                i5 = (((l2 - L0) + d3) - b2) / 2;
                fabPlacement = new FabPlacement(i5, L0, C0);
            } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                P12 = subcomposeMeasureScope2.P1(f10765a);
                i5 = ((l2 - P12) - L0) - b2;
                fabPlacement = new FabPlacement(i5, L0, C0);
            } else {
                P1 = subcomposeMeasureScope2.P1(f10765a);
            }
            i5 = P1 + d3;
            fabPlacement = new FabPlacement(i5, L0, C0);
        }
        Placeable c04 = ((Measurable) CollectionsKt.e0(subcomposeMeasureScope2.j0(ScaffoldLayoutContent.BottomBar, function24))).c0(d2);
        boolean z2 = c04.L0() == 0 && c04.C0() == 0;
        if (fabPlacement != null) {
            if (z2 || FabPosition.f(i6, FabPosition.f10002b.b())) {
                a2 = fabPlacement.a() + subcomposeMeasureScope2.P1(f10765a);
                c2 = windowInsets2.c(subcomposeMeasureScope2);
            } else {
                a2 = c04.C0() + fabPlacement.a();
                c2 = subcomposeMeasureScope2.P1(f10765a);
            }
            num = Integer.valueOf(a2 + c2);
        } else {
            num = null;
        }
        int C02 = c02.C0();
        if (C02 != 0) {
            if (num != null) {
                i4 = num.intValue();
            } else {
                Integer valueOf = Integer.valueOf(c04.C0());
                if (z2) {
                    valueOf = null;
                }
                i4 = valueOf != null ? valueOf.intValue() : windowInsets2.c(subcomposeMeasureScope2);
            }
            i3 = C02 + i4;
        } else {
            i3 = 0;
        }
        PaddingValues h2 = WindowInsetsKt.h(windowInsets2, subcomposeMeasureScope2);
        scaffoldKt$ScaffoldLayout$contentPadding$1$1.f(PaddingKt.d(PaddingKt.g(h2, subcomposeMeasureScope.getLayoutDirection()), (c0.L0() == 0 && c0.C0() == 0) ? h2.d() : subcomposeMeasureScope2.D(c0.C0()), PaddingKt.f(h2, subcomposeMeasureScope.getLayoutDirection()), z2 ? h2.a() : subcomposeMeasureScope2.D(c04.C0())));
        return MeasureScope.R1(subcomposeMeasureScope, l2, k2, (Map) null, new C0231r5(((Measurable) CollectionsKt.e0(subcomposeMeasureScope2.j0(ScaffoldLayoutContent.MainContent, function25))).c0(d2), c0, c02, l2, windowInsets, subcomposeMeasureScope, k2, i3, c04, fabPlacement, c03, num), 4, (Object) null);
    }

    public static final Unit i(Placeable placeable, Placeable placeable2, Placeable placeable3, int i2, WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope, int i3, int i4, Placeable placeable4, FabPlacement fabPlacement, Placeable placeable5, Integer num, Placeable.PlacementScope placementScope) {
        WindowInsets windowInsets2 = windowInsets;
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        Placeable.PlacementScope.j(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.j(placementScope, placeable2, 0, 0, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.j(placementScope, placeable3, (((i2 - placeable3.L0()) + windowInsets2.d(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection())) - windowInsets2.b(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection())) / 2, i3 - i4, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.j(placementScope, placeable4, 0, i3 - placeable4.C0(), 0.0f, 4, (Object) null);
        if (fabPlacement != null) {
            int b2 = fabPlacement.b();
            Intrinsics.f(num);
            Placeable.PlacementScope.j(placementScope, placeable5, b2, i3 - num.intValue(), 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public static final Unit j(int i2, Function2 function2, Function3 function3, Function2 function22, Function2 function23, WindowInsets windowInsets, Function2 function24, int i3, Composer composer, int i4) {
        g(i2, function2, function3, function22, function23, windowInsets, function24, composer, RecomposeScopeImplKt.a(i3 | 1));
        return Unit.f40552a;
    }

    public static final Unit k(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, WindowInsets windowInsets2) {
        mutableWindowInsets.f(WindowInsetsKt.i(windowInsets, windowInsets2));
        return Unit.f40552a;
    }

    public static final Unit l(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, Function2 function24, int i2, long j2, long j3, WindowInsets windowInsets, Function3 function3, int i3, int i4, Composer composer, int i5) {
        f(modifier, function2, function22, function23, function24, i2, j2, j3, windowInsets, function3, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }
}
