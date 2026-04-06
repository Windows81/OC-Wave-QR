package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.BasicTooltipDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class TooltipKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f11590a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f11591b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f11592c = Dp.m((float) 40);

    /* renamed from: d  reason: collision with root package name */
    public static final float f11593d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f11594e;

    /* renamed from: f  reason: collision with root package name */
    public static final PaddingValues f11595f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f11596g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f11597h = Dp.m((float) 28);

    /* renamed from: i  reason: collision with root package name */
    public static final float f11598i;

    /* renamed from: j  reason: collision with root package name */
    public static final float f11599j;

    /* renamed from: k  reason: collision with root package name */
    public static final float f11600k = Dp.m((float) 36);

    /* renamed from: l  reason: collision with root package name */
    public static final float f11601l;

    static {
        float f2 = (float) 4;
        f11590a = Dp.m(f2);
        float f3 = (float) 24;
        f11591b = Dp.m(f3);
        float m2 = Dp.m(f2);
        f11593d = m2;
        float f4 = (float) 8;
        float m3 = Dp.m(f4);
        f11594e = m3;
        f11595f = PaddingKt.b(m3, m2);
        float f5 = (float) 16;
        f11596g = Dp.m(f5);
        f11598i = Dp.m(f3);
        f11599j = Dp.m(f5);
        f11601l = Dp.m(f4);
    }

    public static final Modifier A(Modifier modifier, boolean z2, boolean z3) {
        return (z2 || z3) ? PaddingKt.m(AlignmentLineKt.h(modifier, f11598i, 0.0f, 2, (Object) null), 0.0f, 0.0f, 0.0f, f11599j, 7, (Object) null) : PaddingKt.k(modifier, 0.0f, f11593d, 1, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x023c, code lost:
        if (r2.l(r8) != false) goto L_0x0247;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(androidx.compose.material3.TooltipScope r33, androidx.compose.ui.Modifier r34, androidx.compose.ui.graphics.Shape r35, float r36, androidx.compose.ui.graphics.Shape r37, long r38, long r40, float r42, float r43, kotlin.jvm.functions.Function2 r44, androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            r1 = r33
            r12 = r44
            r13 = r46
            r14 = r47
            r0 = -343758958(0xffffffffeb82a792, float:-3.1590337E26)
            r2 = r45
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r14
            if (r3 == 0) goto L_0x0019
            r3 = r13 | 6
            goto L_0x0032
        L_0x0019:
            r3 = r13 & 6
            if (r3 != 0) goto L_0x0031
            r3 = r13 & 8
            if (r3 != 0) goto L_0x0026
            boolean r3 = r2.W(r1)
            goto L_0x002a
        L_0x0026:
            boolean r3 = r2.l(r1)
        L_0x002a:
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r13
            goto L_0x0032
        L_0x0031:
            r3 = r13
        L_0x0032:
            r6 = r14 & 1
            if (r6 == 0) goto L_0x003b
            r3 = r3 | 48
        L_0x0038:
            r7 = r34
            goto L_0x004d
        L_0x003b:
            r7 = r13 & 48
            if (r7 != 0) goto L_0x0038
            r7 = r34
            boolean r8 = r2.W(r7)
            if (r8 == 0) goto L_0x004a
            r8 = 32
            goto L_0x004c
        L_0x004a:
            r8 = 16
        L_0x004c:
            r3 = r3 | r8
        L_0x004d:
            r8 = r14 & 2
            if (r8 == 0) goto L_0x0056
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0053:
            r10 = r35
            goto L_0x0068
        L_0x0056:
            r10 = r13 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0053
            r10 = r35
            boolean r11 = r2.W(r10)
            if (r11 == 0) goto L_0x0065
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r3 = r3 | r11
        L_0x0068:
            r11 = r14 & 4
            if (r11 == 0) goto L_0x0071
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r15 = r36
            goto L_0x0084
        L_0x0071:
            r15 = r13 & 3072(0xc00, float:4.305E-42)
            if (r15 != 0) goto L_0x006e
            r15 = r36
            boolean r16 = r2.h(r15)
            if (r16 == 0) goto L_0x0080
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r3 = r3 | r16
        L_0x0084:
            r9 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x009e
            r9 = r14 & 8
            if (r9 != 0) goto L_0x0097
            r9 = r37
            boolean r17 = r2.W(r9)
            if (r17 == 0) goto L_0x0099
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0097:
            r9 = r37
        L_0x0099:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r3 = r3 | r17
            goto L_0x00a0
        L_0x009e:
            r9 = r37
        L_0x00a0:
            r17 = 196608(0x30000, float:2.75506E-40)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00ba
            r17 = r14 & 16
            r4 = r38
            if (r17 != 0) goto L_0x00b5
            boolean r19 = r2.j(r4)
            if (r19 == 0) goto L_0x00b5
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r3 = r3 | r19
            goto L_0x00bc
        L_0x00ba:
            r4 = r38
        L_0x00bc:
            r19 = 1572864(0x180000, float:2.204052E-39)
            r19 = r13 & r19
            if (r19 != 0) goto L_0x00d6
            r19 = r14 & 32
            r0 = r40
            if (r19 != 0) goto L_0x00d1
            boolean r20 = r2.j(r0)
            if (r20 == 0) goto L_0x00d1
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r3 = r3 | r20
            goto L_0x00d8
        L_0x00d6:
            r0 = r40
        L_0x00d8:
            r20 = r14 & 64
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            if (r20 == 0) goto L_0x00e3
            r3 = r3 | r21
            r0 = r42
            goto L_0x00f5
        L_0x00e3:
            r22 = r13 & r21
            r0 = r42
            if (r22 != 0) goto L_0x00f5
            boolean r1 = r2.h(r0)
            if (r1 == 0) goto L_0x00f2
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f2:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r3 = r3 | r1
        L_0x00f5:
            r1 = r14 & 128(0x80, float:1.794E-43)
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x0100
            r3 = r3 | r22
            r0 = r43
            goto L_0x0113
        L_0x0100:
            r22 = r13 & r22
            r0 = r43
            if (r22 != 0) goto L_0x0113
            boolean r22 = r2.h(r0)
            if (r22 == 0) goto L_0x010f
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0111
        L_0x010f:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0111:
            r3 = r3 | r22
        L_0x0113:
            r0 = r14 & 256(0x100, float:3.59E-43)
            r22 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x011c
            r3 = r3 | r22
            goto L_0x012c
        L_0x011c:
            r0 = r13 & r22
            if (r0 != 0) goto L_0x012c
            boolean r0 = r2.l(r12)
            if (r0 == 0) goto L_0x0129
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012b
        L_0x0129:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012b:
            r3 = r3 | r0
        L_0x012c:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r0 & r3
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 == r4) goto L_0x0137
            r0 = 1
            goto L_0x0138
        L_0x0137:
            r0 = 0
        L_0x0138:
            r4 = r3 & 1
            boolean r0 = r2.E(r0, r4)
            if (r0 == 0) goto L_0x0312
            r2.p()
            r0 = r13 & 1
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r23 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0177
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x0154
            goto L_0x0177
        L_0x0154:
            r2.B()
            r0 = r14 & 8
            if (r0 == 0) goto L_0x015d
            r3 = r3 & r23
        L_0x015d:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0162
            r3 = r3 & r4
        L_0x0162:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x016a
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x016a:
            r28 = r40
            r6 = r42
            r8 = r43
            r11 = r3
            r1 = r15
            r0 = 0
            r3 = r38
            goto L_0x01d4
        L_0x0177:
            if (r6 == 0) goto L_0x017c
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r7 = r0
        L_0x017c:
            if (r8 == 0) goto L_0x017f
            r10 = 0
        L_0x017f:
            if (r11 == 0) goto L_0x0188
            androidx.compose.material3.TooltipDefaults r0 = androidx.compose.material3.TooltipDefaults.f11582a
            float r0 = r0.d()
            r15 = r0
        L_0x0188:
            r0 = r14 & 8
            r6 = 6
            if (r0 == 0) goto L_0x0196
            androidx.compose.material3.TooltipDefaults r0 = androidx.compose.material3.TooltipDefaults.f11582a
            androidx.compose.ui.graphics.Shape r0 = r0.b(r2, r6)
            r3 = r3 & r23
            r9 = r0
        L_0x0196:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x01a2
            androidx.compose.material3.TooltipDefaults r0 = androidx.compose.material3.TooltipDefaults.f11582a
            long r25 = r0.c(r2, r6)
            r3 = r3 & r4
            goto L_0x01a4
        L_0x01a2:
            r25 = r38
        L_0x01a4:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x01b4
            androidx.compose.material3.TooltipDefaults r0 = androidx.compose.material3.TooltipDefaults.f11582a
            long r27 = r0.a(r2, r6)
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r0 = r0 & r3
            r3 = r0
            goto L_0x01b6
        L_0x01b4:
            r27 = r40
        L_0x01b6:
            r0 = 0
            if (r20 == 0) goto L_0x01bf
            float r4 = (float) r0
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            goto L_0x01c1
        L_0x01bf:
            r4 = r42
        L_0x01c1:
            if (r1 == 0) goto L_0x01d1
            float r1 = (float) r0
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r8 = r1
        L_0x01c9:
            r11 = r3
            r6 = r4
            r1 = r15
            r3 = r25
            r28 = r27
            goto L_0x01d4
        L_0x01d1:
            r8 = r43
            goto L_0x01c9
        L_0x01d4:
            r2.U()
            boolean r15 = androidx.compose.runtime.ComposerKt.P()
            if (r15 == 0) goto L_0x01e6
            r15 = -1
            java.lang.String r0 = "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)"
            r5 = -343758958(0xffffffffeb82a792, float:-3.1590337E26)
            androidx.compose.runtime.ComposerKt.Y(r5, r11, r15, r0)
        L_0x01e6:
            if (r10 == 0) goto L_0x02b9
            r0 = -1720477287(0xffffffff99739999, float:-1.2593824E-23)
            r2.X(r0)
            java.lang.Object r0 = r2.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r15 = r5.a()
            if (r0 != r15) goto L_0x020d
            r0 = 0
            r15 = 1
            float[] r19 = androidx.compose.ui.graphics.Matrix.c(r0, r15, r0)
            androidx.compose.ui.graphics.Matrix r15 = androidx.compose.ui.graphics.Matrix.a(r19)
            r13 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r15, r0, r13, r0)
            r2.N(r0)
            goto L_0x020f
        L_0x020d:
            r34 = r0
        L_0x020f:
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r13 = r2.C(r13)
            androidx.compose.ui.unit.Density r13 = (androidx.compose.ui.unit.Density) r13
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.ui.platform.CompositionLocalsKt.u()
            java.lang.Object r15 = r2.C(r15)
            androidx.compose.ui.platform.WindowInfo r15 = (androidx.compose.ui.platform.WindowInfo) r15
            long r19 = r15.a()
            androidx.compose.ui.Modifier$Companion r15 = androidx.compose.ui.Modifier.f15489d
            r14 = r11 & 14
            r41 = r8
            r8 = 4
            if (r14 == r8) goto L_0x0245
            r8 = r11 & 8
            if (r8 == 0) goto L_0x023f
            r8 = r33
            boolean r14 = r2.l(r8)
            if (r14 == 0) goto L_0x0241
            goto L_0x0247
        L_0x023f:
            r8 = r33
        L_0x0241:
            r42 = r6
            r14 = 0
            goto L_0x024a
        L_0x0245:
            r8 = r33
        L_0x0247:
            r42 = r6
            r14 = 1
        L_0x024a:
            java.lang.Object r6 = r2.g()
            if (r14 != 0) goto L_0x0256
            java.lang.Object r14 = r5.a()
            if (r6 != r14) goto L_0x025e
        L_0x0256:
            androidx.compose.material3.a8 r6 = new androidx.compose.material3.a8
            r6.<init>(r8)
            r2.N(r6)
        L_0x025e:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            androidx.compose.ui.window.PopupPositionProvider r14 = r33.a()
            r34 = r15
            r35 = r0
            r36 = r13
            r37 = r19
            r39 = r6
            r40 = r14
            androidx.compose.ui.Modifier r6 = w(r34, r35, r36, r37, r39, r40)
            androidx.compose.ui.Modifier r6 = r6.o0(r7)
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r11
            r13 = r13 ^ 24576(0x6000, float:3.4438E-41)
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r13 <= r14) goto L_0x0288
            boolean r13 = r2.W(r9)
            if (r13 != 0) goto L_0x028c
        L_0x0288:
            r13 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r13 != r14) goto L_0x028e
        L_0x028c:
            r15 = 1
            goto L_0x028f
        L_0x028e:
            r15 = 0
        L_0x028f:
            r13 = r11 & 896(0x380, float:1.256E-42)
            r14 = 256(0x100, float:3.59E-43)
            if (r13 != r14) goto L_0x0298
            r22 = 1
            goto L_0x029a
        L_0x0298:
            r22 = 0
        L_0x029a:
            r13 = r15 | r22
            java.lang.Object r14 = r2.g()
            if (r13 != 0) goto L_0x02a8
            java.lang.Object r5 = r5.a()
            if (r14 != r5) goto L_0x02b0
        L_0x02a8:
            androidx.compose.material3.TooltipCaretShape r14 = new androidx.compose.material3.TooltipCaretShape
            r14.<init>(r0, r9, r10)
            r2.N(r14)
        L_0x02b0:
            androidx.compose.material3.TooltipCaretShape r14 = (androidx.compose.material3.TooltipCaretShape) r14
            r2.M()
            r15 = r6
            r16 = r14
            goto L_0x02cb
        L_0x02b9:
            r42 = r6
            r41 = r8
            r8 = r33
            r0 = -1719831991(0xffffffff997d7249, float:-1.3102873E-23)
            r2.X(r0)
            r2.M()
            r15 = r7
            r16 = r9
        L_0x02cb:
            androidx.compose.material3.TooltipKt$PlainTooltip$4 r0 = new androidx.compose.material3.TooltipKt$PlainTooltip$4
            r0.<init>(r1, r3, r12)
            r5 = 54
            r6 = -1573998995(0xffffffffa22eae6d, float:-2.3673737E-18)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r24 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r13, r0, r2, r5)
            int r0 = r11 >> 12
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r21
            int r5 = r11 >> 9
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r5
            r0 = r0 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r6
            r26 = r0 | r5
            r27 = 72
            r19 = 0
            r23 = 0
            r17 = r28
            r21 = r42
            r22 = r41
            r25 = r2
            androidx.compose.material3.SurfaceKt.c(r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0306
            androidx.compose.runtime.ComposerKt.X()
        L_0x0306:
            r13 = r41
            r11 = r42
            r5 = r9
            r31 = r3
            r4 = r1
            r3 = r10
            r9 = r31
            goto L_0x0322
        L_0x0312:
            r8 = r33
            r2.B()
            r28 = r40
            r11 = r42
            r13 = r43
            r5 = r9
            r3 = r10
            r4 = r15
            r9 = r38
        L_0x0322:
            androidx.compose.runtime.ScopeUpdateScope r15 = r2.x()
            if (r15 == 0) goto L_0x0343
            androidx.compose.material3.b8 r14 = new androidx.compose.material3.b8
            r0 = r14
            r1 = r33
            r2 = r7
            r6 = r9
            r8 = r28
            r10 = r11
            r11 = r13
            r12 = r44
            r13 = r46
            r30 = r14
            r14 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14)
            r0 = r30
            r15.a(r0)
        L_0x0343:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.g(androidx.compose.material3.TooltipScope, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, float, androidx.compose.ui.graphics.Shape, long, long, float, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit h(TooltipScope tooltipScope, Modifier modifier, Shape shape, float f2, Shape shape2, long j2, long j3, float f3, float f4, Function2 function2, int i2, int i3, Composer composer, int i4) {
        g(tooltipScope, modifier, shape, f2, shape2, j2, j3, f3, f4, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final LayoutCoordinates i(TooltipScope tooltipScope, MeasureScope measureScope) {
        return tooltipScope.b(measureScope);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(androidx.compose.ui.window.PopupPositionProvider r24, kotlin.jvm.functions.Function3 r25, androidx.compose.material3.TooltipState r26, androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function0 r28, boolean r29, boolean r30, boolean r31, kotlin.jvm.functions.Function2 r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r12 = r24
            r13 = r25
            r14 = r26
            r15 = r32
            r11 = r34
            r10 = r35
            r0 = -293753984(0xffffffffee7dab80, float:-1.962676E28)
            r1 = r33
            androidx.compose.runtime.Composer r9 = r1.q(r0)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x001c
            r1 = r11 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x002b
            boolean r1 = r9.W(r12)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = 2
        L_0x0029:
            r1 = r1 | r11
            goto L_0x002c
        L_0x002b:
            r1 = r11
        L_0x002c:
            r3 = r10 & 2
            if (r3 == 0) goto L_0x0033
            r1 = r1 | 48
            goto L_0x0043
        L_0x0033:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x0043
            boolean r3 = r9.l(r13)
            if (r3 == 0) goto L_0x0040
            r3 = 32
            goto L_0x0042
        L_0x0040:
            r3 = 16
        L_0x0042:
            r1 = r1 | r3
        L_0x0043:
            r3 = r10 & 4
            if (r3 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x004a:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0063
            r3 = r11 & 512(0x200, float:7.175E-43)
            if (r3 != 0) goto L_0x0057
            boolean r3 = r9.W(r14)
            goto L_0x005b
        L_0x0057:
            boolean r3 = r9.l(r14)
        L_0x005b:
            if (r3 == 0) goto L_0x0060
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r3
        L_0x0063:
            r3 = r10 & 8
            if (r3 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r4 = r27
            goto L_0x007e
        L_0x006c:
            r4 = r11 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0069
            r4 = r27
            boolean r5 = r9.W(r4)
            if (r5 == 0) goto L_0x007b
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r5
        L_0x007e:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0087
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r6 = r28
            goto L_0x0099
        L_0x0087:
            r6 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0084
            r6 = r28
            boolean r7 = r9.l(r6)
            if (r7 == 0) goto L_0x0096
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r1 = r1 | r7
        L_0x0099:
            r7 = r10 & 32
            r8 = 196608(0x30000, float:2.75506E-40)
            if (r7 == 0) goto L_0x00a3
            r1 = r1 | r8
        L_0x00a0:
            r8 = r29
            goto L_0x00b5
        L_0x00a3:
            r8 = r8 & r11
            if (r8 != 0) goto L_0x00a0
            r8 = r29
            boolean r16 = r9.d(r8)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r1 = r1 | r16
        L_0x00b5:
            r16 = r10 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00c0
            r1 = r1 | r17
            r2 = r30
            goto L_0x00d3
        L_0x00c0:
            r17 = r11 & r17
            r2 = r30
            if (r17 != 0) goto L_0x00d3
            boolean r17 = r9.d(r2)
            if (r17 == 0) goto L_0x00cf
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r1 = r1 | r17
        L_0x00d3:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00de
            r1 = r1 | r18
            r2 = r31
            goto L_0x00f1
        L_0x00de:
            r18 = r11 & r18
            r2 = r31
            if (r18 != 0) goto L_0x00f1
            boolean r18 = r9.d(r2)
            if (r18 == 0) goto L_0x00ed
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ef
        L_0x00ed:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ef:
            r1 = r1 | r18
        L_0x00f1:
            r2 = r10 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00fa
            r1 = r1 | r18
            goto L_0x010a
        L_0x00fa:
            r2 = r11 & r18
            if (r2 != 0) goto L_0x010a
            boolean r2 = r9.l(r15)
            if (r2 == 0) goto L_0x0107
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0107:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r1 = r1 | r2
        L_0x010a:
            r2 = 38347923(0x2492493, float:1.4777644E-37)
            r2 = r2 & r1
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            r6 = 1
            if (r2 == r4) goto L_0x0116
            r2 = r6
            goto L_0x0117
        L_0x0116:
            r2 = 0
        L_0x0117:
            r4 = r1 & 1
            boolean r2 = r9.E(r2, r4)
            if (r2 == 0) goto L_0x01f8
            if (r3 == 0) goto L_0x0126
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r19 = r2
            goto L_0x0128
        L_0x0126:
            r19 = r27
        L_0x0128:
            r2 = 0
            if (r5 == 0) goto L_0x012e
            r20 = r2
            goto L_0x0130
        L_0x012e:
            r20 = r28
        L_0x0130:
            if (r7 == 0) goto L_0x0135
            r21 = 0
            goto L_0x0137
        L_0x0135:
            r21 = r8
        L_0x0137:
            if (r16 == 0) goto L_0x013c
            r16 = r6
            goto L_0x013e
        L_0x013c:
            r16 = r30
        L_0x013e:
            if (r0 == 0) goto L_0x0143
            r22 = 0
            goto L_0x0145
        L_0x0143:
            r22 = r31
        L_0x0145:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0154
            r0 = -1
            java.lang.String r3 = "androidx.compose.material3.TooltipBox (Tooltip.kt:309)"
            r4 = -293753984(0xffffffffee7dab80, float:-1.962676E28)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r0, r3)
        L_0x0154:
            androidx.compose.animation.core.MutableTransitionState r0 = r26.c()
            int r3 = androidx.compose.animation.core.MutableTransitionState.f2620d
            r3 = r3 | 48
            java.lang.String r4 = "tooltip transition"
            r5 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.i(r0, r4, r9, r3, r5)
            java.lang.Object r3 = r9.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r4.a()
            if (r3 != r5) goto L_0x0177
            r5 = 2
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r2, r2, r5, r2)
            r9.N(r3)
        L_0x0177:
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            java.lang.Object r2 = r9.g()
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x0190
            androidx.compose.material3.TooltipScopeImpl r2 = new androidx.compose.material3.TooltipScopeImpl
            androidx.compose.material3.d8 r4 = new androidx.compose.material3.d8
            r4.<init>(r3)
            r2.<init>(r4, r12)
            r9.N(r2)
        L_0x0190:
            androidx.compose.material3.TooltipScopeImpl r2 = (androidx.compose.material3.TooltipScopeImpl) r2
            androidx.compose.material3.TooltipKt$TooltipBox$wrappedContent$1 r4 = new androidx.compose.material3.TooltipKt$TooltipBox$wrappedContent$1
            r4.<init>(r3, r15)
            r3 = -23901870(0xfffffffffe934952, float:-9.788861E37)
            r5 = 54
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r6, r4, r9, r5)
            androidx.compose.material3.TooltipKt$TooltipBox$3 r3 = new androidx.compose.material3.TooltipKt$TooltipBox$3
            r3.<init>(r0, r13, r2)
            r0 = -527401546(0xffffffffe0907db6, float:-8.329342E19)
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r6, r3, r9, r5)
            r0 = r1 & 14
            r3 = 100663344(0x6000030, float:2.4074262E-35)
            r0 = r0 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r3
            r17 = r0 | r1
            r18 = 0
            r0 = r24
            r1 = r2
            r2 = r26
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r16
            r7 = r22
            r23 = r9
            r10 = r17
            r11 = r18
            androidx.compose.material3.internal.BasicTooltipKt.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01ed
            androidx.compose.runtime.ComposerKt.X()
        L_0x01ed:
            r7 = r16
            r4 = r19
            r5 = r20
            r6 = r21
            r8 = r22
            goto L_0x0206
        L_0x01f8:
            r23 = r9
            r23.B()
            r4 = r27
            r5 = r28
            r7 = r30
            r6 = r8
            r8 = r31
        L_0x0206:
            androidx.compose.runtime.ScopeUpdateScope r11 = r23.x()
            if (r11 == 0) goto L_0x0223
            androidx.compose.material3.e8 r10 = new androidx.compose.material3.e8
            r0 = r10
            r1 = r24
            r2 = r25
            r3 = r26
            r9 = r32
            r12 = r10
            r10 = r34
            r13 = r11
            r11 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.a(r12)
        L_0x0223:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.j(androidx.compose.ui.window.PopupPositionProvider, kotlin.jvm.functions.Function3, androidx.compose.material3.TooltipState, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, boolean, boolean, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final LayoutCoordinates k(MutableState mutableState) {
        return (LayoutCoordinates) mutableState.getValue();
    }

    public static final Unit l(PopupPositionProvider popupPositionProvider, Function3 function3, TooltipState tooltipState, Modifier modifier, Function0 function0, boolean z2, boolean z3, boolean z4, Function2 function2, int i2, int i3, Composer composer, int i4) {
        j(popupPositionProvider, function3, tooltipState, modifier, function0, z2, z3, z4, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Modifier m(Modifier modifier, Transition transition) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1(transition) : InspectableValueKt.a(), new TooltipKt$animateTooltip$2(transition));
    }

    public static final float n(float f2, int i2, Rect rect) {
        float min;
        float o2 = rect.o();
        float p2 = rect.p();
        float f3 = (float) 2;
        float f4 = (o2 + p2) / f3;
        float f5 = (float) i2;
        if (f2 >= f5) {
            return f4;
        }
        float f6 = f2 / f3;
        if (f4 - f6 < 0.0f) {
            min = Math.max(f2 - f5, -o2);
        } else if (f4 + f6 <= f5) {
            return f6;
        } else {
            min = Math.min(f2 - p2, 0.0f);
        }
        return f4 + min;
    }

    public static final float o() {
        return f11601l;
    }

    public static final float p() {
        return f11600k;
    }

    public static final float q() {
        return f11597h;
    }

    public static final PaddingValues r() {
        return f11595f;
    }

    public static final float s() {
        return f11596g;
    }

    public static final float t() {
        return f11590a;
    }

    public static final float u() {
        return f11591b;
    }

    public static final float v() {
        return f11592c;
    }

    public static final Modifier w(Modifier modifier, MutableState mutableState, Density density, long j2, Function1 function1, PopupPositionProvider popupPositionProvider) {
        return LayoutModifierKt.a(modifier, new C0071c8(j2, function1, density, popupPositionProvider, mutableState));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bc, code lost:
        if (((r14 - r10) - ((float) r13)) < 0.0f) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0214  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.layout.MeasureResult x(long r26, kotlin.jvm.functions.Function1 r28, androidx.compose.ui.unit.Density r29, androidx.compose.ui.window.PopupPositionProvider r30, androidx.compose.runtime.MutableState r31, androidx.compose.ui.layout.MeasureScope r32, androidx.compose.ui.layout.Measurable r33, androidx.compose.ui.unit.Constraints r34) {
        /*
            r0 = r30
            long r1 = r34.r()
            r3 = r33
            androidx.compose.ui.layout.Placeable r1 = r3.c0(r1)
            int r2 = r1.L0()
            int r3 = r1.C0()
            r4 = 32
            long r5 = r26 >> r4
            int r5 = (int) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r26 & r6
            int r8 = (int) r8
            float r9 = (float) r2
            float r10 = (float) r3
            r11 = r28
            r12 = r32
            java.lang.Object r11 = r11.invoke(r12)
            androidx.compose.ui.layout.LayoutCoordinates r11 = (androidx.compose.ui.layout.LayoutCoordinates) r11
            if (r11 == 0) goto L_0x02e2
            float r13 = f11590a
            r14 = r29
            int r13 = r14.P1(r13)
            androidx.compose.ui.geometry.Rect r11 = androidx.compose.ui.layout.LayoutCoordinatesKt.c(r11)
            float r14 = r11.r()
            float r15 = r11.i()
            float r16 = r11.p()
            float r17 = r11.o()
            boolean r6 = r0 instanceof androidx.compose.material3.TooltipPositionProviderImpl
            if (r6 == 0) goto L_0x00b6
            r18 = r0
            androidx.compose.material3.TooltipPositionProviderImpl r18 = (androidx.compose.material3.TooltipPositionProviderImpl) r18
            int r4 = r18.e()
            androidx.compose.material3.TooltipAnchorPosition$Companion r18 = androidx.compose.material3.TooltipAnchorPosition.f11568b
            int r7 = r18.d()
            boolean r7 = androidx.compose.material3.TooltipAnchorPosition.i(r4, r7)
            if (r7 != 0) goto L_0x00b2
            int r7 = r18.e()
            boolean r7 = androidx.compose.material3.TooltipAnchorPosition.i(r4, r7)
            if (r7 != 0) goto L_0x00b2
            int r7 = r18.f()
            boolean r7 = androidx.compose.material3.TooltipAnchorPosition.i(r4, r7)
            if (r7 != 0) goto L_0x00b2
            int r7 = r18.c()
            boolean r7 = androidx.compose.material3.TooltipAnchorPosition.i(r4, r7)
            if (r7 == 0) goto L_0x0082
            goto L_0x00b2
        L_0x0082:
            int r7 = r18.a()
            boolean r7 = androidx.compose.material3.TooltipAnchorPosition.i(r4, r7)
            if (r7 == 0) goto L_0x0096
            float r14 = r14 - r10
            float r4 = (float) r13
            float r14 = r14 - r4
            r4 = 0
            int r7 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x00bf
        L_0x0094:
            r10 = 0
            goto L_0x00bf
        L_0x0096:
            int r7 = r18.b()
            boolean r4 = androidx.compose.material3.TooltipAnchorPosition.i(r4, r7)
            if (r4 == 0) goto L_0x00a9
            float r15 = r15 + r10
            float r4 = (float) r13
            float r15 = r15 + r4
            float r4 = (float) r8
            int r4 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0094
            goto L_0x00bf
        L_0x00a9:
            float r14 = r14 - r10
            float r4 = (float) r13
            float r14 = r14 - r4
            r4 = 0
            int r7 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x00bf
            goto L_0x0094
        L_0x00b2:
            r4 = 2
            float r4 = (float) r4
            float r10 = r10 / r4
            goto L_0x00bf
        L_0x00b6:
            float r14 = r14 - r10
            float r4 = (float) r13
            float r14 = r14 - r4
            r4 = 0
            int r7 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x00bf
            goto L_0x0094
        L_0x00bf:
            if (r6 == 0) goto L_0x01d4
            r4 = r0
            androidx.compose.material3.TooltipPositionProviderImpl r4 = (androidx.compose.material3.TooltipPositionProviderImpl) r4
            int r4 = r4.e()
            androidx.compose.material3.TooltipAnchorPosition$Companion r7 = androidx.compose.material3.TooltipAnchorPosition.f11568b
            int r8 = r7.d()
            boolean r8 = androidx.compose.material3.TooltipAnchorPosition.i(r4, r8)
            if (r8 == 0) goto L_0x0102
            float r4 = (float) r13
            float r4 = r17 - r4
            float r4 = r4 - r9
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x00df
            r4 = 0
            goto L_0x00e0
        L_0x00df:
            r4 = r9
        L_0x00e0:
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r10)
            long r14 = (long) r4
            r4 = 32
            long r7 = r7 << r4
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r20
            long r7 = r7 | r14
            long r7 = androidx.compose.ui.geometry.Offset.e(r7)
        L_0x00f9:
            r4 = 32
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L_0x01f1
        L_0x0102:
            int r8 = r7.e()
            boolean r8 = androidx.compose.material3.TooltipAnchorPosition.i(r4, r8)
            if (r8 == 0) goto L_0x0132
            float r4 = (float) r13
            float r4 = r16 + r4
            float r4 = r4 + r9
            float r7 = (float) r5
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0117
            r4 = r9
            goto L_0x0118
        L_0x0117:
            r4 = 0
        L_0x0118:
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r10)
            long r14 = (long) r4
            r4 = 32
            long r7 = r7 << r4
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r20
            long r7 = r7 | r14
            long r7 = androidx.compose.ui.geometry.Offset.e(r7)
            goto L_0x00f9
        L_0x0132:
            int r8 = r7.f()
            boolean r8 = androidx.compose.material3.TooltipAnchorPosition.i(r4, r8)
            if (r8 == 0) goto L_0x0173
            androidx.compose.ui.unit.LayoutDirection r4 = r32.getLayoutDirection()
            androidx.compose.ui.unit.LayoutDirection r7 = androidx.compose.ui.unit.LayoutDirection.Ltr
            if (r4 != r7) goto L_0x014f
            float r4 = (float) r13
            float r4 = r17 - r4
            float r4 = r4 - r9
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0158
        L_0x014d:
            r4 = 0
            goto L_0x0159
        L_0x014f:
            float r4 = (float) r13
            float r4 = r16 + r4
            float r4 = r4 + r9
            float r7 = (float) r5
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x014d
        L_0x0158:
            r4 = r9
        L_0x0159:
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r10)
            long r14 = (long) r4
            r4 = 32
            long r7 = r7 << r4
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r20
            long r7 = r7 | r14
            long r7 = androidx.compose.ui.geometry.Offset.e(r7)
            goto L_0x00f9
        L_0x0173:
            int r7 = r7.c()
            boolean r4 = androidx.compose.material3.TooltipAnchorPosition.i(r4, r7)
            if (r4 == 0) goto L_0x01b6
            androidx.compose.ui.unit.LayoutDirection r4 = r32.getLayoutDirection()
            androidx.compose.ui.unit.LayoutDirection r7 = androidx.compose.ui.unit.LayoutDirection.Ltr
            if (r4 != r7) goto L_0x0191
            float r4 = (float) r13
            float r4 = r16 + r4
            float r4 = r4 + r9
            float r7 = (float) r5
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x018f
            goto L_0x019b
        L_0x018f:
            r4 = 0
            goto L_0x019c
        L_0x0191:
            float r4 = (float) r13
            float r4 = r17 - r4
            float r4 = r4 - r9
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x019b
            goto L_0x018f
        L_0x019b:
            r4 = r9
        L_0x019c:
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r10)
            long r14 = (long) r4
            r4 = 32
            long r7 = r7 << r4
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r18
            long r7 = r7 | r14
            long r7 = androidx.compose.ui.geometry.Offset.e(r7)
            goto L_0x01f1
        L_0x01b6:
            r4 = 32
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            float r7 = n(r9, r5, r11)
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r7
            int r11 = java.lang.Float.floatToRawIntBits(r10)
            long r14 = (long) r11
            long r7 = r7 << r4
            long r14 = r14 & r18
            long r7 = r7 | r14
            long r7 = androidx.compose.ui.geometry.Offset.e(r7)
            goto L_0x01f1
        L_0x01d4:
            r4 = 32
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            float r7 = n(r9, r5, r11)
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r7
            int r11 = java.lang.Float.floatToRawIntBits(r10)
            long r14 = (long) r11
            long r7 = r7 << r4
            long r14 = r14 & r18
            long r7 = r7 | r14
            long r7 = androidx.compose.ui.geometry.Offset.e(r7)
        L_0x01f1:
            r11 = 1
            r14 = 0
            float[] r11 = androidx.compose.ui.graphics.Matrix.c(r14, r11, r14)
            long r14 = r7 >> r4
            int r4 = (int) r14
            float r21 = java.lang.Float.intBitsToFloat(r4)
            long r7 = r7 & r18
            int r4 = (int) r7
            float r22 = java.lang.Float.intBitsToFloat(r4)
            r24 = 4
            r25 = 0
            r23 = 0
            r20 = r11
            androidx.compose.ui.graphics.Matrix.p(r20, r21, r22, r23, r24, r25)
            r4 = 1127481344(0x43340000, float:180.0)
            if (r6 == 0) goto L_0x02d1
            androidx.compose.material3.TooltipPositionProviderImpl r0 = (androidx.compose.material3.TooltipPositionProviderImpl) r0
            int r0 = r0.e()
            androidx.compose.material3.TooltipAnchorPosition$Companion r6 = androidx.compose.material3.TooltipAnchorPosition.f11568b
            int r7 = r6.d()
            boolean r7 = androidx.compose.material3.TooltipAnchorPosition.i(r0, r7)
            r8 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r14 = 1119092736(0x42b40000, float:90.0)
            if (r7 == 0) goto L_0x023e
            float r0 = (float) r13
            float r17 = r17 - r0
            float r17 = r17 - r9
            r0 = 0
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0239
            androidx.compose.ui.graphics.Matrix.k(r11, r14)
            goto L_0x02d9
        L_0x0239:
            androidx.compose.ui.graphics.Matrix.k(r11, r8)
            goto L_0x02d9
        L_0x023e:
            int r7 = r6.e()
            boolean r7 = androidx.compose.material3.TooltipAnchorPosition.i(r0, r7)
            if (r7 == 0) goto L_0x025c
            float r0 = (float) r13
            float r16 = r16 + r0
            float r16 = r16 + r9
            float r0 = (float) r5
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0257
            androidx.compose.ui.graphics.Matrix.k(r11, r8)
            goto L_0x02d9
        L_0x0257:
            androidx.compose.ui.graphics.Matrix.k(r11, r14)
            goto L_0x02d9
        L_0x025c:
            int r7 = r6.f()
            boolean r7 = androidx.compose.material3.TooltipAnchorPosition.i(r0, r7)
            if (r7 == 0) goto L_0x0292
            androidx.compose.ui.unit.LayoutDirection r0 = r32.getLayoutDirection()
            androidx.compose.ui.unit.LayoutDirection r4 = androidx.compose.ui.unit.LayoutDirection.Ltr
            if (r0 != r4) goto L_0x0280
            float r0 = (float) r13
            float r17 = r17 - r0
            float r17 = r17 - r9
            r0 = 0
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x027c
            androidx.compose.ui.graphics.Matrix.k(r11, r14)
            goto L_0x02d9
        L_0x027c:
            androidx.compose.ui.graphics.Matrix.k(r11, r8)
            goto L_0x02d9
        L_0x0280:
            float r0 = (float) r13
            float r16 = r16 + r0
            float r16 = r16 + r9
            float r0 = (float) r5
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x028e
            androidx.compose.ui.graphics.Matrix.k(r11, r8)
            goto L_0x02d9
        L_0x028e:
            androidx.compose.ui.graphics.Matrix.k(r11, r14)
            goto L_0x02d9
        L_0x0292:
            int r6 = r6.c()
            boolean r0 = androidx.compose.material3.TooltipAnchorPosition.i(r0, r6)
            if (r0 == 0) goto L_0x02c8
            androidx.compose.ui.unit.LayoutDirection r0 = r32.getLayoutDirection()
            androidx.compose.ui.unit.LayoutDirection r4 = androidx.compose.ui.unit.LayoutDirection.Ltr
            if (r0 != r4) goto L_0x02b6
            float r0 = (float) r13
            float r16 = r16 + r0
            float r16 = r16 + r9
            float r0 = (float) r5
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b2
            androidx.compose.ui.graphics.Matrix.k(r11, r8)
            goto L_0x02d9
        L_0x02b2:
            androidx.compose.ui.graphics.Matrix.k(r11, r14)
            goto L_0x02d9
        L_0x02b6:
            float r0 = (float) r13
            float r17 = r17 - r0
            float r17 = r17 - r9
            r0 = 0
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02c4
            androidx.compose.ui.graphics.Matrix.k(r11, r14)
            goto L_0x02d9
        L_0x02c4:
            androidx.compose.ui.graphics.Matrix.k(r11, r8)
            goto L_0x02d9
        L_0x02c8:
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x02d9
            androidx.compose.ui.graphics.Matrix.j(r11, r4)
            goto L_0x02d9
        L_0x02d1:
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x02d9
            androidx.compose.ui.graphics.Matrix.j(r11, r4)
        L_0x02d9:
            androidx.compose.ui.graphics.Matrix r0 = androidx.compose.ui.graphics.Matrix.a(r11)
            r4 = r31
            r4.setValue(r0)
        L_0x02e2:
            androidx.compose.material3.f8 r0 = new androidx.compose.material3.f8
            r0.<init>(r1)
            r1 = 4
            r4 = 0
            r5 = 0
            r26 = r32
            r27 = r2
            r28 = r3
            r29 = r5
            r30 = r0
            r31 = r1
            r32 = r4
            androidx.compose.ui.layout.MeasureResult r0 = androidx.compose.ui.layout.MeasureScope.R1(r26, r27, r28, r29, r30, r31, r32)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.x(long, kotlin.jvm.functions.Function1, androidx.compose.ui.unit.Density, androidx.compose.ui.window.PopupPositionProvider, androidx.compose.runtime.MutableState, androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.Constraints):androidx.compose.ui.layout.MeasureResult");
    }

    public static final Unit y(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public static final TooltipState z(boolean z2, boolean z3, MutatorMutex mutatorMutex, Composer composer, int i2, int i3) {
        boolean z4 = false;
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        if ((i3 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.f12164a.a();
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(-1413230530, i2, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:962)");
        }
        boolean z5 = (((i2 & 112) ^ 48) > 32 && composer.d(z3)) || (i2 & 48) == 32;
        if ((((i2 & 896) ^ 384) > 256 && composer.W(mutatorMutex)) || (i2 & 384) == 256) {
            z4 = true;
        }
        boolean z6 = z5 | z4;
        Object g2 = composer.g();
        if (z6 || g2 == Composer.f14567a.a()) {
            g2 = new TooltipStateImpl(z2, z3, mutatorMutex);
            composer.N(g2);
        }
        TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return tooltipStateImpl;
    }
}
