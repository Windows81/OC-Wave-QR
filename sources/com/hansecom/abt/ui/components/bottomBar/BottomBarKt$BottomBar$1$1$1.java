package com.hansecom.abt.ui.components.bottomBar;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class BottomBarKt$BottomBar$1$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f37997A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37998B;
    public final /* synthetic */ boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f37999z;

    public BottomBarKt$BottomBar$1$1$1(List list, int i2, Function1 function1, boolean z2) {
        this.f37999z = list;
        this.f37997A = i2;
        this.f37998B = function1;
        this.C = z2;
    }

    public static final Unit e(Function1 function1, BottomBarItemState bottomBarItemState) {
        function1.invoke(Integer.valueOf(bottomBarItemState.b()));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r27, int r28) {
        /*
            r26 = this;
            r0 = r26
            r11 = r27
            r1 = r28
            r2 = r1 & 3
            r12 = 2
            if (r2 != r12) goto L_0x0017
            boolean r2 = r27.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r27.B()
            goto L_0x019e
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.ui.components.bottomBar.BottomBar.<anonymous>.<anonymous>.<anonymous> (BottomBar.kt:85)"
            r4 = -822173082(0xffffffffcefea266, float:-2.1360279E9)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.layout.WindowInsets$Companion r2 = androidx.compose.foundation.layout.WindowInsets.f4206a
            r13 = 6
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.foundation.layout.WindowInsets_androidKt.e(r2, r11, r13)
            androidx.compose.foundation.layout.WindowInsetsSides$Companion r3 = androidx.compose.foundation.layout.WindowInsetsSides.f4266b
            int r3 = r3.e()
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.foundation.layout.WindowInsetsKt.j(r2, r3)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.e(r1, r2)
            r2 = 0
            r3 = 0
            r14 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r1, r2, r14, r3)
            float r2 = com.hansecom.abt.ui.components.bottomBar.BottomBarKt.j()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r1, r2)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.selection.SelectableGroupKt.a(r1)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r2 = r2.b()
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r3 = r3.i()
            java.util.List r15 = r0.f37999z
            int r10 = r0.f37997A
            kotlin.jvm.functions.Function1 r9 = r0.f37998B
            boolean r8 = r0.C
            r4 = 54
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.RowKt.b(r2, r3, r11, r4)
            r7 = 0
            int r3 = androidx.compose.runtime.ComposablesKt.a(r11, r7)
            androidx.compose.runtime.CompositionLocalMap r4 = r27.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r11, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r16 = r27.v()
            if (r16 != 0) goto L_0x0086
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0086:
            r27.s()
            boolean r16 = r27.n()
            if (r16 == 0) goto L_0x0093
            r11.y(r6)
            goto L_0x0096
        L_0x0093:
            r27.K()
        L_0x0096:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r27)
            kotlin.jvm.functions.Function2 r7 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r2, r7)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00c0
            java.lang.Object r4 = r6.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 != 0) goto L_0x00ce
        L_0x00c0:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00ce:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.RowScopeInstance r16 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            r1 = -915137264(0xffffffffc9741d10, float:-999889.0)
            r11.X(r1)
            r1 = r15
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r17 = r1.iterator()
            r7 = 0
        L_0x00e5:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x018f
            java.lang.Object r1 = r17.next()
            int r18 = r7 + 1
            if (r7 >= 0) goto L_0x00f6
            kotlin.collections.CollectionsKt.w()
        L_0x00f6:
            com.hansecom.abt.ui.components.bottomBar.BottomBarItemState r1 = (com.hansecom.abt.ui.components.bottomBar.BottomBarItemState) r1
            int r2 = r1.b()
            if (r10 != r2) goto L_0x0100
            r2 = r14
            goto L_0x0101
        L_0x0100:
            r2 = 0
        L_0x0101:
            int r4 = r1.a()
            int r19 = r1.c()
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r3 = r1.E()
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.platform.TestTagKt.a(r6, r3)
            r3 = 2100294335(0x7d2ff2bf, float:1.4617207E37)
            r11.X(r3)
            boolean r3 = r11.W(r9)
            boolean r20 = r11.W(r1)
            r3 = r3 | r20
            java.lang.Object r13 = r27.g()
            if (r3 != 0) goto L_0x0131
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r13 != r3) goto L_0x0139
        L_0x0131:
            com.hansecom.abt.ui.components.bottomBar.d r13 = new com.hansecom.abt.ui.components.bottomBar.d
            r13.<init>(r9, r1)
            r11.N(r13)
        L_0x0139:
            r3 = r13
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r27.M()
            r13 = 6
            r21 = 16
            r22 = 0
            r1 = r16
            r23 = r6
            r6 = r22
            r24 = r7
            r22 = 0
            r7 = r19
            r19 = r8
            r8 = r27
            r25 = r9
            r9 = r13
            r13 = r10
            r10 = r21
            com.hansecom.abt.ui.components.bottomBar.BottomBarKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = -915119926(0xffffffffc97460ca, float:-1000972.6)
            r11.X(r1)
            int r1 = r15.size()
            int r1 = r1 / r12
            int r1 = r1 - r14
            r2 = r24
            if (r2 != r1) goto L_0x0181
            if (r19 == 0) goto L_0x0181
            r1 = 88
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r2 = r23
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.y(r2, r1)
            r2 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r11, r2)
            goto L_0x0182
        L_0x0181:
            r2 = 6
        L_0x0182:
            r27.M()
            r10 = r13
            r7 = r18
            r8 = r19
            r9 = r25
            r13 = r2
            goto L_0x00e5
        L_0x018f:
            r27.M()
            r27.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x019e
            androidx.compose.runtime.ComposerKt.X()
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.bottomBar.BottomBarKt$BottomBar$1$1$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
