package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class AbtSideButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(kotlin.jvm.functions.Function0 r26, androidx.compose.ui.Modifier r27, com.hansecom.abt.ui.components.abtButton.AbtButtonState r28, java.lang.String r29, java.lang.Integer r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r13 = r26
            r14 = r32
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            r0 = -1175778350(0xffffffffb9eb0bd2, float:-4.48315E-4)
            r1 = r31
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r33 & 1
            r2 = 4
            if (r1 == 0) goto L_0x001a
            r1 = r14 | 6
            goto L_0x002a
        L_0x001a:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0029
            boolean r1 = r15.l(r13)
            if (r1 == 0) goto L_0x0026
            r1 = r2
            goto L_0x0027
        L_0x0026:
            r1 = 2
        L_0x0027:
            r1 = r1 | r14
            goto L_0x002a
        L_0x0029:
            r1 = r14
        L_0x002a:
            r3 = r33 & 2
            if (r3 == 0) goto L_0x0033
            r1 = r1 | 48
        L_0x0030:
            r4 = r27
            goto L_0x0045
        L_0x0033:
            r4 = r14 & 48
            if (r4 != 0) goto L_0x0030
            r4 = r27
            boolean r5 = r15.W(r4)
            if (r5 == 0) goto L_0x0042
            r5 = 32
            goto L_0x0044
        L_0x0042:
            r5 = 16
        L_0x0044:
            r1 = r1 | r5
        L_0x0045:
            r5 = r33 & 4
            if (r5 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r6 = r28
            goto L_0x0060
        L_0x004e:
            r6 = r14 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004b
            r6 = r28
            boolean r7 = r15.W(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r7
        L_0x0060:
            r7 = r33 & 8
            if (r7 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0066:
            r8 = r29
            goto L_0x007b
        L_0x0069:
            r8 = r14 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0066
            r8 = r29
            boolean r9 = r15.W(r8)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r9
        L_0x007b:
            r9 = r33 & 16
            if (r9 == 0) goto L_0x0084
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0081:
            r10 = r30
            goto L_0x0096
        L_0x0084:
            r10 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0081
            r10 = r30
            boolean r11 = r15.W(r10)
            if (r11 == 0) goto L_0x0093
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r1 = r1 | r11
        L_0x0096:
            r11 = r1 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x00ac
            boolean r11 = r15.t()
            if (r11 != 0) goto L_0x00a3
            goto L_0x00ac
        L_0x00a3:
            r15.B()
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r10
            goto L_0x015d
        L_0x00ac:
            if (r3 == 0) goto L_0x00b2
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            r12 = r3
            goto L_0x00b3
        L_0x00b2:
            r12 = r4
        L_0x00b3:
            if (r5 == 0) goto L_0x00b9
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r3 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            r11 = r3
            goto L_0x00ba
        L_0x00b9:
            r11 = r6
        L_0x00ba:
            r3 = 0
            if (r7 == 0) goto L_0x00be
            r8 = r3
        L_0x00be:
            if (r9 == 0) goto L_0x00c1
            r10 = r3
        L_0x00c1:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x00cd
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.ui.components.abtButton.AbtSideButton (AbtSideButton.kt:37)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r4, r5)
        L_0x00cd:
            r0 = 56
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            r4 = 0
            r5 = 1
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.b(r12, r4, r0, r5, r3)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r0 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            if (r11 != r0) goto L_0x00e0
            r4 = r5
            goto L_0x00e2
        L_0x00e0:
            r0 = 0
            r4 = r0
        L_0x00e2:
            androidx.compose.material3.ButtonColors r6 = new androidx.compose.material3.ButtonColors
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.f15975b
            long r17 = r0.e()
            com.hansecom.abt.ui.theme.AbtTheme r7 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r9 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r16 = r7.b(r15, r9)
            long r19 = r16.x()
            long r21 = r0.e()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r7.b(r15, r9)
            long r23 = r0.a()
            r25 = 0
            r16 = r6
            r16.<init>(r17, r19, r21, r23, r25)
            androidx.compose.material3.ButtonDefaults r0 = androidx.compose.material3.ButtonDefaults.f9301a
            androidx.compose.foundation.layout.PaddingValues r7 = r0.c()
            float r0 = (float) r2
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            androidx.compose.foundation.shape.RoundedCornerShape r9 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r0)
            com.hansecom.abt.ui.components.abtButton.AbtSideButtonKt$AbtSideButton$1 r0 = new com.hansecom.abt.ui.components.abtButton.AbtSideButtonKt$AbtSideButton$1
            r0.<init>(r8, r10)
            r2 = 54
            r16 = r8
            r8 = 1071819234(0x3fe2a9e2, float:1.7708094)
            androidx.compose.runtime.internal.ComposableLambda r17 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r5, r0, r15, r2)
            r0 = r1 & 14
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r18 = r0 | r1
            r19 = 352(0x160, float:4.93E-43)
            r5 = 0
            r8 = 0
            r20 = 0
            r0 = r26
            r1 = r3
            r2 = r4
            r3 = r9
            r4 = r6
            r6 = r8
            r8 = r20
            r9 = r17
            r17 = r10
            r10 = r15
            r20 = r11
            r11 = r18
            r18 = r12
            r12 = r19
            androidx.compose.material3.ButtonKt.d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0155
            androidx.compose.runtime.ComposerKt.X()
        L_0x0155:
            r4 = r16
            r5 = r17
            r2 = r18
            r3 = r20
        L_0x015d:
            androidx.compose.runtime.ScopeUpdateScope r8 = r15.x()
            if (r8 == 0) goto L_0x0172
            com.hansecom.abt.ui.components.abtButton.k r9 = new com.hansecom.abt.ui.components.abtButton.k
            r0 = r9
            r1 = r26
            r6 = r32
            r7 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.abtButton.AbtSideButtonKt.c(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, com.hansecom.abt.ui.components.abtButton.AbtButtonState, java.lang.String, java.lang.Integer, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit d(Function0 function0, Modifier modifier, AbtButtonState abtButtonState, String str, Integer num, int i2, int i3, Composer composer, int i4) {
        c(function0, modifier, abtButtonState, str, num, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(java.lang.String r30, java.lang.Integer r31, androidx.compose.runtime.Composer r32, int r33) {
        /*
            r0 = r30
            r1 = r31
            r2 = r33
            r3 = -1195913528(0xffffffffb8b7cec8, float:-8.764636E-5)
            r4 = r32
            androidx.compose.runtime.Composer r14 = r4.q(r3)
            r12 = 6
            r4 = r2 & 6
            r13 = 4
            if (r4 != 0) goto L_0x0020
            boolean r4 = r14.W(r0)
            if (r4 == 0) goto L_0x001d
            r4 = r13
            goto L_0x001e
        L_0x001d:
            r4 = 2
        L_0x001e:
            r4 = r4 | r2
            goto L_0x0021
        L_0x0020:
            r4 = r2
        L_0x0021:
            r5 = r2 & 48
            if (r5 != 0) goto L_0x0031
            boolean r5 = r14.W(r1)
            if (r5 == 0) goto L_0x002e
            r5 = 32
            goto L_0x0030
        L_0x002e:
            r5 = 16
        L_0x0030:
            r4 = r4 | r5
        L_0x0031:
            r15 = r4
            r4 = r15 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0045
            boolean r4 = r14.t()
            if (r4 != 0) goto L_0x003f
            goto L_0x0045
        L_0x003f:
            r14.B()
            r3 = r14
            goto L_0x01a8
        L_0x0045:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0051
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.ui.components.abtButton.ButtonContent (AbtSideButton.kt:59)"
            androidx.compose.runtime.ComposerKt.Y(r3, r15, r4, r5)
        L_0x0051:
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            r4 = 0
            r5 = 0
            r11 = 1
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r3, r4, r11, r5)
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f3739a
            r6 = 8
            float r6 = (float) r6
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r8 = r7.k()
            androidx.compose.foundation.layout.Arrangement$Horizontal r5 = r5.o(r6, r8)
            androidx.compose.ui.Alignment$Vertical r6 = r7.i()
            r7 = 54
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.RowKt.b(r5, r6, r14, r7)
            r10 = 0
            int r6 = androidx.compose.runtime.ComposablesKt.a(r14, r10)
            androidx.compose.runtime.CompositionLocalMap r7 = r14.I()
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.e(r14, r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r9 = r8.a()
            androidx.compose.runtime.Applier r16 = r14.v()
            if (r16 != 0) goto L_0x0093
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0093:
            r14.s()
            boolean r16 = r14.n()
            if (r16 == 0) goto L_0x00a0
            r14.y(r9)
            goto L_0x00a3
        L_0x00a0:
            r14.K()
        L_0x00a3:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.b(r14)
            kotlin.jvm.functions.Function2 r10 = r8.c()
            androidx.compose.runtime.Updater.g(r9, r5, r10)
            kotlin.jvm.functions.Function2 r5 = r8.e()
            androidx.compose.runtime.Updater.g(r9, r7, r5)
            kotlin.jvm.functions.Function2 r5 = r8.b()
            boolean r7 = r9.n()
            if (r7 != 0) goto L_0x00cd
            java.lang.Object r7 = r9.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r10)
            if (r7 != 0) goto L_0x00db
        L_0x00cd:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.N(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.A(r6, r5)
        L_0x00db:
            kotlin.jvm.functions.Function2 r5 = r8.d()
            androidx.compose.runtime.Updater.g(r9, r4, r5)
            androidx.compose.foundation.layout.RowScopeInstance r4 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            r4 = -1831787047(0xffffffff92d125d9, float:-1.31990845E-27)
            r14.X(r4)
            if (r1 == 0) goto L_0x011f
            r4 = 24
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.t(r3, r4)
            int r3 = r31.intValue()
            int r4 = r15 >> 3
            r4 = r4 & 14
            androidx.compose.ui.graphics.painter.Painter r4 = androidx.compose.ui.res.PainterResources_androidKt.c(r3, r14, r4)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r3 = r14.C(r3)
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.ui.graphics.Color) r3
            long r7 = r3.v()
            r10 = 432(0x1b0, float:6.05E-43)
            r3 = 0
            r5 = 0
            r9 = r14
            r16 = 0
            r17 = r11
            r11 = r3
            androidx.compose.material3.IconKt.d(r4, r5, r6, r7, r9, r10, r11)
            goto L_0x0123
        L_0x011f:
            r17 = r11
            r16 = 0
        L_0x0123:
            r14.M()
            r3 = -1831778647(0xffffffff92d146a9, float:-1.3207173E-27)
            r14.X(r3)
            if (r0 == 0) goto L_0x0198
            r3 = -1831777209(0xffffffff92d14c47, float:-1.3208558E-27)
            r14.X(r3)
            r3 = r15 & 14
            if (r3 != r13) goto L_0x013b
            r11 = r17
            goto L_0x013d
        L_0x013b:
            r11 = r16
        L_0x013d:
            java.lang.Object r3 = r14.g()
            if (r11 != 0) goto L_0x014b
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r3 != r4) goto L_0x0152
        L_0x014b:
            java.lang.String r3 = com.hansecom.abt.util.StringExtKt.c(r30)
            r14.N(r3)
        L_0x0152:
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            r14.M()
            com.hansecom.abt.ui.theme.AbtTheme r3 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r3 = r3.d(r14, r12)
            androidx.compose.ui.text.TextStyle r25 = r3.a()
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r3 = r14.C(r3)
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.ui.graphics.Color) r3
            long r6 = r3.v()
            r28 = 0
            r29 = 131066(0x1fffa, float:1.83663E-40)
            r5 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r3 = r14
            r14 = r15
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r26 = r3
            androidx.compose.material3.TextKt.j(r4, r5, r6, r8, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0199
        L_0x0198:
            r3 = r14
        L_0x0199:
            r3.M()
            r3.T()
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x01a8
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a8:
            androidx.compose.runtime.ScopeUpdateScope r3 = r3.x()
            if (r3 == 0) goto L_0x01b6
            com.hansecom.abt.ui.components.abtButton.l r4 = new com.hansecom.abt.ui.components.abtButton.l
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x01b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.abtButton.AbtSideButtonKt.e(java.lang.String, java.lang.Integer, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit f(String str, Integer num, int i2, Composer composer, int i3) {
        e(str, num, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
