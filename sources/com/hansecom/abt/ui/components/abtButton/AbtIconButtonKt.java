package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class AbtIconButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlin.jvm.functions.Function0 r31, androidx.compose.ui.graphics.painter.Painter r32, java.lang.String r33, androidx.compose.ui.Modifier r34, boolean r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r37
            r13 = 8
            r0 = 16
            r1 = 2
            r2 = 4
            r3 = 6
            java.lang.String r4 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r9, r4)
            java.lang.String r4 = "painter"
            kotlin.jvm.internal.Intrinsics.i(r10, r4)
            java.lang.String r4 = "contentDescription"
            kotlin.jvm.internal.Intrinsics.i(r11, r4)
            r4 = -1402162684(0xffffffffac6cb204, float:-3.3636436E-12)
            r5 = r36
            androidx.compose.runtime.Composer r14 = r5.q(r4)
            r15 = 1
            r5 = r38 & 1
            if (r5 == 0) goto L_0x002f
            r5 = r12 | 6
            goto L_0x003f
        L_0x002f:
            r5 = r12 & 6
            if (r5 != 0) goto L_0x003e
            boolean r5 = r14.l(r9)
            if (r5 == 0) goto L_0x003b
            r5 = r2
            goto L_0x003c
        L_0x003b:
            r5 = r1
        L_0x003c:
            r5 = r5 | r12
            goto L_0x003f
        L_0x003e:
            r5 = r12
        L_0x003f:
            r1 = r38 & 2
            if (r1 == 0) goto L_0x0046
            r5 = r5 | 48
            goto L_0x0055
        L_0x0046:
            r1 = r12 & 48
            if (r1 != 0) goto L_0x0055
            boolean r1 = r14.l(r10)
            if (r1 == 0) goto L_0x0053
            r1 = 32
            goto L_0x0054
        L_0x0053:
            r1 = r0
        L_0x0054:
            r5 = r5 | r1
        L_0x0055:
            r1 = r38 & 4
            if (r1 == 0) goto L_0x005c
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005c:
            r1 = r12 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x006c
            boolean r1 = r14.W(r11)
            if (r1 == 0) goto L_0x0069
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r1 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r5 = r5 | r1
        L_0x006c:
            r1 = r38 & 8
            if (r1 == 0) goto L_0x0075
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0072:
            r2 = r34
            goto L_0x0087
        L_0x0075:
            r2 = r12 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0072
            r2 = r34
            boolean r6 = r14.W(r2)
            if (r6 == 0) goto L_0x0084
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r5 = r5 | r6
        L_0x0087:
            r0 = r38 & 16
            if (r0 == 0) goto L_0x0090
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r6 = r35
            goto L_0x00a2
        L_0x0090:
            r6 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x008d
            r6 = r35
            boolean r7 = r14.d(r6)
            if (r7 == 0) goto L_0x009f
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r5 = r5 | r7
        L_0x00a2:
            r7 = r5 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r8) goto L_0x00b6
            boolean r7 = r14.t()
            if (r7 != 0) goto L_0x00af
            goto L_0x00b6
        L_0x00af:
            r14.B()
            r4 = r2
            r5 = r6
            goto L_0x01f2
        L_0x00b6:
            if (r1 == 0) goto L_0x00bc
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r8 = r1
            goto L_0x00bd
        L_0x00bc:
            r8 = r2
        L_0x00bd:
            if (r0 == 0) goto L_0x00c2
            r16 = r15
            goto L_0x00c4
        L_0x00c2:
            r16 = r6
        L_0x00c4:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00d0
            r0 = -1
            java.lang.String r1 = "com.hansecom.abt.ui.components.abtButton.AbtIconButton (AbtIconButton.kt:36)"
            androidx.compose.runtime.ComposerKt.Y(r4, r5, r0, r1)
        L_0x00d0:
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r0.b(r14, r3)
            long r18 = r1.x()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r14, r3)
            long r23 = r0.o()
            r0 = 44
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.t(r8, r0)
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.ui.semantics.Role.f18040b
            int r1 = r1.a()
            r2 = 12
            float r2 = (float) r2
            float r26 = androidx.compose.ui.unit.Dp.m(r2)
            r29 = 4
            r30 = 0
            r25 = 0
            r27 = 0
            androidx.compose.foundation.IndicationNodeFactory r2 = androidx.compose.material3.RippleKt.e(r25, r26, r27, r29, r30)
            androidx.compose.ui.semantics.Role r5 = androidx.compose.ui.semantics.Role.j(r1)
            r7 = 8
            r17 = 0
            r1 = 0
            r4 = 0
            r3 = r16
            r6 = r31
            r25 = r8
            r8 = r17
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.ClickableKt.d(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.foundation.shape.RoundedCornerShape r1 = androidx.compose.foundation.shape.RoundedCornerShapeKt.f()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.draw.ClipKt.a(r0, r1)
            float r1 = (float) r13
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.i(r0, r1)
            androidx.compose.foundation.shape.RoundedCornerShape r1 = androidx.compose.foundation.shape.RoundedCornerShapeKt.f()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.draw.ClipKt.a(r0, r1)
            if (r16 == 0) goto L_0x013a
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x013c
        L_0x013a:
            r1 = 1056964608(0x3f000000, float:0.5)
        L_0x013c:
            androidx.compose.ui.Modifier r17 = androidx.compose.ui.draw.AlphaKt.a(r0, r1)
            r21 = 2
            r22 = 0
            r20 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.b(r17, r18, r20, r21, r22)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r1 = r1.e()
            r2 = 0
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r2)
            int r2 = androidx.compose.runtime.ComposablesKt.a(r14, r2)
            androidx.compose.runtime.CompositionLocalMap r3 = r14.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r14, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r5 = r4.a()
            androidx.compose.runtime.Applier r6 = r14.v()
            if (r6 != 0) goto L_0x0170
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0170:
            r14.s()
            boolean r6 = r14.n()
            if (r6 == 0) goto L_0x017d
            r14.y(r5)
            goto L_0x0180
        L_0x017d:
            r14.K()
        L_0x0180:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r14)
            kotlin.jvm.functions.Function2 r6 = r4.c()
            androidx.compose.runtime.Updater.g(r5, r1, r6)
            kotlin.jvm.functions.Function2 r1 = r4.e()
            androidx.compose.runtime.Updater.g(r5, r3, r1)
            kotlin.jvm.functions.Function2 r1 = r4.b()
            boolean r3 = r5.n()
            if (r3 != 0) goto L_0x01aa
            java.lang.Object r3 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r6)
            if (r3 != 0) goto L_0x01b8
        L_0x01aa:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.N(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.A(r2, r1)
        L_0x01b8:
            kotlin.jvm.functions.Function2 r1 = r4.d()
            androidx.compose.runtime.Updater.g(r5, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.ContentColorKt.a()
            androidx.compose.ui.graphics.Color r1 = androidx.compose.ui.graphics.Color.h(r23)
            androidx.compose.runtime.ProvidedValue r0 = r0.d(r1)
            com.hansecom.abt.ui.components.abtButton.AbtIconButtonKt$AbtIconButton$1$1 r1 = new com.hansecom.abt.ui.components.abtButton.AbtIconButtonKt$AbtIconButton$1$1
            r1.<init>(r10, r11)
            r2 = 54
            r3 = 280181834(0x10b33c4a, float:7.069594E-29)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r15, r1, r14, r2)
            int r2 = androidx.compose.runtime.ProvidedValue.f14769i
            r2 = r2 | 48
            androidx.compose.runtime.CompositionLocalKt.c(r0, r1, r14, r2)
            r14.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01ee
            androidx.compose.runtime.ComposerKt.X()
        L_0x01ee:
            r5 = r16
            r4 = r25
        L_0x01f2:
            androidx.compose.runtime.ScopeUpdateScope r8 = r14.x()
            if (r8 == 0) goto L_0x020b
            com.hansecom.abt.ui.components.abtButton.j r13 = new com.hansecom.abt.ui.components.abtButton.j
            r0 = r13
            r1 = r31
            r2 = r32
            r3 = r33
            r6 = r37
            r7 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r13)
        L_0x020b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.abtButton.AbtIconButtonKt.b(kotlin.jvm.functions.Function0, androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(Function0 function0, Painter painter, String str, Modifier modifier, boolean z2, int i2, int i3, Composer composer, int i4) {
        b(function0, painter, str, modifier, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
