package com.hansecom.abt.presentation.screens.auth.reset;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.auth.reset.ResetPassword;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34620A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ResetPassword.State f34621B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Flow D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f34622z;

    public /* synthetic */ e(Function0 function0, Function1 function1, ResetPassword.State state, Function1 function12, Flow flow, int i2, int i3) {
        this.f34622z = function0;
        this.f34620A = function1;
        this.f34621B = state;
        this.C = function12;
        this.D = flow;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ResetPasswordScreenKt.g(this.f34622z, this.f34620A, this.f34621B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
