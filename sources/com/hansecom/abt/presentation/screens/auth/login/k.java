package com.hansecom.abt.presentation.screens.auth.login;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.auth.login.Login;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class k implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34323A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f34324B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Login.State f34325z;

    public /* synthetic */ k(Login.State state, Function1 function1, Flow flow, Function0 function0, Function1 function12, Function0 function02, Function0 function03, Function0 function04, int i2, int i3) {
        this.f34325z = state;
        this.f34323A = function1;
        this.f34324B = flow;
        this.C = function0;
        this.D = function12;
        this.E = function02;
        this.F = function03;
        this.G = function04;
        this.H = i2;
        this.I = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return LoginScreenKt.s(this.f34325z, this.f34323A, this.f34324B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
