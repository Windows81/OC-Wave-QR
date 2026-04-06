package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.progress.AbtCircularProgressIndicatorKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.StringExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AbtButtonKt {
    public static final BorderStroke C(AbtButtonStyle abtButtonStyle, AbtButtonState abtButtonState, Composer composer, int i2) {
        BorderStroke borderStroke;
        composer.X(-803743124);
        if (ComposerKt.P()) {
            ComposerKt.Y(-803743124, i2, -1, "com.hansecom.abt.ui.components.abtButton.buttonBorder (AbtButton.kt:102)");
        }
        if (!Float.isNaN(abtButtonStyle.b())) {
            borderStroke = BorderStrokeKt.a(abtButtonStyle.b(), abtButtonState == AbtButtonState.Enabled ? abtButtonStyle.a() : Color.l(abtButtonStyle.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
        } else {
            borderStroke = null;
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return borderStroke;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: androidx.compose.material3.ButtonColors} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: androidx.compose.material3.ButtonColors} */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(kotlin.jvm.functions.Function0 r35, androidx.compose.ui.Modifier r36, com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r37, com.hansecom.abt.ui.components.abtButton.AbtButtonState r38, java.lang.String r39, java.lang.Integer r40, com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            r13 = r35
            r14 = r43
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            r0 = 1444312219(0x5616749b, float:4.135689E13)
            r1 = r42
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r44 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r14 | 6
            goto L_0x0029
        L_0x0019:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0028
            boolean r1 = r15.l(r13)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            r1 = r1 | r14
            goto L_0x0029
        L_0x0028:
            r1 = r14
        L_0x0029:
            r3 = r44 & 2
            if (r3 == 0) goto L_0x0032
            r1 = r1 | 48
        L_0x002f:
            r4 = r36
            goto L_0x0044
        L_0x0032:
            r4 = r14 & 48
            if (r4 != 0) goto L_0x002f
            r4 = r36
            boolean r5 = r15.W(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r1 = r1 | r5
        L_0x0044:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x005d
            r5 = r44 & 4
            if (r5 != 0) goto L_0x0057
            r5 = r37
            boolean r6 = r15.W(r5)
            if (r6 == 0) goto L_0x0059
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r5 = r37
        L_0x0059:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r6
            goto L_0x005f
        L_0x005d:
            r5 = r37
        L_0x005f:
            r6 = r44 & 8
            if (r6 == 0) goto L_0x0068
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r7 = r38
            goto L_0x007a
        L_0x0068:
            r7 = r14 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0065
            r7 = r38
            boolean r8 = r15.W(r7)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r8
        L_0x007a:
            r8 = r44 & 16
            if (r8 == 0) goto L_0x0083
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r9 = r39
            goto L_0x0095
        L_0x0083:
            r9 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0080
            r9 = r39
            boolean r10 = r15.W(r9)
            if (r10 == 0) goto L_0x0092
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r1 = r1 | r10
        L_0x0095:
            r10 = r44 & 32
            r11 = 196608(0x30000, float:2.75506E-40)
            if (r10 == 0) goto L_0x009f
            r1 = r1 | r11
        L_0x009c:
            r11 = r40
            goto L_0x00b0
        L_0x009f:
            r11 = r11 & r14
            if (r11 != 0) goto L_0x009c
            r11 = r40
            boolean r12 = r15.W(r11)
            if (r12 == 0) goto L_0x00ad
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r1 = r1 | r12
        L_0x00b0:
            r12 = r44 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r12 == 0) goto L_0x00bb
            r1 = r1 | r16
            r2 = r41
            goto L_0x00ce
        L_0x00bb:
            r16 = r14 & r16
            r2 = r41
            if (r16 != 0) goto L_0x00ce
            boolean r16 = r15.W(r2)
            if (r16 == 0) goto L_0x00ca
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r1 = r1 | r16
        L_0x00ce:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r1 & r16
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r2) goto L_0x00eb
            boolean r0 = r15.t()
            if (r0 != 0) goto L_0x00df
            goto L_0x00eb
        L_0x00df:
            r15.B()
            r2 = r4
            r3 = r5
            r4 = r7
            r5 = r9
            r6 = r11
            r7 = r41
            goto L_0x02b6
        L_0x00eb:
            r15.p()
            r0 = r14 & 1
            r2 = 0
            if (r0 == 0) goto L_0x010e
            boolean r0 = r15.J()
            if (r0 == 0) goto L_0x00fa
            goto L_0x010e
        L_0x00fa:
            r15.B()
            r0 = r44 & 4
            if (r0 == 0) goto L_0x0103
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0103:
            r19 = r41
            r12 = r4
            r10 = r7
            r16 = r9
            r18 = r11
            r4 = 0
            r11 = r5
            goto L_0x0146
        L_0x010e:
            if (r3 == 0) goto L_0x0113
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0114
        L_0x0113:
            r0 = r4
        L_0x0114:
            r3 = r44 & 4
            if (r3 == 0) goto L_0x0127
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r3 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            r4 = 6
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r3 = r3.a(r15, r4)
            r4 = 0
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r3 = r3.c(r15, r4)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0129
        L_0x0127:
            r4 = 0
            r3 = r5
        L_0x0129:
            if (r6 == 0) goto L_0x012e
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r5 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            r7 = r5
        L_0x012e:
            if (r8 == 0) goto L_0x0131
            r9 = r2
        L_0x0131:
            if (r10 == 0) goto L_0x0134
            r11 = r2
        L_0x0134:
            if (r12 == 0) goto L_0x0142
            com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition r5 = com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition.Start
            r12 = r0
            r19 = r5
        L_0x013b:
            r10 = r7
            r16 = r9
            r18 = r11
            r11 = r3
            goto L_0x0146
        L_0x0142:
            r19 = r41
            r12 = r0
            goto L_0x013b
        L_0x0146:
            r15.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0158
            r0 = -1
            java.lang.String r3 = "com.hansecom.abt.ui.components.abtButton.AbtButton (AbtButton.kt:48)"
            r5 = 1444312219(0x5616749b, float:4.135689E13)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r0, r3)
        L_0x0158:
            r0 = -1277872284(0xffffffffb3d53764, float:-9.928661E-8)
            r15.X(r0)
            java.lang.Object r0 = r15.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r3.a()
            if (r0 != r5) goto L_0x017c
            androidx.compose.ui.unit.DpSize$Companion r0 = androidx.compose.ui.unit.DpSize.f19156b
            long r5 = r0.b()
            androidx.compose.ui.unit.DpSize r0 = androidx.compose.ui.unit.DpSize.c(r5)
            r5 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r0, r2, r5, r2)
            r15.N(r0)
        L_0x017c:
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            r15.M()
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r5 = r15.C(r5)
            androidx.compose.ui.unit.Density r5 = (androidx.compose.ui.unit.Density) r5
            r6 = -1277868552(0xffffffffb3d545f8, float:-9.931313E-8)
            r15.X(r6)
            java.lang.Object r6 = r15.g()
            java.lang.Object r7 = r3.a()
            if (r6 != r7) goto L_0x01f2
            androidx.compose.material3.ButtonColors r6 = new androidx.compose.material3.ButtonColors
            long r21 = r11.c()
            long r23 = r11.d()
            long r7 = r11.c()
            androidx.compose.ui.graphics.Color$Companion r9 = androidx.compose.ui.graphics.Color.f15975b
            r36 = r5
            long r4 = r9.e()
            boolean r4 = androidx.compose.ui.graphics.Color.n(r7, r4)
            if (r4 == 0) goto L_0x01be
            long r4 = r9.e()
        L_0x01bb:
            r25 = r4
            goto L_0x01d3
        L_0x01be:
            long r25 = r11.c()
            r31 = 14
            r32 = 0
            r27 = 1056964608(0x3f000000, float:0.5)
            r28 = 0
            r29 = 0
            r30 = 0
            long r4 = androidx.compose.ui.graphics.Color.l(r25, r27, r28, r29, r30, r31, r32)
            goto L_0x01bb
        L_0x01d3:
            long r27 = r11.d()
            r33 = 14
            r34 = 0
            r29 = 1056964608(0x3f000000, float:0.5)
            r30 = 0
            r31 = 0
            r32 = 0
            long r27 = androidx.compose.ui.graphics.Color.l(r27, r29, r30, r31, r32, r33, r34)
            r29 = 0
            r20 = r6
            r20.<init>(r21, r23, r25, r27, r29)
            r15.N(r6)
            goto L_0x01f4
        L_0x01f2:
            r36 = r5
        L_0x01f4:
            r4 = r6
            androidx.compose.material3.ButtonColors r4 = (androidx.compose.material3.ButtonColors) r4
            r15.M()
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            long r6 = k(r0)
            androidx.compose.ui.unit.DpSize$Companion r8 = androidx.compose.ui.unit.DpSize.f19156b
            long r8 = r8.b()
            boolean r6 = androidx.compose.ui.unit.DpSize.h(r6, r8)
            r7 = 1
            if (r6 != 0) goto L_0x0216
            long r8 = k(r0)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.u(r12, r8)
            goto L_0x0222
        L_0x0216:
            r6 = 48
            float r6 = (float) r6
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            r8 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.b(r12, r8, r6, r7, r2)
        L_0x0222:
            androidx.compose.ui.Modifier r2 = r5.o0(r2)
            r5 = -1277843980(0xffffffffb3d5a5f4, float:-9.948772E-8)
            r15.X(r5)
            r5 = r36
            boolean r6 = r15.W(r5)
            java.lang.Object r8 = r15.g()
            if (r6 != 0) goto L_0x023e
            java.lang.Object r3 = r3.a()
            if (r8 != r3) goto L_0x0246
        L_0x023e:
            com.hansecom.abt.ui.components.abtButton.f r8 = new com.hansecom.abt.ui.components.abtButton.f
            r8.<init>(r5, r0)
            r15.N(r8)
        L_0x0246:
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r15.M()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.layout.OnRemeasuredModifierKt.a(r2, r8)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r0 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            if (r10 != r0) goto L_0x0256
            r17 = r7
            goto L_0x0258
        L_0x0256:
            r17 = 0
        L_0x0258:
            int r0 = r1 >> 6
            r0 = r0 & 126(0x7e, float:1.77E-43)
            androidx.compose.foundation.BorderStroke r6 = C(r11, r10, r15, r0)
            float r0 = r11.e()
            androidx.compose.foundation.shape.RoundedCornerShape r3 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r0)
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt$AbtButton$2 r0 = new com.hansecom.abt.ui.components.abtButton.AbtButtonKt$AbtButton$2
            r36 = r0
            r37 = r10
            r38 = r16
            r39 = r18
            r40 = r19
            r41 = r11
            r36.<init>(r37, r38, r39, r40, r41)
            r5 = 54
            r8 = 607539339(0x2436508b, float:3.953318E-17)
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r7, r0, r15, r5)
            r0 = r1 & 14
            r1 = 805330944(0x30006000, float:4.6702553E-10)
            r20 = r0 | r1
            r21 = 416(0x1a0, float:5.83E-43)
            r5 = 0
            r7 = 0
            r8 = 0
            r0 = r35
            r1 = r2
            r2 = r17
            r17 = r10
            r10 = r15
            r22 = r11
            r11 = r20
            r20 = r12
            r12 = r21
            androidx.compose.material3.ButtonKt.d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02aa
            androidx.compose.runtime.ComposerKt.X()
        L_0x02aa:
            r5 = r16
            r4 = r17
            r6 = r18
            r7 = r19
            r2 = r20
            r3 = r22
        L_0x02b6:
            androidx.compose.runtime.ScopeUpdateScope r10 = r15.x()
            if (r10 == 0) goto L_0x02cb
            com.hansecom.abt.ui.components.abtButton.g r11 = new com.hansecom.abt.ui.components.abtButton.g
            r0 = r11
            r1 = r35
            r8 = r43
            r9 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x02cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, com.hansecom.abt.ui.components.abtButton.AbtButtonStyle, com.hansecom.abt.ui.components.abtButton.AbtButtonState, java.lang.String, java.lang.Integer, com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final long k(MutableState mutableState) {
        return ((DpSize) mutableState.getValue()).m();
    }

    public static final void l(MutableState mutableState, long j2) {
        mutableState.setValue(DpSize.c(j2));
    }

    public static final Unit m(Density density, MutableState mutableState, IntSize intSize) {
        if (DpSize.h(k(mutableState), DpSize.f19156b.b())) {
            l(mutableState, density.s(IntSizeKt.e(intSize.j())));
        }
        return Unit.f40552a;
    }

    public static final Unit n(Function0 function0, Modifier modifier, AbtButtonStyle abtButtonStyle, AbtButtonState abtButtonState, String str, Integer num, AbtButtonIconPosition abtButtonIconPosition, int i2, int i3, Composer composer, int i4) {
        j(function0, modifier, abtButtonStyle, abtButtonState, str, num, abtButtonIconPosition, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void o(String str, Integer num, AbtButtonIconPosition abtButtonIconPosition, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        String str2 = str;
        Integer num2 = num;
        AbtButtonIconPosition abtButtonIconPosition2 = abtButtonIconPosition;
        int i5 = i2;
        Composer q2 = composer.q(1866112954);
        if ((i5 & 6) == 0) {
            i3 = (q2.W(str2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 48) == 0) {
            i3 |= q2.W(num2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i3 |= q2.W(abtButtonIconPosition2) ? 256 : 128;
        }
        int i6 = i3;
        if ((i6 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1866112954, i6, -1, "com.hansecom.abt.ui.components.abtButton.ButtonContent (AbtButton.kt:124)");
            }
            q2.X(-1903572185);
            if (num2 != null && abtButtonIconPosition2 == AbtButtonIconPosition.Start) {
                Modifier.Companion companion = Modifier.f15489d;
                s(companion.o0(str2 != null ? PaddingKt.m(companion, 0.0f, 0.0f, Dp.m((float) 16), 0.0f, 11, (Object) null) : companion), num.intValue(), q2, i6 & 112);
            }
            q2.M();
            q2.X(-1903561554);
            if (str2 != null) {
                q2.X(-1903560216);
                boolean z2 = (i6 & 14) == 4;
                Object g2 = q2.g();
                if (z2 || g2 == Composer.f14567a.a()) {
                    g2 = StringExtKt.c(str);
                    q2.N(g2);
                }
                q2.M();
                i4 = i6;
                composer2 = q2;
                TextKt.j((String) g2, (Modifier) null, ((Color) q2.C(ContentColorKt.a())).v(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(q2, 6).a(), composer2, 0, 0, 131066);
            } else {
                i4 = i6;
                composer2 = q2;
            }
            composer2.M();
            if (num2 != null && abtButtonIconPosition2 == AbtButtonIconPosition.End) {
                Modifier.Companion companion2 = Modifier.f15489d;
                s(companion2.o0(str2 != null ? PaddingKt.m(companion2, Dp.m((float) 16), 0.0f, 0.0f, 0.0f, 14, (Object) null) : companion2), num.intValue(), composer2, i4 & 112);
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new a(str2, num2, abtButtonIconPosition2, i5));
        }
    }

    public static final Unit p(String str, Integer num, AbtButtonIconPosition abtButtonIconPosition, int i2, Composer composer, int i3) {
        o(str, num, abtButtonIconPosition, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void q(AbtButtonStyle abtButtonStyle, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(1824679437);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(abtButtonStyle) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1824679437, i3, -1, "com.hansecom.abt.ui.components.abtButton.ButtonContentLoading (AbtButton.kt:116)");
            }
            AbtCircularProgressIndicatorKt.e(SizeKt.t(Modifier.f15489d, Dp.m((float) 24)), abtButtonStyle.d(), 0.0f, 0, 0, q2, 6, 28);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new h(abtButtonStyle, i2));
        }
    }

    public static final Unit r(AbtButtonStyle abtButtonStyle, int i2, Composer composer, int i3) {
        q(abtButtonStyle, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void s(Modifier modifier, int i2, Composer composer, int i3) {
        int i4;
        Composer q2 = composer.q(-79176347);
        if ((i3 & 6) == 0) {
            i4 = (q2.W(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= q2.i(i2) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-79176347, i4, -1, "com.hansecom.abt.ui.components.abtButton.ButtonIcon (AbtButton.kt:162)");
            }
            IconKt.d(PainterResources_androidKt.c(i2, q2, (i4 >> 3) & 14), (String) null, SizeKt.t(modifier, Dp.m((float) 24)), ((Color) q2.C(ContentColorKt.a())).v(), q2, 48, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new i(modifier, i2, i3));
        }
    }

    public static final Unit t(Modifier modifier, int i2, int i3, Composer composer, int i4) {
        s(modifier, i2, composer, RecomposeScopeImplKt.a(i3 | 1));
        return Unit.f40552a;
    }

    public static final void u(AbtButtonStyle abtButtonStyle, Composer composer, int i2) {
        int i3;
        AbtButtonStyle abtButtonStyle2 = abtButtonStyle;
        int i4 = i2;
        Composer q2 = composer.q(-207005495);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(abtButtonStyle2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-207005495, i3, -1, "com.hansecom.abt.ui.components.abtButton.PreviewButtons (AbtButton.kt:224)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            int i5 = R.drawable.f32998B;
            AbtButtonState abtButtonState = AbtButtonState.Enabled;
            q2.X(1096598116);
            Object g2 = q2.g();
            Composer.Companion companion2 = Composer.f14567a;
            if (g2 == companion2.a()) {
                g2 = new b();
                q2.N(g2);
            }
            q2.M();
            int i6 = ((i3 << 6) & 896) | 27702;
            int i7 = i6;
            j((Function0) g2, h2, abtButtonStyle, abtButtonState, "Button", Integer.valueOf(i5), (AbtButtonIconPosition) null, q2, i6, 64);
            Modifier h3 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            int i8 = R.drawable.f32998B;
            AbtButtonState abtButtonState2 = AbtButtonState.Loading;
            q2.X(1096605156);
            Object g3 = q2.g();
            if (g3 == companion2.a()) {
                g3 = new c();
                q2.N(g3);
            }
            q2.M();
            j((Function0) g3, h3, abtButtonStyle, abtButtonState2, "Button", Integer.valueOf(i8), (AbtButtonIconPosition) null, q2, i7, 64);
            Modifier h4 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            int i9 = R.drawable.f32998B;
            AbtButtonState abtButtonState3 = AbtButtonState.Disabled;
            q2.X(1096612196);
            Object g4 = q2.g();
            if (g4 == companion2.a()) {
                g4 = new d();
                q2.N(g4);
            }
            q2.M();
            j((Function0) g4, h4, abtButtonStyle, abtButtonState3, "Button", Integer.valueOf(i9), (AbtButtonIconPosition) null, q2, i7, 64);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new e(abtButtonStyle, i4));
        }
    }

    public static final Unit v() {
        return Unit.f40552a;
    }

    public static final Unit w() {
        return Unit.f40552a;
    }

    public static final Unit x() {
        return Unit.f40552a;
    }

    public static final Unit y(AbtButtonStyle abtButtonStyle, int i2, Composer composer, int i3) {
        u(abtButtonStyle, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
