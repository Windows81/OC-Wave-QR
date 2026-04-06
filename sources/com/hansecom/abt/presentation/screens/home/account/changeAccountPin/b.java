package com.hansecom.abt.presentation.screens.home.account.changeAccountPin;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35257A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f35258B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAccountPin.State f35259z;

    public /* synthetic */ b(ChangeAccountPin.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3) {
        this.f35259z = state;
        this.f35257A = function1;
        this.f35258B = flow;
        this.C = function0;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ChangeAccountPinScreenKt.i(this.f35259z, this.f35257A, this.f35258B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
