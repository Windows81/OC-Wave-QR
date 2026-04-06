package com.hansecom.abt.presentation.screens.home;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.Home;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class i implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37404A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f37405B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Home.State f37406z;

    public /* synthetic */ i(Home.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3) {
        this.f37406z = state;
        this.f37404A = function1;
        this.f37405B = flow;
        this.C = function0;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return HomeScreenKt.H(this.f37406z, this.f37404A, this.f37405B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
