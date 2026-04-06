package com.hansecom.abt.ui.components.quickSelectionButton;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class QuickSelectionGridKt$QuickSelectionGrid$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f38758A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PersistentList f38759B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ boolean E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f38760z;

    public QuickSelectionGridKt$QuickSelectionGrid$1(float f2, float f3, PersistentList persistentList, Object obj, Function1 function1, boolean z2) {
        this.f38760z = f2;
        this.f38758A = f3;
        this.f38759B = persistentList;
        this.C = obj;
        this.D = function1;
        this.E = z2;
    }

    public static final Unit e(Function1 function1, Object obj) {
        function1.invoke(obj);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.foundation.layout.BoxWithConstraintsScope r24, androidx.compose.runtime.Composer r25, int r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r9 = r25
            r10 = 1
            java.lang.String r2 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            r11 = 6
            r2 = r26 & 6
            if (r2 != 0) goto L_0x001d
            boolean r2 = r9.W(r1)
            if (r2 == 0) goto L_0x0019
            r2 = 4
            goto L_0x001a
        L_0x0019:
            r2 = 2
        L_0x001a:
            r2 = r26 | r2
            goto L_0x001f
        L_0x001d:
            r2 = r26
        L_0x001f:
            r3 = r2 & 19
            r4 = 18
            if (r3 != r4) goto L_0x0031
            boolean r3 = r25.t()
            if (r3 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            r25.B()
            goto L_0x026e
        L_0x0031:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0040
            r3 = -1
            java.lang.String r4 = "com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionGrid.<anonymous> (QuickSelectionGrid.kt:41)"
            r5 = 1189111740(0x46e067bc, float:28723.867)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x0040:
            float r2 = r24.e()
            float r3 = r0.f38760z
            float r2 = r2 - r3
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            float r3 = r0.f38760z
            float r4 = r0.f38758A
            float r3 = r3 + r4
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            float r2 = r2 / r3
            float r3 = (float) r10
            float r2 = r2 + r3
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            float r2 = (float) r2
            int r12 = (int) r2
            kotlinx.collections.immutable.PersistentList r2 = r0.f38759B
            int r2 = r2.size()
            int r2 = java.lang.Math.min(r12, r2)
            float r1 = r24.e()
            float r3 = r0.f38758A
            int r4 = r2 + -1
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            float r1 = r1 - r3
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            float r2 = (float) r2
            float r1 = r1 / r2
            float r13 = androidx.compose.ui.unit.Dp.m(r1)
            kotlinx.collections.immutable.PersistentList r1 = r0.f38759B
            int r1 = r1.size()
            int r1 = r1 / r12
            kotlinx.collections.immutable.PersistentList r2 = r0.f38759B
            int r2 = r2.size()
            int r2 = r2 % r12
            r14 = 0
            if (r2 == 0) goto L_0x0094
            r2 = r10
            goto L_0x0095
        L_0x0094:
            r2 = r14
        L_0x0095:
            int r15 = r1 + r2
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r2 = 0
            r3 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r1, r2, r10, r3)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            float r3 = r0.f38758A
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r2 = r2.n(r3)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.g()
            float r8 = r0.f38758A
            kotlinx.collections.immutable.PersistentList r7 = r0.f38759B
            java.lang.Object r6 = r0.C
            kotlin.jvm.functions.Function1 r5 = r0.D
            boolean r4 = r0.E
            r10 = 54
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r9, r10)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r9, r14)
            androidx.compose.runtime.CompositionLocalMap r10 = r25.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r9, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r14 = r16.a()
            androidx.compose.runtime.Applier r17 = r25.v()
            if (r17 != 0) goto L_0x00d8
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00d8:
            r25.s()
            boolean r17 = r25.n()
            if (r17 == 0) goto L_0x00e5
            r9.y(r14)
            goto L_0x00e8
        L_0x00e5:
            r25.K()
        L_0x00e8:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r25)
            kotlin.jvm.functions.Function2 r11 = r16.c()
            androidx.compose.runtime.Updater.g(r14, r2, r11)
            kotlin.jvm.functions.Function2 r2 = r16.e()
            androidx.compose.runtime.Updater.g(r14, r10, r2)
            kotlin.jvm.functions.Function2 r2 = r16.b()
            boolean r10 = r14.n()
            if (r10 != 0) goto L_0x0112
            java.lang.Object r10 = r14.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r11)
            if (r10 != 0) goto L_0x0120
        L_0x0112:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r14.N(r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r14.A(r3, r2)
        L_0x0120:
            kotlin.jvm.functions.Function2 r2 = r16.d()
            androidx.compose.runtime.Updater.g(r14, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r10 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r1 = 1576116904(0x5df1a2a8, float:2.17645798E18)
            r9.X(r1)
            r11 = 0
        L_0x0130:
            if (r11 >= r15) goto L_0x025f
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r2.g()
            androidx.compose.ui.Modifier r1 = r10.b(r1, r3)
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r3 = r3.n(r8)
            androidx.compose.ui.Alignment$Vertical r2 = r2.l()
            r14 = 6
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.RowKt.b(r3, r2, r9, r14)
            r3 = 0
            int r16 = androidx.compose.runtime.ComposablesKt.a(r9, r3)
            androidx.compose.runtime.CompositionLocalMap r3 = r25.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r9, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r14 = r17.a()
            androidx.compose.runtime.Applier r18 = r25.v()
            if (r18 != 0) goto L_0x0169
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0169:
            r25.s()
            boolean r18 = r25.n()
            if (r18 == 0) goto L_0x0176
            r9.y(r14)
            goto L_0x0179
        L_0x0176:
            r25.K()
        L_0x0179:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r25)
            kotlin.jvm.functions.Function2 r0 = r17.c()
            androidx.compose.runtime.Updater.g(r14, r2, r0)
            kotlin.jvm.functions.Function2 r0 = r17.e()
            androidx.compose.runtime.Updater.g(r14, r3, r0)
            kotlin.jvm.functions.Function2 r0 = r17.b()
            boolean r2 = r14.n()
            if (r2 != 0) goto L_0x01a3
            java.lang.Object r2 = r14.g()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r2 != 0) goto L_0x01b1
        L_0x01a3:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r14.N(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r14.A(r2, r0)
        L_0x01b1:
            kotlin.jvm.functions.Function2 r0 = r17.d()
            androidx.compose.runtime.Updater.g(r14, r1, r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            r0 = 1
            int r1 = r15 + -1
            if (r11 != r1) goto L_0x01cc
            int r0 = r7.size()
            int r0 = r0 % r12
            if (r0 == 0) goto L_0x01cc
            int r0 = r7.size()
            int r0 = r0 % r12
            goto L_0x01cd
        L_0x01cc:
            r0 = r12
        L_0x01cd:
            r1 = 458897402(0x1b5a37fa, float:1.8050624E-22)
            r9.X(r1)
            r14 = 0
        L_0x01d4:
            if (r14 >= r0) goto L_0x0248
            int r1 = r11 * r12
            int r1 = r1 + r14
            java.lang.Object r1 = r7.get(r1)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.y(r2, r13)
            java.lang.String r2 = com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionGridKt.e(r1)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r1, r6)
            r17 = r0
            r0 = 458911830(0x1b5a7056, float:1.8068835E-22)
            r9.X(r0)
            boolean r0 = r9.W(r5)
            boolean r18 = r9.l(r1)
            r0 = r0 | r18
            r18 = r4
            java.lang.Object r4 = r25.g()
            if (r0 != 0) goto L_0x020d
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x0215
        L_0x020d:
            com.hansecom.abt.ui.components.quickSelectionButton.h r4 = new com.hansecom.abt.ui.components.quickSelectionButton.h
            r4.<init>(r5, r1)
            r9.N(r4)
        L_0x0215:
            r0 = r4
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r25.M()
            r19 = 0
            r20 = 0
            r1 = r2
            r2 = r3
            r21 = 0
            r3 = r0
            r0 = r18
            r4 = r16
            r16 = r5
            r5 = r0
            r18 = r6
            r6 = r25
            r22 = r7
            r7 = r19
            r19 = r8
            r8 = r20
            com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionButtonKt.c(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 1
            int r14 = r14 + r1
            r4 = r0
            r5 = r16
            r0 = r17
            r6 = r18
            r8 = r19
            r7 = r22
            goto L_0x01d4
        L_0x0248:
            r0 = r4
            r16 = r5
            r18 = r6
            r22 = r7
            r19 = r8
            r1 = 1
            r21 = 0
            r25.M()
            r25.T()
            int r11 = r11 + r1
            r0 = r23
            goto L_0x0130
        L_0x025f:
            r25.M()
            r25.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x026e
            androidx.compose.runtime.ComposerKt.X()
        L_0x026e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionGridKt$QuickSelectionGrid$1.c(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
