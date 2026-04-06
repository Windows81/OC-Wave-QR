package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class HelpRequestScreenKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void F(com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State r27, kotlin.jvm.functions.Function1 r28, androidx.compose.ui.focus.FocusManager r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r31
            r4 = -1141727642(0xffffffffbbf29e66, float:-0.0074041365)
            r5 = r30
            androidx.compose.runtime.Composer r15 = r5.q(r4)
            r5 = r3 & 6
            if (r5 != 0) goto L_0x0020
            boolean r5 = r15.W(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r3
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r6 = r3 & 48
            r14 = 32
            if (r6 != 0) goto L_0x0032
            boolean r6 = r15.l(r1)
            if (r6 == 0) goto L_0x002f
            r6 = r14
            goto L_0x0031
        L_0x002f:
            r6 = 16
        L_0x0031:
            r5 = r5 | r6
        L_0x0032:
            r6 = r3 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0042
            boolean r6 = r15.l(r2)
            if (r6 == 0) goto L_0x003f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0041
        L_0x003f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0041:
            r5 = r5 | r6
        L_0x0042:
            r6 = r5 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x0055
            boolean r6 = r15.t()
            if (r6 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            r15.B()
            r0 = r15
            goto L_0x02ce
        L_0x0055:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0061
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.helpRequest.CardNumberFields (HelpRequestScreen.kt:302)"
            androidx.compose.runtime.ComposerKt.Y(r4, r5, r6, r7)
        L_0x0061:
            kotlinx.collections.immutable.ImmutableList r4 = r27.h()
            boolean r4 = r4.isEmpty()
            r13 = 0
            r12 = 0
            r11 = 1
            r10 = 0
            if (r4 != 0) goto L_0x0243
            r4 = 152383463(0x9152fe7, float:1.7957746E-33)
            r15.X(r4)
            com.hansecom.abt.presentation.screens.helpRequest.CardNumberState r4 = r27.g()
            if (r4 == 0) goto L_0x0080
            java.lang.String r4 = r4.a()
            goto L_0x0081
        L_0x0080:
            r4 = r12
        L_0x0081:
            if (r4 != 0) goto L_0x0085
            java.lang.String r4 = ""
        L_0x0085:
            int r6 = com.hansecom.abt.R.string.L5
            com.hansecom.abt.data.config.help.HelpScreenConfig r7 = r27.v()
            java.lang.Boolean r7 = r7.a()
            java.lang.String r6 = x0(r6, r7, r15, r10)
            int r7 = com.hansecom.abt.R.string.M5
            java.lang.Object[] r8 = new java.lang.Object[r10]
            java.lang.String r7 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r7, r8, r15, r10)
            boolean r8 = r27.G()
            if (r8 != 0) goto L_0x00a4
            r16 = r7
            goto L_0x00a6
        L_0x00a4:
            r16 = r12
        L_0x00a6:
            com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r27.d()
            java.lang.Object[] r8 = new java.lang.Object[r10]
            java.lang.String r7 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r7, r8, r15, r10)
            boolean r8 = r27.G()
            if (r8 != 0) goto L_0x00b9
            r17 = r7
            goto L_0x00bb
        L_0x00b9:
            r17 = r12
        L_0x00bb:
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r9, r13, r11, r12)
            r7 = -549260256(0xffffffffdf42f420, float:-1.4047888E19)
            r15.X(r7)
            boolean r7 = r15.l(r2)
            r5 = r5 & 112(0x70, float:1.57E-43)
            if (r5 != r14) goto L_0x00d2
            r18 = r11
            goto L_0x00d4
        L_0x00d2:
            r18 = r10
        L_0x00d4:
            r7 = r7 | r18
            java.lang.Object r10 = r15.g()
            if (r7 != 0) goto L_0x00e4
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r10 != r7) goto L_0x00ec
        L_0x00e4:
            com.hansecom.abt.presentation.screens.helpRequest.s r10 = new com.hansecom.abt.presentation.screens.helpRequest.s
            r10.<init>(r2, r1)
            r15.N(r10)
        L_0x00ec:
            r7 = r10
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r15.M()
            r10 = -549255628(0xffffffffdf430634, float:-1.4052977E19)
            r15.X(r10)
            if (r5 != r14) goto L_0x00fc
            r10 = r11
            goto L_0x00fd
        L_0x00fc:
            r10 = 0
        L_0x00fd:
            java.lang.Object r11 = r15.g()
            if (r10 != 0) goto L_0x010b
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x0113
        L_0x010b:
            com.hansecom.abt.presentation.screens.helpRequest.t r11 = new com.hansecom.abt.presentation.screens.helpRequest.t
            r11.<init>(r1)
            r15.N(r11)
        L_0x0113:
            r19 = r11
            kotlin.jvm.functions.Function0 r19 = (kotlin.jvm.functions.Function0) r19
            r15.M()
            r20 = 0
            r21 = 912(0x390, float:1.278E-42)
            r10 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 3072(0xc00, float:4.305E-42)
            r11 = r5
            r5 = r4
            r4 = r9
            r9 = r10
            r10 = r16
            r26 = r11
            r11 = r17
            r12 = r22
            r13 = r23
            r14 = r24
            r30 = r15
            r15 = r19
            r16 = r30
            r17 = r25
            r18 = r20
            r19 = r21
            com.hansecom.abt.ui.components.formFields.DropdownTextFieldKt.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5 = -549251499(0xffffffffdf431655, float:-1.4057517E19)
            r15 = r30
            r15.X(r5)
            boolean r5 = r27.G()
            if (r5 == 0) goto L_0x01cd
            r5 = 6
            r13 = 0
            r14 = 1
            androidx.compose.ui.focus.FocusRequester r16 = com.hansecom.abt.util.FocusRequesterExtKt.d(r14, r15, r5, r13)
            java.lang.String r5 = r27.c()
            com.hansecom.abt.util.resourcesResolvers.StringValue r6 = r27.d()
            java.lang.Object[] r7 = new java.lang.Object[r13]
            java.lang.String r9 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r6, r7, r15, r13)
            int r6 = com.hansecom.abt.R.string.M5
            java.lang.Object[] r7 = new java.lang.Object[r13]
            java.lang.String r11 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r6, r7, r15, r13)
            androidx.compose.ui.text.input.ImeAction$Companion r6 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r17 = r6.d()
            int r7 = r27.f()
            r6 = 0
            r8 = 0
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.h(r4, r6, r14, r8)
            r4 = -549239886(0xffffffffdf4343b2, float:-1.4070285E19)
            r15.X(r4)
            r12 = r26
            r4 = 32
            if (r12 != r4) goto L_0x018f
            r6 = r14
            goto L_0x0190
        L_0x018f:
            r6 = r13
        L_0x0190:
            java.lang.Object r8 = r15.g()
            if (r6 != 0) goto L_0x019e
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x01a6
        L_0x019e:
            com.hansecom.abt.presentation.screens.helpRequest.u r8 = new com.hansecom.abt.presentation.screens.helpRequest.u
            r8.<init>(r1)
            r15.N(r8)
        L_0x01a6:
            r6 = r8
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r15.M()
            r18 = 0
            r19 = 384(0x180, float:5.38E-43)
            java.lang.String r8 = ""
            r20 = 0
            r21 = 0
            r22 = 805506048(0x30030c00, float:4.7674575E-10)
            r0 = r12
            r12 = r20
            r4 = r13
            r13 = r21
            r14 = r17
            r30 = r15
            r15 = r16
            r16 = r30
            r17 = r22
            com.hansecom.abt.ui.components.formFields.CardNumberFieldKt.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x01d2
        L_0x01cd:
            r30 = r15
            r0 = r26
            r4 = 0
        L_0x01d2:
            r30.M()
            int r5 = com.hansecom.abt.R.string.L5
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r15 = r30
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r6, r15, r4)
            kotlinx.collections.immutable.ImmutableList r6 = r27.h()
            r7 = -549225454(0xffffffffdf437c12, float:-1.4086154E19)
            r15.X(r7)
            r7 = 32
            if (r0 != r7) goto L_0x01ef
            r11 = 1
            goto L_0x01f0
        L_0x01ef:
            r11 = r4
        L_0x01f0:
            java.lang.Object r7 = r15.g()
            if (r11 != 0) goto L_0x01fe
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x0206
        L_0x01fe:
            com.hansecom.abt.presentation.screens.helpRequest.v r7 = new com.hansecom.abt.presentation.screens.helpRequest.v
            r7.<init>(r1)
            r15.N(r7)
        L_0x0206:
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r15.M()
            boolean r8 = r27.e()
            r9 = -549221701(0xffffffffdf438abb, float:-1.409028E19)
            r15.X(r9)
            r9 = 32
            if (r0 != r9) goto L_0x021b
            r11 = 1
            goto L_0x021c
        L_0x021b:
            r11 = r4
        L_0x021c:
            java.lang.Object r0 = r15.g()
            if (r11 != 0) goto L_0x022a
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r0 != r4) goto L_0x0232
        L_0x022a:
            com.hansecom.abt.presentation.screens.helpRequest.w r0 = new com.hansecom.abt.presentation.screens.helpRequest.w
            r0.<init>(r1)
            r15.N(r0)
        L_0x0232:
            r9 = r0
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r15.M()
            r11 = 0
            r10 = r15
            com.hansecom.abt.presentation.screens.helpRequest.CardNumberBottomSheetKt.h(r5, r6, r7, r8, r9, r10, r11)
            r15.M()
            r0 = r15
            goto L_0x02c5
        L_0x0243:
            r4 = r10
            r8 = r12
            r6 = r13
            r0 = 154082201(0x92f1b99, float:2.1077835E-33)
            r15.X(r0)
            int r0 = com.hansecom.abt.R.string.L5
            com.hansecom.abt.data.config.help.HelpScreenConfig r7 = r27.v()
            java.lang.Boolean r7 = r7.a()
            java.lang.String r0 = x0(r0, r7, r15, r4)
            java.lang.String r7 = r27.c()
            com.hansecom.abt.util.resourcesResolvers.StringValue r9 = r27.d()
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r9 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r9, r10, r15, r4)
            int r10 = com.hansecom.abt.R.string.M5
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r11 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r10, r11, r15, r4)
            androidx.compose.ui.text.input.ImeAction$Companion r10 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r14 = r10.d()
            int r10 = r27.f()
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.f15489d
            r13 = 1
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.h(r12, r6, r13, r8)
            r6 = -549208462(0xffffffffdf43be72, float:-1.4104836E19)
            r15.X(r6)
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = 32
            if (r5 != r6) goto L_0x028e
            goto L_0x028f
        L_0x028e:
            r13 = r4
        L_0x028f:
            java.lang.Object r4 = r15.g()
            if (r13 != 0) goto L_0x029d
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x02a5
        L_0x029d:
            com.hansecom.abt.presentation.screens.helpRequest.y r4 = new com.hansecom.abt.presentation.screens.helpRequest.y
            r4.<init>(r1)
            r15.N(r4)
        L_0x02a5:
            r6 = r4
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r15.M()
            r18 = 0
            r19 = 1408(0x580, float:1.973E-42)
            r4 = 0
            r13 = 0
            r16 = 0
            r17 = 805502976(0x30030000, float:4.765752E-10)
            r5 = r7
            r7 = r10
            r8 = r0
            r10 = r12
            r12 = r4
            r0 = r15
            r15 = r16
            r16 = r0
            com.hansecom.abt.ui.components.formFields.CardNumberFieldKt.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.M()
        L_0x02c5:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x02ce
            androidx.compose.runtime.ComposerKt.X()
        L_0x02ce:
            androidx.compose.runtime.ScopeUpdateScope r0 = r0.x()
            if (r0 == 0) goto L_0x02de
            com.hansecom.abt.presentation.screens.helpRequest.z r4 = new com.hansecom.abt.presentation.screens.helpRequest.z
            r5 = r27
            r4.<init>(r5, r1, r2, r3)
            r0.a(r4)
        L_0x02de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.F(com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State, kotlin.jvm.functions.Function1, androidx.compose.ui.focus.FocusManager, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit G(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(new HelpRequest.Action.CardNumberOpenSelector(true));
        return Unit.f40552a;
    }

    public static final Unit H(Function1 function1) {
        function1.invoke(new HelpRequest.Action.CardNumberSelect((CardNumberState) null));
        return Unit.f40552a;
    }

    public static final Unit I(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new HelpRequest.Action.CardNumberChange(str));
        return Unit.f40552a;
    }

    public static final Unit J(Function1 function1, CardNumberState cardNumberState) {
        Intrinsics.i(cardNumberState, "it");
        function1.invoke(new HelpRequest.Action.CardNumberSelect(cardNumberState));
        return Unit.f40552a;
    }

    public static final Unit K(Function1 function1) {
        function1.invoke(new HelpRequest.Action.CardNumberOpenSelector(false));
        return Unit.f40552a;
    }

    public static final Unit L(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new HelpRequest.Action.CardNumberChange(str));
        return Unit.f40552a;
    }

    public static final Unit M(HelpRequest.State state, Function1 function1, FocusManager focusManager, int i2, Composer composer, int i3) {
        F(state, function1, focusManager, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void N(com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State r24, kotlin.jvm.functions.Function1 r25, androidx.compose.ui.focus.FocusManager r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r28
            r4 = -1981559292(0xffffffff89e3ce04, float:-5.4842E-33)
            r5 = r27
            androidx.compose.runtime.Composer r15 = r5.q(r4)
            r5 = r3 & 6
            if (r5 != 0) goto L_0x0020
            boolean r5 = r15.W(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r3
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r6 = r3 & 48
            r14 = 32
            if (r6 != 0) goto L_0x0032
            boolean r6 = r15.l(r1)
            if (r6 == 0) goto L_0x002f
            r6 = r14
            goto L_0x0031
        L_0x002f:
            r6 = 16
        L_0x0031:
            r5 = r5 | r6
        L_0x0032:
            r6 = r3 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0042
            boolean r6 = r15.l(r2)
            if (r6 == 0) goto L_0x003f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0041
        L_0x003f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0041:
            r5 = r5 | r6
        L_0x0042:
            r6 = r5 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x0055
            boolean r6 = r15.t()
            if (r6 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            r15.B()
            r14 = r15
            goto L_0x01b6
        L_0x0055:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0061
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.helpRequest.CaseCategoryField (HelpRequestScreen.kt:269)"
            androidx.compose.runtime.ComposerKt.Y(r4, r5, r6, r7)
        L_0x0061:
            java.lang.String r4 = r24.j()
            int r6 = com.hansecom.abt.R.string.O5
            com.hansecom.abt.data.config.help.HelpScreenConfig r7 = r24.v()
            java.lang.Boolean r7 = r7.b()
            r13 = 0
            java.lang.String r6 = x0(r6, r7, r15, r13)
            int r7 = com.hansecom.abt.R.string.P5
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.String r10 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r7, r8, r15, r13)
            com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r24.k()
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.String r11 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r7, r8, r15, r13)
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r8 = 0
            r9 = 0
            r12 = 1
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r7, r8, r12, r9)
            r7 = 793500158(0x2f4bd9fe, float:1.8540189E-10)
            r15.X(r7)
            boolean r7 = r15.l(r2)
            r9 = r5 & 112(0x70, float:1.57E-43)
            if (r9 != r14) goto L_0x009f
            r5 = r12
            goto L_0x00a0
        L_0x009f:
            r5 = r13
        L_0x00a0:
            r5 = r5 | r7
            java.lang.Object r7 = r15.g()
            if (r5 != 0) goto L_0x00af
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x00b7
        L_0x00af:
            com.hansecom.abt.presentation.screens.helpRequest.P r7 = new com.hansecom.abt.presentation.screens.helpRequest.P
            r7.<init>(r2, r1)
            r15.N(r7)
        L_0x00b7:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r15.M()
            r5 = 793504348(0x2f4bea5c, float:1.8546004E-10)
            r15.X(r5)
            if (r9 != r14) goto L_0x00c6
            r5 = r12
            goto L_0x00c7
        L_0x00c6:
            r5 = r13
        L_0x00c7:
            java.lang.Object r12 = r15.g()
            if (r5 != 0) goto L_0x00d5
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r12 != r5) goto L_0x00dd
        L_0x00d5:
            com.hansecom.abt.presentation.screens.helpRequest.Q r12 = new com.hansecom.abt.presentation.screens.helpRequest.Q
            r12.<init>(r1)
            r15.N(r12)
        L_0x00dd:
            r16 = r12
            kotlin.jvm.functions.Function0 r16 = (kotlin.jvm.functions.Function0) r16
            r15.M()
            r18 = 0
            r19 = 912(0x390, float:1.278E-42)
            r12 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 3072(0xc00, float:4.305E-42)
            r5 = r4
            r4 = r9
            r9 = r12
            r23 = 1
            r12 = r17
            r13 = r20
            r14 = r21
            r27 = r15
            r15 = r16
            r16 = r27
            r17 = r22
            com.hansecom.abt.ui.components.formFields.DropdownTextFieldKt.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r5 = com.hansecom.abt.R.string.O5
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r14 = r27
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r7, r14, r6)
            kotlinx.collections.immutable.ImmutableList r7 = r24.i()
            r8 = 793512505(0x2f4c0a39, float:1.8557324E-10)
            r14.X(r8)
            java.lang.Object r8 = r14.g()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r9.a()
            if (r8 != r10) goto L_0x0130
            com.hansecom.abt.presentation.screens.helpRequest.n r8 = new com.hansecom.abt.presentation.screens.helpRequest.n
            r8.<init>()
            r14.N(r8)
        L_0x0130:
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r14.M()
            r10 = 793513401(0x2f4c0db9, float:1.8558567E-10)
            r14.X(r10)
            java.lang.Object r10 = r14.g()
            java.lang.Object r11 = r9.a()
            if (r10 != r11) goto L_0x014d
            com.hansecom.abt.presentation.screens.helpRequest.o r10 = new com.hansecom.abt.presentation.screens.helpRequest.o
            r10.<init>()
            r14.N(r10)
        L_0x014d:
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r14.M()
            r11 = 793514428(0x2f4c11bc, float:1.8559992E-10)
            r14.X(r11)
            r11 = 32
            if (r4 != r11) goto L_0x015f
            r13 = r23
            goto L_0x0160
        L_0x015f:
            r13 = r6
        L_0x0160:
            java.lang.Object r12 = r14.g()
            if (r13 != 0) goto L_0x016c
            java.lang.Object r13 = r9.a()
            if (r12 != r13) goto L_0x0174
        L_0x016c:
            com.hansecom.abt.presentation.screens.helpRequest.p r12 = new com.hansecom.abt.presentation.screens.helpRequest.p
            r12.<init>(r1)
            r14.N(r12)
        L_0x0174:
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r14.M()
            boolean r13 = r24.l()
            r15 = 793518053(0x2f4c1fe5, float:1.8565023E-10)
            r14.X(r15)
            if (r4 != r11) goto L_0x0187
            r6 = r23
        L_0x0187:
            java.lang.Object r4 = r14.g()
            if (r6 != 0) goto L_0x0193
            java.lang.Object r6 = r9.a()
            if (r4 != r6) goto L_0x019b
        L_0x0193:
            com.hansecom.abt.presentation.screens.helpRequest.q r4 = new com.hansecom.abt.presentation.screens.helpRequest.q
            r4.<init>(r1)
            r14.N(r4)
        L_0x019b:
            r11 = r4
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            r14.M()
            r4 = 3456(0xd80, float:4.843E-42)
            r6 = r7
            r7 = r8
            r8 = r10
            r9 = r12
            r10 = r13
            r12 = r14
            r13 = r4
            com.hansecom.abt.ui.components.bottomSheet.OptionsBottomSheetKt.h(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x01b6
            androidx.compose.runtime.ComposerKt.X()
        L_0x01b6:
            androidx.compose.runtime.ScopeUpdateScope r4 = r14.x()
            if (r4 == 0) goto L_0x01c4
            com.hansecom.abt.presentation.screens.helpRequest.r r5 = new com.hansecom.abt.presentation.screens.helpRequest.r
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.N(com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State, kotlin.jvm.functions.Function1, androidx.compose.ui.focus.FocusManager, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit O(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(new HelpRequest.Action.CaseCategoryOpenSelector(true));
        return Unit.f40552a;
    }

    public static final Unit P(Function1 function1) {
        function1.invoke(new HelpRequest.Action.CaseCategoryChange(""));
        return Unit.f40552a;
    }

    public static final Object Q(String str) {
        Intrinsics.i(str, "it");
        return str;
    }

    public static final String R(String str) {
        Intrinsics.i(str, "it");
        return str;
    }

    public static final Unit S(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new HelpRequest.Action.CaseCategoryChange(str));
        return Unit.f40552a;
    }

    public static final Unit T(Function1 function1) {
        function1.invoke(new HelpRequest.Action.CaseCategoryOpenSelector(false));
        return Unit.f40552a;
    }

    public static final Unit U(HelpRequest.State state, Function1 function1, FocusManager focusManager, int i2, Composer composer, int i3) {
        N(state, function1, focusManager, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void V(com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State r24, kotlin.jvm.functions.Function1 r25, androidx.compose.ui.focus.FocusManager r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r28
            r4 = 583047806(0x22c09a7e, float:5.220528E-18)
            r5 = r27
            androidx.compose.runtime.Composer r15 = r5.q(r4)
            r5 = r3 & 6
            if (r5 != 0) goto L_0x0020
            boolean r5 = r15.W(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r3
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r6 = r3 & 48
            r14 = 32
            if (r6 != 0) goto L_0x0032
            boolean r6 = r15.l(r1)
            if (r6 == 0) goto L_0x002f
            r6 = r14
            goto L_0x0031
        L_0x002f:
            r6 = 16
        L_0x0031:
            r5 = r5 | r6
        L_0x0032:
            r6 = r3 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0042
            boolean r6 = r15.l(r2)
            if (r6 == 0) goto L_0x003f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0041
        L_0x003f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0041:
            r5 = r5 | r6
        L_0x0042:
            r6 = r5 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x0055
            boolean r6 = r15.t()
            if (r6 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            r15.B()
            r14 = r15
            goto L_0x01b6
        L_0x0055:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0061
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.helpRequest.CaseReasonField (HelpRequestScreen.kt:356)"
            androidx.compose.runtime.ComposerKt.Y(r4, r5, r6, r7)
        L_0x0061:
            java.lang.String r4 = r24.n()
            int r6 = com.hansecom.abt.R.string.R5
            com.hansecom.abt.data.config.help.HelpScreenConfig r7 = r24.v()
            java.lang.Boolean r7 = r7.c()
            r13 = 0
            java.lang.String r6 = x0(r6, r7, r15, r13)
            int r7 = com.hansecom.abt.R.string.S5
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.String r10 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r7, r8, r15, r13)
            com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r24.o()
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.String r11 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r7, r8, r15, r13)
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r8 = 0
            r9 = 0
            r12 = 1
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r7, r8, r12, r9)
            r7 = -71701994(0xfffffffffbb9ea16, float:-1.9306455E36)
            r15.X(r7)
            boolean r7 = r15.l(r2)
            r9 = r5 & 112(0x70, float:1.57E-43)
            if (r9 != r14) goto L_0x009f
            r5 = r12
            goto L_0x00a0
        L_0x009f:
            r5 = r13
        L_0x00a0:
            r5 = r5 | r7
            java.lang.Object r7 = r15.g()
            if (r5 != 0) goto L_0x00af
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x00b7
        L_0x00af:
            com.hansecom.abt.presentation.screens.helpRequest.x r7 = new com.hansecom.abt.presentation.screens.helpRequest.x
            r7.<init>(r2, r1)
            r15.N(r7)
        L_0x00b7:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r15.M()
            r5 = -71697868(0xfffffffffbb9fa34, float:-1.9312993E36)
            r15.X(r5)
            if (r9 != r14) goto L_0x00c6
            r5 = r12
            goto L_0x00c7
        L_0x00c6:
            r5 = r13
        L_0x00c7:
            java.lang.Object r12 = r15.g()
            if (r5 != 0) goto L_0x00d5
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r12 != r5) goto L_0x00dd
        L_0x00d5:
            com.hansecom.abt.presentation.screens.helpRequest.I r12 = new com.hansecom.abt.presentation.screens.helpRequest.I
            r12.<init>(r1)
            r15.N(r12)
        L_0x00dd:
            r16 = r12
            kotlin.jvm.functions.Function0 r16 = (kotlin.jvm.functions.Function0) r16
            r15.M()
            r18 = 0
            r19 = 912(0x390, float:1.278E-42)
            r12 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 3072(0xc00, float:4.305E-42)
            r5 = r4
            r4 = r9
            r9 = r12
            r23 = 1
            r12 = r17
            r13 = r20
            r14 = r21
            r27 = r15
            r15 = r16
            r16 = r27
            r17 = r22
            com.hansecom.abt.ui.components.formFields.DropdownTextFieldKt.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r5 = com.hansecom.abt.R.string.R5
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r14 = r27
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r7, r14, r6)
            kotlinx.collections.immutable.ImmutableList r7 = r24.q()
            r8 = -71689933(0xfffffffffbba1933, float:-1.9325566E36)
            r14.X(r8)
            java.lang.Object r8 = r14.g()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r9.a()
            if (r8 != r10) goto L_0x0130
            com.hansecom.abt.presentation.screens.helpRequest.K r8 = new com.hansecom.abt.presentation.screens.helpRequest.K
            r8.<init>()
            r14.N(r8)
        L_0x0130:
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r14.M()
            r10 = -71689037(0xfffffffffbba1cb3, float:-1.9326986E36)
            r14.X(r10)
            java.lang.Object r10 = r14.g()
            java.lang.Object r11 = r9.a()
            if (r10 != r11) goto L_0x014d
            com.hansecom.abt.presentation.screens.helpRequest.L r10 = new com.hansecom.abt.presentation.screens.helpRequest.L
            r10.<init>()
            r14.N(r10)
        L_0x014d:
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r14.M()
            r11 = -71688012(0xfffffffffbba20b4, float:-1.932861E36)
            r14.X(r11)
            r11 = 32
            if (r4 != r11) goto L_0x015f
            r13 = r23
            goto L_0x0160
        L_0x015f:
            r13 = r6
        L_0x0160:
            java.lang.Object r12 = r14.g()
            if (r13 != 0) goto L_0x016c
            java.lang.Object r13 = r9.a()
            if (r12 != r13) goto L_0x0174
        L_0x016c:
            com.hansecom.abt.presentation.screens.helpRequest.M r12 = new com.hansecom.abt.presentation.screens.helpRequest.M
            r12.<init>(r1)
            r14.N(r12)
        L_0x0174:
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r14.M()
            boolean r13 = r24.p()
            r15 = -71684515(0xfffffffffbba2e5d, float:-1.9334151E36)
            r14.X(r15)
            if (r4 != r11) goto L_0x0187
            r6 = r23
        L_0x0187:
            java.lang.Object r4 = r14.g()
            if (r6 != 0) goto L_0x0193
            java.lang.Object r6 = r9.a()
            if (r4 != r6) goto L_0x019b
        L_0x0193:
            com.hansecom.abt.presentation.screens.helpRequest.N r4 = new com.hansecom.abt.presentation.screens.helpRequest.N
            r4.<init>(r1)
            r14.N(r4)
        L_0x019b:
            r11 = r4
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            r14.M()
            r4 = 3456(0xd80, float:4.843E-42)
            r6 = r7
            r7 = r8
            r8 = r10
            r9 = r12
            r10 = r13
            r12 = r14
            r13 = r4
            com.hansecom.abt.ui.components.bottomSheet.OptionsBottomSheetKt.h(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x01b6
            androidx.compose.runtime.ComposerKt.X()
        L_0x01b6:
            androidx.compose.runtime.ScopeUpdateScope r4 = r14.x()
            if (r4 == 0) goto L_0x01c4
            com.hansecom.abt.presentation.screens.helpRequest.O r5 = new com.hansecom.abt.presentation.screens.helpRequest.O
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.V(com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State, kotlin.jvm.functions.Function1, androidx.compose.ui.focus.FocusManager, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit W(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(new HelpRequest.Action.CaseReasonOpenSelector(true));
        return Unit.f40552a;
    }

    public static final Unit X(Function1 function1) {
        function1.invoke(new HelpRequest.Action.CaseReasonChange(""));
        return Unit.f40552a;
    }

    public static final Object Y(String str) {
        Intrinsics.i(str, "it");
        return str;
    }

    public static final String Z(String str) {
        Intrinsics.i(str, "it");
        return str;
    }

    public static final Unit a0(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new HelpRequest.Action.CaseReasonChange(str));
        return Unit.f40552a;
    }

    public static final Unit b0(Function1 function1) {
        function1.invoke(new HelpRequest.Action.CaseReasonOpenSelector(false));
        return Unit.f40552a;
    }

    public static final Unit c0(HelpRequest.State state, Function1 function1, FocusManager focusManager, int i2, Composer composer, int i3) {
        V(state, function1, focusManager, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d0(com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State r24, kotlin.jvm.functions.Function1 r25, androidx.compose.ui.focus.FocusManager r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r28
            r4 = -2072498666(0xffffffff84782e16, float:-2.9173422E-36)
            r5 = r27
            androidx.compose.runtime.Composer r15 = r5.q(r4)
            r5 = r3 & 6
            if (r5 != 0) goto L_0x0020
            boolean r5 = r15.W(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r3
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r6 = r3 & 48
            r14 = 32
            if (r6 != 0) goto L_0x0032
            boolean r6 = r15.l(r1)
            if (r6 == 0) goto L_0x002f
            r6 = r14
            goto L_0x0031
        L_0x002f:
            r6 = 16
        L_0x0031:
            r5 = r5 | r6
        L_0x0032:
            r6 = r3 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0042
            boolean r6 = r15.l(r2)
            if (r6 == 0) goto L_0x003f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0041
        L_0x003f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0041:
            r5 = r5 | r6
        L_0x0042:
            r6 = r5 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x0055
            boolean r6 = r15.t()
            if (r6 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            r15.B()
            r14 = r15
            goto L_0x01b6
        L_0x0055:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0061
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.helpRequest.CaseResolutionField (HelpRequestScreen.kt:236)"
            androidx.compose.runtime.ComposerKt.Y(r4, r5, r6, r7)
        L_0x0061:
            java.lang.String r4 = r24.r()
            int r6 = com.hansecom.abt.R.string.U5
            com.hansecom.abt.data.config.help.HelpScreenConfig r7 = r24.v()
            java.lang.Boolean r7 = r7.d()
            r13 = 0
            java.lang.String r6 = x0(r6, r7, r15, r13)
            int r7 = com.hansecom.abt.R.string.V5
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.String r10 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r7, r8, r15, r13)
            com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r24.s()
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.String r11 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r7, r8, r15, r13)
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r8 = 0
            r9 = 0
            r12 = 1
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r7, r8, r12, r9)
            r7 = 1144363218(0x443598d2, float:726.3878)
            r15.X(r7)
            boolean r7 = r15.l(r2)
            r9 = r5 & 112(0x70, float:1.57E-43)
            if (r9 != r14) goto L_0x009f
            r5 = r12
            goto L_0x00a0
        L_0x009f:
            r5 = r13
        L_0x00a0:
            r5 = r5 | r7
            java.lang.Object r7 = r15.g()
            if (r5 != 0) goto L_0x00af
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x00b7
        L_0x00af:
            com.hansecom.abt.presentation.screens.helpRequest.A r7 = new com.hansecom.abt.presentation.screens.helpRequest.A
            r7.<init>(r2, r1)
            r15.N(r7)
        L_0x00b7:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r15.M()
            r5 = 1144367472(0x4435a970, float:726.64746)
            r15.X(r5)
            if (r9 != r14) goto L_0x00c6
            r5 = r12
            goto L_0x00c7
        L_0x00c6:
            r5 = r13
        L_0x00c7:
            java.lang.Object r12 = r15.g()
            if (r5 != 0) goto L_0x00d5
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r12 != r5) goto L_0x00dd
        L_0x00d5:
            com.hansecom.abt.presentation.screens.helpRequest.B r12 = new com.hansecom.abt.presentation.screens.helpRequest.B
            r12.<init>(r1)
            r15.N(r12)
        L_0x00dd:
            r16 = r12
            kotlin.jvm.functions.Function0 r16 = (kotlin.jvm.functions.Function0) r16
            r15.M()
            r18 = 0
            r19 = 912(0x390, float:1.278E-42)
            r12 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 3072(0xc00, float:4.305E-42)
            r5 = r4
            r4 = r9
            r9 = r12
            r23 = 1
            r12 = r17
            r13 = r20
            r14 = r21
            r27 = r15
            r15 = r16
            r16 = r27
            r17 = r22
            com.hansecom.abt.ui.components.formFields.DropdownTextFieldKt.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r5 = com.hansecom.abt.R.string.U5
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r14 = r27
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r7, r14, r6)
            kotlinx.collections.immutable.ImmutableList r7 = r24.u()
            r8 = 1144375787(0x4435c9eb, float:727.15497)
            r14.X(r8)
            java.lang.Object r8 = r14.g()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r9.a()
            if (r8 != r10) goto L_0x0130
            com.hansecom.abt.presentation.screens.helpRequest.C r8 = new com.hansecom.abt.presentation.screens.helpRequest.C
            r8.<init>()
            r14.N(r8)
        L_0x0130:
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r14.M()
            r10 = 1144376683(0x4435cd6b, float:727.20966)
            r14.X(r10)
            java.lang.Object r10 = r14.g()
            java.lang.Object r11 = r9.a()
            if (r10 != r11) goto L_0x014d
            com.hansecom.abt.presentation.screens.helpRequest.D r10 = new com.hansecom.abt.presentation.screens.helpRequest.D
            r10.<init>()
            r14.N(r10)
        L_0x014d:
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r14.M()
            r11 = 1144377712(0x4435d170, float:727.27246)
            r14.X(r11)
            r11 = 32
            if (r4 != r11) goto L_0x015f
            r13 = r23
            goto L_0x0160
        L_0x015f:
            r13 = r6
        L_0x0160:
            java.lang.Object r12 = r14.g()
            if (r13 != 0) goto L_0x016c
            java.lang.Object r13 = r9.a()
            if (r12 != r13) goto L_0x0174
        L_0x016c:
            com.hansecom.abt.presentation.screens.helpRequest.E r12 = new com.hansecom.abt.presentation.screens.helpRequest.E
            r12.<init>(r1)
            r14.N(r12)
        L_0x0174:
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r14.M()
            boolean r13 = r24.t()
            r15 = 1144381465(0x4435e019, float:727.5015)
            r14.X(r15)
            if (r4 != r11) goto L_0x0187
            r6 = r23
        L_0x0187:
            java.lang.Object r4 = r14.g()
            if (r6 != 0) goto L_0x0193
            java.lang.Object r6 = r9.a()
            if (r4 != r6) goto L_0x019b
        L_0x0193:
            com.hansecom.abt.presentation.screens.helpRequest.F r4 = new com.hansecom.abt.presentation.screens.helpRequest.F
            r4.<init>(r1)
            r14.N(r4)
        L_0x019b:
            r11 = r4
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            r14.M()
            r4 = 3456(0xd80, float:4.843E-42)
            r6 = r7
            r7 = r8
            r8 = r10
            r9 = r12
            r10 = r13
            r12 = r14
            r13 = r4
            com.hansecom.abt.ui.components.bottomSheet.OptionsBottomSheetKt.h(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x01b6
            androidx.compose.runtime.ComposerKt.X()
        L_0x01b6:
            androidx.compose.runtime.ScopeUpdateScope r4 = r14.x()
            if (r4 == 0) goto L_0x01c4
            com.hansecom.abt.presentation.screens.helpRequest.G r5 = new com.hansecom.abt.presentation.screens.helpRequest.G
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.d0(com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State, kotlin.jvm.functions.Function1, androidx.compose.ui.focus.FocusManager, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit e0(Function1 function1) {
        function1.invoke(new HelpRequest.Action.CaseResolutionChange(""));
        return Unit.f40552a;
    }

    public static final Object f0(String str) {
        Intrinsics.i(str, "it");
        return str;
    }

    public static final String g0(String str) {
        Intrinsics.i(str, "it");
        return str;
    }

    public static final Unit h0(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new HelpRequest.Action.CaseResolutionChange(str));
        return Unit.f40552a;
    }

    public static final Unit i0(Function1 function1) {
        function1.invoke(new HelpRequest.Action.CaseResolutionOpenSelector(false));
        return Unit.f40552a;
    }

    public static final Unit j0(HelpRequest.State state, Function1 function1, FocusManager focusManager, int i2, Composer composer, int i3) {
        d0(state, function1, focusManager, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit k0(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(new HelpRequest.Action.CaseResolutionOpenSelector(true));
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if ((r14 & 1) != 0) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l0(com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel r10, kotlin.jvm.functions.Function0 r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "onUp"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = -1607050637(0xffffffffa0365a73, float:-1.5445927E-19)
            androidx.compose.runtime.Composer r12 = r12.q(r0)
            r1 = r13 & 6
            if (r1 != 0) goto L_0x001f
            r1 = r14 & 1
            if (r1 != 0) goto L_0x001c
            boolean r1 = r12.l(r10)
            if (r1 == 0) goto L_0x001c
            r1 = 4
            goto L_0x001d
        L_0x001c:
            r1 = 2
        L_0x001d:
            r1 = r1 | r13
            goto L_0x0020
        L_0x001f:
            r1 = r13
        L_0x0020:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0028
            r1 = r1 | 48
        L_0x0026:
            r9 = r1
            goto L_0x0039
        L_0x0028:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0026
            boolean r2 = r12.l(r11)
            if (r2 == 0) goto L_0x0035
            r2 = 32
            goto L_0x0037
        L_0x0035:
            r2 = 16
        L_0x0037:
            r1 = r1 | r2
            goto L_0x0026
        L_0x0039:
            r1 = r9 & 19
            r2 = 18
            if (r1 != r2) goto L_0x004b
            boolean r1 = r12.t()
            if (r1 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r12.B()
            goto L_0x010b
        L_0x004b:
            r12.p()
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0063
            boolean r1 = r12.J()
            if (r1 == 0) goto L_0x0059
            goto L_0x0063
        L_0x0059:
            r12.B()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x00af
        L_0x0060:
            r9 = r9 & -15
            goto L_0x00af
        L_0x0063:
            r1 = r14 & 1
            if (r1 == 0) goto L_0x00af
            r10 = 1890788296(0x70b323c8, float:4.435286E29)
            r12.f(r10)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r10 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r10.c(r12, r1)
            if (r2 == 0) goto L_0x00a7
            r10 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r12, r10)
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.f(r10)
            boolean r10 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r10 == 0) goto L_0x008f
            r10 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r10 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r10
            androidx.lifecycle.viewmodel.CreationExtras r10 = r10.n()
        L_0x008d:
            r5 = r10
            goto L_0x0092
        L_0x008f:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x008d
        L_0x0092:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel> r1 = com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.S()
            r12.S()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel r10 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel) r10
            goto L_0x0060
        L_0x00a7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00af:
            r12.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00be
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreen (HelpRequestScreen.kt:59)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00be:
            int r0 = r9 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r10
            r4 = r12
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r1 = m0(r1)
            r2 = -1353980878(0xffffffffaf4be432, float:-1.8543814E-10)
            r12.X(r2)
            boolean r2 = r12.l(r10)
            java.lang.Object r3 = r12.g()
            if (r2 != 0) goto L_0x00e7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00ef
        L_0x00e7:
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt$HelpRequestScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt$HelpRequestScreen$1$1
            r3.<init>(r10)
            r12.N(r3)
        L_0x00ef:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r12.M()
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r10.l()
            r6 = r0 & 7168(0x1c00, float:1.0045E-41)
            r4 = r11
            r5 = r12
            o0(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x010b
            androidx.compose.runtime.ComposerKt.X()
        L_0x010b:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x0119
            com.hansecom.abt.presentation.screens.helpRequest.m r0 = new com.hansecom.abt.presentation.screens.helpRequest.m
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.l0(com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final HelpRequest.State m0(State state) {
        return (HelpRequest.State) state.getValue();
    }

    public static final Unit n0(HelpRequestViewModel helpRequestViewModel, Function0 function0, int i2, int i3, Composer composer, int i4) {
        l0(helpRequestViewModel, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o0(com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State r32, kotlin.jvm.functions.Function1 r33, kotlinx.coroutines.flow.Flow r34, kotlin.jvm.functions.Function0 r35, androidx.compose.runtime.Composer r36, int r37) {
        /*
            r6 = r33
            r7 = r35
            r8 = r37
            r0 = -624187365(0xffffffffdacba81b, float:-2.86621271E16)
            r1 = r36
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r8 & 6
            r14 = r32
            if (r1 != 0) goto L_0x0020
            boolean r1 = r15.W(r14)
            if (r1 == 0) goto L_0x001d
            r1 = 4
            goto L_0x001e
        L_0x001d:
            r1 = 2
        L_0x001e:
            r1 = r1 | r8
            goto L_0x0021
        L_0x0020:
            r1 = r8
        L_0x0021:
            r2 = r8 & 48
            r12 = 32
            if (r2 != 0) goto L_0x0032
            boolean r2 = r15.l(r6)
            if (r2 == 0) goto L_0x002f
            r2 = r12
            goto L_0x0031
        L_0x002f:
            r2 = 16
        L_0x0031:
            r1 = r1 | r2
        L_0x0032:
            r2 = r8 & 384(0x180, float:5.38E-43)
            r13 = r34
            if (r2 != 0) goto L_0x0044
            boolean r2 = r15.l(r13)
            if (r2 == 0) goto L_0x0041
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r1 = r1 | r2
        L_0x0044:
            r2 = r8 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0054
            boolean r2 = r15.l(r7)
            if (r2 == 0) goto L_0x0051
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r1 = r1 | r2
        L_0x0054:
            r11 = r1
            r1 = r11 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r1 != r2) goto L_0x0068
            boolean r1 = r15.t()
            if (r1 != 0) goto L_0x0062
            goto L_0x0068
        L_0x0062:
            r15.B()
            r0 = r15
            goto L_0x01d4
        L_0x0068:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0074
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.helpRequest.ScreenImpl (HelpRequestScreen.kt:76)"
            androidx.compose.runtime.ComposerKt.Y(r0, r11, r1, r2)
        L_0x0074:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r0 = r15.C(r0)
            r5 = r0
            androidx.compose.ui.focus.FocusManager r5 = (androidx.compose.ui.focus.FocusManager) r5
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r15.C(r0)
            r9 = r0
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r9 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r9
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt$ScreenImpl$1 r4 = new com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt$ScreenImpl$1
            r0 = r4
            r1 = r32
            r2 = r35
            r3 = r9
            r10 = r4
            r4 = r33
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 54
            r1 = 471025756(0x1c13485c, float:4.873174E-22)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r2, r10, r15, r0)
            r16 = 3072(0xc00, float:4.305E-42)
            r17 = 7
            r1 = 0
            r3 = 0
            r18 = 0
            r5 = r9
            r9 = r1
            r2 = r11
            r1 = 2048(0x800, float:2.87E-42)
            r10 = r3
            r3 = r12
            r12 = r18
            r14 = r0
            r0 = r15
            com.hansecom.abt.ui.components.ScreenContentKt.d(r9, r10, r12, r14, r15, r16, r17)
            boolean r4 = r32.H()
            r15 = 0
            r14 = 0
            if (r4 == 0) goto L_0x0102
            r3 = -976482615(0xffffffffc5cc0ec9, float:-6529.848)
            r0.X(r3)
            int r3 = com.hansecom.abt.R.string.g6
            java.lang.Object[] r4 = new java.lang.Object[r14]
            java.lang.String r17 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r4, r0, r14)
            int r3 = com.hansecom.abt.R.string.h6
            java.lang.Object[] r4 = new java.lang.Object[r14]
            java.lang.String r18 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r4, r0, r14)
            com.hansecom.abt.ui.components.dialog.AbtDialogState r3 = new com.hansecom.abt.ui.components.dialog.AbtDialogState
            com.hansecom.abt.presentation.screens.helpRequest.ComposableSingletons$HelpRequestScreenKt r4 = com.hansecom.abt.presentation.screens.helpRequest.ComposableSingletons$HelpRequestScreenKt.f34810a
            kotlin.jvm.functions.Function2 r19 = r4.a()
            java.lang.Boolean r29 = java.lang.Boolean.FALSE
            r30 = 4088(0xff8, float:5.729E-42)
            r31 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0.M()
        L_0x00ff:
            r9 = r3
            goto L_0x017f
        L_0x0102:
            boolean r4 = r32.I()
            if (r4 == 0) goto L_0x0175
            r4 = -976172646(0xffffffffc5d0c99a, float:-6681.2)
            r0.X(r4)
            int r4 = com.hansecom.abt.R.string.r6
            java.lang.Object[] r9 = new java.lang.Object[r14]
            java.lang.String r17 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r4, r9, r0, r14)
            int r4 = com.hansecom.abt.R.string.s6
            java.lang.Object[] r9 = new java.lang.Object[r14]
            java.lang.String r18 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r4, r9, r0, r14)
            int r4 = com.hansecom.abt.R.string.q6
            java.lang.Object[] r9 = new java.lang.Object[r14]
            java.lang.String r26 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r4, r9, r0, r14)
            com.hansecom.abt.presentation.screens.helpRequest.ComposableSingletons$HelpRequestScreenKt r4 = com.hansecom.abt.presentation.screens.helpRequest.ComposableSingletons$HelpRequestScreenKt.f34810a
            kotlin.jvm.functions.Function2 r19 = r4.b()
            r4 = 245607300(0xea3ab84, float:4.0347766E-30)
            r0.X(r4)
            r4 = r2 & 112(0x70, float:1.57E-43)
            if (r4 != r3) goto L_0x0138
            r3 = 1
            goto L_0x0139
        L_0x0138:
            r3 = r14
        L_0x0139:
            java.lang.Object r4 = r0.g()
            if (r3 != 0) goto L_0x0147
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x014f
        L_0x0147:
            com.hansecom.abt.presentation.screens.helpRequest.H r4 = new com.hansecom.abt.presentation.screens.helpRequest.H
            r4.<init>(r6)
            r0.N(r4)
        L_0x014f:
            r28 = r4
            kotlin.jvm.functions.Function0 r28 = (kotlin.jvm.functions.Function0) r28
            r0.M()
            java.lang.Boolean r29 = java.lang.Boolean.TRUE
            com.hansecom.abt.ui.components.dialog.AbtDialogState r3 = new com.hansecom.abt.ui.components.dialog.AbtDialogState
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r30 = 1528(0x5f8, float:2.141E-42)
            r31 = 0
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0.M()
            goto L_0x00ff
        L_0x0175:
            r3 = -975721256(0xffffffffc5d7acd8, float:-6901.6055)
            r0.X(r3)
            r0.M()
            r9 = r15
        L_0x017f:
            r3 = 0
            r16 = 30
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r4 = r14
            r14 = r0
            r4 = r15
            r15 = r3
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.d(r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = 245622250(0xea3e5ea, float:4.0404E-30)
            r0.X(r3)
            boolean r3 = r0.l(r5)
            r9 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != r1) goto L_0x019e
            r17 = 1
            goto L_0x01a0
        L_0x019e:
            r17 = 0
        L_0x01a0:
            r1 = r3 | r17
            java.lang.Object r3 = r0.g()
            if (r1 != 0) goto L_0x01b0
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x01b8
        L_0x01b0:
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt$ScreenImpl$2$1 r3 = new com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt$ScreenImpl$2$1
            r3.<init>(r5, r7, r4)
            r0.N(r3)
        L_0x01b8:
            r12 = r3
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r0.M()
            int r1 = r2 >> 6
            r14 = r1 & 14
            r15 = 6
            r10 = 0
            r11 = 0
            r9 = r34
            r13 = r0
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r9, r10, r11, r12, r13, r14, r15)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01d4
            androidx.compose.runtime.ComposerKt.X()
        L_0x01d4:
            androidx.compose.runtime.ScopeUpdateScope r9 = r0.x()
            if (r9 == 0) goto L_0x01ed
            com.hansecom.abt.presentation.screens.helpRequest.J r10 = new com.hansecom.abt.presentation.screens.helpRequest.J
            r0 = r10
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r9.a(r10)
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.helpRequest.HelpRequestScreenKt.o0(com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit p0(Function1 function1) {
        function1.invoke(HelpRequest.Action.CloseSuccess.f34831a);
        return Unit.f40552a;
    }

    public static final Unit q0(HelpRequest.State state, Function1 function1, Flow flow, Function0 function0, int i2, Composer composer, int i3) {
        o0(state, function1, flow, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final String x0(int i2, Boolean bool, Composer composer, int i3) {
        String str;
        if (ComposerKt.P()) {
            ComposerKt.Y(1757983503, i3, -1, "com.hansecom.abt.presentation.screens.helpRequest.getLabel (HelpRequestScreen.kt:383)");
        }
        if (!Intrinsics.d(bool, Boolean.TRUE)) {
            composer.X(-907440912);
            str = StringResourceKt.a(i2, new Object[0], composer, i3 & 14);
            composer.M();
        } else {
            composer.X(-907407959);
            str = StringResourceKt.a(i2, new Object[0], composer, i3 & 14) + " *";
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return str;
    }
}
