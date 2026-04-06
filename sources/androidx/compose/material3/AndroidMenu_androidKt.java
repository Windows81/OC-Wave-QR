package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AndroidMenu_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final PopupProperties f9160a = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: androidx.compose.material3.internal.DropdownMenuPositionProvider} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v3, resolved type: androidx.compose.material3.internal.DropdownMenuPositionProvider} */
    /* JADX WARNING: type inference failed for: r15v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02f5, code lost:
        if (r15 == r14.a()) goto L_0x02f7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(boolean r36, kotlin.jvm.functions.Function0 r37, androidx.compose.ui.Modifier r38, long r39, androidx.compose.foundation.ScrollState r41, androidx.compose.ui.window.PopupProperties r42, androidx.compose.ui.graphics.Shape r43, long r44, float r46, float r47, androidx.compose.foundation.BorderStroke r48, kotlin.jvm.functions.Function3 r49, androidx.compose.runtime.Composer r50, int r51, int r52, int r53) {
        /*
            r15 = r51
            r14 = r53
            r0 = 1725609375(0x66dab59f, float:5.164131E23)
            r1 = r50
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r15 | 6
            r5 = r2
            r2 = r36
            goto L_0x002b
        L_0x0017:
            r2 = r15 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r36
            boolean r5 = r1.d(r2)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r15
            goto L_0x002b
        L_0x0028:
            r2 = r36
            r5 = r15
        L_0x002b:
            r6 = r14 & 2
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
        L_0x0031:
            r6 = r37
            goto L_0x0046
        L_0x0034:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r37
            boolean r9 = r1.l(r6)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0045
        L_0x0043:
            r9 = 16
        L_0x0045:
            r5 = r5 | r9
        L_0x0046:
            r9 = r14 & 4
            if (r9 == 0) goto L_0x004f
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r10 = r38
            goto L_0x0061
        L_0x004f:
            r10 = r15 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004c
            r10 = r38
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r5 = r5 | r11
        L_0x0061:
            r11 = r14 & 8
            if (r11 == 0) goto L_0x006a
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r12 = r39
            goto L_0x007d
        L_0x006a:
            r13 = r15 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0067
            r12 = r39
            boolean r16 = r1.j(r12)
            if (r16 == 0) goto L_0x0079
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r5 = r5 | r16
        L_0x007d:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0097
            r3 = r14 & 16
            if (r3 != 0) goto L_0x0090
            r3 = r41
            boolean r17 = r1.W(r3)
            if (r17 == 0) goto L_0x0092
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0090:
            r3 = r41
        L_0x0092:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r5 = r5 | r17
            goto L_0x0099
        L_0x0097:
            r3 = r41
        L_0x0099:
            r17 = r14 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00a4
            r5 = r5 | r18
            r8 = r42
            goto L_0x00b7
        L_0x00a4:
            r18 = r15 & r18
            r8 = r42
            if (r18 != 0) goto L_0x00b7
            boolean r19 = r1.W(r8)
            if (r19 == 0) goto L_0x00b3
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r5 = r5 | r19
        L_0x00b7:
            r19 = 1572864(0x180000, float:2.204052E-39)
            r19 = r15 & r19
            if (r19 != 0) goto L_0x00d1
            r19 = r14 & 64
            r4 = r43
            if (r19 != 0) goto L_0x00cc
            boolean r20 = r1.W(r4)
            if (r20 == 0) goto L_0x00cc
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r5 = r5 | r20
            goto L_0x00d3
        L_0x00d1:
            r4 = r43
        L_0x00d3:
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            r20 = r15 & r20
            if (r20 != 0) goto L_0x00ed
            r0 = r14 & 128(0x80, float:1.794E-43)
            r7 = r44
            if (r0 != 0) goto L_0x00e8
            boolean r21 = r1.j(r7)
            if (r21 == 0) goto L_0x00e8
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r5 = r5 | r21
            goto L_0x00ef
        L_0x00ed:
            r7 = r44
        L_0x00ef:
            r0 = r14 & 256(0x100, float:3.59E-43)
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00fa
            r5 = r5 | r22
            r2 = r46
            goto L_0x010d
        L_0x00fa:
            r22 = r15 & r22
            r2 = r46
            if (r22 != 0) goto L_0x010d
            boolean r22 = r1.h(r2)
            if (r22 == 0) goto L_0x0109
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r5 = r5 | r22
        L_0x010d:
            r2 = r14 & 512(0x200, float:7.175E-43)
            r22 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0118
            r5 = r5 | r22
            r3 = r47
            goto L_0x012b
        L_0x0118:
            r22 = r15 & r22
            r3 = r47
            if (r22 != 0) goto L_0x012b
            boolean r22 = r1.h(r3)
            if (r22 == 0) goto L_0x0127
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0129
        L_0x0127:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0129:
            r5 = r5 | r22
        L_0x012b:
            r3 = r14 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0134
            r16 = r52 | 6
            r4 = r48
            goto L_0x014a
        L_0x0134:
            r22 = r52 & 6
            r4 = r48
            if (r22 != 0) goto L_0x0148
            boolean r22 = r1.W(r4)
            if (r22 == 0) goto L_0x0143
            r16 = 4
            goto L_0x0145
        L_0x0143:
            r16 = 2
        L_0x0145:
            r16 = r52 | r16
            goto L_0x014a
        L_0x0148:
            r16 = r52
        L_0x014a:
            r4 = r14 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0153
            r16 = r16 | 48
        L_0x0150:
            r4 = r16
            goto L_0x016a
        L_0x0153:
            r4 = r52 & 48
            if (r4 != 0) goto L_0x0167
            r4 = r49
            boolean r22 = r1.l(r4)
            if (r22 == 0) goto L_0x0162
            r18 = 32
            goto L_0x0164
        L_0x0162:
            r18 = 16
        L_0x0164:
            r16 = r16 | r18
            goto L_0x0150
        L_0x0167:
            r4 = r49
            goto L_0x0150
        L_0x016a:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r5 & r16
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x017d
            r6 = r4 & 19
            r7 = 18
            if (r6 == r7) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            r6 = 0
            goto L_0x017e
        L_0x017d:
            r6 = 1
        L_0x017e:
            r7 = r5 & 1
            boolean r6 = r1.E(r6, r7)
            if (r6 == 0) goto L_0x0371
            r1.p()
            r6 = r15 & 1
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r6 == 0) goto L_0x01c3
            boolean r6 = r1.J()
            if (r6 == 0) goto L_0x019a
            goto L_0x01c3
        L_0x019a:
            r1.B()
            r0 = r14 & 16
            if (r0 == 0) goto L_0x01a3
            r5 = r5 & r18
        L_0x01a3:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x01a8
            r5 = r5 & r7
        L_0x01a8:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01b0
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r5 = r5 & r0
        L_0x01b0:
            r8 = r43
            r2 = r44
            r0 = r46
            r7 = r48
            r11 = r5
            r6 = r10
            r9 = r12
            r13 = r41
            r12 = r42
            r5 = r47
            goto L_0x0249
        L_0x01c3:
            if (r9 == 0) goto L_0x01c8
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01c9
        L_0x01c8:
            r6 = r10
        L_0x01c9:
            if (r11 == 0) goto L_0x01ef
            r9 = 0
            float r10 = (float) r9
            float r9 = androidx.compose.ui.unit.Dp.m(r10)
            float r10 = androidx.compose.ui.unit.Dp.m(r10)
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r11 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r10)
            long r9 = (long) r9
            r13 = 32
            long r11 = r11 << r13
            r21 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r21
            long r9 = r9 | r11
            long r9 = androidx.compose.ui.unit.DpOffset.c(r9)
            goto L_0x01f0
        L_0x01ef:
            r9 = r12
        L_0x01f0:
            r11 = r14 & 16
            if (r11 == 0) goto L_0x01fd
            r11 = 0
            r12 = 1
            androidx.compose.foundation.ScrollState r13 = androidx.compose.foundation.ScrollKt.c(r11, r1, r11, r12)
            r5 = r5 & r18
            goto L_0x0200
        L_0x01fd:
            r11 = 0
            r13 = r41
        L_0x0200:
            if (r17 == 0) goto L_0x0205
            androidx.compose.ui.window.PopupProperties r12 = f9160a
            goto L_0x0207
        L_0x0205:
            r12 = r42
        L_0x0207:
            r16 = r14 & 64
            r11 = 6
            if (r16 == 0) goto L_0x0214
            androidx.compose.material3.MenuDefaults r8 = androidx.compose.material3.MenuDefaults.f10281a
            androidx.compose.ui.graphics.Shape r8 = r8.e(r1, r11)
            r5 = r5 & r7
            goto L_0x0216
        L_0x0214:
            r8 = r43
        L_0x0216:
            r7 = r14 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0225
            androidx.compose.material3.MenuDefaults r7 = androidx.compose.material3.MenuDefaults.f10281a
            long r21 = r7.a(r1, r11)
            r7 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r5 = r5 & r7
            goto L_0x0227
        L_0x0225:
            r21 = r44
        L_0x0227:
            if (r0 == 0) goto L_0x0230
            androidx.compose.material3.MenuDefaults r0 = androidx.compose.material3.MenuDefaults.f10281a
            float r0 = r0.f()
            goto L_0x0232
        L_0x0230:
            r0 = r46
        L_0x0232:
            if (r2 == 0) goto L_0x023b
            androidx.compose.material3.MenuDefaults r2 = androidx.compose.material3.MenuDefaults.f10281a
            float r2 = r2.d()
            goto L_0x023d
        L_0x023b:
            r2 = r47
        L_0x023d:
            if (r3 == 0) goto L_0x0245
            r11 = r5
            r7 = 0
        L_0x0241:
            r5 = r2
            r2 = r21
            goto L_0x0249
        L_0x0245:
            r7 = r48
            r11 = r5
            goto L_0x0241
        L_0x0249:
            r1.U()
            boolean r18 = androidx.compose.runtime.ComposerKt.P()
            if (r18 == 0) goto L_0x025a
            java.lang.String r14 = "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)"
            r15 = 1725609375(0x66dab59f, float:5.164131E23)
            androidx.compose.runtime.ComposerKt.Y(r15, r11, r4, r14)
        L_0x025a:
            java.lang.Object r4 = r1.g()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r15 = r14.a()
            if (r4 != r15) goto L_0x0270
            androidx.compose.animation.core.MutableTransitionState r4 = new androidx.compose.animation.core.MutableTransitionState
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r4.<init>(r15)
            r1.N(r4)
        L_0x0270:
            androidx.compose.animation.core.MutableTransitionState r4 = (androidx.compose.animation.core.MutableTransitionState) r4
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r36)
            r4.h(r15)
            java.lang.Object r15 = r4.a()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x02a1
            java.lang.Object r15 = r4.b()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x0292
            goto L_0x02a1
        L_0x0292:
            r4 = 1166965571(0x458e7b43, float:4559.4077)
            r1.X(r4)
            r1.M()
            r47 = r7
            r46 = r12
            goto L_0x035d
        L_0x02a1:
            r15 = 1165905588(0x457e4eb4, float:4068.919)
            r1.X(r15)
            java.lang.Object r15 = r1.g()
            r46 = r12
            java.lang.Object r12 = r14.a()
            if (r15 != r12) goto L_0x02c9
            androidx.compose.ui.graphics.TransformOrigin$Companion r12 = androidx.compose.ui.graphics.TransformOrigin.f16150b
            long r20 = r12.a()
            androidx.compose.ui.graphics.TransformOrigin r12 = androidx.compose.ui.graphics.TransformOrigin.b(r20)
            r47 = r7
            r7 = 0
            r15 = 2
            androidx.compose.runtime.MutableState r15 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r12, r7, r15, r7)
            r1.N(r15)
            goto L_0x02cb
        L_0x02c9:
            r47 = r7
        L_0x02cb:
            r7 = r15
            androidx.compose.runtime.MutableState r7 = (androidx.compose.runtime.MutableState) r7
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r12 = r1.C(r12)
            androidx.compose.ui.unit.Density r12 = (androidx.compose.ui.unit.Density) r12
            r15 = r11 & 7168(0x1c00, float:1.0045E-41)
            r16 = r11
            r11 = 2048(0x800, float:2.87E-42)
            if (r15 != r11) goto L_0x02e3
            r17 = 1
            goto L_0x02e5
        L_0x02e3:
            r17 = 0
        L_0x02e5:
            boolean r11 = r1.W(r12)
            r11 = r17 | r11
            java.lang.Object r15 = r1.g()
            if (r11 != 0) goto L_0x02f7
            java.lang.Object r11 = r14.a()
            if (r15 != r11) goto L_0x0317
        L_0x02f7:
            androidx.compose.material3.internal.DropdownMenuPositionProvider r15 = new androidx.compose.material3.internal.DropdownMenuPositionProvider
            androidx.compose.material3.h r11 = new androidx.compose.material3.h
            r11.<init>(r7)
            r14 = 4
            r17 = 0
            r18 = 0
            r38 = r15
            r39 = r9
            r41 = r12
            r42 = r18
            r43 = r11
            r44 = r14
            r45 = r17
            r38.<init>(r39, r41, r42, r43, r44, r45)
            r1.N(r15)
        L_0x0317:
            r11 = r15
            androidx.compose.material3.internal.DropdownMenuPositionProvider r11 = (androidx.compose.material3.internal.DropdownMenuPositionProvider) r11
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1 r12 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
            r22 = r12
            r23 = r6
            r24 = r4
            r25 = r7
            r26 = r13
            r27 = r8
            r28 = r2
            r30 = r0
            r31 = r5
            r32 = r47
            r33 = r49
            r22.<init>(r23, r24, r25, r26, r27, r28, r30, r31, r32, r33)
            r4 = 54
            r7 = -917492520(0xffffffffc9502cd8, float:-852685.5)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r14, r12, r1, r4)
            r7 = r16 & 112(0x70, float:1.57E-43)
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            int r12 = r16 >> 9
            r12 = r12 & 896(0x380, float:1.256E-42)
            r7 = r7 | r12
            r12 = 0
            r38 = r11
            r39 = r37
            r40 = r46
            r41 = r4
            r42 = r1
            r43 = r7
            r44 = r12
            androidx.compose.ui.window.AndroidPopup_androidKt.a(r38, r39, r40, r41, r42, r43, r44)
            r1.M()
        L_0x035d:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0366
            androidx.compose.runtime.ComposerKt.X()
        L_0x0366:
            r7 = r46
            r11 = r0
            r12 = r5
            r4 = r9
            r9 = r2
            r3 = r6
            r6 = r13
            r13 = r47
            goto L_0x0384
        L_0x0371:
            r1.B()
            r6 = r41
            r7 = r42
            r8 = r43
            r11 = r46
            r3 = r10
            r4 = r12
            r9 = r44
            r12 = r47
            r13 = r48
        L_0x0384:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.x()
            if (r15 == 0) goto L_0x03a7
            androidx.compose.material3.i r14 = new androidx.compose.material3.i
            r0 = r14
            r1 = r36
            r2 = r37
            r34 = r14
            r14 = r49
            r35 = r15
            r15 = r51
            r16 = r52
            r17 = r53
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17)
            r1 = r34
            r0 = r35
            r0.a(r1)
        L_0x03a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AndroidMenu_androidKt.d(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, long, androidx.compose.foundation.ScrollState, androidx.compose.ui.window.PopupProperties, androidx.compose.ui.graphics.Shape, long, float, float, androidx.compose.foundation.BorderStroke, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(kotlin.jvm.functions.Function2 r24, kotlin.jvm.functions.Function0 r25, androidx.compose.ui.Modifier r26, kotlin.jvm.functions.Function2 r27, kotlin.jvm.functions.Function2 r28, boolean r29, androidx.compose.material3.MenuItemColors r30, androidx.compose.foundation.layout.PaddingValues r31, androidx.compose.foundation.interaction.MutableInteractionSource r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r10 = r34
            r11 = r35
            r0 = -532959117(0xffffffffe03bb073, float:-5.4097744E19)
            r1 = r33
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r10 | 6
            r3 = r2
            r2 = r24
            goto L_0x002b
        L_0x0017:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r24
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r10
            goto L_0x002b
        L_0x0028:
            r2 = r24
            r3 = r10
        L_0x002b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r4 = r25
            goto L_0x0046
        L_0x0034:
            r4 = r10 & 48
            if (r4 != 0) goto L_0x0031
            r4 = r25
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0045
        L_0x0043:
            r5 = 16
        L_0x0045:
            r3 = r3 | r5
        L_0x0046:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r6 = r26
            goto L_0x0061
        L_0x004f:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r26
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r7
        L_0x0061:
            r7 = r11 & 8
            if (r7 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r8 = r27
            goto L_0x007c
        L_0x006a:
            r8 = r10 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r27
            boolean r9 = r1.l(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r9
        L_0x007c:
            r9 = r11 & 16
            if (r9 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r12 = r28
            goto L_0x0097
        L_0x0085:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r28
            boolean r13 = r1.l(r12)
            if (r13 == 0) goto L_0x0094
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r13
        L_0x0097:
            r13 = r11 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a1
            r3 = r3 | r14
        L_0x009e:
            r14 = r29
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r10
            if (r14 != 0) goto L_0x009e
            r14 = r29
            boolean r15 = r1.d(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r15
        L_0x00b2:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00cd
            r15 = r11 & 64
            if (r15 != 0) goto L_0x00c6
            r15 = r30
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r15 = r30
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r3 = r3 | r16
            goto L_0x00cf
        L_0x00cd:
            r15 = r30
        L_0x00cf:
            r0 = r11 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r3 = r3 | r17
            r2 = r31
            goto L_0x00ed
        L_0x00da:
            r17 = r10 & r17
            r2 = r31
            if (r17 != 0) goto L_0x00ed
            boolean r17 = r1.W(r2)
            if (r17 == 0) goto L_0x00e9
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r3 = r3 | r17
        L_0x00ed:
            r2 = r11 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00f8
            r3 = r3 | r17
            r4 = r32
            goto L_0x010b
        L_0x00f8:
            r17 = r10 & r17
            r4 = r32
            if (r17 != 0) goto L_0x010b
            boolean r17 = r1.W(r4)
            if (r17 == 0) goto L_0x0107
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0107:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r3 = r3 | r17
        L_0x010b:
            r17 = 38347923(0x2492493, float:1.4777644E-37)
            r4 = r3 & r17
            r6 = 38347922(0x2492492, float:1.4777643E-37)
            r17 = 1
            if (r4 == r6) goto L_0x011a
            r4 = r17
            goto L_0x011b
        L_0x011a:
            r4 = 0
        L_0x011b:
            r6 = r3 & 1
            boolean r4 = r1.E(r4, r6)
            if (r4 == 0) goto L_0x01bb
            r1.p()
            r4 = r10 & 1
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r4 == 0) goto L_0x0147
            boolean r4 = r1.J()
            if (r4 == 0) goto L_0x0134
            goto L_0x0147
        L_0x0134:
            r1.B()
            r0 = r11 & 64
            if (r0 == 0) goto L_0x013c
            r3 = r3 & r6
        L_0x013c:
            r4 = r26
            r5 = r32
            r6 = r3
            r0 = r12
            r2 = r14
            r7 = r15
            r3 = r31
            goto L_0x017c
        L_0x0147:
            if (r5 == 0) goto L_0x014c
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x014e
        L_0x014c:
            r4 = r26
        L_0x014e:
            r5 = 0
            if (r7 == 0) goto L_0x0152
            r8 = r5
        L_0x0152:
            if (r9 == 0) goto L_0x0155
            r12 = r5
        L_0x0155:
            if (r13 == 0) goto L_0x0159
            r14 = r17
        L_0x0159:
            r7 = r11 & 64
            if (r7 == 0) goto L_0x0166
            androidx.compose.material3.MenuDefaults r7 = androidx.compose.material3.MenuDefaults.f10281a
            r9 = 6
            androidx.compose.material3.MenuItemColors r7 = r7.g(r1, r9)
            r3 = r3 & r6
            goto L_0x0167
        L_0x0166:
            r7 = r15
        L_0x0167:
            if (r0 == 0) goto L_0x0170
            androidx.compose.material3.MenuDefaults r0 = androidx.compose.material3.MenuDefaults.f10281a
            androidx.compose.foundation.layout.PaddingValues r0 = r0.c()
            goto L_0x0172
        L_0x0170:
            r0 = r31
        L_0x0172:
            if (r2 == 0) goto L_0x0179
        L_0x0174:
            r6 = r3
            r2 = r14
            r3 = r0
            r0 = r12
            goto L_0x017c
        L_0x0179:
            r5 = r32
            goto L_0x0174
        L_0x017c:
            r1.U()
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x018e
            r9 = -1
            java.lang.String r12 = "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)"
            r13 = -532959117(0xffffffffe03bb073, float:-5.4097744E19)
            androidx.compose.runtime.ComposerKt.Y(r13, r6, r9, r12)
        L_0x018e:
            r9 = 268435454(0xffffffe, float:2.5243546E-29)
            r22 = r6 & r9
            r12 = r24
            r13 = r25
            r14 = r4
            r15 = r8
            r16 = r0
            r17 = r2
            r18 = r7
            r19 = r3
            r20 = r5
            r21 = r1
            androidx.compose.material3.MenuKt.i(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x01b1
            androidx.compose.runtime.ComposerKt.X()
        L_0x01b1:
            r6 = r2
            r9 = r5
            r5 = r0
            r23 = r8
            r8 = r3
            r3 = r4
            r4 = r23
            goto L_0x01c8
        L_0x01bb:
            r1.B()
            r3 = r26
            r9 = r32
            r4 = r8
            r5 = r12
            r6 = r14
            r7 = r15
            r8 = r31
        L_0x01c8:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x01df
            androidx.compose.material3.j r13 = new androidx.compose.material3.j
            r0 = r13
            r1 = r24
            r2 = r25
            r10 = r34
            r11 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AndroidMenu_androidKt.e(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.MenuItemColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit f(Function2 function2, Function0 function0, Modifier modifier, Function2 function22, Function2 function23, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        e(function2, function0, modifier, function22, function23, z2, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit g(MutableState mutableState, IntRect intRect, IntRect intRect2) {
        mutableState.setValue(TransformOrigin.b(MenuKt.l(intRect, intRect2)));
        return Unit.f40552a;
    }

    public static final Unit h(boolean z2, Function0 function0, Modifier modifier, long j2, ScrollState scrollState, PopupProperties popupProperties, Shape shape, long j3, float f2, float f3, BorderStroke borderStroke, Function3 function3, int i2, int i3, int i4, Composer composer, int i5) {
        d(z2, function0, modifier, j2, scrollState, popupProperties, shape, j3, f2, f3, borderStroke, function3, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }
}
