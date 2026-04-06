package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f35401A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f35402B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeSecurityQuestionViewModel f35403z;

    public /* synthetic */ b(ChangeSecurityQuestionViewModel changeSecurityQuestionViewModel, boolean z2, Function0 function0, int i2) {
        this.f35403z = changeSecurityQuestionViewModel;
        this.f35401A = z2;
        this.f35402B = function0;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ChangeSecurityQuestionChooseQuestionScreenKt.g(this.f35403z, this.f35401A, this.f35402B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
