package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

@Metadata
public final class CardKt {
    public static final void c(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3 function3, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        BorderStroke borderStroke3;
        CardElevation cardElevation3;
        Shape shape3;
        Modifier modifier3;
        BorderStroke borderStroke4;
        int i5;
        CardColors cardColors3;
        CardElevation cardElevation4;
        CardElevation cardElevation5;
        int i6;
        int i7;
        int i8;
        Function3 function32 = function3;
        int i9 = i2;
        Composer q2 = composer.q(1359693790);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i9 | 6;
            modifier2 = modifier;
        } else if ((i9 & 6) == 0) {
            modifier2 = modifier;
            i4 = (q2.W(modifier2) ? 4 : 2) | i9;
        } else {
            modifier2 = modifier;
            i4 = i9;
        }
        if ((i9 & 48) == 0) {
            if ((i3 & 2) == 0) {
                shape2 = shape;
                if (q2.W(shape2)) {
                    i8 = 32;
                    i4 |= i8;
                }
            } else {
                shape2 = shape;
            }
            i8 = 16;
            i4 |= i8;
        } else {
            shape2 = shape;
        }
        if ((i9 & 384) == 0) {
            if ((i3 & 4) == 0) {
                cardColors2 = cardColors;
                if (q2.W(cardColors2)) {
                    i7 = 256;
                    i4 |= i7;
                }
            } else {
                cardColors2 = cardColors;
            }
            i7 = 128;
            i4 |= i7;
        } else {
            cardColors2 = cardColors;
        }
        if ((i9 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                cardElevation2 = cardElevation;
                if (q2.W(cardElevation2)) {
                    i6 = 2048;
                    i4 |= i6;
                }
            } else {
                cardElevation2 = cardElevation;
            }
            i6 = 1024;
            i4 |= i6;
        } else {
            cardElevation2 = cardElevation;
        }
        int i11 = i3 & 16;
        if (i11 != 0) {
            i4 |= 24576;
            borderStroke2 = borderStroke;
        } else {
            borderStroke2 = borderStroke;
            if ((i9 & 24576) == 0) {
                i4 |= q2.W(borderStroke2) ? 16384 : 8192;
            }
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i9 & 196608) == 0) {
            i4 |= q2.l(function32) ? 131072 : 65536;
        }
        if (q2.E((74899 & i4) != 74898, i4 & 1)) {
            q2.p();
            if ((i9 & 1) == 0 || q2.J()) {
                modifier3 = i10 != 0 ? Modifier.f15489d : modifier2;
                if ((i3 & 2) != 0) {
                    shape3 = CardDefaults.f9356a.e(q2, 6);
                    i4 &= -113;
                } else {
                    shape3 = shape2;
                }
                if ((i3 & 4) != 0) {
                    cardColors3 = CardDefaults.f9356a.a(q2, 6);
                    i4 &= -897;
                } else {
                    cardColors3 = cardColors2;
                }
                if ((i3 & 8) != 0) {
                    cardElevation5 = CardDefaults.f9356a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, q2, 1572864, 63);
                    i4 &= -7169;
                } else {
                    cardElevation5 = cardElevation2;
                }
                borderStroke4 = i11 != 0 ? null : borderStroke;
                CardElevation cardElevation6 = cardElevation5;
                i5 = i4;
                cardElevation4 = cardElevation6;
            } else {
                q2.B();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                modifier3 = modifier2;
                shape3 = shape2;
                cardColors3 = cardColors2;
                borderStroke4 = borderStroke2;
                i5 = i4;
                cardElevation4 = cardElevation2;
            }
            q2.U();
            if (ComposerKt.P()) {
                ComposerKt.Y(1359693790, i5, -1, "androidx.compose.material3.Card (Card.kt:86)");
            }
            CardElevation cardElevation7 = cardElevation4;
            SurfaceKt.c(modifier3, shape3, cardColors3.a(true), cardColors3.b(true), 0.0f, ((Dp) cardElevation4.f(true, (InteractionSource) null, q2, ((i5 >> 3) & 896) | 54).getValue()).t(), borderStroke4, ComposableLambdaKt.e(-97109725, true, new CardKt$Card$1(function32), q2, 54), q2, (i5 & 14) | 12582912 | (i5 & 112) | (3670016 & (i5 << 6)), 16);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            cardColors2 = cardColors3;
            borderStroke3 = borderStroke4;
            cardElevation3 = cardElevation7;
        } else {
            q2.B();
            modifier3 = modifier2;
            shape3 = shape2;
            cardElevation3 = cardElevation2;
            borderStroke3 = borderStroke;
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0053b0(modifier3, shape3, cardColors2, cardElevation3, borderStroke3, function3, i2, i3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, boolean r32, androidx.compose.ui.graphics.Shape r33, androidx.compose.material3.CardColors r34, androidx.compose.material3.CardElevation r35, androidx.compose.foundation.BorderStroke r36, androidx.compose.foundation.interaction.MutableInteractionSource r37, kotlin.jvm.functions.Function3 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r9 = r38
            r10 = r40
            r11 = r41
            r0 = 2136075085(0x7f51eb4d, float:2.790304E38)
            r1 = r39
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r10 | 6
            r3 = r2
            r2 = r30
            goto L_0x002d
        L_0x0019:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r30
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r10
            goto L_0x002d
        L_0x002a:
            r2 = r30
            r3 = r10
        L_0x002d:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
        L_0x0033:
            r5 = r31
            goto L_0x0048
        L_0x0036:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r31
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
        L_0x0048:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r7 = r32
            goto L_0x0063
        L_0x0051:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004e
            r7 = r32
            boolean r8 = r1.d(r7)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r8
        L_0x0063:
            r8 = r10 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x007c
            r8 = r11 & 8
            if (r8 != 0) goto L_0x0076
            r8 = r33
            boolean r12 = r1.W(r8)
            if (r12 == 0) goto L_0x0078
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0076:
            r8 = r33
        L_0x0078:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r3 = r3 | r12
            goto L_0x007e
        L_0x007c:
            r8 = r33
        L_0x007e:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0097
            r12 = r11 & 16
            if (r12 != 0) goto L_0x0091
            r12 = r34
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0093
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0091:
            r12 = r34
        L_0x0093:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r3 = r3 | r13
            goto L_0x0099
        L_0x0097:
            r12 = r34
        L_0x0099:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00b3
            r13 = r11 & 32
            if (r13 != 0) goto L_0x00ad
            r13 = r35
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x00af
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00ad:
            r13 = r35
        L_0x00af:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r14
            goto L_0x00b5
        L_0x00b3:
            r13 = r35
        L_0x00b5:
            r22 = r11 & 64
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r22 == 0) goto L_0x00bf
            r3 = r3 | r14
            r15 = r36
            goto L_0x00d0
        L_0x00bf:
            r14 = r14 & r10
            r15 = r36
            if (r14 != 0) goto L_0x00d0
            boolean r14 = r1.W(r15)
            if (r14 == 0) goto L_0x00cd
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r3 = r3 | r14
        L_0x00d0:
            r14 = r11 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r14 == 0) goto L_0x00db
            r3 = r3 | r16
            r0 = r37
            goto L_0x00ee
        L_0x00db:
            r16 = r10 & r16
            r0 = r37
            if (r16 != 0) goto L_0x00ee
            boolean r16 = r1.W(r0)
            if (r16 == 0) goto L_0x00ea
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r3 = r3 | r16
        L_0x00ee:
            r0 = r11 & 256(0x100, float:3.59E-43)
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f7
            r3 = r3 | r16
            goto L_0x0107
        L_0x00f7:
            r0 = r10 & r16
            if (r0 != 0) goto L_0x0107
            boolean r0 = r1.l(r9)
            if (r0 == 0) goto L_0x0104
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0104:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0106:
            r3 = r3 | r0
        L_0x0107:
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r0 & r3
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 == r2) goto L_0x0112
            r0 = 1
            goto L_0x0113
        L_0x0112:
            r0 = 0
        L_0x0113:
            r2 = r3 & 1
            boolean r0 = r1.E(r0, r2)
            if (r0 == 0) goto L_0x024a
            r1.p()
            r0 = r10 & 1
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 6
            if (r0 == 0) goto L_0x0150
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0130
            goto L_0x0150
        L_0x0130:
            r1.B()
            r0 = r11 & 8
            if (r0 == 0) goto L_0x0139
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0139:
            r0 = r11 & 16
            if (r0 == 0) goto L_0x013f
            r3 = r3 & r16
        L_0x013f:
            r0 = r11 & 32
            if (r0 == 0) goto L_0x0144
            r3 = r3 & r2
        L_0x0144:
            r2 = r36
            r0 = r12
            r6 = r13
            r25 = r15
            r4 = 1
        L_0x014b:
            r12 = r3
            r3 = r37
            goto L_0x01ae
        L_0x0150:
            if (r4 == 0) goto L_0x0155
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r5 = r0
        L_0x0155:
            if (r6 == 0) goto L_0x0158
            r7 = 1
        L_0x0158:
            r0 = r11 & 8
            if (r0 == 0) goto L_0x0165
            androidx.compose.material3.CardDefaults r0 = androidx.compose.material3.CardDefaults.f9356a
            androidx.compose.ui.graphics.Shape r0 = r0.e(r1, r15)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r0
        L_0x0165:
            r0 = r11 & 16
            if (r0 == 0) goto L_0x0172
            androidx.compose.material3.CardDefaults r0 = androidx.compose.material3.CardDefaults.f9356a
            androidx.compose.material3.CardColors r0 = r0.a(r1, r15)
            r3 = r3 & r16
            goto L_0x0173
        L_0x0172:
            r0 = r12
        L_0x0173:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0196
            androidx.compose.material3.CardDefaults r12 = androidx.compose.material3.CardDefaults.f9356a
            r20 = 1572864(0x180000, float:2.204052E-39)
            r21 = 63
            r13 = 0
            r4 = 0
            r6 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r24 = r14
            r14 = r4
            r25 = r15
            r4 = 1
            r15 = r6
            r19 = r1
            androidx.compose.material3.CardElevation r6 = r12.c(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = r2 & r3
            r3 = r2
            goto L_0x019c
        L_0x0196:
            r24 = r14
            r25 = r15
            r4 = 1
            r6 = r13
        L_0x019c:
            r2 = 0
            if (r22 == 0) goto L_0x01a1
            r12 = r2
            goto L_0x01a3
        L_0x01a1:
            r12 = r36
        L_0x01a3:
            if (r24 == 0) goto L_0x01ac
            r29 = r3
            r3 = r2
            r2 = r12
            r12 = r29
            goto L_0x01ae
        L_0x01ac:
            r2 = r12
            goto L_0x014b
        L_0x01ae:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x01c0
            r13 = -1
            java.lang.String r14 = "androidx.compose.material3.Card (Card.kt:145)"
            r15 = 2136075085(0x7f51eb4d, float:2.790304E38)
            androidx.compose.runtime.ComposerKt.Y(r15, r12, r13, r14)
        L_0x01c0:
            if (r3 != 0) goto L_0x01e2
            r13 = 1577885006(0x5e0c9d4e, float:2.53308512E18)
            r1.X(r13)
            java.lang.Object r13 = r1.g()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r13 != r14) goto L_0x01db
            androidx.compose.foundation.interaction.MutableInteractionSource r13 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r1.N(r13)
        L_0x01db:
            androidx.compose.foundation.interaction.MutableInteractionSource r13 = (androidx.compose.foundation.interaction.MutableInteractionSource) r13
            r1.M()
            r15 = r13
            goto L_0x01ec
        L_0x01e2:
            r13 = -226195799(0xfffffffff28486a9, float:-5.2498964E30)
            r1.X(r13)
            r1.M()
            r15 = r3
        L_0x01ec:
            long r16 = r0.a(r7)
            long r18 = r0.b(r7)
            int r13 = r12 >> 6
            r13 = r13 & 14
            int r14 = r12 >> 9
            r14 = r14 & 896(0x380, float:1.256E-42)
            r13 = r13 | r14
            androidx.compose.runtime.State r13 = r6.f(r7, r15, r1, r13)
            java.lang.Object r13 = r13.getValue()
            androidx.compose.ui.unit.Dp r13 = (androidx.compose.ui.unit.Dp) r13
            float r21 = r13.t()
            androidx.compose.material3.CardKt$Card$3 r13 = new androidx.compose.material3.CardKt$Card$3
            r13.<init>(r9)
            r14 = 54
            r31 = r0
            r0 = -1347531112(0xffffffffafae4e98, float:-3.170626E-10)
            androidx.compose.runtime.internal.ComposableLambda r24 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r4, r13, r1, r14)
            r0 = r12 & 8190(0x1ffe, float:1.1477E-41)
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            int r12 = r12 << 6
            r4 = r4 & r12
            r26 = r0 | r4
            r27 = 6
            r28 = 64
            r20 = 0
            r12 = r30
            r13 = r5
            r14 = r7
            r0 = r15
            r15 = r8
            r22 = r2
            r23 = r0
            r25 = r1
            androidx.compose.material3.SurfaceKt.e(r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0242
            androidx.compose.runtime.ComposerKt.X()
        L_0x0242:
            r4 = r8
            r8 = r3
            r3 = r7
            r7 = r2
            r2 = r5
            r5 = r31
            goto L_0x0256
        L_0x024a:
            r1.B()
            r2 = r5
            r3 = r7
            r4 = r8
            r5 = r12
            r6 = r13
            r7 = r36
            r8 = r37
        L_0x0256:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x026d
            androidx.compose.material3.c0 r13 = new androidx.compose.material3.c0
            r0 = r13
            r1 = r30
            r9 = r38
            r10 = r40
            r11 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.d(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit e(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3 function3, int i2, int i3, Composer composer, int i4) {
        c(modifier, shape, cardColors, cardElevation, borderStroke, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit f(Function0 function0, Modifier modifier, boolean z2, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function3 function3, int i2, int i3, Composer composer, int i4) {
        d(function0, modifier, z2, shape, cardColors, cardElevation, borderStroke, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
