package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class ChangeSecurityQuestionChooseQuestionScreenKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel r8, boolean r9, kotlin.jvm.functions.Function0 r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "onUp"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            r0 = 1985617059(0x765a1ca3, float:1.1059585E33)
            androidx.compose.runtime.Composer r11 = r11.q(r0)
            r1 = r12 & 6
            if (r1 != 0) goto L_0x0020
            boolean r1 = r11.l(r8)
            if (r1 == 0) goto L_0x001d
            r1 = 4
            goto L_0x001e
        L_0x001d:
            r1 = 2
        L_0x001e:
            r1 = r1 | r12
            goto L_0x0021
        L_0x0020:
            r1 = r12
        L_0x0021:
            r2 = r12 & 48
            if (r2 != 0) goto L_0x0031
            boolean r2 = r11.d(r9)
            if (r2 == 0) goto L_0x002e
            r2 = 32
            goto L_0x0030
        L_0x002e:
            r2 = 16
        L_0x0030:
            r1 = r1 | r2
        L_0x0031:
            r2 = r12 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0041
            boolean r2 = r11.l(r10)
            if (r2 == 0) goto L_0x003e
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0040
        L_0x003e:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r1 = r1 | r2
        L_0x0041:
            r2 = r1 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 != r3) goto L_0x0052
            boolean r2 = r11.t()
            if (r2 != 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            r11.B()
            goto L_0x00b6
        L_0x0052:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x005e
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreen (ChangeSecurityQuestionChooseQuestionScreen.kt:35)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x005e:
            int r0 = r1 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r8
            r4 = r11
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State r1 = e(r1)
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Questions r1 = r1.c()
            kotlinx.coroutines.flow.Flow r2 = r8.l()
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt$ChangeSecurityQuestionChooseQuestionScreen$$inlined$filterIsInstance$1 r3 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt$ChangeSecurityQuestionChooseQuestionScreen$$inlined$filterIsInstance$1
            r3.<init>(r2)
            r2 = -1999681644(0xffffffff88cf4794, float:-1.2475187E-33)
            r11.X(r2)
            boolean r2 = r11.l(r8)
            java.lang.Object r4 = r11.g()
            if (r2 != 0) goto L_0x0094
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x009c
        L_0x0094:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.a r4 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.a
            r4.<init>(r8)
            r11.N(r4)
        L_0x009c:
            r2 = r4
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r11.M()
            r4 = 64512(0xfc00, float:9.04E-41)
            r7 = r0 & r4
            r4 = r9
            r5 = r10
            r6 = r11
            h(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00b6
            androidx.compose.runtime.ComposerKt.X()
        L_0x00b6:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.x()
            if (r11 == 0) goto L_0x00c4
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.b r0 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.b
            r0.<init>(r8, r9, r10, r12)
            r11.a(r0)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt.d(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final ChangeSecurityQuestions.State e(State state) {
        return (ChangeSecurityQuestions.State) state.getValue();
    }

    public static final Unit f(ChangeSecurityQuestionViewModel changeSecurityQuestionViewModel, ChangeSecurityQuestions.Action.Questions questions) {
        Intrinsics.i(questions, "it");
        changeSecurityQuestionViewModel.k(questions);
        return Unit.f40552a;
    }

    public static final Unit g(ChangeSecurityQuestionViewModel changeSecurityQuestionViewModel, boolean z2, Function0 function0, int i2, Composer composer, int i3) {
        d(changeSecurityQuestionViewModel, z2, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.State.Questions r19, kotlin.jvm.functions.Function1 r20, kotlinx.coroutines.flow.Flow r21, boolean r22, kotlin.jvm.functions.Function0 r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            r1 = r19
            r2 = r20
            r4 = r22
            r5 = r23
            r6 = r25
            r0 = 478359262(0x1c832ede, float:8.680968E-22)
            r3 = r24
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0022
            boolean r7 = r3.W(r1)
            if (r7 == 0) goto L_0x001f
            r7 = 4
            goto L_0x0020
        L_0x001f:
            r7 = 2
        L_0x0020:
            r7 = r7 | r6
            goto L_0x0023
        L_0x0022:
            r7 = r6
        L_0x0023:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x0033
            boolean r8 = r3.l(r2)
            if (r8 == 0) goto L_0x0030
            r8 = 32
            goto L_0x0032
        L_0x0030:
            r8 = 16
        L_0x0032:
            r7 = r7 | r8
        L_0x0033:
            r8 = r6 & 384(0x180, float:5.38E-43)
            r15 = r21
            if (r8 != 0) goto L_0x0045
            boolean r8 = r3.l(r15)
            if (r8 == 0) goto L_0x0042
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0044
        L_0x0042:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r7 = r7 | r8
        L_0x0045:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0055
            boolean r8 = r3.d(r4)
            if (r8 == 0) goto L_0x0052
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0054
        L_0x0052:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0054:
            r7 = r7 | r8
        L_0x0055:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r8 != 0) goto L_0x0066
            boolean r8 = r3.l(r5)
            if (r8 == 0) goto L_0x0063
            r8 = r14
            goto L_0x0065
        L_0x0063:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0065:
            r7 = r7 | r8
        L_0x0066:
            r13 = r7
            r7 = r13 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r8) goto L_0x0079
            boolean r7 = r3.t()
            if (r7 != 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r3.B()
            goto L_0x00ee
        L_0x0079:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0085
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ScreenImpl (ChangeSecurityQuestionChooseQuestionScreen.kt:54)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r7, r8)
        L_0x0085:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1 r0 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1
            r0.<init>(r1, r4, r2)
            r7 = 54
            r8 = 662405309(0x277b80bd, float:3.4903037E-15)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r12, r0, r3, r7)
            r16 = 3072(0xc00, float:4.305E-42)
            r17 = 7
            r7 = 0
            r8 = 0
            r10 = 0
            r18 = r12
            r12 = r0
            r0 = r13
            r13 = r3
            r14 = r16
            r15 = r17
            com.hansecom.abt.ui.components.ScreenContentKt.d(r7, r8, r10, r12, r13, r14, r15)
            r7 = 923183530(0x3706a9aa, float:8.026525E-6)
            r3.X(r7)
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r0
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r7 != r8) goto L_0x00ba
            r12 = r18
            goto L_0x00bb
        L_0x00ba:
            r12 = 0
        L_0x00bb:
            java.lang.Object r7 = r3.g()
            if (r12 != 0) goto L_0x00c9
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x00d2
        L_0x00c9:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$2$1 r7 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$2$1
            r8 = 0
            r7.<init>(r5, r8)
            r3.N(r7)
        L_0x00d2:
            r10 = r7
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r3.M()
            int r0 = r0 >> 6
            r12 = r0 & 14
            r13 = 6
            r8 = 0
            r9 = 0
            r7 = r21
            r11 = r3
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00ee
            androidx.compose.runtime.ComposerKt.X()
        L_0x00ee:
            androidx.compose.runtime.ScopeUpdateScope r7 = r3.x()
            if (r7 == 0) goto L_0x0109
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.c r8 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.c
            r0 = r8
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt.h(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Questions, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit i(ChangeSecurityQuestions.State.Questions questions, Function1 function1, Flow flow, boolean z2, Function0 function0, int i2, Composer composer, int i3) {
        h(questions, function1, flow, z2, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
