package com.hansecom.abt.presentation.screens.auth.register.result.needsActivation;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f34567A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ RegisterResultNeedsActivation.State f34568B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Flow D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f34569z;

    public /* synthetic */ e(Function0 function0, Function0 function02, RegisterResultNeedsActivation.State state, Function1 function1, Flow flow, int i2, int i3) {
        this.f34569z = function0;
        this.f34567A = function02;
        this.f34568B = state;
        this.C = function1;
        this.D = flow;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return RegisterResultNeedsActivationScreenKt.g(this.f34569z, this.f34567A, this.f34568B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
