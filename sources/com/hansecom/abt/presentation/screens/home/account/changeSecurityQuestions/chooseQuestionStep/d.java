package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep;

import androidx.compose.foundation.lazy.LazyListScope;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class d implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f35407A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35408B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeSecurityQuestions.State.Questions f35409z;

    public /* synthetic */ d(ChangeSecurityQuestions.State.Questions questions, boolean z2, Function1 function1) {
        this.f35409z = questions;
        this.f35407A = z2;
        this.f35408B = function1;
    }

    public final Object invoke(Object obj) {
        return ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1.e(this.f35409z, this.f35407A, this.f35408B, (LazyListScope) obj);
    }
}
