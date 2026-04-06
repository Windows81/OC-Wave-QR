package com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class RegisterChooseQuestionStepScreenKt {
    public static final void e(RegisterViewModel registerViewModel, boolean z2, Composer composer, int i2) {
        int i3;
        Intrinsics.i(registerViewModel, "viewModel");
        Composer q2 = composer.q(-1278584296);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(registerViewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.d(z2) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1278584296, i4, -1, "com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.RegisterChooseQuestionStepScreen (RegisterChooseQuestionStepScreen.kt:26)");
            }
            Register.State.ChooseQuestionStep c2 = f(registerViewModel.q((LifecycleOwner) null, (Lifecycle.State) null, q2, (i4 << 6) & 896, 3)).c();
            q2.X(-836787625);
            boolean l2 = q2.l(registerViewModel);
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new b(registerViewModel);
                q2.N(g2);
            }
            q2.M();
            i(c2, (Function1) g2, z2, q2, (i4 << 3) & 896);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new c(registerViewModel, z2, i2));
        }
    }

    public static final Register.State f(State state) {
        return (Register.State) state.getValue();
    }

    public static final Unit g(RegisterViewModel registerViewModel, Register.Action.ChooseQuestionStep chooseQuestionStep) {
        Intrinsics.i(chooseQuestionStep, "it");
        registerViewModel.k(chooseQuestionStep);
        return Unit.f40552a;
    }

    public static final Unit h(RegisterViewModel registerViewModel, boolean z2, int i2, Composer composer, int i3) {
        e(registerViewModel, z2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(com.hansecom.abt.presentation.screens.auth.register.Register.State.ChooseQuestionStep r19, kotlin.jvm.functions.Function1 r20, boolean r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            r4 = 764448339(0x2d908e53, float:1.643411E-11)
            r5 = r22
            androidx.compose.runtime.Composer r15 = r5.q(r4)
            r5 = r3 & 6
            r6 = 2
            r7 = 4
            if (r5 != 0) goto L_0x0022
            boolean r5 = r15.W(r0)
            if (r5 == 0) goto L_0x001f
            r5 = r7
            goto L_0x0020
        L_0x001f:
            r5 = r6
        L_0x0020:
            r5 = r5 | r3
            goto L_0x0023
        L_0x0022:
            r5 = r3
        L_0x0023:
            r8 = r3 & 48
            r9 = 32
            if (r8 != 0) goto L_0x0034
            boolean r8 = r15.l(r1)
            if (r8 == 0) goto L_0x0031
            r8 = r9
            goto L_0x0033
        L_0x0031:
            r8 = 16
        L_0x0033:
            r5 = r5 | r8
        L_0x0034:
            r8 = r3 & 384(0x180, float:5.38E-43)
            r10 = 256(0x100, float:3.59E-43)
            if (r8 != 0) goto L_0x0045
            boolean r8 = r15.d(r2)
            if (r8 == 0) goto L_0x0042
            r8 = r10
            goto L_0x0044
        L_0x0042:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r5 = r5 | r8
        L_0x0045:
            r8 = r5 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r8 != r11) goto L_0x0058
            boolean r8 = r15.t()
            if (r8 != 0) goto L_0x0052
            goto L_0x0058
        L_0x0052:
            r15.B()
            r4 = r15
            goto L_0x0100
        L_0x0058:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0064
            r8 = -1
            java.lang.String r11 = "com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.ScreenImpl (RegisterChooseQuestionStepScreen.kt:41)"
            androidx.compose.runtime.ComposerKt.Y(r4, r5, r8, r11)
        L_0x0064:
            kotlin.Unit r4 = kotlin.Unit.f40552a
            r8 = -453186627(0xffffffffe4fcebbd, float:-3.732453E22)
            r15.X(r8)
            r8 = r5 & 112(0x70, float:1.57E-43)
            r12 = 1
            if (r8 != r9) goto L_0x0073
            r13 = r12
            goto L_0x0074
        L_0x0073:
            r13 = 0
        L_0x0074:
            java.lang.Object r14 = r15.g()
            r11 = 0
            if (r13 != 0) goto L_0x0083
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r14 != r13) goto L_0x008b
        L_0x0083:
            com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.RegisterChooseQuestionStepScreenKt$ScreenImpl$1$1 r14 = new com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.RegisterChooseQuestionStepScreenKt$ScreenImpl$1$1
            r14.<init>(r1, r11)
            r15.N(r14)
        L_0x008b:
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r15.M()
            r13 = 6
            androidx.compose.runtime.EffectsKt.g(r4, r14, r15, r13)
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r13 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.f(r4, r13, r12, r11)
            java.lang.String r14 = "RegisterChooseQuestionStepScreen"
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.platform.TestTagKt.a(r4, r14)
            com.hansecom.abt.ui.theme.Dimensions r14 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r14 = r14.c()
            androidx.compose.foundation.layout.PaddingValues r11 = androidx.compose.foundation.layout.PaddingKt.c(r14, r13, r6, r11)
            r6 = -453175555(0xffffffffe4fd16fd, float:-3.7349462E22)
            r15.X(r6)
            r6 = r5 & 14
            if (r6 != r7) goto L_0x00b7
            r6 = r12
            goto L_0x00b8
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            r5 = r5 & 896(0x380, float:1.256E-42)
            if (r5 != r10) goto L_0x00be
            r5 = r12
            goto L_0x00bf
        L_0x00be:
            r5 = 0
        L_0x00bf:
            r5 = r5 | r6
            if (r8 != r9) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r12 = 0
        L_0x00c4:
            r5 = r5 | r12
            java.lang.Object r6 = r15.g()
            if (r5 != 0) goto L_0x00d3
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00db
        L_0x00d3:
            com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.d r6 = new com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.d
            r6.<init>(r0, r2, r1)
            r15.N(r6)
        L_0x00db:
            r14 = r6
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            r15.M()
            r16 = 390(0x186, float:5.47E-43)
            r17 = 506(0x1fa, float:7.09E-43)
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r18 = 0
            r5 = r4
            r7 = r11
            r11 = r12
            r12 = r13
            r13 = r18
            r4 = r15
            androidx.compose.foundation.lazy.LazyDslKt.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0100
            androidx.compose.runtime.ComposerKt.X()
        L_0x0100:
            androidx.compose.runtime.ScopeUpdateScope r4 = r4.x()
            if (r4 == 0) goto L_0x010e
            com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.e r5 = new com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.e
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.RegisterChooseQuestionStepScreenKt.i(com.hansecom.abt.presentation.screens.auth.register.Register$State$ChooseQuestionStep, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit j(Register.State.ChooseQuestionStep chooseQuestionStep, Function1 function1, boolean z2, int i2, Composer composer, int i3) {
        i(chooseQuestionStep, function1, z2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit k(Register.State.ChooseQuestionStep chooseQuestionStep, boolean z2, Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$RegisterChooseQuestionStepScreenKt.f34443a.a(), 3, (Object) null);
        ImmutableList b2 = chooseQuestionStep.b();
        lazyListScope.d(b2.size(), (Function1) null, new RegisterChooseQuestionStepScreenKt$ScreenImpl$lambda$9$lambda$8$$inlined$itemsIndexed$default$2(b2), ComposableLambdaKt.c(-1091073711, true, new RegisterChooseQuestionStepScreenKt$ScreenImpl$lambda$9$lambda$8$$inlined$itemsIndexed$default$3(b2, chooseQuestionStep, z2, function1)));
        return Unit.f40552a;
    }
}
