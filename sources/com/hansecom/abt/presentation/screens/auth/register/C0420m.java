package com.hansecom.abt.presentation.screens.auth.register;

import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* renamed from: com.hansecom.abt.presentation.screens.auth.register.m  reason: case insensitive filesystem */
public final /* synthetic */ class C0420m implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34475A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Register.State f34476B;
    public final /* synthetic */ Flow C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ Function1 J;
    public final /* synthetic */ Function1 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f34477z;

    public /* synthetic */ C0420m(NavBackStackEntry navBackStackEntry, NavHostController navHostController, Register.State state, Flow flow, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, Function1 function12, Function1 function13, int i2, int i3) {
        this.f34477z = navBackStackEntry;
        this.f34475A = navHostController;
        this.f34476B = state;
        this.C = flow;
        this.D = function0;
        this.E = function02;
        this.F = function03;
        this.G = function04;
        this.H = function05;
        this.I = function1;
        this.J = function12;
        this.K = function13;
        this.L = i2;
        this.M = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return RegisterScreenKt.q(this.f34477z, this.f34475A, this.f34476B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (Composer) obj, ((Integer) obj2).intValue());
    }
}
