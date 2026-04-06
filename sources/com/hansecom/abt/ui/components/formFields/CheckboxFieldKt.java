package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class CheckboxFieldKt {
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.CharSequence r42, java.lang.String r43, boolean r44, kotlin.jvm.functions.Function1 r45, androidx.compose.ui.Modifier r46, androidx.compose.runtime.Composer r47, int r48, int r49) {
        /*
            r0 = r42
            r15 = r44
            r13 = r45
            r14 = r48
            r8 = 16
            r1 = 2
            r12 = 48
            r11 = 6
            java.lang.String r2 = "label"
            kotlin.jvm.internal.Intrinsics.i(r0, r2)
            java.lang.String r2 = "onStateChange"
            kotlin.jvm.internal.Intrinsics.i(r13, r2)
            r2 = -808541271(0xffffffffcfcea3a9, float:-6.9336643E9)
            r3 = r47
            androidx.compose.runtime.Composer r9 = r3.q(r2)
            r10 = 1
            r3 = r49 & 1
            r7 = 4
            if (r3 == 0) goto L_0x002a
            r3 = r14 | 6
            goto L_0x003a
        L_0x002a:
            r3 = r14 & 6
            if (r3 != 0) goto L_0x0039
            boolean r3 = r9.l(r0)
            if (r3 == 0) goto L_0x0036
            r3 = r7
            goto L_0x0037
        L_0x0036:
            r3 = r1
        L_0x0037:
            r3 = r3 | r14
            goto L_0x003a
        L_0x0039:
            r3 = r14
        L_0x003a:
            r1 = r49 & 2
            if (r1 == 0) goto L_0x0042
            r3 = r3 | r12
        L_0x003f:
            r4 = r43
            goto L_0x0053
        L_0x0042:
            r4 = r14 & 48
            if (r4 != 0) goto L_0x003f
            r4 = r43
            boolean r5 = r9.W(r4)
            if (r5 == 0) goto L_0x0051
            r5 = 32
            goto L_0x0052
        L_0x0051:
            r5 = r8
        L_0x0052:
            r3 = r3 | r5
        L_0x0053:
            r5 = r49 & 4
            if (r5 == 0) goto L_0x005a
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005a:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x006a
            boolean r5 = r9.d(r15)
            if (r5 == 0) goto L_0x0067
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r3 = r3 | r5
        L_0x006a:
            r5 = r49 & 8
            r7 = 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0073
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x0073:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0082
            boolean r5 = r9.l(r13)
            if (r5 == 0) goto L_0x007f
            r5 = r7
            goto L_0x0081
        L_0x007f:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r5
        L_0x0082:
            r5 = r49 & 16
            if (r5 == 0) goto L_0x008b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r8 = r46
            goto L_0x009e
        L_0x008b:
            r8 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0088
            r8 = r46
            boolean r17 = r9.W(r8)
            if (r17 == 0) goto L_0x009a
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r17
        L_0x009e:
            r11 = r3 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r6) goto L_0x00b3
            boolean r6 = r9.t()
            if (r6 != 0) goto L_0x00ab
            goto L_0x00b3
        L_0x00ab:
            r9.B()
            r2 = r4
            r5 = r8
            r1 = r9
            goto L_0x0310
        L_0x00b3:
            if (r1 == 0) goto L_0x00ba
            java.lang.String r1 = ""
            r39 = r1
            goto L_0x00bc
        L_0x00ba:
            r39 = r4
        L_0x00bc:
            if (r5 == 0) goto L_0x00c2
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r11 = r1
            goto L_0x00c3
        L_0x00c2:
            r11 = r8
        L_0x00c3:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00cf
            r1 = -1
            java.lang.String r4 = "com.hansecom.abt.ui.components.formFields.CheckboxField (CheckboxField.kt:26)"
            androidx.compose.runtime.ComposerKt.Y(r2, r3, r1, r4)
        L_0x00cf:
            r1 = 56
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r8 = 0
            r6 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.b(r11, r8, r1, r10, r6)
            androidx.compose.ui.Alignment$Companion r19 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r2 = r19.i()
            androidx.compose.foundation.layout.Arrangement r20 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r4 = r20.f()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.RowKt.b(r4, r2, r9, r12)
            r5 = 0
            int r4 = androidx.compose.runtime.ComposablesKt.a(r9, r5)
            androidx.compose.runtime.CompositionLocalMap r5 = r9.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r9, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r21 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r21.a()
            androidx.compose.runtime.Applier r22 = r9.v()
            if (r22 != 0) goto L_0x0108
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0108:
            r9.s()
            boolean r22 = r9.n()
            if (r22 == 0) goto L_0x0115
            r9.y(r6)
            goto L_0x0118
        L_0x0115:
            r9.K()
        L_0x0118:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r12 = r21.c()
            androidx.compose.runtime.Updater.g(r6, r2, r12)
            kotlin.jvm.functions.Function2 r2 = r21.e()
            androidx.compose.runtime.Updater.g(r6, r5, r2)
            kotlin.jvm.functions.Function2 r2 = r21.b()
            boolean r5 = r6.n()
            if (r5 != 0) goto L_0x0142
            java.lang.Object r5 = r6.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r12)
            if (r5 != 0) goto L_0x0150
        L_0x0142:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6.N(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.A(r4, r2)
        L_0x0150:
            kotlin.jvm.functions.Function2 r2 = r21.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            r1 = -2138168091(0xffffffff808e24e5, float:-1.3053876E-38)
            r9.X(r1)
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != r7) goto L_0x0165
            r1 = r10
            goto L_0x0166
        L_0x0165:
            r1 = 0
        L_0x0166:
            r2 = r3 & 896(0x380, float:1.256E-42)
            r4 = 256(0x100, float:3.59E-43)
            if (r2 != r4) goto L_0x016e
            r2 = r10
            goto L_0x016f
        L_0x016e:
            r2 = 0
        L_0x016f:
            r1 = r1 | r2
            java.lang.Object r2 = r9.g()
            if (r1 != 0) goto L_0x017e
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0186
        L_0x017e:
            com.hansecom.abt.ui.components.formFields.h r2 = new com.hansecom.abt.ui.components.formFields.h
            r2.<init>(r13, r15)
            r9.N(r2)
        L_0x0186:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r9.M()
            r1 = 6
            int r4 = r3 >> 6
            r6 = r4 & 14
            r7 = 12
            r4 = 0
            r5 = 0
            r1 = r44
            r26 = r3
            r3 = r4
            r4 = r5
            r12 = 0
            r5 = r9
            r15 = 0
            com.hansecom.abt.ui.components.checkbox.AbtCheckBoxKt.b(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r7, r8, r10, r15)
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r20.g()
            androidx.compose.ui.Alignment$Horizontal r3 = r19.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r9, r12)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r9, r12)
            androidx.compose.runtime.CompositionLocalMap r4 = r9.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r9, r1)
            kotlin.jvm.functions.Function0 r5 = r21.a()
            androidx.compose.runtime.Applier r6 = r9.v()
            if (r6 != 0) goto L_0x01cb
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01cb:
            r9.s()
            boolean r6 = r9.n()
            if (r6 == 0) goto L_0x01d8
            r9.y(r5)
            goto L_0x01db
        L_0x01d8:
            r9.K()
        L_0x01db:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r6 = r21.c()
            androidx.compose.runtime.Updater.g(r5, r2, r6)
            kotlin.jvm.functions.Function2 r2 = r21.e()
            androidx.compose.runtime.Updater.g(r5, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r21.b()
            boolean r4 = r5.n()
            if (r4 != 0) goto L_0x0205
            java.lang.Object r4 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r6)
            if (r4 != 0) goto L_0x0213
        L_0x0205:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.A(r3, r2)
        L_0x0213:
            kotlin.jvm.functions.Function2 r2 = r21.d()
            androidx.compose.runtime.Updater.g(r5, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            com.hansecom.abt.ui.theme.AbtTheme r12 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r6 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r1 = r12.d(r9, r6)
            androidx.compose.ui.text.TextStyle r20 = r1.c()
            androidx.compose.ui.Modifier r27 = androidx.compose.foundation.layout.SizeKt.h(r7, r8, r10, r15)
            r1 = 16
            float r4 = (float) r1
            float r28 = androidx.compose.ui.unit.Dp.m(r4)
            r32 = 14
            r33 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r27, r28, r29, r30, r31, r32, r33)
            r2 = r26 & 14
            r16 = 48
            r22 = r2 | 48
            r23 = 0
            r24 = 65532(0xfffc, float:9.183E-41)
            r2 = 0
            r17 = 0
            r25 = r4
            r4 = r17
            r17 = 0
            r18 = r6
            r6 = r17
            r27 = r7
            r7 = r17
            r8 = r17
            r28 = 0
            r43 = r9
            r9 = r28
            r40 = r11
            r11 = r17
            r41 = r12
            r35 = r16
            r12 = r17
            r16 = 0
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r42
            r21 = r43
            com.hansecom.abt.ui.components.AbtTextKt.c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = -1483766955(0xffffffffa78f8355, float:-3.9832864E-15)
            r1 = r43
            r1.X(r0)
            int r0 = r39.length()
            if (r0 <= 0) goto L_0x02fa
            r0 = 4
            float r0 = (float) r0
            float r29 = androidx.compose.ui.unit.Dp.m(r0)
            r32 = 13
            r33 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m(r27, r28, r29, r30, r31, r32, r33)
            r2 = 1
            r3 = 0
            r4 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.h(r0, r3, r2, r4)
            float r6 = androidx.compose.ui.unit.Dp.m(r25)
            r10 = 14
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.layout.PaddingKt.m(r5, r6, r7, r8, r9, r10, r11)
            r0 = r41
            r2 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r3 = r0.d(r1, r2)
            androidx.compose.ui.text.TextStyle r34 = r3.d()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r1, r2)
            long r15 = r0.b()
            int r0 = r26 >> 3
            r0 = r0 & 14
            r36 = r0 | 48
            r37 = 0
            r38 = 131064(0x1fff8, float:1.8366E-40)
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r13 = r39
            r35 = r1
            androidx.compose.material3.TextKt.j(r13, r14, r15, r17, r18, r20, r21, r22, r23, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x02fa:
            r1.M()
            r1.T()
            r1.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x030c
            androidx.compose.runtime.ComposerKt.X()
        L_0x030c:
            r2 = r39
            r5 = r40
        L_0x0310:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.x()
            if (r8 == 0) goto L_0x0329
            com.hansecom.abt.ui.components.formFields.i r9 = new com.hansecom.abt.ui.components.formFields.i
            r0 = r9
            r1 = r42
            r3 = r44
            r4 = r45
            r6 = r48
            r7 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0329:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.CheckboxFieldKt.c(java.lang.CharSequence, java.lang.String, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit d(Function1 function1, boolean z2, boolean z3) {
        function1.invoke(Boolean.valueOf(!z2));
        return Unit.f40552a;
    }

    public static final Unit e(CharSequence charSequence, String str, boolean z2, Function1 function1, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        c(charSequence, str, z2, function1, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
