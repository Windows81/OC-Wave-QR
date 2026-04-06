package com.hansecom.abt.presentation.screens.home.account.information;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35462A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f35463B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AccountInformation.State f35464z;

    public /* synthetic */ c(AccountInformation.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3) {
        this.f35464z = state;
        this.f35462A = function1;
        this.f35463B = flow;
        this.C = function0;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AccountInformationScreenKt.k(this.f35464z, this.f35462A, this.f35463B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
