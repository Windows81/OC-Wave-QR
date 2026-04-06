package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class ExposedDropdownMenuBoxScope {

    /* renamed from: a  reason: collision with root package name */
    public static final int f9940a = 0;

    public /* synthetic */ ExposedDropdownMenuBoxScope(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final Unit e(MutableState mutableState) {
        Unit unit = Unit.f40552a;
        mutableState.setValue(unit);
        return unit;
    }

    public static final Unit f(MutableState mutableState, IntRect intRect, IntRect intRect2) {
        mutableState.setValue(TransformOrigin.b(MenuKt.l(intRect, intRect2)));
        return Unit.f40552a;
    }

    public static final Unit g(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z2, Function0 function0, Modifier modifier, ScrollState scrollState, boolean z3, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, Function3 function3, int i2, int i3, int i4, Composer composer, int i5) {
        exposedDropdownMenuBoxScope.d(z2, function0, modifier, scrollState, z3, shape, j2, f2, f3, borderStroke, function3, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }

    public static /* synthetic */ Modifier l(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, String str, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            return exposedDropdownMenuBoxScope.k(modifier, str, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: menuAnchor-2Hz36ac");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v28, resolved type: androidx.compose.material3.ExposedDropdownMenuPositionProvider} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v3, resolved type: androidx.compose.material3.ExposedDropdownMenuPositionProvider} */
    /* JADX WARNING: type inference failed for: r15v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0309, code lost:
        if (r15 == r8.a()) goto L_0x030b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(boolean r38, kotlin.jvm.functions.Function0 r39, androidx.compose.ui.Modifier r40, androidx.compose.foundation.ScrollState r41, boolean r42, androidx.compose.ui.graphics.Shape r43, long r44, float r46, float r47, androidx.compose.foundation.BorderStroke r48, kotlin.jvm.functions.Function3 r49, androidx.compose.runtime.Composer r50, int r51, int r52, int r53) {
        /*
            r37 = this;
            r2 = r38
            r14 = r51
            r15 = r53
            r0 = -126848451(0xfffffffff870723d, float:-1.9507317E34)
            r1 = r50
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r15 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r14 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r14 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r1.d(r2)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r14
            goto L_0x0026
        L_0x0025:
            r3 = r14
        L_0x0026:
            r6 = r15 & 2
            if (r6 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r6 = r39
            goto L_0x0041
        L_0x002f:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x002c
            r6 = r39
            boolean r9 = r1.l(r6)
            if (r9 == 0) goto L_0x003e
            r9 = 32
            goto L_0x0040
        L_0x003e:
            r9 = 16
        L_0x0040:
            r3 = r3 | r9
        L_0x0041:
            r9 = r15 & 4
            if (r9 == 0) goto L_0x004a
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r10 = r40
            goto L_0x005c
        L_0x004a:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0047
            r10 = r40
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x0059
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r11 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r11
        L_0x005c:
            r11 = r14 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0075
            r11 = r15 & 8
            if (r11 != 0) goto L_0x006f
            r11 = r41
            boolean r12 = r1.W(r11)
            if (r12 == 0) goto L_0x0071
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x006f:
            r11 = r41
        L_0x0071:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r12
            goto L_0x0077
        L_0x0075:
            r11 = r41
        L_0x0077:
            r12 = r15 & 16
            if (r12 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r13 = r42
            goto L_0x0093
        L_0x0080:
            r13 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007d
            r13 = r42
            boolean r16 = r1.d(r13)
            if (r16 == 0) goto L_0x008f
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r16
        L_0x0093:
            r16 = 196608(0x30000, float:2.75506E-40)
            r16 = r14 & r16
            if (r16 != 0) goto L_0x00ad
            r16 = r15 & 32
            r4 = r43
            if (r16 != 0) goto L_0x00a8
            boolean r16 = r1.W(r4)
            if (r16 == 0) goto L_0x00a8
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00a8:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00aa:
            r3 = r3 | r16
            goto L_0x00af
        L_0x00ad:
            r4 = r43
        L_0x00af:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r14 & r16
            if (r16 != 0) goto L_0x00c9
            r16 = r15 & 64
            r7 = r44
            if (r16 != 0) goto L_0x00c4
            boolean r17 = r1.j(r7)
            if (r17 == 0) goto L_0x00c4
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c6
        L_0x00c4:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00c6:
            r3 = r3 | r17
            goto L_0x00cb
        L_0x00c9:
            r7 = r44
        L_0x00cb:
            r5 = r15 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L_0x00d6
            r3 = r3 | r18
            r0 = r46
            goto L_0x00e9
        L_0x00d6:
            r18 = r14 & r18
            r0 = r46
            if (r18 != 0) goto L_0x00e9
            boolean r19 = r1.h(r0)
            if (r19 == 0) goto L_0x00e5
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e7
        L_0x00e5:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e7:
            r3 = r3 | r19
        L_0x00e9:
            r0 = r15 & 256(0x100, float:3.59E-43)
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f4
            r3 = r3 | r19
            r4 = r47
            goto L_0x0107
        L_0x00f4:
            r19 = r14 & r19
            r4 = r47
            if (r19 != 0) goto L_0x0107
            boolean r19 = r1.h(r4)
            if (r19 == 0) goto L_0x0103
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0105
        L_0x0103:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0105:
            r3 = r3 | r19
        L_0x0107:
            r4 = r15 & 512(0x200, float:7.175E-43)
            r19 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x0112
            r3 = r3 | r19
            r6 = r48
            goto L_0x0125
        L_0x0112:
            r19 = r14 & r19
            r6 = r48
            if (r19 != 0) goto L_0x0125
            boolean r19 = r1.W(r6)
            if (r19 == 0) goto L_0x0121
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0123
        L_0x0121:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0123:
            r3 = r3 | r19
        L_0x0125:
            r6 = r15 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0130
            r6 = r52 | 6
            r19 = r6
            r6 = r49
            goto L_0x0148
        L_0x0130:
            r6 = r52 & 6
            if (r6 != 0) goto L_0x0144
            r6 = r49
            boolean r19 = r1.l(r6)
            if (r19 == 0) goto L_0x013f
            r19 = 4
            goto L_0x0141
        L_0x013f:
            r19 = 2
        L_0x0141:
            r19 = r52 | r19
            goto L_0x0148
        L_0x0144:
            r6 = r49
            r19 = r52
        L_0x0148:
            r6 = r15 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0151
            r19 = r19 | 48
        L_0x014e:
            r6 = r19
            goto L_0x0168
        L_0x0151:
            r6 = r52 & 48
            if (r6 != 0) goto L_0x0165
            r6 = r37
            boolean r20 = r1.W(r6)
            if (r20 == 0) goto L_0x0160
            r16 = 32
            goto L_0x0162
        L_0x0160:
            r16 = 16
        L_0x0162:
            r19 = r19 | r16
            goto L_0x014e
        L_0x0165:
            r6 = r37
            goto L_0x014e
        L_0x0168:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r7 = r3 & r16
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            r10 = 1
            if (r7 != r8) goto L_0x017c
            r7 = r6 & 19
            r8 = 18
            if (r7 == r8) goto L_0x017a
            goto L_0x017c
        L_0x017a:
            r7 = 0
            goto L_0x017d
        L_0x017c:
            r7 = r10
        L_0x017d:
            r8 = r3 & 1
            boolean r7 = r1.E(r7, r8)
            if (r7 == 0) goto L_0x0397
            r1.p()
            r7 = r14 & 1
            r8 = 6
            if (r7 == 0) goto L_0x01bb
            boolean r7 = r1.J()
            if (r7 == 0) goto L_0x0194
            goto L_0x01bb
        L_0x0194:
            r1.B()
            r0 = r15 & 8
            if (r0 == 0) goto L_0x019d
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x019d:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x01a5
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r0
        L_0x01a5:
            r0 = r15 & 64
            if (r0 == 0) goto L_0x01ad
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x01ad:
            r7 = r40
            r9 = r43
            r5 = r46
            r0 = r47
            r12 = r48
            r10 = r3
            r3 = r44
            goto L_0x0214
        L_0x01bb:
            if (r9 == 0) goto L_0x01c0
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01c2
        L_0x01c0:
            r7 = r40
        L_0x01c2:
            r9 = r15 & 8
            if (r9 == 0) goto L_0x01cd
            r9 = 0
            androidx.compose.foundation.ScrollState r11 = androidx.compose.foundation.ScrollKt.c(r9, r1, r9, r10)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x01cd:
            if (r12 == 0) goto L_0x01d0
            r13 = r10
        L_0x01d0:
            r9 = r15 & 32
            if (r9 == 0) goto L_0x01df
            androidx.compose.material3.MenuDefaults r9 = androidx.compose.material3.MenuDefaults.f10281a
            androidx.compose.ui.graphics.Shape r9 = r9.e(r1, r8)
            r12 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r12
            goto L_0x01e1
        L_0x01df:
            r9 = r43
        L_0x01e1:
            r12 = r15 & 64
            if (r12 == 0) goto L_0x01f0
            androidx.compose.material3.MenuDefaults r12 = androidx.compose.material3.MenuDefaults.f10281a
            long r19 = r12.a(r1, r8)
            r12 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r12
            goto L_0x01f2
        L_0x01f0:
            r19 = r44
        L_0x01f2:
            if (r5 == 0) goto L_0x01fb
            androidx.compose.material3.MenuDefaults r5 = androidx.compose.material3.MenuDefaults.f10281a
            float r5 = r5.f()
            goto L_0x01fd
        L_0x01fb:
            r5 = r46
        L_0x01fd:
            if (r0 == 0) goto L_0x0206
            androidx.compose.material3.MenuDefaults r0 = androidx.compose.material3.MenuDefaults.f10281a
            float r0 = r0.d()
            goto L_0x0208
        L_0x0206:
            r0 = r47
        L_0x0208:
            if (r4 == 0) goto L_0x020f
            r10 = r3
            r3 = r19
            r12 = 0
            goto L_0x0214
        L_0x020f:
            r12 = r48
            r10 = r3
            r3 = r19
        L_0x0214:
            r1.U()
            boolean r19 = androidx.compose.runtime.ComposerKt.P()
            if (r19 == 0) goto L_0x0225
            java.lang.String r8 = "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)"
            r14 = -126848451(0xfffffffff870723d, float:-1.9507317E34)
            androidx.compose.runtime.ComposerKt.Y(r14, r10, r6, r8)
        L_0x0225:
            java.lang.Object r6 = r1.g()
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r8.a()
            if (r6 != r14) goto L_0x023e
            kotlin.Unit r6 = kotlin.Unit.f40552a
            androidx.compose.runtime.SnapshotMutationPolicy r14 = androidx.compose.runtime.SnapshotStateKt.k()
            androidx.compose.runtime.MutableState r6 = androidx.compose.runtime.SnapshotStateKt.i(r6, r14)
            r1.N(r6)
        L_0x023e:
            androidx.compose.runtime.MutableState r6 = (androidx.compose.runtime.MutableState) r6
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r14 = r1.C(r14)
            androidx.compose.ui.unit.Density r14 = (androidx.compose.ui.unit.Density) r14
            androidx.compose.foundation.layout.WindowInsets$Companion r15 = androidx.compose.foundation.layout.WindowInsets.f4206a
            r18 = r10
            r10 = 6
            androidx.compose.foundation.layout.WindowInsets r15 = androidx.compose.foundation.layout.WindowInsets_androidKt.d(r15, r1, r10)
            int r10 = r15.a(r14)
            if (r2 == 0) goto L_0x027b
            r15 = 629991660(0x258ce8ec, float:2.4443963E-16)
            r1.X(r15)
            java.lang.Object r15 = r1.g()
            java.lang.Object r2 = r8.a()
            if (r15 != r2) goto L_0x0271
            androidx.compose.material3.x2 r15 = new androidx.compose.material3.x2
            r15.<init>(r6)
            r1.N(r15)
        L_0x0271:
            kotlin.jvm.functions.Function0 r15 = (kotlin.jvm.functions.Function0) r15
            r2 = 6
            androidx.compose.material3.ExposedDropdownMenu_androidKt.d(r15, r1, r2)
            r1.M()
            goto L_0x0284
        L_0x027b:
            r2 = 630077189(0x258e3705, float:2.4670356E-16)
            r1.X(r2)
            r1.M()
        L_0x0284:
            java.lang.Object r2 = r1.g()
            java.lang.Object r15 = r8.a()
            if (r2 != r15) goto L_0x0298
            androidx.compose.animation.core.MutableTransitionState r2 = new androidx.compose.animation.core.MutableTransitionState
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r2.<init>(r15)
            r1.N(r2)
        L_0x0298:
            androidx.compose.animation.core.MutableTransitionState r2 = (androidx.compose.animation.core.MutableTransitionState) r2
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r38)
            r2.h(r15)
            java.lang.Object r15 = r2.a()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x02c9
            java.lang.Object r15 = r2.b()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x02ba
            goto L_0x02c9
        L_0x02ba:
            r2 = 631807237(0x25a89d05, float:2.9249755E-16)
            r1.X(r2)
            r1.M()
            r16 = r0
            r48 = r12
            goto L_0x0380
        L_0x02c9:
            r15 = 630396489(0x25931649, float:2.5515536E-16)
            r1.X(r15)
            java.lang.Object r15 = r1.g()
            r48 = r12
            java.lang.Object r12 = r8.a()
            if (r15 != r12) goto L_0x02f1
            androidx.compose.ui.graphics.TransformOrigin$Companion r12 = androidx.compose.ui.graphics.TransformOrigin.f16150b
            long r19 = r12.a()
            androidx.compose.ui.graphics.TransformOrigin r12 = androidx.compose.ui.graphics.TransformOrigin.b(r19)
            r16 = r0
            r0 = 0
            r15 = 2
            androidx.compose.runtime.MutableState r15 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r12, r0, r15, r0)
            r1.N(r15)
            goto L_0x02f3
        L_0x02f1:
            r16 = r0
        L_0x02f3:
            r0 = r15
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            boolean r12 = r1.W(r14)
            boolean r15 = r1.i(r10)
            r12 = r12 | r15
            java.lang.Object r15 = r1.g()
            if (r12 != 0) goto L_0x030b
            java.lang.Object r8 = r8.a()
            if (r15 != r8) goto L_0x032e
        L_0x030b:
            androidx.compose.material3.ExposedDropdownMenuPositionProvider r15 = new androidx.compose.material3.ExposedDropdownMenuPositionProvider
            androidx.compose.material3.y2 r8 = new androidx.compose.material3.y2
            r8.<init>(r0)
            r12 = 8
            r17 = 0
            r19 = 0
            r40 = r15
            r41 = r14
            r42 = r10
            r43 = r6
            r44 = r19
            r45 = r8
            r46 = r12
            r47 = r17
            r40.<init>(r41, r42, r43, r44, r45, r46, r47)
            r1.N(r15)
        L_0x032e:
            r6 = r15
            androidx.compose.material3.ExposedDropdownMenuPositionProvider r6 = (androidx.compose.material3.ExposedDropdownMenuPositionProvider) r6
            java.lang.String r8 = r37.j()
            boolean r10 = r37.i()
            r12 = 0
            androidx.compose.ui.window.PopupProperties r8 = androidx.compose.material3.ExposedDropdownMenu_androidKt.l(r8, r10, r1, r12)
            androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 r10 = new androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
            r19 = r10
            r20 = r37
            r21 = r7
            r22 = r13
            r23 = r2
            r24 = r0
            r25 = r11
            r26 = r9
            r27 = r3
            r29 = r5
            r30 = r16
            r31 = r48
            r32 = r49
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32)
            r0 = 54
            r2 = 2063119149(0x7af8b32d, float:6.4566187E35)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r2, r12, r10, r1, r0)
            r2 = r18 & 112(0x70, float:1.57E-43)
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r10 = 0
            r40 = r6
            r41 = r39
            r42 = r8
            r43 = r0
            r44 = r1
            r45 = r2
            r46 = r10
            androidx.compose.ui.window.AndroidPopup_androidKt.a(r40, r41, r42, r43, r44, r45, r46)
            r1.M()
        L_0x0380:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0389
            androidx.compose.runtime.ComposerKt.X()
        L_0x0389:
            r12 = r48
            r10 = r5
            r5 = r11
            r6 = r13
            r11 = r16
            r35 = r3
            r4 = r7
            r7 = r9
            r8 = r35
            goto L_0x03a8
        L_0x0397:
            r1.B()
            r4 = r40
            r7 = r43
            r8 = r44
            r10 = r46
            r12 = r48
            r5 = r11
            r6 = r13
            r11 = r47
        L_0x03a8:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.x()
            if (r15 == 0) goto L_0x03cd
            androidx.compose.material3.z2 r14 = new androidx.compose.material3.z2
            r0 = r14
            r1 = r37
            r2 = r38
            r3 = r39
            r13 = r49
            r33 = r14
            r14 = r51
            r34 = r15
            r15 = r52
            r16 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16)
            r1 = r33
            r0 = r34
            r0.a(r1)
        L_0x03cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.d(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, boolean, androidx.compose.ui.graphics.Shape, long, float, float, androidx.compose.foundation.BorderStroke, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public abstract Modifier h(Modifier modifier, boolean z2);

    public abstract boolean i();

    public abstract String j();

    public abstract Modifier k(Modifier modifier, String str, boolean z2);

    public ExposedDropdownMenuBoxScope() {
    }
}
