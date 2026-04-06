package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35404A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f35405B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeSecurityQuestions.State.Questions f35406z;

    public /* synthetic */ c(ChangeSecurityQuestions.State.Questions questions, Function1 function1, Flow flow, boolean z2, Function0 function0, int i2) {
        this.f35406z = questions;
        this.f35404A = function1;
        this.f35405B = flow;
        this.C = z2;
        this.D = function0;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ChangeSecurityQuestionChooseQuestionScreenKt.i(this.f35406z, this.f35404A, this.f35405B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
