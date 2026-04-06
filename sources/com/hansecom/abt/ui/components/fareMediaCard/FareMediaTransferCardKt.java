package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class FareMediaTransferCardKt {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r0 = r28
            r1 = 6
            java.lang.String r2 = "description"
            kotlin.jvm.internal.Intrinsics.i(r0, r2)
            r2 = 437885630(0x1a199abe, float:3.1764658E-23)
            r3 = r30
            androidx.compose.runtime.Composer r14 = r3.q(r2)
            r3 = 1
            r4 = r32 & 1
            r5 = 2
            if (r4 == 0) goto L_0x001a
            r4 = r31 | 6
            goto L_0x002c
        L_0x001a:
            r4 = r31 & 6
            if (r4 != 0) goto L_0x002a
            boolean r4 = r14.W(r0)
            if (r4 == 0) goto L_0x0026
            r4 = 4
            goto L_0x0027
        L_0x0026:
            r4 = r5
        L_0x0027:
            r4 = r31 | r4
            goto L_0x002c
        L_0x002a:
            r4 = r31
        L_0x002c:
            r6 = r32 & 2
            r7 = 32
            if (r6 == 0) goto L_0x0037
            r4 = r4 | 48
        L_0x0034:
            r8 = r29
            goto L_0x0048
        L_0x0037:
            r8 = r31 & 48
            if (r8 != 0) goto L_0x0034
            r8 = r29
            boolean r9 = r14.W(r8)
            if (r9 == 0) goto L_0x0045
            r9 = r7
            goto L_0x0047
        L_0x0045:
            r9 = 16
        L_0x0047:
            r4 = r4 | r9
        L_0x0048:
            r9 = r4 & 19
            r10 = 18
            if (r9 != r10) goto L_0x005c
            boolean r9 = r14.t()
            if (r9 != 0) goto L_0x0055
            goto L_0x005c
        L_0x0055:
            r14.B()
            r26 = r14
            goto L_0x01fb
        L_0x005c:
            if (r6 == 0) goto L_0x0062
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            r15 = r6
            goto L_0x0063
        L_0x0062:
            r15 = r8
        L_0x0063:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x006f
            r6 = -1
            java.lang.String r8 = "com.hansecom.abt.ui.components.fareMediaCard.FareMediaTransferCard (FareMediaTransferCard.kt:28)"
            androidx.compose.runtime.ComposerKt.Y(r2, r4, r6, r8)
        L_0x006f:
            r2 = 0
            r6 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r15, r2, r3, r6)
            float r9 = com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardBaseKt.f()
            r10 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.AspectRatioKt.b(r8, r9, r10, r5, r6)
            androidx.compose.foundation.shape.RoundedCornerShape r8 = com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardBaseKt.g()
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.draw.ClipKt.a(r5, r8)
            int r5 = com.hansecom.abt.R.drawable.f33005g
            androidx.compose.ui.graphics.painter.Painter r17 = androidx.compose.ui.res.PainterResources_androidKt.c(r5, r14, r10)
            androidx.compose.ui.layout.ContentScale$Companion r5 = androidx.compose.ui.layout.ContentScale.f17026a
            androidx.compose.ui.layout.ContentScale r20 = r5.b()
            r23 = 38
            r24 = 0
            r18 = 0
            r19 = 0
            r21 = 1061997773(0x3f4ccccd, float:0.8)
            r22 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.draw.PainterModifierKt.b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r9 = r8.o()
            androidx.compose.ui.layout.MeasurePolicy r9 = androidx.compose.foundation.layout.BoxKt.g(r9, r10)
            int r11 = androidx.compose.runtime.ComposablesKt.a(r14, r10)
            androidx.compose.runtime.CompositionLocalMap r12 = r14.I()
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.ComposedModifierKt.e(r14, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r1 = r13.a()
            androidx.compose.runtime.Applier r17 = r14.v()
            if (r17 != 0) goto L_0x00c8
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00c8:
            r14.s()
            boolean r17 = r14.n()
            if (r17 == 0) goto L_0x00d5
            r14.y(r1)
            goto L_0x00d8
        L_0x00d5:
            r14.K()
        L_0x00d8:
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.Updater.b(r14)
            kotlin.jvm.functions.Function2 r10 = r13.c()
            androidx.compose.runtime.Updater.g(r1, r9, r10)
            kotlin.jvm.functions.Function2 r9 = r13.e()
            androidx.compose.runtime.Updater.g(r1, r12, r9)
            kotlin.jvm.functions.Function2 r9 = r13.b()
            boolean r10 = r1.n()
            if (r10 != 0) goto L_0x0102
            java.lang.Object r10 = r1.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r12)
            if (r10 != 0) goto L_0x0110
        L_0x0102:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r1.N(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r1.A(r10, r9)
        L_0x0110:
            kotlin.jvm.functions.Function2 r9 = r13.d()
            androidx.compose.runtime.Updater.g(r1, r5, r9)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r1, r2, r3, r6)
            float r2 = (float) r7
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.i(r1, r2)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r2 = r2.b()
            androidx.compose.ui.Alignment$Horizontal r3 = r8.g()
            r5 = 54
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r14, r5)
            r3 = 0
            int r3 = androidx.compose.runtime.ComposablesKt.a(r14, r3)
            androidx.compose.runtime.CompositionLocalMap r5 = r14.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r14, r1)
            kotlin.jvm.functions.Function0 r6 = r13.a()
            androidx.compose.runtime.Applier r7 = r14.v()
            if (r7 != 0) goto L_0x0152
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0152:
            r14.s()
            boolean r7 = r14.n()
            if (r7 == 0) goto L_0x015f
            r14.y(r6)
            goto L_0x0162
        L_0x015f:
            r14.K()
        L_0x0162:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r14)
            kotlin.jvm.functions.Function2 r7 = r13.c()
            androidx.compose.runtime.Updater.g(r6, r2, r7)
            kotlin.jvm.functions.Function2 r2 = r13.e()
            androidx.compose.runtime.Updater.g(r6, r5, r2)
            kotlin.jvm.functions.Function2 r2 = r13.b()
            boolean r5 = r6.n()
            if (r5 != 0) goto L_0x018c
            java.lang.Object r5 = r6.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r7)
            if (r5 != 0) goto L_0x019a
        L_0x018c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r6.N(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x019a:
            kotlin.jvm.functions.Function2 r2 = r13.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            com.hansecom.abt.ui.theme.AbtTheme r1 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r2 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r3 = r1.d(r14, r2)
            androidx.compose.ui.text.TextStyle r21 = r3.b()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r1.b(r14, r2)
            long r2 = r1.g()
            androidx.compose.ui.text.style.TextAlign$Companion r1 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r1 = r1.a()
            androidx.compose.ui.text.style.TextAlign r13 = androidx.compose.ui.text.style.TextAlign.h(r1)
            r23 = r4 & 14
            r24 = 0
            r25 = 130042(0x1fbfa, float:1.82228E-40)
            r1 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r16 = 0
            r26 = r14
            r27 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r0 = r28
            r22 = r26
            androidx.compose.material3.TextKt.j(r0, r1, r2, r4, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r26.T()
            r26.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01f9
            androidx.compose.runtime.ComposerKt.X()
        L_0x01f9:
            r8 = r27
        L_0x01fb:
            androidx.compose.runtime.ScopeUpdateScope r0 = r26.x()
            if (r0 == 0) goto L_0x020f
            com.hansecom.abt.ui.components.fareMediaCard.f r1 = new com.hansecom.abt.ui.components.fareMediaCard.f
            r2 = r28
            r3 = r31
            r4 = r32
            r1.<init>(r2, r8, r3, r4)
            r0.a(r1)
        L_0x020f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.fareMediaCard.FareMediaTransferCardKt.b(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(String str, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        b(str, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
