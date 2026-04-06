package com.hansecom.abt.ui.components.quickSelectionButton;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class QuickSelectionButtonKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r26, boolean r27, kotlin.jvm.functions.Function0 r28, androidx.compose.ui.Modifier r29, boolean r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r1 = r26
            r2 = r27
            r3 = r28
            r6 = r32
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r1, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r3, r0)
            r0 = 104066931(0x633ef73, float:3.3842078E-35)
            r4 = r31
            androidx.compose.runtime.Composer r4 = r4.q(r0)
            r5 = r33 & 1
            if (r5 == 0) goto L_0x0022
            r5 = r6 | 6
            goto L_0x0032
        L_0x0022:
            r5 = r6 & 6
            if (r5 != 0) goto L_0x0031
            boolean r5 = r4.W(r1)
            if (r5 == 0) goto L_0x002e
            r5 = 4
            goto L_0x002f
        L_0x002e:
            r5 = 2
        L_0x002f:
            r5 = r5 | r6
            goto L_0x0032
        L_0x0031:
            r5 = r6
        L_0x0032:
            r7 = r33 & 2
            if (r7 == 0) goto L_0x0039
            r5 = r5 | 48
            goto L_0x0049
        L_0x0039:
            r7 = r6 & 48
            if (r7 != 0) goto L_0x0049
            boolean r7 = r4.d(r2)
            if (r7 == 0) goto L_0x0046
            r7 = 32
            goto L_0x0048
        L_0x0046:
            r7 = 16
        L_0x0048:
            r5 = r5 | r7
        L_0x0049:
            r7 = r33 & 4
            if (r7 == 0) goto L_0x0050
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x0050:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0060
            boolean r7 = r4.l(r3)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r5 = r5 | r7
        L_0x0060:
            r7 = r33 & 8
            if (r7 == 0) goto L_0x0069
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0066:
            r8 = r29
            goto L_0x007b
        L_0x0069:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0066
            r8 = r29
            boolean r9 = r4.W(r8)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r5 = r5 | r9
        L_0x007b:
            r9 = r33 & 16
            if (r9 == 0) goto L_0x0084
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0081:
            r10 = r30
            goto L_0x0096
        L_0x0084:
            r10 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0081
            r10 = r30
            boolean r11 = r4.d(r10)
            if (r11 == 0) goto L_0x0093
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r5 = r5 | r11
        L_0x0096:
            r11 = r5 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x00a9
            boolean r11 = r4.t()
            if (r11 != 0) goto L_0x00a3
            goto L_0x00a9
        L_0x00a3:
            r4.B()
            r5 = r10
            goto L_0x0206
        L_0x00a9:
            if (r7 == 0) goto L_0x00af
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r14 = r7
            goto L_0x00b0
        L_0x00af:
            r14 = r8
        L_0x00b0:
            r13 = 1
            if (r9 == 0) goto L_0x00b6
            r23 = r13
            goto L_0x00b8
        L_0x00b6:
            r23 = r10
        L_0x00b8:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00c4
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionButton (QuickSelectionButton.kt:41)"
            androidx.compose.runtime.ComposerKt.Y(r0, r5, r7, r8)
        L_0x00c4:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.theme.AbtBaseThemeKt.o()
            java.lang.Object r0 = r4.C(r0)
            com.hansecom.abt.ui.components.quickSelectionButton.AbtQuickSelectionButtonStyle r0 = (com.hansecom.abt.ui.components.quickSelectionButton.AbtQuickSelectionButtonStyle) r0
            r7 = -1204934383(0xffffffffb82e2911, float:-4.152308E-5)
            r4.X(r7)
            r12 = 6
            if (r2 == 0) goto L_0x00e2
            com.hansecom.abt.ui.theme.AbtTheme r7 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r7.b(r4, r12)
            long r7 = r7.x()
            goto L_0x00e8
        L_0x00e2:
            androidx.compose.ui.graphics.Color$Companion r7 = androidx.compose.ui.graphics.Color.f15975b
            long r7 = r7.e()
        L_0x00e8:
            r4.M()
            r16 = 384(0x180, float:5.38E-43)
            r17 = 10
            r9 = 0
            java.lang.String r10 = "backgroundColor"
            r11 = 0
            r15 = r12
            r12 = r4
            r13 = r16
            r24 = r14
            r14 = r17
            androidx.compose.runtime.State r25 = androidx.compose.animation.SingleValueAnimationKt.a(r7, r9, r10, r11, r12, r13, r14)
            if (r23 != 0) goto L_0x0115
            r7 = 1301930815(0x4d99e33f, float:3.22725856E8)
            r4.X(r7)
            com.hansecom.abt.ui.theme.AbtTheme r7 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r7.b(r4, r15)
            long r7 = r7.a()
            r4.M()
            goto L_0x013e
        L_0x0115:
            if (r2 == 0) goto L_0x012b
            r7 = 1302005246(0x4d9b05fe, float:3.25107648E8)
            r4.X(r7)
            com.hansecom.abt.ui.theme.AbtTheme r7 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r7.b(r4, r15)
            long r7 = r7.o()
            r4.M()
            goto L_0x013e
        L_0x012b:
            r7 = 1302064704(0x4d9bee40, float:3.27010304E8)
            r4.X(r7)
            com.hansecom.abt.ui.theme.AbtTheme r7 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r7.b(r4, r15)
            long r7 = r7.x()
            r4.M()
        L_0x013e:
            r13 = 384(0x180, float:5.38E-43)
            r14 = 10
            r9 = 0
            java.lang.String r10 = "contentColor"
            r11 = 0
            r12 = r4
            androidx.compose.runtime.State r7 = androidx.compose.animation.SingleValueAnimationKt.a(r7, r9, r10, r11, r12, r13, r14)
            if (r23 != 0) goto L_0x0161
            r8 = -1204919114(0xffffffffb82e64b6, float:-4.1578627E-5)
            r4.X(r8)
            com.hansecom.abt.ui.theme.AbtTheme r8 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r8.b(r4, r15)
            long r8 = r8.a()
        L_0x015d:
            r4.M()
            goto L_0x0172
        L_0x0161:
            r8 = -1204917995(0xffffffffb82e6915, float:-4.1582698E-5)
            r4.X(r8)
            com.hansecom.abt.ui.theme.AbtTheme r8 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r8.b(r4, r15)
            long r8 = r8.x()
            goto L_0x015d
        L_0x0172:
            r10 = 48
            float r10 = (float) r10
            float r10 = androidx.compose.ui.unit.Dp.m(r10)
            r15 = r24
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.i(r15, r10)
            r10 = -1204914469(0xffffffffb82e76db, float:-4.1595526E-5)
            r4.X(r10)
            r5 = r5 & 896(0x380, float:1.256E-42)
            r13 = 0
            r10 = 256(0x100, float:3.59E-43)
            if (r5 != r10) goto L_0x018e
            r5 = 1
            goto L_0x018f
        L_0x018e:
            r5 = r13
        L_0x018f:
            java.lang.Object r10 = r4.g()
            if (r5 != 0) goto L_0x019d
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r10 != r5) goto L_0x01a5
        L_0x019d:
            com.hansecom.abt.ui.components.quickSelectionButton.e r10 = new com.hansecom.abt.ui.components.quickSelectionButton.e
            r10.<init>(r3)
            r4.N(r10)
        L_0x01a5:
            r20 = r10
            kotlin.jvm.functions.Function0 r20 = (kotlin.jvm.functions.Function0) r20
            r4.M()
            r21 = 6
            r22 = 0
            r18 = 0
            r19 = 0
            r17 = r23
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.ClickableKt.f(r16, r17, r18, r19, r20, r21, r22)
            long r10 = d(r25)
            long r16 = e(r7)
            r12 = 1
            float r14 = (float) r12
            float r14 = androidx.compose.ui.unit.Dp.m(r14)
            androidx.compose.foundation.BorderStroke r18 = androidx.compose.foundation.BorderStrokeKt.a(r14, r8)
            float r0 = r0.a(r4, r13)
            androidx.compose.foundation.shape.RoundedCornerShape r8 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r0)
            com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionButtonKt$QuickSelectionButton$2 r0 = new com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionButtonKt$QuickSelectionButton$2
            r0.<init>(r1, r7)
            r7 = 54
            r9 = -226679688(0xfffffffff27d2478, float:-5.014003E30)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r12, r0, r4, r7)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r20 = 48
            r13 = 0
            r14 = 0
            r7 = r5
            r9 = r10
            r11 = r16
            r5 = r15
            r15 = r18
            r16 = r0
            r17 = r4
            r18 = r19
            r19 = r20
            androidx.compose.material3.SurfaceKt.c(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0203
            androidx.compose.runtime.ComposerKt.X()
        L_0x0203:
            r8 = r5
            r5 = r23
        L_0x0206:
            androidx.compose.runtime.ScopeUpdateScope r9 = r4.x()
            if (r9 == 0) goto L_0x0220
            com.hansecom.abt.ui.components.quickSelectionButton.f r10 = new com.hansecom.abt.ui.components.quickSelectionButton.f
            r0 = r10
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r8
            r6 = r32
            r7 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x0220:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionButtonKt.c(java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final long d(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final long e(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final Unit f(Function0 function0) {
        function0.invoke();
        return Unit.f40552a;
    }

    public static final Unit g(String str, boolean z2, Function0 function0, Modifier modifier, boolean z3, int i2, int i3, Composer composer, int i4) {
        c(str, z2, function0, modifier, z3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
