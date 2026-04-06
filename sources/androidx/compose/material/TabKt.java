package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TabKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f8643a = Dp.m((float) 48);

    /* renamed from: b  reason: collision with root package name */
    public static final float f8644b = Dp.m((float) 72);

    /* renamed from: c  reason: collision with root package name */
    public static final float f8645c = Dp.m((float) 16);

    /* renamed from: d  reason: collision with root package name */
    public static final float f8646d = Dp.m((float) 14);

    /* renamed from: e  reason: collision with root package name */
    public static final float f8647e = Dp.m((float) 6);

    /* renamed from: f  reason: collision with root package name */
    public static final long f8648f = TextUnitKt.i(20);

    /* renamed from: g  reason: collision with root package name */
    public static final float f8649g = Dp.m((float) 8);

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r28, kotlin.jvm.functions.Function0 r29, kotlin.jvm.functions.Function2 r30, kotlin.jvm.functions.Function2 r31, androidx.compose.ui.Modifier r32, boolean r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, long r35, long r37, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r12 = r40
            r13 = r41
            r0 = -1499861761(0xffffffffa699ecff, float:-1.0680746E-15)
            r1 = r39
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r12 | 6
            r3 = r2
            r2 = r28
            goto L_0x002b
        L_0x0017:
            r2 = r12 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r28
            boolean r3 = r1.d(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r12
            goto L_0x002b
        L_0x0028:
            r2 = r28
            r3 = r12
        L_0x002b:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
            r14 = r29
            goto L_0x0046
        L_0x0034:
            r4 = r12 & 48
            r14 = r29
            if (r4 != 0) goto L_0x0046
            boolean r4 = r1.l(r14)
            if (r4 == 0) goto L_0x0043
            r4 = 32
            goto L_0x0045
        L_0x0043:
            r4 = 16
        L_0x0045:
            r3 = r3 | r4
        L_0x0046:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
            r15 = r30
            goto L_0x0061
        L_0x004f:
            r4 = r12 & 384(0x180, float:5.38E-43)
            r15 = r30
            if (r4 != 0) goto L_0x0061
            boolean r4 = r1.l(r15)
            if (r4 == 0) goto L_0x005e
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r4
        L_0x0061:
            r4 = r13 & 8
            if (r4 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r11 = r31
            goto L_0x007c
        L_0x006a:
            r4 = r12 & 3072(0xc00, float:4.305E-42)
            r11 = r31
            if (r4 != 0) goto L_0x007c
            boolean r4 = r1.l(r11)
            if (r4 == 0) goto L_0x0079
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r4
        L_0x007c:
            r4 = r13 & 16
            if (r4 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r5 = r32
            goto L_0x0097
        L_0x0085:
            r5 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0082
            r5 = r32
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0094
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r6
        L_0x0097:
            r6 = r13 & 32
            r7 = 196608(0x30000, float:2.75506E-40)
            if (r6 == 0) goto L_0x00a1
            r3 = r3 | r7
        L_0x009e:
            r7 = r33
            goto L_0x00b2
        L_0x00a1:
            r7 = r7 & r12
            if (r7 != 0) goto L_0x009e
            r7 = r33
            boolean r8 = r1.d(r7)
            if (r8 == 0) goto L_0x00af
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r8
        L_0x00b2:
            r8 = r13 & 64
            r9 = 1572864(0x180000, float:2.204052E-39)
            if (r8 == 0) goto L_0x00bc
            r3 = r3 | r9
        L_0x00b9:
            r9 = r34
            goto L_0x00cd
        L_0x00bc:
            r9 = r9 & r12
            if (r9 != 0) goto L_0x00b9
            r9 = r34
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x00ca
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r3 = r3 | r10
        L_0x00cd:
            r10 = 12582912(0xc00000, float:1.7632415E-38)
            r10 = r10 & r12
            if (r10 != 0) goto L_0x00e8
            r10 = r13 & 128(0x80, float:1.794E-43)
            if (r10 != 0) goto L_0x00e1
            r9 = r35
            boolean r16 = r1.j(r9)
            if (r16 == 0) goto L_0x00e3
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e5
        L_0x00e1:
            r9 = r35
        L_0x00e3:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e5:
            r3 = r3 | r16
            goto L_0x00ea
        L_0x00e8:
            r9 = r35
        L_0x00ea:
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x0103
            r0 = r13 & 256(0x100, float:3.59E-43)
            r9 = r37
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r1.j(r9)
            if (r0 == 0) goto L_0x00ff
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0101
        L_0x00ff:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0101:
            r3 = r3 | r0
            goto L_0x0105
        L_0x0103:
            r9 = r37
        L_0x0105:
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r0 & r3
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 == r2) goto L_0x0110
            r0 = 1
            goto L_0x0111
        L_0x0110:
            r0 = 0
        L_0x0111:
            r2 = r3 & 1
            boolean r0 = r1.E(r0, r2)
            if (r0 == 0) goto L_0x0204
            r1.p()
            r0 = r12 & 1
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r17 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r14 = 6
            if (r0 == 0) goto L_0x0146
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x012e
            goto L_0x0146
        L_0x012e:
            r1.B()
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0137
            r3 = r3 & r17
        L_0x0137:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x013c
            r3 = r3 & r2
        L_0x013c:
            r17 = r34
            r18 = r35
        L_0x0140:
            r0 = r5
            r2 = r7
            r20 = r9
            r10 = r3
            goto L_0x0191
        L_0x0146:
            if (r4 == 0) goto L_0x014b
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r5 = r0
        L_0x014b:
            if (r6 == 0) goto L_0x014e
            r7 = 1
        L_0x014e:
            if (r8 == 0) goto L_0x0152
            r0 = 0
            goto L_0x0154
        L_0x0152:
            r0 = r34
        L_0x0154:
            r4 = r13 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0169
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r4 = r1.C(r4)
            androidx.compose.ui.graphics.Color r4 = (androidx.compose.ui.graphics.Color) r4
            long r18 = r4.v()
            r3 = r3 & r17
            goto L_0x016b
        L_0x0169:
            r18 = r35
        L_0x016b:
            r4 = r13 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x018e
            androidx.compose.material.ContentAlpha r4 = androidx.compose.material.ContentAlpha.f7561a
            float r22 = r4.d(r1, r14)
            r26 = 14
            r27 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r20 = r18
            long r8 = androidx.compose.ui.graphics.Color.l(r20, r22, r23, r24, r25, r26, r27)
            r3 = r3 & r2
            r17 = r0
            r10 = r3
            r0 = r5
            r2 = r7
            r20 = r8
            goto L_0x0191
        L_0x018e:
            r17 = r0
            goto L_0x0140
        L_0x0191:
            r1.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01a3
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.LeadingIconTab (Tab.kt:161)"
            r5 = -1499861761(0xffffffffa699ecff, float:-1.0680746E-15)
            androidx.compose.runtime.ComposerKt.Y(r5, r10, r3, r4)
        L_0x01a3:
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            r32 = r5
            r33 = r6
            r34 = r18
            r36 = r3
            r37 = r4
            androidx.compose.foundation.IndicationNodeFactory r7 = androidx.compose.material.RippleKt.f(r32, r33, r34, r36, r37)
            androidx.compose.material.TabKt$LeadingIconTab$1 r9 = new androidx.compose.material.TabKt$LeadingIconTab$1
            r3 = r9
            r4 = r0
            r5 = r28
            r6 = r17
            r8 = r2
            r14 = r9
            r9 = r29
            r22 = r10
            r10 = r31
            r11 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = 54
            r4 = 866677691(0x33a873bb, float:7.844161E-8)
            r5 = 1
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r5, r14, r1, r3)
            int r4 = r22 >> 21
            r5 = r4 & 14
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            r5 = 6
            int r5 = r22 << 6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            r32 = r18
            r34 = r20
            r36 = r28
            r37 = r3
            r38 = r1
            r39 = r4
            e(r32, r34, r36, r37, r38, r39)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01fb
            androidx.compose.runtime.ComposerKt.X()
        L_0x01fb:
            r5 = r0
            r6 = r2
            r7 = r17
            r8 = r18
            r10 = r20
            goto L_0x020d
        L_0x0204:
            r1.B()
            r6 = r7
            r10 = r9
            r7 = r34
            r8 = r35
        L_0x020d:
            androidx.compose.runtime.ScopeUpdateScope r14 = r1.x()
            if (r14 == 0) goto L_0x0229
            androidx.compose.material.TabKt$LeadingIconTab$2 r4 = new androidx.compose.material.TabKt$LeadingIconTab$2
            r0 = r4
            r1 = r28
            r2 = r29
            r3 = r30
            r15 = r4
            r4 = r31
            r12 = r40
            r13 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            r14.a(r15)
        L_0x0229:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.a(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(boolean r29, kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, boolean r32, kotlin.jvm.functions.Function2 r33, kotlin.jvm.functions.Function2 r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, long r36, long r38, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r12 = r41
            r13 = r42
            r0 = -1486097588(0xffffffffa76bf34c, float:-3.2744693E-15)
            r1 = r40
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r12 | 6
            r3 = r2
            r2 = r29
            goto L_0x002b
        L_0x0017:
            r2 = r12 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r29
            boolean r3 = r1.d(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r12
            goto L_0x002b
        L_0x0028:
            r2 = r29
            r3 = r12
        L_0x002b:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r4 = r30
            goto L_0x0046
        L_0x0034:
            r4 = r12 & 48
            if (r4 != 0) goto L_0x0031
            r4 = r30
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0045
        L_0x0043:
            r5 = 16
        L_0x0045:
            r3 = r3 | r5
        L_0x0046:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r6 = r31
            goto L_0x0061
        L_0x004f:
            r6 = r12 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r31
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r7
        L_0x0061:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r8 = r32
            goto L_0x007c
        L_0x006a:
            r8 = r12 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r32
            boolean r9 = r1.d(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r9
        L_0x007c:
            r9 = r13 & 16
            if (r9 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r10 = r33
            goto L_0x0097
        L_0x0085:
            r10 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0082
            r10 = r33
            boolean r11 = r1.l(r10)
            if (r11 == 0) goto L_0x0094
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r11
        L_0x0097:
            r11 = r13 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x00a1
            r3 = r3 | r14
        L_0x009e:
            r14 = r34
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r12
            if (r14 != 0) goto L_0x009e
            r14 = r34
            boolean r15 = r1.l(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r15
        L_0x00b2:
            r15 = r13 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bd
            r3 = r3 | r16
            r0 = r35
            goto L_0x00d0
        L_0x00bd:
            r16 = r12 & r16
            r0 = r35
            if (r16 != 0) goto L_0x00d0
            boolean r17 = r1.W(r0)
            if (r17 == 0) goto L_0x00cc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r3 = r3 | r17
        L_0x00d0:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = r12 & r17
            if (r18 != 0) goto L_0x00eb
            r0 = r13 & 128(0x80, float:1.794E-43)
            r40 = r15
            r14 = r36
            if (r0 != 0) goto L_0x00e7
            boolean r0 = r1.j(r14)
            if (r0 == 0) goto L_0x00e7
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e7:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r3 = r3 | r0
            goto L_0x00ef
        L_0x00eb:
            r40 = r15
            r14 = r36
        L_0x00ef:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 & r12
            if (r0 != 0) goto L_0x0107
            r0 = r13 & 256(0x100, float:3.59E-43)
            r14 = r38
            if (r0 != 0) goto L_0x0103
            boolean r0 = r1.j(r14)
            if (r0 == 0) goto L_0x0103
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0105
        L_0x0103:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0105:
            r3 = r3 | r0
            goto L_0x0109
        L_0x0107:
            r14 = r38
        L_0x0109:
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r0 & r3
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 == r2) goto L_0x0114
            r0 = 1
            goto L_0x0115
        L_0x0114:
            r0 = 0
        L_0x0115:
            r2 = r3 & 1
            boolean r0 = r1.E(r0, r2)
            if (r0 == 0) goto L_0x0231
            r1.p()
            r0 = r12 & 1
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r19 = 0
            r4 = 6
            if (r0 == 0) goto L_0x014c
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0134
            goto L_0x014c
        L_0x0134:
            r1.B()
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x013d
            r3 = r3 & r18
        L_0x013d:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0142
            r3 = r3 & r2
        L_0x0142:
            r0 = r34
            r5 = r35
            r7 = r3
            r27 = r14
            r2 = r36
            goto L_0x01a6
        L_0x014c:
            if (r5 == 0) goto L_0x0151
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r6 = r0
        L_0x0151:
            if (r7 == 0) goto L_0x0154
            r8 = 1
        L_0x0154:
            if (r9 == 0) goto L_0x0158
            r10 = r19
        L_0x0158:
            if (r11 == 0) goto L_0x015d
            r0 = r19
            goto L_0x015f
        L_0x015d:
            r0 = r34
        L_0x015f:
            if (r40 == 0) goto L_0x0164
            r5 = r19
            goto L_0x0166
        L_0x0164:
            r5 = r35
        L_0x0166:
            r7 = r13 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x017b
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r7 = r1.C(r7)
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.ui.graphics.Color) r7
            long r21 = r7.v()
            r3 = r3 & r18
            goto L_0x017d
        L_0x017b:
            r21 = r36
        L_0x017d:
            r7 = r13 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x01a1
            androidx.compose.material.ContentAlpha r7 = androidx.compose.material.ContentAlpha.f7561a
            float r7 = r7.d(r1, r4)
            r9 = 14
            r11 = 0
            r14 = 0
            r15 = 0
            r18 = 0
            r31 = r21
            r33 = r7
            r34 = r14
            r35 = r15
            r36 = r18
            r37 = r9
            r38 = r11
            long r14 = androidx.compose.ui.graphics.Color.l(r31, r33, r34, r35, r36, r37, r38)
            r3 = r3 & r2
        L_0x01a1:
            r7 = r3
            r27 = r14
            r2 = r21
        L_0x01a6:
            r1.U()
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x01b8
            r9 = -1
            java.lang.String r11 = "androidx.compose.material.Tab (Tab.kt:98)"
            r14 = -1486097588(0xffffffffa76bf34c, float:-3.2744693E-15)
            androidx.compose.runtime.ComposerKt.Y(r14, r7, r9, r11)
        L_0x01b8:
            r9 = 54
            if (r10 != 0) goto L_0x01c9
            r11 = 1041219556(0x3e0fbfe4, float:0.14038044)
            r1.X(r11)
            r1.M()
            r11 = r19
            r15 = 1
            goto L_0x01e1
        L_0x01c9:
            r11 = 1041219557(0x3e0fbfe5, float:0.14038046)
            r1.X(r11)
            androidx.compose.material.TabKt$Tab$styledText$1$1 r11 = new androidx.compose.material.TabKt$Tab$styledText$1$1
            r11.<init>(r10)
            r14 = -1729014781(0xffffffff98f15403, float:-6.238187E-24)
            r15 = 1
            androidx.compose.runtime.internal.ComposableLambda r19 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r15, r11, r1, r9)
            r1.M()
            r11 = r19
        L_0x01e1:
            androidx.compose.material.TabKt$Tab$1 r14 = new androidx.compose.material.TabKt$Tab$1
            r14.<init>(r11, r0)
            r11 = -178151495(0xfffffffff5619fb9, float:-2.860123E32)
            androidx.compose.runtime.internal.ComposableLambda r23 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r15, r14, r1, r9)
            r9 = r7 & 14
            r9 = r9 | r17
            r11 = r7 & 112(0x70, float:1.57E-43)
            r9 = r9 | r11
            r11 = r7 & 896(0x380, float:1.256E-42)
            r9 = r9 | r11
            r11 = r7 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r11
            int r4 = r7 >> 6
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r4
            r7 = r7 | r9
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r4
            r7 = r7 | r9
            r9 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r9
            r25 = r7 | r4
            r26 = 0
            r14 = r29
            r15 = r30
            r16 = r6
            r17 = r8
            r18 = r5
            r19 = r2
            r21 = r27
            r24 = r1
            c(r14, r15, r16, r17, r18, r19, r21, r23, r24, r25, r26)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0228
            androidx.compose.runtime.ComposerKt.X()
        L_0x0228:
            r7 = r5
            r4 = r8
            r5 = r10
            r10 = r27
            r8 = r2
            r3 = r6
            r6 = r0
            goto L_0x023e
        L_0x0231:
            r1.B()
            r7 = r35
            r3 = r6
            r4 = r8
            r5 = r10
            r10 = r14
            r6 = r34
            r8 = r36
        L_0x023e:
            androidx.compose.runtime.ScopeUpdateScope r14 = r1.x()
            if (r14 == 0) goto L_0x0255
            androidx.compose.material.TabKt$Tab$2 r15 = new androidx.compose.material.TabKt$Tab$2
            r0 = r15
            r1 = r29
            r2 = r30
            r12 = r41
            r13 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            r14.a(r15)
        L_0x0255:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.b(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(boolean r29, kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, boolean r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, long r34, long r36, kotlin.jvm.functions.Function3 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r11 = r40
            r12 = r41
            r0 = 713679175(0x2a89e147, float:2.4492406E-13)
            r1 = r39
            androidx.compose.runtime.Composer r9 = r1.q(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r11 | 6
            r10 = r29
            goto L_0x0028
        L_0x0016:
            r1 = r11 & 6
            r10 = r29
            if (r1 != 0) goto L_0x0027
            boolean r1 = r9.d(r10)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r11
            goto L_0x0028
        L_0x0027:
            r1 = r11
        L_0x0028:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0031
            r1 = r1 | 48
            r8 = r30
            goto L_0x0043
        L_0x0031:
            r2 = r11 & 48
            r8 = r30
            if (r2 != 0) goto L_0x0043
            boolean r2 = r9.l(r8)
            if (r2 == 0) goto L_0x0040
            r2 = 32
            goto L_0x0042
        L_0x0040:
            r2 = 16
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r3 = r31
            goto L_0x005e
        L_0x004c:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0049
            r3 = r31
            boolean r4 = r9.W(r3)
            if (r4 == 0) goto L_0x005b
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r4
        L_0x005e:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0067
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r5 = r32
            goto L_0x0079
        L_0x0067:
            r5 = r11 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0064
            r5 = r32
            boolean r6 = r9.d(r5)
            if (r6 == 0) goto L_0x0076
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r1 = r1 | r6
        L_0x0079:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0082
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007f:
            r7 = r33
            goto L_0x0094
        L_0x0082:
            r7 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x007f
            r7 = r33
            boolean r13 = r9.W(r7)
            if (r13 == 0) goto L_0x0091
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r1 = r1 | r13
        L_0x0094:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00ae
            r13 = r12 & 32
            if (r13 != 0) goto L_0x00a8
            r13 = r34
            boolean r15 = r9.j(r13)
            if (r15 == 0) goto L_0x00aa
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00a8:
            r13 = r34
        L_0x00aa:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r1 = r1 | r15
            goto L_0x00b0
        L_0x00ae:
            r13 = r34
        L_0x00b0:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r11
            if (r15 != 0) goto L_0x00cb
            r15 = r12 & 64
            r39 = r1
            r0 = r36
            if (r15 != 0) goto L_0x00c6
            boolean r16 = r9.j(r0)
            if (r16 == 0) goto L_0x00c6
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c8
        L_0x00c6:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c8:
            r16 = r39 | r16
            goto L_0x00d1
        L_0x00cb:
            r39 = r1
            r0 = r36
            r16 = r39
        L_0x00d1:
            r15 = r12 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r15 == 0) goto L_0x00dc
            r16 = r16 | r17
        L_0x00d9:
            r15 = r38
            goto L_0x00ef
        L_0x00dc:
            r15 = r11 & r17
            if (r15 != 0) goto L_0x00d9
            r15 = r38
            boolean r17 = r9.l(r15)
            if (r17 == 0) goto L_0x00eb
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r16 = r16 | r17
        L_0x00ef:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r0 = r16 & r17
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r0 == r1) goto L_0x00fb
            r0 = 1
            goto L_0x00fc
        L_0x00fb:
            r0 = 0
        L_0x00fc:
            r1 = r16 & 1
            boolean r0 = r9.E(r0, r1)
            if (r0 == 0) goto L_0x01e6
            r9.p()
            r0 = r11 & 1
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = 6
            if (r0 == 0) goto L_0x0135
            boolean r0 = r9.J()
            if (r0 == 0) goto L_0x0119
            goto L_0x0135
        L_0x0119:
            r9.B()
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0122
            r16 = r16 & r17
        L_0x0122:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x0128
            r16 = r16 & r1
        L_0x0128:
            r0 = r31
        L_0x012a:
            r25 = r36
            r21 = r5
            r22 = r7
            r23 = r13
            r1 = r16
            goto L_0x017d
        L_0x0135:
            if (r2 == 0) goto L_0x013a
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x013c
        L_0x013a:
            r0 = r31
        L_0x013c:
            if (r4 == 0) goto L_0x013f
            r5 = 1
        L_0x013f:
            if (r6 == 0) goto L_0x0143
            r2 = 0
            r7 = r2
        L_0x0143:
            r2 = r12 & 32
            if (r2 == 0) goto L_0x0157
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r2 = r9.C(r2)
            androidx.compose.ui.graphics.Color r2 = (androidx.compose.ui.graphics.Color) r2
            long r13 = r2.v()
            r16 = r16 & r17
        L_0x0157:
            r2 = r12 & 64
            if (r2 == 0) goto L_0x012a
            androidx.compose.material.ContentAlpha r2 = androidx.compose.material.ContentAlpha.f7561a
            float r23 = r2.d(r9, r3)
            r27 = 14
            r28 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r21 = r13
            long r17 = androidx.compose.ui.graphics.Color.l(r21, r23, r24, r25, r26, r27, r28)
            r16 = r16 & r1
            r21 = r5
            r22 = r7
            r23 = r13
            r1 = r16
            r25 = r17
        L_0x017d:
            r9.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x018f
            r2 = -1
            java.lang.String r4 = "androidx.compose.material.Tab (Tab.kt:232)"
            r5 = 713679175(0x2a89e147, float:2.4492406E-13)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x018f:
            r2 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            r31 = r5
            r32 = r6
            r33 = r23
            r35 = r2
            r36 = r4
            androidx.compose.foundation.IndicationNodeFactory r17 = androidx.compose.material.RippleKt.f(r31, r32, r33, r35, r36)
            androidx.compose.material.TabKt$Tab$3 r2 = new androidx.compose.material.TabKt$Tab$3
            r13 = r2
            r14 = r0
            r15 = r29
            r16 = r22
            r18 = r21
            r19 = r30
            r20 = r38
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r4 = 54
            r5 = -1237246709(0xffffffffb6411d0b, float:-2.8776146E-6)
            r6 = 1
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r6, r2, r9, r4)
            int r2 = r1 >> 15
            r4 = r2 & 14
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r1 = r1 << r3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r13 = r2 | r1
            r1 = r23
            r3 = r25
            r5 = r29
            r7 = r9
            r8 = r13
            e(r1, r3, r5, r6, r7, r8)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01de
            androidx.compose.runtime.ComposerKt.X()
        L_0x01de:
            r3 = r0
            r4 = r21
            r5 = r22
            r6 = r23
            goto L_0x01f0
        L_0x01e6:
            r9.B()
            r3 = r31
            r25 = r36
            r4 = r5
            r5 = r7
            r6 = r13
        L_0x01f0:
            androidx.compose.runtime.ScopeUpdateScope r13 = r9.x()
            if (r13 == 0) goto L_0x020b
            androidx.compose.material.TabKt$Tab$4 r14 = new androidx.compose.material.TabKt$Tab$4
            r0 = r14
            r1 = r29
            r2 = r30
            r8 = r25
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12)
            r13.a(r14)
        L_0x020b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.c(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(Function2 function2, Function2 function22, Composer composer, int i2) {
        int i3;
        boolean z2 = true;
        Composer q2 = composer.q(1249848471);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function22) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1249848471, i3, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:300)");
            }
            int i4 = i3 & 14;
            boolean z3 = i4 == 4;
            if ((i3 & 112) != 32) {
                z2 = false;
            }
            boolean z4 = z2 | z3;
            Object g2 = q2.g();
            if (z4 || g2 == Composer.f14567a.a()) {
                g2 = new TabKt$TabBaselineLayout$2$1(function2, function22);
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
            if (function2 != null) {
                q2.X(-238651272);
                Modifier k2 = PaddingKt.k(LayoutIdKt.b(companion, "text"), f8645c, 0.0f, 2, (Object) null);
                MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.o(), false);
                int a4 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I2 = q2.I();
                Modifier e3 = ComposedModifierKt.e(q2, k2);
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
                Composer b4 = Updater.b(q2);
                Updater.g(b4, g3, companion2.c());
                Updater.g(b4, I2, companion2.e());
                Function2 b5 = companion2.b();
                if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a4))) {
                    b4.N(Integer.valueOf(a4));
                    b4.A(Integer.valueOf(a4), b5);
                }
                Updater.g(b4, e3, companion2.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                function2.m(q2, Integer.valueOf(i4));
                q2.T();
                q2.M();
            } else {
                q2.X(-238546523);
                q2.M();
            }
            if (function22 != null) {
                q2.X(-238517724);
                Modifier b6 = LayoutIdKt.b(companion, "icon");
                MeasurePolicy g4 = BoxKt.g(Alignment.f15444a.o(), false);
                int a6 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I3 = q2.I();
                Modifier e4 = ComposedModifierKt.e(q2, b6);
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
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3797a;
                function22.m(q2, Integer.valueOf((i3 >> 3) & 14));
                q2.T();
                q2.M();
            } else {
                q2.X(-238455259);
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
            x2.a(new TabKt$TabBaselineLayout$3(function2, function22, i2));
        }
    }

    public static final void e(long j2, long j3, boolean z2, Function2 function2, Composer composer, int i2) {
        int i3;
        Function2 function22 = function2;
        int i4 = i2;
        Composer q2 = composer.q(-405571117);
        long j4 = j2;
        if ((i4 & 6) == 0) {
            i3 = (q2.j(j4) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        long j5 = j3;
        if ((i4 & 48) == 0) {
            i3 |= q2.j(j5) ? 32 : 16;
        }
        boolean z3 = z2;
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function22) ? 2048 : 1024;
        }
        if (q2.E((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-405571117, i3, -1, "androidx.compose.material.TabTransition (Tab.kt:269)");
            }
            int i5 = i3 >> 6;
            Transition j6 = TransitionKt.j(Boolean.valueOf(z2), (String) null, q2, i5 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = TabKt$TabTransition$color$2.f8679z;
            boolean booleanValue = ((Boolean) j6.q()).booleanValue();
            q2.X(1445938070);
            if (ComposerKt.P()) {
                ComposerKt.Y(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
            }
            long j7 = booleanValue ? j2 : j5;
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            q2.M();
            ColorSpace q3 = Color.q(j7);
            boolean W = q2.W(q3);
            Object g2 = q2.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = (TwoWayConverter) ColorVectorConverterKt.a(Color.f15975b).invoke(q3);
                q2.N(g2);
            }
            TwoWayConverter twoWayConverter = (TwoWayConverter) g2;
            boolean booleanValue2 = ((Boolean) j6.i()).booleanValue();
            q2.X(1445938070);
            if (ComposerKt.P()) {
                ComposerKt.Y(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
            }
            long j8 = booleanValue2 ? j2 : j5;
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            q2.M();
            Color h2 = Color.h(j8);
            boolean booleanValue3 = ((Boolean) j6.q()).booleanValue();
            q2.X(1445938070);
            if (ComposerKt.P()) {
                ComposerKt.Y(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
            }
            long j9 = booleanValue3 ? j2 : j5;
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            q2.M();
            State f2 = TransitionKt.f(j6, h2, Color.h(j9), (FiniteAnimationSpec) tabKt$TabTransition$color$2.d(j6.o(), q2, 0), twoWayConverter, "ColorAnimation", q2, 0);
            CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(Color.l(f(f2), 1.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), ContentAlphaKt.a().d(Float.valueOf(Color.o(f(f2))))}, function22, q2, (i5 & 112) | ProvidedValue.f14769i);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new TabKt$TabTransition$1(j2, j3, z2, function2, i2));
        }
    }

    public static final long f(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final void o(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i2, int i3, int i4, int i5) {
        Density density2 = density;
        int i6 = i4;
        int i7 = i5;
        int P1 = density.P1(i6 == i7 ? f8646d : f8647e) + density.P1(TabRowDefaults.f8682a.c());
        int C0 = (placeable2.C0() + density.K1(f8648f)) - i6;
        int i8 = (i3 - i7) - P1;
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.n(placementScope2, placeable, (i2 - placeable.L0()) / 2, i8, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope2, placeable2, (i2 - placeable2.L0()) / 2, i8 - C0, 0.0f, 4, (Object) null);
    }

    public static final void p(Placeable.PlacementScope placementScope, Placeable placeable, int i2) {
        Placeable.PlacementScope.n(placementScope, placeable, 0, (i2 - placeable.C0()) / 2, 0.0f, 4, (Object) null);
    }
}
