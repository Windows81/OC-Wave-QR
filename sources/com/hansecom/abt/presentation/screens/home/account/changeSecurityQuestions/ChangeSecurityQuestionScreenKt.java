package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class ChangeSecurityQuestionScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a5, code lost:
        if ((r26 & 1) != 0) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel r20, kotlin.jvm.functions.Function0 r21, kotlin.jvm.functions.Function0 r22, kotlin.jvm.functions.Function0 r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r25
            java.lang.String r0 = "onChangeQuestion"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "onSecondChangeQuestion"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "goBack"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            r0 = 1651654384(0x62723ef0, float:1.1171618E21)
            r1 = r24
            androidx.compose.runtime.Composer r7 = r1.q(r0)
            r1 = r11 & 6
            if (r1 != 0) goto L_0x0037
            r1 = r26 & 1
            if (r1 != 0) goto L_0x0032
            r1 = r20
            boolean r2 = r7.l(r1)
            if (r2 == 0) goto L_0x0034
            r2 = 4
            goto L_0x0035
        L_0x0032:
            r1 = r20
        L_0x0034:
            r2 = 2
        L_0x0035:
            r2 = r2 | r11
            goto L_0x003a
        L_0x0037:
            r1 = r20
            r2 = r11
        L_0x003a:
            r3 = r26 & 2
            if (r3 == 0) goto L_0x0041
            r2 = r2 | 48
            goto L_0x0051
        L_0x0041:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x0051
            boolean r3 = r7.l(r8)
            if (r3 == 0) goto L_0x004e
            r3 = 32
            goto L_0x0050
        L_0x004e:
            r3 = 16
        L_0x0050:
            r2 = r2 | r3
        L_0x0051:
            r3 = r26 & 4
            if (r3 == 0) goto L_0x0058
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0058:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0068
            boolean r3 = r7.l(r9)
            if (r3 == 0) goto L_0x0065
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r2 = r2 | r3
        L_0x0068:
            r3 = r26 & 8
            if (r3 == 0) goto L_0x006f
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006f:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x007f
            boolean r3 = r7.l(r10)
            if (r3 == 0) goto L_0x007c
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r2 = r2 | r3
        L_0x007f:
            r3 = r2 & 1171(0x493, float:1.641E-42)
            r4 = 1170(0x492, float:1.64E-42)
            if (r3 != r4) goto L_0x0092
            boolean r3 = r7.t()
            if (r3 != 0) goto L_0x008c
            goto L_0x0092
        L_0x008c:
            r7.B()
            r14 = r7
            goto L_0x0185
        L_0x0092:
            r7.p()
            r3 = r11 & 1
            if (r3 == 0) goto L_0x00ab
            boolean r3 = r7.J()
            if (r3 == 0) goto L_0x00a0
            goto L_0x00ab
        L_0x00a0:
            r7.B()
            r3 = r26 & 1
            if (r3 == 0) goto L_0x00a9
        L_0x00a7:
            r2 = r2 & -15
        L_0x00a9:
            r12 = r1
            goto L_0x00fa
        L_0x00ab:
            r3 = r26 & 1
            if (r3 == 0) goto L_0x00a9
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r7.f(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r3 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r13 = r1.c(r7, r3)
            if (r13 == 0) goto L_0x00f2
            r1 = 0
            androidx.lifecycle.ViewModelProvider$Factory r15 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r13, r7, r1)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r7.f(r1)
            boolean r1 = r13 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r1 == 0) goto L_0x00d8
            r1 = r13
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.n()
        L_0x00d5:
            r16 = r1
            goto L_0x00db
        L_0x00d8:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00d5
        L_0x00db:
            r18 = 36936(0x9048, float:5.1758E-41)
            r19 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel> r12 = com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel.class
            r14 = 0
            r17 = r7
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r12, r13, r14, r15, r16, r17, r18, r19)
            r7.S()
            r7.S()
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel r1 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel) r1
            goto L_0x00a7
        L_0x00f2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            r7.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0109
            r1 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreen (ChangeSecurityQuestionScreen.kt:48)"
            androidx.compose.runtime.ComposerKt.Y(r0, r2, r1, r3)
        L_0x0109:
            int r0 = r2 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r12
            r4 = r7
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            r2 = 1877038728(0x6fe15688, float:1.3947747E29)
            r7.X(r2)
            java.lang.Object r2 = r7.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r3.a()
            if (r2 != r4) goto L_0x0135
            kotlinx.coroutines.flow.Flow r2 = r12.l()
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt$ChangeSecurityQuestionScreen$lambda$1$$inlined$filterIsInstance$1 r4 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt$ChangeSecurityQuestionScreen$lambda$1$$inlined$filterIsInstance$1
            r4.<init>(r2)
            r7.N(r4)
            r2 = r4
        L_0x0135:
            kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2
            r7.M()
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State r1 = h(r1)
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Main r1 = r1.d()
            r4 = 1877042651(0x6fe165db, float:1.3951453E29)
            r7.X(r4)
            boolean r4 = r7.l(r12)
            java.lang.Object r5 = r7.g()
            if (r4 != 0) goto L_0x0158
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x0160
        L_0x0158:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt$ChangeSecurityQuestionScreen$1$1 r5 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt$ChangeSecurityQuestionScreen$1$1
            r5.<init>(r12)
            r7.N(r5)
        L_0x0160:
            kotlin.reflect.KFunction r5 = (kotlin.reflect.KFunction) r5
            r7.M()
            r3 = r5
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r4 = 523264(0x7fc00, float:7.33249E-40)
            r13 = r0 & r4
            r0 = r1
            r1 = r3
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r7
            r14 = r7
            r7 = r13
            o(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0184
            androidx.compose.runtime.ComposerKt.X()
        L_0x0184:
            r1 = r12
        L_0x0185:
            androidx.compose.runtime.ScopeUpdateScope r7 = r14.x()
            if (r7 == 0) goto L_0x019e
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.f r12 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.f
            r0 = r12
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r25
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r12)
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt.g(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ChangeSecurityQuestions.State h(State state) {
        return (ChangeSecurityQuestions.State) state.getValue();
    }

    public static final Unit i(ChangeSecurityQuestionViewModel changeSecurityQuestionViewModel, Function0 function0, Function0 function02, Function0 function03, int i2, int i3, Composer composer, int i4) {
        g(changeSecurityQuestionViewModel, function0, function02, function03, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.State.Main r40, kotlin.jvm.functions.Function0 r41, kotlin.jvm.functions.Function1 r42, kotlin.jvm.functions.Function0 r43, androidx.compose.runtime.Composer r44, int r45) {
        /*
            r3 = r42
            r5 = r45
            r0 = -939595505(0xffffffffc7fee90f, float:-130514.12)
            r1 = r44
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r5 & 6
            r4 = 2
            if (r2 != 0) goto L_0x001f
            r2 = r40
            boolean r6 = r1.W(r2)
            if (r6 == 0) goto L_0x001c
            r6 = 4
            goto L_0x001d
        L_0x001c:
            r6 = r4
        L_0x001d:
            r6 = r6 | r5
            goto L_0x0022
        L_0x001f:
            r2 = r40
            r6 = r5
        L_0x0022:
            r7 = r5 & 48
            r15 = r41
            if (r7 != 0) goto L_0x0034
            boolean r7 = r1.l(r15)
            if (r7 == 0) goto L_0x0031
            r7 = 32
            goto L_0x0033
        L_0x0031:
            r7 = 16
        L_0x0033:
            r6 = r6 | r7
        L_0x0034:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0044
            boolean r7 = r1.l(r3)
            if (r7 == 0) goto L_0x0041
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r6 = r6 | r7
        L_0x0044:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            r13 = r43
            if (r7 != 0) goto L_0x0056
            boolean r7 = r1.l(r13)
            if (r7 == 0) goto L_0x0053
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r6 = r6 | r7
        L_0x0056:
            r12 = r6
            r6 = r12 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x0069
            boolean r6 = r1.t()
            if (r6 != 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            r1.B()
            goto L_0x0398
        L_0x0069:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0075
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.Content (ChangeSecurityQuestionScreen.kt:98)"
            androidx.compose.runtime.ComposerKt.Y(r0, r12, r6, r7)
        L_0x0075:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r0 = r1.C(r0)
            androidx.compose.ui.focus.FocusManager r0 = (androidx.compose.ui.focus.FocusManager) r0
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.f15489d
            r10 = 0
            r9 = 1
            r8 = 0
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.f(r11, r10, r9, r8)
            com.hansecom.abt.ui.theme.Dimensions r26 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r7 = r26.c()
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.k(r6, r7, r10, r4, r8)
            float r18 = r26.d()
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r27 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
            r4 = 0
            androidx.compose.foundation.ScrollState r28 = androidx.compose.foundation.ScrollKt.c(r4, r1, r4, r9)
            r32 = 14
            r33 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.ScrollKt.g(r27, r28, r29, r30, r31, r32, r33)
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r7 = r7.g()
            androidx.compose.ui.Alignment$Companion r27 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r14 = r27.k()
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.ColumnKt.a(r7, r14, r1, r4)
            int r14 = androidx.compose.runtime.ComposablesKt.a(r1, r4)
            androidx.compose.runtime.CompositionLocalMap r4 = r1.I()
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.ComposedModifierKt.e(r1, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r8 = r16.a()
            androidx.compose.runtime.Applier r18 = r1.v()
            if (r18 != 0) goto L_0x00e2
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00e2:
            r1.s()
            boolean r18 = r1.n()
            if (r18 == 0) goto L_0x00ef
            r1.y(r8)
            goto L_0x00f2
        L_0x00ef:
            r1.K()
        L_0x00f2:
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.b(r1)
            kotlin.jvm.functions.Function2 r9 = r16.c()
            androidx.compose.runtime.Updater.g(r8, r7, r9)
            kotlin.jvm.functions.Function2 r7 = r16.e()
            androidx.compose.runtime.Updater.g(r8, r4, r7)
            kotlin.jvm.functions.Function2 r4 = r16.b()
            boolean r7 = r8.n()
            if (r7 != 0) goto L_0x011c
            java.lang.Object r7 = r8.g()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r9)
            if (r7 != 0) goto L_0x012a
        L_0x011c:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r8.N(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r8.A(r7, r4)
        L_0x012a:
            kotlin.jvm.functions.Function2 r4 = r16.d()
            androidx.compose.runtime.Updater.g(r8, r6, r4)
            androidx.compose.foundation.layout.ColumnScopeInstance r4 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            java.lang.String r6 = r40.c()
            r8 = 0
            r9 = 1
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r11, r10, r9, r8)
            java.lang.String r14 = "question1"
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.platform.TestTagKt.a(r7, r14)
            int r16 = com.hansecom.abt.R.string.w2
            int r7 = com.hansecom.abt.R.string.v2
            r8 = 0
            java.lang.String r18 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r1, r8)
            r7 = 930125556(0x377096f4, float:1.4340261E-5)
            r1.X(r7)
            boolean r7 = r40.f()
            java.lang.String r29 = ""
            if (r7 != 0) goto L_0x0163
            int r7 = com.hansecom.abt.R.string.u2
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r1, r8)
            r19 = r7
            goto L_0x0165
        L_0x0163:
            r19 = r29
        L_0x0165:
            r1.M()
            r7 = r12 & 112(0x70, float:1.57E-43)
            r8 = r7 | 3072(0xc00, float:4.305E-42)
            r20 = 64
            r21 = 0
            r7 = r41
            r17 = r8
            r8 = r16
            r9 = r14
            r14 = r10
            r10 = r18
            r34 = r11
            r11 = r19
            r35 = r12
            r12 = r21
            r13 = r1
            r14 = r17
            r15 = r20
            com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt.d(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r6 = r40.d()
            int r8 = com.hansecom.abt.R.string.s2
            int r7 = com.hansecom.abt.R.string.r2
            r9 = 0
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r1, r9)
            r7 = 930143336(0x3770dc68, float:1.4356432E-5)
            r1.X(r7)
            boolean r7 = r40.e()
            if (r7 != 0) goto L_0x01ab
            int r7 = com.hansecom.abt.R.string.q2
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r1, r9)
            r9 = r7
            goto L_0x01ad
        L_0x01ab:
            r9 = r29
        L_0x01ad:
            r1.M()
            androidx.compose.ui.text.input.ImeAction$Companion r30 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r17 = r30.b()
            r10 = r34
            r13 = 0
            r14 = 1
            r15 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r10, r15, r14, r13)
            java.lang.String r12 = "answer1"
            androidx.compose.ui.Modifier r22 = androidx.compose.ui.platform.TestTagKt.a(r7, r12)
            r7 = 930135352(0x3770bd38, float:1.4349171E-5)
            r1.X(r7)
            r12 = r35
            r7 = r12 & 896(0x380, float:1.256E-42)
            r15 = 256(0x100, float:3.59E-43)
            if (r7 != r15) goto L_0x01d6
            r16 = r14
            goto L_0x01d8
        L_0x01d6:
            r16 = 0
        L_0x01d8:
            java.lang.Object r13 = r1.g()
            if (r16 != 0) goto L_0x01e6
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r16.a()
            if (r13 != r14) goto L_0x01ee
        L_0x01e6:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.a r13 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.a
            r13.<init>(r3)
            r1.N(r13)
        L_0x01ee:
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            r14 = r7
            r7 = r13
            r1.M()
            r24 = 48
            r25 = 63424(0xf7c0, float:8.8876E-41)
            r13 = 0
            r31 = r12
            r12 = r13
            r16 = 0
            r36 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 24576(0x6000, float:3.4438E-41)
            r37 = r10
            r10 = r22
            r22 = r1
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.e(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6 = 930155701(0x37710cb5, float:1.4367678E-5)
            r1.X(r6)
            boolean r6 = r40.l()
            r15 = 6
            if (r6 == 0) goto L_0x030b
            java.lang.String r6 = r40.j()
            r14 = r37
            r11 = 0
            r12 = 1
            r13 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r14, r13, r12, r11)
            java.lang.String r8 = "question2"
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.platform.TestTagKt.a(r7, r8)
            int r8 = com.hansecom.abt.R.string.w2
            int r7 = com.hansecom.abt.R.string.v2
            r10 = 0
            java.lang.String r16 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r1, r10)
            r7 = 930170981(0x37714865, float:1.4381575E-5)
            r1.X(r7)
            boolean r7 = r40.k()
            if (r7 != 0) goto L_0x0259
            int r7 = com.hansecom.abt.R.string.u2
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r1, r10)
            r17 = r7
            goto L_0x025b
        L_0x0259:
            r17 = r29
        L_0x025b:
            r1.M()
            int r7 = r31 >> 6
            r7 = r7 & 112(0x70, float:1.57E-43)
            r10 = r7 | 3072(0xc00, float:4.305E-42)
            r18 = 64
            r19 = 0
            r7 = r43
            r20 = r10
            r10 = r16
            r11 = r17
            r12 = r19
            r13 = r1
            r38 = r14
            r14 = r20
            r2 = r15
            r15 = r18
            com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt.d(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r6 = r40.h()
            int r8 = com.hansecom.abt.R.string.s2
            int r7 = com.hansecom.abt.R.string.r2
            r9 = 0
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r1, r9)
            r7 = 930190425(0x37719459, float:1.4399259E-5)
            r1.X(r7)
            boolean r7 = r40.i()
            if (r7 != 0) goto L_0x029e
            int r7 = com.hansecom.abt.R.string.q2
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r1, r9)
            r9 = r7
            goto L_0x02a0
        L_0x029e:
            r9 = r29
        L_0x02a0:
            r1.M()
            int r17 = r30.d()
            r10 = r38
            r13 = 0
            r14 = 1
            r15 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r10, r15, r14, r13)
            java.lang.String r12 = "answer2"
            androidx.compose.ui.Modifier r22 = androidx.compose.ui.platform.TestTagKt.a(r7, r12)
            r7 = 930181854(0x377172de, float:1.4391464E-5)
            r1.X(r7)
            r7 = r36
            r12 = 256(0x100, float:3.59E-43)
            if (r7 != r12) goto L_0x02c5
            r16 = r14
            goto L_0x02c7
        L_0x02c5:
            r16 = 0
        L_0x02c7:
            java.lang.Object r12 = r1.g()
            if (r16 != 0) goto L_0x02d5
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r16.a()
            if (r12 != r13) goto L_0x02dd
        L_0x02d5:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.b r12 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.b
            r12.<init>(r3)
            r1.N(r12)
        L_0x02dd:
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r13 = r7
            r7 = r12
            r1.M()
            r24 = 48
            r25 = 63424(0xf7c0, float:8.8876E-41)
            r12 = 0
            r16 = 0
            r39 = r13
            r13 = r16
            r16 = 0
            r14 = r16
            r16 = 0
            r15 = r16
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 24576(0x6000, float:3.4438E-41)
            r2 = r10
            r10 = r22
            r22 = r1
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.e(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x030f
        L_0x030b:
            r39 = r36
            r2 = r37
        L_0x030f:
            r1.M()
            float r6 = r26.b()
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.i(r2, r6)
            r7 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r6, r1, r7)
            int r6 = com.hansecom.abt.R.string.t2
            r7 = 0
            java.lang.String r10 = androidx.compose.ui.res.StringResources_androidKt.b(r6, r1, r7)
            r6 = 0
            r8 = 1
            r9 = 0
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.h(r2, r6, r8, r9)
            androidx.compose.ui.Alignment$Horizontal r9 = r27.g()
            androidx.compose.ui.Modifier r4 = r4.b(r6, r9)
            java.lang.String r6 = "save"
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.platform.TestTagKt.a(r4, r6)
            boolean r6 = r40.o()
            if (r6 == 0) goto L_0x0344
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r6 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Loading
        L_0x0342:
            r9 = r6
            goto L_0x0347
        L_0x0344:
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r6 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            goto L_0x0342
        L_0x0347:
            r6 = 930206357(0x3771d295, float:1.4413749E-5)
            r1.X(r6)
            boolean r6 = r1.l(r0)
            r12 = r39
            r11 = 256(0x100, float:3.59E-43)
            if (r12 != r11) goto L_0x0358
            r7 = r8
        L_0x0358:
            r6 = r6 | r7
            java.lang.Object r7 = r1.g()
            if (r6 != 0) goto L_0x0367
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x036f
        L_0x0367:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.c r7 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.c
            r7.<init>(r0, r3)
            r1.N(r7)
        L_0x036f:
            r6 = r7
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r1.M()
            r14 = 0
            r15 = 100
            r8 = 0
            r11 = 0
            r12 = 0
            r7 = r4
            r13 = r1
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            float r0 = r26.a()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.i(r2, r0)
            r2 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r0, r1, r2)
            r1.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0398
            androidx.compose.runtime.ComposerKt.X()
        L_0x0398:
            androidx.compose.runtime.ScopeUpdateScope r6 = r1.x()
            if (r6 == 0) goto L_0x03b1
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.d r7 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.d
            r0 = r7
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r45
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x03b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt.j(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Main, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit k(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(ChangeSecurityQuestions.Action.Main.Confirm.f35364a);
        return Unit.f40552a;
    }

    public static final Unit l(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new ChangeSecurityQuestions.Action.Main.AnswerChange(str));
        return Unit.f40552a;
    }

    public static final Unit m(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new ChangeSecurityQuestions.Action.Main.SecondAnswerChange(str));
        return Unit.f40552a;
    }

    public static final Unit n(ChangeSecurityQuestions.State.Main main, Function0 function0, Function1 function1, Function0 function02, int i2, Composer composer, int i3) {
        j(main, function0, function1, function02, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.State.Main r22, kotlin.jvm.functions.Function1 r23, kotlinx.coroutines.flow.Flow r24, kotlin.jvm.functions.Function0 r25, kotlin.jvm.functions.Function0 r26, kotlin.jvm.functions.Function0 r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r29
            r0 = 1695340992(0x650cd9c0, float:4.1571755E22)
            r3 = r28
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r8 = r7 & 6
            if (r8 != 0) goto L_0x0024
            boolean r8 = r3.W(r1)
            if (r8 == 0) goto L_0x0021
            r8 = 4
            goto L_0x0022
        L_0x0021:
            r8 = 2
        L_0x0022:
            r8 = r8 | r7
            goto L_0x0025
        L_0x0024:
            r8 = r7
        L_0x0025:
            r9 = r7 & 48
            if (r9 != 0) goto L_0x0035
            boolean r9 = r3.l(r2)
            if (r9 == 0) goto L_0x0032
            r9 = 32
            goto L_0x0034
        L_0x0032:
            r9 = 16
        L_0x0034:
            r8 = r8 | r9
        L_0x0035:
            r9 = r7 & 384(0x180, float:5.38E-43)
            r15 = r24
            if (r9 != 0) goto L_0x0047
            boolean r9 = r3.l(r15)
            if (r9 == 0) goto L_0x0044
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0046
        L_0x0044:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0046:
            r8 = r8 | r9
        L_0x0047:
            r9 = r7 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0057
            boolean r9 = r3.l(r4)
            if (r9 == 0) goto L_0x0054
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0056
        L_0x0054:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0056:
            r8 = r8 | r9
        L_0x0057:
            r9 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0067
            boolean r9 = r3.l(r5)
            if (r9 == 0) goto L_0x0064
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0066
        L_0x0064:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0066:
            r8 = r8 | r9
        L_0x0067:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r7
            r14 = 131072(0x20000, float:1.83671E-40)
            if (r9 != 0) goto L_0x0079
            boolean r9 = r3.l(r6)
            if (r9 == 0) goto L_0x0076
            r9 = r14
            goto L_0x0078
        L_0x0076:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x0078:
            r8 = r8 | r9
        L_0x0079:
            r13 = r8
            r8 = 74899(0x12493, float:1.04956E-40)
            r8 = r8 & r13
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r9) goto L_0x008f
            boolean r8 = r3.t()
            if (r8 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r3.B()
            goto L_0x0121
        L_0x008f:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x009b
            r8 = -1
            java.lang.String r9 = "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ScreenImpl (ChangeSecurityQuestionScreen.kt:69)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r8, r9)
        L_0x009b:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r3.C(r0)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r0
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt$ScreenImpl$1 r8 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt$ScreenImpl$1
            r8.<init>(r1, r4, r2, r5)
            r9 = 54
            r10 = 1115440223(0x427c445f, float:63.06677)
            r11 = 1
            androidx.compose.runtime.internal.ComposableLambda r16 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r10, r11, r8, r3, r9)
            r17 = 3072(0xc00, float:4.305E-42)
            r18 = 7
            r8 = 0
            r9 = 0
            r19 = 0
            r21 = r11
            r11 = r19
            r19 = r13
            r13 = r16
            r14 = r3
            r15 = r17
            r16 = r18
            com.hansecom.abt.ui.components.ScreenContentKt.d(r8, r9, r11, r13, r14, r15, r16)
            int r8 = com.hansecom.abt.R.string.x2
            r11 = 0
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r8, r3, r11)
            r9 = -918188031(0xffffffffc9459001, float:-809216.06)
            r3.X(r9)
            boolean r9 = r3.l(r0)
            boolean r10 = r3.W(r8)
            r9 = r9 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r19 & r10
            r12 = 131072(0x20000, float:1.83671E-40)
            if (r10 != r12) goto L_0x00ed
            r11 = r21
        L_0x00ed:
            r9 = r9 | r11
            java.lang.Object r10 = r3.g()
            if (r9 != 0) goto L_0x00fc
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x0105
        L_0x00fc:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt$ScreenImpl$2$1 r10 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt$ScreenImpl$2$1
            r9 = 0
            r10.<init>(r0, r8, r6, r9)
            r3.N(r10)
        L_0x0105:
            r11 = r10
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r3.M()
            int r0 = r19 >> 6
            r13 = r0 & 14
            r14 = 6
            r9 = 0
            r10 = 0
            r8 = r24
            r12 = r3
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0121
            androidx.compose.runtime.ComposerKt.X()
        L_0x0121:
            androidx.compose.runtime.ScopeUpdateScope r8 = r3.x()
            if (r8 == 0) goto L_0x013e
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.e r9 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.e
            r0 = r9
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt.o(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Main, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit p(ChangeSecurityQuestions.State.Main main, Function1 function1, Flow flow, Function0 function0, Function0 function02, Function0 function03, int i2, Composer composer, int i3) {
        o(main, function1, flow, function0, function02, function03, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
