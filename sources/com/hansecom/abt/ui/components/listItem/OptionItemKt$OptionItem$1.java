package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class OptionItemKt$OptionItem$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38504A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f38505B;
    public final /* synthetic */ String C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38506z;

    public OptionItemKt$OptionItem$1(Modifier modifier, Function0 function0, boolean z2, String str) {
        this.f38506z = modifier;
        this.f38504A = function0;
        this.f38505B = z2;
        this.C = str;
    }

    public static final Unit e(Function0 function0) {
        function0.invoke();
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r2 & 3
            r4 = 2
            if (r3 != r4) goto L_0x0017
            boolean r3 = r29.t()
            if (r3 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r29.B()
            goto L_0x01d0
        L_0x0017:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0026
            r3 = -1
            java.lang.String r4 = "com.hansecom.abt.ui.components.listItem.OptionItem.<anonymous> (OptionItem.kt:29)"
            r5 = 33199375(0x1fa950f, float:9.2049385E-38)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x0026:
            androidx.compose.ui.Modifier r2 = r0.f38506z
            kotlin.jvm.functions.Function0 r3 = r0.f38504A
            boolean r15 = r0.f38505B
            java.lang.String r14 = r0.C
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r5 = r5.g()
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r7 = r6.k()
            r13 = 0
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.ColumnKt.a(r5, r7, r1, r13)
            int r7 = androidx.compose.runtime.ComposablesKt.a(r1, r13)
            androidx.compose.runtime.CompositionLocalMap r8 = r29.I()
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.ComposedModifierKt.e(r1, r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r11 = r10.a()
            androidx.compose.runtime.Applier r12 = r29.v()
            if (r12 != 0) goto L_0x005c
            androidx.compose.runtime.ComposablesKt.d()
        L_0x005c:
            r29.s()
            boolean r12 = r29.n()
            if (r12 == 0) goto L_0x0069
            r1.y(r11)
            goto L_0x006c
        L_0x0069:
            r29.K()
        L_0x006c:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r29)
            kotlin.jvm.functions.Function2 r12 = r10.c()
            androidx.compose.runtime.Updater.g(r11, r5, r12)
            kotlin.jvm.functions.Function2 r5 = r10.e()
            androidx.compose.runtime.Updater.g(r11, r8, r5)
            kotlin.jvm.functions.Function2 r5 = r10.b()
            boolean r8 = r11.n()
            if (r8 != 0) goto L_0x0096
            java.lang.Object r8 = r11.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r12)
            if (r8 != 0) goto L_0x00a4
        L_0x0096:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r11.N(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11.A(r7, r5)
        L_0x00a4:
            kotlin.jvm.functions.Function2 r5 = r10.d()
            androidx.compose.runtime.Updater.g(r11, r9, r5)
            androidx.compose.foundation.layout.ColumnScopeInstance r5 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r5 = 56
            float r5 = (float) r5
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            r7 = 0
            r8 = 1
            r9 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.b(r2, r7, r5, r8, r9)
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.h(r2, r7, r8, r9)
            r2 = -912625872(0xffffffffc99a6f30, float:-1265126.0)
            r1.X(r2)
            boolean r2 = r1.W(r3)
            java.lang.Object r5 = r29.g()
            if (r2 != 0) goto L_0x00d7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x00df
        L_0x00d7:
            com.hansecom.abt.ui.components.listItem.z r5 = new com.hansecom.abt.ui.components.listItem.z
            r5.<init>(r3)
            r1.N(r5)
        L_0x00df:
            r20 = r5
            kotlin.jvm.functions.Function0 r20 = (kotlin.jvm.functions.Function0) r20
            r29.M()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.ClickableKt.f(r16, r17, r18, r19, r20, r21, r22)
            r3 = 16
            float r3 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.i(r2, r3)
            androidx.compose.ui.Alignment r3 = r6.e()
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.BoxKt.g(r3, r13)
            int r5 = androidx.compose.runtime.ComposablesKt.a(r1, r13)
            androidx.compose.runtime.CompositionLocalMap r6 = r29.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r1, r2)
            kotlin.jvm.functions.Function0 r11 = r10.a()
            androidx.compose.runtime.Applier r12 = r29.v()
            if (r12 != 0) goto L_0x0120
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0120:
            r29.s()
            boolean r12 = r29.n()
            if (r12 == 0) goto L_0x012d
            r1.y(r11)
            goto L_0x0130
        L_0x012d:
            r29.K()
        L_0x0130:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r29)
            kotlin.jvm.functions.Function2 r12 = r10.c()
            androidx.compose.runtime.Updater.g(r11, r3, r12)
            kotlin.jvm.functions.Function2 r3 = r10.e()
            androidx.compose.runtime.Updater.g(r11, r6, r3)
            kotlin.jvm.functions.Function2 r3 = r10.b()
            boolean r6 = r11.n()
            if (r6 != 0) goto L_0x015a
            java.lang.Object r6 = r11.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r12)
            if (r6 != 0) goto L_0x0168
        L_0x015a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r11.N(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11.A(r5, r3)
        L_0x0168:
            kotlin.jvm.functions.Function2 r3 = r10.d()
            androidx.compose.runtime.Updater.g(r11, r2, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r4, r7, r8, r9)
            com.hansecom.abt.ui.theme.AbtTheme r3 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r4 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r3 = r3.d(r1, r4)
            androidx.compose.ui.text.TextStyle r22 = r3.a()
            r25 = 0
            r26 = 131068(0x1fffc, float:1.83665E-40)
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r16 = 0
            r13 = r16
            r23 = r14
            r14 = r16
            r16 = 0
            r27 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 48
            r1 = r23
            r23 = r29
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r29.T()
            r1 = -912615195(0xffffffffc99a98e5, float:-1266460.6)
            r2 = r29
            r2.X(r1)
            if (r27 == 0) goto L_0x01c1
            r1 = 0
            com.hansecom.abt.ui.components.listItem.MenuItemKt.k(r2, r1)
        L_0x01c1:
            r29.M()
            r29.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01d0
            androidx.compose.runtime.ComposerKt.X()
        L_0x01d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.listItem.OptionItemKt$OptionItem$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
