package com.hansecom.abt.presentation.screens.auth.register.questionsStep;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

@Metadata
public final class RegisterQuestionsStepScreenKt {
    public static final void i(RegisterViewModel registerViewModel, Function0 function0, Function0 function02, Function2 function2, Composer composer, int i2) {
        int i3;
        Intrinsics.i(registerViewModel, "viewModel");
        Intrinsics.i(function0, "onChangeQuestion");
        Intrinsics.i(function02, "onSecondChangeQuestion");
        Intrinsics.i(function2, "onLinkClick");
        Composer q2 = composer.q(-2082113087);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(registerViewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function02) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= q2.l(function2) ? 2048 : 1024;
        }
        int i4 = i3;
        if ((i4 & 1171) != 1170 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2082113087, i4, -1, "com.hansecom.abt.presentation.screens.auth.register.questionsStep.RegisterQuestionStepScreen (RegisterQuestionsStepScreen.kt:46)");
            }
            Register.State.QuestionsStep d2 = j(registerViewModel.q((LifecycleOwner) null, (Lifecycle.State) null, q2, (i4 << 6) & 896, 3)).d();
            q2.X(1380845349);
            boolean l2 = q2.l(registerViewModel);
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new RegisterQuestionsStepScreenKt$RegisterQuestionStepScreen$1$1(registerViewModel);
                q2.N(g2);
            }
            q2.M();
            l(d2, (Function1) ((KFunction) g2), function0, function02, function2, q2, (i4 << 3) & 65408, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new h(registerViewModel, function0, function02, function2, i2));
        }
    }

    public static final Register.State j(State state) {
        return (Register.State) state.getValue();
    }

    public static final Unit k(RegisterViewModel registerViewModel, Function0 function0, Function0 function02, Function2 function2, int i2, Composer composer, int i3) {
        i(registerViewModel, function0, function02, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v61, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v82, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b3, code lost:
        if ((r53 & 1) != 0) goto L_0x00b5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x05f5  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0633  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(com.hansecom.abt.presentation.screens.auth.register.Register.State.QuestionsStep r46, kotlin.jvm.functions.Function1 r47, kotlin.jvm.functions.Function0 r48, kotlin.jvm.functions.Function0 r49, kotlin.jvm.functions.Function2 r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            r2 = r47
            r5 = r50
            r6 = r52
            r0 = -279413423(0xffffffffef587d51, float:-6.700026E28)
            r1 = r51
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r6 & 6
            r4 = 2
            if (r3 != 0) goto L_0x0027
            r3 = r53 & 1
            if (r3 != 0) goto L_0x0022
            r3 = r46
            boolean r7 = r1.W(r3)
            if (r7 == 0) goto L_0x0024
            r7 = 4
            goto L_0x0025
        L_0x0022:
            r3 = r46
        L_0x0024:
            r7 = r4
        L_0x0025:
            r7 = r7 | r6
            goto L_0x002a
        L_0x0027:
            r3 = r46
            r7 = r6
        L_0x002a:
            r8 = r53 & 2
            if (r8 == 0) goto L_0x0031
            r7 = r7 | 48
            goto L_0x0041
        L_0x0031:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x0041
            boolean r8 = r1.l(r2)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r7 = r7 | r8
        L_0x0041:
            r8 = r53 & 4
            if (r8 == 0) goto L_0x004a
            r7 = r7 | 384(0x180, float:5.38E-43)
            r11 = r48
            goto L_0x005c
        L_0x004a:
            r8 = r6 & 384(0x180, float:5.38E-43)
            r11 = r48
            if (r8 != 0) goto L_0x005c
            boolean r8 = r1.l(r11)
            if (r8 == 0) goto L_0x0059
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r7 = r7 | r8
        L_0x005c:
            r8 = r53 & 8
            if (r8 == 0) goto L_0x0065
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            r12 = r49
            goto L_0x0077
        L_0x0065:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            r12 = r49
            if (r8 != 0) goto L_0x0077
            boolean r8 = r1.l(r12)
            if (r8 == 0) goto L_0x0074
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r7 = r7 | r8
        L_0x0077:
            r8 = r53 & 16
            if (r8 == 0) goto L_0x007e
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008e
        L_0x007e:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x008e
            boolean r8 = r1.l(r5)
            if (r8 == 0) goto L_0x008b
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008d
        L_0x008b:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x008d:
            r7 = r7 | r8
        L_0x008e:
            r8 = r7 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r10) goto L_0x00a0
            boolean r8 = r1.t()
            if (r8 != 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            r1.B()
            goto L_0x0636
        L_0x00a0:
            r1.p()
            r8 = r6 & 1
            if (r8 == 0) goto L_0x00b9
            boolean r8 = r1.J()
            if (r8 == 0) goto L_0x00ae
            goto L_0x00b9
        L_0x00ae:
            r1.B()
            r8 = r53 & 1
            if (r8 == 0) goto L_0x00b7
        L_0x00b5:
            r7 = r7 & -15
        L_0x00b7:
            r10 = r7
            goto L_0x00ee
        L_0x00b9:
            r8 = r53 & 1
            if (r8 == 0) goto L_0x00b7
            com.hansecom.abt.presentation.screens.auth.register.Register$State$QuestionsStep r3 = new com.hansecom.abt.presentation.screens.auth.register.Register$State$QuestionsStep
            r16 = r3
            r35 = 262143(0x3ffff, float:3.6734E-40)
            r36 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x00b5
        L_0x00ee:
            r1.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00fd
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.auth.register.questionsStep.ScreenImpl (RegisterQuestionsStepScreen.kt:64)"
            androidx.compose.runtime.ComposerKt.Y(r0, r10, r7, r8)
        L_0x00fd:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r0 = r1.C(r0)
            androidx.compose.ui.focus.FocusManager r0 = (androidx.compose.ui.focus.FocusManager) r0
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r7 = r1.C(r7)
            android.content.Context r7 = (android.content.Context) r7
            android.content.res.Resources r8 = r7.getResources()
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r15 = 0
            r11 = 1
            r12 = 0
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.SizeKt.f(r7, r15, r11, r12)
            java.lang.String r13 = "RegisterQuestionStepScreen"
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.platform.TestTagKt.a(r9, r13)
            com.hansecom.abt.ui.theme.Dimensions r27 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r13 = r27.c()
            androidx.compose.ui.Modifier r18 = androidx.compose.foundation.layout.PaddingKt.k(r9, r13, r15, r4, r12)
            r4 = 0
            androidx.compose.foundation.ScrollState r19 = androidx.compose.foundation.ScrollKt.c(r4, r1, r4, r11)
            r23 = 14
            r24 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.ScrollKt.g(r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.foundation.layout.Arrangement r13 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r11 = r13.g()
            androidx.compose.ui.Alignment$Companion r28 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r12 = r28.k()
            androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.ColumnKt.a(r11, r12, r1, r4)
            int r12 = androidx.compose.runtime.ComposablesKt.a(r1, r4)
            androidx.compose.runtime.CompositionLocalMap r14 = r1.I()
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.ComposedModifierKt.e(r1, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r20 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r15 = r20.a()
            androidx.compose.runtime.Applier r22 = r1.v()
            if (r22 != 0) goto L_0x016c
            androidx.compose.runtime.ComposablesKt.d()
        L_0x016c:
            r1.s()
            boolean r22 = r1.n()
            if (r22 == 0) goto L_0x0179
            r1.y(r15)
            goto L_0x017c
        L_0x0179:
            r1.K()
        L_0x017c:
            androidx.compose.runtime.Composer r15 = androidx.compose.runtime.Updater.b(r1)
            kotlin.jvm.functions.Function2 r4 = r20.c()
            androidx.compose.runtime.Updater.g(r15, r11, r4)
            kotlin.jvm.functions.Function2 r4 = r20.e()
            androidx.compose.runtime.Updater.g(r15, r14, r4)
            kotlin.jvm.functions.Function2 r4 = r20.b()
            boolean r11 = r15.n()
            if (r11 != 0) goto L_0x01a6
            java.lang.Object r11 = r15.g()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r14)
            if (r11 != 0) goto L_0x01b4
        L_0x01a6:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r15.N(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r15.A(r11, r4)
        L_0x01b4:
            kotlin.jvm.functions.Function2 r4 = r20.d()
            androidx.compose.runtime.Updater.g(r15, r9, r4)
            androidx.compose.foundation.layout.ColumnScopeInstance r4 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r9 = com.hansecom.abt.R.string.p8
            r11 = 0
            java.lang.String r14 = androidx.compose.ui.res.StringResources_androidKt.b(r9, r1, r11)
            int r9 = com.hansecom.abt.R.string.w8
            java.lang.String r15 = androidx.compose.ui.res.StringResources_androidKt.b(r9, r1, r11)
            r22 = 0
            r23 = 79
            r9 = 0
            r11 = 0
            r24 = 0
            r30 = 0
            r26 = 0
            r12 = r7
            r7 = r9
            r9 = r8
            r8 = r11
            r37 = r9
            r32 = r10
            r11 = 16384(0x4000, float:2.2959E-41)
            r9 = r24
            r38 = r12
            r11 = r30
            r39 = r13
            r13 = r14
            r14 = r15
            r15 = r26
            r16 = r1
            r17 = r22
            r18 = r23
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18)
            r15 = r38
            r12 = 0
            r13 = 1
            r14 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r15, r14, r13, r12)
            r8 = 8
            float r8 = (float) r8
            float r8 = androidx.compose.ui.unit.Dp.m(r8)
            r9 = r39
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r8 = r9.n(r8)
            androidx.compose.ui.Alignment$Horizontal r9 = r28.k()
            r11 = 6
            androidx.compose.ui.layout.MeasurePolicy r8 = androidx.compose.foundation.layout.ColumnKt.a(r8, r9, r1, r11)
            r9 = 0
            int r10 = androidx.compose.runtime.ComposablesKt.a(r1, r9)
            androidx.compose.runtime.CompositionLocalMap r9 = r1.I()
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.ComposedModifierKt.e(r1, r7)
            kotlin.jvm.functions.Function0 r11 = r20.a()
            androidx.compose.runtime.Applier r16 = r1.v()
            if (r16 != 0) goto L_0x022e
            androidx.compose.runtime.ComposablesKt.d()
        L_0x022e:
            r1.s()
            boolean r16 = r1.n()
            if (r16 == 0) goto L_0x023b
            r1.y(r11)
            goto L_0x023e
        L_0x023b:
            r1.K()
        L_0x023e:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r1)
            kotlin.jvm.functions.Function2 r12 = r20.c()
            androidx.compose.runtime.Updater.g(r11, r8, r12)
            kotlin.jvm.functions.Function2 r8 = r20.e()
            androidx.compose.runtime.Updater.g(r11, r9, r8)
            kotlin.jvm.functions.Function2 r8 = r20.b()
            boolean r9 = r11.n()
            if (r9 != 0) goto L_0x0268
            java.lang.Object r9 = r11.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r12)
            if (r9 != 0) goto L_0x0276
        L_0x0268:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r11.N(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r11.A(r9, r8)
        L_0x0276:
            kotlin.jvm.functions.Function2 r8 = r20.d()
            androidx.compose.runtime.Updater.g(r11, r7, r8)
            java.lang.String r7 = r3.g()
            r12 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r15, r14, r13, r12)
            java.lang.String r9 = "question1"
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.platform.TestTagKt.a(r8, r9)
            int r9 = com.hansecom.abt.R.string.v8
            int r8 = com.hansecom.abt.R.string.u8
            r11 = 0
            java.lang.String r16 = androidx.compose.ui.res.StringResources_androidKt.b(r8, r1, r11)
            r8 = 1653590767(0x628fcaef, float:1.3262537E21)
            r1.X(r8)
            boolean r8 = r3.j()
            java.lang.String r30 = ""
            if (r8 != 0) goto L_0x02ac
            int r8 = com.hansecom.abt.R.string.t8
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r8, r1, r11)
            r17 = r8
            goto L_0x02ae
        L_0x02ac:
            r17 = r30
        L_0x02ae:
            r1.M()
            int r8 = r32 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            r11 = r8 | 3072(0xc00, float:4.305E-42)
            r18 = 64
            r19 = 0
            r8 = r48
            r20 = r11
            r11 = r16
            r6 = r12
            r12 = r17
            r46 = r0
            r0 = r13
            r13 = r19
            r14 = r1
            r40 = r15
            r15 = r20
            r16 = r18
            com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r7 = r3.h()
            int r9 = com.hansecom.abt.R.string.o8
            int r8 = com.hansecom.abt.R.string.n8
            r10 = 0
            java.lang.String r12 = androidx.compose.ui.res.StringResources_androidKt.b(r8, r1, r10)
            r8 = 1653610339(0x62901763, float:1.3290082E21)
            r1.X(r8)
            boolean r8 = r3.i()
            if (r8 != 0) goto L_0x02f4
            int r8 = com.hansecom.abt.R.string.m8
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r8, r1, r10)
            r10 = r8
            goto L_0x02f6
        L_0x02f4:
            r10 = r30
        L_0x02f6:
            r1.M()
            androidx.compose.ui.text.input.ImeAction$Companion r31 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r18 = r31.b()
            r11 = r40
            r15 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r11, r15, r0, r6)
            java.lang.String r13 = "answer1"
            androidx.compose.ui.Modifier r23 = androidx.compose.ui.platform.TestTagKt.a(r8, r13)
            r8 = 1653601527(0x628ff4f7, float:1.327768E21)
            r1.X(r8)
            r14 = r32 & 112(0x70, float:1.57E-43)
            r13 = 32
            if (r14 != r13) goto L_0x031a
            r8 = r0
            goto L_0x031b
        L_0x031a:
            r8 = 0
        L_0x031b:
            java.lang.Object r13 = r1.g()
            if (r8 != 0) goto L_0x0329
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r13 != r8) goto L_0x0331
        L_0x0329:
            com.hansecom.abt.presentation.screens.auth.register.questionsStep.a r13 = new com.hansecom.abt.presentation.screens.auth.register.questionsStep.a
            r13.<init>(r2)
            r1.N(r13)
        L_0x0331:
            r8 = r13
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r1.M()
            r25 = 48
            r26 = 63424(0xf7c0, float:8.8876E-41)
            r13 = 0
            r16 = 0
            r41 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r42 = r11
            r11 = r23
            r23 = r1
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.e(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r7 = 1653625188(0x62905164, float:1.331098E21)
            r1.X(r7)
            boolean r7 = r3.r()
            if (r7 == 0) goto L_0x043e
            java.lang.String r7 = r3.p()
            r15 = r42
            r14 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r15, r14, r0, r6)
            java.lang.String r9 = "question2"
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.platform.TestTagKt.a(r8, r9)
            int r9 = com.hansecom.abt.R.string.v8
            int r8 = com.hansecom.abt.R.string.u8
            r11 = 0
            java.lang.String r12 = androidx.compose.ui.res.StringResources_androidKt.b(r8, r1, r11)
            r8 = 1653642400(0x629094a0, float:1.3335204E21)
            r1.X(r8)
            boolean r8 = r3.q()
            if (r8 != 0) goto L_0x0398
            int r8 = com.hansecom.abt.R.string.t8
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r8, r1, r11)
            r13 = r8
            goto L_0x039a
        L_0x0398:
            r13 = r30
        L_0x039a:
            r1.M()
            int r8 = r32 >> 6
            r8 = r8 & 112(0x70, float:1.57E-43)
            r11 = r8 | 3072(0xc00, float:4.305E-42)
            r16 = 64
            r17 = 0
            r8 = r49
            r18 = r11
            r11 = r12
            r12 = r13
            r13 = r17
            r14 = r1
            r43 = r15
            r15 = r18
            com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r7 = r3.n()
            int r9 = com.hansecom.abt.R.string.o8
            int r8 = com.hansecom.abt.R.string.n8
            r10 = 0
            java.lang.String r12 = androidx.compose.ui.res.StringResources_androidKt.b(r8, r1, r10)
            r8 = 1653663636(0x6290e794, float:1.336509E21)
            r1.X(r8)
            boolean r8 = r3.o()
            if (r8 != 0) goto L_0x03d8
            int r8 = com.hansecom.abt.R.string.m8
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r8, r1, r10)
            r10 = r8
            goto L_0x03da
        L_0x03d8:
            r10 = r30
        L_0x03da:
            r1.M()
            int r18 = r31.d()
            r11 = r43
            r15 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r11, r15, r0, r6)
            java.lang.String r13 = "answer2"
            androidx.compose.ui.Modifier r23 = androidx.compose.ui.platform.TestTagKt.a(r8, r13)
            r8 = 1653654237(0x6290c2dd, float:1.3351863E21)
            r1.X(r8)
            r13 = r41
            r14 = 32
            if (r13 != r14) goto L_0x03fc
            r8 = r0
            goto L_0x03fd
        L_0x03fc:
            r8 = 0
        L_0x03fd:
            java.lang.Object r14 = r1.g()
            if (r8 != 0) goto L_0x040b
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r14 != r8) goto L_0x0413
        L_0x040b:
            com.hansecom.abt.presentation.screens.auth.register.questionsStep.b r14 = new com.hansecom.abt.presentation.screens.auth.register.questionsStep.b
            r14.<init>(r2)
            r1.N(r14)
        L_0x0413:
            r8 = r14
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r1.M()
            r25 = 48
            r26 = 63424(0xf7c0, float:8.8876E-41)
            r14 = 0
            r44 = r13
            r13 = r14
            r16 = 0
            r15 = r16
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r45 = r11
            r11 = r23
            r23 = r1
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.e(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0442
        L_0x043e:
            r44 = r41
            r45 = r42
        L_0x0442:
            r1.M()
            r7 = 1653679343(0x629124ef, float:1.3387196E21)
            r1.X(r7)
            boolean r7 = r3.d()
            if (r7 == 0) goto L_0x04dd
            java.lang.String r7 = r3.c()
            int r18 = r31.b()
            int r9 = com.hansecom.abt.R.string.s8
            int r8 = com.hansecom.abt.R.string.r8
            r10 = 0
            java.lang.String r12 = androidx.compose.ui.res.StringResources_androidKt.b(r8, r1, r10)
            r8 = 1653694095(0x62915e8f, float:1.3407958E21)
            r1.X(r8)
            boolean r8 = r3.e()
            if (r8 != 0) goto L_0x0476
            int r8 = com.hansecom.abt.R.string.q8
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r8, r1, r10)
            r10 = r8
            goto L_0x0478
        L_0x0476:
            r10 = r30
        L_0x0478:
            r1.M()
            androidx.compose.ui.text.input.KeyboardType$Companion r8 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r16 = r8.e()
            r11 = r45
            r15 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r11, r15, r0, r6)
            java.lang.String r13 = "pin"
            androidx.compose.ui.Modifier r23 = androidx.compose.ui.platform.TestTagKt.a(r8, r13)
            r8 = 1653683543(0x62913557, float:1.3393107E21)
            r1.X(r8)
            r13 = r44
            r14 = 32
            if (r13 != r14) goto L_0x049c
            r8 = r0
            goto L_0x049d
        L_0x049c:
            r8 = 0
        L_0x049d:
            java.lang.Object r14 = r1.g()
            if (r8 != 0) goto L_0x04ab
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r14 != r8) goto L_0x04b3
        L_0x04ab:
            com.hansecom.abt.presentation.screens.auth.register.questionsStep.c r14 = new com.hansecom.abt.presentation.screens.auth.register.questionsStep.c
            r14.<init>(r2)
            r1.N(r14)
        L_0x04b3:
            r8 = r14
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r1.M()
            r25 = 48
            r26 = 62912(0xf5c0, float:8.8158E-41)
            r14 = 0
            r0 = r13
            r13 = r14
            r6 = 32
            r17 = 0
            r15 = r17
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 805330944(0x30006000, float:4.6702553E-10)
            r6 = r11
            r11 = r23
            r23 = r1
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.e(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x04e1
        L_0x04dd:
            r0 = r44
            r6 = r45
        L_0x04e1:
            r1.M()
            r7 = 16
            float r15 = (float) r7
            float r7 = androidx.compose.ui.unit.Dp.m(r15)
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.i(r6, r7)
            r14 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r7, r1, r14)
            java.lang.String r7 = "terms"
            androidx.compose.ui.Modifier r11 = androidx.compose.ui.platform.TestTagKt.a(r6, r7)
            int r7 = com.hansecom.abt.R.string.i8
            r8 = 1653719046(0x6291c006, float:1.3443073E21)
            r1.X(r8)
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r32 & r8
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r8 != r9) goto L_0x050e
            r9 = r37
            r8 = 1
            goto L_0x0511
        L_0x050e:
            r9 = r37
            r8 = 0
        L_0x0511:
            boolean r10 = r1.l(r9)
            r8 = r8 | r10
            r10 = r32 & 14
            r10 = r10 ^ r14
            r12 = 4
            if (r10 <= r12) goto L_0x0522
            boolean r10 = r1.W(r3)
            if (r10 != 0) goto L_0x0526
        L_0x0522:
            r10 = r32 & 6
            if (r10 != r12) goto L_0x0528
        L_0x0526:
            r10 = 1
            goto L_0x0529
        L_0x0528:
            r10 = 0
        L_0x0529:
            r8 = r8 | r10
            java.lang.Object r10 = r1.g()
            if (r8 != 0) goto L_0x0538
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x0540
        L_0x0538:
            com.hansecom.abt.presentation.screens.auth.register.questionsStep.d r10 = new com.hansecom.abt.presentation.screens.auth.register.questionsStep.d
            r10.<init>(r5, r9, r3)
            r1.N(r10)
        L_0x0540:
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r1.M()
            r8 = 0
            androidx.compose.ui.text.AnnotatedString r7 = com.hansecom.abt.util.resourcesResolvers.StyledStringResourceKt.b(r7, r10, r1, r8)
            r9 = 1653739210(0x62920eca, float:1.3471451E21)
            r1.X(r9)
            boolean r9 = r3.s()
            if (r9 != 0) goto L_0x055e
            int r9 = com.hansecom.abt.R.string.j8
            java.lang.String r9 = androidx.compose.ui.res.StringResources_androidKt.b(r9, r1, r8)
            r8 = r9
            goto L_0x0560
        L_0x055e:
            r8 = r30
        L_0x0560:
            r1.M()
            boolean r9 = r3.f()
            r10 = 1653748516(0x62923324, float:1.3484549E21)
            r1.X(r10)
            r10 = 32
            if (r0 != r10) goto L_0x0573
            r10 = 1
            goto L_0x0574
        L_0x0573:
            r10 = 0
        L_0x0574:
            java.lang.Object r12 = r1.g()
            if (r10 != 0) goto L_0x0582
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r12 != r10) goto L_0x058a
        L_0x0582:
            com.hansecom.abt.presentation.screens.auth.register.questionsStep.e r12 = new com.hansecom.abt.presentation.screens.auth.register.questionsStep.e
            r12.<init>(r2)
            r1.N(r12)
        L_0x058a:
            r10 = r12
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r1.M()
            r13 = 24576(0x6000, float:3.4438E-41)
            r16 = 0
            r12 = r1
            r5 = r14
            r14 = r16
            com.hansecom.abt.ui.components.formFields.CheckboxFieldKt.c(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.T()
            float r7 = androidx.compose.ui.unit.Dp.m(r15)
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.i(r6, r7)
            androidx.compose.foundation.layout.SpacerKt.a(r7, r1, r5)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r4
            r17 = r6
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.ColumnScope.c(r16, r17, r18, r19, r20, r21)
            r8 = 0
            androidx.compose.foundation.layout.SpacerKt.a(r7, r1, r8)
            int r7 = com.hansecom.abt.R.string.K9
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r1, r8)
            r7 = 0
            r9 = 1
            r10 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r6, r7, r9, r10)
            androidx.compose.ui.Alignment$Horizontal r10 = r28.g()
            androidx.compose.ui.Modifier r4 = r4.b(r7, r10)
            java.lang.String r7 = "register"
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.platform.TestTagKt.a(r4, r7)
            boolean r7 = r3.u()
            if (r7 == 0) goto L_0x05e2
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r7 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Loading
        L_0x05e0:
            r10 = r7
            goto L_0x05e5
        L_0x05e2:
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r7 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            goto L_0x05e0
        L_0x05e5:
            r7 = -394289258(0xffffffffe87f9f96, float:-4.8285892E24)
            r1.X(r7)
            r7 = r46
            boolean r12 = r1.l(r7)
            r13 = 32
            if (r0 != r13) goto L_0x05f6
            r8 = r9
        L_0x05f6:
            r0 = r12 | r8
            java.lang.Object r8 = r1.g()
            if (r0 != 0) goto L_0x0606
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r8 != r0) goto L_0x060e
        L_0x0606:
            com.hansecom.abt.presentation.screens.auth.register.questionsStep.f r8 = new com.hansecom.abt.presentation.screens.auth.register.questionsStep.f
            r8.<init>(r7, r2)
            r1.N(r8)
        L_0x060e:
            r7 = r8
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r1.M()
            r15 = 0
            r16 = 100
            r9 = 0
            r12 = 0
            r13 = 0
            r8 = r4
            r14 = r1
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            float r0 = r27.a()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.i(r6, r0)
            androidx.compose.foundation.layout.SpacerKt.a(r0, r1, r5)
            r1.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0636
            androidx.compose.runtime.ComposerKt.X()
        L_0x0636:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.x()
            if (r8 == 0) goto L_0x0652
            com.hansecom.abt.presentation.screens.auth.register.questionsStep.g r9 = new com.hansecom.abt.presentation.screens.auth.register.questionsStep.g
            r0 = r9
            r1 = r3
            r2 = r47
            r3 = r48
            r4 = r49
            r5 = r50
            r6 = r52
            r7 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0652:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.questionsStep.RegisterQuestionsStepScreenKt.l(com.hansecom.abt.presentation.screens.auth.register.Register$State$QuestionsStep, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit m(Function2 function2, Resources resources, Register.State.QuestionsStep questionsStep, String str) {
        Intrinsics.i(str, "url");
        if (Intrinsics.d(str, "registration_terms")) {
            String string = resources.getString(R.string.l8);
            Intrinsics.h(string, "getString(...)");
            function2.m(string, questionsStep.t());
        } else if (Intrinsics.d(str, "registration_policy")) {
            String string2 = resources.getString(R.string.k8);
            Intrinsics.h(string2, "getString(...)");
            function2.m(string2, questionsStep.l());
        }
        return Unit.f40552a;
    }

    public static final Unit n(Function1 function1, boolean z2) {
        function1.invoke(new Register.Action.QuestionsStep.ToggleTermsAcceptance(z2));
        return Unit.f40552a;
    }

    public static final Unit o(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Register.Action.QuestionsStep.AnswerChange(str));
        return Unit.f40552a;
    }

    public static final Unit p(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Register.Action.QuestionsStep.SecondAnswerChange(str));
        return Unit.f40552a;
    }

    public static final Unit q(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Register.Action.QuestionsStep.AppPinChange(str));
        return Unit.f40552a;
    }

    public static final Unit r(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(Register.Action.QuestionsStep.C0008Register.f34361a);
        return Unit.f40552a;
    }

    public static final Unit s(Register.State.QuestionsStep questionsStep, Function1 function1, Function0 function0, Function0 function02, Function2 function2, int i2, int i3, Composer composer, int i4) {
        l(questionsStep, function1, function0, function02, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
