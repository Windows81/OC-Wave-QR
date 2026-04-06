package com.hansecom.abt.presentation.screens.home.account.changePassword;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35316A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f35317B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangePassword.State f35318z;

    public /* synthetic */ c(ChangePassword.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2, int i3) {
        this.f35318z = state;
        this.f35316A = function1;
        this.f35317B = flow;
        this.C = function0;
        this.D = function02;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ChangePasswordScreenKt.k(this.f35318z, this.f35316A, this.f35317B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
