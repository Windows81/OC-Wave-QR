package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

@Metadata
public final class ButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(kotlin.jvm.functions.Function0 r35, androidx.compose.ui.Modifier r36, boolean r37, androidx.compose.foundation.interaction.MutableInteractionSource r38, androidx.compose.material.ButtonElevation r39, androidx.compose.ui.graphics.Shape r40, androidx.compose.foundation.BorderStroke r41, androidx.compose.material.ButtonColors r42, androidx.compose.foundation.layout.PaddingValues r43, kotlin.jvm.functions.Function3 r44, androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            r10 = r44
            r11 = r46
            r12 = r47
            r0 = -2116133464(0xffffffff81de5da8, float:-8.168431E-38)
            r1 = r45
            androidx.compose.runtime.Composer r14 = r1.q(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r11 | 6
            r15 = r35
            goto L_0x002a
        L_0x0018:
            r1 = r11 & 6
            r15 = r35
            if (r1 != 0) goto L_0x0029
            boolean r1 = r14.l(r15)
            if (r1 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0027
        L_0x0026:
            r1 = 2
        L_0x0027:
            r1 = r1 | r11
            goto L_0x002a
        L_0x0029:
            r1 = r11
        L_0x002a:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0033
            r1 = r1 | 48
        L_0x0030:
            r3 = r36
            goto L_0x0045
        L_0x0033:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x0030
            r3 = r36
            boolean r4 = r14.W(r3)
            if (r4 == 0) goto L_0x0042
            r4 = 32
            goto L_0x0044
        L_0x0042:
            r4 = 16
        L_0x0044:
            r1 = r1 | r4
        L_0x0045:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r5 = r37
            goto L_0x0060
        L_0x004e:
            r5 = r11 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004b
            r5 = r37
            boolean r6 = r14.d(r5)
            if (r6 == 0) goto L_0x005d
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r6
        L_0x0060:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0066:
            r7 = r38
            goto L_0x007b
        L_0x0069:
            r7 = r11 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0066
            r7 = r38
            boolean r8 = r14.W(r7)
            if (r8 == 0) goto L_0x0078
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r8
        L_0x007b:
            r8 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0094
            r8 = r12 & 16
            if (r8 != 0) goto L_0x008e
            r8 = r39
            boolean r9 = r14.W(r8)
            if (r9 == 0) goto L_0x0090
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x008e:
            r8 = r39
        L_0x0090:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r9
            goto L_0x0096
        L_0x0094:
            r8 = r39
        L_0x0096:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x00ae
            r9 = r12 & 32
            r13 = r40
            if (r9 != 0) goto L_0x00aa
            boolean r9 = r14.W(r13)
            if (r9 == 0) goto L_0x00aa
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r1 = r1 | r9
            goto L_0x00b0
        L_0x00ae:
            r13 = r40
        L_0x00b0:
            r16 = r12 & 64
            r9 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00ba
            r1 = r1 | r9
        L_0x00b7:
            r9 = r41
            goto L_0x00cc
        L_0x00ba:
            r9 = r9 & r11
            if (r9 != 0) goto L_0x00b7
            r9 = r41
            boolean r17 = r14.W(r9)
            if (r17 == 0) goto L_0x00c8
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c8:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r1 = r1 | r17
        L_0x00cc:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x00e8
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e1
            r0 = r42
            boolean r17 = r14.W(r0)
            if (r17 == 0) goto L_0x00e3
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e5
        L_0x00e1:
            r0 = r42
        L_0x00e3:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e5:
            r1 = r1 | r17
            goto L_0x00ea
        L_0x00e8:
            r0 = r42
        L_0x00ea:
            r15 = r12 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r15 == 0) goto L_0x00f7
            r1 = r1 | r17
        L_0x00f2:
            r17 = r15
            r15 = r43
            goto L_0x010c
        L_0x00f7:
            r17 = r11 & r17
            if (r17 != 0) goto L_0x00f2
            r17 = r15
            r15 = r43
            boolean r18 = r14.W(r15)
            if (r18 == 0) goto L_0x0108
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010a
        L_0x0108:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010a:
            r1 = r1 | r18
        L_0x010c:
            r0 = r12 & 512(0x200, float:7.175E-43)
            r26 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0116
            r1 = r1 | r26
        L_0x0114:
            r0 = r1
            goto L_0x0127
        L_0x0116:
            r0 = r11 & r26
            if (r0 != 0) goto L_0x0114
            boolean r0 = r14.l(r10)
            if (r0 == 0) goto L_0x0123
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0125
        L_0x0123:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0125:
            r1 = r1 | r0
            goto L_0x0114
        L_0x0127:
            r1 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r1 & r0
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            r15 = 1
            if (r1 == r3) goto L_0x0133
            r1 = r15
            goto L_0x0134
        L_0x0133:
            r1 = 0
        L_0x0134:
            r3 = r0 & 1
            boolean r1 = r14.E(r1, r3)
            if (r1 == 0) goto L_0x030a
            r14.p()
            r1 = r11 & 1
            r27 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = 0
            if (r1 == 0) goto L_0x0177
            boolean r1 = r14.J()
            if (r1 == 0) goto L_0x0154
            goto L_0x0177
        L_0x0154:
            r14.B()
            r1 = r12 & 16
            if (r1 == 0) goto L_0x015d
            r0 = r0 & r19
        L_0x015d:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0163
            r0 = r0 & r18
        L_0x0163:
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0169
            r0 = r0 & r27
        L_0x0169:
            r6 = r42
            r4 = r9
            r3 = r13
            r9 = r14
            r2 = r15
            r1 = 0
            r15 = r43
            r13 = r0
            r0 = r36
            goto L_0x021a
        L_0x0177:
            if (r2 == 0) goto L_0x017e
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r28 = r1
            goto L_0x0180
        L_0x017e:
            r28 = r36
        L_0x0180:
            if (r4 == 0) goto L_0x0185
            r29 = r15
            goto L_0x0187
        L_0x0185:
            r29 = r5
        L_0x0187:
            if (r6 == 0) goto L_0x018c
            r30 = r3
            goto L_0x018e
        L_0x018c:
            r30 = r7
        L_0x018e:
            r1 = r12 & 16
            if (r1 == 0) goto L_0x01ab
            androidx.compose.material.ButtonDefaults r1 = androidx.compose.material.ButtonDefaults.f7422a
            r8 = 196608(0x30000, float:2.75506E-40)
            r20 = 31
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r14
            r9 = r20
            androidx.compose.material.ButtonElevation r1 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r0 & r19
            r8 = r1
        L_0x01ab:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x01bd
            androidx.compose.material.MaterialTheme r1 = androidx.compose.material.MaterialTheme.f7937a
            r2 = 6
            androidx.compose.material.Shapes r1 = r1.b(r14, r2)
            androidx.compose.foundation.shape.CornerBasedShape r1 = r1.c()
            r0 = r0 & r18
            goto L_0x01be
        L_0x01bd:
            r1 = r13
        L_0x01be:
            if (r16 == 0) goto L_0x01c2
            r2 = 0
            goto L_0x01c4
        L_0x01c2:
            r2 = r41
        L_0x01c4:
            r3 = r12 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x01eb
            androidx.compose.material.ButtonDefaults r13 = androidx.compose.material.ButtonDefaults.f7422a
            r23 = 24576(0x6000, float:3.4438E-41)
            r24 = 15
            r3 = 0
            r5 = 0
            r18 = 0
            r20 = 0
            r36 = r1
            r37 = r2
            r9 = r14
            r2 = r15
            r7 = r17
            r1 = 0
            r14 = r3
            r16 = r5
            r22 = r9
            androidx.compose.material.ButtonColors r3 = r13.a(r14, r16, r18, r20, r22, r23, r24)
            r0 = r0 & r27
            goto L_0x01f6
        L_0x01eb:
            r36 = r1
            r37 = r2
            r9 = r14
            r2 = r15
            r7 = r17
            r1 = 0
            r3 = r42
        L_0x01f6:
            if (r7 == 0) goto L_0x020c
            androidx.compose.material.ButtonDefaults r4 = androidx.compose.material.ButtonDefaults.f7422a
            androidx.compose.foundation.layout.PaddingValues r4 = r4.c()
            r13 = r0
            r6 = r3
            r15 = r4
            r0 = r28
            r5 = r29
            r7 = r30
            r3 = r36
            r4 = r37
            goto L_0x021a
        L_0x020c:
            r4 = r37
            r15 = r43
            r13 = r0
            r6 = r3
            r0 = r28
            r5 = r29
            r7 = r30
            r3 = r36
        L_0x021a:
            r9.U()
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            if (r14 == 0) goto L_0x022c
            r14 = -1
            java.lang.String r1 = "androidx.compose.material.Button (Button.kt:106)"
            r2 = -2116133464(0xffffffff81de5da8, float:-8.168431E-38)
            androidx.compose.runtime.ComposerKt.Y(r2, r13, r14, r1)
        L_0x022c:
            if (r7 != 0) goto L_0x024d
            r1 = 1050689923(0x3ea04183, float:0.3129998)
            r9.X(r1)
            java.lang.Object r1 = r9.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x0247
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r9.N(r1)
        L_0x0247:
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = (androidx.compose.foundation.interaction.MutableInteractionSource) r1
            r9.M()
            goto L_0x0257
        L_0x024d:
            r1 = -243202092(0xfffffffff18107d4, float:-1.277857E30)
            r9.X(r1)
            r9.M()
            r1 = r7
        L_0x0257:
            int r2 = r13 >> 6
            r14 = r2 & 14
            int r17 = r13 >> 18
            r17 = r17 & 112(0x70, float:1.57E-43)
            r14 = r14 | r17
            r36 = r7
            androidx.compose.runtime.State r7 = r6.b(r5, r9, r14)
            androidx.compose.material.ButtonKt$Button$1 r11 = androidx.compose.material.ButtonKt$Button$1.f7433z
            r38 = r3
            r37 = r4
            r3 = 0
            r4 = 1
            r12 = 0
            androidx.compose.ui.Modifier r11 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r0, r12, r11, r4, r3)
            androidx.compose.runtime.State r4 = r6.a(r5, r9, r14)
            java.lang.Object r4 = r4.getValue()
            androidx.compose.ui.graphics.Color r4 = (androidx.compose.ui.graphics.Color) r4
            long r17 = r4.v()
            long r27 = b(r7)
            r33 = 14
            r34 = 0
            r29 = 1065353216(0x3f800000, float:1.0)
            r30 = 0
            r31 = 0
            r32 = 0
            long r19 = androidx.compose.ui.graphics.Color.l(r27, r29, r30, r31, r32, r33, r34)
            if (r8 != 0) goto L_0x02a2
            r4 = 1051096580(0x3ea67604, float:0.32511914)
            r9.X(r4)
        L_0x029e:
            r9.M()
            goto L_0x02af
        L_0x02a2:
            r3 = -243188323(0xfffffffff1813d9d, float:-1.2799377E30)
            r9.X(r3)
            r3 = r2 & 910(0x38e, float:1.275E-42)
            androidx.compose.runtime.State r3 = r8.a(r5, r1, r9, r3)
            goto L_0x029e
        L_0x02af:
            if (r3 == 0) goto L_0x02be
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.unit.Dp r3 = (androidx.compose.ui.unit.Dp) r3
            float r3 = r3.t()
        L_0x02bb:
            r22 = r3
            goto L_0x02c5
        L_0x02be:
            r3 = 0
            float r3 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            goto L_0x02bb
        L_0x02c5:
            androidx.compose.material.ButtonKt$Button$2 r3 = new androidx.compose.material.ButtonKt$Button$2
            r3.<init>(r7, r15, r10)
            r4 = 54
            r7 = 7524271(0x72cfaf, float:1.054375E-38)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r24 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r12, r3, r9, r4)
            r3 = r13 & 14
            r3 = r3 | r26
            r4 = r13 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r13
            r26 = r2 | r3
            r27 = 0
            r13 = r35
            r14 = r11
            r4 = r15
            r15 = r5
            r16 = r38
            r21 = r37
            r23 = r1
            r25 = r9
            androidx.compose.material.SurfaceKt.b(r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x02fe
            androidx.compose.runtime.ComposerKt.X()
        L_0x02fe:
            r7 = r37
            r2 = r0
            r11 = r4
            r3 = r5
            r5 = r8
            r4 = r36
            r8 = r6
            r6 = r38
            goto L_0x031a
        L_0x030a:
            r9 = r14
            r9.B()
            r2 = r36
            r11 = r43
            r3 = r5
            r4 = r7
            r5 = r8
            r6 = r13
            r7 = r41
            r8 = r42
        L_0x031a:
            androidx.compose.runtime.ScopeUpdateScope r13 = r9.x()
            if (r13 == 0) goto L_0x0332
            androidx.compose.material.ButtonKt$Button$3 r14 = new androidx.compose.material.ButtonKt$Button$3
            r0 = r14
            r1 = r35
            r9 = r11
            r10 = r44
            r11 = r46
            r12 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0332:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.a(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.ButtonElevation, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ButtonColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final long b(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final void c(Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3 function3, Composer composer, int i2, int i3) {
        CornerBasedShape cornerBasedShape;
        int i4 = i2;
        int i5 = i3;
        Modifier.Companion companion = (i5 & 2) != 0 ? Modifier.f15489d : modifier;
        boolean z3 = (i5 & 4) != 0 ? true : z2;
        MutableInteractionSource mutableInteractionSource2 = (i5 & 8) != 0 ? null : mutableInteractionSource;
        ButtonElevation buttonElevation2 = (i5 & 16) != 0 ? null : buttonElevation;
        if ((i5 & 32) != 0) {
            cornerBasedShape = MaterialTheme.f7937a.b(composer, 6).c();
        } else {
            Composer composer2 = composer;
            cornerBasedShape = shape;
        }
        BorderStroke borderStroke2 = (i5 & 64) != 0 ? null : borderStroke;
        ButtonColors g2 = (i5 & 128) != 0 ? ButtonDefaults.f7422a.g(0, 0, 0, composer, 3072, 7) : buttonColors;
        PaddingValues f2 = (i5 & 256) != 0 ? ButtonDefaults.f7422a.f() : paddingValues;
        if (ComposerKt.P()) {
            ComposerKt.Y(288797557, i4, -1, "androidx.compose.material.TextButton (Button.kt:241)");
        }
        a(function0, companion, z3, mutableInteractionSource2, buttonElevation2, cornerBasedShape, borderStroke2, g2, f2, function3, composer, i4 & 2147483646, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }
}
