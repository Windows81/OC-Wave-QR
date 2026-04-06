package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SearchTextFieldKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r40, kotlin.jvm.functions.Function1 r41, int r42, androidx.compose.ui.Modifier r43, boolean r44, androidx.compose.ui.focus.FocusRequester r45, int r46, int r47, androidx.compose.runtime.Composer r48, int r49, int r50) {
        /*
            r14 = r40
            r5 = r41
            r3 = r49
            r2 = r50
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            r0 = -2118790935(0xffffffff81b5d0e9, float:-6.678867E-38)
            r1 = r48
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0022
            r4 = r3 | 6
            goto L_0x0032
        L_0x0022:
            r4 = r3 & 6
            if (r4 != 0) goto L_0x0031
            boolean r4 = r1.W(r14)
            if (r4 == 0) goto L_0x002e
            r4 = 4
            goto L_0x002f
        L_0x002e:
            r4 = 2
        L_0x002f:
            r4 = r4 | r3
            goto L_0x0032
        L_0x0031:
            r4 = r3
        L_0x0032:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x0039
            r4 = r4 | 48
            goto L_0x0049
        L_0x0039:
            r6 = r3 & 48
            if (r6 != 0) goto L_0x0049
            boolean r6 = r1.l(r5)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r4 = r4 | r6
        L_0x0049:
            r6 = r2 & 4
            if (r6 == 0) goto L_0x0052
            r4 = r4 | 384(0x180, float:5.38E-43)
            r13 = r42
            goto L_0x0064
        L_0x0052:
            r6 = r3 & 384(0x180, float:5.38E-43)
            r13 = r42
            if (r6 != 0) goto L_0x0064
            boolean r6 = r1.i(r13)
            if (r6 == 0) goto L_0x0061
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r4 = r4 | r6
        L_0x0064:
            r6 = r2 & 8
            if (r6 == 0) goto L_0x006d
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r7 = r43
            goto L_0x007f
        L_0x006d:
            r7 = r3 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006a
            r7 = r43
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x007c
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r4 = r4 | r8
        L_0x007f:
            r8 = r2 & 16
            if (r8 == 0) goto L_0x0088
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r9 = r44
            goto L_0x009a
        L_0x0088:
            r9 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0085
            r9 = r44
            boolean r10 = r1.d(r9)
            if (r10 == 0) goto L_0x0097
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r4 = r4 | r10
        L_0x009a:
            r10 = r2 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r10 == 0) goto L_0x00a4
            r4 = r4 | r12
        L_0x00a1:
            r12 = r45
            goto L_0x00b5
        L_0x00a4:
            r12 = r12 & r3
            if (r12 != 0) goto L_0x00a1
            r12 = r45
            boolean r15 = r1.W(r12)
            if (r15 == 0) goto L_0x00b2
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r4 = r4 | r15
        L_0x00b5:
            r15 = r2 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00c0
            r4 = r4 | r16
            r11 = r46
            goto L_0x00d3
        L_0x00c0:
            r16 = r3 & r16
            r11 = r46
            if (r16 != 0) goto L_0x00d3
            boolean r16 = r1.i(r11)
            if (r16 == 0) goto L_0x00cf
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r4 = r4 | r16
        L_0x00d3:
            r0 = r2 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00de
            r4 = r4 | r17
            r2 = r47
            goto L_0x00f1
        L_0x00de:
            r17 = r3 & r17
            r2 = r47
            if (r17 != 0) goto L_0x00f1
            boolean r17 = r1.i(r2)
            if (r17 == 0) goto L_0x00ed
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ef
        L_0x00ed:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ef:
            r4 = r4 | r17
        L_0x00f1:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r2 = r4 & r17
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r3) goto L_0x010f
            boolean r2 = r1.t()
            if (r2 != 0) goto L_0x0102
            goto L_0x010f
        L_0x0102:
            r1.B()
            r8 = r47
            r32 = r1
            r4 = r7
            r5 = r9
            r7 = r11
            r6 = r12
            goto L_0x0228
        L_0x010f:
            if (r6 == 0) goto L_0x0115
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r3 = r2
            goto L_0x0116
        L_0x0115:
            r3 = r7
        L_0x0116:
            r2 = 1
            if (r8 == 0) goto L_0x011c
            r27 = r2
            goto L_0x011e
        L_0x011c:
            r27 = r9
        L_0x011e:
            if (r10 == 0) goto L_0x0140
            r6 = 1743236401(0x67e7ad31, float:2.188123E24)
            r1.X(r6)
            java.lang.Object r6 = r1.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r6 != r7) goto L_0x013a
            androidx.compose.ui.focus.FocusRequester r6 = new androidx.compose.ui.focus.FocusRequester
            r6.<init>()
            r1.N(r6)
        L_0x013a:
            androidx.compose.ui.focus.FocusRequester r6 = (androidx.compose.ui.focus.FocusRequester) r6
            r1.M()
            r12 = r6
        L_0x0140:
            if (r15 == 0) goto L_0x014b
            androidx.compose.ui.text.input.KeyboardType$Companion r6 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r6 = r6.h()
            r28 = r6
            goto L_0x014d
        L_0x014b:
            r28 = r11
        L_0x014d:
            if (r0 == 0) goto L_0x0158
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r0 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r0 = r0.e()
            r29 = r0
            goto L_0x015a
        L_0x0158:
            r29 = r47
        L_0x015a:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0169
            r0 = -1
            java.lang.String r6 = "com.hansecom.abt.ui.components.formFields.SearchTextField (SearchTextField.kt:35)"
            r7 = -2118790935(0xffffffff81b5d0e9, float:-6.678867E-38)
            androidx.compose.runtime.ComposerKt.Y(r7, r4, r0, r6)
        L_0x0169:
            androidx.compose.ui.Modifier r30 = androidx.compose.ui.focus.FocusRequesterModifierKt.a(r3, r12)
            androidx.compose.foundation.text.KeyboardOptions$Companion r0 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r17 = r0.a()
            androidx.compose.ui.text.input.ImeAction$Companion r0 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r21 = r0.g()
            r25 = 114(0x72, float:1.6E-43)
            r26 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r18 = r29
            r20 = r28
            androidx.compose.foundation.text.KeyboardOptions r22 = androidx.compose.foundation.text.KeyboardOptions.d(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = 1743256690(0x67e7fc72, float:2.1910469E24)
            r1.X(r0)
            r0 = 458752(0x70000, float:6.42848E-40)
            r6 = r4 & r0
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r6 != r7) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            r2 = 0
        L_0x019d:
            java.lang.Object r6 = r1.g()
            if (r2 != 0) goto L_0x01ab
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x01b3
        L_0x01ab:
            com.hansecom.abt.ui.components.formFields.W r6 = new com.hansecom.abt.ui.components.formFields.W
            r6.<init>(r12)
            r1.N(r6)
        L_0x01b3:
            r36 = r6
            kotlin.jvm.functions.Function1 r36 = (kotlin.jvm.functions.Function1) r36
            r1.M()
            androidx.compose.foundation.text.KeyboardActions r31 = new androidx.compose.foundation.text.KeyboardActions
            r15 = r31
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 0
            r38 = 47
            r39 = 0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)
            com.hansecom.abt.ui.components.formFields.ComposableSingletons$SearchTextFieldKt r2 = com.hansecom.abt.ui.components.formFields.ComposableSingletons$SearchTextFieldKt.f38296a
            kotlin.jvm.functions.Function2 r10 = r2.a()
            r2 = r4 & 126(0x7e, float:1.77E-43)
            int r6 = r4 >> 3
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r6
            int r4 = r4 << 9
            r0 = r0 & r4
            r23 = r2 | r0
            r25 = 0
            r26 = 4078544(0x3e3bd0, float:5.715257E-39)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r0 = 0
            r31 = r12
            r12 = r0
            r13 = r0
            r16 = 1
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 1572870(0x180006, float:2.20406E-39)
            r0 = r40
            r32 = r1
            r1 = r41
            r2 = r30
            r30 = r3
            r3 = r27
            r5 = r42
            r14 = r22
            r22 = r32
            com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldKt.d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x021e
            androidx.compose.runtime.ComposerKt.X()
        L_0x021e:
            r5 = r27
            r7 = r28
            r8 = r29
            r4 = r30
            r6 = r31
        L_0x0228:
            androidx.compose.runtime.ScopeUpdateScope r11 = r32.x()
            if (r11 == 0) goto L_0x0241
            com.hansecom.abt.ui.components.formFields.X r12 = new com.hansecom.abt.ui.components.formFields.X
            r0 = r12
            r1 = r40
            r2 = r41
            r3 = r42
            r9 = r49
            r10 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.SearchTextFieldKt.c(java.lang.String, kotlin.jvm.functions.Function1, int, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.focus.FocusRequester, int, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit d(FocusRequester focusRequester, KeyboardActionScope keyboardActionScope) {
        Intrinsics.i(keyboardActionScope, "$this$KeyboardActions");
        focusRequester.e();
        return Unit.f40552a;
    }

    public static final Unit e(String str, Function1 function1, int i2, Modifier modifier, boolean z2, FocusRequester focusRequester, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        c(str, function1, i2, modifier, z2, focusRequester, i3, i4, composer, RecomposeScopeImplKt.a(i5 | 1), i6);
        return Unit.f40552a;
    }
}
