package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f35389A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35390B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeSecurityQuestions.State.Questions f35391z;

    public ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1(ChangeSecurityQuestions.State.Questions questions, boolean z2, Function1 function1) {
        this.f35391z = questions;
        this.f35389A = z2;
        this.f35390B = function1;
    }

    public static final Unit e(ChangeSecurityQuestions.State.Questions questions, boolean z2, Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$ChangeSecurityQuestionChooseQuestionScreenKt.f35395a.a(), 3, (Object) null);
        ImmutableList b2 = questions.b();
        lazyListScope.d(b2.size(), (Function1) null, new ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$2(b2), ComposableLambdaKt.c(-1091073711, true, new ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$3(b2, questions, z2, function1)));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r15, int r16) {
        /*
            r14 = this;
            r0 = r14
            r11 = r15
            r1 = r16
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0015
            boolean r2 = r15.t()
            if (r2 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r15.B()
            goto L_0x009b
        L_0x0015:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0024
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ScreenImpl.<anonymous> (ChangeSecurityQuestionChooseQuestionScreen.kt:56)"
            r4 = 662405309(0x277b80bd, float:3.4903037E-15)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0024:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r2 = 1
            r3 = 0
            r4 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r1, r4, r2, r3)
            java.lang.String r2 = "questions_list"
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.platform.TestTagKt.a(r1, r2)
            com.hansecom.abt.ui.theme.Dimensions r2 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r3 = r2.c()
            float r5 = r2.c()
            float r6 = r2.e()
            r7 = 2
            r8 = 0
            androidx.compose.foundation.layout.PaddingValues r3 = androidx.compose.foundation.layout.PaddingKt.e(r3, r4, r5, r6, r7, r8)
            r2 = -2055460476(0xffffffff857c2984, float:-1.1856608E-35)
            r15.X(r2)
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Questions r2 = r0.f35391z
            boolean r2 = r15.W(r2)
            boolean r4 = r0.f35389A
            boolean r4 = r15.d(r4)
            r2 = r2 | r4
            kotlin.jvm.functions.Function1 r4 = r0.f35390B
            boolean r4 = r15.W(r4)
            r2 = r2 | r4
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Questions r4 = r0.f35391z
            boolean r5 = r0.f35389A
            kotlin.jvm.functions.Function1 r6 = r0.f35390B
            java.lang.Object r7 = r15.g()
            if (r2 != 0) goto L_0x0075
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r7 != r2) goto L_0x007d
        L_0x0075:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.d r7 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.d
            r7.<init>(r4, r5, r6)
            r15.N(r7)
        L_0x007d:
            r10 = r7
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r15.M()
            r12 = 390(0x186, float:5.47E-43)
            r13 = 506(0x1fa, float:7.09E-43)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = r15
            androidx.compose.foundation.lazy.LazyDslKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x009b
            androidx.compose.runtime.ComposerKt.X()
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
