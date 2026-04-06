package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class LockedBadgeKt {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.Modifier r32, boolean r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r0 = r35
            r1 = r36
            r2 = 2
            r3 = 6
            r4 = -133519655(0xfffffffff80aa6d9, float:-1.1248766E34)
            r5 = r34
            androidx.compose.runtime.Composer r14 = r5.q(r4)
            r5 = 1
            r6 = r1 & 1
            r7 = 4
            if (r6 == 0) goto L_0x001b
            r8 = r0 | 6
            r9 = r8
            r8 = r32
            goto L_0x002f
        L_0x001b:
            r8 = r0 & 6
            if (r8 != 0) goto L_0x002c
            r8 = r32
            boolean r9 = r14.W(r8)
            if (r9 == 0) goto L_0x0029
            r9 = r7
            goto L_0x002a
        L_0x0029:
            r9 = r2
        L_0x002a:
            r9 = r9 | r0
            goto L_0x002f
        L_0x002c:
            r8 = r32
            r9 = r0
        L_0x002f:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x0037
            r9 = r9 | 48
        L_0x0034:
            r10 = r33
            goto L_0x0049
        L_0x0037:
            r10 = r0 & 48
            if (r10 != 0) goto L_0x0034
            r10 = r33
            boolean r11 = r14.d(r10)
            if (r11 == 0) goto L_0x0046
            r11 = 32
            goto L_0x0048
        L_0x0046:
            r11 = 16
        L_0x0048:
            r9 = r9 | r11
        L_0x0049:
            r11 = r9 & 19
            r12 = 18
            if (r11 != r12) goto L_0x005e
            boolean r11 = r14.t()
            if (r11 != 0) goto L_0x0056
            goto L_0x005e
        L_0x0056:
            r14.B()
            r2 = r10
            r30 = r14
            goto L_0x01ac
        L_0x005e:
            if (r6 == 0) goto L_0x0064
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            r15 = r6
            goto L_0x0065
        L_0x0064:
            r15 = r8
        L_0x0065:
            if (r2 == 0) goto L_0x0069
            r2 = r5
            goto L_0x006a
        L_0x0069:
            r2 = r10
        L_0x006a:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0076
            r5 = -1
            java.lang.String r6 = "com.hansecom.abt.ui.components.fareMediaCard.LockedBadge (LockedBadge.kt:28)"
            androidx.compose.runtime.ComposerKt.Y(r4, r9, r5, r6)
        L_0x0076:
            float r4 = (float) r7
            float r5 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.foundation.shape.RoundedCornerShape r5 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r5)
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.draw.ClipKt.a(r15, r5)
            if (r2 == 0) goto L_0x00a1
            r5 = 3
            float r5 = (float) r5
            float r17 = androidx.compose.ui.unit.Dp.m(r5)
            float r5 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.foundation.shape.RoundedCornerShape r18 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r5)
            r24 = 28
            r25 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.draw.ShadowKt.b(r16, r17, r18, r19, r20, r22, r24, r25)
        L_0x00a1:
            r5 = r16
            com.hansecom.abt.ui.theme.AbtTheme r13 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r6 = r13.b(r14, r3)
            long r6 = r6.c()
            r9 = 2
            r10 = 0
            r8 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.BackgroundKt.b(r5, r6, r8, r9, r10)
            r6 = 8
            float r6 = (float) r6
            float r7 = androidx.compose.ui.unit.Dp.m(r6)
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.PaddingKt.j(r5, r7, r4)
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f3739a
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r5 = r5.n(r6)
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r6 = r6.i()
            r7 = 54
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.RowKt.b(r5, r6, r14, r7)
            r12 = 0
            int r6 = androidx.compose.runtime.ComposablesKt.a(r14, r12)
            androidx.compose.runtime.CompositionLocalMap r7 = r14.I()
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.e(r14, r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r9 = r8.a()
            androidx.compose.runtime.Applier r10 = r14.v()
            if (r10 != 0) goto L_0x00f5
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00f5:
            r14.s()
            boolean r10 = r14.n()
            if (r10 == 0) goto L_0x0102
            r14.y(r9)
            goto L_0x0105
        L_0x0102:
            r14.K()
        L_0x0105:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.b(r14)
            kotlin.jvm.functions.Function2 r10 = r8.c()
            androidx.compose.runtime.Updater.g(r9, r5, r10)
            kotlin.jvm.functions.Function2 r5 = r8.e()
            androidx.compose.runtime.Updater.g(r9, r7, r5)
            kotlin.jvm.functions.Function2 r5 = r8.b()
            boolean r7 = r9.n()
            if (r7 != 0) goto L_0x012f
            java.lang.Object r7 = r9.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r10)
            if (r7 != 0) goto L_0x013d
        L_0x012f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.N(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.A(r6, r5)
        L_0x013d:
            kotlin.jvm.functions.Function2 r5 = r8.d()
            androidx.compose.runtime.Updater.g(r9, r4, r5)
            androidx.compose.foundation.layout.RowScopeInstance r4 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            int r4 = com.hansecom.abt.R.drawable.K
            androidx.compose.ui.graphics.painter.Painter r5 = androidx.compose.ui.res.PainterResources_androidKt.c(r4, r14, r12)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r4 = r13.b(r14, r3)
            long r8 = r4.i()
            r11 = 48
            r4 = 4
            r6 = 0
            r7 = 0
            r10 = r14
            r3 = r12
            r12 = r4
            androidx.compose.material3.IconKt.d(r5, r6, r7, r8, r10, r11, r12)
            int r4 = com.hansecom.abt.R.string.P4
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r14, r3)
            r3 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r4 = r13.b(r14, r3)
            long r7 = r4.i()
            com.hansecom.abt.ui.theme.typography.AbtTypography r3 = r13.d(r14, r3)
            androidx.compose.ui.text.TextStyle r25 = r3.m()
            r28 = 0
            r29 = 65530(0xfffa, float:9.1827E-41)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r3 = 0
            r30 = r14
            r31 = r15
            r14 = r3
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r26 = r30
            com.hansecom.abt.ui.components.AbtTextKt.c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r30.T()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01aa
            androidx.compose.runtime.ComposerKt.X()
        L_0x01aa:
            r8 = r31
        L_0x01ac:
            androidx.compose.runtime.ScopeUpdateScope r3 = r30.x()
            if (r3 == 0) goto L_0x01ba
            com.hansecom.abt.ui.components.fareMediaCard.g r4 = new com.hansecom.abt.ui.components.fareMediaCard.g
            r4.<init>(r8, r2, r0, r1)
            r3.a(r4)
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.fareMediaCard.LockedBadgeKt.b(androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(Modifier modifier, boolean z2, int i2, int i3, Composer composer, int i4) {
        b(modifier, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
