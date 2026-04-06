package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35413A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f35414B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeSecurityQuestions.State.Main f35415z;

    public /* synthetic */ e(ChangeSecurityQuestions.State.Main main, Function1 function1, Flow flow, Function0 function0, Function0 function02, Function0 function03, int i2) {
        this.f35415z = main;
        this.f35413A = function1;
        this.f35414B = flow;
        this.C = function0;
        this.D = function02;
        this.E = function03;
        this.F = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ChangeSecurityQuestionScreenKt.p(this.f35415z, this.f35413A, this.f35414B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
