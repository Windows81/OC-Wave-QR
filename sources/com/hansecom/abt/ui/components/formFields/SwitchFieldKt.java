package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SwitchFieldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f38330a = 0.4f;

    /* renamed from: b  reason: collision with root package name */
    public static final float f38331b = 0.5f;

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r36, boolean r37, kotlin.jvm.functions.Function1 r38, androidx.compose.ui.Modifier r39, boolean r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            r0 = r36
            r14 = r37
            r15 = r38
            r13 = r42
            java.lang.String r1 = "label"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            java.lang.String r1 = "onStateChange"
            kotlin.jvm.internal.Intrinsics.i(r15, r1)
            r1 = 466503704(0x1bce4818, float:3.412643E-22)
            r2 = r41
            androidx.compose.runtime.Composer r12 = r2.q(r1)
            r2 = r43 & 1
            if (r2 == 0) goto L_0x0022
            r2 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r2 = r13 & 6
            if (r2 != 0) goto L_0x0031
            boolean r2 = r12.W(r0)
            if (r2 == 0) goto L_0x002e
            r2 = 4
            goto L_0x002f
        L_0x002e:
            r2 = 2
        L_0x002f:
            r2 = r2 | r13
            goto L_0x0032
        L_0x0031:
            r2 = r13
        L_0x0032:
            r3 = r43 & 2
            r4 = 32
            r5 = 16
            if (r3 == 0) goto L_0x003d
            r2 = r2 | 48
            goto L_0x004b
        L_0x003d:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x004b
            boolean r3 = r12.d(r14)
            if (r3 == 0) goto L_0x0049
            r3 = r4
            goto L_0x004a
        L_0x0049:
            r3 = r5
        L_0x004a:
            r2 = r2 | r3
        L_0x004b:
            r3 = r43 & 4
            r6 = 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0054
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0054:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0063
            boolean r3 = r12.l(r15)
            if (r3 == 0) goto L_0x0060
            r3 = r6
            goto L_0x0062
        L_0x0060:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r2 = r2 | r3
        L_0x0063:
            r3 = r43 & 8
            if (r3 == 0) goto L_0x006c
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r7 = r39
            goto L_0x007e
        L_0x006c:
            r7 = r13 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0069
            r7 = r39
            boolean r8 = r12.W(r7)
            if (r8 == 0) goto L_0x007b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r2 = r2 | r8
        L_0x007e:
            r8 = r43 & 16
            if (r8 == 0) goto L_0x0088
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r9 = r40
        L_0x0086:
            r10 = r2
            goto L_0x009b
        L_0x0088:
            r9 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0084
            r9 = r40
            boolean r10 = r12.d(r9)
            if (r10 == 0) goto L_0x0097
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r2 = r2 | r10
            goto L_0x0086
        L_0x009b:
            r2 = r10 & 9363(0x2493, float:1.312E-41)
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r11) goto L_0x00b0
            boolean r2 = r12.t()
            if (r2 != 0) goto L_0x00a8
            goto L_0x00b0
        L_0x00a8:
            r12.B()
            r4 = r7
            r5 = r9
            r10 = r12
            goto L_0x0243
        L_0x00b0:
            if (r3 == 0) goto L_0x00b6
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r11 = r2
            goto L_0x00b7
        L_0x00b6:
            r11 = r7
        L_0x00b7:
            r2 = 1
            if (r8 == 0) goto L_0x00bb
            r9 = r2
        L_0x00bb:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x00c7
            r3 = -1
            java.lang.String r7 = "com.hansecom.abt.ui.components.formFields.SwitchField (SwitchField.kt:56)"
            androidx.compose.runtime.ComposerKt.Y(r1, r10, r3, r7)
        L_0x00c7:
            r1 = 56
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r3 = 0
            r7 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.b(r11, r7, r1, r2, r3)
            androidx.compose.ui.semantics.Role$Companion r3 = androidx.compose.ui.semantics.Role.f18040b
            int r3 = r3.c()
            androidx.compose.ui.semantics.Role r3 = androidx.compose.ui.semantics.Role.j(r3)
            r7 = 484611730(0x1ce29692, float:1.4994347E-21)
            r12.X(r7)
            r7 = r10 & 896(0x380, float:1.256E-42)
            r8 = 0
            if (r7 != r6) goto L_0x00eb
            r6 = r2
            goto L_0x00ec
        L_0x00eb:
            r6 = r8
        L_0x00ec:
            r7 = r10 & 112(0x70, float:1.57E-43)
            if (r7 != r4) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r2 = r8
        L_0x00f2:
            r2 = r2 | r6
            java.lang.Object r4 = r12.g()
            if (r2 != 0) goto L_0x0101
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0109
        L_0x0101:
            com.hansecom.abt.ui.components.formFields.Y r4 = new com.hansecom.abt.ui.components.formFields.Y
            r4.<init>(r15, r14)
            r12.N(r4)
        L_0x0109:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r12.M()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.selection.ToggleableKt.c(r1, r14, r9, r3, r4)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r2 = r2.i()
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r3 = r3.f()
            r7 = 48
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.RowKt.b(r3, r2, r12, r7)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r12, r8)
            androidx.compose.runtime.CompositionLocalMap r4 = r12.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r12, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r8 = r6.a()
            androidx.compose.runtime.Applier r16 = r12.v()
            if (r16 != 0) goto L_0x013f
            androidx.compose.runtime.ComposablesKt.d()
        L_0x013f:
            r12.s()
            boolean r16 = r12.n()
            if (r16 == 0) goto L_0x014c
            r12.y(r8)
            goto L_0x014f
        L_0x014c:
            r12.K()
        L_0x014f:
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.b(r12)
            kotlin.jvm.functions.Function2 r7 = r6.c()
            androidx.compose.runtime.Updater.g(r8, r2, r7)
            kotlin.jvm.functions.Function2 r2 = r6.e()
            androidx.compose.runtime.Updater.g(r8, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r6.b()
            boolean r4 = r8.n()
            if (r4 != 0) goto L_0x0179
            java.lang.Object r4 = r8.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 != 0) goto L_0x0187
        L_0x0179:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r8.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.A(r3, r2)
        L_0x0187:
            kotlin.jvm.functions.Function2 r2 = r6.d()
            androidx.compose.runtime.Updater.g(r8, r1, r2)
            androidx.compose.foundation.layout.RowScopeInstance r22 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            com.hansecom.abt.ui.theme.AbtTheme r1 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r8 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r1 = r1.d(r12, r8)
            androidx.compose.ui.text.TextStyle r21 = r1.a()
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r26 = 2
            r27 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r23 = r7
            androidx.compose.ui.Modifier r28 = androidx.compose.foundation.layout.RowScope.c(r22, r23, r24, r25, r26, r27)
            float r1 = (float) r5
            float r29 = androidx.compose.ui.unit.Dp.m(r1)
            r33 = 14
            r34 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r28, r29, r30, r31, r32, r33, r34)
            r23 = r10 & 14
            r24 = 0
            r25 = 131068(0x1fffc, float:1.83665E-40)
            r2 = 0
            r4 = 0
            r5 = 0
            r16 = 0
            r35 = r7
            r26 = 48
            r7 = r16
            r8 = r16
            r27 = r9
            r9 = r16
            r16 = 0
            r28 = r10
            r29 = r11
            r10 = r16
            r16 = 0
            r39 = r12
            r12 = r16
            r13 = r16
            r16 = 0
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r0 = r36
            r22 = r39
            androidx.compose.material3.TextKt.j(r0, r1, r2, r4, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.hansecom.abt.ui.components.formFields.AbtSwitchFieldDefaults r0 = com.hansecom.abt.ui.components.formFields.AbtSwitchFieldDefaults.f38259a
            r10 = r39
            r1 = 6
            androidx.compose.material3.SwitchColors r5 = r0.a(r10, r1)
            if (r27 == 0) goto L_0x020d
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x020a:
            r1 = r35
            goto L_0x0215
        L_0x020d:
            if (r37 == 0) goto L_0x0212
            float r0 = f38330a
            goto L_0x020a
        L_0x0212:
            float r0 = f38331b
            goto L_0x020a
        L_0x0215:
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.draw.AlphaKt.a(r1, r0)
            int r0 = r28 >> 3
            r0 = r0 & 14
            r0 = r0 | 48
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r28 & r1
            r8 = r0 | r1
            r9 = 72
            r1 = 0
            r3 = 0
            r6 = 0
            r0 = r37
            r4 = r27
            r7 = r10
            androidx.compose.material3.SwitchKt.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x023f
            androidx.compose.runtime.ComposerKt.X()
        L_0x023f:
            r5 = r27
            r4 = r29
        L_0x0243:
            androidx.compose.runtime.ScopeUpdateScope r8 = r10.x()
            if (r8 == 0) goto L_0x025c
            com.hansecom.abt.ui.components.formFields.Z r9 = new com.hansecom.abt.ui.components.formFields.Z
            r0 = r9
            r1 = r36
            r2 = r37
            r3 = r38
            r6 = r42
            r7 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x025c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.SwitchFieldKt.c(java.lang.String, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit d(Function1 function1, boolean z2, boolean z3) {
        function1.invoke(Boolean.valueOf(!z2));
        return Unit.f40552a;
    }

    public static final Unit e(String str, boolean z2, Function1 function1, Modifier modifier, boolean z3, int i2, int i3, Composer composer, int i4) {
        c(str, z2, function1, modifier, z3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
