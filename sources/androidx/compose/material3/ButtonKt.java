package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

@Metadata
public final class ButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(kotlin.jvm.functions.Function0 r31, androidx.compose.ui.Modifier r32, boolean r33, androidx.compose.ui.graphics.Shape r34, androidx.compose.material3.ButtonColors r35, androidx.compose.material3.ButtonElevation r36, androidx.compose.foundation.BorderStroke r37, androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, kotlin.jvm.functions.Function3 r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            r10 = r40
            r11 = r42
            r12 = r43
            r0 = -1310015664(0xffffffffb1eabf50, float:-6.832046E-9)
            r1 = r41
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r11 | 6
            r13 = r31
            goto L_0x002a
        L_0x0018:
            r1 = r11 & 6
            r13 = r31
            if (r1 != 0) goto L_0x0029
            boolean r1 = r15.l(r13)
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
            r3 = r32
            goto L_0x0045
        L_0x0033:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x0030
            r3 = r32
            boolean r4 = r15.W(r3)
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
            r5 = r33
            goto L_0x0060
        L_0x004e:
            r5 = r11 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004b
            r5 = r33
            boolean r6 = r15.d(r5)
            if (r6 == 0) goto L_0x005d
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r6
        L_0x0060:
            r6 = r11 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0079
            r6 = r12 & 8
            if (r6 != 0) goto L_0x0073
            r6 = r34
            boolean r7 = r15.W(r6)
            if (r7 == 0) goto L_0x0075
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0073:
            r6 = r34
        L_0x0075:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r1 = r1 | r7
            goto L_0x007b
        L_0x0079:
            r6 = r34
        L_0x007b:
            r7 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0094
            r7 = r12 & 16
            if (r7 != 0) goto L_0x008e
            r7 = r35
            boolean r8 = r15.W(r7)
            if (r8 == 0) goto L_0x0090
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x008e:
            r7 = r35
        L_0x0090:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r8
            goto L_0x0096
        L_0x0094:
            r7 = r35
        L_0x0096:
            r8 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 & r11
            if (r8 != 0) goto L_0x00b0
            r8 = r12 & 32
            if (r8 != 0) goto L_0x00aa
            r8 = r36
            boolean r9 = r15.W(r8)
            if (r9 == 0) goto L_0x00ac
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00aa:
            r8 = r36
        L_0x00ac:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r1 = r1 | r9
            goto L_0x00b2
        L_0x00b0:
            r8 = r36
        L_0x00b2:
            r14 = r12 & 64
            r9 = 1572864(0x180000, float:2.204052E-39)
            if (r14 == 0) goto L_0x00bc
            r1 = r1 | r9
        L_0x00b9:
            r9 = r37
            goto L_0x00ce
        L_0x00bc:
            r9 = r9 & r11
            if (r9 != 0) goto L_0x00b9
            r9 = r37
            boolean r16 = r15.W(r9)
            if (r16 == 0) goto L_0x00ca
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r1 = r1 | r16
        L_0x00ce:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00d9
            r1 = r1 | r17
            r9 = r38
            goto L_0x00ec
        L_0x00d9:
            r17 = r11 & r17
            r9 = r38
            if (r17 != 0) goto L_0x00ec
            boolean r17 = r15.W(r9)
            if (r17 == 0) goto L_0x00e8
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r1 = r1 | r17
        L_0x00ec:
            r9 = r12 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r9 == 0) goto L_0x00f9
            r1 = r1 | r17
        L_0x00f4:
            r17 = r9
            r9 = r39
            goto L_0x010e
        L_0x00f9:
            r17 = r11 & r17
            if (r17 != 0) goto L_0x00f4
            r17 = r9
            r9 = r39
            boolean r18 = r15.W(r9)
            if (r18 == 0) goto L_0x010a
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010c
        L_0x010a:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010c:
            r1 = r1 | r18
        L_0x010e:
            r3 = r12 & 512(0x200, float:7.175E-43)
            r18 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0117
            r1 = r1 | r18
            goto L_0x0127
        L_0x0117:
            r3 = r11 & r18
            if (r3 != 0) goto L_0x0127
            boolean r3 = r15.l(r10)
            if (r3 == 0) goto L_0x0124
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0126
        L_0x0124:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0126:
            r1 = r1 | r3
        L_0x0127:
            r3 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r3 & r1
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 == r5) goto L_0x0132
            r3 = 1
            goto L_0x0133
        L_0x0132:
            r3 = 0
        L_0x0133:
            r5 = r1 & 1
            boolean r3 = r15.E(r3, r5)
            if (r3 == 0) goto L_0x02e0
            r15.p()
            r3 = r11 & 1
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = -57345(0xffffffffffff1fff, float:NaN)
            r9 = 6
            if (r3 == 0) goto L_0x0174
            boolean r3 = r15.J()
            if (r3 == 0) goto L_0x0150
            goto L_0x0174
        L_0x0150:
            r15.B()
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0159
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0159:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x015e
            r1 = r1 & r5
        L_0x015e:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0164
            r1 = r1 & r18
        L_0x0164:
            r0 = r32
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r1
            r19 = r9
            r11 = 0
            r1 = r33
            goto L_0x01f7
        L_0x0174:
            if (r2 == 0) goto L_0x017b
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r21 = r2
            goto L_0x017d
        L_0x017b:
            r21 = r32
        L_0x017d:
            if (r4 == 0) goto L_0x0182
            r22 = 1
            goto L_0x0184
        L_0x0182:
            r22 = r33
        L_0x0184:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0193
            androidx.compose.material3.ButtonDefaults r2 = androidx.compose.material3.ButtonDefaults.f9301a
            androidx.compose.ui.graphics.Shape r2 = r2.j(r15, r9)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r23 = r2
            goto L_0x0195
        L_0x0193:
            r23 = r6
        L_0x0195:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x01a5
            androidx.compose.material3.ButtonDefaults r2 = androidx.compose.material3.ButtonDefaults.f9301a
            androidx.compose.material3.ButtonColors r2 = r2.a(r15, r9)
            r1 = r1 & r5
            r25 = r1
            r24 = r2
            goto L_0x01a9
        L_0x01a5:
            r25 = r1
            r24 = r7
        L_0x01a9:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x01c7
            androidx.compose.material3.ButtonDefaults r1 = androidx.compose.material3.ButtonDefaults.f9301a
            r8 = 196608(0x30000, float:2.75506E-40)
            r26 = 31
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = r15
            r19 = r9
            r11 = 0
            r9 = r26
            androidx.compose.material3.ButtonElevation r1 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r25 & r18
            r8 = r1
            r1 = r2
            goto L_0x01cc
        L_0x01c7:
            r19 = r9
            r11 = 0
            r1 = r25
        L_0x01cc:
            if (r14 == 0) goto L_0x01d0
            r2 = 0
            goto L_0x01d2
        L_0x01d0:
            r2 = r37
        L_0x01d2:
            if (r0 == 0) goto L_0x01db
            androidx.compose.material3.ButtonDefaults r0 = androidx.compose.material3.ButtonDefaults.f9301a
            androidx.compose.foundation.layout.PaddingValues r0 = r0.d()
            goto L_0x01dd
        L_0x01db:
            r0 = r38
        L_0x01dd:
            if (r17 == 0) goto L_0x01eb
            r3 = r0
            r5 = r1
            r0 = r21
            r1 = r22
            r6 = r23
            r7 = r24
            r4 = 0
            goto L_0x01f7
        L_0x01eb:
            r4 = r39
            r3 = r0
            r5 = r1
            r0 = r21
            r1 = r22
            r6 = r23
            r7 = r24
        L_0x01f7:
            r15.U()
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0209
            r9 = -1
            java.lang.String r14 = "androidx.compose.material3.Button (Button.kt:121)"
            r11 = -1310015664(0xffffffffb1eabf50, float:-6.832046E-9)
            androidx.compose.runtime.ComposerKt.Y(r11, r5, r9, r14)
        L_0x0209:
            if (r4 != 0) goto L_0x022a
            r9 = 1691738187(0x64d5e04b, float:3.1562548E22)
            r15.X(r9)
            java.lang.Object r9 = r15.g()
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r9 != r11) goto L_0x0224
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r15.N(r9)
        L_0x0224:
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = (androidx.compose.foundation.interaction.MutableInteractionSource) r9
            r15.M()
            goto L_0x0234
        L_0x022a:
            r9 = -499617780(0xffffffffe238700c, float:-8.505687E20)
            r15.X(r9)
            r15.M()
            r9 = r4
        L_0x0234:
            long r17 = r7.a(r1)
            long r11 = r7.b(r1)
            if (r8 != 0) goto L_0x024b
            r14 = 1691921830(0x64d8ada6, float:3.1976075E22)
            r15.X(r14)
            r15.M()
            r32 = r4
            r4 = 0
            goto L_0x0263
        L_0x024b:
            r14 = -499611205(0xffffffffe23889bb, float:-8.5103136E20)
            r15.X(r14)
            int r14 = r5 >> 6
            r14 = r14 & 14
            r32 = r4
            int r4 = r5 >> 9
            r4 = r4 & 896(0x380, float:1.256E-42)
            r4 = r4 | r14
            androidx.compose.runtime.State r4 = r8.e(r1, r9, r15, r4)
            r15.M()
        L_0x0263:
            if (r4 == 0) goto L_0x0272
            java.lang.Object r4 = r4.getValue()
            androidx.compose.ui.unit.Dp r4 = (androidx.compose.ui.unit.Dp) r4
            float r4 = r4.t()
        L_0x026f:
            r22 = r4
            goto L_0x0279
        L_0x0272:
            r4 = 0
            float r14 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r14)
            goto L_0x026f
        L_0x0279:
            java.lang.Object r4 = r15.g()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r4 != r14) goto L_0x028d
            androidx.compose.material3.Y r4 = new androidx.compose.material3.Y
            r4.<init>()
            r15.N(r4)
        L_0x028d:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r30 = r7
            r33 = r8
            r7 = 1
            r8 = 0
            r14 = 0
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r0, r14, r4, r7, r8)
            androidx.compose.material3.ButtonKt$Button$2 r4 = new androidx.compose.material3.ButtonKt$Button$2
            r4.<init>(r11, r3, r10)
            r8 = 54
            r34 = r0
            r0 = -535639973(0xffffffffe012c85b, float:-4.2307215E19)
            androidx.compose.runtime.internal.ComposableLambda r25 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r7, r4, r15, r8)
            r0 = r5 & 8078(0x1f8e, float:1.132E-41)
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            int r5 = r5 << 6
            r4 = r4 & r5
            r27 = r0 | r4
            r28 = 6
            r29 = 64
            r21 = 0
            r13 = r31
            r0 = r15
            r15 = r1
            r16 = r6
            r19 = r11
            r23 = r2
            r24 = r9
            r26 = r0
            androidx.compose.material3.SurfaceKt.e(r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x02d3
            androidx.compose.runtime.ComposerKt.X()
        L_0x02d3:
            r9 = r32
            r7 = r2
            r8 = r3
            r4 = r6
            r5 = r30
            r6 = r33
            r2 = r34
            r3 = r1
            goto L_0x02f1
        L_0x02e0:
            r0 = r15
            r0.B()
            r2 = r32
            r3 = r33
            r9 = r39
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r37
            r8 = r38
        L_0x02f1:
            androidx.compose.runtime.ScopeUpdateScope r13 = r0.x()
            if (r13 == 0) goto L_0x0308
            androidx.compose.material3.Z r14 = new androidx.compose.material3.Z
            r0 = r14
            r1 = r31
            r10 = r40
            r11 = r42
            r12 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0308:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonKt.d(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ButtonColors, androidx.compose.material3.ButtonElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.s0(semanticsPropertyReceiver, Role.f18040b.a());
        return Unit.f40552a;
    }

    public static final Unit f(Function0 function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i2, int i3, Composer composer, int i4) {
        d(function0, modifier, z2, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(kotlin.jvm.functions.Function0 r27, androidx.compose.ui.Modifier r28, boolean r29, androidx.compose.ui.graphics.Shape r30, androidx.compose.material3.ButtonColors r31, androidx.compose.material3.ButtonElevation r32, androidx.compose.foundation.BorderStroke r33, androidx.compose.foundation.layout.PaddingValues r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, kotlin.jvm.functions.Function3 r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r11 = r38
            r12 = r39
            r0 = -1061374109(0xffffffffc0bcb763, float:-5.897386)
            r1 = r37
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r11 | 6
            r3 = r2
            r2 = r27
            goto L_0x002b
        L_0x0017:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r27
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r11
            goto L_0x002b
        L_0x0028:
            r2 = r27
            r3 = r11
        L_0x002b:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r28
            goto L_0x0046
        L_0x0034:
            r5 = r11 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r28
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r29
            goto L_0x0061
        L_0x004f:
            r7 = r11 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r29
            boolean r8 = r1.d(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r11 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x007a
            r8 = r12 & 8
            if (r8 != 0) goto L_0x0074
            r8 = r30
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x0076
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0074:
            r8 = r30
        L_0x0076:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r9
            goto L_0x007c
        L_0x007a:
            r8 = r30
        L_0x007c:
            r9 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0095
            r9 = r12 & 16
            if (r9 != 0) goto L_0x008f
            r9 = r31
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x0091
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r9 = r31
        L_0x0091:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r3 = r3 | r10
            goto L_0x0097
        L_0x0095:
            r9 = r31
        L_0x0097:
            r10 = r12 & 32
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r10 == 0) goto L_0x00a1
            r3 = r3 | r13
        L_0x009e:
            r13 = r32
            goto L_0x00b2
        L_0x00a1:
            r13 = r13 & r11
            if (r13 != 0) goto L_0x009e
            r13 = r32
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x00af
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r14
        L_0x00b2:
            r14 = r12 & 64
            r15 = 1572864(0x180000, float:2.204052E-39)
            if (r14 == 0) goto L_0x00bc
            r3 = r3 | r15
        L_0x00b9:
            r15 = r33
            goto L_0x00ce
        L_0x00bc:
            r15 = r15 & r11
            if (r15 != 0) goto L_0x00b9
            r15 = r33
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00ca
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r3 = r3 | r16
        L_0x00ce:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00d9
            r3 = r3 | r17
            r2 = r34
            goto L_0x00ec
        L_0x00d9:
            r17 = r11 & r17
            r2 = r34
            if (r17 != 0) goto L_0x00ec
            boolean r17 = r1.W(r2)
            if (r17 == 0) goto L_0x00e8
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r3 = r3 | r17
        L_0x00ec:
            r2 = r12 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00f7
            r3 = r3 | r17
            r5 = r35
            goto L_0x010a
        L_0x00f7:
            r17 = r11 & r17
            r5 = r35
            if (r17 != 0) goto L_0x010a
            boolean r17 = r1.W(r5)
            if (r17 == 0) goto L_0x0106
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0108
        L_0x0106:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0108:
            r3 = r3 | r17
        L_0x010a:
            r5 = r12 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r5 == 0) goto L_0x0115
            r3 = r3 | r17
        L_0x0112:
            r5 = r36
            goto L_0x0128
        L_0x0115:
            r5 = r11 & r17
            if (r5 != 0) goto L_0x0112
            r5 = r36
            boolean r17 = r1.l(r5)
            if (r17 == 0) goto L_0x0124
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0126
        L_0x0124:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0126:
            r3 = r3 | r17
        L_0x0128:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r3 & r17
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = 1
            if (r5 == r7) goto L_0x0137
            r5 = r17
            goto L_0x0138
        L_0x0137:
            r5 = 0
        L_0x0138:
            r7 = r3 & 1
            boolean r5 = r1.E(r5, r7)
            if (r5 == 0) goto L_0x01fe
            r1.p()
            r5 = r11 & 1
            r7 = -57345(0xffffffffffff1fff, float:NaN)
            if (r5 == 0) goto L_0x016e
            boolean r5 = r1.J()
            if (r5 == 0) goto L_0x0151
            goto L_0x016e
        L_0x0151:
            r1.B()
            r0 = r12 & 8
            if (r0 == 0) goto L_0x015a
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x015a:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x015f
            r3 = r3 & r7
        L_0x015f:
            r4 = r28
            r0 = r29
            r7 = r34
            r5 = r8
            r6 = r9
            r2 = r13
            r8 = r35
            r9 = r3
            r3 = r15
            goto L_0x01b9
        L_0x016e:
            if (r4 == 0) goto L_0x0173
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0175
        L_0x0173:
            r4 = r28
        L_0x0175:
            if (r6 == 0) goto L_0x0178
            goto L_0x017a
        L_0x0178:
            r17 = r29
        L_0x017a:
            r5 = r12 & 8
            r6 = 6
            if (r5 == 0) goto L_0x0188
            androidx.compose.material3.ButtonDefaults r5 = androidx.compose.material3.ButtonDefaults.f9301a
            androidx.compose.ui.graphics.Shape r5 = r5.l(r1, r6)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0189
        L_0x0188:
            r5 = r8
        L_0x0189:
            r8 = r12 & 16
            if (r8 == 0) goto L_0x0195
            androidx.compose.material3.ButtonDefaults r8 = androidx.compose.material3.ButtonDefaults.f9301a
            androidx.compose.material3.ButtonColors r6 = r8.m(r1, r6)
            r3 = r3 & r7
            goto L_0x0196
        L_0x0195:
            r6 = r9
        L_0x0196:
            r7 = 0
            if (r10 == 0) goto L_0x019a
            r13 = r7
        L_0x019a:
            if (r14 == 0) goto L_0x019d
            r15 = r7
        L_0x019d:
            if (r0 == 0) goto L_0x01a6
            androidx.compose.material3.ButtonDefaults r0 = androidx.compose.material3.ButtonDefaults.f9301a
            androidx.compose.foundation.layout.PaddingValues r0 = r0.k()
            goto L_0x01a8
        L_0x01a6:
            r0 = r34
        L_0x01a8:
            if (r2 == 0) goto L_0x01b2
            r9 = r3
            r8 = r7
            r2 = r13
            r3 = r15
            r7 = r0
        L_0x01af:
            r0 = r17
            goto L_0x01b9
        L_0x01b2:
            r8 = r35
            r7 = r0
            r9 = r3
            r2 = r13
            r3 = r15
            goto L_0x01af
        L_0x01b9:
            r1.U()
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x01cb
            r10 = -1
            java.lang.String r13 = "androidx.compose.material3.TextButton (Button.kt:429)"
            r14 = -1061374109(0xffffffffc0bcb763, float:-5.897386)
            androidx.compose.runtime.ComposerKt.Y(r14, r9, r10, r13)
        L_0x01cb:
            r10 = 2147483646(0x7ffffffe, float:NaN)
            r24 = r9 & r10
            r25 = 0
            r13 = r27
            r14 = r4
            r15 = r0
            r16 = r5
            r17 = r6
            r18 = r2
            r19 = r3
            r20 = r7
            r21 = r8
            r22 = r36
            r23 = r1
            d(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x01f2
            androidx.compose.runtime.ComposerKt.X()
        L_0x01f2:
            r9 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r26 = r6
            r6 = r2
            r2 = r4
            r4 = r5
            r5 = r26
            goto L_0x020d
        L_0x01fe:
            r1.B()
            r2 = r28
            r3 = r29
            r4 = r8
            r5 = r9
            r6 = r13
            r7 = r15
            r8 = r34
            r9 = r35
        L_0x020d:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x0224
            androidx.compose.material3.a0 r14 = new androidx.compose.material3.a0
            r0 = r14
            r1 = r27
            r10 = r36
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0224:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonKt.g(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ButtonColors, androidx.compose.material3.ButtonElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit h(Function0 function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i2, int i3, Composer composer, int i4) {
        g(function0, modifier, z2, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
