package com.hansecom.abt.presentation.screens.auth.reset.success;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccess;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f34647A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ResetPasswordSuccess.State f34648B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Flow D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f34649z;

    public /* synthetic */ d(Function0 function0, Function0 function02, ResetPasswordSuccess.State state, Function1 function1, Flow flow, int i2, int i3) {
        this.f34649z = function0;
        this.f34647A = function02;
        this.f34648B = state;
        this.C = function1;
        this.D = flow;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ResetPasswordSuccessScreenKt.g(this.f34649z, this.f34647A, this.f34648B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
