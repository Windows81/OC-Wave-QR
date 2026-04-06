package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f35410A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35411B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeSecurityQuestions.State.Main f35412z;

    public /* synthetic */ d(ChangeSecurityQuestions.State.Main main, Function0 function0, Function1 function1, Function0 function02, int i2) {
        this.f35412z = main;
        this.f35410A = function0;
        this.f35411B = function1;
        this.C = function02;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ChangeSecurityQuestionScreenKt.n(this.f35412z, this.f35410A, this.f35411B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
