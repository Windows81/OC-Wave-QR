package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.Account;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class A implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35012A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f35013B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ Function0 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Account.State f35014z;

    public /* synthetic */ A(Account.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, int i2, int i3) {
        this.f35014z = state;
        this.f35012A = function1;
        this.f35013B = flow;
        this.C = function0;
        this.D = function02;
        this.E = function03;
        this.F = function04;
        this.G = function05;
        this.H = function06;
        this.I = function07;
        this.J = i2;
        this.K = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AccountScreenKt.D(this.f35014z, this.f35012A, this.f35013B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (Composer) obj, ((Integer) obj2).intValue());
    }
}
